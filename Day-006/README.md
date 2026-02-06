# Day 006 – Advanced Decision Making in Java (Else-If & Switch)

**Type:** Coding + Learning Day  
**Focus:** Writing clean, readable, and interview-ready decision-making logic in Java

---

## 📌 Overview

On Day 006, I practiced **advanced decision-making constructs** in Java using:

- `else-if` ladder for range-based conditions
- `switch` statement for menu-driven and fixed-choice logic

The goal was not just to make programs work, but to **choose the right control structure** for clarity and maintainability.

---

## 🧠 Concepts Covered

### 1️⃣ Else-If Ladder

Used when:

- Multiple conditions must be checked
- Conditions are **range-based**
- Order of evaluation matters

Common use cases:

- Grade calculation
- Salary slabs
- Eligibility validation

---

### 2️⃣ Switch Statement

Used when:

- A variable is compared against **fixed values**
- Cleaner alternative to long if-else chains
- Ideal for menu-driven programs

Important keywords:

- `case`
- `break`
- `default`

---

## 📝 Notes & Key Learnings

- `else-if` conditions are checked **top to bottom**
- `switch` improves readability when options are limited
- Missing `break` causes **fall-through**
- Choosing the correct decision structure reduces bugs
- Clean logic is more important than complex syntax

---

## 💻 Code Implemented

### ✔ Program 1: Student Grade Calculator

- Uses else-if ladder
- Validates marks range
- Outputs grade based on score

### ✔ Program 2: Menu-Driven Utility

- Uses switch statement
- Option-based execution
- Demonstrates nested decision logic

📄 **Java Source Code:**  
👉 [DecisionMakingDemo.java](./DecisionMakingDemo.java)

---

## 🔍 Code Snippet (Sample)

```java
if (marks >= 90 && marks <= 100) {
    System.out.println("Grade: A");
} else if (marks >= 75) {
    System.out.println("Grade: B");
} else if (marks >= 60) {
    System.out.println("Grade: C");
} else if (marks >= 40) {
    System.out.println("Grade: D");
} else {
    System.out.println("Grade: Fail");
}
switch (choice) {
    case 1:
        System.out.println("Check Even or Odd");
        break;
    case 2:
        System.out.println("Check Positive or Negative");
        break;
    default:
        System.out.println("Invalid choice");
}
🎯 Interview Questions (Preparation Notes)
Q1. What is the difference between if-else and switch?
Answer:
if-else is better for range-based and complex conditions, while switch is cleaner and faster to read when comparing fixed values.

Q2. When should you use an else-if ladder?
Answer:
When multiple conditions need to be checked sequentially and the conditions depend on ranges or logical expressions.

Q3. Why is the break statement important in switch?
Answer:
Without break, execution continues into the next case (fall-through), which can cause incorrect results.

Q4. Can switch work without default?
Answer:
Yes, but using default is recommended to handle unexpected values safely.

Q5. Which is more readable: switch or else-if?
Answer:
switch is more readable for fixed options, while else-if is clearer for complex conditions.

📈 Takeaway
Decision-making is not about syntax — it’s about clarity of logic.
Writing clean conditions today prevents debugging headaches tomorrow.

🚀 Progress Update
✔ Java basics

✔ Variables & input

✔ Operators

✔ Conditional statements

✔ Structured decision-making logic

Next up: Loops & iteration
```
