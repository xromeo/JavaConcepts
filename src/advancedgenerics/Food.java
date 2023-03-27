package advancedgenerics;

import anotations.RunImmediately;

public class Food extends Product {
    
    @RunImmediately
    public void sell(){
        System.out.println("Selling...");
    }
}
