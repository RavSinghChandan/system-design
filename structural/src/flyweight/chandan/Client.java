package flyweight.chandan;

public class Client {
    public static void main(String[] args) {
        System.out.println("Welcome to the Expert Profiles System!");

        // Flyweight Factory
        FlyweightFactory factory = new FlyweightFactory();

        // Clients requesting Chandan's profile
        ExpertProfile profile1 = factory.getExpertProfile("Chandan");
        profile1.displayProfile("Client A");

        ExpertProfile profile2 = factory.getExpertProfile("Chandan");
        profile2.displayProfile("Client B");

        // Verify that the same instance is reused
        System.out.println("Are profile1 and profile2 the same instance? " + (profile1 == profile2));
    }
}
