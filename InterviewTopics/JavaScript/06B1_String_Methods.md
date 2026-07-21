# JavaScript Interview Master Handbook
# Part 6.2A – Core String Methods

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. slice()
2. substring()
3. substr() (Legacy)
4. indexOf()
5. lastIndexOf()
6. includes()
7. startsWith()
8. endsWith()
9. Time Complexity
10. Interview Questions
11. Output Questions
12. Coding Problems
13. Cheat Sheet

---

# 1. slice()

## Definition

Extracts part of a string.

Returns a **new string**.

Original string remains unchanged.

---

Syntax

```javascript
str.slice(start, end)
```

- start → inclusive
- end → exclusive

---

Example

```javascript
const str = "JavaScript";

console.log(str.slice(0,4));
```

Output

```
Java
```

---

Without End

```javascript
console.log(str.slice(4));
```

Output

```
Script
```

---

Negative Index

```javascript
console.log(str.slice(-6));
```

Output

```
Script
```

---

Time Complexity

```
O(k)
```

(k = number of copied characters)

---

# 2. substring()

Extracts characters between two indexes.

Returns a new string.

---

Syntax

```javascript
str.substring(start, end)
```

---

Example

```javascript
const str = "JavaScript";

console.log(str.substring(0,4));
```

Output

```
Java
```

---

Important Difference

Negative values are treated as

```
0
```

Example

```javascript
console.log(str.substring(-2,4));
```

Output

```
Java
```

---

If

```
start > end
```

JavaScript swaps them.

```javascript
console.log(str.substring(6,2));
```

Output

```
vaSc
```

---

# 3. substr() (Legacy)

⚠️ Deprecated / Legacy

Avoid in new code.

Syntax

```javascript
str.substr(start, length)
```

Example

```javascript
const str = "JavaScript";

console.log(str.substr(4,6));
```

Output

```
Script
```

Prefer

```
slice()
```

instead.

---

# Difference

| Method | Negative Index | Second Parameter |
|---------|----------------|------------------|
| slice | ✅ Yes | End Index |
| substring | ❌ No | End Index |
| substr | ✅ Yes | Length |

---

# 4. indexOf()

Returns first matching index.

If not found

↓

```
-1
```

Example

```javascript
const str = "JavaScript";

console.log(str.indexOf("a"));
```

Output

```
1
```

---

Search From Position

```javascript
console.log(str.indexOf("a",2));
```

Output

```
3
```

---

# 5. lastIndexOf()

Returns the last matching index.

```javascript
const str = "banana";

console.log(str.lastIndexOf("a"));
```

Output

```
5
```

---

Comparison

```
indexOf()

↓

First Match

lastIndexOf()

↓

Last Match
```

---

# 6. includes()

Checks if a substring exists.

Returns

```
true

false
```

Example

```javascript
const str = "JavaScript";

console.log(str.includes("Script"));
```

Output

```
true
```

---

Case Sensitive

```javascript
console.log(str.includes("script"));
```

Output

```
false
```

---

# 7. startsWith()

Checks whether a string begins with a substring.

```javascript
const str = "JavaScript";

console.log(str.startsWith("Java"));
```

Output

```
true
```

---

With Position

```javascript
console.log(str.startsWith("Script",4));
```

Output

```
true
```

---

# 8. endsWith()

Checks whether a string ends with a substring.

```javascript
const str = "JavaScript";

console.log(str.endsWith("Script"));
```

Output

```
true
```

---

Using Length Parameter

```javascript
console.log(str.endsWith("Java",4));
```

Output

```
true
```

The optional second argument specifies the length of the string to consider.

---

# Comparison Table

| Method | Returns | Supports Negative Index |
|---------|----------|------------------------|
| slice | New String | ✅ |
| substring | New String | ❌ |
| substr | New String | ✅ (legacy) |
| indexOf | Index | N/A |
| lastIndexOf | Index | N/A |
| includes | Boolean | N/A |
| startsWith | Boolean | N/A |
| endsWith | Boolean | N/A |

