# JavaScript Interview Master Handbook
# Part 2 – Scope, Hoisting, TDZ & Execution Context

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Scope
2. Global Scope
3. Function Scope
4. Block Scope
5. Lexical Scope
6. Scope Chain
7. Variable Shadowing
8. Hoisting
9. Temporal Dead Zone (TDZ)
10. Execution Context
11. Memory Creation Phase
12. Execution Phase
13. Call Stack
14. var vs let vs const (Deep Comparison)
15. Best Practices
16. Common Mistakes
17. Interview Questions
18. Output Questions
19. Cheat Sheet

---

# 1. What is Scope?

## Definition

Scope determines **where a variable can be accessed** in a program.

Think of scope as the **visibility** of variables.

---

Real-Life Analogy

Imagine rooms in a house.

```
House

↓

Living Room

↓

Bedroom
```

A TV inside the bedroom cannot be accessed from outside the house.

Variables behave the same way.

---

# Types of Scope

1. Global Scope

2. Function Scope

3. Block Scope

---

# 2. Global Scope

Variables declared outside all functions and blocks belong to the global scope.

```javascript
let company = "OpenAI";

function print(){
    console.log(company);
}

print();
```

Output

```
OpenAI
```

Accessible from anywhere in the program.

---

# 3. Function Scope

Variables declared using `var`, `let`, or `const` inside a function are accessible only within that function.

```javascript
function test(){

    let age = 23;

    console.log(age);

}

test();
```

Output

```
23
```

Outside

```javascript
console.log(age);
```

Output

```
ReferenceError
```

---

# 4. Block Scope

A block is anything inside `{}`.

```javascript
{

    let city = "Hyderabad";

}
```

Outside

```javascript
console.log(city);
```

Output

```
ReferenceError
```

`let` and `const` are block scoped.

---

`var` ignores block scope.

```javascript
{

    var x = 10;

}

console.log(x);
```

Output

```
10
```

Interview Favorite ⭐

---

# 5. Lexical Scope

Functions remember the scope where they are **defined**, not where they are called.

Example

```javascript
let language = "JavaScript";

function outer(){

    function inner(){

        console.log(language);

    }

    inner();

}

outer();
```

Output

```
JavaScript
```

---

Diagram

```
Global

↓

Outer()

↓

Inner()
```

Inner can access

- Inner variables
- Outer variables
- Global variables

---

# 6. Scope Chain

JavaScript searches variables from inner scope outward.

Example

```javascript
let a = 10;

function one(){

    let b = 20;

    function two(){

        let c = 30;

        console.log(a,b,c);

    }

    two();

}

one();
```

Search order

```
Current Scope

↓

Parent Scope

↓

Global Scope

↓

ReferenceError
```

---

# 7. Variable Shadowing

Inner variable hides the outer variable.

```javascript
let name = "Global";

function show(){

    let name = "Local";

    console.log(name);

}

show();
```

Output

```
Local
```

Global variable remains unchanged.

---

# Illegal Shadowing

```javascript
let x = 10;

{

    var x = 20;

}
```

This causes an error because `var` and `let` cannot create conflicting declarations in the same scope relationship.

---

# 8. Hoisting

Definition

JavaScript moves declarations to the top of their scope before execution.

Important

Only declarations are hoisted, **not initializations**.

---

Example

```javascript
console.log(a);

var a = 10;
```

JavaScript treats it approximately as

```javascript
var a;

console.log(a);

a = 10;
```

Output

```
undefined
```

---

let

```javascript
console.log(age);

let age = 20;
```

Output

```
ReferenceError
```

---

const

```javascript
console.log(PI);

const PI = 3.14;
```

Output

```
ReferenceError
```

---

# 9. Temporal Dead Zone (TDZ)

Definition

The TDZ is the period between entering a scope and the point where a `let` or `const` variable is declared.

Example

```javascript
{

    console.log(a);

    let a = 10;

}
```

Output

```
ReferenceError
```

Memory exists.

Access is forbidden until declaration.

---

Visualization

```
Scope Starts

↓

TDZ

↓

Declaration

↓

Accessible
```

---

Interview Question

Does `let` get hoisted?

Answer

Yes.

But it remains in the TDZ until initialization.

---

# 10. Execution Context

Every time JavaScript executes code, it creates an Execution Context.

Types

- Global Execution Context
- Function Execution Context
- Eval Execution Context (rare)

---

Global Execution Context contains

- Global Object
- this
- Variables
- Functions

---

# 11. Memory Creation Phase

Before execution starts

