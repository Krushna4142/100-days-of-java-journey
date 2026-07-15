# 🧠 Day 034 – LinkedList in Java

## 📌 Introduction

`LinkedList` is a class in the **Java Collections Framework** that implements the **List** and **Deque** interfaces.

Unlike ArrayList, LinkedList stores elements as **nodes connected by references** instead of a continuous array.

Package:

```java
java.util.LinkedList
```

---

# 🔹 Internal Structure

Each node contains:

- Data
- Reference to the next node
- Reference to the previous node

This is called a **Doubly Linked List**.

```
NULL
 ↓
[Prev|Java|Next] ⇄ [Prev|Python|Next] ⇄ [Prev|C++|Next]
                                              ↓
                                             NULL
```

---

# 🔹 Creating a LinkedList

```java
LinkedList<String> list = new LinkedList<>();
```

---

#
