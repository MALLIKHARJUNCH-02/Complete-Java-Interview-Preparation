# JavaScript Interview Master Handbook
# Part 7.4A – async / await Fundamentals

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Why async/await?
2. async Function
3. await Keyword
4. How async Works Internally
5. async vs Promise.then()
6. Sequential vs Parallel Execution
7. Error Handling
8. Common Mistakes
9. Best Practices
10. Interview Questions
11. Output Questions
12. Coding Problems
13. Cheat Sheet

---

# 1. Why async/await?

Before ES2017

```
Promise

↓

then()

↓

then()

↓

then()

↓

catch()
```

Lots of chaining.

---

After ES2017

```
async

↓

await

↓

Looks like synchronous code

↓

Still asynchronous
```

Example

Instead of

```javascript
login()

.then(user => {

    return getProfile(user.id);

})

.then(profile => {

    console.log(profile);

})

.catch(console.error);
```

We write

```javascript
async function load(){

    try{

        const user = await login();

        const profile = await getProfile(user.id);

        console.log(profile);

    }

    catch(error){

        console.error(error);

    }

}
```

Much easier to read.

---

# 2. async Function

Adding

```javascript
async
```

before a function means

> This function always returns a Promise.

---

Example

```javascript
async function greet(){

    return "Hello";

}

greet().then(console.log);
```

Output

```
Hello
```

---

Equivalent

```javascript
function greet(){

    return Promise.resolve("Hello");

}
```

---

Even if you return

```javascript
10
```

JavaScript converts it to

```javascript
Promise.resolve(10)
```

---

# 3. await Keyword

`await`

waits for a Promise to settle.

Syntax

```javascript
const result = await promise;
```

---

Example

```javascript
function delay(){

    return new Promise(resolve=>{

        setTimeout(()=>{

            resolve("Done");

        },1000);

    });

}

async function test(){

    console.log("Start");

    const result = await delay();

    console.log(result);

}

test();
```

Output

```
Start

(after 1 second)

Done
```

---

Execution

```
Start

↓

await

↓

Pause current async function

↓

Promise resolves

↓

Resume function
```

---

Important

Only the current async function pauses.

The rest of JavaScript continues executing.

---

# 4. How async Works Internally

Example

```javascript
async function demo(){

    return 100;

}
```

Internally behaves like

```javascript
function demo(){

    return Promise.resolve(100);

}
```

---

Example

```javascript
await fetchData();
```

Behaves similarly to

```javascript
fetchData()

.then(result=>{

    // continue execution

});
```

`await` is syntax built on top of Promises.

---

# 5. async vs then()

Promise Style

```javascript
fetchUser()

.then(user=>{

    return fetchPosts(user.id);

})

.then(posts=>{

    console.log(posts);

});
```

---

async Style

```javascript
async function load(){

    const user = await fetchUser();

    const posts = await fetchPosts(user.id);

    console.log(posts);

}
```

---

Comparison

| Promise | async/await |
|----------|-------------|
| then() | await |
| catch() | try...catch |
| Chaining | Sequential code |
| Harder to read | Easier to read |

---

# 6. Sequential vs Parallel Execution

## Sequential

```javascript
const user = await getUser();

const posts = await getPosts();

const comments = await getComments();
```

Execution

```
User

↓

Posts

↓

Comments
```

Total time

```
1s

+

1s

+

1s

=

3 seconds
```

---

## Parallel

```javascript
const [user, posts, comments] =

await Promise.all([

    getUser(),

    getPosts(),

    getComments()

]);
```

Execution

```
User

Posts

Comments

↓

Run Together

↓

1 second
```

---

Interview Tip

If operations are independent,

use

```javascript
Promise.all()
```

---

# 7. Error Handling

Example

```javascript
async function test(){

    try{

        const data = await Promise.reject("Failed");

        console.log(data);

    }

    catch(error){

        console.log(error);

    }

}

test();
```

Output

```
Failed
```

---

Without try...catch

```javascript
async function test(){

    const data = await Promise.reject("Failed");

}
```

The returned Promise rejects.

Callers should handle it:

```javascript
test().catch(console.error);
```

---

# Finally

```javascript
async function test(){

    try{

        console.log("Work");

    }

    finally{

        console.log("Cleanup");

    }

}

test();
```

Output

```
Work

Cleanup
```

---

# Best Practices

✔ Use async/await for readability.

✔ Wrap awaited code in try...catch.

✔ Use Promise.all() for parallel work.

