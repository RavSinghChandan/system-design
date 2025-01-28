package realtime.collab.document;

public class DocumentService {

    public Document createDocument(String title, String content) {
        return new DocumentBuilder().setTitle(title).setContent(content).build();
    }
}
