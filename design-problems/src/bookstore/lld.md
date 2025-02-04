# 📚 Online Bookstore - Low-Level Design (LLD)

## 🏗️ Overview

The Online Bookstore enables users to browse books, manage their accounts, place orders, process payments, and handle inventory. It incorporates various design patterns to ensure scalability, maintainability, and performance.

---

## 🔧 Components

### 1. **User Management System**
- **Purpose**: Manages user registration, authentication, and profiles.
- **Patterns Applied**:
    - **Singleton**: Ensures a single instance of `UserService`.
    - **Factory**: Creates different types of users (e.g., Admin, Customer).

### 2. **Book Catalog**
- **Purpose**: Facilitates book search, filtering, and categorization.
- **Patterns Applied**:
    - **Builder**: Constructs `Book` objects with various attributes.
    - **Composite**: Manages categories and subcategories of books.

### 3. **Order Management**
- **Purpose**: Handles book orders, order tracking, and history.
- **Patterns Applied**:
    - **Observer**: Notifies users about order status updates.
    - **Strategy**: Applies discount and pricing strategies.

### 4. **Payment Processing**
- **Purpose**: Integrates different payment methods.
- **Patterns Applied**:
    - **Adapter**: Standardizes different payment gateway APIs.
    - **Command**: Processes and executes payment transactions.

### 5. **Inventory Management**
- **Purpose**: Tracks book stock levels and updates after orders.
- **Patterns Applied**:
    - **Decorator**: Adds features like book editions and special covers.
    - **Prototype**: Clones book objects for bulk updates.

### 6. **Notification Service**
- **Purpose**: Sends email and SMS alerts for user activities.
- **Patterns Applied**:
    - **Facade**: Simplifies the notification process.
    - **Observer**: Triggers notifications based on events.

---

## 🔑 Key Classes

### **UserService**
#### Methods:
- **registerUser(User user)**:
    - **Purpose**: Registers a new user.
    - **Pattern**: Singleton, Factory.
- **authenticateUser(String email, String password)**:
    - **Purpose**: Authenticates users.

### **BookService**
#### Methods:
- **searchBook(String keyword)**:
    - **Purpose**: Searches for books.
    - **Pattern**: Builder.
- **getBooksByCategory(String category)**:
    - **Purpose**: Retrieves books from a category.
    - **Pattern**: Composite.

### **OrderService**
#### Methods:
- **placeOrder(Order order)**:
    - **Purpose**: Places a new order.
    - **Pattern**: Observer, Strategy.
- **trackOrder(int orderId)**:
    - **Purpose**: Tracks an order status.

### **PaymentService**
#### Methods:
- **processPayment(Payment payment)**:
    - **Purpose**: Processes payments.
    - **Pattern**: Adapter, Command.
- **refundPayment(int transactionId)**:
    - **Purpose**: Processes refunds.

### **InventoryService**
#### Methods:
- **updateStock(int bookId, int quantity)**:
    - **Purpose**: Updates inventory.
    - **Pattern**: Prototype, Decorator.
- **checkStock(int bookId)**:
    - **Purpose**: Checks book availability.

### **NotificationService**
#### Methods:
- **sendEmail(String email, String message)**:
    - **Purpose**: Sends an email notification.
    - **Pattern**: Facade, Observer.
- **sendSMS(String phoneNumber, String message)**:
    - **Purpose**: Sends an SMS notification.

---

## 📂 Package Structure

```
com.bookstore
├── user
│   ├── User.java
│   ├── Admin.java
│   ├── Customer.java
│   ├── UserService.java
│   └── UserFactory.java
├── book
│   ├── Book.java
│   ├── BookBuilder.java
│   ├── Category.java
│   ├── SubCategory.java
│   └── BookService.java
├── order
│   ├── Order.java
│   ├── OrderService.java
│   ├── OrderObserver.java
│   ├── OrderStatus.java
│   └── DiscountStrategy.java
├── payment
│   ├── Payment.java
│   ├── PaymentService.java
│   ├── PaymentAdapter.java
│   ├── PaymentCommand.java
│   └── PaymentGateway.java
├── inventory
│   ├── InventoryItem.java
│   ├── InventoryService.java
│   ├── InventoryDecorator.java
│   └── InventoryPrototype.java
└── notification
    ├── NotificationService.java
    ├── EmailNotification.java
    ├── SMSNotification.java
    └── NotificationFacade.java
```

---

## 🚀 Design Patterns Summary

### **Creational Patterns**:
- **Singleton**: `UserService`
- **Factory**: `UserFactory`
- **Builder**: `BookService`
- **Prototype**: `InventoryService`

### **Structural Patterns**:
- **Composite**: Book categories
- **Adapter**: Payment gateway integration
- **Facade**: Notification service
- **Decorator**: Book attributes

### **Behavioral Patterns**:
- **Observer**: Order notifications
- **Strategy**: Discount application
- **Command**: Payment transactions

---

## 🌟 Benefits
- **Scalability**: Easily extendable for new features.
- **Reusability**: Design patterns enhance modularity.
- **Maintainability**: Separation of concerns improves debugging and updates.
