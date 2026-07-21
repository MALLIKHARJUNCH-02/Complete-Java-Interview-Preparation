# JavaScript Interview Master Handbook
# Part 5B.2A – Searching, Sorting & Modern Immutable Methods

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. indexOf()
2. lastIndexOf()
3. includes()
4. find()
5. findIndex()
6. findLast()
7. findLastIndex()
8. reverse()
9. sort()
10. Numeric Sorting
11. Custom Comparators
12. Interview Questions
13. Output Questions
14. Cheat Sheet

---

# 1. indexOf()

Returns the index of the first matching element.

If not found

↓

Returns

```
-1
```

Example

```javascript
const arr = [10,20,30,20];

console.log(arr.indexOf(20));
```

Output

```
1
```

---

Not Found

```javascript
console.log(arr.indexOf(100));
```

Output

```
-1
```

Time Complexity

```
O(n)
```

---

# 2. lastIndexOf()

Searches from the end.

```javascript
const arr = [10,20,30,20];

console.log(arr.lastIndexOf(20));
```

Output

```
3
```

---

# Difference

```
indexOf()

↓

First Match

lastIndexOf()

↓

Last Match
```

---

# 3. includes()

Checks whether an element exists.

Returns

```
true

false
```

Example

```javascript
const arr = [10,20,30];

console.log(arr.includes(20));
```

Output

```
true
```

---

Interview Tip

Use

```javascript
includes()
```

instead of

```javascript
indexOf(...) !== -1
```

when you only need a yes/no answer.

---

# 4. find()

Returns the first element that satisfies a condition.

```javascript
const nums = [5,12,18,7];

const result = nums.find(num => num > 10);

console.log(result);
```

Output

```
12
```

---

If nothing matches

↓

```
undefined
```

---

# 5. findIndex()

Returns the index of the first matching element.

```javascript
const nums = [5,12,18];

console.log(nums.findIndex(n => n > 10));
```

Output

```
1
```

---

If not found

↓

```
-1
```

---

# 6. findLast()

Returns the last matching element.

```javascript
const nums = [5,12,18,7,20];

console.log(nums.findLast(n => n > 10));
```

Output

```
20
```

Requires modern JavaScript environments (ES2023+).

---

# 7. findLastIndex()

Returns the last matching index.

```javascript
const nums = [5,12,18,7,20];

console.log(nums.findLastIndex(n => n > 10));
```

Output

```
4
```

---

# 8. reverse()

Reverses the original array.

```javascript
const arr = [1,2,3];

arr.reverse();

console.log(arr);
```

Output

```
[3,2,1]
```

Mutates

```
YES
```

---

# 9. sort()

Sorts the original array.

Default sorting is **lexicographical (string-based)**.

Example

```javascript
const arr = [100,2,15];

arr.sort();

console.log(arr);
```

Output

```
[100,15,2]
```

Why?

Because numbers are converted to strings and compared alphabetically.

---

# Numeric Sorting

Ascending

```javascript
const arr = [100,2,15];

arr.sort((a,b)=>a-b);

console.log(arr);
```

Output

```
[2,15,100]
```

---

Descending

```javascript
arr.sort((a,b)=>b-a);
```

Output

```
[100,15,2]
```

---

# How Comparator Works

Comparator

```javascript
(a,b)=>a-b
```

If result

```
< 0

↓

a comes first
```

If result

```
> 0

↓

b comes first
```

If result

```
0

↓

keep order
```

---

# Sorting Objects

```javascript
const users = [

    {name:"A", age:30},

    {name:"B", age:20},

    {name:"C", age:25}

];

users.sort((a,b)=>a.age-b.age);

console.log(users);
```

Output

```
B

C

A
```

(sorted by age)

---

# String Sorting

```javascript
const names = ["John","Alice","Bob"];

names.sort();

console.log(names);
```

Output

```
["Alice","Bob","John"]
```

---

Case-Insensitive Sorting

