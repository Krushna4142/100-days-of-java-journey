# 🧠 Day 026 – Encapsulation & Access Modifiers

## 🔐 Encapsulation

Encapsulation means:

- Wrapping data and methods into a single unit
- Hiding internal data using private variables
- Providing controlled access using getters and setters

### Why Encapsulation?

- Protects data from unwanted access
- Allows validation before updating values
- Improves maintainability
- Makes code secure and flexible

### Example

Private variable → Cannot access directly  
Access using → Getter & Setter

---

## 🔑 Getters and Setters

### Getter

Used to read data.

### Setter

Used to modify data with validation.

---

## 🏷 Access Modifiers in Java

### 1️⃣ private

- Accessible only within the same class

### 2️⃣ default

- Accessible within the same package

### 3️⃣ protected

- Accessible within the same package
- Accessible in subclasses (even in different packages)

### 4️⃣ public

- Accessible from everywhere

---

## 📊 Access Level Summary

| Modifier  | Same Class | Same Package | Subclass | Other Package |
| --------- | ---------- | ------------ | -------- | ------------- |
| private   | ✅         | ❌           | ❌       | ❌            |
| default   | ✅         | ✅           | ❌       | ❌            |
| protected | ✅         | ✅           | ✅       | ❌\*          |
| public    | ✅         | ✅           | ✅       | ✅            |

\*only through inheritance

---

## 💡 Key Points

- Always keep variables **private**
- Use getters/setters for controlled access
- Encapsulation = Data Security + Flexibility
- It is a core OOP principle

---

## 🧠 Interview Focus

Encapsulation = Data hiding + Controlled access

Real-world example:
A bank account where balance cannot be changed directly.
