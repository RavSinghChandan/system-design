package suffixtree;

public class Main   {
public static void main(String[] args) {
    String text = "banana";
    SuffixTree tree = new SuffixTree(text);

    // Test search functionality
    System.out.println(tree.search("ana"));  // true
    System.out.println(tree.search("ban"));  // true
    System.out.println(tree.search("xyz"));  // false
}
}
