package abstractFactory.concreteProducts;

import abstractFactory.abstractProduct.AbstractProductB;

public class ConcreteProductB1 implements AbstractProductB {
    @Override
    public void display() {
        System.out.println("ConcreteProductB1 of AbstractProductB");
    }
}
