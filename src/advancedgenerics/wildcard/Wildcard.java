package advancedgenerics.wildcard;

import java.util.ArrayList;
import java.util.List;

import advancedgenerics.Product;

public class Wildcard {
    public static void main(String[] args) {
        // When generics are not applied, code default to use type Object
        // -Only Object class operation can be safety used.
        // -Type-check and type-casting must be applied to acces any sub-type specific operations.
        List listOfAnyObjects = new ArrayList() ;
        List<Object> listOfAnyObjects2 = new ArrayList<>();

        // When specific type is applied
        // -Any operations declared for this type or its parents can be safely used,
        // -Type-check and type casting must be applied to access any sub-type specific operations
        List<Product> listOfProducts = new ArrayList<>(); 
        listOfProducts.add(new Product());

        // When wildcard <?> id applied (representing an unknow type)
        // -Elements are accessed just like in a collecion of Objects
        // -Effectively it's a read only collection
        // -No object in Java id of unknown type, so no values (except null) can be added to such a collection

        List<?>  listOfUnknownType = listOfProducts;
        listOfUnknownType.add(new Product());
        listOfUnknownType.add(null);

        
    }
}
