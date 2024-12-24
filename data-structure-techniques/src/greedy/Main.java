package greedy;


import static greedy.GreedyAlgorithm.activitySelection;

public class Main {
    public static void main(String[] args) {
        // Sample input: Activities with start and end times
        Activity[] activities = {
                new Activity(1, 3),
                new Activity(2, 5),
                new Activity(4, 6),
                new Activity(6, 8),
                new Activity(5, 7),
                new Activity(8, 9)
        };

        // Call the activity selection function
        activitySelection(activities);
    }
}
