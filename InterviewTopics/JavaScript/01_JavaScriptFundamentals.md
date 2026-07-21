# JavaScript Interview Master Handbook
# Part 1 – JavaScript Fundamentals

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is JavaScript?
2. History of JavaScript
3. Why JavaScript?
4. JavaScript Engine
5. ECMAScript
6. JavaScript Execution
7. JavaScript Syntax
8. Variables
9. Data Types
10. Operators
11. Type Conversion
12. Best Practices
13. Common Mistakes
14. Interview Questions
15. Cheat Sheet

---

# 1. What is JavaScript?

## Definition

JavaScript is a

**High-level, Interpreted (JIT-compiled), Multi-paradigm Programming Language**

used to make web pages interactive.

JavaScript can

✔ Update HTML

✔ Update CSS

✔ Handle Events

✔ Make API Calls

✔ Validate Forms

✔ Build Web Applications

✔ Build Mobile Apps

✔ Build Desktop Apps

✔ Build Backend Applications (Node.js)

---

## Real Life Analogy

HTML

↓

Skeleton

CSS

↓

Skin & Clothes

JavaScript

↓

Brain & Muscles

---

Example

```html
<button onclick="alert('Hello')">

Click Me

</button>
```

---

# 2. History of JavaScript

1995

↓

Created by

**Brendan Eich**

↓

Developed in

**10 days**

↓

Originally called

```
Mocha
```

↓

Renamed to

```
LiveScript
```

↓

Finally became

```
JavaScript
```

---

Interview Question

Who invented JavaScript?

Answer

**Brendan Eich**

---

# 3. Why JavaScript?

Without JavaScript

❌ Static Website

With JavaScript

✔ Dynamic UI

✔ Form Validation

✔ API Calls

✔ Animations

✔ Games

✔ Single Page Applications

✔ Real-time Updates

---

# 4. JavaScript Engine

A JavaScript engine executes JavaScript code.

Popular Engines

| Engine | Browser |
|---------|----------|
| V8 | Chrome, Edge, Node.js |
| SpiderMonkey | Firefox |
| JavaScriptCore | Safari |

---

Interview Question

Which engine does Chrome use?

Answer

**V8 Engine**

---

# 5. What is ECMAScript?

ECMAScript (ES) is the official specification for JavaScript.

JavaScript is an implementation of ECMAScript.

---

Important Versions

ES5 (2009)

- Strict Mode
- JSON

ES6 / ES2015

- let
- const
- Arrow Functions
- Classes
- Modules
- Template Literals
- Promises

ES2016+

- async/await
- Optional Chaining
- Nullish Coalescing
- BigInt
- More modern features

---

Interview Question

Difference between ECMAScript and JavaScript?

Answer

ECMAScript defines the standard.

JavaScript is the language that implements that standard.

---

# 6. How JavaScript Executes

```
JS Code

↓

Parser

↓

AST

↓

Interpreter

↓

JIT Compiler

↓

Machine Code

↓

CPU
```

Modern engines use **Just-In-Time (JIT)** compilation for better performance.

---

# 7. JavaScript Syntax

Statements end with semicolons (optional in many cases due to Automatic Semicolon Insertion, but recommended for consistency).

Example

```javascript
let age = 22;

console.log(age);
```

---

# 8. Variables

Variables store data.

Three ways

```javascript
var

let

const
```

---

## var

```javascript
var name = "Mallik";
```

Characteristics

✔ Function Scoped

✔ Can Redeclare

✔ Can Reassign

✔ Hoisted

Avoid in modern JavaScript.

---

## let

```javascript
let age = 23;
```

Characteristics

✔ Block Scoped

✔ Cannot Redeclare in same scope

✔ Can Reassign

✔ Hoisted (Temporal Dead Zone)

---

## const

```javascript
const PI = 3.14159;
```

Characteristics

✔ Block Scoped

✔ Cannot Redeclare

✔ Cannot Reassign

✔ Preferred by default

---

Interview Question

Which should you use?

Answer

Use

```
const
```

by default.

Use

```
let
```

when reassignment is needed.

Avoid

```
var
```

in modern applications.

---

# 9. Data Types

JavaScript has two categories.

---

## Primitive Types

1. Number

```javascript
let age = 23;
```

---

2. String

