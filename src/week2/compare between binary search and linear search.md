# Comparison Between Binary Search and Linear Search

## 1. Linear Search

**Description:**  
Linear search is a simple searching algorithm that checks each element of the array sequentially until the target element is found or the end of the array is reached.

- **Best Case:**  
  The best case occurs when the target element is the first element of the array.  
   *Time Complexity:* `O(1)`

- **Worst Case:**  
  The worst case happens when the target element is either not present or is the last element in the array.  
   *Time Complexity:* `O(n)`, where *n* is the size of the array.

- **Average Case:**  
  On average, the search would need to check about half of the elements in the array, as the target could be anywhere.  
   *Time Complexity:* `O(n)`

- **Space Complexity:**  
  `O(1)` – Linear search does not use any additional memory aside from the input array.

---

## 2. Binary Search

**Description:**  
Binary search is a more efficient algorithm than linear search, but it requires that the array be sorted. The algorithm repeatedly divides the search interval in half. If the value of the target element is less than the middle element, it searches the left half; otherwise, it searches the right half.

- **Best Case:**  
  The best case occurs when the target element is the middle element of the array.  
   *Time Complexity:* `O(1)`

- **Worst Case:**  
  The worst case occurs when the algorithm has to divide the array `log(n)` times until it finds the element or determines it's not present.  
   *Time Complexity:* `O(log n)`

- **Average Case:**  
  On average, the algorithm performs `log(n)` comparisons, as each step eliminates half of the search space.  
    *Time Complexity:* `O(log n)`

- **Space Complexity:**
    - **Iterative:** `O(1)`
    - **Recursive:** `O(log n)` (due to call stack)

---

## Summary Table

| Criteria             | Linear Search | Binary Search       |
|----------------------|----------------|----------------------|
| Requirement           | Unsorted array | Sorted array         |
| Best Case Time        | O(1)           | O(1)                 |
| Average Case Time     | O(n)           | O(log n)             |
| Worst Case Time       | O(n)           | O(log n)             |
| Space Complexity      | O(1)           | O(1) (Iterative), O(log n) (Recursive) |
