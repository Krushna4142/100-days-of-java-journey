<div align="center">

# 📅 Day 015 – StringBuilder vs StringBuffer

### Mutable Strings & Performance Optimization

<img src="https://img.shields.io/badge/Java-StringBuilder%20%7C%20StringBuffer-red?style=for-the-badge&logo=java" />
<img src="https://img.shields.io/badge/Level-Intermediate-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Performance%20%26%20Mutability-green?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Covered](#-concepts-covered)
- [⚡ Why Not String for Modifications?](#-why-not-string-for-modifications)
- [🆚 StringBuilder vs StringBuffer](#-stringbuilder-vs-stringbuffer)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Core Methods Used](#-core-methods-used)
- [📊 Performance Insight](#-performance-insight)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation](#-interview-preparation)
- [🔗 Code Snippet](#-code-snippet)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 015** was to understand:

- Why `String` is slow for frequent modifications
- What mutable strings are
- How `StringBuilder` improves performance
- Difference between `StringBuilder` and `StringBuffer`

---

## 🧠 Concepts Covered

### 📌 Mutable vs Immutable

| Type          | Mutable? |
| ------------- | -------- |
| String        | ❌ No    |
| StringBuilder | ✅ Yes   |
| StringBuffer  | ✅ Yes   |

---

### 📌 What is StringBuilder?

A mutable sequence of characters.

Used when:

✔ Frequent modifications  
✔ No multi-threading required  
✔ High performance needed

---

### 📌 What is StringBuffer?

Same as StringBuilder but:

✔ Thread-safe  
✔ Synchronized  
✔ Slower than StringBuilder

---

## ⚡ Why Not String for Modifications?

Example:

```java
String s = "Java";
s = s + " World";
```

Each modification:

❌ Creates new object  
❌ Wastes memory  
❌ Slower performance

---

## 🆚 StringBuilder vs StringBuffer

| Feature       | StringBuilder | StringBuffer |
| ------------- | ------------- | ------------ |
| Mutable       | ✅ Yes        | ✅ Yes       |
| Thread Safe   | ❌ No         | ✅ Yes       |
| Performance   | 🚀 Fast       | 🐢 Slower    |
| Introduced In | Java 1.5      | Java 1.0     |

---

## 🛠️ What I Practiced

✔ Creating StringBuilder & StringBuffer  
✔ append()  
✔ insert()  
✔ replace()  
✔ delete()  
✔ reverse()  
✔ Converting to String

---

## 📁 Folder Structure

```
Day-015/
 ├── README.md
 ├── StringBuilderDemo.java
 └── notes.md
```

---

## 🧩 Core Methods Used

### append()

Adds text at the end.

```java
sb.append("World");
```

---

### insert()

Adds text at specific index.

```java
sb.insert(5, " Java");
```

---

### replace()

Replaces characters.

---

### delete()

Removes part of string.

---

### reverse()

Reverses the string.

---

## 📊 Performance Insight

For multiple modifications:

StringBuilder is much faster than String.

Because:

✔ No new object creation  
✔ Works on same object

---

## 📝 Notes & Observations

- StringBuilder is most used in real-world apps
- StringBuffer is used in multi-threaded environments
- Both are mutable
- toString() converts them into String

---

## 💡 Key Takeaways

✔ Use String for fixed data  
✔ Use StringBuilder for modifications  
✔ Use StringBuffer for thread safety  
✔ Mutable strings improve performance

---

## 🎯 Interview Preparation

### 🔹 Q1. Difference between String and StringBuilder?

String → Immutable  
StringBuilder → Mutable & faster

---

### 🔹 Q2. Difference between StringBuilder and StringBuffer?

StringBuilder → Not synchronized → Fast  
StringBuffer → Synchronized → Thread-safe

---

### 🔹 Q3. Why is StringBuilder faster?

Because it is not thread-safe and avoids synchronization overhead.

---

### 🔹 Q4. Is StringBuilder thread-safe?

No.

---

### 🔹 Q5. How to convert StringBuilder to String?

```java
sb.toString();
```

---

## 🔗 Code Snippet

📌 Java Implementation:  
➡️ **[View StringBuilderDemo.java](./StringBuilderDemo.java)**

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 016 – Arrays in Java

- Array fundamentals
- Memory representation
- Input & traversal
- Common array problems

</div>

---

<div align="center">

## ✅ Day 015 Completed

Learned how to write  
memory-efficient & high-performance string operations  
used in real-world Java applications. 🚀

</div>
