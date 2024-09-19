package ClasesAnidadas.ClasesInternas.ClasesLocales;

public class OuterClass {
    private void getValue() {
        int sum = 20;

        class Inner {
            int divisor;
            int remainder;

            public Inner() {
                divisor = 4;
                remainder = sum % divisor;
            }

            private int getDivisor() {
                return divisor;
            }

            private int getRemainder() {
                return remainder;
            }

            private int getQuotient() {
                System.out.println("Inside inner class");
                return sum / divisor;
            }
        }

        Inner inner = new Inner();
        System.out.println("Divisor = " + inner.getDivisor());
        System.out.println("Remainder = " + inner.getRemainder());
        System.out.println("Quotient = " + inner.getQuotient());

    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.getValue();
    }
}
