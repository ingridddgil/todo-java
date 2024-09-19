package DessignPatterns.AbstractFactory.OperatingSystem;

public class Linux implements IOperatingSystem {
    private final String NAME = "Linux";

    @Override
    public String showName() {
        return NAME;
    }

}
