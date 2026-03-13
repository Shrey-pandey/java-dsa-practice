# Minimum Element in Rotated Sorted Array

## Problem
Find the **minimum element** in a **sorted array that has been rotated at some pivot**.

Example:
```
Input:  [4,5,6,7,0,1,2]
Output: 0
```

---

## Key Idea
A rotated sorted array has **two sorted halves**, and the **minimum element is the pivot point**.

Use **Binary Search** to locate the pivot efficiently.

Observation:
- If `arr[mid] > arr[end]` → minimum lies in the **right half**
- Otherwise → minimum lies in the **left half**

---

## Complexity

**Time Complexity:** `O(log n)`  
**Space Complexity:** `O(log n)` (recursive approach)

---

## Concepts Used
- Binary Search
- Rotated Sorted Arrays
- Divide and Conquer