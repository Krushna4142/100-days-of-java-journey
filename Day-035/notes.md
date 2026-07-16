# 🧠 Day 035 – HashSet in Java

## 📌 Introduction

`HashSet` is a class in the **Java Collections Framework** that implements the **Set interface**.

Its main purpose is to store **unique elements**.

Package:

```java
java.util.HashSet
```

---

# 🔹 Why HashSet?

Sometimes duplicate data should not be stored.

Examples:

- Email IDs
- Usernames
- Student Roll Numbers
- Product IDs

HashSet automatically removes duplicate values.

---

# 🔹 Creating a HashSet

```java
HashSet<String> languages = new HashSet<>();
```

---

# 🔹 Common Methods

## add()

Adds an element.

```java
languages.add("Java");
```

If the element already exists, it is ignored.

---

## remove()

Removes an element.

```java
languages.remove("Python");
```

---

## contains()

Checks whether an element exists.

```java
languages.contains("Java");
```

Returns:

- true
- false

---

## size()

Returns the number of unique elements.

```java
languages.size();
```

---

## clear()

Removes all elements.

```java
languages.clear();
```

---

## isEmpty()

Checks whether the HashSet is empty.

```java
languages.isEmpty();
```

---

# 🔹 Characteristics of HashSet

- Stores only unique values
- Does not maintain insertion order
- Allows one null value
- Very fast searching and insertion
- No indexing support

---

# 🔹 HashSet vs ArrayList

| Feature            | ArrayList  | HashSet        |
| ------------------ | ---------- | -------------- |
| Duplicates         | Allowed    | Not Allowed    |
| Order              | Maintained | Not Guaranteed |
| Indexing           | Yes        | No             |
| Search Performance | Slower     | Faster         |

---

# 🔹 Internal Working

HashSet internally uses a **HashMap**.

Whenever an element is added:

- Java calculates its hash value.
- The hash determines where the element is stored.
- Duplicate hash and equal objects are ignored.

---

# 🔹 Advantages

- Fast insertion
- Fast deletion
- Fast searching
- Prevents duplicate data automatically

---

# 🔹 Limitations

- No ordering
- No indexing
- Cannot access elements using position

---

# 🔹 Real-World Applications

HashSet is commonly used in:

- Login systems
- Unique usernames
- Email validation
- Duplicate detection
- Unique product codes

---

# 🔹 Interview Tips

Remember these questions:

- Difference between HashSet and ArrayList
- Why are duplicates not allowed?
- Does HashSet maintain insertion order?
- Can HashSet store null?

These are frequently asked Java interview questions.

---

# 🚀 Learning Outcome

After completing this topic, I can:

✔ Create a HashSet

✔ Store unique elements

✔ Perform add, remove and search operations

✔ Understand how duplicate prevention works

✔ Compare HashSet with List collections

This topic strengthens my understanding of **Set collections** and prepares me for learning **HashMap**.
