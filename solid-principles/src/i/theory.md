# 🔍 Interface Segregation Principle (ISP)

- **🔎 Introduction**
    - The **Interface Segregation Principle (ISP)** is one of the SOLID design principles that encourages the use of small, client-specific interfaces instead of large, general-purpose ones.
    - It states that no client should be forced to depend on methods it does not use.

- **❓ What is ISP?**
    - The principle suggests that interfaces should be split into smaller, more specific interfaces, so clients only need to implement the methods they actually use.
    - Instead of a large interface that defines many unrelated methods, break it into several smaller interfaces with specific behaviors.

- **🤔 Why use ISP?**
    - 🛠️ Improves code maintainability by reducing dependencies.
    - 🔍 Reduces the impact of changes in the system by ensuring clients are not affected by unused methods.
    - 🔄 Enhances flexibility by allowing easier modifications and enhancements.

- **⏰ When to use ISP?**
    - When you notice that clients are forced to implement methods that are irrelevant to them.
    - When a large interface is making the codebase difficult to maintain.
    - When adding new features that require new behavior but don't impact existing clients.

- **📍 Where to apply ISP?**
    - 🧩 Large interfaces that contain unrelated methods.
    - 📱 Service classes or components that define general behaviors for different clients.
    - 🌐 In any scenario where clients need only a subset of the functionality provided by an interface.

- **⚙️ How does ISP work?**
    1. 🔄 Identify interfaces that have methods not relevant to all implementing classes.
    2. 🏗️ Split the large interface into smaller, more cohesive interfaces.
    3. 🧩 Ensure that each interface focuses on a specific aspect of behavior.
    4. 🔗 Ensure that clients only implement the interfaces they need, reducing unnecessary dependencies.

- **👥 Who should use ISP?**
    - 🧑‍💻 Developers designing modular systems with varying client needs.
    - 🔧 Teams aiming to create flexible and reusable components.
    - 🏗️ Architects designing scalable systems with distinct responsibilities.

- **✅ Advantages**
    - 🧹 Cleaner, more focused interfaces.
    - 🛠️ Reduced coupling between components.
    - 🔗 Improved code readability and flexibility.
    - 🔄 Easier testing of individual behaviors.

- **❌ Disadvantages**
    - ⚠️ Can increase the number of interfaces, leading to more abstraction.
    - 🕒 May require more time upfront to design the right interface granularity.

- **🌍 Real-World Examples**
    1. 📱 **UI Components**: Splitting interfaces for drawing shapes into specific interfaces for circles, rectangles, etc., so each shape class only implements the relevant methods.
    2. 🏦 **Banking System**: Creating separate interfaces for payment methods like `PayByCard` and `PayByBankTransfer`, so clients don’t have to implement methods they don’t use.
    3. 🌐 **E-commerce Platform**: Splitting user authentication, product listing, and cart management into distinct interfaces for better flexibility and easier maintenance.

## 🌟 Structure

```plaintext
+-----------------------+         +-----------------------+
|   Large Interface     |         |   Smaller Interfaces  |
|  (Unsegregated)       |         |   (Segregated)        |
+-----------------------+         +-----------------------+
               |                              |
               v                              v
       +-----------------------+      +-----------------------+
       |  Client with unused   |      |  Client with relevant |
       |  methods               |      |  methods only         |
       +-----------------------+      +-----------------------+
