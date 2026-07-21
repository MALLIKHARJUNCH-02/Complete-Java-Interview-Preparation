# JavaScript Interview Master Handbook
# Part 6.1 – Strings (Fundamentals)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is a String?
2. Why Strings?
3. Ways to Create Strings
4. String Primitive vs String Object
5. String Immutability
6. String Length
7. Character Access
8. Template Literals
9. Escape Characters
10. Unicode & UTF-16 Basics
11. Best Practices
12. Common Mistakes
13. Interview Questions
14. Output Questions
15. Cheat Sheet

---

# 1. What is a String?

## Definition

A string is a sequence of characters used to represent text.

Examples

```javascript
"Hello"

'JavaScript'

`React`
```

---

Real-Life Analogy

```
Book

↓

Sentence

↓

Words

↓

Characters
```

A string is simply a sequence of characters.

---

# 2. Why Strings?

Strings are used for

✔ Names

✔ Emails

✔ Passwords

✔ URLs

✔ Messages

✔ JSON Data

✔ API Responses

✔ HTML Content

---

# 3. Ways to Create Strings

## Double Quotes

```javascript
const name = "Mallik";
```

---

## Single Quotes

```javascript
const city = 'Hyderabad';
```

---

## Template Literals

```javascript
const course = `JavaScript`;
```

