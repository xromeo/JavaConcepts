package advancedgenerics.wildcard;

import java.util.ArrayList;
import java.util.List;

import advancedgenerics.Drink;
import advancedgenerics.Food;
import advancedgenerics.Product;

public class LowerBound {
    public static void main(String[] args) {
        // Lower bounded wildcard <? super Type> allows to use this type and its parents
        // * A lis of specific type List<Product>
        // - Is invariant - you can only assign a List<Food> to such a list
        // * A list of super type and descendents List<? super Food>
        // - Is writable - you can add instances of Object, Product and Food to such a list
        // - Is contra-variant - you can assign a List<Product> or List<Food> or List<Object> to such a list

        Product p1 = new Food();
        Product p2 = new Drink();
        Product p3 = new Food();
        List<Product> products = List.of(p1,p2,p3);
        List<Food> foods = List.of((Food)p1, (Food)p3);

        Food f = new Food();
                
        new LowerBound().addFoodToFoods(foods, f);
        // List of products may contain any products, including Food and Drink types, 
        // but methods above only allow to add food to such a list.
        new LowerBound().addFoodToFoods(products, f);
        
        new LowerBound().addFoodToFoodsParents(foods, f);
        new LowerBound().addFoodToFoodsParents(products, f);

    }

    public void addFoodToFoods(List<Food>  order, Food food){
        order.add(food);
    }

    public void addFoodToFoodsParents(List<? super Food>  order, Food food){
        order.add(food);
    }

}
