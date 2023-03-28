package basic;

/**
 * Created by Omar.Rivera on 27/3/23.
 *
 * @author Omar.Rivera
 */

public class Complements {
    public static void main(String[] args) {
        int N2 = 10;
        int N1 = ~N2;  // Complement

        System.out.println("N2 = " + N2);
        System.out.println("N1 = " + N1);

        int equal = ~N2 + 1;
        System.out.println("equal to N2= " + equal);
    }
}
