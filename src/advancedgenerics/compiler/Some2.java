package advancedgenerics.compiler;

import java.util.function.UnaryOperator;

public class Some2 implements UnaryOperator<String> {

    @Override
    public String apply(String t) {
        return t;
    }

    public static void main(String[] args) {
        Some2 s = new Some2();
        String v = s.apply("null");
        System.out.println(v);
    }
    
}
