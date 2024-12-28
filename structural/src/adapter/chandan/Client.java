package adapter.chandan;

// Client Code
public class Client {
    public static void main(String[] args) {
        Chandan chandan = new Chandan(); // Old
        Target adaptedChandan = new ChandanAdapter(chandan);// The changer guy :)

        System.out.println("Client requesting work in the new environment:");
        adaptedChandan.workInNewEnvironment(); // New Chandan along with old
    }
}