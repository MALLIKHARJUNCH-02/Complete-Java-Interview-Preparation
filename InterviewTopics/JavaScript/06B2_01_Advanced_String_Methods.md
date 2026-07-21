# JavaScript Interview Master Handbook
# Part 6.2B.1 – Advanced String Methods

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. replace()
2. replaceAll()
3. split()
4. trim()
5. trimStart()
6. trimEnd()
7. concat()
8. repeat()
9. padStart()
10. padEnd()
11. Time Complexity
12. Interview Questions
13. Output Questions
14. Coding Problems
15. Cheat Sheet

---

# 1. replace()

## Definition

Replaces the **first matching occurrence** of a string or pattern.

Returns a **new string**.

Original string is unchanged.

---

Syntax

```javascript
str.replace(searchValue, replaceValue)
```

---

Example

```javascript
const str = "Java Java";

console.log(str.replace("Java", "JS"));
```

Output

```
JS Java
```

Only the first occurrence is replaced.

---

Using Regular Expression

```javascript
const str = "Java Java";

console.log(str.replace(/Java/g, "JS"));
```

Output

```
JS JS
```

---

# 2. replaceAll()

Replaces **every occurrence**.

```javascript
const str = "Java Java Java";

console.log(str.replaceAll("Java", "JS"));
```

Output

```
JS JS JS
```

---

Difference

| replace() | replaceAll() |
|------------|--------------|
| First match | All matches |
| Regex supported | String or global regex |

---

# 3. split()

Converts a string into an array.

---

Example

```javascript
const str = "HTML,CSS,JS";

console.log(str.split(","));
```

Output

```
["HTML","CSS","JS"]
```

---

Split by Space

```javascript
const str = "JavaScript Interview";

console.log(str.split(" "));
```

Output

```
["JavaScript","Interview"]
```

---

Split into Characters

```javascript
console.log("Hello".split(""));
```

Output

```
["H","e","l","l","o"]
```

---

Limit

```javascript
console.log("A,B,C,D".split(",",2));
```

Output

```
["A","B"]
```

---

# 4. trim()

Removes whitespace from both ends.

```javascript
const str = "   JavaScript   ";

console.log(str.trim());
```

Output

```
JavaScript
```

---

Whitespace includes

- Spaces
- Tabs
- Newlines

---

# 5. trimStart()

Removes whitespace only from the beginning.

```javascript
const str = "   Hello";

console.log(str.trimStart());
```

Output

```
Hello
```

---

# 6. trimEnd()

Removes whitespace only from the end.

```javascript
const str = "Hello   ";

console.log(str.trimEnd());
```

Output

```
Hello
```

---

# 7. concat()

Joins strings.

```javascript
const first = "Hello";

const second = "World";

console.log(first.concat(" ", second));
```

Output

```
Hello World
```

---

Interview Tip

Prefer

```javascript
`${first} ${second}`
```

or

```javascript
first + " " + second
```

for readability.

---

# 8. repeat()

Repeats a string.

```javascript
console.log("Hi ".repeat(3));
```

Output

```
Hi Hi Hi
```

---

Invalid Count

```javascript
"Hi".repeat(-1);
```

Output

```
RangeError
```

---

# 9. padStart()

Pads the beginning.

```javascript
console.log("5".padStart(3,"0"));
```

Output

```
005
```

---

Real-world Example

```javascript
const invoice = "25";

console.log(invoice.padStart(6,"0"));
```

Output

```
000025
```

---

# 10. padEnd()

Pads the end.

```javascript
console.log("JS".padEnd(5,"."));
```

Output

```
JS...
```

---

Useful for

- Console formatting
- Reports
- Tables

---

# Method Comparison

| Method | Returns | Original Changed |
|---------|----------|------------------|
| replace | New String | ❌ |
| replaceAll | New String | ❌ |
| split | Array | ❌ |
| trim | New String | ❌ |
| trimStart | New String | ❌ |
| trimEnd | New String | ❌ |
| concat | New String | ❌ |
| repeat | New String | ❌ |
| padStart | New String | ❌ |
| padEnd | New String | ❌ |

