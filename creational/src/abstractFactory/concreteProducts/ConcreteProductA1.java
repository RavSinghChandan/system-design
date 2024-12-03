package abstractFactory.concreteProducts;

import abstractFactory.abstractProduct.AbstractProductA;

public class ConcreteProductA1 implements AbstractProductA {
    @Override
    public void display() {
        System.out.println("ConcreteProductA1 of AbstractProductA ");
    }
}
