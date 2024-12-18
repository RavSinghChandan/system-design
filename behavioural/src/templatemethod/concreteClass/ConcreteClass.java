package templatemethod.concreteClass;

import templatemethod.abstractClass.AbstractClass;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void stepTwo() {
        System.out.println("Step 2: Customized behavior from ConcreteClass.");
    }

    @Override
    protected void stepThree() {
        System.out.println("Step 3: Another customized behavior from ConcreteClass.");
    }
}
