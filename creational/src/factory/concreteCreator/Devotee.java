package factory.concreteCreator;

import factory.creator.Chandan;

public class Devotee implements Chandan {
    @Override
    public void createChandan() {
        System.out.println("Chandan in a devotee role :");
    }
}
