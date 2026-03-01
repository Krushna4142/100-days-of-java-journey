# 📚 Day 024 – Polymorphism

## 🔹 What is Polymorphism?

Polymorphism means **one name, many forms**.

In Java, it allows the same method or object to behave differently based on the context.

---

## 🔹 Types of Polymorphism

### 1️⃣ Compile-Time Polymorphism (Method Overloading)

Achieved when multiple methods have:

- Same name
- Different parameters (type / number / order)

➡️ Resolved at **compile time**

#### Example:

```java
int add(int a, int b)
double add(double a, double b)
2️⃣ Runtime Polymorphism (Method Overriding)

Achieved when:

Child class provides implementation of parent class method

Same method signature

Same return type (or covariant)

➡️ Resolved at runtime

🔹 Method Overriding Rules

Must have inheritance

Method name must be same

Parameters must be same

Return type must be same or covariant

Access modifier cannot be more restrictive

Cannot override static / final / private methods

🔹 Upcasting

Parent reference → Child object

Animal obj = new Dog();

Used for runtime polymorphism.

🔹 Dynamic Method Dispatch

Method call is decided at runtime based on:
👉 the object being referred to (not the reference type)

🔹 super Keyword

Used to call:

Parent class method

Parent class constructor

🔹 Real-World Example

Different payment methods:

CreditCard → pay()

UPI → pay()

NetBanking → pay()

Same method, different behavior.

✅ Key Takeaways

✔ Polymorphism increases flexibility
✔ Supports code reusability
✔ Helps achieve runtime method binding
✔ Core concept for scalable system design
```
