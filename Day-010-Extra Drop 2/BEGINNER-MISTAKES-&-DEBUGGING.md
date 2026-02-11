# 🧠 Secret Section — Beginner Mistakes & Debugging Guide

This section is intentionally honest.  
These are real mistakes faced during Day 1–10.

---

# 🚫 Mistakes I Made as a Beginner

## 1️⃣ Class Not Found Error

Error:
Error: Could not find or load main class

Cause:

- File name ≠ Class name
- Running from wrong directory
- Forgot to compile before running

Lesson:
Java is strict about structure.

---

## 2️⃣ ArrayIndexOutOfBoundsException

Cause:
Loop ran beyond array length.

Wrong:

for(int i = 0; i <= arr.length; i++)
Correct:

for(int i = 0; i < arr.length; i++)
Lesson:
Array index starts at 0 and ends at length-1.

---

## 3️⃣ Integer Division Mistake

Wrong:

double avg = sum / n;
Correct:

double avg = (double) sum / n;
Lesson:
Type casting matters.

---

## 4️⃣ Forgetting break in Switch

Causes unintended fall-through.

Lesson:
Always add break unless intentionally chaining.

---

## 🔍 How I Debug Java Errors

Step 1 — Read the Full Error Message
Do not panic. Java tells the exact line number.

Step 2 — Check Syntax First
Missing semicolon?

Wrong brackets?

Typo in variable name?

Step 3 — Print Debug Statements
System.out.println("Value of i: " + i);
Printing helps understand logic flow.

Step 4 — Simplify the Problem
Remove extra code and test small parts.

---

## 💡 Biggest Realization

Most errors are not complex logic problems.
They are small structure mistakes.

Once structure becomes strong → confidence increases automatically.

## 🔥 Why This Section Exists

Learning is not just about writing code.
It is about:

Making mistakes

Understanding them

Improving from them

This repo documents that journey honestly.

```

```
