# 🧠 Day 017 – Searching Algorithms Notes

---

## 📌 What is Searching?

Searching is the process of finding the location of a target element in a collection of data.

---

## 🔍 Linear Search

### ✔ Definition

Sequentially checks every element until the target is found.

### ✔ Algorithm

1. Start from index 0
2. Compare each element with key
3. If found → return index
4. If end reached → element not found

### ✔ Time Complexity

Best Case → O(1)  
Worst Case → O(n)

---

## ⚡ Binary Search

### ✔ Condition

Array must be sorted.

### ✔ Algorithm

1. Find middle element
2. If key == mid → found
3. If key < mid → search left
4. If key > mid → search right
5. Repeat until found

### ✔ Time Complexity

Best Case → O(1)  
Worst Case → O(log n)

---

## 📊 Complexity Comparison

Linear Search → O(n)  
Binary Search → O(log n)

Binary search is much faster for large datasets.

---

## ❗ Common Mistakes

❌ Applying binary search on unsorted array  
❌ Wrong mid calculation  
❌ Infinite loop due to incorrect conditions

Correct mid formula:

mid = start + (end - start) / 2

---

## 💡 When to Use What?

Use Linear Search:

- Small dataset
- Unsorted array

Use Binary Search:

- Large dataset
- Sorted array

---

## 🏁 Summary

- Linear search is simple but slow
- Binary search is fast but needs sorting
- Searching is one of the most important interview topics
