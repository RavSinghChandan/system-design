package newsfeed.post;

import java.util.ArrayList;
import java.util.List;

public class PostService {
    private List<Post> posts = new ArrayList<>();

    public void createPost(Post post) {
        posts.add(post);
    }

    public Post getPost(int postId) {
        return posts.stream().filter(p -> p.getPostId() == postId).findFirst().orElse(null);
    }
}

