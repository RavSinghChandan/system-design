package observer.chandan;

public class Client {
    public static void main(String[] args) {
        // Create Subject (Chandan's Channel)
        Subject chandanChannel = new Subject();

        // Create Subscribers
        Observer subscriber1 = new Subscriber("Ravi");
        Observer subscriber2 = new Subscriber("Sita");
        Observer subscriber3 = new Subscriber("Gita");

        // Subscribers join the channel
        chandanChannel.subscribe(subscriber1);
        chandanChannel.subscribe(subscriber2);
        chandanChannel.subscribe(subscriber3);

        // Chandan uploads a new video
        chandanChannel.uploadVideo("Palm Reading for Success!");

        // A subscriber leaves
        chandanChannel.unsubscribe(subscriber2);

        // Another video is uploaded
        chandanChannel.uploadVideo("Vastu Tips for Prosperity!");
    }
}
