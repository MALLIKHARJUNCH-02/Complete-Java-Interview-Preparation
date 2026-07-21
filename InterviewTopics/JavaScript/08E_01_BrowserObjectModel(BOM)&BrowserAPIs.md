# JavaScript Interview Master Handbook
# Part 8.5A – Browser Object Model (BOM) Fundamentals

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is BOM?
2. DOM vs BOM
3. window Object
4. document Object
5. navigator Object
6. screen Object
7. location Object
8. history Object
9. URL API
10. URLSearchParams
11. Browser Dialog APIs
12. Best Practices
13. Common Mistakes
14. Interview Questions
15. Output Questions
16. Coding Problems
17. Cheat Sheet

---

# 1. What is BOM?

## Definition

BOM stands for

```
Browser Object Model
```

It provides JavaScript APIs to interact with the browser itself.

Unlike the DOM, which represents the HTML document, the BOM represents browser features.

---

Examples

✔ Window

✔ Location

✔ History

✔ Navigator

✔ Screen

✔ Storage

✔ Timers

---

Visualization

```
Browser

↓

Window

├── document

├── navigator

├── location

├── history

├── screen

├── localStorage

└── sessionStorage
```

---

# 2. DOM vs BOM

| DOM | BOM |
|------|------|
| Represents HTML document | Represents browser |
| Manipulates page elements | Controls browser features |
| Root is document | Root is window |

---

# 3. window Object

The **window** object is the global object in browsers.

Everything becomes a property of window.

Example

```javascript
var x = 10;

console.log(window.x);
```

Output

```
10
```

---

Useful Properties

```javascript
window.innerWidth

window.innerHeight

window.scrollX

window.scrollY
```

---

Useful Methods

```javascript
alert()

confirm()

prompt()

setTimeout()

setInterval()

open()

close()

scrollTo()
```

---

# 4. document Object

Represents the HTML document.

Example

```javascript
document.title = "JavaScript";
```

---

```javascript
document.body
```

Returns

```
<body>
```

---

```javascript
document.URL
```

Returns current page URL.

---

# 5. navigator Object

Provides browser information.

Example

```javascript
console.log(navigator.userAgent);
```

---

Useful Properties

```javascript
navigator.language

navigator.languages

navigator.onLine

navigator.cookieEnabled
```

---

Example

```javascript
console.log(navigator.onLine);
```

Output

```
true
```

(if the browser reports it is online)

---

Interview Tip

Avoid relying solely on `userAgent` for browser detection because it can change or be spoofed. Prefer feature detection whenever possible.

---

# 6. screen Object

Provides screen information.

```javascript
console.log(screen.width);

console.log(screen.height);
```

---

Other Properties

```javascript
screen.availWidth

screen.availHeight

screen.colorDepth
```

---

Difference

```
window.innerWidth

↓

Browser viewport

screen.width

↓

Entire screen
```

---

# 7. location Object

Represents the current URL.

Suppose

```
https://example.com/users?id=10
```

---

Properties

```javascript
location.href
```

Output

```
https://example.com/users?id=10
```

---

```javascript
location.hostname
```

Output

```
example.com
```

---

```javascript
location.pathname
```

Output

```
/users
```

---

```javascript
location.protocol
```

Output

```
https:
```

---

```javascript
location.search
```

Output

```
?id=10
```

---

Methods

```javascript
location.reload();

location.assign("page2.html");

location.replace("page2.html");
```

---

Difference

| Method | Back Button |
|---------|-------------|
| assign() | Yes |
| replace() | No |

---

# 8. history Object

Controls browser history.

---

Go Back

```javascript
history.back();
```

---

Go Forward

```javascript
history.forward();
```

---

Move

```javascript
history.go(-2);

history.go(1);
```

---

Length

```javascript
console.log(history.length);
```

Returns the number of entries in the session history.

---

# 9. URL API

Instead of manually parsing URLs,

use the URL class.

```javascript
const url = new URL(

"https://example.com/users?id=10"

);
```

---

Properties

```javascript
url.hostname

url.pathname

url.protocol

url.search

url.origin
```

---

Output

```
example.com

/users

https:

?id=10

https://example.com
```

---

# 10. URLSearchParams

Used to read query parameters.

```javascript
const params =

new URLSearchParams(

"?name=Mallik&age=24"

);
```

---

Read

```javascript
params.get("name");
```

Output

```
Mallik
```

---

Exists

