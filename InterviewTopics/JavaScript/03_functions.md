# JavaScript Interview Master Handbook
# Part 3 – Functions (Complete Guide)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is a Function?
2. Why Functions?
3. Function Declaration
4. Function Expression
5. Anonymous Functions
6. Named Function Expression
7. Arrow Functions
8. Parameters vs Arguments
9. Default Parameters
10. Rest Parameters
11. arguments Object
12. First-Class Functions
13. Callback Functions
14. Higher-Order Functions
15. IIFE
16. Pure vs Impure Functions
17. Recursion
18. Function Hoisting
19. Best Practices
20. Common Mistakes
21. Interview Questions
22. Output Questions
23. Cheat Sheet

---

# 1. What is a Function?

## Definition

A function is a reusable block of code designed to perform a specific task.

Instead of writing the same code multiple times, write it once and call it whenever needed.

---

Real-Life Analogy

Imagine a washing machine.

Input

↓

Dirty Clothes

↓

Machine (Function)

↓

Clean Clothes

---

Syntax

```javascript
function greet() {
    console.log("Hello");
}

greet();
```

Output

```
Hello
```

---

# 2. Why Functions?

Without functions

❌ Repeated code

❌ Difficult maintenance

With functions

✔ Reusable

✔ Easy to debug

✔ Modular

✔ Readable

---

# 3. Function Declaration

Also called a Function Statement.

```javascript
function add(a, b) {
    return a + b;
}

console.log(add(10, 20));
```

Output

```
30
```

Characteristics

✔ Hoisted

✔ Can be called before declaration

---

Example

```javascript
sayHello();

function sayHello() {
    console.log("Hello");
}
```

Works because declarations are hoisted.

---

# 4. Function Expression

A function assigned to a variable.

```javascript
const add = function(a, b) {
    return a + b;
};
```

---

Characteristics

❌ Not callable before initialization.

---

Example

```javascript
hello();

const hello = function() {
    console.log("Hi");
};
```

Output

```
ReferenceError
```

---

Interview Question

Difference between declaration and expression?

| Declaration | Expression |
|-------------|------------|
| Hoisted | Not usable before initialization |
| Has function name | Stored in variable |
| Preferred for reusable APIs | Useful when passed around |

---

# 5. Anonymous Function

Function without a name.

```javascript
const greet = function() {
    console.log("Hello");
};
```

Mostly used in

- Callbacks
- Event listeners
- Array methods

---

# 6. Named Function Expression

```javascript
const factorial = function fact(n) {
    if (n <= 1) return 1;
    return n * fact(n - 1);
};
```

Useful for recursion and debugging stack traces.

---

# 7. Arrow Functions

Introduced in ES6.

Syntax

```javascript
const add = (a, b) => {
    return a + b;
};
```

---

Single Expression

```javascript
const square = x => x * x;
```

Equivalent

```javascript
const square = function(x) {
    return x * x;
};
```

---

No Parameters

```javascript
const hello = () => "Hello";
```

---

One Parameter

```javascript
const cube = x => x ** 3;
```

---

Interview Question

Should arrow functions always replace normal functions?

Answer

No.

Arrow functions do **not** have their own `this`, `arguments`, or `super`, so regular functions are still the better choice in some situations (such as object methods or constructors).

---

# 8. Parameters vs Arguments

Parameters

Variables in function definition.

```javascript
function add(a, b) {}
```

Arguments

Values passed during the function call.

```javascript
add(10, 20);
```

---

# 9. Default Parameters

```javascript
function greet(name = "Guest") {
    console.log(name);
}

greet();
```

Output

```
Guest
```

---

# 10. Rest Parameters

Collect remaining arguments into an array.

```javascript
function sum(...numbers) {
    return numbers.reduce((a, b) => a + b, 0);
}
```

Call

```javascript
sum(1, 2, 3, 4);
```

Output

```
10
```

---

# 11. arguments Object

Available in regular (non-arrow) functions.

```javascript
function show() {
    console.log(arguments);
}

show(10, 20, 30);
```

Output

```
Arguments(3)
```

Modern JavaScript generally prefers rest parameters (`...args`) over `arguments`.

---

# 12. First-Class Functions

Functions are treated like any other value.

They can be

✔ Assigned

✔ Passed

✔ Returned

Example

```javascript
const sayHi = () => "Hi";

const copy = sayHi;

console.log(copy());
```

Output

```
Hi
```

---

# 13. Callback Functions

A callback is a function passed as an argument to another function.

```javascript
function greet(name, callback) {
    console.log("Hello " + name);
    callback();
}

greet("Mallik", () => console.log("Welcome!"));
```

Output

