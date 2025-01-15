package social.media;

import java.util.*;

public class MessageService {
    private Map<String, List<Message>> userMessages = new HashMap<>();

    public Message sendMessage(String senderId, String receiverId, String content) {
        Message message = new Message(UUID.randomUUID().toString(), senderId, receiverId, content, new Date(), "sent");
        userMessages.computeIfAbsent(senderId, k -> new ArrayList<>()).add(message);
        userMessages.computeIfAbsent(receiverId, k -> new ArrayList<>()).add(message);
        return message;
    }

    public List<Message> getMessages(String userId, String contactId) {
        List<Message> messages = new ArrayList<>();
        if (userMessages.containsKey(userId)) {
            for (Message message : userMessages.get(userId)) {
                if (message.getReceiverId().equals(contactId) || message.getSenderId().equals(contactId)) {
                    messages.add(message);
                }
            }
        }
        return messages;
    }
}
