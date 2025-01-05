package decorator.chandan;

public class Client {
    public static void main(String[] args) {
        // Base Component
        Person chandan = new Chandan();

        // Applying First Decorator
        Person palmReaderChandan = new PalmReaderDecorator(chandan);

        // Applying Second Decorator
        Person vastuExpertChandan = new VastuExpertDecorator(palmReaderChandan);

        // Print the result
        System.out.println(vastuExpertChandan.getDescription());
    }
}
