package prototype.client;

import prototype.concretePrototype.Address;
import prototype.concretePrototype.Person;

public class Client {
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("123 Main St", "New York", "USA");

        // Create a Person object with the Address
        Person originalPerson = new Person("John Doe", 30, address);

        // Clone the Person object
        Person clonedPerson = (Person) originalPerson.clone();

        // Modify the cloned object's name and address
        clonedPerson.setName("Jane Smith");
        clonedPerson.getAddress().setStreet("456 Elm St");

        // Display both original and cloned Person objects
        System.out.println("Original Person: " + originalPerson);
        System.out.println("Cloned Person: " + clonedPerson);
    }
}
