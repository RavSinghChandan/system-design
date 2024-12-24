package bloomfilter;

import java.util.BitSet;
import java.util.function.Function;

public class BloomFilter {
    private BitSet bitSet;
    private int size;
    private int numHashFunctions;

    public BloomFilter(int size, int numHashFunctions) {
        this.size = size;
        this.numHashFunctions = numHashFunctions;
        this.bitSet = new BitSet(size);
    }

    // Hash functions for the Bloom filter
    private int hash1(String str) {
        return Math.abs(str.hashCode()) % size;
    }

    private int hash2(String str) {
        return Math.abs((str.hashCode() / 2) % size);
    }

    private int hash3(String str) {
        return Math.abs((str.hashCode() / 3) % size);
    }

    // Add an item to the Bloom filter
    public void add(String str) {
        int[] hashCodes = getHashCodes(str);
        for (int hashCode : hashCodes) {
            bitSet.set(hashCode);
        }
    }

    // Check if an item is in the Bloom filter
    public boolean contains(String str) {
        int[] hashCodes = getHashCodes(str);
        for (int hashCode : hashCodes) {
            if (!bitSet.get(hashCode)) {
                return false;
            }
        }
        return true;
    }

    // Get multiple hash codes for the string
    private int[] getHashCodes(String str) {
        int[] hashCodes = new int[numHashFunctions];
        hashCodes[0] = hash1(str);
        hashCodes[1] = hash2(str);
        if (numHashFunctions > 2) {
            hashCodes[2] = hash3(str);
        }
        return hashCodes;
    }
}
