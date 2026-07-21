# JavaScript Interview Master Handbook
# Part 5C.2 – Advanced Functional Array Methods

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. some()
2. every()
3. flat()
4. flatMap()
5. Method Chaining
6. Lazy Evaluation
7. Polyfills
8. Performance
9. Interview Questions
10. Output Questions
11. Coding Problems
12. Cheat Sheet

---

# 1. some()

## Definition

Checks whether **at least one** element satisfies a condition.

Returns

```
true
```

or

```
false
```

---

Syntax

```javascript
array.some((value,index,array)=>{

});
```

---

Example

```javascript
const nums = [2,4,6,7];

const result = nums.some(num => num % 2 !== 0);

console.log(result);
```

Output

```
true
```

---

Example

```javascript
const nums = [2,4,6];

console.log(nums.some(x => x % 2 !== 0));
```

Output

```
false
```

---

Important

Stops immediately after the first match.

This is called **short-circuiting**.

---

# 2. every()

## Definition

Checks whether **all** elements satisfy a condition.

Returns

```
true

false
```

---

Example

```javascript
const nums = [2,4,6];

console.log(

nums.every(x=>x%2===0)

);
```

Output

```
true
```

---

Example

```javascript
const nums = [2,4,5];

console.log(

nums.every(x=>x%2===0)

);
```

Output

```
false
```

---

Difference

```
some()

↓

ANY

every()

↓

ALL
```

---

# 3. flat()

Flattens nested arrays.

---

Depth 1

```javascript
const arr = [1,[2,3],[4,5]];

console.log(arr.flat());
```

Output

```
[1,2,3,4,5]
```

---

Depth 2

```javascript
const arr = [

    1,

    [2,[3]]

];

console.log(

arr.flat(2)

);
```

Output

```
[1,2,3]
```

---

Completely Flatten

```javascript
arr.flat(Infinity);
```

---

# 4. flatMap()

Combination of

```
map()

↓

flat(1)
```

---

Example

```javascript
const words = [

    "hello world",

    "javascript"

];

const result = words.flatMap(

word => word.split(" ")

);

console.log(result);
```

Output

```
["hello","world","javascript"]
```

---

Equivalent

```javascript
arr.map(...).flat();
```

---

Interview Tip

Prefer

```
flatMap()
```

when mapping produces arrays and you immediately want a one-level flatten.

---

# 5. Method Chaining

Methods can be chained.

Example

```javascript
const nums = [1,2,3,4,5];

const result = nums

.filter(x=>x%2===0)

.map(x=>x*10)

.reduce((a,b)=>a+b,0);

console.log(result);
```

Step

```
[1,2,3,4,5]

↓

filter

↓

[2,4]

↓

map

↓

[20,40]

↓

reduce

↓

60
```

Output

```
60
```

---

Benefits

✔ Cleaner

✔ Readable

✔ Functional Style

---

# 6. Lazy Evaluation

Array methods like

```
map()

filter()

```

are **eager**, meaning they process the entire array immediately.

Lazy evaluation means values are computed **only when needed**.

JavaScript's built-in arrays do **not** use lazy evaluation.

Examples of lazy evaluation in JavaScript include:

