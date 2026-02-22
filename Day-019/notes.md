# 🧠 Day 019 – Time & Space Complexity – Notes

---

## ⏱️ What is Time Complexity?

Time Complexity measures how the running time of an algorithm grows with input size.

It is represented using **Big-O notation**.

### Common Time Complexities:

| Complexity | Name         | Example                    |
| ---------- | ------------ | -------------------------- |
| O(1)       | Constant     | Accessing array element    |
| O(log n)   | Logarithmic  | Binary Search              |
| O(n)       | Linear       | Traversing an array        |
| O(n log n) | Linearithmic | Merge Sort, Quick Sort     |
| O(n²)      | Quadratic    | Nested loops (Bubble Sort) |

---

## 📦 What is Space Complexity?

Space Complexity measures how much extra memory an algorithm uses.

### Types:

1. **Input Space** → Memory used by input
2. **Auxiliary Space** → Extra memory used by algorithm

---

## 🎯 Why Complexity Matters?

- Helps in choosing the most efficient algorithm
- Improves performance for large inputs
- Important for technical interviews

---

## 🧮 Time Complexity Rules

### 1️⃣ Drop constants

O(2n) → O(n)

### 2️⃣ Remove lower order terms

O(n² + n) → O(n²)

### 3️⃣ Different inputs → different variables

O(n + m)

---

## 🔁 Loop Time Complexity

### Single loop

```java
for(int i = 0; i < n; i++)

➡ O(n)

Nested loop
for(int i = 0; i < n; i++)
  for(int j = 0; j < n; j++)

➡ O(n²)

🔍 Binary Search Complexity

Each step halves the input.

➡ O(log n)

🧠 Space Complexity Examples
Constant space
int sum = 0;

➡ O(1)

Linear space
int[] arr = new int[n];

➡ O(n)

🆚 Time vs Space Trade-off

Sometimes:

More memory → Faster execution

Less memory → Slower execution

🚀 Interview Tips

✅ Always talk about worst-case → Big-O
✅ Mention time + space together
✅ Use examples while explaining

🏁 Summary

Time Complexity → Speed

Space Complexity → Memory

Big-O → Growth with input size
```
