package abstractFactory.concreteProducts;

import abstractFactory.abstractProduct.AbstractProductA;

public class ConcreteProductA2 implements AbstractProductA {
    @Override
    public void display() {
        System.out.println("ConcreteProductA2 of AbstractProductA");
    }
}
