package DessignPatterns.AbstractFactory.OperatingSystem;

public class LinuxFactory extends OperatingSystemFactoryAbstract {
    @Override
    public IOperatingSystem createOS() {
        Linux l1 = new Linux();
        return l1;
    }
}