---

# Time Complexity

| Method | Complexity |
|---------|-----------:|
| slice | O(k) |
| substring | O(k) |
| substr | O(k) |
| indexOf | O(n) |
| lastIndexOf | O(n) |
| includes | O(n) |
| startsWith | O(m) |
| endsWith | O(m) |

- `n` = string length
- `m` = length of the searched substring
- `k` = number of copied characters

---

# Best Practices

✔ Prefer `slice()` over `substr()`.

✔ Use `includes()` instead of `indexOf(...) !== -1` when checking existence.

✔ Use `startsWith()` and `endsWith()` for readability.

✔ Remember string methods return new strings because strings are immutable.

---

# Common Mistakes

❌ Expecting `slice()` to modify the original string.

❌ Using `substring()` with negative indexes.

❌ Using deprecated `substr()` in new projects.

❌ Forgetting that string searches are case-sensitive.

---

# Frequently Asked Interview Questions

1. Difference between `slice()` and `substring()`?

2. Why is `substr()` deprecated?

3. Which method supports negative indexes?

4. Difference between `indexOf()` and `includes()`?

5. Difference between `startsWith()` and `includes()`?

6. Difference between `indexOf()` and `lastIndexOf()`?

7. Does `slice()` modify the original string?

8. What does `includes()` return?

9. Is string search case-sensitive?

10. Which method should you use in modern JavaScript for substring extraction?

Answer

```
slice()
```

---

# Output Questions

## Q1

```javascript
console.log("JavaScript".slice(4));
```

Output

```
Script
```

---

## Q2

```javascript
console.log("JavaScript".slice(-6));
```

Output

```
Script
```

---

## Q3

```javascript
console.log("JavaScript".substring(4));
```

Output

```
Script
```

---

## Q4

```javascript
console.log("JavaScript".substring(-2,4));
```

Output

```
Java
```

---

## Q5

```javascript
console.log("banana".indexOf("a"));
```

Output

```
1
```

---

## Q6

```javascript
console.log("banana".lastIndexOf("a"));
```

Output

```
5
```

---

## Q7

```javascript
console.log("JavaScript".includes("Java"));
```

Output

```
true
```

---

## Q8

```javascript
console.log("JavaScript".startsWith("Java"));
```

Output

```
true
```

---

## Q9

```javascript
console.log("JavaScript".endsWith("Script"));
```

Output

```
true
```

---

## Q10

```javascript
console.log("JavaScript".includes("script"));
```

Output

```
false
```

Reason

String matching is case-sensitive.

---

# Coding Problems

## Beginner

1. Extract the first 5 characters.
2. Extract the last 4 characters.
3. Find the first occurrence of a character.
4. Find the last occurrence of a character.
5. Check whether a string starts with "https".

---

## Intermediate

6. Check whether a filename ends with ".pdf".
7. Extract the file extension.
8. Find all positions of a character.
9. Validate an email domain using `endsWith()`.
10. Remove the first word using `slice()`.

---

## Advanced

11. Implement your own `includes()`.
12. Implement your own `startsWith()`.
13. Implement your own `endsWith()`.
14. Implement your own `slice()`.
15. Write a custom substring search algorithm.

---

# Cheat Sheet

```javascript
// Extract
str.slice(start, end);
str.substring(start, end);

// Legacy
str.substr(start, length);

// Search
str.indexOf(text);
str.lastIndexOf(text);
str.includes(text);

// Prefix/Suffix
str.startsWith(prefix);
str.endsWith(suffix);
```

---

# Quick Revision

- `slice()` supports negative indexes and is the preferred extraction method.
- `substring()` treats negative indexes as `0`.
- `substr()` is legacy and should be avoided.
- `indexOf()` returns the first matching index.
- `lastIndexOf()` returns the last matching index.
- `includes()` returns `true` or `false`.
- `startsWith()` checks the beginning of a string.
- `endsWith()` checks the end of a string.
- String methods do **not** modify the original string.

---