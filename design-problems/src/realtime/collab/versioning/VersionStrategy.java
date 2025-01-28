package realtime.collab.versioning;

public interface VersionStrategy {
    void saveVersion(String content);
}