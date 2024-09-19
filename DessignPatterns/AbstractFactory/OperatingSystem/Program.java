package DessignPatterns.AbstractFactory.OperatingSystem;

public class Program {
    public static void main(String[] args) {
        OperatingSystemFactoryAbstract factoryWindows = new WindowsFactory();
        IOperatingSystem os = factoryWindows.createOS();
        System.out.println("The operating system in the current computer is: " + os.showName());

        OperatingSystemFactoryAbstract factoryMac = new MacOsFactory();
        IOperatingSystem osMac = factoryMac.createOS();
        System.out.println("The operating system in the current computer is: " + osMac.showName());

    }
}