```
Hello Mallik
Welcome!
```

---

Real-Life Analogy

Restaurant

Order Food

↓

Chef Cooks

↓

Waiter Calls You

Callback.

---

# 14. Higher-Order Functions

A function that

- Accepts another function
- Returns another function
- Or both

Example

```javascript
function calculate(a, b, operation) {
    return operation(a, b);
}

const add = (x, y) => x + y;

console.log(calculate(5, 3, add));
```

Output

```
8
```

Examples

- `map()`
- `filter()`
- `reduce()`
- `forEach()`

---

# 15. IIFE

Immediately Invoked Function Expression.

```javascript
(function() {
    console.log("Executed");
})();
```

Output

```
Executed
```

Arrow Version

```javascript
(() => {
    console.log("Hello");
})();
```

Uses

- Avoid global variables
- Create private scope

---

# 16. Pure vs Impure Functions

Pure Function

Same input

↓

Same output

↓

No side effects

```javascript
function add(a, b) {
    return a + b;
}
```

---

Impure Function

Depends on external state or modifies it.

```javascript
let total = 0;

function update(x) {
    total += x;
}
```

---

# 17. Recursion

A function calling itself.

```javascript
function factorial(n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}

console.log(factorial(5));
```

Output

```
120
```

Must have a **base case**.

Without it

↓

Stack Overflow

---

# 18. Function Hoisting

Function declarations

```javascript
hello();

function hello() {
    console.log("Hi");
}
```

Works.

---

Function expressions

```javascript
hello();

const hello = function() {};
```

ReferenceError.

---

# Best Practices

✔ Use meaningful names.

✔ Keep functions focused on one responsibility.

✔ Prefer `const` for function expressions.

✔ Use arrow functions for short callbacks.

✔ Use regular functions when `this` is required.

✔ Prefer rest parameters over `arguments`.

---

# Common Mistakes

❌ Forgetting `return`.

❌ Infinite recursion.

❌ Using arrow functions where `this` is needed.

❌ Confusing parameters and arguments.

❌ Modifying external state unnecessarily.

---

# Frequently Asked Interview Questions

1. What is a function?
2. Why use functions?
3. Difference between function declaration and function expression?
4. What is an anonymous function?
5. What is a named function expression?
6. What is an arrow function?
7. Difference between arrow functions and regular functions?
8. What are parameters and arguments?
9. What are default parameters?
10. What are rest parameters?
11. Difference between rest and spread?
12. What is the `arguments` object?
13. What are first-class functions?
14. What is a callback function?
15. What is a higher-order function?
16. What is an IIFE?
17. Why were IIFEs commonly used?
18. What is recursion?
19. What is a base case?
20. What is a pure function?
21. What is an impure function?
22. Are function declarations hoisted?
23. Are function expressions hoisted?
24. When should you use arrow functions?
25. When should you avoid arrow functions?

---

# Tricky Output Questions

## Q1

```javascript
hello();

function hello() {
    console.log("Hello");
}
```

Output

```
Hello
```

---

## Q2

```javascript
hello();

const hello = function() {
    console.log("Hello");
};
```

Output

```
ReferenceError
```

---

## Q3

```javascript
const add = (a, b) => a + b;

console.log(add(4, 5));
```

Output

```
9
```

---

## Q4

```javascript
function test(a = 5) {
    console.log(a);
}

test();
```

Output

```
5
```

---

## Q5

```javascript
function show(...nums) {
    console.log(nums.length);
}

show(1, 2, 3, 4);
```

Output

```
4
```

---

## Q6

```javascript
(function() {
    console.log("IIFE");
})();
```

Output

```
IIFE
```

---

# Cheat Sheet

```javascript
// Declaration
function greet() {}

// Expression
const greet = function() {};

// Arrow
const greet = () => {};

// Default Parameter
function add(a = 0) {}

// Rest Parameter
function sum(...nums) {}

// Callback
setTimeout(() => {}, 1000);

// IIFE
(() => {})();

// Pure Function
const add = (a, b) => a + b;

// Recursion
function fact(n) {
    return n <= 1 ? 1 : n * fact(n - 1);
}
```

---

# Quick Revision

- Functions make code reusable.
- Function declarations are hoisted.
- Function expressions are not usable before initialization.
- Arrow functions have lexical `this` and no own `arguments`.
- Parameters are declared in the function; arguments are passed during the call.
- Rest parameters collect remaining arguments into an array.
- Functions are first-class citizens in JavaScript.
- Callbacks are functions passed to other functions.
- Higher-order functions accept or return functions.
- IIFEs execute immediately.
- Pure functions have no side effects.
- Recursion always requires a base case.

---