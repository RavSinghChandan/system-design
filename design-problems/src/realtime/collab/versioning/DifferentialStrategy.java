package realtime.collab.versioning;

public class DifferentialStrategy implements VersionStrategy {
    @Override
    public void saveVersion(String content) {
        System.out.println("Differential snapshot saved: " + content);
    }
}
