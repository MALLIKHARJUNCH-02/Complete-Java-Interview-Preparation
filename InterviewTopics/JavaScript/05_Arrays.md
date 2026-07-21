# JavaScript Interview Master Handbook
# Part 5A – Arrays (Fundamentals)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is an Array?
2. Why Arrays?
3. Characteristics
4. Creating Arrays
5. Accessing Elements
6. Updating Elements
7. Traversing Arrays
8. Array Length
9. Multidimensional Arrays
10. Arrays vs Objects
11. Common Mistakes
12. Interview Questions
13. Output Questions
14. Cheat Sheet

---

# 1. What is an Array?

## Definition

An Array is an ordered collection of values stored in a single variable.

Arrays allow us to store multiple related values together.

Example

```javascript
const fruits = [
    "Apple",
    "Banana",
    "Orange"
];
```

---

Real-Life Analogy

Instead of creating

```
student1

student2

student3
```

Use

```
students[]

↓

Mallik

↓

Rahul

↓

Kiran
```

---

# 2. Why Arrays?

Without Array

```javascript
let s1 = "Mallik";
let s2 = "Rahul";
let s3 = "Kiran";
```

With Array

```javascript
const students = [
    "Mallik",
    "Rahul",
    "Kiran"
];
```

Benefits

✔ Organized

✔ Easy Iteration

✔ Easy Searching

✔ Easy Sorting

✔ Better Memory Management

---

# 3. Characteristics of Arrays

✔ Ordered

✔ Zero-based Indexing

✔ Dynamic Size

✔ Can Store Mixed Types

✔ Objects are Reference Types

---

Example

```javascript
const arr = [
    10,
    "Hello",
    true,
    {},
    []
];
```

Valid JavaScript array.

---

# 4. Creating Arrays

## Method 1 (Recommended)

```javascript
const nums = [1,2,3];
```

---

## Method 2

```javascript
const nums = new Array(1,2,3);
```

---

## Method 3

Empty Array

```javascript
const arr = [];
```

---

Interview Question

Which method is preferred?

Answer

```
[]
```

Array literal.

---

# 5. Accessing Elements

```javascript
const colors = [
    "Red",
    "Green",
    "Blue"
];
```

Access

```javascript
colors[0];
```

Output

```
Red
```

---

Last Element

```javascript
colors[colors.length - 1];
```

Output

```
Blue
```

---

# 6. Updating Elements

```javascript
const arr = [10,20,30];

arr[1] = 50;

console.log(arr);
```

Output

```
[10,50,30]
```

---

# 7. Traversing Arrays

## for Loop

```javascript
const arr = [10,20,30];

for(let i=0;i<arr.length;i++){

    console.log(arr[i]);

}
```

---

## for...of

```javascript
for(const value of arr){

    console.log(value);

}
```

---

## forEach

```javascript
arr.forEach(value=>{

    console.log(value);

});
```

---

Interview Question

Difference

```
for

for...of

forEach
```

| for | for...of | forEach |
|------|-----------|----------|
| Full control | Easy iteration | Callback based |
| break/continue | break works | cannot break |

---

# 8. Array Length

```javascript
const arr = [10,20,30];

console.log(arr.length);
```

Output

```
3
```

---

Change Length

```javascript
arr.length = 2;

console.log(arr);
```

Output

```
[10,20]
```

---

Increase Length

```javascript
const arr = [1,2];

arr.length = 5;

console.log(arr);
```

Output

```
[1,2,<empty × 3>]
```

---

# 9. Multidimensional Arrays

2D Array

```javascript
const matrix = [

    [1,2],

    [3,4]

];
```

Access

```javascript
matrix[1][0]
```

Output

```
3
```

---

3D Array

```javascript
const cube = [

    [

        [1]

    ]

];
```

---

# 10. Arrays vs Objects

| Array | Object |
|---------|---------|
| Ordered | Key-value |
| Numeric Index | Named Keys |
| Iteration | Property Access |

---

Example

Array

```javascript
const arr = [

    "Mallik",

    23

];
```

Object

