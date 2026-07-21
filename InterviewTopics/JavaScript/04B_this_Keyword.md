# JavaScript Interview Master Handbook
# Part 4B – The `this` Keyword (Complete Guide)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is `this`?
2. Global Context
3. Function Context
4. Method Context
5. Constructor Context
6. Arrow Function `this`
7. Default Binding
8. Implicit Binding
9. Explicit Binding
10. `call()`
11. `apply()`
12. `bind()`
13. `this` in Event Listeners
14. `this` in Classes
15. Common Pitfalls
16. Best Practices
17. Interview Questions
18. Output Questions
19. Cheat Sheet

---

# 1. What is `this`?

## Definition

`this` is a keyword that refers to **the object that is currently executing the function**.

Important

> `this` is determined by **how a function is called**, **not where it is written** (except for arrow functions, which inherit `this` lexically).

---

Real-Life Analogy

Imagine a person saying

```
"My name is Mallik."
```

Who is "my"?

It depends on **who is speaking**.

Similarly,

```
this
```

depends on **who calls the function**.

---

# 2. Global Context

### Browser

```javascript
console.log(this);
```

Output

```
window
```

---

### Node.js

Behavior differs by module type and environment.

In CommonJS modules:

```javascript
console.log(this);
```

`this` refers to `module.exports` (not the global object).

---

Interview Question

What does `this` refer to in the browser's global scope?

Answer

```
window
```

---

# 3. Function Context

Example

```javascript
function show() {
    console.log(this);
}

show();
```

### Browser (non-strict mode)

```
window
```

### Strict Mode

```javascript
"use strict";

function show() {
    console.log(this);
}

show();
```

Output

```
undefined
```

---

Interview Tip

Always mention strict mode.

---

# 4. Method Context

```javascript
const person = {

    name: "Mallik",

    greet() {

        console.log(this.name);

    }

};

person.greet();
```

Output

```
Mallik
```

Why?

Because

```
this

↓

person
```

---

# 5. Constructor Context

Constructor Function

```javascript
function Student(name){

    this.name = name;

}

const s = new Student("Mallik");

console.log(s.name);
```

Output

```
Mallik
```

Here

```
this

↓

Newly Created Object
```

---

# 6. Arrow Function `this`

Arrow functions **do not create their own `this`**.

They inherit `this` from the surrounding lexical scope.

Example

```javascript
const person = {

    name: "Mallik",

    greet() {

        const inner = () => {

            console.log(this.name);

        };

        inner();

    }

};

person.greet();
```

Output

```
Mallik
```

---

Regular Function

```javascript
const person = {

    name: "Mallik",

    greet() {

        function inner() {

            console.log(this.name);

        }

        inner();

    }

};

person.greet();
```

### Browser (non-strict)

```
undefined
```

(`this` is `window`, and `window.name` is typically empty.)

### Strict Mode

```
TypeError
```

because `this` is `undefined`.

---

Interview Question

Why are arrow functions useful?

Answer

They inherit `this` from the surrounding scope, avoiding the need for patterns like:

```javascript
const self = this;
```

---

# 7. Default Binding

```javascript
function test() {

    console.log(this);

}

test();
```

Browser

Non-strict

↓

```
window
```

Strict

↓

```
undefined
```

---

# 8. Implicit Binding

Object method.

```javascript
const user = {

    name: "Mallik",

    show() {

        console.log(this.name);

    }

};

user.show();
```

Output

```
Mallik
```

---

Rule

The object before the dot becomes `this`.

```
user.show()

↓

this = user
```

---

# 9. Explicit Binding

Use

- call()
- apply()
- bind()

to manually set `this`.

---

# 10. call()

Syntax

```javascript
fn.call(thisArg, arg1, arg2);
```

Example

```javascript
const person = {

    name: "Mallik"

};

function greet(city){

    console.log(this.name, city);

}

greet.call(person, "Hyderabad");
```

Output

```
Mallik Hyderabad
```

---

# 11. apply()

Similar to call()

Difference

Arguments are passed as an array.

```javascript
greet.apply(person, ["Hyderabad"]);
```

Output

```
Mallik Hyderabad
```

---

# 12. bind()

Does not execute immediately.

Returns a new function.

```javascript
const greetMallik = greet.bind(person);

greetMallik("Hyderabad");
```

Output

```
Mallik Hyderabad
```

---

Interview Question

Difference?

| call | apply | bind |
|------|--------|------|
| Executes immediately | Executes immediately | Returns new function |
| Separate arguments | Array of arguments | Separate arguments when invoking later |

---

# 13. this in Event Listeners

```javascript
button.addEventListener("click", function(){

    console.log(this);

});
```

`this`

↓

