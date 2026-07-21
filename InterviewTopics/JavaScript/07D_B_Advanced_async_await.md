# JavaScript Interview Master Handbook
# Part 7.4B – Advanced async/await (Part 1)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Top-Level await
2. Async Iterators
3. for await...of
4. Fetch API with async/await
5. AbortController
6. Request Timeouts
7. Retry Strategies
8. Concurrency Control
9. Performance Optimization
10. Best Practices
11. Interview Questions
12. Output Questions
13. Coding Problems
14. Cheat Sheet

---

# 1. Top-Level await

## Definition

Normally, `await` can only be used inside an `async` function.

ES2022 introduced **Top-Level await** for **ES Modules**.

---

Example

```javascript
// module.js

const response = await fetch("/users");

const users = await response.json();

console.log(users);
```

No async function required.

---

Important

Top-level await works only in **ES Modules**.

Example

```html
<script type="module" src="app.js"></script>
```

---

Interview Question

Can we use await outside async?

Answer

Normally No.

Exception

```
Top-Level await

inside ES Modules.
```

---

# 2. Async Iterators

Normal Iterator

```
next()

↓

value

↓

done
```

---

Async Iterator

Each

```
next()
```

returns

```
Promise

↓

value
```

---

Example

```javascript
async function* numbers(){

    yield 1;

    yield 2;

    yield 3;

}
```

Each value is produced asynchronously.

---

# 3. for await...of

Iterates over Async Iterables.

---

Example

```javascript
async function* numbers(){

    yield Promise.resolve(10);

    yield Promise.resolve(20);

}

async function test(){

    for await (const num of numbers()){

        console.log(num);

    }

}

test();
```

Output

```
10

20
```

---

Difference

```
for...of

↓

Normal Iterable

for await...of

↓

Async Iterable
```

---

Use Cases

✔ Streaming

✔ Reading files

✔ Reading API chunks

✔ Web Streams

---

# 4. Fetch API with async/await

Example

```javascript
async function loadUsers(){

    const response = await fetch(

        "https://jsonplaceholder.typicode.com/users"

    );

    const users = await response.json();

    console.log(users);

}
```

---

Flow

```
Request

↓

Response

↓

JSON

↓

Data
```

---

Always Check

```javascript
if(!response.ok){

    throw new Error("HTTP Error");

}
```

---

Complete Example

```javascript
async function load(){

    try{

        const response = await fetch(url);

        if(!response.ok){

            throw new Error(

                "HTTP " + response.status

            );

        }

        return await response.json();

    }

    catch(error){

        console.error(error);

    }

}
```

---

# 5. AbortController

Used to cancel requests.

---

Create

```javascript
const controller = new AbortController();
```

---

Pass Signal

```javascript
fetch(url,{

    signal: controller.signal

});
```

---

Cancel

```javascript
controller.abort();
```

---

Complete Example

```javascript
const controller =

new AbortController();

fetch(url,{

    signal:controller.signal

})
.catch(error=>{

    console.log(error.name);

});

controller.abort();
```

Output

```
AbortError
```

---

Use Cases

✔ Cancel search requests

✔ Cancel page navigation requests

✔ Cancel duplicate API calls

✔ Prevent memory leaks in React

---

# 6. Request Timeout

JavaScript's Fetch API does **not** have a built-in timeout option.

One common approach is to use `AbortController`.

---

Example

```javascript
async function fetchWithTimeout(url, ms){

    const controller = new AbortController();

    const id = setTimeout(() => {

        controller.abort();

    }, ms);

    try{

        const response = await fetch(url, {

            signal: controller.signal

        });

        return response;

    }

    finally{

        clearTimeout(id);

    }

}
```

---

Flow

```
Request

↓

Timer Starts

↓

Response?

↓

YES

↓

Clear Timer

OR

NO

↓

Abort
```

---

# 7. Retry Strategy

Retry on temporary failures.

---

Example

```javascript
async function retry(fn, retries){

    while(retries > 0){

        try{

            return await fn();

        }

        catch(error){

            retries--;

        }

    }

    throw new Error("Failed");

}
```

---

Exponential Backoff

```
1 sec

↓

2 sec

↓

4 sec

↓

8 sec
```

Useful for API rate limits.

---

# 8. Concurrency Control

Wrong

```javascript
for(const url of urls){

    await fetch(url);

}
```

Sequential.

---

Better

```javascript
await Promise.all(

    urls.map(fetch)

);
```

Parallel.

---

Limit Concurrency

Example

```
100 Requests

↓

Run

5

↓

Next

5

↓

Next

5
```

