package basic;

/**
 * Created by Omar.Rivera on 27/3/23.
 *
 * @author Omar.Rivera
 */

public class Test2 {
    public static void main(String[] args) {
        String a, b, c;
        c = new String("mouse");
        a = new String("cat");
        b = a;
        a = new String("dog");
        c = b;

        System.out.println(c);
    }
}
