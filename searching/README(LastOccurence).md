Last Occurrence of an Element (Recursive Binary Search)

Description

This Java program finds the last occurrence of a given element in a sorted array using a recursive Binary Search algorithm.

Approach

- The array is recursively divided using Binary Search.
- When the target element is found, the program checks whether:
    - it is at the last index, or
    - the next element is different.
- If not, the search continues in the right half of the array to locate the last occurrence.

Time Complexity

O(log n)

Space Complexity

O(log n) due to recursion stack.

Language

Java