✔ Keep async functions small.

✔ Return useful values.

---

# Common Mistakes

❌ Forgetting

```javascript
await
```

Example

```javascript
const user = fetchUser();

console.log(user);
```

Output

```
Promise { ... }
```

---

Correct

```javascript
const user = await fetchUser();
```

---

❌ Using await outside async functions.

Wrong

```javascript
function test(){

    await fetchData();

}
```

Correct

```javascript
async function test(){

    await fetchData();

}
```

---

❌ Awaiting independent operations one after another.

Prefer

```javascript
Promise.all()
```

when appropriate.

---

# Frequently Asked Interview Questions

1. What is async?

Answer

A keyword that makes a function return a Promise.

---

2. What does await do?

Pauses the current async function until the Promise settles.

---

3. Can await be used without async?

Generally no.

Exception:

Top-level await in ES modules.

---

4. Does async block JavaScript?

No.

Only the current async function pauses.

---

5. Does async automatically create threads?

No.

---

6. What does an async function return?

Always a Promise.

---

7. Difference between then() and await?

Both work with Promises.

await provides cleaner syntax.

---

8. When should Promise.all() be used?

When independent asynchronous operations can run together.

---

9. How do you catch async errors?

Using

```javascript
try...catch
```

or by handling the returned Promise with `.catch()`.

---

10. Is async/await faster than Promises?

No.

It's primarily syntactic sugar over Promises.

---

# Output Questions

## Q1

```javascript
async function test(){

    return 10;

}

test().then(console.log);
```

Output

```
10
```

---

## Q2

```javascript
async function test(){

    return Promise.resolve(20);

}

test().then(console.log);
```

Output

```
20
```

---

## Q3

```javascript
async function test(){

    console.log("A");

    await Promise.resolve();

    console.log("B");

}

test();

console.log("C");
```

Output

```
A

C

B
```

Reason

The code after `await` resumes in a later microtask.

---

## Q4

```javascript
async function test(){

    return "JS";

}

console.log(test());
```

Output

```
Promise { ... }
```

---

## Q5

```javascript
async function test(){

    throw new Error("Failed");

}

test().catch(e=>{

    console.log(e.message);

});
```

Output

```
Failed
```

---

## Q6

```javascript
async function test(){

    const value = await Promise.resolve(5);

    return value * 2;

}

test().then(console.log);
```

Output

```
10
```

---

## Q7

```javascript
async function demo(){

    console.log(1);

    await Promise.resolve();

    console.log(2);

}

console.log(0);

demo();

console.log(3);
```

Output

```
0

1

3

2
```

---

## Q8

```javascript
async function test(){

    try{

        await Promise.reject("Error");

    }

    catch(e){

        console.log(e);

    }

}

test();
```

Output

```
Error
```

---

## Q9

```javascript
async function hello(){

    return "Hi";

}

hello().then(console.log);
```

Output

```
Hi
```

---

## Q10

```javascript
async function demo(){

    console.log(await Promise.resolve("JavaScript"));

}

demo();
```

Output

```
JavaScript
```

---

# Coding Problems

## Beginner

1. Create an async function returning a string.
2. Await a Promise that resolves after 2 seconds.
3. Handle errors using try...catch.
4. Fetch two values sequentially.
5. Fetch three values in parallel.

---

## Intermediate

6. Build a delay(ms) function using async/await.
7. Simulate a login API.
8. Fetch user → posts → comments.
9. Use Promise.all() with async/await.
10. Retry an async operation on failure.

---

## Advanced

11. Implement an async queue.
12. Limit concurrent API requests.
13. Build a retry mechanism with exponential backoff.
14. Execute tasks in batches.
15. Compare sequential vs parallel execution times.

---

# Cheat Sheet

```javascript
// Async Function
async function demo(){}

// Await
const data = await promise;

// Error Handling
try{

    await promise;

}

catch(error){

}

// Parallel
const [a,b] = await Promise.all([

    p1,

    p2

]);
```

---

# Quick Revision

- `async` makes a function return a Promise.
- `await` pauses only the current async function until a Promise settles.
- `await` is built on top of Promises.
- Code after `await` resumes as a microtask.
- Use `try...catch` to handle async errors.
- Use `Promise.all()` for independent parallel operations.
- `async/await` improves readability but does not make code inherently faster.
- Forgetting `await` usually gives you a Promise object instead of the resolved value.
- `await` generally requires an `async` function, except for top-level `await` in ES modules.

---