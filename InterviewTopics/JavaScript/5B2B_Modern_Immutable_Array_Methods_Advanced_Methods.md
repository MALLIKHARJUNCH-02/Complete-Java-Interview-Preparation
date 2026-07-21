# JavaScript Interview Master Handbook
# Part 5B.2B – Modern Immutable Array Methods & Advanced Array Methods

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. fill()
2. copyWithin()
3. toSorted()
4. toReversed()
5. toSpliced()
6. with()
7. Mutable vs Immutable Methods
8. Browser Compatibility
9. Performance Considerations
10. Interview Questions
11. Output Questions
12. Coding Problems
13. Cheat Sheet

---

# 1. fill()

## Definition

`fill()` replaces array elements with a static value.

It **modifies the original array**.

---

## Syntax

```javascript
arr.fill(value, start, end);
```

- value → value to insert
- start → starting index (inclusive)
- end → ending index (exclusive)

---

## Fill Entire Array

```javascript
const arr = [1,2,3,4];

arr.fill(0);

console.log(arr);
```

Output

```
[0,0,0,0]
```

---

## Fill Part of an Array

```javascript
const arr = [1,2,3,4];

arr.fill(9,1,3);

console.log(arr);
```

Output

```
[1,9,9,4]
```

---

## Time Complexity

```
O(n)
```

---

# 2. copyWithin()

## Definition

Copies a portion of the array **within the same array**.

It **does not change the array length**.

It **modifies the original array**.

---

## Syntax

```javascript
arr.copyWithin(target, start, end);
```

---

Example

```javascript
const arr = [1,2,3,4,5];

arr.copyWithin(0,3);

console.log(arr);
```

Output

```
[4,5,3,4,5]
```

Explanation

```
Copy

4 5

↓

Paste at index 0
```

---

# 3. toSorted()

Introduced in **ES2023**.

Returns a **new sorted array**.

Original array remains unchanged.

---

Example

```javascript
const arr = [100,2,15];

const sorted = arr.toSorted((a,b)=>a-b);

console.log(sorted);
```

Output

```
[2,15,100]
```

Original

```
[100,2,15]
```

---

Comparison

```javascript
sort()
```

↓

Mutates

```javascript
toSorted()
```

↓

Immutable

---

# 4. toReversed()

Returns a **new reversed array**.

Original array is unchanged.

---

Example

```javascript
const arr = [1,2,3];

const rev = arr.toReversed();

console.log(rev);
```

Output

```
[3,2,1]
```

Original

```
[1,2,3]
```

---

# 5. toSpliced()

Immutable version of `splice()`.

---

Example

```javascript
const arr = [1,2,3,4];

const result = arr.toSpliced(1,2);

console.log(result);
```

Output

```
[1,4]
```

Original

```
[1,2,3,4]
```

---

# 6. with()

Creates a copy with one element replaced.

Original array remains unchanged.

---

Example

```javascript
const arr = [10,20,30];

const result = arr.with(1,99);

console.log(result);
```

Output

```
[10,99,30]
```

Original

```
[10,20,30]
```

---

Negative Index

```javascript
const arr = [10,20,30];

console.log(arr.with(-1,100));
```

Output

```
[10,20,100]
```

---

# Mutable vs Immutable

## Mutable

Modify original array.

| Method |
|---------|
| push() |
| pop() |
| shift() |
| unshift() |
| splice() |
| reverse() |
| sort() |
| fill() |
| copyWithin() |

---

## Immutable

Return a new array.

| Method |
|---------|
| slice() |
| concat() |
| map() |
| filter() |
| reduce() |
| toSorted() |
| toReversed() |
| toSpliced() |
| with() |

---

# Why Immutable Methods?

Example

```javascript
const state = ["HTML","CSS"];

const updated = state.toSorted();
```

Original

```
["HTML","CSS"]
```

still exists.

---

Benefits

✔ Safer code

✔ Easier debugging

✔ Better React state updates

✔ Predictable behavior

---

# Browser Compatibility

| Method | ES Version |
|---------|------------|
| fill | ES6 |
| copyWithin | ES6 |
| toSorted | ES2023 |
| toReversed | ES2023 |
| toSpliced | ES2023 |
| with | ES2023 |

