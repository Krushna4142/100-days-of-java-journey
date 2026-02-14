<div align="center">

# 📅 Day 013 – Recursion Basics in Java

### Understanding Function Calling Itself

<img src="https://img.shields.io/badge/Java-Recursion-orange?style=for-the-badge&logo=java" />
<img src="https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Concept-Problem%20Solving-green?style=for-the-badge" />

</div>

---

## 🧠 What is Recursion?

Recursion is a technique where a method calls itself.

Instead of using loops,
we solve a problem by breaking it into smaller subproblems.

A recursive method must have:

1️⃣ Base Case (Stopping condition)  
2️⃣ Recursive Call (Calling itself)

---

## 🎯 Why Recursion?

✔ Breaks complex problems into smaller ones  
✔ Useful in tree & graph problems  
✔ Used in backtracking & divide-and-conquer  
✔ Important for coding interviews

---

## 🏗 Structure of a Recursive Method

```java
static returnType methodName(parameters) {

    // Base Case
    if(condition) {
        return value;
    }

    // Recursive Call
    return methodName(smallerInput);
}
```

---

## 🔎 Example 1 – Print Numbers from 1 to N

```java
static void printNumbers(int n) {

    if(n == 0) {
        return;
    }

    printNumbers(n - 1);
    System.out.println(n);
}
```

---

## 🔎 Example 2 – Factorial Using Recursion

```java
static int factorial(int n) {

    if(n == 0 || n == 1) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

---

## 🔎 Example 3 – Sum of First N Natural Numbers

```java
static int sum(int n) {

    if(n == 1) {
        return 1;
    }

    return n + sum(n - 1);
}
```

---

## ⚠ Important Rules of Recursion

✅ Must have a base case  
✅ Recursive call should move toward base case  
❌ Missing base case → StackOverflowError

---

## 🧩 How Recursion Works Internally?

Recursion uses:

Stack Memory

Each method call is stored in stack.
When base case is reached,
calls start returning one by one.

This is called the Call Stack.

---

## ⚡ Interview Important Points

⭐ Every recursive solution can be converted to iteration  
⭐ Recursion uses extra stack memory  
⭐ Understand dry run before coding  
⭐ Time & Space complexity analysis is important

---

## 📊 When to Use Recursion?

✔ Tree problems  
✔ Backtracking  
✔ Divide & Conquer  
✔ Mathematical problems  
✔ DFS (Depth First Search)

---

## 🚀 Developer Tips

✔ Always write base case first  
✔ Dry run on paper  
✔ Keep recursion small and clean  
✔ Avoid unnecessary recursive calls

---

<div align="center">

## ✅ Day 013 Completed

You now understand:

✔ What Recursion is  
✔ Structure of recursive methods  
✔ Base case importance  
✔ Stack memory concept

🔥 Recursion is foundation for advanced DSA topics.

</div>