Template literals are enclosed in **backticks** (`).

---

## String Constructor (Rare)

```javascript
const str = new String("Hello");
```

Generally avoid this in application code.

---

# 4. Primitive vs String Object

## Primitive

```javascript
const str = "Hello";
```

Type

```javascript
typeof str
```

Output

```
string
```

---

## String Object

```javascript
const str = new String("Hello");
```

Type

```javascript
typeof str
```

Output

```
object
```

---

Interview Question

Which one should you use?

Answer

Always prefer

```
String Primitive
```

---

Comparison

```javascript
const a = "Hello";

const b = new String("Hello");

console.log(a == b);
```

Output

```
true
```

---

```javascript
console.log(a === b);
```

Output

```
false
```

Reason

One is a primitive.

One is an object.

---

# 5. String Immutability

Strings cannot be changed after creation.

Example

```javascript
let str = "Hello";

str[0] = "Y";

console.log(str);
```

Output

```
Hello
```

Nothing changes.

---

Correct Way

```javascript
str = "Yello";
```

---

Interview Question

Are strings mutable?

Answer

No.

Strings are immutable.

---

# 6. String Length

```javascript
const str = "JavaScript";

console.log(str.length);
```

Output

```
10
```

---

Empty String

```javascript
"".length
```

Output

```
0
```

---

# 7. Character Access

## Bracket Notation

```javascript
const str = "Hello";

console.log(str[1]);
```

Output

```
e
```

---

## charAt()

```javascript
console.log(str.charAt(1));
```

Output

```
e
```

---

## at()

Supports negative indexes.

```javascript
console.log(str.at(-1));
```

Output

```
o
```

---

Difference

| Method | Negative Index |
|----------|----------------|
| [] | No |
| charAt() | No |
| at() | Yes |

---

# 8. Template Literals

Introduced in ES6.

---

Without Template Literal

```javascript
const name = "Mallik";

console.log("Hello " + name);
```

---

With Template Literal

```javascript
const name = "Mallik";

console.log(`Hello ${name}`);
```

Output

```
Hello Mallik
```

---

Multi-line String

```javascript
const text = `Line 1
Line 2
Line 3`;
```

No need for `\n`.

---

Expression Interpolation

```javascript
console.log(`2 + 3 = ${2 + 3}`);
```

Output

```
2 + 3 = 5
```

---

# 9. Escape Characters

| Escape | Meaning |
|---------|---------|
| `\n` | New Line |
| `\t` | Tab |
| `\\` | Backslash |
| `\'` | Single Quote |
| `\"` | Double Quote |
| ``\` `` | Backtick |

---

Example

```javascript
console.log("Hello\nWorld");
```

Output

```
Hello
World
```

---

# 10. Unicode & UTF-16 Basics

JavaScript strings are sequences of UTF-16 code units.

Most common characters occupy one code unit.

Some characters (such as many emoji) use **two UTF-16 code units** (a surrogate pair).

Example

```javascript
const emoji = "😀";

console.log(emoji.length);
```

Output

```
2
```

Reason

The emoji is represented by a surrogate pair in UTF-16.

---

Modern APIs

```javascript
for (const ch of emoji) {
    console.log(ch);
}
```

Output

```
😀
```

`for...of` iterates over Unicode code points, making it safer for many Unicode characters.

---

# Best Practices

✔ Use string primitives.

✔ Use template literals.

✔ Prefer `at()` when negative indexing is needed.

✔ Remember strings are immutable.

✔ Be aware of Unicode when processing emoji.

---

# Common Mistakes

❌ Using `new String()` unnecessarily.

❌ Trying to modify characters directly.

❌ Forgetting template literals.

❌ Assuming `.length` always equals the number of visible characters (especially with emoji and some Unicode sequences).

---

# Frequently Asked Interview Questions

1. What is a string?

2. Different ways to create strings?

3. Difference between string primitive and String object?

4. Why should `new String()` usually be avoided?

5. Are strings mutable?

6. How do you access characters?

7. Difference between `charAt()` and `at()`?

8. What are template literals?

9. Advantages of template literals?

10. What is string interpolation?

11. What are escape characters?

12. What encoding does JavaScript use internally for strings?

13. Why can `"😀".length` be `2`?

14. How do you iterate safely over Unicode characters?

15. Why are strings immutable?

---

# Output Questions

## Q1

```javascript
console.log("Hello".length);
```

Output

```
5
```

---

## Q2

```javascript
console.log("Hello"[1]);
```

Output

```
e
```

---

## Q3

```javascript
console.log("Hello".charAt(4));
```

Output

```
o
```

---

## Q4

```javascript
console.log("Hello".at(-1));
```

Output

```
o
```

---

## Q5

```javascript
let str = "Hello";

str[0] = "Y";

console.log(str);
```

Output

```
Hello
```

---

## Q6

```javascript
const name = "Mallik";

console.log(`Hello ${name}`);
```

Output

```
Hello Mallik
```

---

## Q7

```javascript
console.log(typeof "Hello");
```

Output

```
string
```

---

## Q8

```javascript
console.log(typeof new String("Hello"));
```

Output

```
object
```

---

## Q9

```javascript
console.log("😀".length);
```

Output

```
2
```

---

## Q10

```javascript
console.log(`10 * 5 = ${10 * 5}`);
```

Output

```
10 * 5 = 50
```

---

# Coding Problems

## Beginner

1. Print each character of a string.
2. Count the number of characters.
3. Print the first and last character.
4. Convert a string to uppercase.
5. Convert a string to lowercase.

---

## Intermediate

6. Reverse a string.
7. Count vowels.
8. Count consonants.
9. Count words.
10. Remove extra spaces.

---

## Advanced

11. Check for palindrome.
12. Find the first non-repeating character.
13. Find duplicate characters.
14. Count character frequency.
15. Reverse words without using `split().reverse().join()`.

---

# Cheat Sheet

```javascript
// Primitive
const str = "Hello";

// Length
str.length;

// Character
str[0];
str.charAt(0);
str.at(-1);

// Template Literal
`Hello ${name}`;

// Escape Characters
"\n";
"\t";
"\\";
"\"";
"\'";
```

---

# Quick Revision

✔ Strings are immutable.

✔ Prefer string primitives over `new String()`.

✔ `.length` returns the number of UTF-16 code units.

✔ `at()` supports negative indexing.

✔ Template literals support interpolation and multi-line strings.

✔ JavaScript strings are based on UTF-16.

✔ Emoji may occupy two UTF-16 code units.

---