# Template Method Design Pattern

---

## 🔎 Introduction
The **Template Method Design Pattern** is a behavioral design pattern that defines the skeleton of an algorithm in a base class but allows subclasses to redefine certain steps of the algorithm without changing its structure.

---

## ❓ What is the Template Method Pattern?
- A **Template Method** is a method that defines the steps of an algorithm and delegates some steps to subclasses.
- The algorithm's structure is preserved in a base class, while specific steps can be customized in derived classes.
- This ensures a consistent behavior while allowing variations in specific operations.

---

## 🤔 Why use the Template Method Pattern?
- 🔄 **Code Reusability**: Reuse the invariant parts of an algorithm.
- 📉 **Reduced Duplication**: Common logic is implemented in the base class, avoiding redundancy.
- 🔧 **Flexibility**: Subclasses can define the variable parts of an algorithm.

---

## ⏰ When to use the Template Method Pattern?
- When you want to avoid code duplication by sharing common logic across related classes.
- When you need to enforce a specific sequence of operations.
- When you want to delegate parts of an algorithm to subclasses for customization.

---

## 📍 Where to use the Template Method Pattern?
- **Game Development**: Defining the steps for a game loop while allowing customization for specific games.
- **Data Parsing**: Creating parsers with common steps like validation, processing, and formatting.
- **Report Generation**: Standardizing report generation steps, allowing customization for data sources or formats.
- **Framework Development**: Providing extensibility in frameworks with predefined steps.

---

## ⚙️ How does the Template Method Pattern work?

1. **Abstract Class**:
    - Defines the template method.
    - Contains both implemented steps and abstract methods for customization.

2. **Concrete Class**:
    - Inherits from the abstract class.
    - Implements the abstract methods to provide specific behavior.

3. **Template Method**:
    - Calls the steps of the algorithm, some of which may be abstract and implemented by subclasses.

---

## ✅ Advantages
- 📚 **Consistency**: Guarantees a consistent sequence of steps in the algorithm.
- 🛠️ **Reusability**: Avoids code duplication by sharing common logic.
- ♻️ **Extensibility**: Enables subclasses to customize certain steps.

---

## ❌ Disadvantages
- 🚧 **Inheritance Dependency**: Requires subclassing, which can limit flexibility.
- 🔧 **Limited Control**: Subclasses have limited freedom; they can only customize specific parts of the algorithm.

---

## 🌍 Real-World Applications

### 1. **Game Development**
- **Use Case**: Implementing a game loop with steps like `initialize`, `play`, and `end`.
- **Benefit**: Customizes the `play` step for different games.

### 2. **Data Processing**
- **Use Case**: Parsing different file types like JSON, XML, or CSV.
- **Benefit**: Standardizes common steps like opening, reading, and closing files.

### 3. **Sorting Algorithms**
- **Use Case**: Implementing a sorting framework with hooks for custom comparison logic.
- **Benefit**: Reuses the overall sorting logic while allowing custom comparisons.

### 4. **Document Rendering**
- **Use Case**: Rendering documents with steps like loading, formatting, and saving.
- **Benefit**: Customizes the formatting step for specific document types.

### 5. **Cooking Recipes**
- **Use Case**: Defining a recipe with steps like preparation, cooking, and serving.
- **Benefit**: Allows customization for specific dishes.

### 6. **UI Frameworks**
- **Use Case**: Creating UI components with steps like initialization, rendering, and destruction.
- **Benefit**: Standardizes lifecycle management.

### 7. **Web Scraping**
- **Use Case**: Defining steps like request, parse, and store.
- **Benefit**: Customizes the parsing step for specific websites.

### 8. **Testing Frameworks**
- **Use Case**: Writing test cases with setup, execution, and teardown steps.
- **Benefit**: Provides consistent test execution while allowing custom tests.

### 9. **Framework Extensions**
- **Use Case**: Extending frameworks by overriding predefined hooks.
- **Benefit**: Simplifies integration with custom behavior.

### 10. **AI Pipelines**
- **Use Case**: Building machine learning pipelines with steps like preprocessing, training, and evaluation.
- **Benefit**: Customizes preprocessing or training steps for specific models.

---

## 🖼️ Structure

```plaintext
+-----------------------------+
|       Abstract Class        |
+-----------------------------+
|  + Template Method          |
|  + Concrete/Abstract Steps  |
+-----------------------------+
               ^
               |
               |
    +---------------------+
    |   Concrete Class    |
    +---------------------+
    | + Overridden Steps  |
    +---------------------+
```

---

## 🔨 Example Workflow

### Template Method
1. Initialize resources.
2. Perform core operations.
3. Cleanup resources.

### Concrete Class
- Implements specific details for step 2.

---
