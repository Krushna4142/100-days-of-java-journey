# 🧠 Day 016 – 2D Arrays Notes

---

## 📌 What is a 2D Array?

A 2D array is an array of arrays.

It is used to store data in the form of rows and columns (matrix format).

Syntax:

datatype[][] arrayName = new datatype[rows][columns];

Example:

int[][] matrix = new int[3][3];

---

## 🧱 Memory Representation

A 2D array is stored as:

➡ Array of 1D arrays

matrix[0] → first row  
matrix[1] → second row

Each row is a separate array.

---

## 🔄 Traversal of 2D Array

We use nested loops:

for rows → outer loop  
for columns → inner loop

Example:

for(int i = 0; i < rows; i++) {
for(int j = 0; j < columns; j++) {
print(matrix[i][j]);
}
}

---

## 📥 Taking Input in 2D Array

We take input using nested loops:

matrix[i][j] = sc.nextInt();

---

## ➕ Matrix Addition Logic

Condition:

Both matrices must have same size.

result[i][j] = a[i][j] + b[i][j]

---

## 📊 Row Sum Logic

Fix the row  
Move across columns

for each row:
sum all columns

---

## 📊 Column Sum Logic

Fix the column  
Move across rows

for each column:
sum all rows

---

## ❗ Common Mistakes

❌ Confusing row size with column size  
❌ Using wrong loop boundaries  
❌ Forgetting nested loops  
❌ Bad output formatting

---

## 💡 Interview Points

✔ 2D array is an array of arrays  
✔ Access using arr[i][j]  
✔ Time complexity of traversal → O(n × m)  
✔ Used in matrix, graphs, dynamic programming

---

## 🏁 Summary

- 2D arrays store tabular data
- Nested loops are mandatory
- Row & column logic is important
- Base for advanced DSA problems
