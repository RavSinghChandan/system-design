# 🌐 Social Media Application - Low-Level Design (LLD)

## 🏗️ Overview

The Social Media Application is designed to allow users to connect, share posts, follow each other, and interact with content. The application focuses on scalability, usability, and real-time updates to ensure a smooth user experience.

---

## 🔧 Components

### 1. **UserService**
- **Purpose**: Handles user-related operations such as registration, authentication, and profile management.
- **Attributes**:
    - `userId`: Unique identifier for each user.
    - `username`: The username chosen by the user.
    - `email`: Email address of the user.
    - `password`: Encrypted password for secure authentication.
    - `profileDetails`: Stores user profile information (bio, profile picture, etc.).

---

### 2. **PostService**
- **Purpose**: Manages user posts, including creating, editing, and deleting posts.
- **Attributes**:
    - `postId`: Unique identifier for each post.
    - `userId`: The ID of the user who created the post.
    - `content`: Text or media content of the post.
    - `timestamp`: Time when the post was created.
    - `likes`: Number of likes on the post.
    - `comments`: List of comments associated with the post.

---

### 3. **FollowService**
- **Purpose**: Manages the relationship between users (followers and followees).
- **Attributes**:
    - `followerId`: The ID of the user who is following.
    - `followeeId`: The ID of the user being followed.
    - `followDate`: Timestamp of when the follow relationship was established.

---

### 4. **NotificationService**
- **Purpose**: Handles notifications for user activities such as likes, comments, and follows.
- **Attributes**:
    - `notificationId`: Unique identifier for each notification.
    - `userId`: The ID of the user receiving the notification.
    - `type`: The type of notification (like, comment, follow).
    - `timestamp`: Time when the notification was generated.
    - `readStatus`: Whether the notification has been read by the user.

---

### 5. **MessageService**
- **Purpose**: Enables direct messaging between users.
- **Attributes**:
    - `messageId`: Unique identifier for each message.
    - `senderId`: The ID of the user sending the message.
    - `receiverId`: The ID of the user receiving the message.
    - `content`: Text or media content of the message.
    - `timestamp`: Time when the message was sent.
    - `status`: Delivery status of the message (sent, delivered, read).

---

## 🔑 Key Classes

### **UserService**

#### Methods:
- **registerUser(String username, String email, String password)**:
    - **Purpose**: Registers a new user and stores their information.
    - **Input**: Username, email, and password.
    - **Output**: User ID.

- **authenticateUser(String email, String password)**:
    - **Purpose**: Authenticates a user during login.
    - **Input**: Email and password.
    - **Output**: Authentication token.

- **getUserProfile(String userId)**:
    - **Purpose**: Retrieves user profile details.
    - **Input**: User ID.
    - **Output**: Profile details.

---

### **PostService**

#### Methods:
- **createPost(String userId, String content)**:
    - **Purpose**: Creates a new post for a user.
    - **Input**: User ID and post content.
    - **Output**: Post ID.

- **likePost(String postId, String userId)**:
    - **Purpose**: Adds a like to a post.
    - **Input**: Post ID and user ID.
    - **Output**: Updated like count.

- **addComment(String postId, String userId, String comment)**:
    - **Purpose**: Adds a comment to a post.
    - **Input**: Post ID, user ID, and comment.
    - **Output**: Updated comment list.

---

### **FollowService**

#### Methods:
- **followUser(String followerId, String followeeId)**:
    - **Purpose**: Establishes a follow relationship between two users.
    - **Input**: Follower ID and followee ID.
    - **Output**: Success or failure message.

- **getFollowers(String userId)**:
    - **Purpose**: Retrieves the list of followers for a user.
    - **Input**: User ID.
    - **Output**: List of followers.

---

### **NotificationService**

#### Methods:
- **generateNotification(String userId, String type)**:
    - **Purpose**: Creates a notification for a user activity.
    - **Input**: User ID and type of notification.
    - **Output**: Notification ID.

- **getNotifications(String userId)**:
    - **Purpose**: Retrieves all notifications for a user.
    - **Input**: User ID.
    - **Output**: List of notifications.

---

### **MessageService**

#### Methods:
- **sendMessage(String senderId, String receiverId, String content)**:
    - **Purpose**: Sends a message to another user.
    - **Input**: Sender ID, receiver ID, and message content.
    - **Output**: Message ID.

- **getMessages(String userId, String contactId)**:
    - **Purpose**: Retrieves the conversation between two users.
    - **Input**: User ID and contact ID.
    - **Output**: List of messages.

---

## 💡 Key Takeaways

- **Scalability**: Designed to handle large volumes of users and activities.
- **Real-time interactions**: Focus on live notifications and messaging.
- **Security**: Ensures user data privacy and secure communication.
- **Extensibility**: Modular design to add features in the future.

---
