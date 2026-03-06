Binary Search

Steps

1. Set "beg = 0" and "end = n - 1".
2. Find the middle index: "mid = beg + (end - beg) / 2".
3. If "arr[mid] == key", element is found.
4. If "key < arr[mid]", search the left half.
5. If "key > arr[mid]", search the right half.
6. Repeat until the element is found or "beg > end".

Time Complexity

- Best Case: O(1)
- Worst Case: O(log n)

Note

Binary Search works only on sorted arrays.