# JavaScript Interview Master Handbook
# Part 7.2 – Microtasks vs Macrotasks

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Event Loop Review
2. Tasks (Macrotasks)
3. Microtasks
4. Event Loop Priority
5. Promise Callbacks
6. queueMicrotask()
7. MutationObserver
8. Complete Execution Flow
9. Best Practices
10. Common Mistakes
11. Interview Questions
12. Output Questions
13. Coding Problems
14. Cheat Sheet

---

# 1. Event Loop Review

JavaScript Runtime

```
               JavaScript Runtime

                     │
                     ▼
              ┌──────────────┐
              │  Call Stack  │
              └──────┬───────┘
                     │
                     ▼
              Execute Code
                     │
                     ▼
            Is Stack Empty?
                     │
             ┌───────┴────────┐
             │                │
           No                 Yes
             │                │
             ▼                ▼
      Keep Executing    Run Microtasks
                              │
                              ▼
                     Microtasks Empty?
                              │
                              ▼
                        Run One Task
                              │
                              ▼
                         Repeat Cycle
```

---

# 2. What are Tasks (Macrotasks)?

Macrotasks (usually just called **tasks**) are asynchronous callbacks that are scheduled to run in future event loop iterations.

Examples

✔ setTimeout()

✔ setInterval()

✔ DOM Events

✔ MessageChannel

---

Example

```javascript
setTimeout(() => {

    console.log("Timer");

}, 0);
```

The callback enters the **Task Queue**.

---

# Task Queue

```
Task Queue

↓

Timer1

↓

Timer2

↓

Click Event

↓

Network Event
```

---

# 3. What are Microtasks?

Microtasks are **higher-priority asynchronous callbacks**.

Examples

✔ Promise.then()

✔ Promise.catch()

✔ Promise.finally()

✔ queueMicrotask()

✔ MutationObserver (browser)

---

Example

```javascript
Promise.resolve()

.then(() => {

    console.log("Promise");

});
```

---

Microtask Queue

```
Microtask Queue

↓

Promise.then

↓

queueMicrotask

↓

Promise.catch

↓

finally
```

---

# 4. Event Loop Priority

This is the MOST IMPORTANT interview concept.

Priority Order

```
Current Call Stack

↓

ALL Microtasks

↓

ONE Task (Macrotask)

↓

Repeat
```

Visual

```
Call Stack

↓

Microtasks

↓

Task Queue

↓

Microtasks

↓

Task Queue
```

---

Interview Rule

Microtasks ALWAYS execute before Tasks.

---

# Example

```javascript
console.log("Start");

setTimeout(() => {

    console.log("Timer");

},0);

Promise.resolve()

.then(() => {

    console.log("Promise");

});

console.log("End");
```

Execution

```
Start

↓

Timer Scheduled

↓

Promise Scheduled

↓

End

↓

Microtask

↓

Promise

↓

Task

↓

Timer
```

Output

```
Start

End

Promise

Timer
```

---

# Why?

Promise callback

↓

Microtask Queue

Higher Priority

Timer

↓

Task Queue

Lower Priority

---

# 5. Promise Callbacks

Every Promise callback becomes a Microtask.

```javascript
Promise.resolve()

.then(() => {

console.log("A");

});
```

Order

```
Call Stack

↓

Promise Queue

↓

Execute
```

---

Chain Example

```javascript
Promise.resolve()

.then(() => {

console.log(1);

})

.then(() => {

console.log(2);

})

.then(() => {

console.log(3);

});
```

Output

```
1

2

3
```

Each `.then()` schedules the next step as another microtask.

---

# 6. queueMicrotask()

Schedules a Microtask directly.

```javascript
queueMicrotask(() => {

console.log("Microtask");

});

console.log("Main");
```

Output

```
Main

Microtask
```

---

Comparison

```javascript
queueMicrotask()
```

↓

Microtask

```javascript
setTimeout()
```

↓

Task

---

# 7. MutationObserver

Browser API

Detects DOM changes.

Its callback is queued as a Microtask.

Example

```javascript
const observer = new MutationObserver(() => {

    console.log("DOM changed");

});
```

Interview Note

Mostly asked conceptually.

Rarely appears in coding rounds.

---

# 8. Complete Execution Flow

Example

```javascript
console.log("1");

setTimeout(() => {

console.log("2");

},0);

Promise.resolve()

.then(() => {

console.log("3");

});

queueMicrotask(() => {

console.log("4");

});

console.log("5");
```

Execution

```
1

↓

Timer Scheduled

↓

Promise Scheduled

↓

Microtask Scheduled

↓

5

↓

Microtasks

↓

3

↓

4

↓

Task

↓

2
```

Output

```
1

5

3

4

2
```

---

# Multiple Microtasks

```javascript
Promise.resolve()

.then(() => console.log(1));

queueMicrotask(() => console.log(2));

Promise.resolve()

.then(() => console.log(3));
```

Output

```
1

2

3
```

Reason

Microtasks execute in FIFO order.

---

# Nested Microtasks

```javascript
Promise.resolve()

.then(() => {

console.log(1);

queueMicrotask(() => {

console.log(2);

});

});

console.log(3);
```

