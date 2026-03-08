First Occurrence of an Element (Recursive Binary Search)

Description

This Java program finds the first occurrence of a given element in a sorted array using the recursive Binary Search technique.

How it Works

- The array is divided recursively using Binary Search.
- When the target element is found, the program checks whether:
    - it is at index "0", or
    - the previous element is different.
- If not, the search continues in the left half to locate the first occurrence.

Time Complexity

O(log n)

Space Complexity

O(log n) due to recursion stack.

Language Java