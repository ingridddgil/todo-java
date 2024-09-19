package ClasesAnidadas.ClasesInternas;

public class OuterClass {
    static String a = "Esto es una variable estatica pública";
    String b = "Esto es una variable no estática privada";
    private String c = "Esto es una variable estatica privada";

    class InnerClass {
        void display() {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
    }

}

class Main {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inner = out.new InnerClass();
        inner.display();
    }
}
