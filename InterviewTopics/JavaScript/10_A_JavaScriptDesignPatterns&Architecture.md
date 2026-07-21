# JavaScript Design Patterns & Architecture
## Complete Interview Draft (Basic Overview)

> Beginner → Intermediate → Advanced

---

# Table of Contents

1. Why Design Patterns?
2. Module Pattern
3. Revealing Module Pattern
4. Singleton Pattern
5. Factory Pattern
6. Observer Pattern
7. Publish-Subscribe (Pub/Sub) Pattern
8. Strategy Pattern
9. Adapter Pattern
10. Decorator Pattern
11. Proxy Pattern
12. MVC Architecture
13. MVP Architecture
14. MVVM Architecture
15. SOLID Principles
16. Clean Code Principles
17. Dependency Injection
18. Large Scale Frontend Architecture
19. Common Interview Questions
20. Cheat Sheet

---

# 1. Why Design Patterns?

## Definition

Design Patterns are reusable solutions to commonly occurring software design problems.

Instead of writing solutions from scratch,

developers reuse proven approaches.

---

Benefits

✔ Reusable

✔ Maintainable

✔ Scalable

✔ Easy to Understand

✔ Better Team Collaboration

---

Real World Example

Instead of designing a chair every time,

a company follows an existing blueprint.

Software Design Patterns work the same way.

---

# 2. Module Pattern

## Purpose

Encapsulate data and expose only public methods.

Example

```javascript
const User = (function(){

    let name = "Mallik";

    function getName(){

        return name;

    }

    return {

        getName

    };

})();
```

Use Cases

- Utility Libraries
- Authentication Modules
- Configuration Modules

---

# 3. Revealing Module Pattern

Same as Module Pattern,

but returns all public members together.

Example

```javascript
const App = (function(){

    function login(){}

    function logout(){}

    return {

        login,

        logout

    };

})();
```

Advantage

Cleaner API.

---

# 4. Singleton Pattern

## Purpose

Only one object exists throughout the application.

Example

```javascript
const Config = {

    apiUrl:"https://api.com"

};
```

Real World

✔ Database Connection

✔ Logger

✔ Configuration

✔ Cache

---

# 5. Factory Pattern

## Purpose

Create objects without exposing object creation logic.

Example

```javascript
function createUser(name){

    return {

        name

    };

}
```

Use Cases

- Creating Users
- Vehicles
- Products
- API Clients

---

# 6. Observer Pattern

## Purpose

One object notifies many dependent objects automatically.

Example

```
YouTube

↓

Subscribers

↓

Notification
```

Use Cases

✔ Event Systems

✔ React State

✔ Notifications

✔ UI Updates

---

# 7. Publish-Subscribe (Pub/Sub)

Publisher

↓

Event Bus

↓

Subscribers

Unlike Observer,

Publisher and Subscriber don't know each other directly.

Use Cases

✔ Chat Applications

✔ Notifications

✔ Event Bus

✔ Microservices

---

# 8. Strategy Pattern

## Purpose

Switch algorithms dynamically.

Example

```
Payment

↓

UPI

↓

Card

↓

PayPal

↓

Wallet
```

Instead of

```
Huge if-else
```

Use different strategies.

---

# 9. Adapter Pattern

## Purpose

Convert one interface into another.

Real Example

```
US Plug

↓

Adapter

↓

Indian Socket
```

Software Example

Old API

↓

Adapter

↓

New Application

---

# 10. Decorator Pattern

## Purpose

Add functionality

WITHOUT

modifying original code.

Example

```
Coffee

↓

Milk

↓

Sugar

↓

Chocolate
```

Each decorator adds features.

---

# 11. Proxy Pattern

## Purpose

Control access to another object.

Example

```
User

↓

Proxy

↓

Real Object
```

Uses

✔ Authentication

✔ Logging

✔ Lazy Loading

✔ Validation

---

# 12. MVC (Model View Controller)

Architecture

```
User

↓

Controller

↓

Model

↓

Database

↓

View

↓

User
```

Responsibilities

Model

↓

Business Logic

View

↓

UI

Controller

↓

Handles Requests

---

# 13. MVP (Model View Presenter)

```
View

↓

Presenter

↓

Model
```

Presenter updates View.

View contains almost no business logic.

Common in Android development.

---

