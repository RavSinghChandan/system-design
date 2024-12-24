# 🪟 Sliding Window Algorithm

## 🔎 Introduction

The Sliding Window Algorithm is a problem-solving method used to optimize computations on subarrays or substrings by maintaining a window of elements and sliding it across the data structure.

It is widely applied in problems involving arrays, strings, or sequences to improve efficiency by reducing redundant computations.

## ❓ What is Sliding Window Algorithm?

A Sliding Window Algorithm involves:

1. **Initialization**: Define a window and its boundaries.
2. **Expand/Contract**: Move the boundaries of the window to include or exclude elements.
3. **Compute**: Process the current window to derive results.
4. **Update**: Update variables or results as the window slides.

This method is ideal for scenarios where the solution depends on contiguous subarrays or substrings.

## 🤔 Why use Sliding Window Algorithm?

- 🧩 Optimizes problems involving subarrays or substrings.
- ⚡ Reduces computational overhead by avoiding recalculation.
- 📈 Improves time complexity, often reducing O(n^2) to O(n).

## ⏰ When to use Sliding Window Algorithm?

- When the problem involves contiguous subarrays or substrings.
- When the solution requires optimizing or summarizing properties within a window.
- Common in sum, max/min, or count problems.

## 📍 Where to apply Sliding Window Algorithm?

- 💾 **Data Processing**: Problems involving sequences of data.
- 🔑 **Pattern Matching**: String problems like finding substrings.
- 🛠️ **Optimization Problems**: Finding maximum or minimum values.

## ⚙️ How does Sliding Window Algorithm work?

1. 🧩 Initialize a window with a fixed size or a flexible range.
2. 🔄 Slide the window by moving one boundary at a time.
3. 📊 Compute the result using elements within the window.
4. 🔗 Update variables or results dynamically.

## 👥 Who should use Sliding Window Algorithm?

- 🧑‍💻 Developers solving problems involving arrays or strings.
- 📚 Researchers optimizing computations in data streams.
- 💼 Professionals in fields like finance, where rolling calculations are crucial.

## ✅ Advantages

- 🚀 Efficient for many problems.
- 🧠 Reduces space and time complexity.
- ⚡ Simplifies implementation for contiguous subarray problems.

## ❌ Disadvantages

- ⚠️ Limited to problems with specific conditions, like contiguity.
- 🕒 Requires careful handling of window boundaries.
- 🔄 May involve additional logic to handle edge cases.

## 🌍 Real-World Examples of Sliding Window Algorithm

1. **Maximum Sum Subarray**: Finding the maximum sum of a contiguous subarray of fixed size in an array.

2. **Longest Substring Without Repeating Characters**: Identifying the longest substring in a string with all unique characters.

3. **Count Occurrences of Anagrams**: Counting how many times an anagram of a given pattern appears in a string.

4. **Minimum Window Substring**: Finding the smallest substring in a string that contains all characters of a given set.

5. **Sliding Average**: Calculating the moving average of every `k`-sized window in a data stream.

6. **Longest Substring with At Most K Distinct Characters**: Finding the longest substring with at most `k` distinct characters.

7. **Maximum Number of Consecutive 1’s in a Binary Array**: Finding the maximum number of consecutive 1’s in a binary array, given that you can flip at most `k` zeroes to ones.

8. **Subarrays with Sum Equal to K**: Counting the number of subarrays in an array whose sum is equal to a given number `k`.

9. **Find All Anagrams in a String**: Identifying all start indices of anagrams of a given string in another string.

10. **Longest Palindromic Substring**: Finding the longest substring in a string that is a palindrome using the sliding window technique.

## 🌟 Structure

```plaintext
+----------------------------+         +----------------------------+
|       Sliding Window        |         |      Step 1: Initialize    |
|      (Maintain a Window)    |         |      (Define window size   |
|                              |         |      or range)             |
+----------------------------+         +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Expand Window             |      |    Contract Window         |
       |   (Increase window size     |      |    (Decrease window size)  |
       |    or move the end pointer) |      |    (Move start pointer)    |
       +----------------------------+      +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Compute Result            |      |    Update Results          |
       |   (Process current window   |      |    (Track maximum/minimum  |
       |    or calculate sum)        |      |     or other metrics)      |
       +----------------------------+      +----------------------------+
               |                                      |
               v                                      v
       +----------------------------+      +----------------------------+
       |   Slide Window              |      |    Final Solution          |
       |   (Move window across data  |      |    (Store or output result)|
       +----------------------------+      +----------------------------+
