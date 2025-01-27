package social.media;

import java.util.Date;

public class Message {

    private String messageId;
    private String senderId;
    private String receiverId;
    private String content;
    private Date timestamp;
    private String status;

    public Message(String messageId, String senderId, String receiverId, String content, Date timestamp, String status) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.timestamp = timestamp;
        this.status = status;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getStatus() {
        return status;
    }
}
