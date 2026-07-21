# JavaScript Interview Master Handbook
# Part 7.3B.1 – Promise Chaining, Error Handling & Promise Combinators

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Promise Chaining
2. Returning Values vs Returning Promises
3. Error Propagation
4. Promise.resolve()
5. Promise.reject()
6. Promise.all()
7. Promise.allSettled()
8. Promise.race()
9. Promise.any()
10. Best Practices
11. Common Mistakes
12. Interview Questions
13. Output Questions
14. Coding Problems
15. Cheat Sheet

---

# 1. Promise Chaining

Instead of nesting multiple `then()` calls, return a value or another Promise.

---

Bad (Nested)

```javascript
login()
.then(user => {

    getProfile(user.id)
    .then(profile => {

        console.log(profile);

    });

});
```

---

Good (Chaining)

```javascript
login()
.then(user => {

    return getProfile(user.id);

})
.then(profile => {

    console.log(profile);

});
```

---

Flow

```
login()

↓

then()

↓

getProfile()

↓

then()

↓

Done
```

---

# 2. Returning Values vs Returning Promises

## Returning a Value

```javascript
Promise.resolve(10)

.then(value => {

    return value * 2;

})
.then(console.log);
```

Output

```
20
```

Returning a normal value automatically wraps it in a resolved Promise.

---

## Returning a Promise

```javascript
Promise.resolve(10)

.then(value => {

    return Promise.resolve(value * 2);

})
.then(console.log);
```

Output

```
20
```

JavaScript waits for the returned Promise to settle.

---

# 3. Error Propagation

Errors automatically travel down the Promise chain until a `catch()` handles them.

---

Example

```javascript
Promise.resolve()

.then(() => {

    throw new Error("Something went wrong");

})
.then(() => {

    console.log("Skipped");

})
.catch(err => {

    console.log(err.message);

});
```

Output

```
Something went wrong
```

---

Recovery

```javascript
Promise.reject("Error")

.catch(() => {

    return "Recovered";

})
.then(console.log);
```

Output

```
Recovered
```

---

# 4. Promise.resolve()

Creates an already fulfilled Promise.

```javascript
Promise.resolve("Hello")
.then(console.log);
```

Output

```
Hello
```

---

Equivalent To

```javascript
new Promise(resolve => {

    resolve("Hello");

});
```

---

# 5. Promise.reject()

Creates an already rejected Promise.

```javascript
Promise.reject("Failed")
.catch(console.log);
```

Output

```
Failed
```

---

Equivalent To

```javascript
new Promise((resolve, reject) => {

    reject("Failed");

});
```

---

# 6. Promise.all()

Runs multiple Promises in parallel.

Resolves only if **all** succeed.

Rejects immediately if **any one** rejects.

---

Example

```javascript
const p1 = Promise.resolve(10);
const p2 = Promise.resolve(20);
const p3 = Promise.resolve(30);

Promise.all([p1, p2, p3])
.then(console.log);
```

Output

```
[10,20,30]
```

---

One Promise Rejects

```javascript
Promise.all([

    Promise.resolve(1),

    Promise.reject("Error"),

    Promise.resolve(3)

])
.catch(console.log);
```

Output

```
Error
```

---

Visualization

```
P1 ✔

P2 ✔

P3 ✔

↓

ALL SUCCESS

↓

Resolve
```

If any Promise fails

```
Reject Immediately
```

---

# 7. Promise.allSettled()

Waits for every Promise to finish.

Never rejects because of another Promise.

---

Example

```javascript
Promise.allSettled([

    Promise.resolve("A"),

    Promise.reject("B"),

    Promise.resolve("C")

])
.then(console.log);
```

Output (simplified)

```javascript
[
  { status: "fulfilled", value: "A" },
  { status: "rejected", reason: "B" },
  { status: "fulfilled", value: "C" }
]
```

---

Use Case

When you want results from every operation, even if some fail.

---

# 8. Promise.race()

Returns the result of the **first Promise to settle** (fulfilled or rejected).

---

Example

```javascript
const fast = new Promise(resolve => {

    setTimeout(() => resolve("Fast"), 100);

});

const slow = new Promise(resolve => {

    setTimeout(() => resolve("Slow"), 500);

});

Promise.race([fast, slow])
.then(console.log);
```

Output

```
Fast
```

---

If the first Promise rejects

```javascript
Promise.race([

    Promise.reject("Error"),

    Promise.resolve("Success")

])
.catch(console.log);
```

Output

```
Error
```

---

# 9. Promise.any()

Returns the **first fulfilled Promise**.

Rejected Promises are ignored unless **all** reject.

---

Example

```javascript
Promise.any([

    Promise.reject("A"),

    Promise.resolve("B"),

    Promise.resolve("C")

])
.then(console.log);
```

Output

```
B
```

---

All Reject

```javascript
Promise.any([

    Promise.reject("A"),

    Promise.reject("B")

])
.catch(error => {

    console.log(error.name);

});
```

Output

```
AggregateError
```

---

# Promise Combinator Comparison

