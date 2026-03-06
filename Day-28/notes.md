# 🧠 Day 028 – Collections Framework Notes

## 🔹 What is Java Collections Framework?

The Java Collections Framework (JCF) is a set of classes and interfaces used to store and manipulate groups of objects dynamically.

It provides:

- Dynamic data structures
- Ready-made algorithms
- Efficient data manipulation

---

## 🔹 Why Collections Instead of Arrays?

| Feature       | Array   | Collections           |
| ------------- | ------- | --------------------- |
| Size          | Fixed   | Dynamic               |
| Methods       | Limited | Many built-in methods |
| Data Handling | Basic   | Advanced              |

Collections are preferred in real-world applications.

---

## 🔹 Collection Hierarchy

Collection (Interface)
│
├── List
│ ├── ArrayList
│ └── LinkedList
│
├── Set
│ ├── HashSet
│ └── TreeSet
│
└── Queue
└── PriorityQueue

Map (Separate Interface)
│
├── HashMap
├── LinkedHashMap
└── TreeMap

---

## 🔹 Important Collection Types

### 1️⃣ ArrayList

- Dynamic array
- Allows duplicates
- Maintains insertion order

Example Use:
Storing list of students.

---

### 2️⃣ HashSet

- Stores unique elements
- Does not allow duplicates
- Unordered collection

Example Use:
Unique user IDs.

---

### 3️⃣ HashMap

- Stores key-value pairs
- Keys must be unique
- Very fast lookup

Example Use:
StudentID → StudentName

---

## 🔹 Common Methods

### List / ArrayList

add()
remove()
get()
size()
contains()

### Set

add()
remove()
contains()

### Map

put()
get()
remove()
keySet()

---

## 🔹 When to Use What

Use **ArrayList** → ordered list with duplicates  
Use **HashSet** → unique elements only  
Use **HashMap** → key-value data storage

---

## 🔹 Interview Focus

Difference between Array and ArrayList  
Difference between List and Set  
What is HashMap?  
Can HashSet store duplicates? → No  
Are collections dynamic? → Yes

---

## 🔹 Important Observation

Collections are heavily used in:

- Backend development
- APIs
- Databases
- Real-world Java applications
