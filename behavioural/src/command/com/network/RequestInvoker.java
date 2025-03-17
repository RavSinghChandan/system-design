package command.com.network;

import java.util.LinkedList;
import java.util.Queue;

public class RequestInvoker {
    private Queue<NetworkCommand> requestQueue = new LinkedList<>();

    public void addRequest(NetworkCommand command) {
        requestQueue.add(command);
    }

    public void executeRequests() {
        while (!requestQueue.isEmpty()) {
            requestQueue.poll().execute();
        }
    }
}

