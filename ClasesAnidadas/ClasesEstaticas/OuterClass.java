package ClasesAnidadas.ClasesEstaticas;

public class OuterClass {
    static String x = "Esto es una variable estatica pública";
    String y = "Esto es una variable no estática privada";
    private static String z = "Esto es una variable estatica privada";

    static class StaticNestedClass {
        void display() {
            System.out.println(x);
            System.out.println(z);

            OuterClass out = new OuterClass();
            System.out.println(out.y);
        }
    }

}

class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();

        obj.display();
    }
}
