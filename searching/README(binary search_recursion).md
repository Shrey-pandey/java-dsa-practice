Recursive Binary Search in Java

How it works

1. Find the middle element of the array.
2. If the middle element is equal to the target → return its index.
3. If the target is smaller, search in the left half.
4. If the target is greater, search in the right half.
5. Continue this process until the element is found or the search range becomes empty.

Time Complexity

- Best Case: O(1)
- Worst Case: O(log n)

Language Java

Note

Binary Search only works on a sorted array.

---

This program is part of my DSA practice while learning Java.