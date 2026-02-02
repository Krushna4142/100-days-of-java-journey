# Day 002 – Variables & Data Types in Java

## 📌 Overview
On Day 002 of my Java journey, I learned about **variables** and **data types**.
These are the most fundamental building blocks of any Java program.

Understanding this topic clearly is very important for writing correct,
efficient, and readable code.

---

## 🧠 What is a Variable?
A **variable** is a container that stores data in memory.
Each variable has:
- A **data type** (what kind of data it can store)
- A **name** (identifier)
- A **value** (stored data)

### Example:
```java
int age = 20;
int → data type

age → variable name

20 → value

📦 Data Types in Java
Java data types are divided into two main categories:

1️⃣ Primitive Data Types
Primitive data types store simple values directly in memory.

Data Type	Size	Description	Example
byte	1 byte	Small integer	byte b = 10;
short	2 bytes	Medium integer	short s = 100;
int	4 bytes	Integer values	int a = 25;
long	8 bytes	Large integer	long l = 100000L;
float	4 bytes	Decimal values	float f = 5.5f;
double	8 bytes	Precise decimals	double d = 99.99;
char	2 bytes	Single character	char c = 'A';
boolean	1 bit	True/False	boolean isJavaFun = true;
📌 Note:

float values must end with f

long values should end with L

2️⃣ Non-Primitive Data Types
These data types store references to objects instead of actual values.

Examples:

String

Arrays

Classes

Objects

String name = "Java";
🧩 Variable Declaration & Initialization
🔹 Declaration
int number;
Memory is allocated, but no value is assigned.

🔹 Initialization
number = 10;
Value is assigned to the variable.

🔹 Declaration + Initialization
int number = 10;
💻 Program Summary
In today’s Java program:

Variables of different data types were declared

Values were assigned to them

Output was displayed using System.out.println()

Learned how Java handles multiple data types together

❓ Interview Questions & Answers
Q1. Why do we need data types in Java?
Answer:
Data types specify what kind of data a variable can store and help Java
manage memory efficiently and safely.

Q2. What is the default value of int in Java?
Answer:
The default value of int is 0 (for instance variables).

Q3. Difference between float and double?
Answer:
double has more precision than float and is preferred for decimal calculations.

Q4. Is String a primitive data type?
Answer:
No. String is a non-primitive data type and is a class in Java.

✅ Outcome of the Day
Clear understanding of variables

Familiarity with all primitive data types

Ability to write simple Java programs using variables