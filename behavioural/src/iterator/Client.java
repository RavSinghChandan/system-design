package iterator;

import iterator.concreteAggregator.ConcreteAggregator;
import iterator.iterator.Iterator;

public class Client {
    public static void main(String[] args) {
        // Create a concrete aggregate
        ConcreteAggregator<String> aggregate = new ConcreteAggregator<>();
        aggregate.addItem("Item 1");
        aggregate.addItem("Item 2");
        aggregate.addItem("Item 3");

        // Get the iterator
        Iterator<String> iterator = aggregate.createIterator();

        // Traverse the collection
        System.out.println("Iterating over the collection:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
