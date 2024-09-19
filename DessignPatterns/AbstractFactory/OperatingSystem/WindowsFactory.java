package DessignPatterns.AbstractFactory.OperatingSystem;

public class WindowsFactory extends OperatingSystemFactoryAbstract {

    @Override
    public IOperatingSystem createOS() {
        Windows w1 = new Windows();
        return w1;
    }

}
