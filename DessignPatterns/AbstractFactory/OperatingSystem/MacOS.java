package DessignPatterns.AbstractFactory.OperatingSystem;

public class MacOS implements IOperatingSystem {
    private final String NAME = "MacOs";

    @Override
    public String showName() {
        return NAME;
    }

}
