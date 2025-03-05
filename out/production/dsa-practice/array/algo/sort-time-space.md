# Sorting Algorithms: Time and Space Complexity

| Algorithm       | Time Complexity (Best) | Time Complexity (Average) | Time Complexity (Worst) | Space Complexity |
|-----------------|------------------------|---------------------------|-------------------------|------------------|
| **Bubble Sort**    | O(n)                  | O(n²)                    | O(n²)                  | O(1)             |
| **Selection Sort** | O(n²)                 | O(n²)                    | O(n²)                  | O(1)             |
| **Insertion Sort** | O(n)                  | O(n²)                    | O(n²)                  | O(1)             |
| **Merge Sort**     | O(n log n)            | O(n log n)               | O(n log n)             | O(n)             |
| **Quick Sort**     | O(n log n)            | O(n log n)               | O(n²)                  | O(log n)         |
| **Heap Sort**      | O(n log n)            | O(n log n)               | O(n log n)             | O(1)             |
| **Counting Sort**  | O(n + k)              | O(n + k)                 | O(n + k)               | O(k)             |
| **Radix Sort**     | O(nk)                 | O(nk)                    | O(nk)                  | O(n + k)         |

### Notes:
- **n**: Number of elements in the array.
- **k**: Range of input (for Counting Sort and Radix Sort).
- **O(1) space**: In-place sorting (no extra memory required except for a few variables).
- **O(n) space**: Requires additional memory proportional to the input size.
- **O(log n) space**: Recursive algorithms like Quick Sort use stack space for recursion.