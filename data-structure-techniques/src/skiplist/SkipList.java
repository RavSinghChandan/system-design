package skiplist;

import java.util.Random;

public class SkipList {
    private static final int MAX_LEVEL = 16;
    private Node head;
    private int level;
    private Random random;

    // Skip List Node
    private class Node {
        int value;
        Node[] forward;

        Node(int value, int level) {
            this.value = value;
            this.forward = new Node[level + 1];
        }
    }

    // Constructor for Skip List
    public SkipList() {
        this.head = new Node(Integer.MIN_VALUE, MAX_LEVEL);
        this.level = 0;
        this.random = new Random();
    }

    // Randomly determine the level for new nodes
    private int randomLevel() {
        int lvl = 0;
        while (random.nextInt(2) == 1 && lvl < MAX_LEVEL) {
            lvl++;
        }
        return lvl;
    }

    // Insert a value into the Skip List
    public void insert(int value) {
        Node[] update = new Node[MAX_LEVEL + 1];
        Node current = head;

        // Find the positions of the node to be inserted
        for (int i = level; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].value < value) {
                current = current.forward[i];
            }
            update[i] = current;
        }

        current = current.forward[0];

        // If the value is already present, do nothing
        if (current != null && current.value == value) {
            return;
        }

        // Randomly determine the level for the new node
        int newLevel = randomLevel();

        // If the new level is greater than the current level, update the head
        if (newLevel > level) {
            for (int i = level + 1; i <= newLevel; i++) {
                update[i] = head;
            }
            level = newLevel;
        }

        // Create a new node
        Node newNode = new Node(value, newLevel);

        // Update the forward pointers
        for (int i = 0; i <= newLevel; i++) {
            newNode.forward[i] = update[i].forward[i];
            update[i].forward[i] = newNode;
        }
    }

    // Search for a value in the Skip List
    public boolean search(int value) {
        Node current = head;
        for (int i = level; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].value < value) {
                current = current.forward[i];
            }
        }
        current = current.forward[0];
        return current != null && current.value == value;
    }

    // Delete a value from the Skip List
    public void delete(int value) {
        Node[] update = new Node[MAX_LEVEL + 1];
        Node current = head;

        // Find the positions of the node to be deleted
        for (int i = level; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].value < value) {
                current = current.forward[i];
            }
            update[i] = current;
        }

        current = current.forward[0];

        // If the value is not found, do nothing
        if (current == null || current.value != value) {
            return;
        }

        // Update the forward pointers to remove the node
        for (int i = 0; i <= level; i++) {
            if (update[i].forward[i] != null && update[i].forward[i].value == value) {
                update[i].forward[i] = update[i].forward[i].forward[i];
            }
        }

        // Update the level if necessary
        while (level > 0 && head.forward[level] == null) {
            level--;
        }
    }

    // Print the Skip List
    public void printList() {
        System.out.println("Skip List:");
        for (int i = 0; i <= level; i++) {
            Node current = head.forward[i];
            System.out.print("Level " + i + ": ");
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.forward[i];
            }
            System.out.println();
        }
    }
}
