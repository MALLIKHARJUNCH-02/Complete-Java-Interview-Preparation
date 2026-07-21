# JavaScript Interview Master Handbook
# Part 6.2B.2 – Regular Expressions & Search Methods (Part 1)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is a Regular Expression?
2. Creating Regular Expressions
3. search()
4. match()
5. matchAll()
6. test()
7. exec()
8. Regex Flags
9. Character Classes
10. Best Practices
11. Interview Questions
12. Output Questions
13. Coding Problems
14. Cheat Sheet

---

# 1. What is a Regular Expression?

## Definition

A Regular Expression (Regex) is a pattern used to search, match, validate, and replace text.

---

Real-Life Analogy

Imagine a security guard checking ID cards.

Instead of checking every detail manually,

the guard follows a **pattern**.

Regex works the same way.

```
Input

↓

Regex Pattern

↓

Match / No Match
```

---

Uses

✔ Email Validation

✔ Password Validation

✔ Phone Number Validation

✔ URL Validation

✔ Search

✔ Replace

✔ Data Extraction

---

# 2. Creating Regular Expressions

## Literal Syntax (Recommended)

```javascript
const regex = /JavaScript/;
```

---

## Constructor

```javascript
const regex = new RegExp("JavaScript");
```

Useful when patterns are created dynamically.

---

# 3. search()

Returns the index of the first match.

Returns

```
-1
```

if no match exists.

---

Example

```javascript
const str = "Learn JavaScript";

console.log(str.search(/JavaScript/));
```

Output

```
6
```

---

Not Found

```javascript
console.log(str.search(/Python/));
```

Output

```
-1
```

---

# 4. match()

Returns matching text.

---

Example

```javascript
const str = "JavaScript";

console.log(str.match(/Script/));
```

Output (simplified)

```javascript
["Script"]
```

---

Without `g`

Returns

- First match
- Extra information (index, input, groups)

---

With Global Flag

```javascript
const str = "JS JS JS";

console.log(str.match(/JS/g));
```

Output

```javascript
["JS","JS","JS"]
```

---

If no match

```
null
```

---

# 5. matchAll()

Returns an iterator containing **all matches**.

Works with the **global (`g`) flag**.

---

Example

```javascript
const str = "JS HTML JS";

const matches = [...str.matchAll(/JS/g)];

console.log(matches.length);
```

Output

```
2
```

---

Unlike `match(g)`, each result includes metadata such as index and captured groups.

---

# 6. test()

Checks whether a pattern matches.

Returns

```
true

false
```

---

Example

```javascript
const regex = /Java/;

console.log(regex.test("JavaScript"));
```

Output

```
true
```

---

Interview Tip

Use

```
test()
```

for validation.

---

# 7. exec()

Executes regex.

Returns detailed match information.

---

Example

```javascript
const regex = /Java/;

console.log(regex.exec("JavaScript"));
```

Output (simplified)

```javascript
[
 "Java",
 index:0
]
```

---

Difference

| Method | Returns |
|----------|----------|
| test | Boolean |
| exec | Match Object |

---

# 8. Regex Flags

## g

Global

Find all matches.

```javascript
/JS/g
```

---

## i

Ignore Case

```javascript
/javascript/i
```

Matches

```
JavaScript

JAVASCRIPT

javascript
```

---

## m

Multiline

Allows

```
^

$
```

to match the start and end of **each line** rather than only the entire string.

---

## s

DotAll

Allows

```
.
```

to match newline characters.

---

## u

Unicode

Improves Unicode handling.

Recommended for modern Unicode-aware regex.

---

## y

Sticky

Matches only from the regex's current `lastIndex`.

Advanced usage.

---

Multiple Flags

```javascript
/hello/gi
```

---

# 9. Character Classes

## Digits

```javascript
\d
```

Matches

```
0-9
```

Equivalent

```javascript
[0-9]
```

---

## Non-Digits

```javascript
\D
```

---

## Word Characters

```javascript
\w
```

Matches

```
A-Z

a-z

0-9

_
```

---

## Non-Word

```javascript
\W
```

---

## Whitespace

```javascript
\s
```

Matches

- Space
- Tab
- Newline

---

## Non-Whitespace

