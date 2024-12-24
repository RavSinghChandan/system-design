# 🔍 Dynamic Programming

- **🔎 Introduction**
    - **Dynamic Programming (DP)** is a method for solving complex problems by breaking them down into simpler subproblems. It is used when a problem has overlapping subproblems and optimal substructure.
    - DP solves each subproblem only once and stores the result, thus avoiding the work of recalculating the same problem multiple times.

- **❓ What is Dynamic Programming?**
    - Dynamic Programming is a technique for solving optimization problems by:
        1. **Breaking down** the problem into smaller, simpler subproblems.
        2. **Storing** the results of the subproblems to avoid redundant calculations.
        3. **Building** the final solution using the results of the subproblems.
    - It is particularly useful for problems with **overlapping subproblems** and **optimal substructure**.

- **🤔 Why use Dynamic Programming?**
    - 🧩 Helps in solving problems where subproblems overlap, leading to efficient solutions.
    - ⚡ Saves computation time by storing and reusing results of subproblems.
    - 📈 Effective for problems that require solving optimization tasks with multiple possible solutions.

- **⏰ When to use Dynamic Programming?**
    - When a problem can be broken into smaller overlapping subproblems.
    - When solving the same subproblem multiple times, making DP more efficient.
    - Common in **optimization problems** where the solution can be constructed by solving subproblems.

- **📍 Where to apply Dynamic Programming?**
    - 💡 **Optimization Problems**: Problems where the goal is to find the best possible solution.
    - 🔄 **Sequence Alignment**: Problems in bioinformatics, such as DNA sequence comparison.
    - 🧩 **Combinatorial Problems**: Problems involving choices, paths, or decisions in a set.

- **⚙️ How does Dynamic Programming work?**
    1. 🧩 **Break** the problem down into simpler subproblems.
    2. 💾 **Store** the results of each subproblem to avoid redundant work.
    3. 🔄 **Build** the final solution using stored subproblem results.

- **👥 Who should use Dynamic Programming?**
    - 🧑‍💻 Developers solving complex optimization problems that involve overlapping subproblems.
    - 📚 Researchers tackling problems in areas like bioinformatics, operations research, and economics.
    - 💼 Professionals in industries dealing with complex decision-making processes.

- **✅ Advantages**
    - 🚀 Optimizes time complexity by solving each subproblem once.
    - 🧠 Efficient for problems that involve overlapping subproblems.
    - ⚡ Can significantly reduce the complexity of problems compared to naive solutions.

- **❌ Disadvantages**
    - ⚠️ Requires extra memory to store subproblem solutions.
    - 🕒 Can be inefficient for problems that do not have overlapping subproblems.
    - 🔄 May require complex problem analysis to determine whether DP is applicable.

- **🌍 Real-World Examples**
    1. 🎮 **Fibonacci Sequence**: Calculating the nth Fibonacci number using memoization or tabulation.
    2. 💸 **Knapsack Problem**: Finding the maximum value that can be obtained with a limited weight capacity.
    3. 📦 **Coin Change Problem**: Finding the minimum number of coins needed to make change for a given amount of money.
    4. 📊 **Longest Common Subsequence**: Finding the longest subsequence present in two sequences.
    5. 🧩 **Matrix Chain Multiplication**: Finding the optimal order of matrix multiplication.
    6. 💼 **Job Scheduling Problem**: Scheduling jobs to maximize profit subject to deadlines.
    7. 🚶‍♀️ **Shortest Path Problem**: Finding the shortest path in a graph, such as in the Floyd-Warshall algorithm.
    8. 🧳 **Traveling Salesman Problem (Exact Solution)**: Finding the optimal route for visiting multiple cities.
    9. 🏋️‍♂️ **Longest Increasing Subsequence**: Finding the longest subsequence of a sequence in increasing order.
    10. 🏠 **House Robber Problem**: Maximizing the amount of money that can be robbed from non-adjacent houses.

## 🌟 Structure

```plaintext
+----------------------------+         +----------------------------+
|   Problem Definition        |         |   Step 1: Define subproblem|
|   (Define the original      |         |   (Break the problem into   |
|   problem)                  |         |   smaller subproblems)      |
+----------------------------+         +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Subproblem 1             |      |   Subproblem N             |
       |   (Solve and store result) |      |   (Solve and store result) |
       +----------------------------+      +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Combine Results          |      |   Combine Results          |
       +----------------------------+      +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+
       |    Final Solution          |
       +----------------------------+
