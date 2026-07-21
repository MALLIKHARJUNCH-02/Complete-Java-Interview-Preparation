# JavaScript Interview Master Handbook
# Part 5B.1 – Array Methods (Core Methods)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Mutating vs Non-Mutating Methods
2. push()
3. pop()
4. shift()
5. unshift()
6. slice()
7. splice()
8. concat()
9. join()
10. at()
11. Time Complexity
12. Interview Questions
13. Output Questions
14. Cheat Sheet

---

# 1. Mutating vs Non-Mutating Methods

## Mutating Methods

These modify the original array.

Examples

- push()
- pop()
- shift()
- unshift()
- splice()
- reverse()
- sort()
- fill()
- copyWithin()

---

## Non-Mutating Methods

These return a new value or array.

Examples

- slice()
- concat()
- join()
- includes()
- indexOf()
- map()
- filter()
- reduce()
- toSorted()
- toReversed()
- toSpliced()

---

Interview Tip

Always mention whether a method modifies the original array.

---

# 2. push()

Adds one or more elements to the end of an array.

Syntax

```javascript
arr.push(element1, element2);
```

Example

```javascript
const arr = [10, 20];

arr.push(30);

console.log(arr);
```

Output

```
[10,20,30]
```

Return Value

Returns the new array length.

```javascript
const len = arr.push(40);

console.log(len);
```

Output

```
4
```

Time Complexity

```
O(1) amortized
```

---

# 3. pop()

Removes the last element.

```javascript
const arr = [10,20,30];

const value = arr.pop();

console.log(value);
```

Output

```
30
```

Array

```
[10,20]
```

Time Complexity

```
O(1)
```

---

# 4. shift()

Removes the first element.

```javascript
const arr = [10,20,30];

arr.shift();

console.log(arr);
```

Output

```
[20,30]
```

Reason

Remaining elements are reindexed.

Time Complexity

```
O(n)
```

---

# 5. unshift()

Adds one or more elements at the beginning.

```javascript
const arr = [20,30];

arr.unshift(10);

console.log(arr);
```

Output

```
[10,20,30]
```

Time Complexity

```
O(n)
```

---

# 6. slice()

Creates a shallow copy of part of an array.

Original array is NOT modified.

Syntax

```javascript
arr.slice(start, end);
```

The end index is **not included**.

Example

```javascript
const arr = [10,20,30,40,50];

console.log(arr.slice(1,4));
```

Output

```
[20,30,40]
```

Original

```
[10,20,30,40,50]
```

Still unchanged.

---

Negative Index

```javascript
const arr = [10,20,30,40];

console.log(arr.slice(-2));
```

Output

```
[30,40]
```

---

# 7. splice()

Adds, removes, or replaces elements.

Modifies the original array.

Syntax

```javascript
arr.splice(start, deleteCount, item1, item2);
```

---

Remove

```javascript
const arr = [10,20,30,40];

arr.splice(1,2);

console.log(arr);
```

Output

```
[10,40]
```

---

Insert

```javascript
const arr = [10,30];

arr.splice(1,0,20);

console.log(arr);
```

Output

```
[10,20,30]
```

---

Replace

```javascript
const arr = [10,20,30];

arr.splice(1,1,99);

console.log(arr);
```

Output

```
[10,99,30]
```

---

Interview Question

Difference

```
slice

splice
```

| slice | splice |
|--------|---------|
| Doesn't modify original | Modifies original |
| Returns copied portion | Returns removed elements |
| Safe | Destructive |

---

# 8. concat()

Merges arrays.

Returns a new array.

```javascript
const a = [1,2];

const b = [3,4];

console.log(a.concat(b));
```

Output

```
[1,2,3,4]
```

Original arrays remain unchanged.

---

# 9. join()

Converts an array into a string.

```javascript
const arr = ["A","B","C"];

console.log(arr.join("-"));
```

Output

```
A-B-C
```

Default separator

```
,
```

---

# 10. at()

Accesses elements using positive or negative indexes.

