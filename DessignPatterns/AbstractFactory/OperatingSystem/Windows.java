package DessignPatterns.AbstractFactory.OperatingSystem;

public class Windows implements IOperatingSystem {
    private final String NAME = "Windows";

    @Override
    public String showName() {
        return NAME;
    }

}
