# Chain of Responsibility Design Pattern

---

## 🔎 Introduction
The **Chain of Responsibility Design Pattern** is a behavioral design pattern that allows a request to be passed along a chain of handlers. Each handler in the chain decides either to process the request or pass it to the next handler in the sequence.

---

## ❓ What is the Chain of Responsibility Pattern?
- It decouples the sender of a request from its receiver by allowing multiple handlers to process the request.
- The chain stops when a handler processes the request or the end of the chain is reached.

---

## 🤔 Why use the Chain of Responsibility Pattern?
- 🔄 **Flexible Request Handling**: Dynamically determine the handler for a request.
- 🚀 **Extensibility**: Add or remove handlers in the chain without changing existing code.
- 🧹 **Clean Separation of Concerns**: Keep the sender and handlers decoupled.

---

## ⏰ When to use the Chain of Responsibility Pattern?
- When multiple objects can handle a request, and the handler isn't known in advance.
- When you want to allow a request to be processed by a subset of objects in a specific order.
- When you need to avoid coupling the sender of the request to its receiver.

---

## 📍 Where to use the Chain of Responsibility Pattern?
- 📧 **Email Filtering**: Routing emails through spam, promotion, and primary filters.
- 🛡️ **Authentication Systems**: Validating user credentials through a series of checks.
- 🛒 **Order Processing**: Passing orders through inventory, payment, and shipping handlers.
- 🧑‍⚖️ **Approval Workflows**: Routing approval requests through managers or departments.

---

## ⚙️ How does the Chain of Responsibility Pattern work?
1. **Handler Interface**: Declares a method to handle requests and a reference to the next handler.
2. **Concrete Handlers**: Implement the handler interface and decide whether to process the request or pass it along.
3. **Client**: Initiates a request and assigns it to the first handler in the chain.

---

## 👥 Who should use the Chain of Responsibility Pattern?
- Developers working on systems where requests can be handled by different objects dynamically.
- Teams building systems with clear workflows that require flexible request processing.
- Applications requiring separation of sender and handler logic.

---

## ✅ Advantages
- 📈 **Scalability**: Add new handlers easily without modifying existing ones.
- 🧩 **Reusability**: Reuse handlers in different workflows or chains.
- 🌐 **Decoupling**: Reduces dependencies between sender and receiver.

---

## ❌ Disadvantages
- ❓ **Uncertainty**: No guarantee that a request will be handled if no handler processes it.
- ⚙️ **Complexity**: Requires careful setup to ensure requests flow through the correct handlers.

---

# Chain of Responsibility Pattern - Examples

---

## 🔍 Introduction
The **Chain of Responsibility** design pattern is widely used in real-world scenarios where requests need to be processed by multiple handlers in a sequential manner. Here are 10 practical examples to demonstrate its applications.

---

## 🌟 Examples

### 1. **Email Filtering**
- **Use Case**: Route incoming emails through filters like spam, promotions, and primary inbox.
- **Handlers**: SpamFilter, PromotionsFilter, SocialFilter.
- **Benefit**: Ensures emails are categorized dynamically.

---

### 2. **Customer Support System**
- **Use Case**: Handle customer queries by routing them through levels like chatbot, support agent, and manager.
- **Handlers**: ChatbotHandler, AgentHandler, ManagerHandler.
- **Benefit**: Reduces load on higher levels by resolving issues at the earliest possible stage.

---

### 3. **Logging Framework**
- **Use Case**: Process log messages based on their severity levels (INFO, DEBUG, ERROR).
- **Handlers**: InfoLogger, DebugLogger, ErrorLogger.
- **Benefit**: Ensures only relevant logs are processed by specific handlers.

---

### 4. **Request Validation**
- **Use Case**: Validate incoming requests in a web application, checking for format, authentication, and data integrity.
- **Handlers**: FormatValidator, AuthValidator, IntegrityValidator.
- **Benefit**: Modularizes validation logic and ensures robustness.

---

### 5. **Approval Workflows**
- **Use Case**: Approve a budget request sequentially through team lead, manager, and director.
- **Handlers**: TeamLeadHandler, ManagerHandler, DirectorHandler.
- **Benefit**: Enables clear hierarchical processing of requests.

---

### 6. **Middleware in Web Applications**
- **Use Case**: Handle HTTP requests by passing them through middleware for tasks like authentication, logging, and compression.
- **Handlers**: AuthMiddleware, LoggingMiddleware, CompressionMiddleware.
- **Benefit**: Enhances request processing flexibility and scalability.

---

### 7. **ATM Withdrawal**
- **Use Case**: Process cash withdrawal requests by checking available denominations in cash cassettes.
- **Handlers**: TwentyHandler, FiftyHandler, HundredHandler.
- **Benefit**: Ensures optimal distribution of cash based on availability.

---

### 8. **E-commerce Order Processing**
- **Use Case**: Pass an order through inventory check, payment gateway, and shipping process.
- **Handlers**: InventoryHandler, PaymentHandler, ShippingHandler.
- **Benefit**: Simplifies order processing with a clear, sequential flow.

---

### 9. **Game Development**
- **Use Case**: Apply a sequence of effects or buffs on a game character.
- **Handlers**: DamageHandler, DefenseBuffHandler, HealthRegenHandler.
- **Benefit**: Modularizes the application of effects in the game.

---

### 10. **Notification System**
- **Use Case**: Deliver notifications via multiple channels, such as email, SMS, and push notifications, until one succeeds.
- **Handlers**: EmailNotifier, SMSNotifier, PushNotifier.
- **Benefit**: Ensures reliable delivery of critical notifications.

---

## 🎯 Summary
The **Chain of Responsibility Pattern** is versatile and applicable across diverse domains, including email systems, support workflows, gaming, and web development. By implementing this pattern, developers can achieve flexibility, modularity, and decoupling in request processing workflows.

---

## 🖼️ Structure

```plaintext
+-----------------------------+
|        Client Code          |
+-----------------------------+
               |
               v
   +-----------------------+
   |       Handler         |
   +-----------------------+
               |
               v
   +-----------------------+
   |  Concrete Handler 1   |
   +-----------------------+
               |
               v
   +-----------------------+
   |  Concrete Handler 2   |
   +-----------------------+
               |
               v
+-------------------------+
|    End of the Chain     |
+-------------------------+
