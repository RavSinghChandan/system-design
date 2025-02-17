package newsfeed.feed;

import newsfeed.post.Post;

import java.util.List;

public interface RankingStrategy {
    List<Post> rank(List<Post> posts);
}
