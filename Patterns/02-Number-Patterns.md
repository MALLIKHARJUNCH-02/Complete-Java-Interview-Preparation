# 02-Number-Patterns.md (Part 1)

# 🔢 Number Pattern Programming (Basic to Advanced)

This file contains the most important **Number Pattern Programming** questions frequently asked in Java interviews.

## Difficulty

* 🟢 Easy
* 🟡 Medium
* 🔴 Hard

---

# 1. Number Square Pattern

### 📝 Problem Statement

Write a Java program to print a square pattern using numbers.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
```

### 💡 Hint

* Use two nested loops.
* Print `1` in every iteration.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Loops, Nested Loops

---

# 2. Number Rectangle Pattern

### 📝 Problem Statement

Print a rectangle using numbers.

### 📌 Example Input

```text
Rows = 4
Columns = 6
```

### 📤 Expected Output

```text
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1
```

### 💡 Hint

Outer loop controls rows.

Inner loop controls columns.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Loops

---

# 3. Increasing Number Triangle

### 📝 Problem Statement

Print an increasing number triangle.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

### 💡 Hint

Each row prints numbers from `1` to the current row.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Nested Loops

---

# 4. Decreasing Number Triangle

### 📝 Problem Statement

Print a decreasing number triangle.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

### 💡 Hint

Decrease the number of columns after every row.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Nested Loops

---

# 5. Floyd's Triangle

### 📝 Problem Statement

Print Floyd's Triangle.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

### 💡 Hint

Maintain a variable that increments after every print.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Logic Building

---

# 6. Reverse Floyd's Triangle

### 📝 Problem Statement

Print Floyd's Triangle in reverse order.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
11 12 13 14 15
7 8 9 10
4 5 6
2 3
1
```

### 💡 Hint

Generate Floyd's Triangle first, then print it in reverse row order.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Logic Building

---

# 7. Number Pyramid

### 📝 Problem Statement

Print a centered number pyramid.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
```

### 💡 Hint

* Print leading spaces.
* Print ascending numbers.
* Print descending numbers.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Spaces

---

# 8. Inverted Number Pyramid

### 📝 Problem Statement

Print an inverted number pyramid.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
```

### 💡 Hint

Decrease the peak number while increasing leading spaces.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Spaces

---

# 9. Hollow Number Pyramid

### 📝 Problem Statement

Print a hollow number pyramid.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        1
      2   2
    3       3
  4           4
5 5 5 5 5 5 5 5 5
```

### 💡 Hint

* Print numbers only on the boundary.
* Print the last row completely.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Conditions

---

# 10. Continuous Number Triangle

### 📝 Problem Statement

Print a triangle using continuously increasing numbers.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

### 💡 Hint

Use a counter variable that increments after every print.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Loops, Logic Building

---
