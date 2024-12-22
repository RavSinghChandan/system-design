# 🔍 Single Responsibility Principle (SRP)

- **🔎 Introduction**
    - The **Single Responsibility Principle (SRP)** is one of the core principles of the SOLID design principles in software development.
    - It states that a class should have only one reason to change, meaning it should have only one job or responsibility.

- **❓ What is SRP?**
    - Each class or module should focus on a single responsibility or functionality.
    - Ensures that each class addresses a specific concern and does not mix different responsibilities.

- **🤔 Why use SRP?**
    - 🛠️ Enhances code maintainability by reducing complexity.
    - 🔍 Improves clarity, making the codebase easier to understand and modify.
    - 🔄 Facilitates testing by isolating responsibilities.
    - 🔗 Promotes separation of concerns, ensuring better design and scalability.

- **⏰ When to use SRP?**
    - When a class handles multiple responsibilities that can cause frequent changes.
    - When refactoring a monolithic codebase to improve modularity.
    - When adding new features without increasing the risk of breaking existing functionality.

- **📍 Where to apply SRP?**
    - 🧩 Business logic components.
    - 📱 UI and presentation layers.
    - 🌐 Service classes and APIs.
    - 📂 Data access or persistence layers.

- **⚙️ How does SRP work?**
    1. 🔄 Identify multiple responsibilities handled by a single class.
    2. 🏗️ Split those responsibilities into separate classes or modules.
    3. 🧩 Ensure that each class focuses on a single responsibility or concern.
    4. 🔗 Use composition, delegation, or dependency injection to coordinate between different classes.

- **👥 Who should use SRP?**
    - 🧑‍💻 Developers working on modular or scalable systems.
    - 🔧 Teams focusing on clean code practices and maintainable designs.
    - 🏗️ Architects designing loosely coupled and testable systems.

- **✅ Advantages**
    - 🧹 Cleaner, more organized codebase.
    - 🛠️ Easier debugging and testing.
    - 🔗 Improved reusability of individual components.
    - 🔄 Faster adaptation to changes and enhancements.

- **❌ Disadvantages**
    - ⚠️ Can lead to an increased number of smaller classes.
    - 🕒 May introduce additional complexity when coordinating between classes.

- **🌍 Real-World Examples**
    1. 🛒 **E-commerce Application**: Splitting user authentication, product management, and order processing into separate classes.
    2. 📊 **Report Generation**: Creating different classes for data fetching, formatting, and exporting reports.
    3. 🎨 **Graphic Design Tool**: Handling drawing tools, canvas management, and file operations in separate modules.
    4. 🏦 **Banking Application**: Separating account management, transaction processing, and audit logging responsibilities.
    5. 🌐 **Web Application**: Splitting controllers, services, and data repositories into distinct layers.

## 🌟 Structure

```plaintext
+-----------------------+         +-----------------------+
|   Single Responsibility |         |  Single Responsibility |
|      Class A           |         |      Class B           |
+-----------------------+         +-----------------------+
               |                              |
               v                              v
       +-----------------------+      +-----------------------+
       |   Specific Function    |      |   Specific Function    |
       +-----------------------+      +-----------------------+
