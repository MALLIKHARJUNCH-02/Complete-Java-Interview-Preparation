# JavaScript Interview Master Handbook
# Part 7.1 – JavaScript Execution Model & Event Loop Fundamentals

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Why JavaScript is Asynchronous
2. JavaScript Execution Model
3. Single Threaded Nature
4. JavaScript Runtime
5. Call Stack
6. Web APIs
7. Callback Queue
8. Event Loop
9. Execution Flow
10. Synchronous vs Asynchronous
11. Best Practices
12. Interview Questions
13. Output Questions
14. Coding Problems
15. Cheat Sheet

---

# 1. Why JavaScript is Asynchronous?

JavaScript is a **single-threaded** language.

It can execute only **one statement at a time**.

Question:

How can JavaScript handle

- API requests
- Timers
- User clicks
- File uploads

without stopping the entire program?

Answer

JavaScript delegates long-running tasks to the **runtime environment** (browser or Node.js), then continues executing other code.

---

Real-Life Analogy

Imagine a chef.

Without async

```
Order 1

↓

Cook

↓

Wait 20 mins

↓

Order 2
```

With async

```
Take Order

↓

Start Cooking

↓

Accept More Orders

↓

Serve When Ready
```

JavaScript behaves similarly.

---

# 2. JavaScript Execution Model

Execution involves multiple components.

```
JavaScript Code

↓

Call Stack

↓

Web APIs / Node Runtime

↓

Queue

↓

Event Loop

↓

Call Stack
```

---

# 3. Single Threaded Nature

JavaScript has **one call stack**.

Only one function executes at any moment.

Example

```javascript
function one(){

    console.log("One");

}

function two(){

    console.log("Two");

}

one();

two();
```

Output

```
One

Two
```

Execution

```
Call Stack

↓

one()

↓

Pop

↓

two()

↓

Pop
```

---

# 4. JavaScript Runtime

JavaScript alone does **not** provide:

- Timers
- DOM
- HTTP requests
- File system
- Console

These are supplied by the runtime.

Browser Runtime

```
JavaScript Engine

+

DOM

+

Web APIs

+

Event Loop
```

Node.js Runtime

```
JavaScript Engine

+

Node APIs

+

libuv

+

Event Loop
```

---

# 5. Call Stack

The Call Stack stores currently executing functions.

It follows

```
LIFO

Last In

First Out
```

Example

```javascript
function A(){

    B();

}

function B(){

    C();

}

function C(){

    console.log("Hello");

}

A();
```

Execution

```
Stack

↓

A

↓

B

↓

C

↓

console.log

↓

Pop

↓

Pop

↓

Pop
```

Output

```
Hello
```

---

Stack Overflow

Infinite recursion

```javascript
function test(){

    test();

}

test();
```

Output

```
RangeError:

Maximum call stack size exceeded
```

---

# 6. Web APIs

Provided by the browser.

Examples

✔ setTimeout

✔ setInterval

✔ fetch

✔ DOM Events

✔ Geolocation

✔ WebSocket

These are **not** part of the JavaScript language itself.

---

Example

```javascript
setTimeout(()=>{

    console.log("Done");

},2000);
```

Timer runs in Web APIs.

---

# 7. Callback Queue (Task Queue)

When an async task completes

↓

Its callback waits here.

```
setTimeout()

↓

Callback Queue

↓

Event Loop

↓

Call Stack
```

---

# 8. Event Loop

The Event Loop continuously checks

```
Call Stack Empty?

↓

YES

↓

Move Next Callback

↓

Execute
```

---

Visualization

```
Call Stack

↓

Empty?

↓

Yes

↓

Queue

↓

Move Callback

↓

Execute
```

---

# 9. Complete Flow

Example

```javascript
console.log("Start");

setTimeout(()=>{

    console.log("Timer");

},0);

console.log("End");
```

Execution

```
console.log

↓

Start

↓

setTimeout

↓

Web API

↓

console.log

↓

End

↓

Stack Empty

↓

Timer Callback

↓

Timer
```

Output

```
Start

End

Timer
```

---

Important Interview Point

Even

```javascript
setTimeout(fn,0)
```

does NOT execute immediately.

It waits until

- current call stack is empty
- timer has expired (minimum delay)

---

# 10. Synchronous vs Asynchronous

Synchronous

```
Task1

↓

Task2

↓

Task3
```

One after another.

---

Asynchronous

```
Task1

↓

Start Task2

↓

Task3

↓

Task2 Finishes Later
```

---

Example

Sync

```javascript
console.log("A");

console.log("B");

console.log("C");
```

Output

```
A

B

C
```

---

Async

```javascript
console.log("A");

setTimeout(()=>{

console.log("B");

},1000);

console.log("C");
```

Output

```
A

C

B
```

---

# Browser Architecture

