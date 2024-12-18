package singleton.client;

import singleton.singleton.Chandan;
import singleton.singleton.Singleton;

public class Client {
    public static void main(String[] args) {
        // Generic Object
        Singleton singleton = Singleton.getSingleton();
        singleton.showSingletonCreated("First singleton creation");
        System.out.println("========================================");
        // Chandan's Object
        Chandan chandan= Chandan.getChandanObject();

    }
}
