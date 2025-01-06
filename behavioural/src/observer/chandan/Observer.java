package observer.chandan;

public interface Observer {
    void update(String videoTitle); // Notify about the new video
    String getName();
}
