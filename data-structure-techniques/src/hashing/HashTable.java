package hashing;

import java.util.LinkedList;

/**
 * Step 1: Create a HashTable class that implements a hash table using separate chaining for collision resolution.
 * Step 2: Define the data structure for the hash table and the necessary operations.
 * Step 3: Implement methods for inserting, searching, deleting, and displaying entries in the hash table.
 */
public class HashTable {
    private LinkedList<Entry>[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void insert(int key, String value) {
        int index = hashFunction(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public String search(int key) {
        int index = hashFunction(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean delete(int key) {
        int index = hashFunction(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                table[index].remove(entry);
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (table[i].isEmpty()) {
                System.out.println("Index " + i + ": Empty");
            } else {
                System.out.println("Index " + i + ": " + table[i]);
            }
        }
    }
}
