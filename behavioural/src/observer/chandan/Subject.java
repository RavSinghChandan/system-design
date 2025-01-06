package observer.chandan;
import  java.util.*;
public class Subject {

    private List<Observer> observers = new ArrayList<>(); // List of subscribers

    private String latestVideo; // State (latest video or update)

    // Add a subscriber
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getName() + " subscribed!");
    }

    // Remove a subscriber
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getName() + " unsubscribed!");
    }

    // Notify all subscribers about a new video
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestVideo);
        }
    }

    // Upload a new video
    public void uploadVideo(String videoTitle) {
        this.latestVideo = videoTitle;
        System.out.println("New video uploaded: " + videoTitle);
        notifyObservers();
    }
}
