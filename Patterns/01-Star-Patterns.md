# 01-Star-Patterns.md

# ⭐ Star Pattern Programming (Basic to Advanced)

This file contains the most important **Star Pattern Programming** questions asked in Java interviews.

## Difficulty

* 🟢 Easy
* 🟡 Medium
* 🔴 Hard

---

# 1. Square Pattern

### 📝 Problem Statement

Write a Java program to print a square star pattern of size **N**.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

### 💡 Hint

* Use two nested loops.
* Both loops iterate from `1` to `N`.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Loops, Nested Loops

---

# 2. Hollow Square Pattern

### 📝 Problem Statement

Print a hollow square of stars.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * *
*       *
*       *
*       *
* * * * *
```

### 💡 Hint

Print stars only for:

* First row
* Last row
* First column
* Last column

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Loops, Nested Loops, Conditions

---

# 3. Rectangle Pattern

### 📝 Problem Statement

Print a rectangle containing **Rows × Columns** stars.

### 📌 Example Input

```text
Rows = 4
Columns = 6
```

### 📤 Expected Output

```text
* * * * * *
* * * * * *
* * * * * *
* * * * * *
```

### 💡 Hint

Outer loop controls rows.

Inner loop controls columns.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Loops

---

# 4. Hollow Rectangle Pattern

### 📝 Problem Statement

Print a hollow rectangle.

### 📌 Example Input

```text
Rows = 4
Columns = 6
```

### 📤 Expected Output

```text
* * * * * *
*         *
*         *
* * * * * *
```

### 💡 Hint

Print stars only on the rectangle boundary.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Nested Loops, Conditions

---

# 5. Right Half Pyramid

### 📝 Problem Statement

Print a right half pyramid using stars.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
*
* *
* * *
* * * *
* * * * *
```

### 💡 Hint

The number of stars in each row equals the row number.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Nested Loops

---

# 6. Inverted Right Half Pyramid

### 📝 Problem Statement

Print an inverted right half pyramid.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * *
* * * *
* * *
* *
*
```

### 💡 Hint

Start with **N** stars and decrease by one in each row.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Nested Loops

---

# 7. Left Half Pyramid

### 📝 Problem Statement

Print a left-aligned half pyramid.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        *
      * *
    * * *
  * * * *
* * * * *
```

### 💡 Hint

Use:

* One loop for spaces.
* One loop for stars.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Spaces

---

# 8. Inverted Left Half Pyramid

### 📝 Problem Statement

Print an inverted left half pyramid.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * *
  * * * *
    * * *
      * *
        *
```

### 💡 Hint

Increase spaces while decreasing stars.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops

---

# 9. Full Pyramid

### 📝 Problem Statement

Print a full pyramid using stars.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
```

### 💡 Hint

Use:

* Leading spaces.
* Odd number of stars in each row.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Spaces

---

# 10. Inverted Full Pyramid

### 📝 Problem Statement

Print an inverted full pyramid.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
```

### 💡 Hint

Decrease the number of stars while increasing leading spaces.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Pattern Programming

---
---

# 11. Hollow Pyramid

### 📝 Problem Statement

Write a Java program to print a hollow pyramid of stars.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        *
      *   *
    *       *
  *           *
* * * * * * * * *
```

### 💡 Hint

* First and last stars should always be printed.
* Print stars only on the boundary and last row.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Spaces, Conditions

---

# 12. Hollow Inverted Pyramid

### 📝 Problem Statement

Print a hollow inverted pyramid.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * * * * * *
  *           *
    *       *
      *   *
        *
```

### 💡 Hint

* First row is completely filled.
* Remaining rows contain only boundary stars.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Conditions

---

# 13. Diamond Pattern

### 📝 Problem Statement

Print a diamond star pattern.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
```

### 💡 Hint

* Combine a Full Pyramid and an Inverted Full Pyramid.
* Avoid printing the middle row twice.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Pattern Combination

---

# 14. Hollow Diamond Pattern

### 📝 Problem Statement

Print a hollow diamond.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        *
      *   *
    *       *
  *           *
*               *
  *           *
    *       *
      *   *
        *
```

### 💡 Hint

Print only boundary stars.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Boundary Logic

---

# 15. Half Diamond Pattern

### 📝 Problem Statement

Print a half diamond.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
```

### 💡 Hint

Combine:

* Right Half Pyramid
* Inverted Right Half Pyramid

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Nested Loops

