# JavaScript Interview Master Handbook
# Part 8.2A – Memory Management & Garbage Collection

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Why Memory Management?
2. Memory Lifecycle
3. Stack Memory
4. Heap Memory
5. Primitive vs Reference Types
6. Memory Allocation
7. Garbage Collection
8. Mark-and-Sweep Algorithm
9. Reference Counting
10. Memory Leaks
11. Closures and Memory
12. WeakMap
13. WeakSet
14. WeakRef
15. FinalizationRegistry
16. Chrome DevTools Memory Profiling
17. Best Practices
18. Common Mistakes
19. Interview Questions
20. Output Questions
21. Coding Problems
22. Cheat Sheet

---

# 1. Why Memory Management?

Every variable you create occupies memory.

Example

```javascript
let name = "Mallik";

let age = 23;

let arr = [1,2,3];
```

Memory

```
Variables

↓

Memory Allocation

↓

Use

↓

Release

↓

Reuse
```

JavaScript performs most memory management automatically.

---

# 2. Memory Lifecycle

Every object follows four stages.

```
Allocate

↓

Use

↓

Become Unreachable

↓

Garbage Collection
```

Example

```javascript
let user = {

    name: "Mallik"

};

user = null;
```

Now

```
Old Object

↓

No References

↓

Garbage Collector Removes It
```

---

# 3. Stack Memory

Stores

✔ Primitive values

✔ Function calls

✔ Local variables

Fast memory.

---

Example

```javascript
let x = 10;

let y = 20;
```

Stack

```
+------+
| y=20 |
+------+
| x=10 |
+------+
```

---

Function Calls

```javascript
function one(){

    two();

}

function two(){

    console.log("Hi");

}

one();
```

Stack

```
two()

↓

one()

↓

Global
```

After execution

```
Pop

↓

Pop
```

---

Characteristics

✔ Very Fast

✔ Fixed Order

✔ LIFO

✔ Automatically Cleared

---

# 4. Heap Memory

Stores

✔ Objects

✔ Arrays

✔ Functions

✔ Dates

✔ Maps

✔ Sets

Example

```javascript
const user = {

    name:"Mallik"

};
```

Stack

```
user

↓

Reference
```

Heap

```
Object

↓

{name:"Mallik"}
```

---

# Stack vs Heap

| Stack | Heap |
|--------|------|
| Primitive values | Objects |
| Fast | Slower |
| LIFO | Dynamic |
| Automatically freed | Garbage collected |

---

# 5. Primitive vs Reference Types

Primitive

```javascript
let a = 10;

let b = a;

b = 20;

console.log(a);
```

Output

```
10
```

Copied by value.

---

Reference

```javascript
const obj1 = {

    age:20

};

const obj2 = obj1;

obj2.age = 30;

console.log(obj1.age);
```

Output

```
30
```

Copied by reference.

---

Visualization

Primitive

```
a

↓

10

b

↓

10
```

Reference

```
obj1

↓

Object

↑

obj2
```

---

# 6. Memory Allocation

Automatic

```javascript
let name = "Mallik";

let arr = [1,2,3];

let obj = {};
```

JavaScript allocates memory automatically.

---

# 7. Garbage Collection

JavaScript automatically removes unreachable memory.

Example

```javascript
let user = {

    name:"Mallik"

};

user = null;
```

Now

```
Object

↓

Unreachable

↓

Deleted
```

---

Interview Definition

Garbage Collection automatically frees memory occupied by objects that are no longer reachable.

---

# 8. Mark-and-Sweep Algorithm

Modern JavaScript engines primarily use variations of the **Mark-and-Sweep** algorithm.

Step 1

Start from roots

```
Global Object

↓

Window

↓

Global Variables

↓

Call Stack
```

---

Step 2

Mark reachable objects.

```
Global

↓

User

↓

Address

↓

City
```

All marked.

---

Step 3

Sweep

```
Unmarked Objects

↓

Deleted
```

---

Visualization

```
Root

↓

Mark

↓

Reachable

↓

Keep

Unreachable

↓

Delete
```

---

# 9. Reference Counting

Old garbage collectors often relied on reference counting.

Example

```javascript
let a = {};

let b = a;
```

Reference Count

```
2
```

Later

```javascript
a = null;
```

Count

```
1
```

Later

```javascript
b = null;
```

Count

```
0
```

Object can be removed.

---

Problem

Circular references.

```javascript
let a = {};

let b = {};

a.b = b;

b.a = a;
```

Reference counting alone cannot detect that this cycle is unreachable.

Modern engines avoid relying solely on reference counting.

---

# 10. Memory Leaks

Memory Leak

↓

Unused memory

↓

Still referenced

↓

Cannot be collected

---

Example

```javascript
const cache = [];

function save(){

    cache.push(new Array(100000));

}
```

Calling

```javascript
save();
```

many times

↓

Memory keeps increasing.

---

Common Causes

✔ Global Variables

✔ Closures

✔ Timers

✔ Event Listeners

✔ Caches

✔ Detached DOM Nodes (browser)

---

# 11. Closures and Memory

Example

```javascript
function counter(){

    let count = 0;

    return function(){

        count++;

    };

}

const c = counter();
```

The inner function keeps `count` alive.

This is useful, but can retain memory longer than expected if large objects are captured unnecessarily.

---

# 12. WeakMap

Keys must be objects.

