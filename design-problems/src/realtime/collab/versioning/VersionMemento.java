package realtime.collab.versioning;

public class VersionMemento {
    private final String state;

    public VersionMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}