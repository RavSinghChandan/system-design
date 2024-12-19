package prototype.client;

import prototype.concretePrototype.Address;
import prototype.concretePrototype.Chandan;
import prototype.concretePrototype.Person;

public class Client {
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("123 Main St", "New York", "USA");

        // Create a Person object with the Address
        Person originalPerson = new Person("John Doe", 30, address);

        // Clone the Person object
        Person clonedPerson = (Person) originalPerson.clone(originalPerson);

        // Modify the cloned object's name and address
        clonedPerson.setName("Jane Smith");
        clonedPerson.getAddress().setStreet("456 Elm St");

        // Display both original and cloned Person objects
        System.out.println("Original Person: " + originalPerson+" Hash code is : "+originalPerson.hashCode());
        System.out.println("Cloned Person: " + clonedPerson+" Hash code is : "+clonedPerson.hashCode());
        System.out.println("=================================================");

        Chandan originalChandan = new Chandan("Chandan Original",28,"Male","Developer");
        System.out.println("Original Chandan :"+originalChandan.toString()+" Hashcode is :"+originalChandan.hashCode());
        originalChandan.setName("Chandan ka copy");
        originalChandan.setAge(29);
        originalChandan.setGender("Male");
        originalChandan.setProfession("DevOps Engineer");
        Chandan clonedChandan = (Chandan) originalChandan.cloneChandan();


        System.out.println("Cloned Chandan :"+clonedChandan.toString()+" Hash code is : "+clonedChandan.hashCode());
    }
}