```javascript
const arr = [10,20,30];

console.log(arr.at(-1));
```

Output

```
30
```

Equivalent

```javascript
arr[arr.length-1]
```

But `at(-1)` is cleaner.

---

# Time Complexity

| Method | Mutates? | Complexity |
|---------|----------|-----------:|
| push | ✅ | O(1) amortized |
| pop | ✅ | O(1) |
| shift | ✅ | O(n) |
| unshift | ✅ | O(n) |
| slice | ❌ | O(k) (k = copied elements) |
| splice | ✅ | O(n) |
| concat | ❌ | O(n + m) |
| join | ❌ | O(n) |
| at | ❌ | O(1) |

---

# Frequently Asked Interview Questions

1. Difference between push() and unshift()?

2. Difference between pop() and shift()?

3. Difference between slice() and splice()?

4. Which methods modify the original array?

5. What does push() return?

6. What does pop() return?

7. Can splice() insert elements?

8. Can splice() replace elements?

9. Which is faster: push() or unshift()?

10. Why is shift() slower than pop()?

11. Why is unshift() slower than push()?

12. What does join() return?

13. Difference between concat() and push()?

14. What is at()?

15. Why use at(-1)?

---

# Output Questions

## Q1

```javascript
const arr = [1,2];

arr.push(3);

console.log(arr);
```

Output

```
[1,2,3]
```

---

## Q2

```javascript
const arr = [1,2,3];

console.log(arr.pop());
```

Output

```
3
```

---

## Q3

```javascript
const arr = [1,2,3];

console.log(arr.shift());
```

Output

```
1
```

---

## Q4

```javascript
const arr = [2,3];

arr.unshift(1);

console.log(arr);
```

Output

```
[1,2,3]
```

---

## Q5

```javascript
const arr = [10,20,30,40];

console.log(arr.slice(1,3));
```

Output

```
[20,30]
```

---

## Q6

```javascript
const arr = [10,20,30];

arr.splice(1,1);

console.log(arr);
```

Output

```
[10,30]
```

---

## Q7

```javascript
const arr = [10,20];

arr.splice(1,0,15);

console.log(arr);
```

Output

```
[10,15,20]
```

---

## Q8

```javascript
const a = [1,2];

const b = [3,4];

console.log(a.concat(b));
```

Output

```
[1,2,3,4]
```

---

## Q9

```javascript
const arr = ["JS","HTML","CSS"];

console.log(arr.join(" | "));
```

Output

```
JS | HTML | CSS
```

---

## Q10

```javascript
const arr = [10,20,30];

console.log(arr.at(-1));
```

Output

```
30
```

---

# Coding Problems

1. Implement your own `push()` (without using `push()`).
2. Remove the last element without using `pop()`.
3. Insert an element at the beginning without using `unshift()`.
4. Remove the first element without using `shift()`.
5. Extract the last three elements using `slice()`.
6. Replace all occurrences of a value using `splice()`.
7. Merge three arrays without modifying the originals.
8. Convert an array into a comma-separated string.
9. Convert an array into a sentence using `join()`.
10. Print the last element using `at()`.

---

# Cheat Sheet

```javascript
// Add to end
arr.push(x);

// Remove from end
arr.pop();

// Add to beginning
arr.unshift(x);

// Remove from beginning
arr.shift();

// Copy part
arr.slice(start, end);

// Insert/Remove/Replace
arr.splice(start, deleteCount, ...items);

// Merge
arr.concat(arr2);

// String
arr.join(",");

// Last element
arr.at(-1);
```

---

# Quick Revision

- `push()` → add to end (mutates).
- `pop()` → remove from end (mutates).
- `shift()` → remove from beginning (mutates, O(n)).
- `unshift()` → add to beginning (mutates, O(n)).
- `slice()` → copy without modifying.
- `splice()` → add/remove/replace while modifying.
- `concat()` → merge arrays without changing originals.
- `join()` → convert array to string.
- `at(-1)` → cleaner way to access the last element.

---