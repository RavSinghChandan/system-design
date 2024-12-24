# 🔍 Hashing

- **🔎 Introduction**
    - **Hashing** is a technique used to uniquely identify data items in a collection, such as a hash table or hash map.
    - It uses a hash function to convert data into a fixed-size value (hash value), which helps in efficiently storing and retrieving data.

- **❓ What is Hashing?**
    - **Hashing** involves using a function (hash function) to map data to a specific index in a table, which allows for efficient data retrieval.
    - It typically involves two main parts:
        1. **Hash function**: Converts input data into a fixed-size hash value.
        2. **Collision resolution**: Handles cases where two different inputs map to the same index.

- **🤔 Why use Hashing?**
    - 🧩 Helps in fast data retrieval and insertion with constant time complexity (on average).
    - ⚡ Improves performance by avoiding unnecessary comparisons.
    - 🧠 Useful in implementing data structures like hash maps, hash sets, and caches.

- **⏰ When to use Hashing?**
    - When you need fast search, insertion, and deletion operations.
    - When the data is large, and you need to avoid searching through the entire dataset.
    - Common in **database indexing**, **cache systems**, and **password storage**.

- **📍 Where to apply Hashing?**
    - 📂 **Data Structures**: Hash maps, hash sets, and hash tables.
    - 🔒 **Security**: Password hashing, cryptography, and digital signatures.
    - 🧳 **Caching**: Storing frequently accessed data for faster retrieval.
    - 🗄️ **Database Indexing**: Quickly locating data in a database.

- **⚙️ How does Hashing work?**
    1. 🧩 **Hash function**: A hash function computes a hash value for the input data.
    2. 🔄 **Handling collisions**: If two inputs produce the same hash value, a collision resolution method is used (like chaining or open addressing).
    3. 🔗 **Final solution**: The data is stored at the hash value's index in the hash table.

- **👥 Who should use Hashing?**
    - 🧑‍💻 Developers working on large datasets and need fast access to elements.
    - 📚 Researchers working on optimization problems and improving search times.
    - 💼 Professionals in data analysis, cryptography, and database management.

- **✅ Advantages**
    - 🚀 Fast data retrieval and insertion with average O(1) time complexity.
    - ⚡ Efficient space utilization compared to other data structures.
    - 🧠 Simple to implement and use in a variety of applications.

- **❌ Disadvantages**
    - ⚠️ Poor hash function design can lead to many collisions.
    - 🧩 Collisions can degrade performance, requiring additional techniques like chaining or open addressing.
    - 🕒 Hashing requires extra memory for storing the hash table.

- **🌍 Real-World Examples**
    1. 🗃️ **Hash Maps**: Storing key-value pairs for fast access.
    2. 🔒 **Password Hashing**: Storing passwords securely using hash functions.
    3. 💾 **Database Indexing**: Efficiently retrieving records from a database.
    4. 💻 **Caches**: Storing frequently accessed data for fast retrieval.
    5. 🧩 **Content Addressable Storage**: Storing and retrieving files based on their hash value.

## 🌟 Structure

```plaintext
+----------------------------+         +----------------------------+
|      Hash Function          |         |      Step 1: Apply a       |
|      (Map data to index)    |         |      hash function to      |
|                              |         |      the input data        |
+----------------------------+         +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Collision Resolution     |      |    Step 2: Handle collisions|
       |   (Chaining/Open Addressing)|      |    (Apply collision        |
       +----------------------------+      |    resolution method)      |
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Store in Hash Table       |      |    Step 3: Store the data  |
       |   (Final Solution)          |      |    in the table at index   |
       +----------------------------+      |    from the hash function  |
               |                                      |
               v                                      v
       +----------------------------+
       |    Final Solution          |
       +----------------------------+
