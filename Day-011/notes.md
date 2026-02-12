# 📅 Day 011 – Methods & Functions in Java

---

## 🧠 1. What is a Method?

A method is a block of code that performs a specific task.

Instead of writing the same logic multiple times,
we create a method and call it whenever needed.

👉 Methods improve:

- Code reusability
- Readability
- Maintainability
- Debugging

---

## 🏗 2. Basic Syntax of a Method

returnType methodName(parameters) {
// method body
}

Example:

static void greet() {
System.out.println("Hello");
}

---

## 🔎 3. Parts of a Method

1️⃣ Access Modifier (optional)

2️⃣ static (if class-level method)

3️⃣ Return Type

4️⃣ Method Name

5️⃣ Parameters

6️⃣ Method Body

Example:

static int add(int a, int b) {
return a + b;
}

---

## 🔁 4. Types of Methods

### 1️⃣ No Return Type & No Parameters

static void greet() {
System.out.println("Hello");
}

---

### 2️⃣ No Return Type but With Parameters

static void printSum(int a, int b) {
System.out.println(a + b);
}

---

### 3️⃣ With Return Type & With Parameters

static int multiply(int a, int b) {
return a \* b;
}

---

### 4️⃣ With Return Type & No Parameters

static int getNumber() {
return 10;
}

---

## 🎯 5. What is Return Type?

Return type defines what value a method sends back.

void → No value returned  
int → Returns integer  
double → Returns decimal  
boolean → Returns true/false

Example:

static boolean isEven(int num) {
return num % 2 == 0;
}

---

## 📌 6. Parameters vs Arguments

Parameter → Variable in method definition  
Argument → Actual value passed during method call

Example:

static int add(int a, int b) ← parameters

add(5, 10); ← arguments

---

## 🔄 7. Method Overloading

Method overloading means:
Same method name but different parameter list.

Example:

static int add(int a, int b) {
return a + b;
}

static int add(int a, int b, int c) {
return a + b + c;
}

✔ Return type alone cannot overload a method.

---

## 🧩 8. Why Methods Are Important?

- Avoid code repetition
- Makes program modular
- Easier testing
- Cleaner structure
- Professional coding style

---

## 🧠 9. Important Keywords

static → Belongs to class  
void → No return value  
return → Sends value back

---

## 🎓 10. Interview Focus

⭐ What is method signature?
→ Method name + parameter list

⭐ Can we overload main method?
→ Yes, but JVM calls only:
public static void main(String[] args)

⭐ Difference between static and non-static method?

Static:

- Called without object
- Belongs to class

Non-static:

- Requires object
- Belongs to object

---

## 🚀 Developer Tip

✔ Keep methods small  
✔ One method = One responsibility  
✔ Never write everything inside main  
✔ Use meaningful method names

---

## 📊 Day 011 Summary

Today you learned how to:

- Create methods
- Pass parameters
- Return values
- Structure real programs

You are now writing code like a developer, not just a beginner.
