# 🧠 Day 037 – HashMap with Custom Objects

## 📌 What I Learned

Today I learned that a `HashMap` can store objects created from our own classes.

Until now, I was mainly using simple data types like `String` and `Integer`.

Now I practiced something more realistic:

```text
Student ID → Student Object
```

---

## 🔹 Creating a HashMap

```java
HashMap<Integer, Student> students = new HashMap<>();
```

Here:

- `Integer` is the key
- `Student` is the value

---

## 🔹 Adding Objects

```java
students.put(101,
    new Student(101, "Krushna", "Computer Engineering"));
```

The Student object is stored as the value.

---

## 🔹 Getting an Object

```java
Student student = students.get(102);
```

The key is used to find the Student object.

---

## 🔹 Why This Is Useful

A custom object can contain multiple properties.

For example, one Student object can contain:

- ID
- Name
- Course

Instead of maintaining separate collections for every property, all related information stays inside one object.

---

## 🔹 Iterating Through the HashMap

```java
for (Map.Entry<Integer, Student> entry : students.entrySet()) {
    entry.getValue().displayStudent();
}
```

This allows me to access both:

- Key
- Student object

---

## 📝 My Observation

Using HashMap with custom objects feels much closer to real application development.

The key can act like a unique ID, while the object contains all the related information.

---

## 💡 Key Takeaways

- HashMap can store custom objects.
- Objects can be used as values.
- Keys can represent unique IDs.
- OOP and Collections can be combined together.
- This approach is useful for managing real-world data.

---

## 🎯 Interview Reminder

**Can HashMap store custom objects?**

Yes. A HashMap can store custom objects as keys or values.

**Can two keys have the same value?**

Yes. Multiple keys can point to objects containing the same data.

**Why use custom objects?**

Because one object can group multiple related properties together.
