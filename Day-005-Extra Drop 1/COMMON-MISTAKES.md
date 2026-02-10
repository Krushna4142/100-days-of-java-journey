---

# 2️⃣ `COMMON-MISTAKES.md` (🔥 Secret Growth File)

```md
# 🚫 Common Java Beginner Mistakes (Day 1–5)

This file contains mistakes **almost every beginner makes**,  
but very few repos talk about openly.

---

## ❌ Mistake 1: Class Name ≠ File Name

```java
public class Demo { }
File must be:

Demo.java
❌ Mistake 2: Forgetting main method
public static void main(String[] args)
Without this → program won’t run.

❌ Mistake 3: Scanner not imported
import java.util.Scanner;
❌ Mistake 4: Using == for String comparison
❌ Wrong:

if(name == "Java")
✅ Correct:

if(name.equals("Java"))
❌ Mistake 5: Missing break in switch
This causes fall-through bugs.

🧠 Secret Advice
Most Java errors are not logic issues
They are syntax + structure mistakes.

Fix basics → confidence increases automatically.

```
