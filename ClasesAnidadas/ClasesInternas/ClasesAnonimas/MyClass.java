package ClasesAnidadas.ClasesInternas.ClasesAnonimas;

interface Age {
    int x = 21;

    void getAge();
}

class MyClass implements Age {

    @Override
    public void getAge() {
        System.out.print("Age is " + x);
    }

}

class GFG {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.getAge();
    }
}