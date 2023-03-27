package advancedgenerics.typehierarchy;

import java.util.ArrayList;
import java.util.List;

import advancedgenerics.Drink;
import advancedgenerics.Food;
import advancedgenerics.Product;

public class Main3 {
    public static void main(String[] args) {

       // Generics compiler checks are not preformed for raw types, which can result in runtime exceptions.
       
       List<Food> foods = new ArrayList<Food>();
       List values = foods;
       List<Product> products = values; // Compiler warns about unchecked or unsafe operations
       products.add(new Drink()); // No compiler warning
       Drink d = (Drink) values.get(0);
       Food f = foods.get(0); // ClassCastException: class Drink cannot be cast to class Food: class advancedgenerics.typehierarchy.Drink cannot be cast to class advancedgenerics.typehierarchy.Food

       //
    }
}
