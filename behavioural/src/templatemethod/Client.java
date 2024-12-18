package templatemethod;

import templatemethod.abstractClass.AbstractClass;
import templatemethod.concreteClass.ConcreteClass;

public class Client {
    public static void main(String[] args) {
        System.out.println("Executing Template Method Pattern...\n");

        // Using the Template Method
        AbstractClass instance = new ConcreteClass();
        instance.templateMethod();
    }
}
