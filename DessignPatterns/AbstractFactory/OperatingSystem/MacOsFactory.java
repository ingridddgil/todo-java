package DessignPatterns.AbstractFactory.OperatingSystem;

public class MacOsFactory extends OperatingSystemFactoryAbstract {

    @Override
    public IOperatingSystem createOS() {
        MacOS m1 = new MacOS();
        return m1;
    }

}