JavaScript allocates memory.

Example

```javascript
console.log(a);

var a = 10;
```

Memory Phase

```
a

↓

undefined
```

Execution Phase

```
a

↓

10
```

---

Functions

```javascript
function greet(){

}
```

Stored completely during memory phase.

That's why function declarations can be called before their definition.

---

# 12. Execution Phase

Statements execute line by line.

Example

```javascript
let x = 5;

let y = 10;

console.log(x+y);
```

Output

```
15
```

---

# 13. Call Stack

JavaScript uses a stack to manage function calls.

Example

```javascript
function one(){

    two();

}

function two(){

    three();

}

function three(){

    console.log("Done");

}

one();
```

Call Stack

```
three()

↓

two()

↓

one()

↓

Global
```

After completion

```
Global
```

---

Stack Overflow

```javascript
function test(){

    test();

}

test();
```

Output

```
Maximum call stack size exceeded
```

---

# 14. var vs let vs const

| Feature | var | let | const |
|---------|-----|-----|-------|
| Scope | Function | Block | Block |
| Redeclare | ✅ | ❌ | ❌ |
| Reassign | ✅ | ✅ | ❌ |
| Hoisted | ✅ | ✅ (TDZ) | ✅ (TDZ) |
| Global object (browser global script) | Yes | No | No |

---

Interview Recommendation

Default

```
const
```

Need reassignment

```
let
```

Avoid

```
var
```

---

# Best Practices

✔ Use `const` by default.

✔ Use `let` only when values change.

✔ Avoid `var`.

✔ Keep variables inside the smallest possible scope.

✔ Prefer descriptive variable names.

---

# Common Mistakes

❌ Assuming `let` is not hoisted.

❌ Confusing `undefined` with `ReferenceError`.

❌ Using `var` inside loops unintentionally.

❌ Accessing variables before declaration.

❌ Creating unnecessary globals.

---

# Frequently Asked Interview Questions

1. What is Scope?

2. Types of Scope?

3. What is Lexical Scope?

4. What is Scope Chain?

5. What is Variable Shadowing?

6. What is Illegal Shadowing?

7. What is Hoisting?

8. Does `let` get hoisted?

9. What is TDZ?

10. Difference between `undefined` and `ReferenceError`?

11. What is Execution Context?

12. What are the phases of Execution Context?

13. What is Memory Creation Phase?

14. What is Execution Phase?

15. What is Call Stack?

16. What causes Stack Overflow?

17. Difference between `var`, `let`, and `const`?

18. Why is `const` preferred?

19. Can a `const` object be modified?

Answer:

Yes. The binding cannot change, but the object's properties can.

20. Why should `var` be avoided?

---

# Tricky Output Questions

## Q1

```javascript
console.log(a);

var a = 10;
```

Output

```
undefined
```

---

## Q2

```javascript
console.log(a);

let a = 10;
```

Output

```
ReferenceError
```

---

## Q3

```javascript
{

    var x = 10;

}

console.log(x);
```

Output

```
10
```

---

## Q4

```javascript
{

    let y = 20;

}

console.log(y);
```

Output

```
ReferenceError
```

---

## Q5

```javascript
var a = 10;

function test(){

    console.log(a);

    var a = 20;

}

test();
```

Output

```
undefined
```

Reason:

The local `var a` is hoisted inside the function.

---

## Q6

```javascript
let a = 10;

function demo(){

    console.log(a);

}

demo();
```

Output

```
10
```

---

## Q7

```javascript
const person = {

    name:"Mallik"

};

person.name = "John";

console.log(person.name);
```

Output

```
John
```

Reason:

The object is mutable even though the variable binding is constant.

---

# Cheat Sheet

```javascript
// Global Scope
let a = 10;

// Function Scope
function test(){

    let b = 20;

}

// Block Scope
{

    let c = 30;

}

// Hoisting
var x;

// TDZ
let y;

// Preferred
const PI = 3.14;

// Reassign
let age = 22;

// Avoid
var score = 100;
```

---

# Quick Revision

- Scope controls variable visibility.
- JavaScript has Global, Function, and Block scope.
- `let` and `const` are block scoped.
- `var` is function scoped.
- Hoisting moves declarations, not initializations.
- `let` and `const` are hoisted but remain in the TDZ.
- Every execution creates an Execution Context.
- Execution Context has a Memory Creation Phase and an Execution Phase.
- JavaScript uses a Call Stack to manage function calls.
- Prefer `const`, use `let` when reassignment is needed, and avoid `var`.

---