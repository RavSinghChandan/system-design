
# 🔍 Greedy Algorithms

- **🔎 Introduction**
    - The **Greedy Algorithm** technique is a problem-solving method that makes the locally optimal choice at each step with the hope of finding a global optimum.
    - It is used when a problem can be solved by making a series of choices that seem best at the moment.

- **❓ What is Greedy Algorithm?**
    - A Greedy Algorithm follows a process where:
        1. **Choose**: Select the best possible option available at the current stage.
        2. **Solve**: Solve the problem by making the locally optimal choice.
        3. **Finalize**: Hope the local solutions will lead to the global solution.
    - This method works best for problems that exhibit the **greedy-choice property** and **optimal substructure**.

- **🤔 Why use Greedy Algorithms?**
    - 🧩 Helps in solving problems where a series of choices can lead to an optimal solution.
    - ⚡ Simple to implement and fast in execution.
    - 📈 Efficient for problems that don’t require backtracking or revisiting previous decisions.

- **⏰ When to use Greedy Algorithms?**
    - When the problem can be broken into stages where a greedy choice is optimal.
    - When previous decisions do not affect future decisions.
    - Common in **optimization problems** where the goal is to find the best possible solution.

- **📍 Where to apply Greedy Algorithms?**
    - 💸 **Optimization Problems**: Problems where the goal is to find the most efficient solution.
    - 💳 **Resource Allocation**: Problems like making change for money.
    - 🚶‍♀️ **Pathfinding**: Problems like shortest path in graphs.

- **⚙️ How does Greedy Algorithm work?**
    1. 🧩 **Choose** the best option available at each step.
    2. 🔄 **Solve** the problem by applying the greedy choice.
    3. 🔗 **Finalize** by ensuring that the greedy approach leads to a global optimal solution.

- **👥 Who should use Greedy Algorithms?**
    - 🧑‍💻 Developers solving optimization problems where local decisions lead to global solutions.
    - 📚 Researchers working on finding the most efficient solutions for real-world problems.
    - 💼 Professionals in resource management and financial applications.

- **✅ Advantages**
    - 🚀 Fast and efficient for many problems.
    - 🧠 Simple to understand and implement.
    - ⚡ Often provides optimal solutions for problems that exhibit the greedy-choice property.

- **❌ Disadvantages**
    - ⚠️ Doesn’t always guarantee an optimal solution for all problems.
    - 🕒 Limited to problems where local decisions lead to a global optimum.
    - 🔄 May require extensive testing to ensure it works for all problem scenarios.

- **🌍 Real-World Examples**
    1. 📝 **Activity Selection Problem**: Choosing the maximum number of activities that can be performed without overlapping.
    2. 💵 **Making Change Problem**: Finding the minimum number of coins needed to make change for a given amount of money.
    3. 🔗 **Huffman Coding**: Creating an optimal binary tree for data compression.
    4. 🌍 **Prim’s Algorithm**: Finding the minimum spanning tree in a weighted graph.
    5. 🛤️ **Dijkstra’s Algorithm**: Finding the shortest path in a graph from a single source.
    6. 🚶‍♂️ **Fractional Knapsack Problem**: Finding the maximum value that can be obtained with limited weight.
    7. 🔄 **Job Sequencing Problem**: Scheduling jobs with deadlines to maximize profit.
    8. 🏠 **Greedy Coloring**: Assigning the smallest number of colors to vertices of a graph such that no two adjacent vertices share the same color.
    9. 🛠️ **Load Balancing**: Distributing tasks to minimize the maximum load on any machine.
    10. 🚗 **Traveling Salesman Problem (Approximation)**: Finding a near-optimal route for visiting multiple cities.

## 🌟 Structure

```plaintext
+----------------------------+         +----------------------------+
|      Greedy Choice          |         |      Step 1: Make a choice  |
|      (Locally Optimal)      |         |      (Best choice at the    |
|                              |         |      current stage)         |
+----------------------------+         +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Subproblem 2             |      |    Subproblem N            |
       |   (Solve Greedily)         |      |    (Solve Greedily)        |
       +----------------------------+      +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Combine Results          |      |    Combine Results         |
       +----------------------------+      +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+
       |    Final Solution          |
       +----------------------------+
```

