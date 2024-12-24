package hashing;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.insert(15, "Value1");
        hashTable.insert(25, "Value2");
        hashTable.insert(35, "Value3");
        hashTable.insert(15, "UpdatedValue");

        hashTable.display();

        // Searching for a value
        System.out.println("Search for key 15: " + hashTable.search(15));

        // Deleting a key
        hashTable.delete(25);
        System.out.println("After deleting key 25:");
        hashTable.display();
    }
}
