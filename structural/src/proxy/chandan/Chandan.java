package proxy.chandan;

public class Chandan implements Expert{
    @Override
    public void provideService(String clientName) {
        System.out.println("Providing services to client: " + clientName);
        System.out.println("Expertise: Palm Reading, Vastu Shastra, Software Development");
        System.out.println("Motto: Helping people improve their destiny");
        System.out.println("-----------------------------------");
    }
}
