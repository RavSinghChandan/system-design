package heap;

public class Task {
    String name;
    int priority;

    // Constructor for creating a task with a name and a priority
    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Getter methods for task details
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
