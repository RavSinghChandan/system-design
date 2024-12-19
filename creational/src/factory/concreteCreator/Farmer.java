package factory.concreteCreator;

import factory.creator.Chandan;

public class Farmer implements Chandan {
    @Override
    public void createChandan() {
        System.out.println("Chandan in a Farmer role ");

    }
}
