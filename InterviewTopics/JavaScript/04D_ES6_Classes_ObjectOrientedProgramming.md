# JavaScript Interview Master Handbook
# Part 4D – ES6 Classes & Object-Oriented Programming

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is OOP?
2. Four Pillars of OOP
3. ES6 Classes
4. Constructor
5. Instance Methods
6. Static Methods
7. Getters & Setters
8. Inheritance
9. super Keyword
10. Encapsulation
11. Private Fields
12. Polymorphism
13. Abstraction
14. Class vs Constructor Function
15. Best Practices
16. Common Mistakes
17. Interview Questions
18. Output Questions
19. Coding Problems
20. Cheat Sheet

---

# 1. What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm where data and behavior are organized into **objects**.

Real-Life Example

```
Car

↓

Color

↓

Brand

↓

Engine

↓

start()

↓

stop()
```

Object

↓

Properties + Methods

---

# Why OOP?

Without OOP

```
Functions

↓

Global Variables

↓

Messy Code
```

With OOP

✔ Organized

✔ Reusable

✔ Scalable

✔ Easy Maintenance

---

# Four Pillars of OOP

```
Encapsulation

↓

Inheritance

↓

Polymorphism

↓

Abstraction
```

---

# 2. ES6 Class

Syntax

```javascript
class Student{

}
```

Create Object

```javascript
const s = new Student();
```

---

# 3. Constructor

Constructor initializes object properties.

```javascript
class Student{

    constructor(name, age){

        this.name = name;
        this.age = age;

    }

}

const s = new Student("Mallik",23);

console.log(s.name);
```

Output

```
Mallik
```

---

Interview Question

Can a class have multiple constructors?

Answer

❌ No

JavaScript allows only **one constructor** per class.

---

# 4. Instance Methods

Methods available on object instances.

```javascript
class Student{

    constructor(name){

        this.name = name;

    }

    greet(){

        console.log("Hello");

    }

}

const s = new Student("Mallik");

s.greet();
```

Output

```
Hello
```

---

# 5. Static Methods

Belong to the class itself.

```javascript
class MathUtil{

    static add(a,b){

        return a+b;

    }

}

console.log(MathUtil.add(10,20));
```

Output

```
30
```

Wrong

```javascript
const obj = new MathUtil();

obj.add();
```

Output

```
TypeError
```

---

Interview Question

Difference between instance and static methods?

| Instance | Static |
|-----------|---------|
| Called on object | Called on class |
| Uses object data | Utility/helper methods |

---

# 6. Getters

Getter looks like a property but executes a method.

```javascript
class Employee{

    constructor(name){

        this.name = name;

    }

    get displayName(){

        return this.name.toUpperCase();

    }

}

const e = new Employee("mallik");

console.log(e.displayName);
```

Output

```
MALLIK
```

---

# 7. Setters

```javascript
class Employee{

    constructor(){

        this._age = 0;

    }

    set age(value){

        if(value<0){

            throw Error("Invalid");

        }

        this._age=value;

    }

}

const e = new Employee();

e.age=23;
```

---

Why Use Getters & Setters?

✔ Validation

✔ Formatting

✔ Computed values

✔ Controlled access

---

# 8. Inheritance

Child inherits Parent.

```javascript
class Person{

    greet(){

        console.log("Hello");

    }

}

class Student extends Person{

}

const s = new Student();

s.greet();
```

Output

```
Hello
```

---

Diagram

```
Person

↓

Student

↓

EngineeringStudent
```

---

# 9. super Keyword

Calls parent constructor.

```javascript
class Person{

    constructor(name){

        this.name=name;

    }

}

class Student extends Person{

    constructor(name,college){

        super(name);

        this.college=college;

    }

}

const s=new Student("Mallik","LBRCE");
```

---

Interview Question

Why is

```
super()
```

required?

Answer

Because `this` cannot be used in a derived class constructor until `super()` has been called.

---

# 10. Encapsulation

Definition

Bundling data and methods together while restricting direct access where appropriate.

Example

```javascript
class Bank{

    #balance=1000;

    deposit(amount){

        this.#balance+=amount;

    }

    getBalance(){

        return this.#balance;

    }

}

const b=new Bank();

b.deposit(500);

console.log(b.getBalance());
```

Output

```
1500
```

---

# 11. Private Fields

ES2022 Feature

```javascript
class User{

    #password="123";

}
```

Outside

```javascript
user.#password;
```

Output

```
SyntaxError
```

Private fields can only be accessed inside the class.

---

# 12. Polymorphism

One interface

↓

Many implementations

Example

