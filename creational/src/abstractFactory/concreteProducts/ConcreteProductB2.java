package abstractFactory.concreteProducts;

import abstractFactory.abstractProduct.AbstractProductB;

public class ConcreteProductB2 implements AbstractProductB {
    @Override
    public void display() {
        System.out.println("ConcreteProductB2 of AbstractProductB");
    }
}
