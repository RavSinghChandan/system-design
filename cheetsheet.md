# Design Pattern Correlation Cheat Sheet

## Overview
This cheat sheet helps you correlate **Creational**, **Structural**, and **Behavioral** design patterns to systematically solve problems. Use it as a guide to predict the patterns to use for creating, structuring, and interacting with objects.

---

### 1. Singleton
- **Creational**: Singleton
    - Ensures only one instance of an object exists.
- **Structural**: Facade
    - Provides a unified interface to the system managed by the singleton.
- **Behavioral**: Mediator
    - Coordinates interactions between multiple objects through the singleton.

---

### 2. Factory
- **Creational**: Factory Method
    - Creates objects without specifying the exact class.
- **Structural**: Composite
    - Organizes created objects hierarchically.
- **Behavioral**: Strategy
    - Allows swapping behaviors of objects created by the factory.

---

### 3. Prototype
- **Creational**: Prototype
    - Clones objects to create new instances.
- **Structural**: Adapter
    - Bridges the gap between cloned objects and existing systems.
- **Behavioral**: Observer
    - Notifies when cloned objects' states change.

---

### 4. Builder
- **Creational**: Builder
    - Constructs complex objects step by step.
- **Structural**: Bridge
    - Separates object construction from its functionality.
- **Behavioral**: Command
    - Handles step-by-step operations for building objects.

---

### 5. Abstract Factory
- **Creational**: Abstract Factory
    - Creates families of related objects.
- **Structural**: Proxy
    - Acts as a placeholder for families of created objects.
- **Behavioral**: Chain of Responsibility
    - Passes requests through objects created by the factory.

---

### 6. Prototype with Multiple Interfaces
- **Creational**: Prototype
    - Creates objects that implement multiple interfaces.
- **Structural**: Decorator
    - Adds responsibilities to objects dynamically.
- **Behavioral**: State
    - Allows objects to alter their behavior based on their internal state.

---

## Quick Reference Table

| **Creational**        | **Structural**   | **Behavioral**         |
|------------------------|------------------|-------------------------|
| Singleton             | Facade           | Mediator               |
| Factory Method        | Composite        | Strategy               |
| Prototype             | Adapter          | Observer               |
| Builder               | Bridge           | Command                |
| Abstract Factory      | Proxy            | Chain of Responsibility|
| Prototype + Interface | Decorator        | State                  |

---

## How to Use It
1. **Identify the problem**: What do you need to create?
2. **Choose the creational pattern**: Use the type of object needed to determine the creation strategy.
3. **Organize objects**: Use the structural pattern that fits the created objects' relationships.
4. **Define interactions**: Use the behavioral pattern that ensures smooth communication between objects.

---

## Practice Problems
1. Build a notification system:
    - **Creational**: Singleton
    - **Structural**: Facade
    - **Behavioral**: Observer

2. Create a payment gateway:
    - **Creational**: Factory Method
    - **Structural**: Adapter
    - **Behavioral**: Strategy

3. Design a workflow engine:
    - **Creational**: Builder
    - **Structural**: Bridge
    - **Behavioral**: Command

---

## Tips
- Start from **Creational**, move to **Structural**, and end with **Behavioral**.
- Look for common real-life examples to relate patterns for faster learning.
- Use this cheat sheet to reinforce your knowledge through coding exercises.
