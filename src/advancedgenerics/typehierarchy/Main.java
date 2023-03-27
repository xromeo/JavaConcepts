package advancedgenerics.typehierarchy;

import advancedgenerics.Drink;
import advancedgenerics.Food;
import advancedgenerics.Product;

public class Main {
    public static void main(String[] args) {

        // Generics are invariant to enforce compile.time verification of types

        // Java arrays are covariant, which can result in runtime executions
        Product[] products = new Food[10];
        products[0] = new Drink(); // java.lang.ArrayStoreException

       //Food[] foods = new Product[10]; // Cannot convert Product to Food

       Product product = new Food();
       product.toString();

       //Food food = new Product(); // Cannot convert Product to Food

       
    }
}
