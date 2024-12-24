package heap;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Create a priority queue with a custom comparator for max-heap behavior
        PriorityQueue<Task> queue = new PriorityQueue<>((task1, task2) -> Integer.compare(task2.priority, task1.priority));

        // Insert tasks into the priority queue
        TaskManager.addTask(queue, new Task("Task 1", 5));
        TaskManager.addTask(queue, new Task("Task 2", 1));
        TaskManager.addTask(queue, new Task("Task 3", 3));
        TaskManager.addTask(queue, new Task("Task 4", 4));

        // Process the queue by dequeuing tasks based on priority
        TaskManager.processQueue(queue);
    }
}
