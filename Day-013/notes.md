# 📅 Day 013 – Recursion Basics

---

## 🧠 1. What is Recursion?

Recursion is a technique where a method calls itself.

Instead of solving the entire problem at once,
we break it into smaller subproblems.

A recursive method must have:

1️⃣ Base Case (Stopping Condition)  
2️⃣ Recursive Call (Self call)

Without a base case → StackOverflowError

---

## 🏗 2. Basic Structure of Recursion

static returnType methodName(parameters) {

    // Base Case
    if(condition) {
        return value;
    }

    // Recursive Call
    return methodName(smallerInput);

}

---

## 🎯 3. Key Concepts

✔ Base Case → Stops recursion  
✔ Recursive Case → Moves toward base case  
✔ Call Stack → Stores each method call  
✔ Stack Memory → Used during recursion

---

## 🔎 4. Example 1 – Print Numbers from 1 to N

Logic:

- If n == 0 → stop
- Call function with n-1
- Print n

Flow:
print(3)
→ print(2)
→ print(1)
→ print(0) stop
← 1
← 2
← 3

---

## 🔎 5. Example 2 – Factorial

Factorial Formula:
n! = n × (n-1)!

Example:
5! = 5 × 4 × 3 × 2 × 1

Base Case:
factorial(0) = 1

Recursive Case:
n \* factorial(n - 1)

---

## 🔎 6. Example 3 – Sum of First N Natural Numbers

Formula:
sum(n) = n + sum(n-1)

Base Case:
sum(1) = 1

---

## ⚠ 7. Common Mistakes

❌ Missing base case  
❌ Infinite recursion  
❌ Not reducing problem size  
❌ Large input causing stack overflow

---

## ⚡ 8. Recursion vs Iteration

Recursion:

- Uses stack memory
- Cleaner for tree problems
- Easier to write for divide-and-conquer

Iteration:

- Uses loops
- More memory efficient
- Faster in some cases

---

## 📊 9. Time & Space Complexity

Time Complexity:
Depends on number of recursive calls

Space Complexity:
Depends on recursion depth (stack usage)

Example:
factorial(n)
Time → O(n)
Space → O(n)

---

## 🚀 10. Where Recursion is Used?

✔ Tree Traversal  
✔ Graph DFS  
✔ Backtracking  
✔ Divide & Conquer  
✔ Dynamic Programming

---

## 🎓 Interview Focus

⭐ Always write base case first  
⭐ Dry run call stack  
⭐ Understand recursion tree  
⭐ Convert recursion to iteration if asked

---

## 📌 Day 013 Summary

Today you learned:

✔ What recursion is  
✔ How recursive calls work  
✔ Importance of base case  
✔ Stack memory behavior

Recursion is foundation for advanced DSA topics.
