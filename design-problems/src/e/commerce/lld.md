# 🛒 E-Commerce Website - Low-Level Design (LLD)

## 🏗️ Overview

The E-commerce website facilitates product browsing, user management, order placement, payment processing, and inventory management. It employs creation, structural, and behavioral design patterns to ensure scalability, maintainability, and reusability.

---

## 🔧 Components

### 1. **User Management System**
- **Purpose**: Manages user registration, authentication, and profile updates.
- **Patterns Applied**:
    - **Singleton**: For a single instance of `UserService`.
    - **Factory**: To create `User` objects (e.g., Admin, Customer).

### 2. **Product Catalog**
- **Purpose**: Provides product search, filtering, and categorization.
- **Patterns Applied**:
    - **Builder**: For constructing complex `Product` objects.
    - **Composite**: For managing categories and subcategories.

### 3. **Order Management**
- **Purpose**: Handles order placement, status tracking, and history.
- **Patterns Applied**:
    - **Observer**: For notifying users about order status updates.
    - **Strategy**: For applying various discount strategies.

### 4. **Payment Processing**
- **Purpose**: Integrates multiple payment gateways for transactions.
- **Patterns Applied**:
    - **Adapter**: To unify different payment gateway APIs.
    - **Command**: For executing payment transactions.

### 5. **Inventory Management**
- **Purpose**: Tracks stock levels and updates inventory after orders.
- **Patterns Applied**:
    - **Decorator**: For extending product features (e.g., warranty, gift wrap).
    - **Prototype**: For cloning similar inventory items.

### 6. **Notification Service**
- **Purpose**: Sends email and SMS notifications to users.
- **Patterns Applied**:
    - **Facade**: To simplify the notification process.
    - **Observer**: For triggering notifications on events like order placement.

---

## 🔑 Key Classes

### **UserService**
#### Methods:
- **registerUser(User user)**:
    - **Purpose**: Registers a new user.
    - **Pattern**: Singleton, Factory.

- **authenticateUser(String email, String password)**:
    - **Purpose**: Authenticates users during login.

### **ProductService**
#### Methods:
- **searchProduct(String keyword)**:
    - **Purpose**: Searches for products by keyword.
    - **Pattern**: Builder for constructing `Product` objects.

- **getProductsByCategory(String category)**:
    - **Purpose**: Retrieves products within a specific category.
    - **Pattern**: Composite for handling categories.

### **OrderService**
#### Methods:
- **placeOrder(Order order)**:
    - **Purpose**: Places a new order.
    - **Pattern**: Observer, Strategy.

- **trackOrder(int orderId)**:
    - **Purpose**: Tracks the status of an order.

### **PaymentService**
#### Methods:
- **processPayment(Payment payment)**:
    - **Purpose**: Processes a payment transaction.
    - **Pattern**: Adapter, Command.

- **refundPayment(int transactionId)**:
    - **Purpose**: Processes refunds.

### **InventoryService**
#### Methods:
- **updateStock(int productId, int quantity)**:
    - **Purpose**: Updates the inventory stock.
    - **Pattern**: Prototype, Decorator.

- **checkStock(int productId)**:
    - **Purpose**: Checks available stock for a product.

### **NotificationService**
#### Methods:
- **sendEmail(String email, String message)**:
    - **Purpose**: Sends an email notification.
    - **Pattern**: Facade, Observer.

- **sendSMS(String phoneNumber, String message)**:
    - **Purpose**: Sends an SMS notification.

---
```

---
com.ecommerce
├── user
│   ├── User.java
│   ├── Admin.java
│   ├── Customer.java
│   ├── UserService.java
│   └── UserFactory.java
├── product
│   ├── Product.java
│   ├── ProductBuilder.java
│   ├── Category.java
│   ├── SubCategory.java
│   └── ProductService.java
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


## 🚀 Design Patterns Summary

### **Creational Patterns**:
- Singleton: `UserService`
- Factory: `UserFactory`
- Builder: `ProductService`
- Prototype: `InventoryService`

### **Structural Patterns**:
- Composite: Product categories
- Adapter: Payment gateway integration
- Facade: Notification service
- Decorator: Inventory extensions

### **Behavioral Patterns**:
- Observer: Order notifications
- Strategy: Discount application
- Command: Payment transactions

---

## 🌟 Benefits
- **Scalability**: Modular design supports adding new features with minimal changes.
- **Reusability**: Design patterns enhance code reuse and consistency.
- **Maintainability**: Separation of concerns makes debugging and updates easier.
