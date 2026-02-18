# 🎥 Visual Dry-Run Examples – Logic Patterns Pack

Understanding logic is not about memorizing code.

It is about understanding:

➡ How values change step-by-step  
➡ How memory behaves  
➡ How loops actually work

This file shows visual dry runs.

---

# 🔢 1️⃣ Reverse a Number – Dry Run

### Problem

Input: 123  
Output: 321

---

## Initial Values

number = 123  
reversed = 0

---

## Iteration 1

digit = 123 % 10 → 3  
reversed = 0 \* 10 + 3 → 3  
number = 123 / 10 → 12

State:
number = 12  
reversed = 3

---

## Iteration 2

digit = 12 % 10 → 2  
reversed = 3 \* 10 + 2 → 32  
number = 12 / 10 → 1

State:
number = 1  
reversed = 32

---

## Iteration 3

digit = 1 % 10 → 1  
reversed = 32 \* 10 + 1 → 321  
number = 1 / 10 → 0

Loop stops.

Final Output → 321

---

# 🔢 2️⃣ Palindrome Number – Dry Run

Input: 121

Step 1:
Reverse the number → 121

Step 2:
Compare:

original == reversed  
121 == 121 → TRUE

Result → Palindrome

---

# 🔢 3️⃣ Armstrong Number – Dry Run (153)

Initial:
number = 153  
sum = 0

---

Iteration 1:
digit = 3  
sum = 0 + (3³) = 27  
number = 15

Iteration 2:
digit = 5  
sum = 27 + (5³) = 27 + 125 = 152  
number = 1

Iteration 3:
digit = 1  
sum = 152 + (1³) = 153  
number = 0

Compare:
sum == original  
153 == 153 → TRUE

Result → Armstrong

---

# 🔤 4️⃣ Reverse a String – Dry Run

Input: "Java"

Indices:
J → 0  
a → 1  
v → 2  
a → 3

Loop from last index:

i = 3 → 'a'  
i = 2 → 'v'  
i = 1 → 'a'  
i = 0 → 'J'

Result:
"avaJ"

---

# 🔤 5️⃣ Count Vowels – Dry Run

Input: "education"

Characters:

e → vowel (count = 1)  
d → no  
u → vowel (count = 2)  
c → no  
a → vowel (count = 3)  
t → no  
i → vowel (count = 4)  
o → vowel (count = 5)  
n → no

Final Count → 5

---

# 🧠 What This Teaches

Every logic problem follows:

1️⃣ Initialize variables  
2️⃣ Update inside loop  
3️⃣ Stop at condition  
4️⃣ Compare or print

---

# 🚀 Pro Developer Trick

Before coding:

Write values in notebook like this.

If you can dry run correctly,
your code will almost never fail.

---

# 🎯 Interview Advantage

When interviewer asks:

"Explain how your code works"

You explain like this.

That shows:

✔ Clear thinking  
✔ Strong fundamentals  
✔ Confidence

---

# 📌 Final Rule

If you cannot dry run,
you do not understand the logic yet.

Practice dry run more than coding.
