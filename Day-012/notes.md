# 📅 Day 012 – Method Overloading

---

## 🧠 1. What is Method Overloading?

Method Overloading means:

Same method name  
Different parameter list

It allows multiple methods in the same class with the same name but different:

- Number of parameters
- Type of parameters
- Order of parameters

This is called Compile-Time Polymorphism.

---

## 🎯 2. Why Do We Use Method Overloading?

✔ Improves readability  
✔ Increases flexibility  
✔ Makes code cleaner  
✔ Avoids unnecessary method names

Example:

add(2, 3)
add(2, 3, 4)

Instead of:
addTwoNumbers()
addThreeNumbers()

---

## 🏗 3. Rules of Method Overloading

✅ Method name must be same  
✅ Parameters must be different  
❌ Return type alone cannot overload

Invalid Example:

int add(int a, int b)
double add(int a, int b)

This is NOT valid because only return type is different.

---

## 🔎 4. Types of Overloading

1️⃣ Different Number of Parameters

add(int a, int b)
add(int a, int b, int c)

2️⃣ Different Data Types

multiply(int a, int b)
multiply(double a, double b)

3️⃣ Different Order of Parameters

display(int a, String b)
display(String b, int a)

---

## 🧩 5. How Java Decides Which Method to Call?

Java checks:

- Number of arguments
- Type of arguments
- Order of arguments

This decision is made at compile time.

---

## ⚡ 6. Important Interview Points

⭐ Also called Static Polymorphism  
⭐ Happens at Compile Time  
⭐ Inheritance is NOT required  
⭐ main() method can be overloaded  
⭐ Constructor can also be overloaded

---

## 🔄 7. Overloading vs Overriding

Overloading:

- Same class
- Different parameters
- Compile-time polymorphism

Overriding:

- Parent-child class
- Same method signature
- Runtime polymorphism

---

## 🚀 8. Real-Life Example

System.out.println()

println() method is overloaded for:

- int
- double
- String
- boolean
- char

---

## 📊 Day 012 Summary

Today you learned:

✔ Concept of Method Overloading  
✔ Rules and restrictions  
✔ Types of overloading  
✔ Interview-focused points

You are now moving from beginner to strong Java foundation level.
