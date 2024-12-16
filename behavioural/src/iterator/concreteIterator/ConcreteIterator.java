package iterator.concreteIterator;

import iterator.iterator.Iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator {

      final List<T> items;
      int position=0;
      public ConcreteIterator(List<T> items){
          this.items=items;
    }
    @Override
    public boolean hasNext() {
        return items.size()>position;
    }

    @Override
    public T next() {
        return items.get(position++);
    }
}