```javascript
const obj = {

    name:"Mallik",

    age:23

};
```

---

# Array Internals

```
Index

↓

0

↓

1

↓

2

↓

3
```

---

Memory Representation

```
arr

↓

0 → 10

↓

1 → 20

↓

2 → 30
```

---

# Best Practices

✔ Prefer array literals

✔ Use descriptive names

✔ Use const when reference doesn't change

✔ Prefer for...of for simple iteration

✔ Use array methods for transformations

---

# Common Mistakes

❌ Accessing invalid index

```javascript
arr[100]
```

↓

undefined

---

❌ Using

```javascript
for...in
```

for arrays.

Prefer

```
for...of
```

---

❌ Comparing arrays using

```javascript
==
```

or

```javascript
===
```

Arrays are compared by reference.

---

# Frequently Asked Interview Questions

1. What is an array?

2. Difference between array and object?

3. Why arrays are zero-indexed?

4. Different ways to create arrays?

5. Which array creation method is preferred?

6. How to access last element?

7. How to traverse arrays?

8. Difference between for and forEach?

9. Difference between forEach and for...of?

10. Can arrays store different data types?

11. Are arrays objects?

Answer

Yes.

Arrays are specialized objects.

12. How does array length work?

13. Can array length be changed?

14. Difference between sparse arrays and dense arrays?

15. Why avoid for...in for arrays?

---

# Output Questions

## Q1

```javascript
const arr = [10,20,30];

console.log(arr[1]);
```

Output

```
20
```

---

## Q2

```javascript
const arr = [10];

console.log(arr[5]);
```

Output

```
undefined
```

---

## Q3

```javascript
const arr = [1,2];

arr.length = 5;

console.log(arr.length);
```

Output

```
5
```

---

## Q4

```javascript
const arr = [1,2,3];

arr.length = 1;

console.log(arr);
```

Output

```
[1]
```

---

## Q5

```javascript
const arr = [];

arr[3] = 100;

console.log(arr.length);
```

Output

```
4
```

Reason

Highest assigned index is 3.

Length becomes

```
4
```

---

## Q6

```javascript
console.log(typeof []);
```

Output

```
object
```

---

## Q7

```javascript
console.log(Array.isArray([]));
```

Output

```
true
```

---

## Q8

```javascript
console.log([] === []);
```

Output

```
false
```

Reason

Different references.

---

# Coding Problems

## Problem 1

Print every element of an array.

---

## Problem 2

Find the largest element.

---

## Problem 3

Find the smallest element.

---

## Problem 4

Calculate the sum of all elements.

---

## Problem 5

Calculate the average.

---

## Problem 6

Reverse an array without using `reverse()`.

---

## Problem 7

Copy an array.

---

## Problem 8

Merge two arrays.

---

## Problem 9

Find the second largest element.

---

## Problem 10

Remove duplicate elements.

---

# Time Complexity

| Operation | Complexity |
|------------|-----------:|
| Access by Index | O(1) |
| Update by Index | O(1) |
| Search | O(n) |
| Insert at End (`push`) | O(1) *amortized* |
| Remove from End (`pop`) | O(1) |
| Insert at Beginning (`unshift`) | O(n) |
| Remove from Beginning (`shift`) | O(n) |

---

# Cheat Sheet

```javascript
// Create
const arr = [1,2,3];

// Access
arr[0];

// Update
arr[1] = 10;

// Length
arr.length;

// Last Element
arr[arr.length-1];

// Check Array
Array.isArray(arr);

// Loop
for(const x of arr){}

// Loop
arr.forEach(x=>console.log(x));
```

---

# Quick Revision

✔ Arrays store ordered collections.

✔ Arrays use zero-based indexing.

✔ Arrays are objects.

✔ Prefer array literals (`[]`).

✔ `Array.isArray()` checks if a value is an array.

✔ Arrays are compared by reference.

✔ Use `for...of` or array methods for iteration.

✔ `push()` and `pop()` are efficient at the end of an array.

✔ `shift()` and `unshift()` are slower because they reindex elements.

---