package abstractFactory.chandan;

import abstractFactory.abstractProduct.AbstractProductB;

public class ChandanConcreteFactory implements ChandanAbstractFactory {
    @Override
    public Chandan createChandan(String type) {
        if(type.equalsIgnoreCase("Student")){
            return new StudentChandan("student",21,"computer science");
        } else if (type.equalsIgnoreCase("working")) {
            return new AbstractProductB.WorkingChandan("working",28,"developer");
        }
        return null;
    }
}
