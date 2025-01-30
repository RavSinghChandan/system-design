# 📸 Photo-Sharing Application - Low-Level Design (LLD)

## 🏗️ Overview

The photo-sharing application enables users to upload, view, like, comment, and share photos. It follows a scalable architecture with well-defined components using design patterns to ensure maintainability and efficiency.

---

## 🔧 Components

### 1. **User Management System**
- **Purpose**: Handles user registration, authentication, and profile management.
- **Patterns Applied**:
    - **Singleton**: To maintain a single instance of `UserService`.
    - **Factory**: To create `User` objects (e.g., RegularUser, Admin).

### 2. **Photo Upload & Storage**
- **Purpose**: Enables users to upload, store, and retrieve images.
- **Patterns Applied**:
    - **Builder**: For constructing `Photo` objects.
    - **Proxy**: To handle image compression before storage.

### 3. **Feed & Timeline**
- **Purpose**: Displays posts from followed users and trending content.
- **Patterns Applied**:
    - **Observer**: To update users when new photos are uploaded.
    - **Strategy**: For ranking and sorting feed posts.

### 4. **Like & Comment System**
- **Purpose**: Allows users to like and comment on photos.
- **Patterns Applied**:
    - **Decorator**: To extend functionality for reactions (e.g., emojis).
    - **Observer**: To notify users of new comments or likes.

### 5. **Notification System**
- **Purpose**: Sends push notifications and emails for user interactions.
- **Patterns Applied**:
    - **Facade**: To simplify notification handling.
    - **Observer**: For event-driven notifications.

### 6. **Search & Discovery**
- **Purpose**: Allows users to search for people, hashtags, and posts.
- **Patterns Applied**:
    - **Adapter**: To integrate multiple search algorithms.
    - **Composite**: To manage categories (e.g., hashtags, users, locations).

### 7. **Messaging & Direct Chats**
- **Purpose**: Enables private messaging between users.
- **Patterns Applied**:
    - **Mediator**: To manage message delivery.
    - **Observer**: For real-time chat updates.

### 8. **Security & Moderation**
- **Purpose**: Handles content moderation and user blocking.
- **Patterns Applied**:
    - **Chain of Responsibility**: For content moderation pipeline.
    - **Proxy**: To filter inappropriate content.

---

## 🔑 Key Classes

### **UserService**
#### Methods:
- **registerUser(User user)**:
    - **Purpose**: Registers a new user.
    - **Pattern**: Singleton, Factory.

- **authenticateUser(String email, String password)**:
    - **Purpose**: Authenticates users.

### **PhotoService**
#### Methods:
- **uploadPhoto(Photo photo)**:
    - **Purpose**: Uploads and stores a photo.
    - **Pattern**: Builder, Proxy.

- **getUserPhotos(int userId)**:
    - **Purpose**: Retrieves all photos uploaded by a user.

### **FeedService**
#### Methods:
- **getFeed(int userId)**:
    - **Purpose**: Fetches user feed.
    - **Pattern**: Observer, Strategy.

### **LikeService**
#### Methods:
- **likePhoto(int photoId, int userId)**:
    - **Purpose**: Registers a like for a photo.
    - **Pattern**: Observer.

### **CommentService**
#### Methods:
- **addComment(int photoId, String comment, int userId)**:
    - **Purpose**: Adds a comment to a photo.
    - **Pattern**: Observer, Decorator.

### **NotificationService**
#### Methods:
- **sendNotification(String message, int userId)**:
    - **Purpose**: Sends notifications.
    - **Pattern**: Facade, Observer.

### **SearchService**
#### Methods:
- **search(String keyword)**:
    - **Purpose**: Searches for users, photos, and hashtags.
    - **Pattern**: Adapter, Composite.

---

## 📂 Folder Structure
```
com.photoshare
├── user
│   ├── User.java
│   ├── UserService.java
│   ├── UserFactory.java
├── photo
│   ├── Photo.java
│   ├── PhotoService.java
│   ├── PhotoProxy.java
├── feed
│   ├── FeedService.java
│   ├── FeedObserver.java
├── like
│   ├── Like.java
│   ├── LikeService.java
├── comment
│   ├── Comment.java
│   ├── CommentService.java
│   ├── CommentObserver.java
├── notification
│   ├── Notification.java
│   ├── NotificationService.java
│   ├── NotificationFacade.java
├── search
│   ├── SearchService.java
│   ├── SearchAdapter.java
└── messaging
    ├── Message.java
    ├── ChatService.java
    ├── ChatMediator.java
```

---

## 🎭 Actor-Action Diagram

```
        +-------------------+
        |     User          |
        +-------------------+
        | - Register/Login  |
        | - Upload Photos   |
        | - Like/Comment    |
        | - Follow Users    |
        | - Send Messages   |
        +-------------------+
               |
               | (interacts with)
               v
+---------------------------------+
|       Photo-Sharing App        |
|---------------------------------|
| - Handles Photo Uploads        |
| - Manages Feed & Notifications |
| - Enables Likes & Comments     |
| - Processes Messages           |
| - Provides Search Features     |
+---------------------------------+
               |
               | (notifies)
               v
+-------------------------+
| Notification System     |
|-------------------------|
| - Sends Notifications  |
| - Manages Subscriptions |
+-------------------------+
```

---

## 🚀 Design Patterns Summary

### **Creational Patterns**:
- Singleton: `UserService`
- Factory: `UserFactory`
- Builder: `PhotoService`

### **Structural Patterns**:
- Proxy: Image compression
- Composite: Search filters
- Adapter: Search algorithm integration
- Facade: Notification handling

### **Behavioral Patterns**:
- Observer: Notifications, Likes, Comments
- Strategy: Feed ranking
- Mediator: Chat system
- Chain of Responsibility: Content moderation

---

## 🌟 Benefits
- **Scalability**: Modular design allows for new feature additions.
- **Performance**: Optimized feed, search, and notifications.
- **Maintainability**: Well-structured code for easy updates.
- **Security**: Content moderation and user privacy safeguards.

---
