package basic;

/**
 * Created by Omar.Rivera on 27/3/23.
 *
 * @author Omar.Rivera
 */

public class Logical {
    public static void main(String[] args) {
        boolean b1 = false, b2 = true, b3 = false;
        Boolean b4 = false;
        b1 |= true;             // true
        b4 ^= b1;               // (1) true, unboxing in (b4 ^ (b1)), boxing on assignment
        b3 &= b1 | b2;          // (2) false, b3 = (b3 & (b1 | b2))
        b3 = b3 & b1 | b2;      // (3) true,  b3 = ((b3 & b1) | b2)
    }
}
