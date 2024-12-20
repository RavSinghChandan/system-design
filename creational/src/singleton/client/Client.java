package singleton.client;

import singleton.chandan.Chandan;
import singleton.singleton.Singleton;

public class Client {
    public static void main(String[] args) {
        // Generic Object
        Singleton singleton = Singleton.getSingleton();
        singleton.showSingletonCreated("First singleton creation");
        System.out.println("========================================");
        // 01. Example
        Chandan chandan= Chandan.getChandanObject();

    }
}