---

# 16. Hollow Half Diamond Pattern

### 📝 Problem Statement

Print a hollow half diamond.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
*
* *
*   *
*     *
* * * * *
*     *
*   *
* *
*
```

### 💡 Hint

Only print:

* First star
* Last star
* Last row

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Conditions

---

# 17. Butterfly Pattern

### 📝 Problem Statement

Print a butterfly pattern.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
```

### 💡 Hint

Use four parts:

* Left stars
* Middle spaces
* Right stars
* Mirror the pattern

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Symmetry

---

# 18. Hollow Butterfly Pattern

### 📝 Problem Statement

Print a hollow butterfly.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
*                 *
* *             * *
*   *         *   *
*     *     *     *
* * * * * * * * * *
*     *     *     *
*   *         *   *
* *             * *
*                 *
```

### 💡 Hint

Print only boundary stars.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Hollow Patterns

---

# 19. Sandglass Pattern

### 📝 Problem Statement

Print a sandglass star pattern.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
```

### 💡 Hint

Combine:

* Inverted Pyramid
* Pyramid

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Pattern Combination

---

# 20. Hollow Sandglass Pattern

### 📝 Problem Statement

Print a hollow sandglass pattern.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
* * * * *
```

### 💡 Hint

Print:

* Boundary stars
* First row
* Last row

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Hollow Patterns, Symmetry

---
---

# 21. Hourglass Pattern

### 📝 Problem Statement

Write a Java program to print an hourglass star pattern.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
```

### 💡 Hint

* Print an inverted pyramid.
* Then print a normal pyramid.
* Avoid printing the middle row twice.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Pattern Combination

---

# 22. Hollow Hourglass Pattern

### 📝 Problem Statement

Print a hollow hourglass pattern.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
* * * * *
```

### 💡 Hint

* Print stars only on the boundaries.
* First and last rows are completely filled.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Hollow Patterns

---

# 23. X Pattern

### 📝 Problem Statement

Print an **X** using stars.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
*       *
  *   *
    *
  *   *
*       *
```

### 💡 Hint

Print stars when:

* Row == Column
* Row + Column == N + 1

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Conditions

---

# 24. Hollow X Pattern

### 📝 Problem Statement

Print a hollow X pattern.

### 📌 Example Input

```text
7
```

### 📤 Expected Output

```text
*           *
  *       *
    *   *
      *
    *   *
  *       *
*           *
```

### 💡 Hint

Print stars only on the two diagonals.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Diagonal Logic

---

# 25. Plus Pattern

### 📝 Problem Statement

Print a plus (+) pattern using stars.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
    *
    *
* * * * *
    *
    *
```

### 💡 Hint

Print stars when:

* Current row is the middle row.
* Current column is the middle column.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Loops, Conditions

---

# 26. Hollow Plus Pattern

### 📝 Problem Statement

Print a hollow plus (+) pattern.

### 📌 Example Input

```text
7
```

### 📤 Expected Output

```text
      *
      *
      *
* * * * * * *
      *
      *
      *
```

### 💡 Hint

Use the middle row and middle column.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Conditions

---

# 27. Cross Pattern

### 📝 Problem Statement

Print a cross (+) inside a square.

### 📌 Example Input

```text
7
```

### 📤 Expected Output

```text
      *
      *
      *
* * * * * * *
      *
      *
      *
```

### 💡 Hint

This is similar to the Plus Pattern but inside a square matrix.

### ⏱ Difficulty

🟢 Easy

### 🏷 Tags

Loops

---

# 28. Zig-Zag Pattern

### 📝 Problem Statement

Print a zig-zag star pattern.

### 📌 Example Input

```text
9
```

### 📤 Expected Output

```text
    *       *
  *   *   *
*       *
  *   *   *
    *       *
```

### 💡 Hint

Think of three rows repeating in a wave.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Pattern Logic

---

# 29. Wave Pattern

### 📝 Problem Statement

Print a wave pattern using stars.

### 📌 Example Input

```text
10
```

### 📤 Expected Output

```text
*       *       *
  *   *   *   *
    *       *
  *   *   *   *
*       *       *
```

### 💡 Hint

Use modulo (`%`) to identify wave positions.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Pattern Logic

---

# 30. Arrow Pattern

### 📝 Problem Statement

Print an arrow pattern.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        *
      * *
* * * * * * *
      * *
        *
```

### 💡 Hint

Combine:

