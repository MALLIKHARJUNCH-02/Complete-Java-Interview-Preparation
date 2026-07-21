# JavaScript Interview Master Handbook
# Part 6.2B.3A – Advanced Regex Patterns & Real-World Validation

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Quantifiers
2. Anchors
3. Alternation
4. Groups
5. Capturing Groups
6. Named Capturing Groups
7. Backreferences
8. Lookaheads
9. Lookbehinds
10. Validation Examples
11. Best Practices
12. Interview Questions
13. Output Questions
14. Coding Problems
15. Cheat Sheet

---

# 1. Quantifiers

Quantifiers tell regex **how many times** a pattern should appear.

---

## *

Zero or More

```
ab*
```

Matches

```
a
ab
abb
abbb
```

---

Example

```javascript
console.log("abbb".match(/ab*/));
```

Output

```
["abbb"]
```

---

## +

One or More

```
ab+
```

Matches

```
ab
abb
abbb
```

Does NOT match

```
a
```

---

Example

```javascript
console.log("abbb".match(/ab+/));
```

Output

```
["abbb"]
```

---

## ?

Zero or One

```
colou?r
```

Matches

```
color

colour
```

---

Example

```javascript
console.log(/colou?r/.test("color"));
```

Output

```
true
```

---

```javascript
console.log(/colou?r/.test("colour"));
```

Output

```
true
```

---

## {n}

Exactly n times

```
\d{4}
```

Matches

```
1234
```

Not

```
123
```

---

## {n,m}

Between n and m times

```
\d{2,4}
```

Matches

```
12

123

1234
```

---

## {n,}

At least n times

```
\d{3,}
```

Matches

```
123

12345
```

---

# Quantifier Summary

| Symbol | Meaning |
|---------|---------|
| * | 0 or more |
| + | 1 or more |
| ? | 0 or 1 |
| {n} | Exactly n |
| {n,m} | Between n and m |
| {n,} | At least n |

---

# 2. Anchors

Anchors define **position**, not characters.

---

## ^

Beginning of string

```javascript
/^Java/
```

Matches

```
JavaScript
```

Does NOT match

```
Learn Java
```

---

## $

End of string

```javascript
/Script$/
```

Matches

```
JavaScript
```

Does NOT match

```
Script Tutorial
```

---

Beginning AND End

```javascript
/^Hello$/
```

Matches ONLY

```
Hello
```

---

# 3. Alternation

OR operator

```
|
```

Example

```javascript
/Cat|Dog/
```

Matches

```
Cat

Dog
```

---

Example

```javascript
console.log(/Cat|Dog/.test("Dog"));
```

Output

```
true
```

---

# 4. Groups

Groups are created using parentheses.

```javascript
(Java)(Script)
```

Group 1

↓

Java

Group 2

↓

Script

---

Example

```javascript
const result = "JavaScript".match(/(Java)(Script)/);

console.log(result);
```

Output (simplified)

```javascript
[
  "JavaScript",
  "Java",
  "Script"
]
```

---

# 5. Capturing Groups

Capturing groups store matched values.

Example

```javascript
const date = "2026-07-21";

const result = date.match(/(\d{4})-(\d{2})-(\d{2})/);

console.log(result);
```

Output (simplified)

```javascript
[
 "2026-07-21",
 "2026",
 "07",
 "21"
]
```

---

# 6. Named Capturing Groups

Modern JavaScript

```javascript
const regex =

/(?<year>\d{4})-(?<month>\d{2})-(?<day>\d{2})/;

const result =

"2026-07-21".match(regex);

console.log(result.groups);
```

Output

```javascript
{
    year:"2026",

    month:"07",

    day:"21"
}
```

---

Interview Tip

Named groups improve readability.

---

# 7. Backreferences

Reuse a captured group later.

Example

```javascript
const regex = /(\w+)\s\1/;

console.log(regex.test("hello hello"));
```

Output

```
true
```

---

Explanation

```
(\w+)

↓

Capture

↓

hello

↓

\1

↓

Must match

hello
```

---

Example

```javascript
console.log(

/(\d)\1/.test("11")

);
```

Output

```
true
```

---

# 8. Lookahead

Checks what comes next **without consuming it**.

---

Positive Lookahead

```
(?=...)
```

Example

```javascript
console.log(

/Java(?=Script)/

.test("JavaScript")

);
```

Output

```
true
```

---

Negative Lookahead

```
(?!...)
```

Example

```javascript
console.log(

/Java(?!Python)/

.test("JavaScript")

);
```

Output

```
true
```

---

# 9. Lookbehind

Checks what comes before.

---

Positive Lookbehind

```
(?<=...)
```

Example

```javascript
console.log(

/(?<=\$)\d+/

.exec("$100")[0]

);
```

Output

```
100
```

---

Negative Lookbehind

```
(?<!...)
```

Example

```javascript
console.log(

/(?<!\$)\d+/

.test("100")

);
```

Output

```
true
```

---

# 10. Real-World Validation Examples

## Email

```javascript
const emailRegex =

/^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;
```

Example

```javascript
emailRegex.test("user@example.com");
```

Output

```
true
```

