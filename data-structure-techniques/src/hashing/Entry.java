package hashing;
public class Entry {
    int key;
    String value;

    Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + key + "=" + value + "}";
    }
}