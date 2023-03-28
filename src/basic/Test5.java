package basic;

/**
 * Created by Omar.Rivera on 27/3/23.
 *
 * @author Omar.Rivera
 */

public class Test5 {
    public static void main(String[] args) {
        int[] array = { 4, 8, 16 };
        int i = 1;
        array[++i] = --i;
        System.out.println(array[0] + array[1] + array[2]);
    }
}
