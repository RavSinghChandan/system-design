package iterator.chandan;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
