# JavaScript Interview Master Handbook
# Part 5C.1 – Functional Array Methods (Core)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Functional Programming
2. forEach()
3. map()
4. filter()
5. reduce()
6. reduceRight()
7. Method Comparison
8. Time Complexity
9. Best Practices
10. Interview Questions
11. Output Questions
12. Coding Problems
13. Cheat Sheet

---

# 1. Functional Programming

Functional array methods allow us to process arrays **without manually writing loops**.

Instead of

```javascript
for(let i = 0; i < arr.length; i++) {
    // process
}
```

Use

```javascript
arr.map(...)
```

or

```javascript
arr.filter(...)
```

Benefits

✔ Cleaner

✔ More readable

✔ Easier to maintain

✔ Chainable

---

# 2. forEach()

## Definition

Executes a callback once for every element.

Returns

```
undefined
```

It is mainly used for **side effects** like logging or updating external state.

---

Syntax

```javascript
array.forEach((value, index, array) => {

});
```

---

Example

```javascript
const nums = [10,20,30];

nums.forEach(num => {
    console.log(num);
});
```

Output

```
10
20
30
```

---

Parameters

```javascript
nums.forEach((value, index, array)=>{

});
```

| Parameter | Meaning |
|-----------|---------|
| value | Current element |
| index | Current index |
| array | Original array |

---

Return Value

```javascript
const result = nums.forEach(x => x * 2);

console.log(result);
```

Output

```
undefined
```

---

Interview Tip

`forEach()` is **not** used to transform arrays.

Use

```
map()
```

instead.

---

# 3. map()

## Definition

Creates a **new array** by transforming every element.

Original array remains unchanged.

---

Syntax

```javascript
array.map((value,index,array)=>{

});
```

---

Example

```javascript
const nums = [1,2,3];

const doubled = nums.map(num => num * 2);

console.log(doubled);
```

Output

```
[2,4,6]
```

Original

```
[1,2,3]
```

---

Real Life

Students

↓

Marks

↓

Add Grace Marks

↓

New Marks Array

---

Interview Tip

Always returns an array of the **same length**.

---

# 4. filter()

## Definition

Creates a new array containing only elements that satisfy a condition.

---

Example

```javascript
const nums = [10,15,20,25];

const even = nums.filter(num => num % 2 === 0);

console.log(even);
```

Output

```
[10,20]
```

---

Length

May be

- Smaller
- Same
- Empty

---

Example

```javascript
const arr = [1,3,5];

console.log(arr.filter(x => x % 2 === 0));
```

Output

```
[]
```

---

# 5. reduce()

## Definition

Reduces an array to a **single value**.

---

Syntax

```javascript
array.reduce(
    (accumulator,current)=>{},
    initialValue
);
```

---

Example

```javascript
const nums = [1,2,3,4];

const sum = nums.reduce(
    (acc,cur)=>acc+cur,
    0
);

console.log(sum);
```

Output

```
10
```

---

Accumulator Flow

```
0

↓

1

↓

3

↓

6

↓

10
```

---

Find Maximum

```javascript
const nums = [4,8,2,10];

const max = nums.reduce(
    (acc,cur)=>Math.max(acc,cur)
);

console.log(max);
```

Output

```
10
```

---

Count Occurrences

```javascript
const fruits = ["A","B","A","C","A"];

const count = fruits.reduce((acc,item)=>{

    acc[item] = (acc[item] || 0) + 1;

    return acc;

}, {});

console.log(count);
```

Output

```javascript
{
    A:3,
    B:1,
    C:1
}
```

---

# 6. reduceRight()

Works exactly like reduce()

Difference

↓

Processes from

```
Right

↓

Left
```

Example

```javascript
const arr = ["A","B","C"];

console.log(

arr.reduceRight(

(acc,cur)=>acc+cur

)

);
```

Output

```
CBA
```

---

# Method Comparison

| Method | Returns | Changes Original | Purpose |
|---------|----------|------------------|----------|
| forEach | undefined | No | Side effects |
| map | New Array | No | Transform |
| filter | New Array | No | Select |
| reduce | Single Value | No | Aggregate |
| reduceRight | Single Value | No | Aggregate (reverse direction) |

---

# Time Complexity

