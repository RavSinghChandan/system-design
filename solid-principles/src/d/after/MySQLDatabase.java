package d.after;

public class MySQLDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}
