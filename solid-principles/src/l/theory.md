# 🔍 Liskov Substitution Principle (LSP)

- **🔎 Introduction**
    - The **Liskov Substitution Principle (LSP)** is one of the core principles of the SOLID design principles in software development.
    - It states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

- **❓ What is LSP?**
    - A subclass must be substitutable for its base class without altering the desired properties of the program.
    - It ensures that a subclass can extend the behavior of a superclass without changing its expected functionality.

- **🤔 Why use LSP?**
    - 🛠️ Promotes code extensibility and reusability by ensuring that subclasses adhere to the behavior expected by the base class.
    - 🔍 Enhances code clarity, making it easier to understand and maintain.
    - 🔄 Facilitates safer inheritance, as subclasses are guaranteed to conform to the behavior of the parent class.

- **⏰ When to use LSP?**
    - When you want to create a flexible and extensible class hierarchy.
    - When designing systems that require polymorphism and runtime flexibility.
    - When dealing with inheritance and want to ensure that subclass objects are interchangeable with their superclass.

- **📍 Where to apply LSP?**
    - 🧩 Class hierarchies and inheritance structures.
    - 🔧 In systems that rely on polymorphic behavior.
    - 📱 UI components where derived components can be swapped out for base components.

- **⚙️ How does LSP work?**
    1. 🏗️ Ensure that subclasses can be used interchangeably with their base class without altering the program’s behavior.
    2. 💡 Subclasses should not weaken or override the behavior of the parent class in a way that breaks the intended functionality.
    3. 🧩 When extending classes, maintain the consistency of the class’s behavior, ensuring that derived classes can be substituted wherever the base class is used.

- **👥 Who should use LSP?**
    - 🧑‍💻 Developers designing class hierarchies with polymorphic behavior.
    - 🔧 Teams focusing on creating flexible and extensible codebases.
    - 🏗️ Architects designing systems with a focus on reusable and maintainable components.

- **✅ Advantages**
    - 🛠️ Easier to extend and modify code.
    - 🔄 Increases code reusability and flexibility.
    - 🧩 Improves the reliability of polymorphism in object-oriented systems.
    - 🧹 Ensures maintainable and predictable inheritance structures.

- **❌ Disadvantages**
    - ⚠️ Can restrict the freedom to modify subclass behavior, especially in more complex inheritance trees.
    - 🕒 Requires careful design to ensure that subclasses maintain the expectations set by the base class.

- **🌍 Real-World Examples**
    1. 🛒 **E-commerce Application**: A `DiscountCalculator` base class that can be extended by various discount rules (e.g., percentage discount, seasonal discount), ensuring that all subclasses can be used interchangeably in the pricing system.
    2. 🏦 **Banking Application**: A `Transaction` base class with subclasses such as `Deposit` and `Withdrawal`, ensuring that both can be used in place of `Transaction` without breaking the system's behavior.
    3. 🚗 **Vehicle Management System**: A `Vehicle` base class with subclasses like `Car` and `Truck`, ensuring that both can be used interchangeably in a vehicle management system.

## 🌟 Structure

```plaintext
+-----------------------+         +-----------------------+
|   Base Class (Vehicle) |         |   Subclass (Car)      |
+-----------------------+         +-----------------------+
               |                              |
               v                              v
       +-----------------------+      +-----------------------+
       |  Expected Behavior     |      |  Extended Behavior     |
       +-----------------------+      +-----------------------+
