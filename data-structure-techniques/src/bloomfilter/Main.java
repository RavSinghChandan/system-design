package bloomfilter;

public class Main {
    public static void main(String[] args) {
        // Create a Bloom filter with a size of 1000 and 3 hash functions
        BloomFilter bloomFilter = new BloomFilter(1000, 3);

        // Adding elements
        bloomFilter.add("apple");
        bloomFilter.add("banana");
        bloomFilter.add("grape");

        // Checking if elements exist
        System.out.println(bloomFilter.contains("apple"));   // true
        System.out.println(bloomFilter.contains("banana"));  // true
        System.out.println(bloomFilter.contains("grape"));   // true
        System.out.println(bloomFilter.contains("orange"));  // false (likely)
    }
}
