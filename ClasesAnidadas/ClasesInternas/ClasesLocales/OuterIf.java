package ClasesAnidadas.ClasesInternas.ClasesLocales;

public class OuterIf {
    public int data = 10;

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        OuterIf out = new OuterIf();

        if (out.getData() < 20) {
            // Local inner class inside if clause
            class Inner {
                public int getValue() {
                    System.out.println("Inside Inner class");
                    return out.data;
                }
            }

            Inner inner = new Inner();
            System.out.println(inner.getValue());
        } else {
            System.out.println("Inside Outer class");
        }
    }
}
