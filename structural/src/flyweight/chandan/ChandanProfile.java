package flyweight.chandan;

public class ChandanProfile implements ExpertProfile{
    // Intrinsic Data (Shared across multiple clients)
    private final String name = "Chandan Kumar Singh";
    private final String skills = "Palm Reading, Vastu Shastra, Software Development";
    private final String motto = "Helping people improve their destiny";

    @Override
    public void displayProfile(String clientName) {
        System.out.println("Displaying profile for client: " + clientName);
        System.out.println("Name: " + name);
        System.out.println("Skills: " + skills);
        System.out.println("Motto: " + motto);
        System.out.println("-----------------------------");
    }
}
