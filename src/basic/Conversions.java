package basic;

/**
 * Created by Omar.Rivera on 27/3/23.
 *
 * @author Omar.Rivera
 */

public class Conversions {

    public static void main(String[] args) {
        // Widening Primitive Conversions
        // byte -> short -> int -> long -> float -> double
        // char -> int -> long -> float -> double

        long year = 2020;    // (1) Implicit widening: long <----- int, assigned 2020L
        int pi = (int) 3.14; // (2) Narrowing requires cast: int <----- double, assigned 3

        // Widening and Narrowing Reference Conversions
        Object obj = "Upcast me"; // (1) Widening: Object <----- String

        String str = (String) obj; // (2) Narrowing requires cast: String <----- Object

        // Boxing and Unboxing Conversions.-  Boxing and unboxing conversions allow interoperability between primitive values and their representation as objects of the wrapper types
        // A boxing conversion converts the value of a primitive type to a corresponding value of its wrapper type, and an unboxing conversion converts the value of a wrapper type to a value of its corresponding primitive type

        Integer iRef = 10;                   // (1) Implicit boxing: Integer <-----  int
        Double dRef = Double.valueOf(3.14);  // (2) Explicit boxing: Double <-----  double
        int i = iRef;                      // (3) Implicit unboxing: int <-----  Integer
        double d = dRef.doubleValue();     // (4) Explicit unboxing: double <-----  Double


        // Identity conversions allow conversions from a type to that same type. An identity conversion is always permitted.

        int ii = (int) 10;                   // int <---- int
        String string = (String) "Hi";         // String <---- String


        //Casting Context of the Unary Type Cast Operator (type)
        // (type) expression

        long l = (long) 10;          // Widening primitive conversion: long <--- int
        int iii = (int) l;             // (1) Narrowing primitive conversion: int <--- long
        Object objt = (Object) "7Up"; // Widening ref conversion: Object <--- String
        String strng = (String) objt;   // (2) Narrowing ref conversion: String <--- Object
        Integer iRefr = (Integer) iii;  // Boxing: Integer <--- int
        iii = (int) iRefr;              // Unboxing: int <--- Integer
    }
}
