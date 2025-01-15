package social.media;

import java.util.Date;

public class Notification {

    private String notificationId;
    private String userId;
    private String type;
    private Date timestamp;
    private boolean isRead;

    public Notification(String notificationId, String userId, String type, Date timestamp, boolean isRead) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.type = type;
        this.timestamp = timestamp;
        this.isRead = isRead;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public String getUserId() {
        return userId;
    }

    public String getType() {
        return type;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }
}
