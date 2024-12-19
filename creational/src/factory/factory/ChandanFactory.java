package factory.factory;

import factory.concreteCreator.*;
import factory.creator.Chandan;

public class ChandanFactory {

    public Chandan getChandan(String type){

        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Developer")){
            return  new Developer();
        } else if (type.equalsIgnoreCase("Devotee")) {
            return new Devotee();
        } else if (type.equalsIgnoreCase("Farmer")) {
            return new Farmer();
        }
        return  null;
    }
}