---

Interview Tip

Modern evergreen browsers support these methods, but older browsers may require transpilation or polyfills.

---

# Performance Considerations

### Mutating Methods

Usually allocate less memory because they reuse the same array.

---

### Immutable Methods

Create a new array.

More memory usage

↓

Safer

↓

Preferred in React

---

# Frequently Asked Interview Questions

1. What does `fill()` do?

2. Does `fill()` modify the original array?

3. What does `copyWithin()` do?

4. Does `copyWithin()` change array length?

5. Difference between `sort()` and `toSorted()`?

6. Difference between `reverse()` and `toReversed()`?

7. Difference between `splice()` and `toSpliced()`?

8. What does `with()` do?

9. Which methods are immutable?

10. Why are immutable methods preferred in React?

11. Which ES version introduced `toSorted()`?

12. Can `with()` use negative indexes?

13. Does `copyWithin()` create a new array?

14. Which methods return new arrays?

15. Which methods mutate existing arrays?

---

# Output Questions

## Q1

```javascript
const arr = [1,2,3];

arr.fill(5);

console.log(arr);
```

Output

```
[5,5,5]
```

---

## Q2

```javascript
const arr = [1,2,3,4];

arr.fill(0,1,3);

console.log(arr);
```

Output

```
[1,0,0,4]
```

---

## Q3

```javascript
const arr = [1,2,3,4];

arr.copyWithin(2,0,2);

console.log(arr);
```

Output

```
[1,2,1,2]
```

---

## Q4

```javascript
const arr = [3,1,2];

const sorted = arr.toSorted();

console.log(arr);
```

Output

```
[3,1,2]
```

Original is unchanged.

---

## Q5

```javascript
const arr = [1,2,3];

console.log(arr.toReversed());
```

Output

```
[3,2,1]
```

---

## Q6

```javascript
const arr = [1,2,3];

console.log(arr.with(0,10));
```

Output

```
[10,2,3]
```

---

## Q7

```javascript
const arr = [1,2,3];

console.log(arr.toSpliced(1,1));
```

Output

```
[1,3]
```

---

## Q8

```javascript
const arr = [10,20,30];

const copy = arr.with(-1,99);

console.log(copy);
```

Output

```
[10,20,99]
```

---

## Q9

```javascript
const arr = [5,4,3];

const sorted = arr.toSorted((a,b)=>a-b);

console.log(sorted);
```

Output

```
[3,4,5]
```

---

## Q10

```javascript
const arr = [1,2,3];

arr.copyWithin(1,0);

console.log(arr);
```

Output

```
[1,1,2]
```

---

# Coding Problems

### Beginner

1. Fill an array with zeros.
2. Replace all values with `-1`.
3. Copy the last two elements to the beginning.
4. Reverse an array without modifying the original.
5. Replace one element using `with()`.

---

### Intermediate

6. Create an immutable update for a student marks array.
7. Remove an element without using `splice()`.
8. Sort numbers without changing the original array.
9. Replace the last element immutably.
10. Create a React-style state update using `with()`.

---

### Advanced

11. Implement your own `toReversed()`.
12. Implement your own `toSorted()`.
13. Implement your own `toSpliced()`.
14. Compare mutable vs immutable updates in terms of memory.
15. Benchmark `sort()` vs `toSorted()` on large arrays.

---

# Cheat Sheet

```javascript
// Fill
arr.fill(value);

// Copy Inside
arr.copyWithin(target, start, end);

// Immutable Sort
arr.toSorted(compareFn);

// Immutable Reverse
arr.toReversed();

// Immutable Splice
arr.toSpliced(start, deleteCount, ...items);

// Immutable Replace
arr.with(index, value);
```

---

# Quick Revision

- `fill()` replaces values and **mutates** the array.
- `copyWithin()` copies elements within the same array and **mutates** it.
- `toSorted()` returns a **new sorted array**.
- `toReversed()` returns a **new reversed array**.
- `toSpliced()` is the immutable version of `splice()`.
- `with()` returns a new array with one element replaced.
- Immutable methods are especially useful for React state updates.
- ES2023 introduced `toSorted()`, `toReversed()`, `toSpliced()`, and `with()`.

---