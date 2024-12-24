package trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insert words into the Trie
        trie.insert("apple");
        trie.insert("app");

        // Search for words
        System.out.println(trie.search("apple"));  // true
        System.out.println(trie.search("app"));    // true
        System.out.println(trie.search("appl"));   // false
        System.out.println(trie.startsWith("app")); // true
    }
}
