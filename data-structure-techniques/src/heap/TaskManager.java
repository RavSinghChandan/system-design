package heap;

import java.util.PriorityQueue;

public class TaskManager {
    // Method to add tasks to the priority queue
    public static void addTask(PriorityQueue<Task> queue, Task task) {
        queue.add(task);
        System.out.println("Inserted: " + task.getName() + " with priority " + task.getPriority());
    }

    // Method to process the queue by removing elements based on priority
    public static void processQueue(PriorityQueue<Task> queue) {
        System.out.println("\nProcessing tasks in priority order:");

        // Continue processing until the queue is empty
        while (!queue.isEmpty()) {
            Task task = queue.poll();  // Remove and retrieve the highest-priority task
            System.out.println("Processing: " + task.getName() + " with priority " + task.getPriority());
        }
    }
}
