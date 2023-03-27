package advancedgenerics;

import anotations.ImportantString;
import anotations.VeryImportant;

@VeryImportant
public class Product {

    @ImportantString
    String name;

    public void count(){
        System.out.println("Counting...");
    }
}