```javascript
params.has("age");
```

Output

```
true
```

---

Append

```javascript
params.append("city","Hyderabad");
```

---

Delete

```javascript
params.delete("age");
```

---

Loop

```javascript
for(const [key,value] of params){

    console.log(key,value);

}
```

---

# 11. Browser Dialog APIs

Alert

```javascript
alert("Saved");
```

---

Confirm

```javascript
const result = confirm("Delete?");
```

Returns

```
true

or

false
```

---

Prompt

```javascript
const name = prompt("Enter Name");
```

Returns

```
String

or

null
```

---

Interview Tip

These dialogs are synchronous and block user interaction while open. Modern applications often use custom modal components instead.

---

# Best Practices

✔ Use the `URL` API instead of manually splitting URLs.

✔ Use `URLSearchParams` for query strings.

✔ Prefer feature detection over browser detection.

✔ Use `replace()` only when you intentionally don't want users to navigate back.

✔ Avoid blocking dialogs in production UI.

---

# Common Mistakes

❌ Confusing `window.innerWidth` with `screen.width`.

❌ Using `location.replace()` when browser back navigation should still work.

❌ Parsing query strings manually.

❌ Assuming `navigator.onLine` guarantees Internet connectivity.

---

# Frequently Asked Interview Questions

1. What is BOM?

2. Difference between BOM and DOM?

3. What is the global object in browsers?

Answer

```
window
```

4. What is the location object?

5. Difference between

```
location.assign()

location.replace()
```

6. What is the history object?

7. Difference between

```
history.back()

history.go(-1)
```

8. What is navigator?

9. Difference between

```
window.innerWidth

screen.width
```

10. What is URLSearchParams?

11. Why use the URL API?

12. What does `navigator.onLine` return?

13. What is `history.length`?

14. What is `document.URL`?

15. Why are alert(), prompt(), and confirm() rarely used in modern applications?

---

# Output Questions

## Q1

```javascript
console.log(window === globalThis);
```

Output (Browser)

```
true
```

---

## Q2

```javascript
console.log(location.protocol);
```

Suppose page

```
https://example.com
```

Output

```
https:
```

---

## Q3

```javascript
const params =

new URLSearchParams(

"?name=Mallik"

);

console.log(params.get("name"));
```

Output

```
Mallik
```

---

## Q4

```javascript
console.log(screen.width > 0);
```

Output

```
true
```

(on a normal browser)

---

## Q5

```javascript
console.log(history.length >= 1);
```

Output

```
true
```

---

## Q6

```javascript
const url =

new URL(

"https://example.com/users?id=5"

);

console.log(url.pathname);
```

Output

```
/users
```

---

## Q7

```javascript
const url =

new URL(

"https://example.com/users?id=5"

);

console.log(url.search);
```

Output

```
?id=5
```

---

## Q8

```javascript
console.log(document.title);
```

Output

Current page title.

---

# Coding Problems

## Beginner

1. Display browser width.
2. Show current URL.
3. Detect browser language.
4. Read query parameters.
5. Reload the page.

---

## Intermediate

6. Build a query string parser using `URLSearchParams`.
7. Create a search page that updates the URL.
8. Navigate using the History API.
9. Display screen information.
10. Detect online/offline status.

---

## Advanced

11. Build a mini SPA using the History API.
12. Synchronize filters with URL parameters.
13. Create a custom router.
14. Build browser navigation controls.
15. Implement deep linking with URLSearchParams.

---

# Cheat Sheet

```javascript
// Global
window

// Document
document

// Navigator
navigator.language
navigator.onLine

// Screen
screen.width
screen.height

// Location
location.href
location.pathname
location.search
location.reload()

// History
history.back()
history.forward()
history.go(-1)

// URL
const url = new URL(location.href);

// Query Parameters
const params = new URLSearchParams(location.search);
params.get("id");
```

---

# Quick Revision

✔ BOM represents browser functionality.

✔ `window` is the global object in browsers.

✔ `document` represents the HTML page.

✔ `navigator` provides browser information.

✔ `screen` provides display information.

✔ `location` represents the current URL.

✔ `history` manages browser navigation history.

✔ `URL` safely parses URLs.

✔ `URLSearchParams` manages query parameters.

✔ `assign()` keeps browser history.

✔ `replace()` replaces the current history entry.

✔ `alert()`, `confirm()`, and `prompt()` are blocking dialog APIs.

---