Clicked element.

---

Arrow Function

```javascript
button.addEventListener("click", () => {

    console.log(this);

});
```

Arrow functions inherit `this` from the surrounding scope, so `this` is **not** automatically the button element.

---

# 14. this in Classes

```javascript
class Student{

    constructor(name){

        this.name = name;

    }

    show(){

        console.log(this.name);

    }

}

const s = new Student("Mallik");

s.show();
```

Output

```
Mallik
```

---

# Common Pitfalls

## Losing `this`

```javascript
const person = {

    name:"Mallik",

    greet(){

        console.log(this.name);

    }

};

const fn = person.greet;

fn();
```

Browser (non-strict)

```
undefined
```

Strict mode

```
TypeError
```

---

Fix

```javascript
const fn = person.greet.bind(person);
```

---

# Best Practices

✔ Use arrow functions for callbacks when lexical `this` is desired.

✔ Use regular methods for object behavior.

✔ Use `bind()` when passing methods as callbacks.

✔ Understand strict mode differences.

---

# Common Mistakes

❌ Assuming `this` always refers to the function itself.

❌ Using arrow functions as object methods when dynamic `this` is required.

❌ Forgetting `new` with constructor functions.

❌ Losing `this` by storing methods separately.

---

# Frequently Asked Interview Questions

1. What is `this`?

2. How is `this` determined?

3. What is default binding?

4. What is implicit binding?

5. What is explicit binding?

6. Difference between `call()`, `apply()`, and `bind()`?

7. What does `this` refer to in an object method?

8. What does `this` refer to in a constructor?

9. Does an arrow function have its own `this`?

10. Why use arrow functions?

11. Why shouldn't arrow functions always be used as object methods?

12. What happens when a method is detached from its object?

13. What is lexical `this`?

14. What does `this` refer to in event listeners?

15. How do you permanently bind `this`?

---

# Output Questions

## Q1

```javascript
const person = {

    name: "Mallik",

    show() {

        console.log(this.name);

    }

};

person.show();
```

Output

```
Mallik
```

---

## Q2

```javascript
function show(){

    console.log(this);

}

show();
```

Browser

Non-strict

↓

```
window
```

Strict

↓

```
undefined
```

---

## Q3

```javascript
const person = {

    name: "Mallik",

    show: () => {

        console.log(this);

    }

};

person.show();
```

Output

Arrow functions inherit `this` from the surrounding scope, **not** from `person`.

---

## Q4

```javascript
function greet(city){

    console.log(this.name, city);

}

const user = {

    name: "Mallik"

};

greet.call(user, "Hyderabad");
```

Output

```
Mallik Hyderabad
```

---

## Q5

```javascript
function greet(city){

    console.log(this.name, city);

}

const user = {

    name: "Mallik"

};

greet.apply(user, ["Delhi"]);
```

Output

```
Mallik Delhi
```

---

## Q6

```javascript
const user = {

    name: "Mallik"

};

function greet(){

    console.log(this.name);

}

const fn = greet.bind(user);

fn();
```

Output

```
Mallik
```

---

## Q7

```javascript
const person = {

    name: "Mallik",

    greet() {

        return () => console.log(this.name);

    }

};

const fn = person.greet();

fn();
```

Output

```
Mallik
```

Reason

Arrow function captures the surrounding `this`.

---

# Real-World Examples

## React Class Components

```javascript
class App extends React.Component {

    handleClick() {
        console.log(this);
    }

}
```

Common solution

```javascript
this.handleClick = this.handleClick.bind(this);
```

or use class fields with arrow functions (depending on project setup).

---

## setTimeout

```javascript
const user = {

    name: "Mallik",

    greet() {

        setTimeout(() => {

            console.log(this.name);

        }, 1000);

    }

};
```

Arrow function preserves lexical `this`.

---

# Cheat Sheet

```javascript
// Default Binding
function test(){}

// Implicit Binding
obj.show();

// Explicit Binding
fn.call(obj);
fn.apply(obj);
const bound = fn.bind(obj);

// Constructor
new Student();

// Arrow Function
const fn = () => {};

// Regular Method
const obj = {

    show(){

    }

};
```

---

# Quick Revision

- `this` depends on **how a function is called**.
- In browser global scope, `this` is `window`.
- In strict-mode regular functions, `this` is `undefined`.
- Object methods use the object as `this`.
- Constructor functions use the newly created object as `this`.
- Arrow functions inherit `this` from their surrounding lexical scope.
- `call()` invokes immediately with explicit `this`.
- `apply()` invokes immediately and accepts arguments as an array.
- `bind()` returns a new function with permanently bound `this`.
- Be careful when passing object methods as callbacks because `this` can be lost.

---