```javascript
\S
```

---

## Dot

```javascript
.
```

Matches almost any character except line terminators by default.

With the `s` flag, it also matches newlines.

---

# Character Set

```javascript
/[abc]/
```

Matches

```
a

b

c
```

---

Range

```javascript
/[A-Z]/

/[a-z]/

/0-9/
```

---

Negated Set

```javascript
/[^0-9]/
```

Matches anything except digits.

---

# Best Practices

✔ Use regex literals for fixed patterns.

✔ Use `test()` for validation.

✔ Use `matchAll()` when you need every match along with metadata.

✔ Keep regex readable.

✔ Escape special characters when needed.

---

# Common Mistakes

❌ Forgetting the `g` flag with `matchAll()`.

❌ Using `match()` when only a boolean is needed.

❌ Forgetting regex is case-sensitive unless `i` is used.

❌ Writing overly complex regex that is difficult to maintain.

---

# Frequently Asked Interview Questions

1. What is Regex?

2. Why use Regex?

3. Difference between `match()` and `matchAll()`?

4. Difference between `test()` and `exec()`?

5. Difference between `search()` and `match()`?

6. What does the `g` flag do?

7. What does the `i` flag do?

8. What does the `m` flag do?

9. What does the `s` flag do?

10. What does the `u` flag do?

11. What does `\d` match?

12. Difference between `\d` and `[0-9]`?

13. What does `\w` match?

14. What does `\s` match?

15. What does `.` match?

---

# Output Questions

## Q1

```javascript
console.log("JavaScript".search(/Script/));
```

Output

```
4
```

---

## Q2

```javascript
console.log("JavaScript".match(/Java/));
```

Output (simplified)

```javascript
["Java"]
```

---

## Q3

```javascript
console.log("JS JS".match(/JS/g));
```

Output

```javascript
["JS","JS"]
```

---

## Q4

```javascript
console.log(/Java/.test("JavaScript"));
```

Output

```
true
```

---

## Q5

```javascript
console.log(/Python/.test("JavaScript"));
```

Output

```
false
```

---

## Q6

```javascript
console.log("ABC".match(/[A-Z]/g));
```

Output

```javascript
["A","B","C"]
```

---

## Q7

```javascript
console.log("123".match(/\d/g));
```

Output

```javascript
["1","2","3"]
```

---

## Q8

```javascript
console.log("abc".match(/\D/g));
```

Output

```javascript
["a","b","c"]
```

---

## Q9

```javascript
console.log("A B".match(/\s/g));
```

Output

```javascript
[" "]
```

---

## Q10

```javascript
console.log("A_B".match(/\w/g));
```

Output

```javascript
["A","_","B"]
```

---

# Coding Problems

## Beginner

1. Check whether a string contains only digits.
2. Count the number of digits.
3. Count uppercase letters.
4. Count lowercase letters.
5. Count spaces.

---

## Intermediate

6. Extract all email addresses from text.
7. Find all numbers in a paragraph.
8. Replace multiple spaces with one.
9. Remove all special characters.
10. Count words using regex.

---

## Advanced

11. Build a username validator.
12. Build a ZIP code validator.
13. Extract hashtags from text.
14. Extract mentions (`@username`) from text.
15. Parse log entries using regex.

---

# Cheat Sheet

```javascript
// Create
const regex = /pattern/;

// Search
str.search(regex);

// Match
str.match(regex);

// Match All
[...str.matchAll(/pattern/g)];

// Test
regex.test(str);

// Exec
regex.exec(str);

// Flags
/g
/i
/m
/s
/u
/y

// Character Classes
\d
\D
\w
\W
\s
\S
.
```

---

# Quick Revision

- Regex is used for pattern matching.
- `search()` returns the first matching index.
- `match()` returns matching text.
- `matchAll()` returns all matches with detailed information.
- `test()` returns `true` or `false`.
- `exec()` returns a match object.
- `g` = global search.
- `i` = ignore case.
- `m` = multiline.
- `s` = dot matches newlines.
- `u` = Unicode mode.
- `y` = sticky matching.
- `\d` matches digits.
- `\w` matches letters, digits, and underscore.
- `\s` matches whitespace.

---