package newsfeed.feed;

import newsfeed.post.Post;

import java.util.List;

// FeedService.java
public class FeedService {
    public List<Post> generateFeed(int userId) {
        // Logic to generate feed based on user ID
        return null;
    }

    public List<Post> rankPosts(List<Post> posts, String rankingAlgorithm) {
        if ("recent".equalsIgnoreCase(rankingAlgorithm)) {
            return new RecentFirstStrategy().rank(posts);
        } else {
            return new EngagementBasedStrategy().rank(posts);
        }
    }
}