```javascript
const wm = new WeakMap();

let user = {};

wm.set(user,"Admin");
```

Later

```javascript
user = null;
```

The key object may be garbage collected.

---

Characteristics

✔ Object keys only

✔ Weak references to keys

✔ Not iterable

---

# 13. WeakSet

Stores objects only.

```javascript
const ws = new WeakSet();

let obj = {};

ws.add(obj);
```

Later

```javascript
obj = null;
```

The object may be garbage collected.

---

# WeakMap vs Map

| Map | WeakMap |
|------|----------|
| Iterable | Not Iterable |
| Any key type | Object keys only |
| Strong references | Weak references to keys |

---

# 14. WeakRef

Provides a weak reference to an object.

```javascript
const obj = {

    name:"Mallik"

};

const ref = new WeakRef(obj);

const value = ref.deref();

console.log(value);
```

`deref()` returns the object if it is still available; otherwise it returns `undefined`.

---

Interview Note

`WeakRef` is an advanced feature and should be used sparingly.

---

# 15. FinalizationRegistry

Allows you to register cleanup callbacks that may run after an object has been garbage collected.

```javascript
const registry =

new FinalizationRegistry((heldValue)=>{

    console.log(heldValue);

});
```

Important

The callback timing is **not predictable**, so this API should **not** be used for essential program logic.

---

# 16. Chrome DevTools Memory Profiling

Chrome DevTools

↓

Memory Tab

↓

Take Heap Snapshot

↓

Compare Snapshots

↓

Find Leaks

---

Useful For

✔ Detecting memory leaks

✔ Finding detached DOM nodes

✔ Monitoring retained objects

---

# 17. Best Practices

✔ Remove event listeners when no longer needed.

✔ Clear timers with `clearTimeout()` / `clearInterval()`.

✔ Avoid unnecessary global variables.

✔ Release large references when appropriate.

✔ Use `WeakMap` for metadata associated with objects.

✔ Profile memory using browser tools.

---

# 18. Common Mistakes

❌ Storing everything in global arrays.

❌ Never clearing intervals.

❌ Keeping unnecessary object references.

❌ Assuming setting one variable to `null` frees an object if other references still exist.

❌ Overusing `WeakRef`.

---

# 19. Frequently Asked Interview Questions

1. What is Stack Memory?

2. What is Heap Memory?

3. Difference between Stack and Heap?

4. What is Garbage Collection?

5. Explain Mark-and-Sweep.

6. What are Garbage Collector roots?

7. What is a memory leak?

8. Common causes of memory leaks?

9. Difference between `Map` and `WeakMap`?

10. Difference between `Set` and `WeakSet`?

11. What is `WeakRef`?

12. What is `FinalizationRegistry`?

13. How do closures affect memory?

14. How do you detect memory leaks?

15. What tools does Chrome provide for memory debugging?

---

# 20. Output Questions

## Q1

```javascript
let a = 10;

let b = a;

b = 20;

console.log(a);
```

Output

```
10
```

---

## Q2

```javascript
const obj1 = {

    x:1

};

const obj2 = obj1;

obj2.x = 100;

console.log(obj1.x);
```

Output

```
100
```

---

## Q3

```javascript
let user = {

    name:"Mallik"

};

user = null;
```

Question

Can the original object be garbage collected?

Answer

Yes, if no other references to it remain.

---

## Q4

```javascript
const wm = new WeakMap();

let key = {};

wm.set(key, 100);

key = null;
```

Question

Can the key object be garbage collected?

Answer

Yes, if nothing else references it.

---

## Q5

```javascript
function outer(){

    let x = 10;

    return () => x;

}

const fn = outer();

console.log(fn());
```

Output

```
10
```

Reason

The closure retains access to `x`.

---

# 21. Coding Problems

## Beginner

1. Demonstrate primitive vs reference assignment.
2. Create objects and arrays.
3. Explain stack vs heap using code.
4. Demonstrate closures.
5. Use a WeakMap.

---

## Intermediate

6. Detect a memory leak caused by an interval.
7. Build a cache using WeakMap.
8. Compare Map and WeakMap behavior.
9. Create a closure-based counter.
10. Analyze object references.

---

## Advanced

11. Profile memory using Chrome DevTools.
12. Investigate a detached DOM node leak.
13. Explain a closure retaining large objects.
14. Demonstrate safe metadata storage with WeakMap.
15. Explain why WeakRef should rarely be used.

---

# 22. Cheat Sheet

```javascript
// Primitive
let a = 10;

// Reference
const obj = {};

// WeakMap
const wm = new WeakMap();

// WeakSet
const ws = new WeakSet();

// WeakRef
const ref = new WeakRef(obj);

// FinalizationRegistry
const registry = new FinalizationRegistry(() => {});
```

---

# Quick Revision

✔ Stack stores primitives and function frames.

✔ Heap stores objects, arrays, functions, maps, and sets.

✔ Primitive values are copied by value.

✔ Objects are copied by reference.

✔ JavaScript automatically allocates memory.

✔ Garbage Collection removes unreachable objects.

✔ Modern engines primarily use Mark-and-Sweep.

✔ Memory leaks happen when unused objects remain reachable.

✔ WeakMap and WeakSet hold weak references to object keys/elements.

✔ WeakRef and FinalizationRegistry are advanced APIs and should be used cautiously.

---