package abstractFactory.concreteFactory;

import abstractFactory.abstractFactory.AbstractFactory;
import abstractFactory.abstractProduct.AbstractProductA;
import abstractFactory.abstractProduct.AbstractProductB;
import abstractFactory.concreteProducts.ConcreteProductA1;
import abstractFactory.concreteProducts.ConcreteProductB1;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