# 14. MVVM (Model View ViewModel)

```
View

↓

ViewModel

↓

Model
```

ViewModel exposes data.

View automatically updates.

Popular Frameworks

✔ Vue

✔ Angular

✔ Knockout

---

# 15. SOLID Principles

S

Single Responsibility Principle

One class

↓

One Responsibility

---

O

Open Closed Principle

Open for Extension

Closed for Modification

---

L

Liskov Substitution Principle

Child should replace Parent safely.

---

I

Interface Segregation Principle

Small Interfaces

Better than

Huge Interfaces

---

D

Dependency Inversion Principle

Depend on

Abstractions

Not Concrete Classes

---

# 16. Clean Code Principles

Write code that is

✔ Readable

✔ Simple

✔ Consistent

✔ Testable

✔ Reusable

Guidelines

- Meaningful variable names
- Small functions
- Avoid duplicate code
- Keep functions focused
- Proper comments only where necessary

---

# 17. Dependency Injection (DI)

Instead of

Object creates dependencies itself

↓

Inject dependencies from outside.

Without DI

```
Car

↓

Creates Engine
```

With DI

```
Engine

↓

Injected

↓

Car
```

Benefits

✔ Easy Testing

✔ Loose Coupling

✔ Better Scalability

---

# 18. Large Scale Frontend Architecture

Typical Folder Structure

```
src/

components/

pages/

hooks/

services/

utils/

context/

store/

assets/

styles/

routes/

config/

api/

constants/
```

Principles

✔ Feature Based Organization

✔ Separation of Concerns

✔ Reusable Components

✔ API Layer

✔ State Management

✔ Routing

✔ Lazy Loading

✔ Error Handling

✔ Authentication

---

# When to Use Which Pattern?

| Pattern | Best Use |
|----------|-----------|
| Module | Encapsulation |
| Revealing Module | Cleaner API |
| Singleton | One Instance |
| Factory | Object Creation |
| Observer | Notifications |
| Pub/Sub | Event Bus |
| Strategy | Multiple Algorithms |
| Adapter | Interface Conversion |
| Decorator | Add Features |
| Proxy | Access Control |
| MVC | Traditional Web Apps |
| MVP | Presenter Based UI |
| MVVM | Reactive UI |

---

# Frequently Asked Interview Questions

1. What are Design Patterns?

2. Why do we use Design Patterns?

3. Difference between Module and Revealing Module?

4. What is Singleton?

5. Factory vs Constructor?

6. Observer vs Pub/Sub?

7. Strategy Pattern use cases?

8. Adapter Pattern example?

9. Decorator Pattern example?

10. Proxy Pattern example?

11. MVC vs MVP vs MVVM?

12. Explain SOLID Principles.

13. What is Dependency Injection?

14. Why use Clean Code?

15. How do you structure a large React project?

---

# Quick Revision

✔ Module → Encapsulation

✔ Revealing Module → Cleaner Public API

✔ Singleton → Single Instance

✔ Factory → Object Creation

✔ Observer → Automatic Notifications

✔ Pub/Sub → Event Bus

✔ Strategy → Switch Algorithms

✔ Adapter → Interface Converter

✔ Decorator → Add Features Dynamically

✔ Proxy → Access Control

✔ MVC → Model + View + Controller

✔ MVP → Model + View + Presenter

✔ MVVM → Model + View + ViewModel

✔ SOLID → Object-Oriented Design Principles

✔ Clean Code → Readable & Maintainable Code

✔ Dependency Injection → Inject Dependencies

✔ Large Scale Architecture → Organized Project Structure

---

# Learning Order

```
Module Pattern
      ↓
Revealing Module
      ↓
Singleton
      ↓
Factory
      ↓
Observer
      ↓
Pub/Sub
      ↓
Strategy
      ↓
Adapter
      ↓
Decorator
      ↓
Proxy
      ↓
MVC
      ↓
MVP
      ↓
MVVM
      ↓
SOLID
      ↓
Clean Code
      ↓
Dependency Injection
      ↓
Large Scale Frontend Architecture
```

---

# Goal

After mastering these topics, you will be able to:

✔ Design scalable JavaScript applications

✔ Write reusable and maintainable code

✔ Build enterprise-level React applications

✔ Crack senior JavaScript and React interviews

✔ Understand real-world software architecture
