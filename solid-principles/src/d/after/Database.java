package d.after;

// Low-Level Module (Database Access)
public interface Database {
    void connect();
    void saveOrder(String order);
}
