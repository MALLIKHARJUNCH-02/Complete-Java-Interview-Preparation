# JavaScript Interview Master Handbook
# Part 4C – Prototypes & Prototype Chain

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is a Prototype?
2. Why Prototypes?
3. Constructor Functions
4. The `new` Keyword
5. `prototype` vs `__proto__`
6. Prototype Chain
7. Property Lookup
8. Method Sharing
9. Inheritance Using Prototypes
10. Object.create()
11. instanceof
12. hasOwnProperty()
13. Best Practices
14. Common Mistakes
15. Interview Questions
16. Output Questions
17. Cheat Sheet

---

# 1. What is a Prototype?

## Definition

A prototype is an object that allows other objects to inherit properties and methods.

JavaScript uses **prototype-based inheritance**.

---

Real-Life Analogy

```
Human

↓

Student

↓

Engineer
```

Student inherits characteristics from Human.

Engineer inherits from Student.

JavaScript objects inherit the same way.

---

# 2. Why Prototypes?

Without prototypes

Every object stores its own copy of every method.

```javascript
const user1 = {
    name: "A",
    greet() {
        console.log("Hello");
    }
};

const user2 = {
    name: "B",
    greet() {
        console.log("Hello");
    }
};
```

The `greet` function is duplicated.

---

With prototypes

```javascript
function User(name) {
    this.name = name;
}

User.prototype.greet = function () {
    console.log("Hello");
};

const u1 = new User("A");
const u2 = new User("B");
```

Both objects share **one** `greet()` method.

---

Interview Question

Why use prototypes?

Answer

To share methods efficiently and reduce memory usage.

---

# 3. Constructor Functions

Before ES6 classes, constructor functions were commonly used.

```javascript
function Student(name, age) {
    this.name = name;
    this.age = age;
}

const s1 = new Student("Mallik", 23);
```

Output

```
Student {
    name: "Mallik",
    age: 23
}
```

Naming Convention

Constructor names start with a capital letter.

---

# 4. The `new` Keyword

When you write

```javascript
const s = new Student("Mallik", 23);
```

JavaScript internally performs approximately these steps:

1.

Creates a new empty object.

```
{}
```

↓

2.

Links the object to

```
Student.prototype
```

↓

3.

Calls the constructor with

```
this
```

pointing to the new object.

↓

4.

Returns the object automatically (unless the constructor explicitly returns another object).

---

Visualization

```
new Student()

↓

{}

↓

Prototype Link

↓

Constructor Executes

↓

Return Object
```

---

Interview Question

What does `new` do?

Mention all four steps.

---

# 5. `prototype` vs `__proto__`

This is a favorite interview question.

---

## `prototype`

Belongs to constructor functions.

```javascript
function Car() {}

console.log(Car.prototype);
```

---

## `__proto__`

Belongs to object instances.

```javascript
const car = new Car();

console.log(car.__proto__);
```

---

Relationship

```javascript
car.__proto__ === Car.prototype
```

Output

```
true
```

---

Interview Answer

| prototype | __proto__ |
|------------|-----------|
| Property of constructor functions | Property of object instances |
| Used to define shared members | Points to the object's prototype |

Note: `__proto__` is widely supported but is considered legacy. Prefer `Object.getPrototypeOf()` and `Object.setPrototypeOf()` when working with prototypes directly.

---

# 6. Prototype Chain

Example

```javascript
const arr = [1, 2, 3];
```

Prototype chain

```
arr

↓

Array.prototype

↓

Object.prototype

↓

null
```

---

Object Chain

```
Student

↓

Person

↓

Object

↓

null
```

---

Interview Question

What is the prototype chain?

Answer

The chain JavaScript follows while searching for properties and methods.

---

# 7. Property Lookup Algorithm

Example

```javascript
const person = {
    name: "Mallik"
};

console.log(person.name);
```

Search

```
Current Object

↓

Prototype

↓

Parent Prototype

↓

Object.prototype

↓

null
```

If not found

↓

```
undefined
```

---

# 8. Method Sharing

Without Prototype

```
100 Objects

↓

100 greet() Methods
```

---

With Prototype

```
100 Objects

↓

1 greet() Method
```

Example

```javascript
function User(name) {
    this.name = name;
}

User.prototype.sayHi = function () {
    console.log("Hi");
};
```

All instances share the same method.

---

# 9. Inheritance Using Prototypes

```javascript
function Person(name) {
    this.name = name;
}

Person.prototype.sayHello = function () {
    console.log("Hello");
};

function Student(name) {
    Person.call(this, name);
}

Student.prototype = Object.create(Person.prototype);
Student.prototype.constructor = Student;

const s = new Student("Mallik");

s.sayHello();
```

Output

```
Hello
```

---

Why reset constructor?

Because after

```javascript
Student.prototype =
Object.create(Person.prototype);
```

the `constructor` property points to `Person`.

Restore it with

```javascript
Student.prototype.constructor = Student;
```

---

# 10. Object.create()

Creates a new object with a specified prototype.

```javascript
const animal = {
    speak() {
        console.log("Sound");
    }
};

const dog = Object.create(animal);

dog.speak();
```

Output

```
Sound
```

