# 🔍 Kadane’s Algorithm

- **🔎 Introduction**
    - **Kadane’s Algorithm** is an efficient algorithm for finding the **maximum sum subarray** in an array of numbers. The algorithm works by iterating through the array while keeping track of two values:
        1. The maximum sum subarray that ends at the current element.
        2. The global maximum sum subarray found so far.
    - Kadane's Algorithm is widely used in solving problems related to subarrays and is highly efficient with a time complexity of **O(n)**.

- **❓ What is Kadane’s Algorithm?**
    - **Kadane’s Algorithm** is used to find the contiguous subarray (containing at least one number) which has the largest sum. It solves the problem efficiently by processing the array in a single pass.
    - The idea is to maintain two values during the iteration:
        - **current_max**: The maximum sum subarray that ends at the current position.
        - **global_max**: The largest sum found so far in the entire array.

- **🤔 Why use Kadane’s Algorithm?**
    - 🧩 **Optimal Solution**: Kadane’s algorithm provides the optimal solution to the maximum subarray sum problem in linear time.
    - ⚡ **Efficiency**: Kadane's algorithm avoids the need for nested loops, making it much faster than brute force approaches, which have a time complexity of **O(n²)**.
    - 🧠 **Versatility**: It can be applied to both positive and negative integers, making it suitable for a wide range of use cases.

- **⏰ When to use Kadane’s Algorithm?**
    - When you need to find the **maximum sum contiguous subarray** in an array of numbers.
    - In **dynamic programming** problems where the goal is to find the best substructure that can be broken down into smaller subproblems.
    - When dealing with **optimization problems** involving summing contiguous values.

- **📍 Where to apply Kadane’s Algorithm?**
    - 🖥️ **Maximum Subarray Problem**: Commonly used in problems that require finding the contiguous subarray with the maximum sum.
    - 📈 **Stock Market Problems**: To find the maximum profit by buying and selling stocks at optimal times.
    - 🚗 **Pathfinding and Route Optimization**: In scenarios where you need to find the maximum value path (e.g., finding the best path in a matrix with values).

- **⚙️ How does Kadane’s Algorithm work?**
    1. Initialize two variables:
        - **current_max**: Start with the first element of the array.
        - **global_max**: Also start with the first element of the array.
    2. Iterate through the array from the second element:
        - Update **current_max**: It will either be the current element alone or the current element added to the previous **current_max**, whichever is larger.
        - Update **global_max**: It will be the maximum of **global_max** and **current_max**.
    3. The final value of **global_max** will be the largest sum of the contiguous subarray.

- **👥 Who should use Kadane’s Algorithm?**
    - 🧑‍💻 Developers working on **dynamic programming** problems or **optimization problems**.
    - 📚 Researchers working on algorithms that involve finding sums or optimal substructures.
    - 💼 Professionals in fields like **finance** (for stock market analysis) or **logistics** (for route optimization).

- **✅ Advantages**
    - 🚀 **Optimal Time Complexity**: Kadane’s algorithm runs in **O(n)** time, which is optimal for this problem.
    - ⚡ **Space Efficient**: Only requires **O(1)** extra space, making it memory efficient.
    - 🧠 **Easy to Understand and Implement**: The algorithm is straightforward and intuitive to implement.

- **❌ Disadvantages**
    - ⚠️ **Limited Scope**: Kadane’s algorithm is designed for **maximum sum subarray** problems and cannot be directly used for other types of problems.
    - 🧩 **Assumes non-empty array**: It assumes that the array contains at least one element. Handling edge cases (empty arrays, arrays with only negative numbers) needs to be managed separately.

- **🌍 Real-World Examples**
    1. 📈 **Stock Profit Problem**: Finding the maximum profit you can make by buying and selling a stock at different days.
    2. 🧳 **Traveling Salesman (Subpath Optimization)**: Optimizing a path through cities to maximize profit or minimize cost.
    3. 🏃‍♂️ **Game Scoring**: In games where players accumulate scores, Kadane’s algorithm can find the best performance streak.
    4. 🖥️ **Signal Processing**: Finding the best signal or subarray in a dataset with varying values.

## 🌟 Kadane’s Algorithm Structure

```plaintext
+----------------------------+         +----------------------------+
|   Kadane’s Algorithm        |         |   Step 1: Initialize       |
|   (Maximum Sum Subarray)    |         |   current_max and global_max |
+----------------------------+         +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Iterate through array     |      |   Step 2: Update current_max|
       |   and calculate subarray sum|      |   by comparing element or |
       |   at each position          |      |   previous sum.            |
       +----------------------------+      +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Update global_max         |      |   Step 3: Final value of   |
       |   with maximum subarray sum |      |   global_max is the result.|
       +----------------------------+      +----------------------------+
