# 🌳 Composite Design Pattern

- **🔎 Introduction**
    - The **Composite Design Pattern** is a structural pattern used to represent part-whole hierarchies.
    - It allows individual objects and composites of objects to be treated uniformly.

- **❓ What is the Composite Pattern?**
    - It enables you to compose objects into tree-like structures to represent part-whole hierarchies.
    - It allows clients to treat individual objects and composites of objects uniformly.

- **🤔 Why use the Composite Pattern?**
    - 🌐 Simplifies client code by treating individual objects and groups of objects the same.
    - ⚡ Makes it easier to add new types of components into the structure.
    - 🛠️ Supports flexible and extensible system design.

- **⏰ When to use the Composite Pattern?**
    - When you need to represent a tree structure, such as organizational charts, file systems, etc.
    - When clients need to treat individual objects and compositions of objects uniformly.

- **📍 Where to use the Composite Pattern?**
    - 🖥️ GUI systems where components can be nested (buttons, panels, containers).
    - 🗂️ File systems where files and directories are part of a tree structure.
    - 🏗️ Construction of composite objects like web page layouts or graphic shapes.

- **⚙️ How does the Composite Pattern work?**
    1. 🌱 Define a **component interface** that defines common operations for both leaf and composite elements.
    2. 🍂 Create **leaf objects** that represent individual elements.
    3. 🌲 Create **composite objects** that can hold child components (both leaf and other composites).
    4. 🔄 Composite objects delegate operations to their child components and may override some methods.
    5. 🤝 Clients interact with the **component interface**, treating both leaf and composite objects uniformly.

- **👥 Who should use the Composite Pattern?**
    - 🧑‍💻 Developers working on hierarchical or tree-like structures.
    - 🖥️ UI developers needing to manage complex structures of widgets or components.
    - 🌐 Designers creating systems where part-whole relationships need to be modeled.

- **✅ Advantages**
    - 🔗 Allows uniform treatment of individual objects and compositions of objects.
    - 🔄 Makes it easier to add new component types without changing client code.
    - 🛠️ Supports recursive composition, enabling complex structures to be built easily.
    - 🌱 Encourages a clean, maintainable, and scalable design.

- **❌ Disadvantages**
    - ⚠️ Can lead to design complexity when the number of components grows.
    - 🕒 Composite objects may become harder to manage and require careful structure.

- **🌍 Real-World Examples**
    1. 🖥️ **File Systems:** Files and directories are treated uniformly in a tree structure, where both individual files and directories can be handled similarly.
    2. 🏗️ **UI Components:** Buttons, panels, and other widgets can be nested inside containers, treated as individual elements or groups.
    3. 🎮 **Game Entities:** Characters, items, and environments can be part of a hierarchical structure, treated as entities or groups.
    4. 🌐 **Network Topology:** Routers, switches, and subnets can be represented in a tree-like structure for network design.
    5. 🎨 **Graphic Design:** Graphic elements like shapes, lines, and compositions of objects in a drawing application.
    6. 🧩 **Mathematical Expressions:** Representing mathematical expressions using numbers, operators, and composite operations.
    7. 📊 **Reports and Documents:** Paragraphs, sections, and entire documents can be treated uniformly, where sections can contain paragraphs or other sections.
    8. 🏢 **Organization Charts:** Employees, teams, and departments organized in a hierarchical tree structure.
    9. 📚 **Book Collections:** Books, chapters, and sections treated uniformly in libraries or cataloging systems.
    10. 🚗 **Vehicle Hierarchies:** Parts of a car, such as engine, wheels, and components, treated in a uniform way.
## 🌟 Structure

```plaintext
+-------------------------+
|        Component        |
+-------------------------+
               ^
               |
    +---------------------+
    |   Leaf (End Node)   |
    +---------------------+
               ^
               |
    +---------------------+
    |    Composite        |
    | (Holds Components)  |
    +---------------------+
               |
               v
        +-------------+
        |   Children   |
        +-------------+