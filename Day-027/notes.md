# 🧠 Day 027 – Exception Handling Notes

## 🔹 What is an Exception?

An exception is:
An event that disrupts the normal flow of a program during runtime.

---

## 🔹 Types of Exceptions

### 1️⃣ Checked Exceptions

- Checked at compile time
- Must be handled or declared
  Example:
  IOException, SQLException

### 2️⃣ Unchecked Exceptions

- Occur at runtime
- Not mandatory to handle
  Example:
  ArithmeticException, NullPointerException

---

## 🔹 Exception Handling Keywords

### try

Wrap risky code.

### catch

Handles the exception.

### finally

Always executes (cleanup code).

### throw

Used to explicitly throw an exception.

### throws

Declares exception responsibility.

---

## 🔹 Exception Hierarchy

Object  
 └── Throwable  
 ├── Error  
 └── Exception  
 ├── Checked Exceptions  
 └── RuntimeException

---

## 🔹 Custom Exception

- Created by extending Exception class
- Used for business logic validation

Example:
InvalidAgeException

---

## 🔹 Best Practices

✔ Always handle specific exceptions first  
✔ Use finally for cleanup (closing files, DB connections)  
✔ Do not suppress exceptions silently  
✔ Provide meaningful messages  
✔ Avoid catching generic Exception unnecessarily

---

## 🔹 Interview Focus

Difference between throw and throws  
Checked vs Unchecked exception  
What happens if exception is not handled?  
Can we have multiple catch blocks? → Yes  
Does finally always execute? → Yes (except JVM shutdown)
