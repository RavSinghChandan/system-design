package iterator.aggregator;

import iterator.iterator.Iterator;

public interface Aggregator<T> {
    Iterator<T> createIterator();
}
