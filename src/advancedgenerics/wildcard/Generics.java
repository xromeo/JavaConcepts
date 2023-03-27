package advancedgenerics.wildcard;

public class Generics<T> {
    
    public void print(T parameter){
        System.out.println(parameter);
    }

    public T hola(T parameter){
        System.out.println("Returning " + parameter);
        return parameter;
    }

    public <B> B mundo(B parameter){
        System.out.println("Returning B " + parameter);
        return parameter;
    }

    public <B> B mundo(B parameter, T dos){
        System.out.println("Returning DOS " + parameter + "  DOS: " + dos);
        return parameter;
    }

    public <B, C> C mundoDouble(B parameter, C dos){
        System.out.println("Returning Double " + parameter + "  Double: " + dos);
        return dos;
    }
    public <B, C, E> E mundoTri(B parameter, C dos, E tres){
        System.out.println("Returning Tri " + parameter + "  Double: " + dos);
        return tres;
    }

    public static void main(String[] args) {
        new Generics<String>().print("My parameter");
        System.out.println(new Generics<String>().hola("My parameter"));
        System.out.println(new Generics<String>().mundo(" mundo"));
        System.out.println(new Generics<Integer>().mundo(" mundo", 5));
        System.out.println(new Generics<>().mundoDouble("mundo", 5));
        System.out.println(new Generics<>().mundoTri("Zoe", "mundo", 5));
    }

}
