package instagram.comment;

import java.util.ArrayList;
import java.util.List;

public class CommentService {
    private List<String> comments = new ArrayList<>();

    public void addComment(int photoId, String comment) {
        comments.add("Photo " + photoId + ": " + comment);
    }
}
