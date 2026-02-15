# 📅 Day 014 – Strings in Java

---

## 🧠 1. What is a String?

A String in Java is an object that represents a sequence of characters.

Example:
String name = "Java";

Strings are stored in the **String Constant Pool (SCP)** when created using literals.

---

## 🏗 2. Ways to Create Strings

### Using String Literal

String s1 = "Java";

Stored in SCP → memory optimized

### Using new Keyword

String s2 = new String("Java");

Stored in Heap → creates a new object every time

---

## ⚙️ 3. String Immutability

Strings in Java are **immutable**.

This means once a String object is created,
it cannot be changed.

Example:

String s = "Java";
s.concat(" World");

A new object is created → original string remains unchanged.

### Why String is Immutable?

✔ Security  
✔ Thread safety  
✔ Caching (SCP)  
✔ Class loading safety

---

## 🔑 4. Important String Methods

### length()

Returns total number of characters.

str.length();

---

### charAt(index)

Returns character at a given index.

str.charAt(0);

---

### substring(beginIndex, endIndex)

Extracts part of the string.

str.substring(1, 4);

---

### equals()

Compares actual content.

str1.equals(str2);

---

### equalsIgnoreCase()

Compares content ignoring case.

---

### toUpperCase() / toLowerCase()

Changes case of string.

---

### trim()

Removes leading & trailing spaces.

---

### contains()

Checks if a substring exists.

---

### replace()

Replaces characters.

---

## ❗ 5. Difference Between == and equals()

== → compares memory reference  
equals() → compares actual content

Example:

String a = "Java";
String b = "Java";

a == b → true (same SCP reference)

String x = new String("Java");

a == x → false  
a.equals(x) → true

---

## 🧩 6. String Constant Pool (SCP)

SCP is a special memory area inside heap.

It stores only one copy of each literal.

This improves:

✔ Memory efficiency  
✔ Performance

---

## 📊 7. Commonly Used Operations in DSA

✔ Reverse a string  
✔ Check palindrome  
✔ Count vowels  
✔ Convert case  
✔ Remove spaces  
✔ Compare strings

---

## ⚠️ 8. Common Beginner Mistakes

❌ Using == for comparison  
❌ Forgetting strings are immutable  
❌ Ignoring index bounds in charAt()  
❌ Not storing returned value of string methods

---

## 🚀 9. String vs StringBuilder (Intro)

String → Immutable  
StringBuilder → Mutable

StringBuilder is faster for frequent modifications.

---

## 🎯 10. Interview Focus

⭐ Why String is immutable?  
⭐ What is SCP?  
⭐ Difference between String, StringBuilder, StringBuffer  
⭐ Difference between == and equals()  
⭐ How many objects are created?

---

## 📌 Day 014 Summary

Today I learned:

✔ How Java handles strings  
✔ String immutability  
✔ String Constant Pool  
✔ Most important string methods  
✔ Correct way to compare strings

This topic is heavily used in:

- DSA
- Backend development
- Real-world applications