| Method | Success Condition | Failure Condition |
|----------|------------------|-------------------|
| Promise.all | All fulfill | Any rejects |
| Promise.allSettled | Always resolves with results | Never rejects due to input failures |
| Promise.race | First settled Promise wins | First settled Promise rejects |
| Promise.any | First fulfilled Promise | All reject |

---

# Best Practices

✔ Return Promises from `then()`.

✔ Always handle errors using `catch()`.

✔ Use `Promise.all()` when all tasks are required.

✔ Use `Promise.allSettled()` when partial failures are acceptable.

✔ Use `Promise.any()` for fallback requests.

✔ Use `Promise.race()` for timeout-like behavior.

---

# Common Mistakes

❌ Forgetting to `return` inside `then()`.

❌ Nesting Promises instead of chaining them.

❌ Assuming `Promise.all()` waits after a rejection.

❌ Confusing `Promise.any()` with `Promise.race()`.

---

# Frequently Asked Interview Questions

1. What is Promise chaining?

2. Why return a Promise from `then()`?

3. Difference between returning a value and a Promise?

4. How do Promise errors propagate?

5. Difference between `Promise.resolve()` and `new Promise()`?

6. Difference between `Promise.reject()` and `throw`?

7. When should you use `Promise.all()`?

8. Difference between `Promise.all()` and `Promise.allSettled()`?

9. Difference between `Promise.race()` and `Promise.any()`?

10. What happens if every Promise in `Promise.any()` rejects?

Answer

An `AggregateError` is thrown.

---

# Output Questions

## Q1

```javascript
Promise.resolve(10)

.then(x => x * 2)

.then(console.log);
```

Output

```
20
```

---

## Q2

```javascript
Promise.resolve(5)

.then(x => Promise.resolve(x + 5))

.then(console.log);
```

Output

```
10
```

---

## Q3

```javascript
Promise.resolve()

.then(() => {

    throw new Error("Oops");

})
.catch(err => console.log(err.message));
```

Output

```
Oops
```

---

## Q4

```javascript
Promise.all([

    Promise.resolve(1),

    Promise.resolve(2)

])
.then(console.log);
```

Output

```
[1,2]
```

---

## Q5

```javascript
Promise.all([

    Promise.resolve(1),

    Promise.reject("Error")

])
.catch(console.log);
```

Output

```
Error
```

---

## Q6

```javascript
Promise.race([

    Promise.resolve("A"),

    Promise.resolve("B")

])
.then(console.log);
```

Output

```
A
```

(The first already-settled Promise in the iterable wins.)

---

## Q7

```javascript
Promise.any([

    Promise.reject("X"),

    Promise.resolve("Y")

])
.then(console.log);
```

Output

```
Y
```

---

## Q8

```javascript
Promise.reject("Fail")

.catch(() => "Recovered")

.then(console.log);
```

Output

```
Recovered
```

---

## Q9

```javascript
Promise.resolve("JS")

.finally(() => console.log("Done"))

.then(console.log);
```

Output

```
Done
JS
```

---

## Q10

```javascript
Promise.resolve(1)

.then(x => x + 1)

.then(x => x + 1)

.then(console.log);
```

Output

```
3
```

---

# Coding Problems

## Beginner

1. Create a Promise that resolves after 1 second.
2. Chain three `then()` calls.
3. Recover from an error using `catch()`.
4. Create a rejected Promise.
5. Log a cleanup message using `finally()`.

---

## Intermediate

6. Fetch user → fetch profile using Promise chaining.
7. Execute three API simulations with `Promise.all()`.
8. Collect results using `Promise.allSettled()`.
9. Build a timeout using `Promise.race()`.
10. Return fallback data using `Promise.any()`.

---

## Advanced

11. Implement a custom `Promise.all()`.
12. Implement a custom `Promise.race()`.
13. Build a retry mechanism using Promise chaining.
14. Create a Promise pool with limited concurrency.
15. Build a cancellable Promise wrapper (using `AbortController` for actual cancellation of operations that support it).

---

# Cheat Sheet

```javascript
// Resolve
Promise.resolve(value);

// Reject
Promise.reject(reason);

// Chaining
promise
  .then(fn)
  .catch(fn)
  .finally(fn);

// All
Promise.all([...]);

// All Settled
Promise.allSettled([...]);

// Race
Promise.race([...]);

// Any
Promise.any([...]);
```

---

# Quick Revision

- Promise chaining avoids nested callbacks.
- Returning a value from `then()` creates a fulfilled Promise for the next step.
- Returning a Promise pauses the chain until it settles.
- Errors propagate down the chain until `catch()` handles them.
- `Promise.resolve()` creates an already fulfilled Promise.
- `Promise.reject()` creates an already rejected Promise.
- `Promise.all()` succeeds only if every Promise succeeds.
- `Promise.allSettled()` reports every result.
- `Promise.race()` settles with the first Promise to settle.
- `Promise.any()` fulfills with the first successful Promise and throws `AggregateError` only if all Promises reject.

---