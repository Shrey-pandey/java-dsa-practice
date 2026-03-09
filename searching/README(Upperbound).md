Upper Bound using Binary Search (Java)

This program finds the Upper Bound of a target element in a sorted array using Binary Search.

The Upper Bound is defined as the index of the first element strictly greater than the target value.

If no such element exists in the array, the algorithm returns the array length, which represents the position where the element could be inserted while maintaining sorted order.

---

Approach

The algorithm applies Binary Search to efficiently narrow down the search space.

- If the middle element is less than or equal to the target, search in the right half.
- If the middle element is greater than the target, store the index and search in the left half to find the first such occurrence.

This ensures that the first element strictly greater than the target is found.

---

Time Complexity

O(log n)

Space Complexity

O(log n) (for recursive implementation)

---

Example

Input Array:
[1, 2, 4, 4, 5, 6]

Target:
4

Output:
4

Explanation:
The first element greater than 4 is 5, which is present at index 4.

---

Concepts Used

- Binary Search
- Recursion
- Searching in Sorted Arrays