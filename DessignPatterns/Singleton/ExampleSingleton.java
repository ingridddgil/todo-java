package DessignPatterns.Singleton;

public class ExampleSingleton {
    private static volatile ExampleSingleton instance;
    public String data;

    private ExampleSingleton(String data) {
        this.data = data;
    }

    public static ExampleSingleton getInstance(String data) {
        // synchronized (ExampleSingleton.class)
        if (instance == null) {
            instance = new ExampleSingleton(data);
        }
        return instance;
    }
}
