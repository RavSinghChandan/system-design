package newsfeed.feed;

import newsfeed.post.Post;

import java.util.List;

public class RecentFirstStrategy implements RankingStrategy {

    @Override
    public List<Post> rank(List<Post> posts) {
        posts.sort((p1, p2) -> Integer.compare(p2.getPostId(), p1.getPostId()));
        return posts;
    }
}
