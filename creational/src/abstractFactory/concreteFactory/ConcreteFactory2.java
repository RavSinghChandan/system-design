package abstractFactory.concreteFactory;

import abstractFactory.abstractFactory.AbstractFactory;
import abstractFactory.abstractProduct.AbstractProductA;
import abstractFactory.abstractProduct.AbstractProductB;
import abstractFactory.concreteProducts.ConcreteProductA2;
import abstractFactory.concreteProducts.ConcreteProductB2;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
