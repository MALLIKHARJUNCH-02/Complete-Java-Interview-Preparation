# JavaScript Interview Master Handbook
# Part 7.3A – Callbacks, Callback Hell & Promises (Fundamentals)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is a Callback?
2. Why Callbacks?
3. Synchronous Callbacks
4. Asynchronous Callbacks
5. Callback Hell
6. Inversion of Control
7. Introduction to Promises
8. Promise States
9. Creating Promises
10. Consuming Promises
11. Best Practices
12. Common Mistakes
13. Interview Questions
14. Output Questions
15. Coding Problems
16. Cheat Sheet

---

# 1. What is a Callback?

## Definition

A callback is a function passed as an argument to another function.

The receiving function executes the callback later.

---

Syntax

```javascript
function greet(callback){

    console.log("Hello");

    callback();

}

function sayBye(){

    console.log("Bye");

}

greet(sayBye);
```

Output

```
Hello

Bye
```

---

Real-Life Analogy

Restaurant

```
Order Food

↓

Continue Talking

↓

Waiter Calls Your Number

↓

Collect Food
```

The waiter calling your number is like a callback.

---

# 2. Why Callbacks?

Callbacks allow JavaScript to execute code later.

Without callbacks

```
Task

↓

Wait

↓

Next Task
```

With callbacks

```
Start Task

↓

Continue Other Work

↓

Callback Executes Later
```

---

# 3. Synchronous Callback

Executed immediately.

Example

```javascript
function calculate(a,b,operation){

    return operation(a,b);

}

const result = calculate(

10,

20,

(a,b)=>a+b

);

console.log(result);
```

Output

```
30
```

---

Execution

```
calculate()

↓

operation()

↓

Return

↓

Done
```

---

# 4. Asynchronous Callback

Executed later.

Example

```javascript
console.log("Start");

setTimeout(()=>{

    console.log("Callback");

},1000);

console.log("End");
```

Output

```
Start

End

Callback
```

---

Execution

```
Start

↓

Timer

↓

End

↓

Callback
```

---

# Difference

| Synchronous | Asynchronous |
|-------------|--------------|
| Immediate | Later |
| Blocks execution | Doesn't block |
| Runs now | Runs after async operation |

---

# 5. Callback Hell

Multiple nested callbacks.

Example

```javascript
login(function(){

    getProfile(function(){

        getPosts(function(){

            getComments(function(){

                console.log("Done");

            });

        });

    });

});
```

Visualization

```
login

↓

getProfile

↓

getPosts

↓

getComments

↓

Done
```

Looks like a pyramid.

Also called

```
Pyramid of Doom
```

---

Problems

❌ Hard to read

❌ Hard to debug

❌ Difficult error handling

❌ Difficult maintenance

---

# Real Example

```javascript
setTimeout(()=>{

    console.log("Step 1");

    setTimeout(()=>{

        console.log("Step 2");

        setTimeout(()=>{

            console.log("Step 3");

        },1000);

    },1000);

},1000);
```

Output

```
Step 1

Step 2

Step 3
```

---

# 6. Inversion of Control

One drawback of callbacks.

Instead of controlling execution,

you hand control to another function.

Example

```javascript
loadData(function(){

    console.log("Finished");

});
```

You trust

```
loadData()
```

to execute your callback correctly.

Problems

- Will it call the callback?
- Will it call it once?
- Will it call it multiple times?
- Will it pass the correct data?

Promises solve this problem.

---

# 7. Introduction to Promises

## Definition

A Promise is an object representing the eventual completion or failure of an asynchronous operation.

Promises replace deeply nested callbacks.

---

Real-Life Example

Online Order

```
Place Order

↓

Waiting

↓

Delivered

OR

Cancelled
```

---

# 8. Promise States

Every Promise has one of three states.

```
Pending

↓

Fulfilled

OR

Rejected
```

---

## Pending

Operation still running.

---

## Fulfilled

Operation completed successfully.

---

## Rejected

Operation failed.

---

Important

A Promise settles only once.

It cannot go from fulfilled to rejected later.

---

# 9. Creating Promises

Syntax

```javascript
const promise = new Promise(

(resolve,reject)=>{

});
```

---

Successful Promise

```javascript
const promise = new Promise(

(resolve,reject)=>{

    resolve("Success");

});
```

---

Failed Promise

```javascript
const promise = new Promise(

(resolve,reject)=>{

    reject("Failed");

});
```

---

Delayed Promise

```javascript
const promise = new Promise(

(resolve)=>{

    setTimeout(()=>{

        resolve("Done");

    },2000);

});
```

---

# 10. Consuming Promises

Using then()

```javascript
promise.then(result=>{

    console.log(result);

});
```

Output

```
Done
```

---

