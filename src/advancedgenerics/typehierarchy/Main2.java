package advancedgenerics.typehierarchy;

import java.util.ArrayList;
import java.util.List;

import advancedgenerics.Food;
import advancedgenerics.Product;

public class Main2 {
    public static void main(String[] args) {

        // Collections API uses generics that are invariant; code is validated in compile time
        
        List<Product> products = new ArrayList<Food>(); // Compiler Error Cannot be converted to 
       
        List<Product> products2 = new ArrayList<Product>();
       
       
    }
}
