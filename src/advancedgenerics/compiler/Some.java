package advancedgenerics.compiler;

/**
 * Some
 */
public class Some<T> {
    public T apply(T t){
        return t;
    }
    
    public static void main(String[] args) {
        Some<String> s = new Some<>();
        String v = s.apply("Some");
        System.out.println(v);
    }
}