```javascript
class Animal{

    speak(){

        console.log("Animal");

    }

}

class Dog extends Animal{

    speak(){

        console.log("Bark");

    }

}

class Cat extends Animal{

    speak(){

        console.log("Meow");

    }

}

const animals=[
    new Dog(),
    new Cat()
];

animals.forEach(a=>a.speak());
```

Output

```
Bark

Meow
```

---

# 13. Abstraction

Hide implementation details and expose only what's necessary.

Example

```
Car

↓

Drive()

↓

Engine Details Hidden
```

In JavaScript, abstraction is achieved through design rather than a dedicated `abstract` keyword (unlike languages such as Java).

---

# 14. Class vs Constructor Function

Constructor Function

```javascript
function User(name){

    this.name=name;

}
```

Class

```javascript
class User{

    constructor(name){

        this.name=name;

    }

}
```

Comparison

| Constructor | Class |
|--------------|--------|
| Older syntax | Modern syntax |
| Prototype-based | Also prototype-based internally |
| More manual | Cleaner syntax |

---

# 15. Best Practices

✔ Use classes for related objects.

✔ Keep methods small.

✔ Prefer composition when inheritance is unnecessary.

✔ Use private fields for sensitive state.

✔ Use getters for computed values.

✔ Use static methods for utilities.

---

# 16. Common Mistakes

❌ Forgetting `new`.

❌ Calling static methods on objects.

❌ Using `this` before `super()`.

❌ Exposing internal state unnecessarily.

❌ Creating deep inheritance hierarchies without need.

---

# Frequently Asked Interview Questions

1. What is OOP?

2. Four pillars of OOP?

3. What is a class?

4. Difference between class and object?

5. What is a constructor?

6. Can classes have multiple constructors?

7. What is an instance method?

8. What is a static method?

9. Difference between static and instance methods?

10. What are getters?

11. What are setters?

12. Why use getters and setters?

13. What is inheritance?

14. What is `extends`?

15. What is `super()`?

16. Why must `super()` be called first?

17. What is encapsulation?

18. What are private fields?

19. What is polymorphism?

20. What is abstraction?

21. Difference between constructor functions and classes?

22. Are JavaScript classes prototype-based?

Answer

Yes.

Classes are syntactic sugar over prototype-based inheritance.

---

# Output Questions

## Q1

```javascript
class A{

    hello(){

        console.log("Hi");

    }

}

const a=new A();

a.hello();
```

Output

```
Hi
```

---

## Q2

```javascript
class MathUtil{

    static add(){

        return 10;

    }

}

console.log(MathUtil.add());
```

Output

```
10
```

---

## Q3

```javascript
class Person{

    constructor(){

        this.name="Mallik";

    }

}

const p=new Person();

console.log(p.name);
```

Output

```
Mallik
```

---

## Q4

```javascript
class Animal{

    speak(){

        console.log("Animal");

    }

}

class Dog extends Animal{

    speak(){

        console.log("Dog");

    }

}

new Dog().speak();
```

Output

```
Dog
```

---

## Q5

```javascript
class Test{

    #x=10;

    getX(){

        return this.#x;

    }

}

const t=new Test();

console.log(t.getX());
```

Output

```
10
```

---

# Coding Problems

## Problem 1

Create a `Student` class with:

- id
- name
- marks

Methods:

- display()
- calculateGrade()

---

## Problem 2

Create a `BankAccount` class.

Methods

- deposit()
- withdraw()
- getBalance()

Use a private field for the balance.

---

## Problem 3

Create inheritance:

```
Person

↓

Employee

↓

Manager
```

Add unique methods to each class.

---

## Problem 4

Create a `Shape` base class.

Override `area()` in:

- Circle
- Rectangle
- Triangle

Demonstrate polymorphism.

---

## Problem 5

Create a utility class:

```javascript
class StringUtil{

    static reverse(str){}

    static isPalindrome(str){}

}
```

---

# Cheat Sheet

```javascript
// Class
class User {}

// Constructor
constructor(name){}

// Instance Method
greet(){}

// Static Method
static add(){}

// Getter
get fullName(){}

// Setter
set age(v){}

// Inheritance
class Student extends Person{}

// Parent Constructor
super(name);

// Private Field
#balance;

// Object
const u = new User();

// instanceof
u instanceof User;
```

---

# Quick Revision

- Classes are syntactic sugar over prototypes.
- A class can have only one constructor.
- Instance methods belong to objects.
- Static methods belong to the class.
- Getters and setters provide controlled access.
- `extends` enables inheritance.
- `super()` initializes the parent class.
- Private fields (`#`) provide encapsulation.
- Polymorphism allows different classes to implement the same method differently.
- Abstraction hides implementation details while exposing a simple interface.

---