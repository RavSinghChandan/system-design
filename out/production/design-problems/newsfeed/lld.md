# 📰 News Feed System - Low-Level Design (LLD)

## 🏗️ Overview

The News Feed System enables users to post updates, follow other users, view personalized feeds, and interact with posts through likes and comments. The system ensures scalability, real-time updates, and efficient content delivery using various design patterns.

---

## 🔧 Components

### 1. **User Management System**
- **Purpose**: Manages user registration, authentication, and profiles.
- **Patterns Applied**:
    - **Singleton**: Ensures a single instance of `UserService`.
    - **Factory**: Creates different types of users (e.g., Regular, Influencer, Admin).

### 2. **Post Management**
- **Purpose**: Handles the creation, retrieval, and management of posts.
- **Patterns Applied**:
    - **Builder**: Constructs `Post` objects with various attributes.
    - **Composite**: Manages hierarchical content like threaded comments.

### 3. **News Feed Generation**
- **Purpose**: Generates personalized feeds for users.
- **Patterns Applied**:
    - **Observer**: Updates feeds when followed users create new posts.
    - **Strategy**: Implements different ranking algorithms (e.g., recent-first, engagement-based).

### 4. **Like & Comment System**
- **Purpose**: Allows users to interact with posts.
- **Patterns Applied**:
    - **Decorator**: Adds like and comment features to posts.
    - **Observer**: Notifies post owners when their content is liked or commented on.

### 5. **Follow System**
- **Purpose**: Manages user connections and follows.
- **Patterns Applied**:
    - **Observer**: Updates follower lists dynamically.
    - **Proxy**: Controls access to user profiles based on privacy settings.

### 6. **Notification Service**
- **Purpose**: Sends notifications for user activities.
- **Patterns Applied**:
    - **Facade**: Simplifies notification delivery.
    - **Observer**: Triggers notifications on specific actions.

---

## 🔑 Key Classes

### **UserService**
#### Methods:
- **registerUser(User user)**:
    - **Purpose**: Registers a new user.
    - **Pattern**: Singleton, Factory.
- **followUser(int userId, int followeeId)**:
    - **Purpose**: Enables users to follow others.
    - **Pattern**: Observer, Proxy.

### **PostService**
#### Methods:
- **createPost(Post post)**:
    - **Purpose**: Creates a new post.
    - **Pattern**: Builder.
- **getPost(int postId)**:
    - **Purpose**: Retrieves a post.
    - **Pattern**: Composite.

### **FeedService**
#### Methods:
- **generateFeed(int userId)**:
    - **Purpose**: Generates the user's news feed.
    - **Pattern**: Observer, Strategy.
- **rankPosts(List<Post> posts, String rankingAlgorithm)**:
    - **Purpose**: Ranks posts based on an algorithm.

### **InteractionService**
#### Methods:
- **likePost(int userId, int postId)**:
    - **Purpose**: Allows a user to like a post.
    - **Pattern**: Decorator, Observer.
- **commentOnPost(int userId, int postId, String comment)**:
    - **Purpose**: Allows a user to comment on a post.

### **NotificationService**
#### Methods:
- **sendNotification(int userId, String message)**:
    - **Purpose**: Sends a notification.
    - **Pattern**: Facade, Observer.

---

## 📂 Package Structure

```
com.newsfeed
├── user
│   ├── User.java
│   ├── Admin.java
│   ├── Influencer.java
│   ├── UserService.java
│   └── UserFactory.java
├── post
│   ├── Post.java
│   ├── PostBuilder.java
│   ├── Comment.java
│   ├── Like.java
│   ├── PostService.java
├── feed
│   ├── FeedService.java
│   ├── RankingStrategy.java
│   ├── RecentFirstStrategy.java
│   ├── EngagementBasedStrategy.java
├── interaction
│   ├── InteractionService.java
│   ├── LikeService.java
│   ├── CommentService.java
├── follow
│   ├── FollowService.java
│   ├── FollowerList.java
├── notification
│   ├── NotificationService.java
│   ├── EmailNotification.java
│   ├── SMSNotification.java
│   └── NotificationFacade.java
```

---

## 🚀 Design Patterns Summary

### **Creational Patterns**:
- **Singleton**: `UserService`
- **Factory**: `UserFactory`
- **Builder**: `PostService`

### **Structural Patterns**:
- **Composite**: Threaded comments
- **Proxy**: Follow system access control
- **Facade**: Notification service
- **Decorator**: Post interactions (likes, comments)

### **Behavioral Patterns**:
- **Observer**: News feed updates, notifications
- **Strategy**: Ranking algorithms
- **Command**: Interaction handling (likes, comments)

---

## 🌟 Benefits
- **Scalability**: Efficient feed generation and delivery.
- **Reusability**: Modular components allow easy feature extensions.
- **Maintainability**: Clean separation of concerns for easier debugging and enhancements.
