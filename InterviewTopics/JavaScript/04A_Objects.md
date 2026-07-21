# JavaScript Interview Master Handbook
# Part 4A – Objects (Complete Fundamentals)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is an Object?
2. Why Objects?
3. Object Literal
4. Creating Objects
5. Properties
6. Methods
7. Dot vs Bracket Notation
8. Dynamic Properties
9. Nested Objects
10. Object References
11. Shallow Copy
12. Deep Copy
13. Object Destructuring
14. Optional Chaining
15. Nullish Coalescing
16. Spread Operator
17. Object Utility Methods
18. Best Practices
19. Common Mistakes
20. Interview Questions
21. Output Questions
22. Cheat Sheet

---

# 1. What is an Object?

## Definition

An object is a collection of **key-value pairs**.

Keys are called **properties**.

Values can be

- Number
- String
- Boolean
- Array
- Object
- Function

---

Real-Life Analogy

Student

```
Student

↓

Name

↓

Age

↓

College

↓

CGPA
```

Everything belongs to one student object.

---

Example

```javascript
const student = {
    name: "Mallik",
    age: 23,
    cgpa: 7.66
};
```

---

# 2. Why Objects?

Without Objects

```javascript
let name = "Mallik";
let age = 23;
let cgpa = 7.66;
```

Hard to manage.

With Objects

```javascript
const student = {
    name: "Mallik",
    age: 23,
    cgpa: 7.66
};
```

Cleaner

Readable

Reusable

---

# 3. Object Literal

Most common way.

```javascript
const car = {
    brand: "Toyota",
    model: "Camry",
    year: 2024
};
```

---

# 4. Other Ways to Create Objects

Using Object Constructor

```javascript
const obj = new Object();

obj.name = "John";
```

---

Using Object.create()

```javascript
const person = Object.create(null);
```

Used less frequently in day-to-day development but useful in advanced scenarios.

---

# 5. Properties

Properties store values.

```javascript
const employee = {
    id: 101,
    name: "Ravi",
    salary: 50000
};
```

Access

```javascript
employee.name;
```

Output

```
Ravi
```

---

# 6. Methods

Methods are functions inside objects.

```javascript
const person = {
    name: "Mallik",

    greet() {
        console.log("Hello");
    }
};

person.greet();
```

Output

```
Hello
```

---

# 7. Dot vs Bracket Notation

Dot

```javascript
person.name;
```

Bracket

```javascript
person["name"];
```

---

When to use Bracket?

Dynamic keys

```javascript
const key = "name";

console.log(person[key]);
```

Output

```
Mallik
```

---

Interview Question

Difference?

| Dot | Bracket |
|------|----------|
| Fixed Property | Dynamic Property |
| Simple | Flexible |

---

# 8. Dynamic Properties

```javascript
const key = "city";

const person = {
    [key]: "Hyderabad"
};

console.log(person.city);
```

Output

```
Hyderabad
```

---

Add Property

```javascript
person.country = "India";
```

---

Update Property

```javascript
person.city = "Vijayawada";
```

---

Delete Property

```javascript
delete person.country;
```

---

# 9. Nested Objects

Objects inside objects.

```javascript
const student = {

    name: "Mallik",

    address: {

        city: "Hyderabad",

        state: "Telangana"

    }

};
```

Access

```javascript
student.address.city;
```

Output

```
Hyderabad
```

---

# 10. Object References

Objects are assigned by reference.

```javascript
const obj1 = {
    name: "A"
};

const obj2 = obj1;

obj2.name = "B";

console.log(obj1.name);
```

Output

```
B
```

Reason

Both variables refer to the same object.

---

# 11. Shallow Copy

Spread Operator

```javascript
const person = {

    name: "Mallik",

    age: 23

};

const copy = {

    ...person

};
```

---

Object.assign()

```javascript
const copy = Object.assign({}, person);
```

---

Important

Nested objects are still shared.

Example

```javascript
const person = {
    address: {
        city: "Hyderabad"
    }
};

const copy = { ...person };

copy.address.city = "Delhi";

console.log(person.address.city);
```

Output

```
Delhi
```

---

# 12. Deep Copy

Creates completely independent nested objects.

Modern approach

```javascript
const clone = structuredClone(person);
```

Alternative (limitations)

```javascript
const clone =
JSON.parse(JSON.stringify(person));
```

Limitations include losing functions, `Date`, `Map`, `Set`, etc.

---

# 13. Object Destructuring

```javascript
const student = {

    name: "Mallik",

    age: 23

};

const { name, age } = student;

console.log(name);
```

Output

```
Mallik
```

---

Rename

```javascript
const {

    name: studentName

} = student;
```

---

Default Value

```javascript
const {

    country = "India"

} = student;
```

---

Nested Destructuring

```javascript
const {

    address: {

        city

    }

} = student;
```

---

# 14. Optional Chaining

Prevents errors when accessing nested properties.

Without

```javascript
user.address.city
```

If `address` is undefined

↓

Error

---

With

```javascript
user.address?.city
```

Output

```
undefined
```

No error.

---

# 15. Nullish Coalescing

