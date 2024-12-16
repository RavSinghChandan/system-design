# Strategy Design Pattern

---

## 🔎 Introduction
The **Strategy Design Pattern** is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to be selected at runtime, promoting flexibility and reuse.

---

## ❓ What is the Strategy Pattern?
- Provides a way to define a group of related algorithms.
- Encapsulates the logic of these algorithms into separate classes.
- Enables switching between algorithms dynamically at runtime.

---

## 🤔 Why use the Strategy Pattern?
- 🛠️ **Flexibility**: Allows choosing algorithms dynamically based on user input or context.
- 📚 **Encapsulation**: Keeps algorithm logic separate from the client.
- 🔄 **Open/Closed Principle**: Adding new algorithms doesn't require modifying existing code.

---

## ⏰ When to use the Strategy Pattern?
- When multiple algorithms are available for a task, and the specific choice must be made dynamically.
- When you want to isolate the algorithm logic from the main program logic.
- When a class uses conditional logic to decide the algorithm to apply.

---

## 📍 Where to use the Strategy Pattern?
- **Sorting**: Choosing different sorting algorithms dynamically.
- **Compression**: Switching between file compression methods like ZIP, GZIP, etc.
- **Payment Processing**: Handling multiple payment methods in e-commerce systems.
- **Authentication**: Implementing various authentication methods like OAuth, SSO, etc.

---

## ⚙️ How does the Strategy Pattern work?

1. **Strategy Interface**: Defines a common interface for all supported algorithms.
2. **Concrete Strategies**: Implement the algorithm defined by the strategy interface.
3. **Context Class**: Contains a reference to a strategy object and calls its algorithm.
4. **Client Code**: Decides which strategy to use and passes it to the context.

---

## ✅ Advantages
- 🛠️ **Extensibility**: Easy to add new strategies without changing the existing ones.
- ♻️ **Reusability**: Algorithms are independent and reusable across different contexts.
- 🔄 **Runtime Flexibility**: Allows changing the behavior dynamically.

---

## ❌ Disadvantages
- 📉 **Overhead**: Increases the number of classes in the system.
- 🚧 **Complexity**: Switching strategies dynamically can make the code harder to read and maintain.

---

## 🌍 Real-World Applications

### 1. **Sorting Algorithms**
- **Use Case**: Dynamically choosing between QuickSort, MergeSort, or BubbleSort based on data size.

### 2. **Compression Methods**
- **Use Case**: Switching between ZIP, GZIP, or TAR compression algorithms in a file archiver.

### 3. **Payment Methods**
- **Use Case**: Handling credit card, PayPal, and cryptocurrency payments in an online store.

### 4. **Authentication Strategies**
- **Use Case**: Supporting multiple login methods such as username-password, Google OAuth, or fingerprint.

### 5. **Game AI**
- **Use Case**: Implementing different strategies for player movements or enemy behavior.

### 6. **Tax Calculation**
- **Use Case**: Applying different tax calculation algorithms for different countries.

### 7. **File Parsers**
- **Use Case**: Dynamically choosing file parsers for CSV, JSON, or XML.

### 8. **Navigation Systems**
- **Use Case**: Switching between shortest route, fastest route, or scenic route algorithms.

### 9. **Investment Portfolio**
- **Use Case**: Applying different investment strategies based on market conditions.

### 10. **Image Processing**
- **Use Case**: Choosing different filters or transformations for image editing.

---

## 🖼️ Structure

```plaintext
+-------------------------+
|       Client Code       |
+-------------------------+
              |
              v
     +------------------+
     |      Context      |
     +------------------+
              |
              v
   +--------------------+
   |   Strategy Interface |
   +--------------------+
              ^
              |
   +--------------------+
   |  Concrete Strategy  |
   +--------------------+
```

---

## 🌟 Key Concepts

1. **Encapsulation**: Each algorithm is encapsulated in its own class.
2. **Abstraction**: The context relies on an abstraction to call the algorithm.
3. **Dynamic Selection**: Algorithms can be swapped at runtime, based on requirements.
