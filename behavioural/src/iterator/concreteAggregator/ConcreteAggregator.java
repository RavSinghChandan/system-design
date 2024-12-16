package iterator.concreteAggregator;

import iterator.aggregator.Aggregator;
import iterator.concreteIterator.ConcreteIterator;
import iterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregator<T> implements Aggregator {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
