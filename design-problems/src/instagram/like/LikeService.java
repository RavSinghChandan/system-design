package instagram.like;

import java.util.HashMap;
import java.util.Map;

public class LikeService {
    private Map<Integer, Integer> likeCount = new HashMap<>();

    public void likePhoto(int photoId) {
        likeCount.put(photoId, likeCount.getOrDefault(photoId, 0) + 1);
    }
}