Useful when APIs have limits.

---

# 9. Performance Optimization

Sequential

```
Task1

↓

Task2

↓

Task3

↓

3 seconds
```

---

Parallel

```
Task1

Task2

Task3

↓

1 second
```

---

Avoid

```javascript
await a();

await b();

await c();
```

When independent.

Prefer

```javascript
await Promise.all([

    a(),

    b(),

    c()

]);
```

---

# Best Practices

✔ Use AbortController.

✔ Handle HTTP errors.

✔ Retry temporary failures.

✔ Run independent tasks in parallel.

✔ Cancel unnecessary requests.

✔ Avoid blocking loops with unnecessary awaits.

---

# Common Mistakes

❌ Forgetting

```javascript
response.ok
```

---

❌ Forgetting to abort long-running requests.

---

❌ Awaiting inside loops unnecessarily.

---

❌ Running 1000 parallel requests without limits.

---

# Frequently Asked Interview Questions

1. What is Top-Level await?

2. Where can Top-Level await be used?

3. What is an Async Iterator?

4. Difference between `for...of` and `for await...of`?

5. What is AbortController?

6. Why cancel requests?

7. Does fetch() have a timeout?

Answer

No.

Implement one using AbortController.

---

8. Difference between sequential and parallel execution?

9. When should Promise.all() be used?

10. What is exponential backoff?

11. How do you retry failed requests?

12. Why limit concurrency?

13. What is `response.ok`?

14. Why check HTTP status codes?

15. How do you avoid memory leaks in React fetch requests?

Answer

Cancel in-flight requests when appropriate (for example, using `AbortController` during cleanup).

---

# Output Questions

## Q1

```javascript
async function test(){

    return await Promise.resolve(5);

}

test().then(console.log);
```

Output

```
5
```

---

## Q2

```javascript
async function* gen(){

    yield 1;

    yield 2;

}

(async ()=>{

    for await(const x of gen()){

        console.log(x);

    }

})();
```

Output

```
1

2
```

---

## Q3

```javascript
async function test(){

    const values =

    await Promise.all([

        Promise.resolve(1),

        Promise.resolve(2)

    ]);

    console.log(values);

}

test();
```

Output

```
[1,2]
```

---

## Q4

```javascript
(async()=>{

    console.log("A");

    await Promise.resolve();

    console.log("B");

})();

console.log("C");
```

Output

```
A

C

B
```

---

## Q5

```javascript
async function test(){

    return 100;

}

console.log(test());
```

Output

```
Promise { ... }
```

---

## Q6

```javascript
(async()=>{

    const value =

    await Promise.resolve("JS");

    console.log(value);

})();
```

Output

```
JS
```

---

## Q7

```javascript
Promise.all([

    Promise.resolve("A"),

    Promise.resolve("B")

])
.then(console.log);
```

Output

```
["A","B"]
```

---

## Q8

```javascript
(async()=>{

    console.log(await 10);

})();
```

Output

```
10
```

(`await` also works with non-Promise values by wrapping them in a resolved Promise.)

---

# Coding Problems

## Beginner

1. Fetch users using async/await.
2. Cancel a request using AbortController.
3. Create a timeout wrapper.
4. Retry an API three times.
5. Read values using `for await...of`.

---

## Intermediate

6. Build a reusable fetch helper.
7. Create a retry utility with delay.
8. Download multiple URLs in parallel.
9. Limit requests to five at a time.
10. Process streamed data using async iterators.

---

## Advanced

11. Build a Promise pool with configurable concurrency.
12. Implement exponential backoff.
13. Build a cancellable search API.
14. Implement a resilient API client with retries and timeout.
15. Process large datasets using async generators.

---

# Cheat Sheet

```javascript
// Async Function
async function demo(){}

// Await
const result = await promise;

// Top-Level await
const data = await fetch(url);

// Async Generator
async function* gen(){}

// Async Iterator
for await(const item of iterable){}

// AbortController
const controller = new AbortController();

fetch(url,{

    signal:controller.signal

});

controller.abort();

// Parallel
await Promise.all([...]);
```

---

# Quick Revision

✔ `async` functions always return Promises.

✔ Top-Level `await` works in ES Modules.

✔ Async iterators return Promises from `next()`.

✔ `for await...of` iterates over async iterables.

✔ Always check `response.ok` after `fetch()`.

✔ `AbortController` cancels fetch requests.

✔ Fetch has no built-in timeout; use `AbortController`.

✔ Retry transient failures with backoff.

✔ Use `Promise.all()` for independent operations.

✔ Limit concurrency when working with many requests.

---