Using catch()

```javascript
promise.catch(error=>{

    console.log(error);

});
```

---

Using finally()

```javascript
promise.finally(()=>{

    console.log("Finished");

});
```

Runs whether the promise fulfills or rejects.

---

Complete Example

```javascript
const promise = new Promise(

(resolve,reject)=>{

    const success = true;

    if(success){

        resolve("Data Loaded");

    }else{

        reject("Network Error");

    }

});

promise

.then(result=>{

    console.log(result);

})

.catch(error=>{

    console.log(error);

})

.finally(()=>{

    console.log("Request Finished");

});
```

Output

```
Data Loaded

Request Finished
```

---

# Promise Flow

```
Create Promise

↓

Pending

↓

Resolve

↓

then()

↓

finally()
```

OR

```
Create Promise

↓

Pending

↓

Reject

↓

catch()

↓

finally()
```

---

# Best Practices

✔ Prefer Promises over nested callbacks.

✔ Always handle errors using catch().

✔ Use finally() for cleanup tasks.

✔ Return promises when chaining.

---

# Common Mistakes

❌ Forgetting to return a Promise in a chain.

❌ Ignoring rejected Promises.

❌ Mixing callbacks and Promises unnecessarily.

❌ Calling both resolve() and reject() (only the first one has an effect).

---

# Frequently Asked Interview Questions

1. What is a callback?

2. Difference between synchronous and asynchronous callbacks?

3. What is callback hell?

4. Why is callback hell a problem?

5. What is inversion of control?

6. What is a Promise?

7. Why were Promises introduced?

8. What are the three Promise states?

9. Can a Promise change state after it is settled?

Answer

No.

A Promise settles only once.

10. Difference between resolve() and reject()?

11. What does then() do?

12. What does catch() do?

13. What does finally() do?

14. Can finally() receive the resolved value?

Answer

No.

Use then() or catch() for values.

15. Are Promises synchronous?

Answer

No.

Their callbacks run asynchronously as microtasks.

---

# Output Questions

## Q1

```javascript
function greet(cb){

    console.log("Hello");

    cb();

}

greet(()=>console.log("World"));
```

Output

```
Hello

World
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
const promise =

new Promise(resolve=>{

resolve("Done");

});

promise.then(console.log);
```

Output

```
Done
```

---

## Q4

```javascript
const promise =

new Promise((resolve,reject)=>{

reject("Error");

});

promise.catch(console.log);
```

Output

```
Error
```

---

## Q5

```javascript
Promise.resolve("Hello")

.finally(()=>{

console.log("Finally");

})

.then(console.log);
```

Output

```
Finally

Hello
```

---

## Q6

```javascript
Promise.reject("Failed")

.catch(console.log)

.finally(()=>console.log("Done"));
```

Output

```
Failed

Done
```

---

## Q7

```javascript
new Promise(resolve=>{

resolve(10);

})

.then(x=>x*2)

.then(console.log);
```

Output

```
20
```

---

## Q8

```javascript
new Promise(resolve=>{

resolve();

reject();

})

.then(()=>console.log("Resolved"))

.catch(()=>console.log("Rejected"));
```

Output

```
Resolved
```

Reason

Only the first call (resolve) takes effect.

---

# Coding Problems

## Beginner

1. Write a function that accepts a callback.
2. Create a synchronous callback example.
3. Create an asynchronous callback using setTimeout().
4. Create a Promise that resolves after 2 seconds.
5. Create a Promise that rejects with an error.

---

## Intermediate

6. Convert a callback-based function into a Promise.
7. Simulate a login request using Promises.
8. Chain two Promises.
9. Handle errors using catch().
10. Demonstrate finally().

---

## Advanced

11. Build a reusable delay(ms) Promise.
12. Wrap setTimeout() inside a Promise.
13. Convert nested callbacks into Promise chains.
14. Create a Promise-based file loader simulation.
15. Explain callback hell and refactor it.

---

# Cheat Sheet

```javascript
// Callback
function greet(cb){
    cb();
}

// Promise
const p = new Promise((resolve,reject)=>{

    resolve("Success");

});

// Success
p.then(result=>{

});

// Error
p.catch(error=>{

});

// Cleanup
p.finally(()=>{

});
```

---

# Quick Revision

✔ A callback is a function passed to another function.

✔ Callbacks can be synchronous or asynchronous.

✔ Callback Hell is deeply nested callbacks.

✔ Inversion of Control means handing execution to another function.

✔ A Promise represents an asynchronous operation.

✔ Promise states:

- Pending
- Fulfilled
- Rejected

✔ `then()` handles success.

✔ `catch()` handles errors.

✔ `finally()` runs regardless of success or failure.

✔ Promise callbacks execute as **microtasks**.

---