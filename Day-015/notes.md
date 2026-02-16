# 📅 Day 015 – StringBuilder vs StringBuffer

---

## 🧠 1. Problem with String

String is immutable.

Every time we modify a string:

String s = "Java";
s = s + " World";

A new object is created.

This causes:

❌ Extra memory usage  
❌ Slow performance

---

## ⚙️ 2. What is StringBuilder?

StringBuilder is a mutable sequence of characters.

It means:

✔ No new object is created on modification  
✔ Changes happen in the same object  
✔ Fast and memory efficient

Introduced in Java 1.5

---

## ⚙️ 3. What is StringBuffer?

StringBuffer is also a mutable sequence of characters.

But:

✔ Thread-safe  
✔ Synchronized  
✔ Slower than StringBuilder

Introduced in Java 1.0

---

## 🆚 4. String vs StringBuilder vs StringBuffer

| Feature          | String  | StringBuilder | StringBuffer |
| ---------------- | ------- | ------------- | ------------ |
| Mutable          | ❌ No   | ✅ Yes        | ✅ Yes       |
| Thread Safe      | ❌ No   | ❌ No         | ✅ Yes       |
| Performance      | 🐢 Slow | 🚀 Fast       | ⚖️ Medium    |
| Memory Efficient | ❌ No   | ✅ Yes        | ✅ Yes       |

---

## 🔑 5. Important Methods

### append()

Adds text at the end.

sb.append("Java");

---

### insert(index, value)

Inserts at specific position.

sb.insert(5, " World");

---

### replace(start, end, value)

Replaces characters.

---

### delete(start, end)

Removes characters.

---

### reverse()

Reverses the string.

---

### toString()

Converts into String.

---

## 📊 6. Performance Advantage

StringBuilder is faster because:

✔ No new object creation  
✔ No synchronization  
✔ Same memory is reused

---

## 🎯 7. When to Use What?

Use String when:

✔ Data is fixed  
✔ No frequent modification

Use StringBuilder when:

✔ Frequent modifications  
✔ Single-threaded environment  
✔ High performance required

Use StringBuffer when:

✔ Multi-threaded environment  
✔ Thread safety required

---

## ⚠️ 8. Common Mistakes

❌ Using String in loops for concatenation  
❌ Using StringBuffer in single-threaded program  
❌ Forgetting to convert using toString()

---

## 🧩 9. Real-World Use Cases

✔ Building dynamic SQL queries  
✔ Reading large text files  
✔ String manipulation in loops  
✔ Logging systems

---

## 🎓 10. Interview Focus

⭐ Difference between String, StringBuilder, StringBuffer  
⭐ Why StringBuilder is faster?  
⭐ What is synchronization?  
⭐ Is StringBuilder thread-safe?  
⭐ Performance comparison

---

## 📌 Day 015 Summary

Today I learned:

✔ Mutable vs immutable strings  
✔ Why StringBuilder is fast  
✔ Thread safety in StringBuffer  
✔ Performance optimization in Java

This is heavily used in:

- Backend development
- Competitive programming
- High-performance applications