```javascript
names.sort((a,b)=>
    a.localeCompare(b)
);
```

`localeCompare()` is also useful for locale-aware sorting.

---

# Time Complexity

| Method | Mutates? | Complexity |
|---------|----------|-----------:|
| indexOf | ❌ | O(n) |
| lastIndexOf | ❌ | O(n) |
| includes | ❌ | O(n) |
| find | ❌ | O(n) |
| findIndex | ❌ | O(n) |
| findLast | ❌ | O(n) |
| findLastIndex | ❌ | O(n) |
| reverse | ✅ | O(n) |
| sort | ✅ | Typically O(n log n)\* |

\*The ECMAScript specification does not mandate a specific sorting algorithm.

---

# Frequently Asked Interview Questions

1. Difference between `indexOf()` and `includes()`?

2. Difference between `find()` and `filter()`?

3. Difference between `find()` and `findIndex()`?

4. Difference between `findLast()` and `find()`?

5. Why does `sort()` fail for numbers by default?

6. How do you sort numbers correctly?

7. How do you sort in descending order?

8. How do you sort objects?

9. Does `reverse()` modify the array?

10. Does `sort()` modify the array?

11. Which methods return `-1`?

12. Which methods return `undefined`?

13. Which methods return `true/false`?

14. What does `localeCompare()` do?

15. Why is `includes()` usually more readable than `indexOf() !== -1`?

---

# Output Questions

## Q1

```javascript
console.log([10,20,30].indexOf(20));
```

Output

```
1
```

---

## Q2

```javascript
console.log([10,20].includes(30));
```

Output

```
false
```

---

## Q3

```javascript
console.log([5,12,8].find(x=>x>10));
```

Output

```
12
```

---

## Q4

```javascript
console.log([5,12,8].findIndex(x=>x>10));
```

Output

```
1
```

---

## Q5

```javascript
const arr=[100,2,15];

arr.sort();

console.log(arr);
```

Output

```
[100,15,2]
```

---

## Q6

```javascript
const arr=[100,2,15];

arr.sort((a,b)=>a-b);

console.log(arr);
```

Output

```
[2,15,100]
```

---

## Q7

```javascript
const arr=[1,2,3];

arr.reverse();

console.log(arr);
```

Output

```
[3,2,1]
```

---

## Q8

```javascript
console.log([1,2,3].find(x=>x>10));
```

Output

```
undefined
```

---

## Q9

```javascript
console.log([1,2,3].findIndex(x=>x>10));
```

Output

```
-1
```

---

## Q10

```javascript
console.log([1,2,3].lastIndexOf(2));
```

Output

```
1
```

---

# Coding Problems

1. Find the first even number.
2. Find the last odd number.
3. Find the index of the first negative number.
4. Check whether an array contains duplicates.
5. Sort an array in ascending order.
6. Sort an array in descending order.
7. Sort an array of student objects by marks.
8. Find the youngest employee.
9. Reverse an array without using `reverse()`.
10. Find the highest salary object.

---

# Cheat Sheet

```javascript
// Search
arr.indexOf(x);
arr.lastIndexOf(x);
arr.includes(x);

// Find
arr.find(fn);
arr.findIndex(fn);
arr.findLast(fn);
arr.findLastIndex(fn);

// Reverse
arr.reverse();

// Sort
arr.sort();

// Numeric
arr.sort((a,b)=>a-b);

// Descending
arr.sort((a,b)=>b-a);

// Objects
users.sort((a,b)=>a.age-b.age);
```

---

# Quick Revision

- `indexOf()` returns the first matching index.
- `lastIndexOf()` returns the last matching index.
- `includes()` returns a boolean.
- `find()` returns the first matching element.
- `findIndex()` returns the first matching index.
- `findLast()` and `findLastIndex()` search from the end.
- `reverse()` mutates the array.
- `sort()` mutates the array.
- Default `sort()` is lexicographical.
- Use a comparator (`a - b`) for numeric sorting.

---