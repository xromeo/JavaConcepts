package basic;

/**
 * Created by Omar.Rivera on 27/3/23.
 *
 * @author Omar.Rivera
 */

public class Literals {
    public static void main(String[] args) {
        int binary = 0b100;
        System.out.println("binary = " + binary);

        long decimal = 10_465_321_654L;
        System.out.println("decimal = " + decimal);

        int octal = 010;
        System.out.println("octal = " + octal);

        long octal2 = 010L;
        System.out.println("octal2 = " + octal2);

        long hexa = 0x10;
        System.out.println("hexa = " + hexa);

        long hexa2 = 0x10L;
        System.out.println("hexa = " + hexa2);

        int hexa_minus = -0xabcdef;
        System.out.println("hexa_minus = " + hexa_minus);

        float valueF = 0.10F;
        System.out.println("valueF = " + valueF);
        float valuef = 0.10f;
        System.out.println("valuef = " + valuef);

        double valued = 0.5d;
        double value = 0.5d;
        double value_ = .5;
        double valueD = .5D;
        double valueE = .5E2D; // 0.5 x 10^2 => 50
        System.out.println("valueE = " + valueE);
        double valueE2 = .5E+2D;
        System.out.println("valueE = " + valueE2);
        double valueE3 = .5e-2d;
        System.out.println("valueE3 = " + valueE3);

        double literal = 49_10_10.5;
        System.out.println("literal = " + literal);
    }
}
