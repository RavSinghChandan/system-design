package singleton.client;

import singleton.singleton.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.showSingletonCreated("First singleton creation");
    }
}
