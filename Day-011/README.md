<div align="center">

# 📅 Day 011 — Methods & Functions in Java

### Writing Clean, Reusable & Professional Code

![Java](https://img.shields.io/badge/Language-Java-blue)
![Level](https://img.shields.io/badge/Level-Beginner-green)
![Day](https://img.shields.io/badge/Day-011-orange)
![Status](https://img.shields.io/badge/Progress-Phase--2-yellow)

</div>

---

# 🚀 Welcome to Day 011

After learning:

- Variables
- Operators
- If-Else
- Loops
- Patterns
- Arrays
- Mini Logic Building

Now it's time to level up.

Today we learn the most powerful concept in programming:

> 🧠 **Methods (Functions)** — The foundation of clean & reusable code.

If loops made you logical,  
**methods will make you structured.**

---

# 🎯 What You Will Learn Today

- ✅ What is a Method?
- ✅ Why we need methods
- ✅ Method Syntax
- ✅ Parameters & Arguments
- ✅ Return Type
- ✅ Method Overloading (Intro)
- ✅ Real Interview Questions

---

# 📌 1️⃣ What is a Method?

A **method** is a block of code that performs a specific task.

Instead of writing the same code again and again,
we create a method and call it whenever needed.

Think like this:

> Loop = repetition  
> Method = organization

---

# 🧱 Basic Syntax of Method

```java
returnType methodName(parameters) {
    // body
}

Example:

static void greet() {
    System.out.println("Hello, Krushna!");
}

```

## 🧠 Understanding What We Built

Method Purpose

greetUser() Simple execution

addNumbers() Uses parameters

multiplyNumbers() Returns value

isEven() Returns boolean logic

This is structured programming.

---

## 🔁 Method Overloading (Intro)

Same method name, different parameters.

static int add(int a, int b) {
return a + b;
}

static int add(int a, int b, int c) {

    return a + b + c;

}

---

## 💡 Java decides which method to call based on arguments.

🧪 Practice Tasks

1️⃣ Create method to find square of number

2️⃣ Create method to check prime number

3️⃣ Create method to reverse a number

4️⃣ Create calculator using methods

## 🧠 Interview Questions (Important)

Q1. What is the difference between function and method?
👉 In Java, functions inside a class are called methods.

Q2. What is return type?
👉 It specifies what value the method sends back.

Q3. What is method overloading?
👉 Same method name but different parameters.

Q4. Can main method be overloaded?
👉 Yes, but JVM calls only this one:

public static void main(String[] args)

Q5. Why use methods?

Code reusability

Clean structure

Easy debugging

## Modular programming

## 📊 Before vs After (Your Growth)

Before Day 11 After Day 11
Writing long code in main Writing structured code
Repeating logic Reusable logic
Basic beginner Thinking like developer

---

## 🔥 Secret Developer Tip

Always write small methods.

One method = One responsibility.

Never write 200 lines inside main.