Operator

```javascript
??
```

Returns right side only if left side is

- null
- undefined

Example

```javascript
let name = null;

console.log(name ?? "Guest");
```

Output

```
Guest
```

---

Difference from ||

```javascript
console.log(0 || 100);
```

Output

```
100
```

Because 0 is falsy.

```javascript
console.log(0 ?? 100);
```

Output

```
0
```

Because 0 is not null or undefined.

---

# 16. Spread Operator

Copy

```javascript
const copy = {

    ...student

};
```

Merge

```javascript
const obj = {

    ...a,

    ...b

};
```

Override

Later properties win.

```javascript
const obj = {

    name: "A",

    ...{

        name: "B"

    }

};

console.log(obj.name);
```

Output

```
B
```

---

# 17. Object Utility Methods

## Object.keys()

```javascript
Object.keys(student);
```

Output

```
["name","age"]
```

---

## Object.values()

```javascript
Object.values(student);
```

Output

```
["Mallik",23]
```

---

## Object.entries()

```javascript
Object.entries(student);
```

Output

```
[
 ["name","Mallik"],
 ["age",23]
]
```

Useful for iteration.

---

## Object.assign()

Copies properties.

```javascript
const copy =
Object.assign({}, student);
```

---

## Object.freeze()

Prevents

- Adding
- Updating
- Deleting properties

```javascript
Object.freeze(student);
```

---

## Object.seal()

Allows updating existing properties.

Prevents

- Adding
- Deleting properties

```javascript
Object.seal(student);
```

---

## Object.hasOwn()

Checks if an object has its own property.

```javascript
Object.hasOwn(student, "name");
```

Output

```
true
```

---

# Best Practices

✔ Prefer object literals.

✔ Use `const` for objects.

✔ Use optional chaining.

✔ Use destructuring.

✔ Prefer `Object.hasOwn()` over calling `hasOwnProperty()` directly on unknown objects.

✔ Use `structuredClone()` when a true deep clone is needed and supported.

---

# Common Mistakes

❌ Comparing objects with `==`.

❌ Assuming spread creates a deep copy.

❌ Forgetting optional chaining.

❌ Mutating shared references accidentally.

❌ Using `||` when `??` is more appropriate.

---

# Frequently Asked Interview Questions

1. What is an object?

2. Why use objects?

3. Different ways to create objects?

4. Difference between dot and bracket notation?

5. What are object methods?

6. What are dynamic properties?

7. What are nested objects?

8. What is object destructuring?

9. What is optional chaining?

10. Difference between `||` and `??`?

11. What is a shallow copy?

12. What is a deep copy?

13. Difference between spread and `Object.assign()`?

14. What does `Object.keys()` return?

15. Difference between `freeze()` and `seal()`?

16. Can a frozen object be modified?

17. What does `Object.entries()` return?

18. Why are objects compared by reference?

19. What is `Object.hasOwn()`?

20. Why use `structuredClone()`?

---

# Output Questions

## Q1

```javascript
const obj = {
    a: 1
};

console.log(obj.a);
```

Output

```
1
```

---

## Q2

```javascript
const obj = {
    a: 1
};

const copy = obj;

copy.a = 5;

console.log(obj.a);
```

Output

```
5
```

---

## Q3

```javascript
const obj = {
    a: 10
};

const copy = {
    ...obj
};

copy.a = 20;

console.log(obj.a);
```

Output

```
10
```

---

## Q4

```javascript
const obj = {
    a: {
        b: 5
    }
};

const copy = {
    ...obj
};

copy.a.b = 20;

console.log(obj.a.b);
```

Output

```
20
```

Reason

Spread performs a shallow copy.

---

## Q5

```javascript
const user = {};

console.log(user.address?.city);
```

Output

```
undefined
```

---

## Q6

```javascript
console.log(0 ?? 100);
```

Output

```
0
```

---

## Q7

```javascript
console.log(0 || 100);
```

Output

```
100
```

---

# Cheat Sheet

```javascript
// Object Literal
const obj = {};

// Property Access
obj.name;
obj["name"];

// Add
obj.city = "Hyderabad";

// Delete
delete obj.city;

// Copy
const copy = { ...obj };

// Deep Copy
const clone = structuredClone(obj);

// Destructure
const { name } = obj;

// Optional Chaining
obj.address?.city;

// Nullish
value ?? "Default";

// Utilities
Object.keys(obj);
Object.values(obj);
Object.entries(obj);
Object.assign({}, obj);
Object.freeze(obj);
Object.seal(obj);
Object.hasOwn(obj, "name");
```

---

# Quick Revision

- Objects store key-value pairs.
- Dot notation is simple; bracket notation supports dynamic keys.
- Objects are assigned by reference.
- Spread creates a shallow copy.
- `structuredClone()` creates a deep copy for supported types.
- Destructuring extracts properties.
- Optional chaining (`?.`) safely accesses nested properties.
- Nullish coalescing (`??`) only falls back for `null` or `undefined`.
- `Object.freeze()` prevents modification.
- `Object.seal()` allows updates but prevents adding or deleting properties.

---