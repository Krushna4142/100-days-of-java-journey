# 🧠 Day 018 – Sorting Algorithms (Bubble Sort & Selection Sort)

---

## 📌 What is Sorting?

Sorting is the process of arranging data in a particular order.

Most common orders:

- Ascending
- Descending

Sorting improves:

- Searching efficiency
- Data readability
- Algorithm performance

---

# 🔵 Bubble Sort

## ✔ Concept

Repeatedly compare adjacent elements and swap if they are in the wrong order.

After each pass:
Largest element moves to the end.

## ✔ Working

Pass 1 → largest element at last  
Pass 2 → second largest at second last

## ✔ Optimization

If no swaps occur in a pass → array is already sorted → stop early.

## ✔ Time Complexity

Best Case → O(n) (optimized version)  
Worst Case → O(n²)

## ✔ Stability

Stable sort (maintains relative order)

---

# 🟢 Selection Sort

## ✔ Concept

Select the minimum element and place it at the correct position.

## ✔ Working

Step 1 → find smallest → swap with first  
Step 2 → find next smallest → swap with second

## ✔ Time Complexity

Best Case → O(n²)  
Worst Case → O(n²)

## ✔ Swaps

Fewer swaps compared to Bubble Sort.

## ✔ Stability

Not stable (by default)

---

# 🔄 Bubble vs Selection

Bubble Sort:

- More swaps
- Can be optimized
- Stable

Selection Sort:

- Fewer swaps
- No best-case improvement
- Not stable

---

# ❗ Common Mistakes

❌ Wrong loop boundaries  
❌ Forgetting swap logic  
❌ Not reducing inner loop range in Bubble Sort  
❌ Confusing min index in Selection Sort

---

# 💡 Where Sorting is Used

- Searching algorithms
- Databases
- Leaderboards
- E-commerce price filters
- Data analysis

---

# 🏁 Summary

- Sorting is a core DSA concept
- Bubble sort teaches swapping
- Selection sort teaches selection logic
- Time complexity is important for interviews