- Generators (`function*`)
- Iterators
- Some third-party libraries (e.g., Lodash's lazy sequences)

---

Generator Example

```javascript
function* numbers(){

    yield 1;

    yield 2;

    yield 3;

}

const gen = numbers();

console.log(gen.next().value);
```

Output

```
1
```

The remaining values are generated only when requested.

---

# 7. Polyfills

## Polyfill for map()

```javascript
Array.prototype.myMap = function(callback){

    const result = [];

    for(let i = 0; i < this.length; i++){

        result.push(callback(this[i], i, this));

    }

    return result;

};
```

Usage

```javascript
console.log(

[1,2,3].myMap(x=>x*2)

);
```

Output

```
[2,4,6]
```

---

## Polyfill for filter()

```javascript
Array.prototype.myFilter = function(callback){

    const result = [];

    for(let i = 0; i < this.length; i++){

        if(callback(this[i], i, this)){

            result.push(this[i]);

        }

    }

    return result;

};
```

---

## Polyfill for reduce()

```javascript
Array.prototype.myReduce = function(callback, initialValue){

    let accumulator = initialValue;
    let startIndex = 0;

    if (arguments.length < 2) {
        if (this.length === 0) {
            throw new TypeError("Reduce of empty array with no initial value");
        }
        accumulator = this[0];
        startIndex = 1;
    }

    for(let i = startIndex; i < this.length; i++){

        accumulator = callback(accumulator, this[i], i, this);

    }

    return accumulator;

};
```

---

# 8. Performance Comparison

| Method | Complexity |
|---------|-----------:|
| some | O(n) (short-circuits) |
| every | O(n) (short-circuits) |
| flat | O(n) |
| flatMap | O(n) |
| map | O(n) |
| filter | O(n) |
| reduce | O(n) |

---

Memory

```
map()

↓

New Array

filter()

↓

New Array

flat()

↓

New Array

reduce()

↓

Single Value
```

---

# Best Practices

✔ Use

```
some()
```

for existence checks.

---

✔ Use

```
every()
```

for validation.

---

✔ Use

```
flatMap()
```

instead of

```
map().flat()
```

when appropriate.

---

✔ Chain methods for readability, but avoid creating many unnecessary intermediate arrays in performance-critical code.

---

# Common Mistakes

❌ Using

```javascript
filter()[0]
```

instead of

```javascript
find()
```

when you only need the first match.

---

❌ Using

```javascript
some()
```

instead of

```javascript
includes()
```

for primitive values.

Example

```javascript
arr.includes(10);
```

is clearer than

```javascript
arr.some(x=>x===10);
```

---

❌ Deep chains without understanding intermediate results.

---

# Frequently Asked Interview Questions

1. Difference between `some()` and `every()`?

2. Difference between `find()` and `some()`?

3. Difference between `filter()` and `some()`?

4. Difference between `flat()` and `flatMap()`?

5. When should you use `flatMap()`?

6. What is method chaining?

7. What is lazy evaluation?

8. Are array methods lazy?

9. What is a polyfill?

10. Why write a polyfill?

11. How would you implement `map()`?

12. Which methods short-circuit?

13. Which methods always process every element?

14. What is the complexity of `flat()`?

15. Which method is better for validation?

Answer

```
every()
```

---

# Output Questions

## Q1

```javascript
console.log(

[1,2,3].some(x=>x>2)

);
```

Output

```
true
```

---

## Q2

```javascript
console.log(

[2,4,6].every(x=>x%2===0)

);
```

Output

```
true
```

---

## Q3

```javascript
console.log(

[1,[2,[3]]].flat(2)

);
```

Output

```
[1,2,3]
```

---

## Q4

```javascript
console.log(

["a b","c"]

.flatMap(x=>x.split(" "))

);
```

Output

```
["a","b","c"]
```

---

## Q5

```javascript
const result = [1,2,3,4]

.filter(x=>x>2)

.map(x=>x*10);

console.log(result);
```

Output

```
[30,40]
```

---

## Q6

```javascript
console.log(

[1,2,3]

.some(x=>x===5)

);
```

Output

```
false
```

---

## Q7

```javascript
console.log(

[1,2,3]

.every(x=>x<5)

);
```

Output

```
true
```

---

## Q8

```javascript
console.log(

[[1],[2],[3]].flat()

);
```

Output

```
[1,2,3]
```

---

## Q9

```javascript
console.log(

[1,2,3]

.myMap(x=>x+1)

);
```

Output

```
[2,3,4]
```

(assuming the polyfill above has been defined)

---

## Q10

```javascript
console.log(

[1,2,3]

.reduce((a,b)=>a*b,1)

);
```

Output

```
6
```

---

# Coding Problems

## Beginner

1. Check if any student scored above 90.
2. Check if all employees are active.
3. Flatten a 2D array.
4. Split words into characters using `flatMap()`.
5. Validate email list using `every()`.

---

## Intermediate

6. Group products by category.
7. Flatten nested comments.
8. Remove duplicate nested arrays.
9. Build a search using `some()`.
10. Create a shopping cart total using chaining.

---

## Advanced

11. Write a polyfill for `map()`.
12. Write a polyfill for `filter()`.
13. Write a polyfill for `reduce()`.
14. Build a custom `flat()` function.
15. Create your own method-chaining library.

---

# Cheat Sheet

```javascript
// Exists?
arr.some(fn);

// All valid?
arr.every(fn);

// Flatten
arr.flat();

// Map + Flat
arr.flatMap(fn);

// Chaining
arr
  .filter(fn)
  .map(fn)
  .reduce(fn, initialValue);

// Polyfills
Array.prototype.myMap = function(){};
Array.prototype.myFilter = function(){};
Array.prototype.myReduce = function(){};
```

---

# Quick Revision

- `some()` returns `true` if **at least one** element matches.
- `every()` returns `true` only if **all** elements match.
- `flat()` flattens nested arrays.
- `flatMap()` combines `map()` and a one-level `flat()`.
- Method chaining makes code concise and readable.
- Array methods are **eager**, not lazy.
- Generators are an example of lazy evaluation.
- Polyfills are custom implementations of built-in methods.
- `some()` and `every()` can stop early (short-circuit), making them efficient for many use cases.

---