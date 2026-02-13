<div align="center">

# 📅 Day 012 – Method Overloading in Java

### Understanding Compile-Time Polymorphism

<img src="https://img.shields.io/badge/Java-Method%20Overloading-orange?style=for-the-badge&logo=java" />
<img src="https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Concept-Polymorphism-green?style=for-the-badge" />

</div>

---

## 🧠 What is Method Overloading?

Method Overloading means:

> Same method name  
> Different parameter list

It allows a class to have multiple methods with the same name but different:

- Number of parameters
- Type of parameters
- Order of parameters

This is called **Compile-Time Polymorphism**.

---

## 🎯 Why Method Overloading?

✔ Improves code readability  
✔ Increases flexibility  
✔ Makes code cleaner  
✔ Reduces method naming confusion

Instead of:
calculateSum2()
calculateSum3()

We write:
add(2, 3)
add(2, 3, 4)

---

## 🏗 Method Overloading Rules

✅ Method name must be same  
✅ Parameters must be different  
❌ Return type alone cannot overload

---

## 🔎 Example 1 – Different Number of Parameters

```java
static int add(int a, int b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}
```

---

## 🔎 Example 2 – Different Data Types

```java
static int multiply(int a, int b) {
    return a * b;
}

static double multiply(double a, double b) {
    return a * b;
}
```

---

## 🔎 Example 3 – Different Order of Parameters

```java
static void display(int number, String name) {
    System.out.println(number + " " + name);
}

static void display(String name, int number) {
    System.out.println(name + " " + number);
}
```

---

## ⚠ Important Interview Points

⭐ Overloading happens at compile time  
⭐ It is also called Static Polymorphism  
⭐ Java decides which method to call based on arguments  
⭐ main() method can also be overloaded

Example:

```java
public static void main(String[] args) { }

public static void main(int number) { }
```

JVM only calls:
public static void main(String[] args)

---

## 📊 Real-World Example

System.out.println()

println() is overloaded multiple times inside Java.

Example:

println(int)
println(double)
println(String)
println(boolean)

---

## 🧩 Difference: Overloading vs Overriding

| Feature              | Overloading  | Overriding |
| -------------------- | ------------ | ---------- |
| Method Name          | Same         | Same       |
| Parameters           | Different    | Same       |
| Inheritance Required | No           | Yes        |
| Polymorphism Type    | Compile-Time | Runtime    |

---

## 🚀 Developer Tips

✔ Use overloading when logic is similar  
✔ Keep parameter meaning clear  
✔ Avoid confusion with too many overloads  
✔ Use meaningful method structure

---

<div align="center">

## ✅ Day 012 Completed

You now understand:

✔ What Method Overloading is  
✔ How it works  
✔ Rules & interview concepts  
✔ Real-world usage

🚀 You are building strong Java foundations step by step.

</div>
