package factory.concreteCreator;

import factory.creator.Chandan;

public class Developer implements Chandan {
    @Override
    public void createChandan() {
        System.out.println("Chandan in a developer role :");
    }
}