---

# Time Complexity

| Method | Complexity |
|---------|-----------:|
| replace | O(n) |
| replaceAll | O(n) |
| split | O(n) |
| trim | O(n) |
| trimStart | O(n) |
| trimEnd | O(n) |
| concat | O(n + m) |
| repeat | O(n × count) |
| padStart | O(targetLength) |
| padEnd | O(targetLength) |

---

# Best Practices

✔ Use replaceAll() when replacing every occurrence.

✔ Use trim() before validating user input.

✔ Use split() to convert CSV or text into arrays.

✔ Use padStart() for IDs, invoice numbers, OTP formatting.

✔ Prefer template literals over concat().

---

# Common Mistakes

❌ Expecting replace() to replace every occurrence.

❌ Forgetting trim() before comparing user input.

❌ Splitting on the wrong delimiter.

❌ Passing a negative value to repeat().

---

# Frequently Asked Interview Questions

1. Difference between replace() and replaceAll()?

2. Does replace() modify the original string?

3. What does split() return?

4. How do you split a sentence into words?

5. Difference between trim(), trimStart(), and trimEnd()?

6. When should you use padStart()?

7. Difference between concat() and template literals?

8. Can repeat() accept a negative value?

9. How do you split a string into characters?

10. Which methods return arrays?

---

# Output Questions

## Q1

```javascript
console.log(
    "Java Java".replace("Java","JS")
);
```

Output

```
JS Java
```

---

## Q2

```javascript
console.log(
    "Java Java".replaceAll("Java","JS")
);
```

Output

```
JS JS
```

---

## Q3

```javascript
console.log(
    "HTML,CSS,JS".split(",")
);
```

Output

```
["HTML","CSS","JS"]
```

---

## Q4

```javascript
console.log(
    "Hello".split("")
);
```

Output

```
["H","e","l","l","o"]
```

---

## Q5

```javascript
console.log(
    "   JS   ".trim()
);
```

Output

```
JS
```

---

## Q6

```javascript
console.log(
    "5".padStart(4,"0")
);
```

Output

```
0005
```

---

## Q7

```javascript
console.log(
    "JS".padEnd(5,"*")
);
```

Output

```
JS***
```

---

## Q8

```javascript
console.log(
    "Hi".repeat(3)
);
```

Output

```
HiHiHi
```

---

## Q9

```javascript
console.log(
    "Hello".concat(" ","World")
);
```

Output

```
Hello World
```

---

## Q10

```javascript
console.log(
    "A,B,C".split(",",2)
);
```

Output

```
["A","B"]
```

---

# Coding Problems

## Beginner

1. Replace all spaces with hyphens.
2. Split a sentence into words.
3. Count the number of words.
4. Remove leading and trailing spaces.
5. Generate a zero-padded employee ID.

---

## Intermediate

6. Replace multiple spaces with one space.
7. Convert CSV data into an array.
8. Format a phone number.
9. Mask a credit card except the last four digits.
10. Generate a fixed-width invoice number.

---

## Advanced

11. Implement your own split().
12. Implement your own replaceAll().
13. Build a CSV parser.
14. Build a text formatter.
15. Implement string padding without padStart().

---

# Cheat Sheet

```javascript
// Replace
str.replace(oldValue, newValue);
str.replaceAll(oldValue, newValue);

// Split
str.split(",");
str.split(" ");
str.split("");

// Trim
str.trim();
str.trimStart();
str.trimEnd();

// Repeat
str.repeat(3);

// Padding
str.padStart(length, padString);
str.padEnd(length, padString);

// Concat
str.concat(otherString);
```

---

# Quick Revision

✔ `replace()` replaces the first occurrence.

✔ `replaceAll()` replaces every occurrence.

✔ `split()` converts a string into an array.

✔ `trim()` removes whitespace from both ends.

✔ `trimStart()` removes leading whitespace.

✔ `trimEnd()` removes trailing whitespace.

✔ `repeat()` repeats a string.

✔ `padStart()` pads the beginning.

✔ `padEnd()` pads the end.

✔ None of these methods modify the original string because strings are immutable.

---