* Left spaces
* Half pyramid
* Middle row
* Reverse half pyramid

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Symmetry

---



# 01-Star-Patterns.md (Part 4)

---

# 31. Hollow Arrow Pattern

### 📝 Problem Statement

Write a Java program to print a hollow arrow pattern.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        *
      * *
    *   *
* * * * * * *
    *   *
      * *
        *
```

### 💡 Hint

* Print only the boundary stars of the arrow head.
* Print the full middle row.
* Mirror the upper half for the lower half.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Hollow Patterns, Symmetry

---

# 32. Christmas Tree Pattern

### 📝 Problem Statement

Print a Christmas tree using stars.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
        *
       * *
      * * *
     * * * *
    * * * * *
       |||
       |||
```

### 💡 Hint

* Print a full pyramid.
* Print the tree trunk separately.

### ⏱ Difficulty

🟡 Medium

### 🏷 Tags

Nested Loops, Pattern Combination

---

# 33. Double Pyramid Pattern

### 📝 Problem Statement

Print two full pyramids facing each other.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
    *           *
   * *         * *
  * * *       * * *
 * * * *     * * * *
* * * * *   * * * * *
```

### 💡 Hint

* Print two pyramids in the same row.
* Maintain equal spacing between them.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Spaces

---

# 34. Double Diamond Pattern

### 📝 Problem Statement

Print two diamond patterns side by side.

### 📌 Example Input

```text
4
```

### 📤 Expected Output

```text
      *           *
    * * *       * * *
  * * * * *   * * * * *
    * * *       * * *
      *           *
```

### 💡 Hint

* First create a diamond.
* Duplicate it horizontally.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Symmetry

---

# 35. Spiral Star Pattern

### 📝 Problem Statement

Print a spiral star pattern.

### 📌 Example Input

```text
7
```

### 📤 Expected Output

```text
* * * * * * *
            *
* * * * *   *
*       *   *
*   * * *   *
*           *
* * * * * * *
```

### 💡 Hint

Think of printing stars layer by layer in a spiral.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Matrix, Simulation

---

# 36. Hollow Spiral Pattern

### 📝 Problem Statement

Print a hollow spiral using stars.

### 📌 Example Input

```text
7
```

### 📤 Expected Output

```text
* * * * * * *
            *
* * * * *   *
*       *   *
*   * * *   *
*           *
* * * * * * *
```

### 💡 Hint

Use boundary traversal similar to Spiral Matrix.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Matrix, Simulation

---

# 37. Swastik Pattern

### 📝 Problem Statement

Print a Swastik pattern using stars.

### 📌 Example Input

```text
7
```

### 📤 Expected Output

```text
* * * *   * *
      *   *
      *   *
* * * * * * *
*     *
*     *
* * * *   * *
```

### 💡 Hint

Print stars based on:

* Middle row
* Middle column
* Four arms

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Conditions, Pattern Logic

> **Note:** This is a traditional geometric pattern commonly used in programming practice. Its appearance is purely for algorithmic learning.

---

# 38. Hollow Swastik Pattern

### 📝 Problem Statement

Print a hollow Swastik pattern.

### 📌 Example Input

```text
7
```

### 📤 Expected Output

```text
* * * *   * *
      *   *
      *   *
* * * * * * *
*     *
*     *
* * * *   * *
```

### 💡 Hint

Print only boundary stars for each arm.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Nested Loops, Conditions

---

# 39. Concentric Star Square

### 📝 Problem Statement

Print concentric square layers using stars.

### 📌 Example Input

```text
5
```

### 📤 Expected Output

```text
* * * * * * * * *
*               *
*   * * * * *   *
*   *       *   *
*   *   *   *   *
*   *       *   *
*   * * * * *   *
*               *
* * * * * * * * *
```

### 💡 Hint

Think in terms of multiple square boundaries.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Matrix, Boundary Logic

---

# 40. Recursive Star Triangle

### 📝 Problem Statement

Print a recursive star triangle (Sierpiński-style concept or recursively divided triangle).

### 📌 Example Input

```text
3 Levels
```

### 📤 Expected Output

```text
      *
     * *
    *   *
   * * * *
  *       *
 * *     * *
* * * * * * *
```

### 💡 Hint

* Solve using recursion.
* Divide the problem into smaller triangles.

### ⏱ Difficulty

🔴 Hard

### 🏷 Tags

Recursion, Divide and Conquer, Pattern Programming

---