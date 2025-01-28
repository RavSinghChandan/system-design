package realtime.collab.collaboration;

public class CollaborationSession {

    public void addObserver(CollaborationObserver observer) {
        System.out.println("Observer added.");
    }

    public void notifyObservers(String message) {
        System.out.println("Notifying observers: " + message);
    }
}
