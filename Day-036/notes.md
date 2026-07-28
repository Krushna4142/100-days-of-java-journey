# 🧠 Day 036 – HashMap Basics

## 📌 Introduction

`HashMap` is a class in the **Java Collections Framework** that implements the **Map interface**.

Unlike List and Set, a HashMap stores data in **key-value pairs**.

Package:

```java
java.util.HashMap
```

---

# 🔹 Why HashMap?

HashMap is useful when data needs to be accessed quickly using a unique key.

Examples:

- Student Roll Number → Student Name
- Employee ID → Employee Details
- Product ID → Product Information
- Username → User Profile

---

# 🔹 Creating a HashMap

```java
HashMap<Integer, String> students = new HashMap<>();
```

Here,

- Integer → Key
- String → Value

---

# 🔹 Common Methods

## put()

Adds a key-value pair.

```java
students.put(101, "Krushna");
```

---

## get()

Returns the value associated with a key.

```java
students.get(101);
```

---

## remove()

Deletes a key-value pair.

```java
students.remove(101);
```

---

## containsKey()

Checks whether a key exists.

```java
students.containsKey(101);
```

Returns:

- true
- false

---

## containsValue()

Checks whether a value exists.

```java
students.containsValue("Krushna");
```

---

## size()

Returns the total number of entries.

```java
students.size();
```

---

## clear()

Removes all entries.

```java
students.clear();
```

---

## isEmpty()

Checks whether the map is empty.

```java
students.isEmpty();
```

---

# 🔹 Iterating Through HashMap

Using `entrySet()`:

```java
for (Map.Entry<Integer, String> entry : students.entrySet()) {

    System.out.println(entry.getKey());
    System.out.println(entry.getValue());

}
```

---

# 🔹 Characteristics of HashMap

- Stores data as key-value pairs
- Keys must be unique
- Duplicate values are allowed
- Does not maintain insertion order
- Allows one null key
- Allows multiple null values
- Fast insertion and searching

---

# 🔹 HashMap vs HashSet

| Feature          | HashMap                            | HashSet        |
| ---------------- | ---------------------------------- | -------------- |
| Stores           | Key-Value Pair                     | Only Values    |
| Duplicate Keys   | Not Allowed                        | Not Applicable |
| Duplicate Values | Allowed                            | Not Allowed    |
| Ordering         | Not Guaranteed                     | Not Guaranteed |
| Null             | One null key, multiple null values | One null value |

---

# 🔹 Internal Working

HashMap internally uses a hashing mechanism.

Whenever a key is inserted:

1. Java calculates its hash code.
2. The hash determines where the entry is stored.
3. The value is associated with the corresponding key.

This makes searching very efficient.

---

# 🔹 Advantages

- Fast retrieval using keys
- Efficient insertion
- Dynamic size
- Widely used in Java applications

---

# 🔹 Limitations

- No guaranteed ordering
- Cannot have duplicate keys
- Slightly higher memory usage than arrays

---

# 🔹 Real-World Applications

HashMap is commonly used in:

- Banking systems
- Student Management Systems
- Employee Management
- Login systems
- Product Catalogs
- Caching
- Configuration storage

---

# 🔹 Interview Tips

Frequently asked questions:

- Difference between HashMap and HashSet
- Difference between HashMap and TreeMap
- Why are duplicate keys not allowed?
- Can HashMap store null?
- What is the time complexity of put() and get()?

---

# 🚀 Learning Outcome

After completing this topic, I can:

✔ Create a HashMap

✔ Store data using key-value pairs

✔ Add, update, delete and retrieve entries

✔ Iterate through a HashMap

✔ Understand when HashMap should be used

✔ Compare HashMap with other collection classes

This topic builds a strong foundation for learning **TreeMap**, **LinkedHashMap**, and advanced Map collections.
