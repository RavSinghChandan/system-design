package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithm {

        // Function to find the maximum number of activities that can be performed
        public static void activitySelection(Activity[] activities) {
            // Sort activities by their finish time
            Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

            // The first activity always gets selected
            System.out.println("Selected activities:");
            System.out.println("Start: " + activities[0].start + " End: " + activities[0].end);

            // The last selected activity's end time
            int lastSelectedActivityEndTime = activities[0].end;

            // Consider the remaining activities
            for (int i = 1; i < activities.length; i++) {
                // If the start time of the current activity is greater than or equal
                // to the finish time of the last selected activity
                if (activities[i].start >= lastSelectedActivityEndTime) {
                    // Select the current activity
                    System.out.println("Start: " + activities[i].start + " End: " + activities[i].end);
                    lastSelectedActivityEndTime = activities[i].end;
                }
            }
        }
}