---

Interview Question

Difference between

```javascript
{}
```

and

```javascript
Object.create()
```

Answer

`{}` creates a normal object inheriting from `Object.prototype`.

`Object.create(proto)` lets you choose the prototype.

---

# 11. instanceof

Checks inheritance.

```javascript
function Car() {}

const c = new Car();

console.log(c instanceof Car);
```

Output

```
true
```

---

More Examples

```javascript
[] instanceof Array
```

↓

true

```javascript
[] instanceof Object
```

↓

true

Because

```
Array

↓

Object
```

---

# 12. hasOwnProperty()

Checks whether a property exists directly on the object (not inherited).

```javascript
const obj = {
    name: "Mallik"
};

console.log(obj.hasOwnProperty("name"));
```

Output

```
true
```

---

Inherited Property

```javascript
obj.hasOwnProperty("toString");
```

Output

```
false
```

because `toString` comes from `Object.prototype`.

Modern Alternative

```javascript
Object.hasOwn(obj, "name");
```

---

# Best Practices

✔ Put shared methods on the prototype.

✔ Prefer ES6 classes in modern code (they are built on prototypes).

✔ Use `Object.getPrototypeOf()` instead of `__proto__` when possible.

✔ Use `Object.hasOwn()` for own-property checks.

---

# Common Mistakes

❌ Defining methods inside constructors unnecessarily.

❌ Confusing `prototype` with `__proto__`.

❌ Forgetting to restore the constructor after inheritance.

❌ Thinking classes replace prototypes (they don't; they use them).

---

# Frequently Asked Interview Questions

1. What is a prototype?

2. Why does JavaScript use prototypes?

3. What is prototype-based inheritance?

4. What is the prototype chain?

5. Difference between `prototype` and `__proto__`?

6. What does the `new` keyword do?

7. Why share methods using prototypes?

8. What is `Object.create()`?

9. Difference between `Object.create()` and `{}`?

10. What is `instanceof`?

11. What is `hasOwnProperty()`?

12. Why is `constructor` reset after inheritance?

13. How does property lookup work?

14. Why do arrays have methods like `map()`?

15. Are ES6 classes based on prototypes?

Answer

Yes.

Classes are syntactic sugar over prototype-based inheritance.

---

# Output Questions

## Q1

```javascript
function Car() {}

const c = new Car();

console.log(c.__proto__ === Car.prototype);
```

Output

```
true
```

---

## Q2

```javascript
function User() {}

User.prototype.sayHi = function () {
    console.log("Hi");
};

const u = new User();

u.sayHi();
```

Output

```
Hi
```

---

## Q3

```javascript
console.log([] instanceof Array);
```

Output

```
true
```

---

## Q4

```javascript
console.log([] instanceof Object);
```

Output

```
true
```

Reason

Arrays inherit from `Object`.

---

## Q5

```javascript
const person = {
    name: "Mallik"
};

console.log(person.hasOwnProperty("name"));
```

Output

```
true
```

---

## Q6

```javascript
console.log(person.hasOwnProperty("toString"));
```

Output

```
false
```

---

## Q7

```javascript
const animal = {
    sound() {
        return "Generic";
    }
};

const dog = Object.create(animal);

console.log(dog.sound());
```

Output

```
Generic
```

---

# Coding Problems

## Problem 1

Create a constructor function for `Employee`.

Requirements

- id
- name
- salary

Add a shared method

```javascript
display()
```

using the prototype.

---

## Problem 2

Create `Animal` and `Dog` using prototype inheritance.

Add

```javascript
eat()

bark()
```

---

## Problem 3

Implement a custom object with shared methods.

Verify

```javascript
obj.__proto__ === Constructor.prototype
```

---

## Problem 4

Create an object using `Object.create()`.

Add inherited methods.

---

# Prototype Chain Visualization

```
student

↓

Student.prototype

↓

Person.prototype

↓

Object.prototype

↓

null
```

Property Search

```
student

↓

Student.prototype

↓

Person.prototype

↓

Object.prototype

↓

undefined
```

---

# Cheat Sheet

```javascript
// Constructor
function User(name) {
    this.name = name;
}

// Shared Method
User.prototype.greet = function () {
    console.log("Hello");
};

// Instance
const user = new User("Mallik");

// Prototype Check
user.__proto__ === User.prototype;

// Better Prototype Access
Object.getPrototypeOf(user) === User.prototype;

// Inheritance
Student.prototype = Object.create(Person.prototype);
Student.prototype.constructor = Student;

// instanceof
user instanceof User;

// Own Property
Object.hasOwn(user, "name");
```

---

# Quick Revision

- Every JavaScript object has a prototype.
- Prototypes enable inheritance and method sharing.
- `prototype` belongs to constructor functions.
- `__proto__` (or `Object.getPrototypeOf()`) refers to an object's prototype.
- `new` creates an object, links the prototype, calls the constructor, and returns the object.
- Property lookup follows the prototype chain.
- `Object.create()` creates objects with a chosen prototype.
- `instanceof` checks the prototype chain.
- `Object.hasOwn()` or `hasOwnProperty()` checks for own properties.
- ES6 classes are built on top of prototypes.

---