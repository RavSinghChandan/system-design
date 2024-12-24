package skiplist;

public class Main {

    public static void main(String[] args) {
        SkipList skipList = new SkipList();
        skipList.insert(3);
        skipList.insert(6);
        skipList.insert(7);
        skipList.insert(9);
        skipList.insert(12);

        skipList.printList();

        System.out.println("Search 6: " + skipList.search(6));
        System.out.println("Search 10: " + skipList.search(10));

        skipList.delete(6);
        skipList.printList();
    }
}
