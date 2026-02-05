📘 Day 05 — Decision Making with If-Else in Java
🚀 100 Days of Java Journey

On Day 5, I explored decision-making in Java using the if-else control structure.
This concept is fundamental for building real-world logic, where programs react differently based on conditions.

🧠 What I Learned Today

Why decision-making is important in programming

Syntax and flow of if-else

How conditions are evaluated (true / false)

Writing clean and readable conditional logic

Applying if-else to real-life scenarios

🛠️ Concept Used
if (condition) {
// executes when condition is true
} else {
// executes when condition is false
}

💡 Real-Life Example Implemented

📌 Program: Check whether a person is eligible to vote based on age.

This is a simple yet industry-relevant example that shows logical thinking clearly.

💻 Java Code — IfElseProgram.java
import java.util.Scanner;

public class IfElseProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("✅ You are eligible to vote.");
        } else {
            System.out.println("❌ You are not eligible to vote yet.");
        }

        sc.close();
    }

}

🧪 Sample Output

Input

Enter your age: 20

Output

✅ You are eligible to vote.

🎯 Key Takeaways

if-else helps programs make decisions

Conditions must return a boolean value

Clean logic improves code readability

This concept is widely used in:

Login systems

Eligibility checks

Validation logic

Business rules

📈 Progress Tracker
Day Topic
Day 01 Java Introduction
Day 02 Variables & Data Types
Day 03 Input using Scanner
Day 04 Operators
✅ Day 05 If-Else Decision Making
🔗 Journey Continues…

I’m building consistency through my 100 Days of Java Journey, focusing on strong fundamentals, clean code, and daily progress.
