package abstractFactory.abstractFactory;

import abstractFactory.abstractProduct.AbstractProductA;
import abstractFactory.abstractProduct.AbstractProductB;

public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