```
JavaScript Engine

↓

Call Stack

↓

Web APIs

↓

Task Queue

↓

Event Loop

↓

Call Stack
```

---

# Best Practices

✔ Keep synchronous work short.

✔ Avoid blocking the call stack.

✔ Use Promises instead of deeply nested callbacks.

✔ Use async/await for readability.

---

# Common Mistakes

❌ Assuming `setTimeout(fn,0)` runs immediately.

❌ Thinking JavaScript itself creates threads.

❌ Confusing Web APIs with JavaScript.

❌ Assuming async means parallel execution.

---

# Frequently Asked Interview Questions

1. Is JavaScript single-threaded?

Answer

Yes.

It has one call stack.

---

2. How does JavaScript perform asynchronous tasks?

Using runtime features (Web APIs in browsers or Node.js APIs), the event loop, and queues.

---

3. What is the Call Stack?

Stores currently executing function calls.

---

4. What is Stack Overflow?

Too many nested calls.

---

5. What are Web APIs?

Runtime-provided asynchronous APIs.

---

6. What is Callback Queue?

Queue holding completed async callbacks waiting to run.

---

7. What is Event Loop?

Moves eligible callbacks to the call stack when it becomes empty.

---

8. Why doesn't setTimeout(0) execute immediately?

Because it must wait until the current call stack is empty.

---

9. Is JavaScript multi-threaded?

The language execution is single-threaded, though runtimes may use background threads internally for asynchronous operations.

---

10. Difference between synchronous and asynchronous code?

Sync blocks until complete; async allows other work while waiting.

---

# Output Questions

## Q1

```javascript
console.log("A");

console.log("B");

console.log("C");
```

Output

```
A
B
C
```

---

## Q2

```javascript
console.log("Start");

setTimeout(()=>{

console.log("Timer");

},0);

console.log("End");
```

Output

```
Start
End
Timer
```

---

## Q3

```javascript
function one(){

console.log("1");

}

function two(){

console.log("2");

}

one();

two();
```

Output

```
1
2
```

---

## Q4

```javascript
setTimeout(()=>{

console.log("Hello");

},1000);

console.log("Done");
```

Output

```
Done
Hello
```

---

## Q5

```javascript
function A(){

B();

}

function B(){

console.log("B");

}

A();
```

Output

```
B
```

---

## Q6

```javascript
console.log("1");

setTimeout(()=>{

console.log("2");

},100);

console.log("3");

console.log("4");
```

Output

```
1
3
4
2
```

---

## Q7

```javascript
function test(){

test();

}

test();
```

Output

```
RangeError:
Maximum call stack size exceeded
```

---

## Q8

```javascript
console.log("Before");

setTimeout(()=>{

console.log("After");

},500);

console.log("Middle");
```

Output

```
Before
Middle
After
```

---

## Q9

```javascript
console.log(typeof setTimeout);
```

Typical Output

```
function
```

(The exact implementation is provided by the runtime.)

---

## Q10

```javascript
console.log("Start");

setTimeout(()=>{

console.log("Timer 1");

},0);

setTimeout(()=>{

console.log("Timer 2");

},0);

console.log("End");
```

Output

```
Start
End
Timer 1
Timer 2
```

---

# Coding Problems

## Beginner

1. Print numbers after a delay.
2. Build a digital clock using `setInterval()`.
3. Create a countdown timer.
4. Display a loading message before delayed data.
5. Cancel a timer using `clearTimeout()`.

---

## Intermediate

6. Simulate an API response using `setTimeout()`.
7. Create a reusable delay function.
8. Execute multiple timers with different delays.
9. Build a simple task scheduler.
10. Demonstrate call stack execution with nested functions.

---

## Advanced

11. Simulate the Event Loop using JavaScript.
12. Create your own task queue.
13. Visualize call stack operations.
14. Compare synchronous and asynchronous execution times.
15. Build a mini scheduler with queued tasks.

---

# Cheat Sheet

```javascript
// Timer
setTimeout(fn, delay);

// Repeating Timer
setInterval(fn, delay);

// Cancel
clearTimeout(id);
clearInterval(id);

// Execution Order
Call Stack
↓

Web APIs
↓

Task Queue
↓

Event Loop
↓

Call Stack
```

---

# Quick Revision

- JavaScript executes code using a **single call stack**.
- Asynchronous operations are handled by the runtime, not the language itself.
- The **Call Stack** follows LIFO order.
- **Web APIs** (browser) or runtime APIs (Node.js) manage timers and I/O.
- Completed callbacks wait in the **Task Queue**.
- The **Event Loop** moves callbacks to the call stack when it becomes empty.
- `setTimeout(fn, 0)` is **not immediate**.
- Infinite recursion causes **Maximum call stack size exceeded**.
- Asynchronous code improves responsiveness without making JavaScript itself multi-threaded.

---