Output

```
3

1

2
```

The event loop continues processing newly added microtasks before moving to the task queue.

---

# Event Loop Algorithm

```
Execute Sync Code

↓

Call Stack Empty?

↓

Run ALL Microtasks

↓

Run ONE Task

↓

Run ALL New Microtasks

↓

Repeat
```

---

# Best Practices

✔ Prefer Promises over nested timers.

✔ Use queueMicrotask() only when you specifically need microtask semantics.

✔ Avoid creating endless microtask chains.

---

# Common Mistakes

❌ Thinking

```
setTimeout(0)
```

runs immediately.

---

❌ Assuming timers run before Promises.

---

❌ Forgetting that all queued microtasks are processed before the next task.

---

# Frequently Asked Interview Questions

1. Difference between Microtask and Task?

2. Which executes first?

Answer

Microtasks.

---

3. Does Promise.then() create a Microtask?

Yes.

---

4. Does setTimeout() create a Task?

Yes.

---

5. Does queueMicrotask() create a Task?

No.

It creates a Microtask.

---

6. Why do Promises execute before timers?

Because the event loop processes the entire microtask queue before taking the next task.

---

7. What is MutationObserver?

A browser API whose callback runs as a microtask.

---

8. What is queueMicrotask()?

Schedules a callback in the microtask queue.

---

9. Which queue has higher priority?

Microtask Queue.

---

10. Are all microtasks completed before timers?

Yes.

---

# Output Questions

## Q1

```javascript
console.log("A");

Promise.resolve().then(() => {

console.log("B");

});

console.log("C");
```

Output

```
A

C

B
```

---

## Q2

```javascript
console.log("1");

setTimeout(() => {

console.log("2");

},0);

Promise.resolve().then(() => {

console.log("3");

});

console.log("4");
```

Output

```
1

4

3

2
```

---

## Q3

```javascript
queueMicrotask(() => {

console.log("A");

});

console.log("B");
```

Output

```
B

A
```

---

## Q4

```javascript
Promise.resolve()

.then(() => {

console.log(1);

});

Promise.resolve()

.then(() => {

console.log(2);

});
```

Output

```
1

2
```

---

## Q5

```javascript
setTimeout(() => {

console.log("Timer");

},0);

queueMicrotask(() => {

console.log("Micro");

});
```

Output

```
Micro

Timer
```

---

## Q6

```javascript
console.log("Start");

queueMicrotask(() => {

console.log("A");

});

setTimeout(() => {

console.log("B");

},0);

Promise.resolve()

.then(() => {

console.log("C");

});

console.log("End");
```

Output

```
Start

End

A

C

B
```

---

## Q7

```javascript
console.log(1);

Promise.resolve()

.then(() => {

console.log(2);

setTimeout(() => {

console.log(3);

},0);

});

console.log(4);
```

Output

```
1

4

2

3
```

---

## Q8

```javascript
setTimeout(() => console.log(1),0);

setTimeout(() => console.log(2),0);

Promise.resolve().then(() => console.log(3));
```

Output

```
3

1

2
```

---

## Q9

```javascript
console.log("X");

Promise.resolve().then(() => {

console.log("Y");

queueMicrotask(() => {

console.log("Z");

});

});

console.log("W");
```

Output

```
X

W

Y

Z
```

---

## Q10

```javascript
console.log("A");

setTimeout(() => console.log("B"),0);

Promise.resolve()

.then(() => console.log("C"))

.then(() => console.log("D"));

console.log("E");
```

Output

```
A

E

C

D

B
```

---

# Coding Problems

## Beginner

1. Print messages using setTimeout() and Promise.
2. Demonstrate Promise priority over timers.
3. Use queueMicrotask() to schedule work.
4. Build a delayed logger.
5. Compare synchronous vs asynchronous execution.

---

## Intermediate

6. Create a custom scheduler showing task order.
7. Simulate event loop execution.
8. Visualize call stack and queues.
9. Demonstrate nested microtasks.
10. Compare multiple timers and promises.

---

## Advanced

11. Build an event loop visualizer.
12. Implement a simple task scheduler.
13. Simulate FIFO execution of microtasks.
14. Create interview-style output puzzles.
15. Explain each execution step for a given async snippet.

---

# Cheat Sheet

```javascript
// Task (Macrotask)
setTimeout(fn, 0);
setInterval(fn, 1000);

// Microtask
Promise.resolve().then(fn);
queueMicrotask(fn);

// Priority
Sync Code
↓

Microtasks
↓

One Task
↓

Repeat
```

---

# Quick Revision

- JavaScript finishes **all synchronous code first**.
- **Microtasks have higher priority than tasks**.
- `Promise.then()`, `catch()`, `finally()`, and `queueMicrotask()` create **microtasks**.
- `setTimeout()` and `setInterval()` schedule **tasks (macrotasks)**.
- The event loop:
  1. Runs synchronous code.
  2. Drains **all** microtasks.
  3. Executes **one** task.
  4. Repeats the cycle.
- `setTimeout(fn, 0)` never interrupts currently running code.
- Understanding microtasks vs. tasks is the key to solving most JavaScript async output questions.

---