```javascript
let name = "Mallik";
```

---

3. Boolean

```javascript
true

false
```

---

4. Undefined

```javascript
let x;

console.log(x);
```

---

5. Null

```javascript
let value = null;
```

Represents intentional absence of a value.

---

6. Symbol

```javascript
const id = Symbol("id");
```

Creates a unique identifier.

---

7. BigInt

```javascript
const big = 123456789012345678901234567890n;
```

For integers larger than `Number.MAX_SAFE_INTEGER`.

---

## Non-Primitive Types

Objects

Arrays

Functions

Dates

Maps

Sets

---

Interview Question

How many primitive data types are there?

Answer

7

- Number
- String
- Boolean
- Undefined
- Null
- Symbol
- BigInt

---

# 10. Operators

---

Arithmetic

```javascript
+

-

*

/

%

**
```

---

Assignment

```javascript
=

+=

-=

*=

/=
```

---

Comparison

```javascript
==

===

!=

!==

>

<

>=

<=
```

---

Logical

```javascript
&&

||

!
```

---

Unary

```javascript
++

--
```

---

Ternary

```javascript
condition ? value1 : value2;
```

Example

```javascript
let result = age >= 18 ? "Adult" : "Minor";
```

---

# 11. Type Conversion

## Implicit Conversion

JavaScript converts automatically.

```javascript
"5" + 1
```

Output

```
"51"
```

---

```javascript
"5" - 1
```

Output

```
4
```

Reason

`-` converts operands to numbers.

---

## Explicit Conversion

Number

```javascript
Number("10")
```

String

```javascript
String(100)
```

Boolean

```javascript
Boolean(1)
```

---

Interview Question

Difference between

```
==
```

and

```
===
```

Answer

```
==
```

Loose Equality

Performs type coercion.

```
===
```

Strict Equality

Checks both value and type.

Example

```javascript
5 == "5"     // true

5 === "5"    // false
```

---

# typeof Operator

```javascript
typeof 10
```

Output

```
number
```

Examples

```javascript
typeof "Hello"      // string

typeof true         // boolean

typeof undefined    // undefined

typeof Symbol()     // symbol

typeof 10n          // bigint

typeof {}           // object

typeof []           // object

typeof function(){} // function

typeof null         // object (historical bug)
```

---

Interview Question

Why does

```javascript
typeof null
```

return

```
object
```

Answer

It is a historical bug in JavaScript that remains for backward compatibility.

---

# Best Practices

✔ Prefer `const`

✔ Use `let` only when reassignment is needed

✔ Avoid `var`

✔ Prefer `===` over `==`

✔ Use meaningful variable names

✔ Keep functions small

✔ Write readable code

---

# Common Mistakes

❌ Using `var` everywhere

❌ Using `==` unintentionally

❌ Forgetting `const`

❌ Relying on implicit type coercion

❌ Confusing `null` and `undefined`

---

# Frequently Asked Interview Questions

1. What is JavaScript?
2. Is JavaScript interpreted or compiled?
3. Who created JavaScript?
4. What is ECMAScript?
5. Difference between JavaScript and ECMAScript?
6. Difference between var, let and const?
7. What are primitive data types?
8. Difference between null and undefined?
9. Difference between == and ===?
10. What is type coercion?
11. What is typeof?
12. Why does typeof null return object?
13. What is BigInt?
14. What is Symbol?
15. Which variable declaration should you prefer?

---

# Cheat Sheet

```javascript
// Variables
let age = 23;
const PI = 3.14;

// Primitive Types
Number
String
Boolean
Undefined
Null
Symbol
BigInt

// Operators
+
-
*
/
%
**
==
===
&&
||
!

// typeof
typeof "Hello";   // string
typeof 10;        // number
typeof true;      // boolean
typeof null;      // object
typeof [];        // object
typeof {};        // object
typeof function(){}; // function
```

---

# Quick Revision

- JavaScript is a high-level, dynamically typed programming language.
- Brendan Eich created JavaScript in 1995.
- ECMAScript is the standard; JavaScript implements it.
- Use `const` by default and `let` when reassignment is needed.
- JavaScript has **7 primitive data types**.
- Prefer `===` over `==`.
- `typeof null` returns `"object"` because of a historical bug.
- Modern engines like V8 use JIT compilation for performance.

---