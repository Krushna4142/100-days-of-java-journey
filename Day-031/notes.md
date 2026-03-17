# 🧠 Day 031 – ArrayList Deep Dive

## 📌 Introduction

ArrayList is a class in the **Java Collections Framework** that implements the **List interface**.

It is used to store **dynamic collections of objects**, meaning the size of the list can grow or shrink automatically.

Package:

java.util.ArrayList

---

# 🔹 Why ArrayList?

Traditional arrays have a **fixed size**, which creates problems when data grows dynamically.

Example problem with arrays:

- You declare array of size 5
- Later you need to store 10 values
- You must create a new array

ArrayList solves this problem by **resizing automatically**.

---

# 🔹 Creating an ArrayList

Syntax:

```java
ArrayList<Type> listName = new ArrayList<>();

Example:

ArrayList<String> names = new ArrayList<>();
🔹 Common ArrayList Methods
add()

Adds element to the list.

list.add("Apple");
get()

Access element using index.

list.get(0);
set()

Update element at a specific index.

list.set(1, "Mango");
remove()

Removes element from the list.

list.remove("Apple");

or

list.remove(0);
size()

Returns number of elements in the list.

list.size();
🔹 Iterating Through ArrayList

Using for-each loop:

for(String item : list){
    System.out.println(item);
}
🔹 Array vs ArrayList
Feature	Array	ArrayList
Size	Fixed	Dynamic
Data Type	Primitive & Objects	Objects only
Methods	Limited	Many built-in methods
🔹 Internal Working

ArrayList internally uses a dynamic array.

When capacity becomes full:

Java creates a new larger array

Old elements are copied

New array replaces old array

This process is called dynamic resizing.

🔹 Advantages

Dynamic size

Easy insertion and deletion

Built-in utility methods

Part of Collections Framework

🔹 Limitations

Cannot store primitive types directly

Slightly slower than arrays in some cases

Uses extra memory during resizing

🚀 Learning Outcome

After completing this topic I can:

✔ Create ArrayList
✔ Add, remove and update elements
✔ Iterate through collections
✔ Understand difference between arrays and ArrayList

This concept is very important because Collections are used heavily in real Java applications.
```
