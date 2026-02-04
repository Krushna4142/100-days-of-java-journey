# Day 03 – Input & Output in Java (Scanner Class) 🖥️

Welcome to **Day 03** of my **100 Days of Java Journey** 🚀  
Today I learned how to take **user input** in Java using the **Scanner class**, which is essential for building interactive programs.

---

## 📌 Why Input/Output is Important?

- Real applications **interact with users**
- Helps in understanding **data flow**
- Forms the base for **logic, conditions, and loops**

---

## 📥 Taking Input in Java

Java provides the `Scanner` class from the `java.util` package to read input from the keyboard.

### Step 1: Import Scanner

```java
import java.util.Scanner;
Step 2: Create Scanner Object
Scanner sc = new Scanner(System.in);
🔡 Common Scanner Methods
Method	Description
nextInt()	Reads integer
nextDouble()	Reads decimal
next()	Reads single word
nextLine()	Reads full line
nextBoolean()	Reads true/false
⚠️ Important Scanner Gotcha (Interview Favorite)
sc.nextLine();
This is required after nextInt() or nextDouble() to consume the leftover newline.

💻 Program Demonstrated
📄 ScannerInputDemo.java

This program:

Takes user name

Takes age, height, salary

Prints formatted output

🧠 Key Learnings
Scanner reads input from System.in

nextLine() behaves differently than next()

Always close Scanner after use

🎯 Interview Questions
Q1: Why Scanner is slow?
Answer:
It performs parsing and synchronization, which makes it slower than BufferedReader.

Q2: Difference between next() and nextLine()?
Answer:
next() → reads one word
nextLine() → reads entire line

Q3: What happens if Scanner is not closed?
Answer:
Resource leak may occur.

Q4: Which package contains Scanner?
Answer:
java.util

✅ Day 03 Status
✔ Learned user input
✔ Used multiple Scanner methods
✔ Built interactive program
```
