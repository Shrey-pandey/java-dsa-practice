Search in Rotated Sorted Array (Recursive Binary Search - Java)

This program searches for a target element in a rotated sorted array using a recursive binary search approach.

A rotated sorted array is a sorted array that has been rotated at some pivot point.

Example:
[4, 5, 6, 7, 0, 1, 2]

The program returns the index of the target element if it exists in the array, otherwise it returns -1.

---

Approach

The algorithm uses recursion with Binary Search.

At each step:

- Find the middle element.
- Check which half of the array is properly sorted.
- If the left half is sorted, verify whether the target lies in that range.
- Otherwise, search in the right half.
- The process repeats recursively until the element is found or the search space becomes invalid.

---

Time Complexity

O(log n)

Space Complexity

O(log n) (due to recursion stack)

---

Example

Input Array:
[4, 5, 6, 7, 0, 1, 2]

Target:
0

Output:
4

Explanation:
The element 0 is present at index 4.

---

Concepts Used

- Binary Search
- Recursion
- Rotated Sorted Array Logic
- Divide and Conquer