package realtime.collab.versioning;

public class FullSnapshotStrategy implements VersionStrategy {
    @Override
    public void saveVersion(String content) {
        System.out.println("Full snapshot saved: " + content);
    }
}

