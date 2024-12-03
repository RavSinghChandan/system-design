package abstractFactory;

import abstractFactory.abstractFactory.AbstractFactory;
import abstractFactory.abstractProduct.AbstractProductA;
import abstractFactory.abstractProduct.AbstractProductB;
import abstractFactory.concreteFactory.ConcreteFactory1;
import abstractFactory.concreteFactory.ConcreteFactory2;

public class client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();
        productA1.display();
        productB1.display();

        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();
        productA2.display();
        productB2.display();
    }
}