Note: This is suitable for many applications but does not cover every valid email address defined by RFC standards.

---

## Indian Mobile Number

```javascript
/^[6-9]\d{9}$/
```

Valid

```
9876543210
```

Invalid

```
1234567890
```

---

## Password

Minimum

- 8 characters
- Uppercase
- Lowercase
- Number
- Special character

```javascript
/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&]).{8,}$/
```

---

## URL

A practical example

```javascript
/^https?:\/\/.+/
```

This matches URLs starting with `http://` or `https://`. Production-grade URL validation is often better handled using the built-in `URL` class rather than an extremely complex regex.

---

## PAN (India)

```javascript
/^[A-Z]{5}[0-9]{4}[A-Z]$/
```

Example

```
ABCDE1234F
```

---

## Aadhaar Format

```javascript
/^\d{12}$/
```

This checks **format only** (12 digits). It does **not** verify whether the Aadhaar number is valid.

---

## PIN Code (India)

```javascript
/^[1-9][0-9]{5}$/
```

---

## IPv4 Address

A practical validation regex:

```javascript
/^(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}$/
```

---

# Best Practices

✔ Keep regex readable.

✔ Use named capturing groups for complex patterns.

✔ Test regex with multiple inputs.

✔ Prefer built-in APIs (like `URL`) when they provide more reliable validation.

✔ Comment complex regex in production code.

---

# Common Mistakes

❌ Forgetting `^` and `$` when validating an entire string.

❌ Using `.*` too aggressively.

❌ Writing one unreadable giant regex.

❌ Assuming regex alone is enough for business validation (e.g., Aadhaar checksum, email deliverability).

---

# Frequently Asked Interview Questions

1. Difference between `*` and `+`?
2. Difference between `+` and `?`?
3. What are quantifiers?
4. What are anchors?
5. Difference between `^` and `$`?
6. What are capturing groups?
7. What are named groups?
8. What are backreferences?
9. What is lookahead?
10. What is lookbehind?
11. Difference between positive and negative lookahead?
12. Difference between positive and negative lookbehind?
13. How would you validate an email?
14. How would you validate an Indian mobile number?
15. Why are `^` and `$` important in validation?

---

# Output Questions

## Q1

```javascript
console.log(/\d{4}/.test("2026"));
```

Output

```
true
```

---

## Q2

```javascript
console.log(/^Java/.test("JavaScript"));
```

Output

```
true
```

---

## Q3

```javascript
console.log(/Script$/.test("JavaScript"));
```

Output

```
true
```

---

## Q4

```javascript
console.log(/Cat|Dog/.test("Dog"));
```

Output

```
true
```

---

## Q5

```javascript
console.log(/(\w+)\s\1/.test("hello hello"));
```

Output

```
true
```

---

## Q6

```javascript
console.log(/Java(?=Script)/.test("JavaScript"));
```

Output

```
true
```

---

## Q7

```javascript
console.log(/Java(?!Python)/.test("JavaScript"));
```

Output

```
true
```

---

## Q8

```javascript
console.log(/^[6-9]\d{9}$/.test("9876543210"));
```

Output

```
true
```

---

## Q9

```javascript
console.log(/^[A-Z]{5}[0-9]{4}[A-Z]$/.test("ABCDE1234F"));
```

Output

```
true
```

---

## Q10

```javascript
console.log(/^Hello$/.test("Hello World"));
```

Output

```
false
```

---

# Coding Problems

## Beginner

1. Validate a 4-digit OTP.
2. Validate an Indian PIN code.
3. Validate an Indian mobile number.
4. Count repeated words.
5. Extract dates from text.

---

## Intermediate

6. Validate PAN format.
7. Validate password strength.
8. Extract all currency values.
9. Extract hashtags from a paragraph.
10. Extract mentions (`@username`) from social posts.

---

## Advanced

11. Validate IPv4 addresses.
12. Parse log entries using named groups.
13. Build a reusable email validator.
14. Detect duplicate consecutive words using backreferences.
15. Parse dates into year, month, and day using named groups.

---

# Cheat Sheet

```javascript
// Quantifiers
*
+
?
{n}
{n,m}
{n,}

// Anchors
^
$

// Alternation
|

// Groups
(...)
(?<name>...)

// Backreference
\1

// Lookarounds
(?=...)
(?!...)
(?<=...)
(?<!...)

// Validation Examples
/^[6-9]\d{9}$/          // Indian mobile
/^[A-Z]{5}[0-9]{4}[A-Z]$/ // PAN
/^\d{12}$/              // Aadhaar format
/^[1-9][0-9]{5}$/       // PIN code
```

---

# Quick Revision

- `*` → 0 or more
- `+` → 1 or more
- `?` → 0 or 1
- `{n}` → exactly `n`
- `^` → start of string
- `$` → end of string
- `|` → OR
- `()` → capturing group
- `(?<name>...)` → named capturing group
- `\1` → backreference
- `(?=...)` → positive lookahead
- `(?!...)` → negative lookahead
- `(?<=...)` → positive lookbehind
- `(?<!...)` → negative lookbehind
- Use `^` and `$` for full-string validation.

---