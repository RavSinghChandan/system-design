# 🎓 Virtual Classroom - Low-Level Design (LLD)

## 🏰️ Overview

The **Virtual Classroom Platform** enables students and teachers to engage in online learning through live classes, assignments, discussion forums, and a resource library. It supports authentication, scheduling, real-time communication, and assessment management.

---

## 🔧 Components

### 1. **User Management System**
- **Purpose**: Manages user registration, authentication, and roles.
- **Patterns Applied**:
    - **Singleton**: Ensures a single instance of `UserService`.
    - **Factory**: Creates different types of users (Student, Teacher, Admin).

### 2. **Classroom & Course Management**
- **Purpose**: Allows teachers to create courses, add materials, and schedule classes.
- **Patterns Applied**:
    - **Builder**: Constructs `Course` objects with various attributes.
    - **Composite**: Manages modules and subtopics within a course.

### 3. **Live Class & Video Conferencing**
- **Purpose**: Facilitates real-time interaction via video/audio.
- **Patterns Applied**:
    - **Adapter**: Integrates third-party video conferencing APIs.
    - **Observer**: Notifies students about class schedules and updates.

### 4. **Assignment & Assessment System**
- **Purpose**: Enables teachers to create and evaluate assignments.
- **Patterns Applied**:
    - **Strategy**: Supports different grading mechanisms.
    - **Decorator**: Adds optional features like plagiarism detection.

### 5. **Discussion Forum & Chat**
- **Purpose**: Allows students and teachers to discuss topics asynchronously.
- **Patterns Applied**:
    - **Mediator**: Manages communication between users.
    - **Observer**: Notifies users about replies and messages.

### 6. **Resource Library & File Management**
- **Purpose**: Stores and manages educational materials.
- **Patterns Applied**:
    - **Prototype**: Clones resources for multiple courses.
    - **Facade**: Simplifies access to different types of files.

### 7. **Notification & Alerts**
- **Purpose**: Sends email/SMS notifications for reminders and updates.
- **Patterns Applied**:
    - **Observer**: Listens to events and triggers notifications.
    - **Facade**: Simplifies notification handling.

---

## 🔑 Key Classes

### **UserService**
#### Methods:
- `registerUser(User user)`: Registers a new user (**Singleton, Factory**).
- `authenticateUser(String email, String password)`: Authenticates users.

### **CourseService**
#### Methods:
- `createCourse(Course course)`: Creates a new course (**Builder, Composite**).
- `getCourseDetails(int courseId)`: Retrieves course information.

### **LiveClassService**
#### Methods:
- `scheduleLiveClass(LiveClass classDetails)`: Schedules a new live session (**Observer, Adapter**).
- `startLiveSession(int classId)`: Starts a live class.

### **AssignmentService**
#### Methods:
- `createAssignment(Assignment assignment)`: Adds an assignment (**Strategy, Decorator**).
- `evaluateSubmission(int assignmentId)`: Evaluates student submissions.

### **DiscussionService**
#### Methods:
- `postDiscussion(Discussion discussion)`: Creates a discussion thread (**Mediator, Observer**).
- `addReply(int discussionId, Reply reply)`: Adds a reply to a discussion.

### **NotificationService**
#### Methods:
- `sendEmail(String email, String message)`: Sends an email notification (**Observer, Facade**).
- `sendSMS(String phoneNumber, String message)`: Sends an SMS notification.

---

## 📂 Package Structure

```
com.virtualclassroom
├── user
│   ├── User.java
│   ├── Student.java
│   ├── Teacher.java
│   ├── Admin.java
│   ├── UserService.java
│   └── UserFactory.java
├── course
│   ├── Course.java
│   ├── Module.java
│   ├── CourseService.java
├── liveclass
│   ├── LiveClass.java
│   ├── LiveClassService.java
│   ├── VideoAdapter.java
├── assignment
│   ├── Assignment.java
│   ├── AssignmentService.java
│   ├── GradingStrategy.java
├── discussion
│   ├── Discussion.java
│   ├── DiscussionService.java
│   ├── ChatMediator.java
├── notification
│   ├── NotificationService.java
│   ├── EmailNotification.java
│   ├── SMSNotification.javaa
│   └── NotificationFacade.java
```

---

## 🚀 Design Patterns Summary

### **Creational Patterns**:
- **Singleton**: `UserService`
- **Factory**: `UserFactory`
- **Builder**: `CourseService`
- **Prototype**: `Resource Library`

### **Structural Patterns**:
- **Composite**: Course modules
- **Adapter**: Video conferencing integration
- **Facade**: Notification handling, Resource Library
- **Decorator**: Assignment features

### **Behavioral Patterns**:
- **Observer**: Notifications, Live class updates
- **Strategy**: Grading mechanisms
- **Command**: Assignment submissions
- **Mediator**: Chat discussions

---

## 🌟 Benefits
- **Scalability**: Supports a growing number of users and courses.
- **Reusability**: Modular design for easy maintenance.
- **Performance**: Optimized for real-time interactions.

This design ensures a **scalable, maintainable, and robust** virtual classroom experience.

