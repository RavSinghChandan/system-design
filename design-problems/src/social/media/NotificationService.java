package social.media;

import java.util.*;

public class NotificationService {

    private Map<String, List<Notification>> userNotifications = new HashMap<>();

    public Notification generateNotification(String userId, String type) {
        Notification notification = new Notification(UUID.randomUUID().toString(), userId, type, new Date(), false);
        userNotifications.computeIfAbsent(userId, k -> new ArrayList<>()).add(notification);
        return notification;
    }

    public List<Notification> getNotifications(String userId) {
        return userNotifications.getOrDefault(userId, new ArrayList<>());
    }
}
