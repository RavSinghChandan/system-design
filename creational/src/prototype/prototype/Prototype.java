package prototype.prototype;

import prototype.concretePrototype.Person;

public interface Prototype {
    Prototype clone(Person person);
}
