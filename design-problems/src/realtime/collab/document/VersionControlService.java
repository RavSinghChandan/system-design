package realtime.collab.document;

import java.util.ArrayList;
import java.util.List;

public class VersionControlService {

    private List<DocumentState> versions = new ArrayList<>();

    public void saveVersion(DocumentState state) {
        versions.add(state);
    }

    public DocumentState getVersion(int versionId) {
        return versions.get(versionId);
    }
}
