package advancedgenerics.wildcard;

import java.util.ArrayList;
import java.util.List;

import advancedgenerics.Drink;
import advancedgenerics.Food;
import advancedgenerics.Product;

public class UpperBound {
    public static void main(String[] args) {
        // Upper bounded wildcard <? extends ParentType> allows use of subtype collections
        // * A lis of specific type List<Product>
        // - Is writable - you can add instances of Product, Food and Drink to such a list
        // - Is invariant - you cannot assign a List<Drink> or List<Food> to such a list
        // * A list of super type and descendents List<? extends Product>
        // - Is read-only - no values (except null)  can be added to such a list
        // - Is covariant - you can assign a List<Drink> or List<Food> to such a list

        Product p1 = new Food();
        Product p2 = new Drink();
        Product p3 = new Food();
        List<Product> products = List.of(p1,p2,p3);
        List<Food> foods = List.of((Food)p1, (Food)p3);
        
        new UpperBound().setProducts(products);
        // - Is invariant - you cannot assign a List<Drink> or List<Food> to such a list
        new UpperBound().setProducts(foods);
        
        new UpperBound().setProductsAndSubTypes(products);
        // - Is covariant - you can assign a List<Drink> or List<Food> to such a list
        new UpperBound().setProductsAndSubTypes(foods);
        
        
        // Collection of an unknown type is covariant
        List<?> anyValues = new ArrayList<Product>();
        List<? extends Object> anyObjects = new ArrayList<Product>();
        //* These two collecions essentially work in the same way, bvecause everything in Jva no matter the type is eventually type Object

    }

    public void setProducts(List<Product> products){}
    public void setProductsAndSubTypes(List<? extends Product> products){}
}