| Method | Complexity |
|---------|-----------:|
| forEach | O(n) |
| map | O(n) |
| filter | O(n) |
| reduce | O(n) |
| reduceRight | O(n) |

---

# Best Practices

✔ Use

```
map()
```

for transformations.

---

✔ Use

```
filter()
```

for selections.

---

✔ Use

```
reduce()
```

for aggregation.

---

✔ Use

```
forEach()
```

for logging, DOM updates, API calls, or other side effects.

---

Avoid

```javascript
map(() => console.log())
```

Use

```
forEach()
```

instead.

---

# Common Mistakes

❌ Using

```javascript
forEach()
```

expecting a returned array.

---

❌ Forgetting to return inside

```javascript
map()
```

Example

```javascript
const nums = [1,2,3];

const result = nums.map(x=>{

    x*2;

});

console.log(result);
```

Output

```
[undefined,undefined,undefined]
```

Correct

```javascript
nums.map(x=>x*2);
```

or

```javascript
nums.map(x=>{

    return x*2;

});
```

---

❌ Forgetting the initial value in

```javascript
reduce()
```

when appropriate, especially for empty arrays.

---

# Frequently Asked Interview Questions

1. Difference between forEach() and map()?

2. Difference between map() and filter()?

3. Difference between filter() and find()?

4. Difference between reduce() and reduceRight()?

5. Which method returns undefined?

6. Which method always returns an array?

7. Which method returns a single value?

8. Can map() change array length?

Answer

No.

It always returns the same number of elements.

9. Which method should you use for summation?

Answer

```
reduce()
```

10. Which method should you use to remove unwanted elements?

Answer

```
filter()
```

---

# Output Questions

## Q1

```javascript
const arr = [1,2,3];

const result = arr.forEach(x=>x*2);

console.log(result);
```

Output

```
undefined
```

---

## Q2

```javascript
const arr = [1,2,3];

console.log(

arr.map(x=>x*2)

);
```

Output

```
[2,4,6]
```

---

## Q3

```javascript
const arr = [1,2,3,4];

console.log(

arr.filter(x=>x%2===0)

);
```

Output

```
[2,4]
```

---

## Q4

```javascript
const arr = [1,2,3];

console.log(

arr.reduce((a,b)=>a+b,0)

);
```

Output

```
6
```

---

## Q5

```javascript
const arr = ["A","B","C"];

console.log(

arr.reduceRight(

(a,b)=>a+b

)

);
```

Output

```
CBA
```

---

## Q6

```javascript
const arr = [1,2];

const result = arr.map(x=>{

    return x+1;

});

console.log(result);
```

Output

```
[2,3]
```

---

## Q7

```javascript
const arr = [1,2,3];

const result = arr.filter(x=>x>5);

console.log(result);
```

Output

```
[]
```

---

## Q8

```javascript
const arr = [10,20];

arr.forEach((value,index)=>{

    console.log(index,value);

});
```

Output

```
0 10
1 20
```

---

# Coding Problems

## Beginner

1. Double every number using map().

2. Convert names to uppercase.

3. Find all even numbers.

4. Find all odd numbers.

5. Calculate the total sum.

---

## Intermediate

6. Count word frequency using reduce().

7. Find the longest string.

8. Find the average marks.

9. Group employees by department.

10. Remove duplicate values using reduce().

---

## Advanced

11. Implement map() manually.

12. Implement filter() manually.

13. Implement reduce() manually.

14. Chain map() and filter().

15. Flatten nested arrays using reduce().

---

# Cheat Sheet

```javascript
// forEach
arr.forEach(fn);

// map
const newArr = arr.map(fn);

// filter
const filtered = arr.filter(fn);

// reduce
const result = arr.reduce(fn, initialValue);

// reduceRight
const result = arr.reduceRight(fn, initialValue);
```

---

# Quick Revision

✔ `forEach()` → side effects, returns `undefined`.

✔ `map()` → transforms every element, returns a new array of the same length.

✔ `filter()` → selects matching elements, returns a new array.

✔ `reduce()` → combines all elements into a single value.

✔ `reduceRight()` → same as `reduce()`, but processes from right to left.

✔ None of these methods modify the original array.

✔ Always provide an initial value to `reduce()` when possible to avoid edge cases.

---