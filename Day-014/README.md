<div align="center">

# 📅 Day 014 – Strings in Java

### Understanding Text Handling & Immutability

<img src="https://img.shields.io/badge/Java-Strings-red?style=for-the-badge&logo=java" />
<img src="https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-String%20Operations-green?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Covered](#-concepts-covered)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Core String Operations](#-core-string-operations)
- [⚙️ String Immutability](#️-string-immutability)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation](#-interview-preparation)
- [🔗 Code Snippet](#-code-snippet)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 014** was to understand how Java handles text using the **String class** and to practice the most commonly used string operations.

Focus areas:

- Creating strings
- String methods
- String comparison
- Immutability concept
- Performance difference between `String` and `StringBuilder` (intro)

---

## 🧠 Concepts Covered

### 📌 What is a String?

A **String** in Java is an object that represents a sequence of characters.

```java
String name = "Krushna";
```

---

### 📌 Ways to Create Strings

```java
String s1 = "Java";
String s2 = new String("Java");
```

---

### 📌 Important String Methods

- `length()`
- `charAt()`
- `substring()`
- `equals()`
- `equalsIgnoreCase()`
- `toUpperCase()`
- `toLowerCase()`
- `trim()`
- `contains()`
- `replace()`

---

## 🛠️ What I Practiced

✔ Creating and printing strings  
✔ Taking string input from user  
✔ Finding length of string  
✔ Accessing characters  
✔ Comparing two strings  
✔ Extracting substring  
✔ Converting case

---

## 📁 Folder Structure

```
Day-014/
 ├── README.md
 ├── StringBasics.java
 └── notes.md
```

---

## 🧩 Core String Operations

### ✅ String Length

```java
str.length();
```

### ✅ Character at Index

```java
str.charAt(0);
```

### ✅ String Comparison

```java
str1.equals(str2);
```

### ❗ Why not use `==`?

`==` compares memory reference  
`equals()` compares actual content

---

## ⚙️ String Immutability

Strings in Java are **immutable**.

That means once created, they cannot be changed.

```java
String s = "Java";
s.concat(" World");
```

This creates a **new object**, it does not modify the original.

---

## 📝 Notes & Observations

- Strings are objects, not primitive types
- Stored in String Constant Pool for memory optimization
- `equals()` must be used for content comparison
- Immutability improves security and performance
- String methods return new strings

---

## 💡 Key Takeaways

✔ String is immutable  
✔ Always use `equals()` for comparison  
✔ String pool saves memory  
✔ Most used class in Java  
✔ Strong interview topic

---

## 🎯 Interview Preparation

### 🔹 Q1. Why is String immutable in Java?

For security, caching, synchronization, and performance.

---

### 🔹 Q2. Difference between `==` and `equals()`?

`==` → compares references  
`equals()` → compares values

---

### 🔹 Q3. What is String Constant Pool?

A special memory area where Java stores string literals to optimize memory usage.

---

### 🔹 Q4. How many objects are created?

```java
String s = "Java";
```

Only one object in SCP.

---

### 🔹 Q5. Why is String widely used?

Because it is immutable and secure.

---

## 🔗 Code Snippet

📌 Java Implementation:  
➡️ **[View StringBasics.java](./StringBasics.java)**

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 015 – StringBuilder & StringBuffer

- Mutable strings
- Performance improvement
- When to use StringBuilder
- Real-world use cases

</div>

---

<div align="center">

## ✅ Day 014 Completed

Explored one of the most used classes in Java  
and built a strong foundation for  
real-world text processing & DSA problems. 🚀

</div>
