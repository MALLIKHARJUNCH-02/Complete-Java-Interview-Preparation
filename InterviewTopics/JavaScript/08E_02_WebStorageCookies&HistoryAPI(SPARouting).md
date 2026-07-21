# JavaScript Interview Master Handbook
# Part 8.5B – Web Storage, Cookies & History API (SPA Routing)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Web Storage API
2. localStorage
3. sessionStorage
4. localStorage vs sessionStorage
5. Storage Events
6. Cookies
7. Cookie Attributes
8. Cookies vs localStorage
9. Authentication Token Storage
10. History API
11. pushState()
12. replaceState()
13. popstate Event
14. Building SPA Routing
15. Best Practices
16. Common Mistakes
17. Interview Questions
18. Output Questions
19. Coding Problems
20. Cheat Sheet

---

# 1. Web Storage API

The Web Storage API allows browsers to store data as key-value pairs.

```
Browser

↓

Storage

↓

Key

↓

Value
```

Types

✔ localStorage

✔ sessionStorage

---

# 2. localStorage

## Definition

Stores data with **no automatic expiration**.

Data remains even after:

✔ Browser restart

✔ Computer restart

until explicitly removed.

---

Store

```javascript
localStorage.setItem("name", "Mallik");
```

---

Read

```javascript
console.log(localStorage.getItem("name"));
```

Output

```
Mallik
```

---

Update

```javascript
localStorage.setItem("name", "John");
```

---

Delete One

```javascript
localStorage.removeItem("name");
```

---

Delete All

```javascript
localStorage.clear();
```

---

Exists?

```javascript
localStorage.getItem("name");
```

Returns

```
null
```

if not found.

---

Store Objects

Wrong

```javascript
localStorage.setItem("user", {

    name:"Mallik"

});
```

Stored as

```
[object Object]
```

---

Correct

```javascript
const user = {

    name:"Mallik",

    age:24

};

localStorage.setItem(

"user",

JSON.stringify(user)

);
```

Read

```javascript
const user = JSON.parse(

localStorage.getItem("user")

);
```

---

# 3. sessionStorage

Almost identical.

Difference

↓

Data survives only for the lifetime of the current browser tab/window.

Closing that tab/window clears it.

---

Example

```javascript
sessionStorage.setItem(

"theme",

"dark"

);
```

Read

```javascript
sessionStorage.getItem("theme");
```

---

# 4. localStorage vs sessionStorage

| localStorage | sessionStorage |
|---------------|----------------|
| Persistent | Per tab/session |
| Shared across same-origin tabs | Not shared across tabs |
| Survives browser restart | Cleared when tab/window closes |
| ~5–10 MB (browser dependent) | ~5–10 MB (browser dependent) |

---

# 5. Storage Event

Fires in **other same-origin documents** when localStorage changes.

```javascript
window.addEventListener(

"storage",

(e)=>{

    console.log(e.key);

    console.log(e.oldValue);

    console.log(e.newValue);

});
```

Properties

```
key

oldValue

newValue

url

storageArea
```

Interview Note

A page generally does **not** receive a `storage` event for changes it made itself.

---

# 6. Cookies

Cookies are small pieces of data stored by the browser.

Unlike localStorage,

cookies are automatically sent with matching HTTP requests.

---

Create

```javascript
document.cookie =

"name=Mallik";
```

---

Read

```javascript
console.log(document.cookie);
```

Output

```
name=Mallik
```

(May include multiple cookies.)

---

Delete

```javascript
document.cookie =

"name=; Max-Age=0";
```

---

# 7. Cookie Attributes

## Expires

```text
Expires=Wed, 01 Jan 2030 00:00:00 GMT
```

Sets expiration date.

---

## Max-Age

```text
Max-Age=3600
```

Expires after

```
3600 seconds
```

---

## Secure

```
Secure
```

Sent only over HTTPS.

---

## HttpOnly

```
HttpOnly
```

Cannot be accessed using JavaScript.

Helps reduce XSS risk.

Must be set by the server.

---

## SameSite

Options

```
Strict

Lax

None
```

Helps protect against CSRF attacks.

If `SameSite=None` is used, `Secure` is also required by modern browsers.

---

# 8. Cookies vs localStorage

| Cookies | localStorage |
|----------|--------------|
| Sent automatically with HTTP requests | Never sent automatically |
| Small (~4 KB each) | Much larger (browser dependent) |
| Can be HttpOnly | Accessible to JavaScript |
| Good for server-managed sessions | Good for client-side preferences |

---

# 9. Authentication Token Storage

Common Interview Question

Where should JWT be stored?

---

### Option 1

```
localStorage
```

Advantages

✔ Easy

✔ Persistent

Disadvantages

❌ Accessible via JavaScript.

If an XSS vulnerability exists, an attacker may be able to steal the token.

---

### Option 2

```
HttpOnly Cookie
```

Advantages

✔ Not accessible through JavaScript.

✔ Better protection against XSS token theft.

Disadvantages

Requires proper CSRF protection (for example, `SameSite`, CSRF tokens, or other mitigations depending on the application).

---

Interview Answer

**Sensitive authentication tokens are commonly stored in secure, HttpOnly cookies because JavaScript cannot read them.**

For non-sensitive client preferences such as:

- theme
- language
- sidebar state

`localStorage` is a common choice.

---

# 10. History API

Allows SPAs to change the URL

without reloading the page.

Methods

```
pushState()

replaceState()

back()

forward()

go()
```

---

# 11. pushState()

```javascript
history.pushState(

{ page:1 },

"",

"/dashboard"

);
```

Effects

✔ URL changes

✔ History entry added

✔ No page reload

---

Flow

```
Current

↓

pushState()

↓

New URL

↓

Back Button Works
```

---

# 12. replaceState()

```javascript
history.replaceState(

{ page:2 },

"",

"/profile"

);
```

Effects

✔ URL changes

✔ Current history entry replaced

✔ No page reload

---

Difference

| pushState | replaceState |
|------------|--------------|
| Adds history entry | Replaces current entry |
| Back button returns | Previous URL replaced |

---

# 13. popstate Event

Triggered when the active history entry changes (for example, browser Back/Forward navigation).

```javascript
window.addEventListener(

"popstate",

(e)=>{

    console.log(e.state);

});
```

---

# 14. Building SPA Routing

Traditional Website

```
Click

↓

Server

↓

New HTML

↓

Reload
```

SPA

```
Click

↓

pushState()

↓

URL Changes

↓

Render Component

↓

No Reload
```

Simplified Router

```javascript
function navigate(path){

    history.pushState({}, "", path);

    render(path);

}

window.addEventListener(

"popstate",

()=>{

    render(location.pathname);

});
```

---

# Best Practices

✔ Store objects using JSON.

✔ Remove unused storage entries.

✔ Prefer HttpOnly cookies for sensitive authentication.

✔ Use `pushState()` for navigation.

✔ Use `replaceState()` for redirects.

✔ Validate storage data before using it.

---

# Common Mistakes

❌ Storing objects without `JSON.stringify()`.

❌ Storing secrets in localStorage without understanding XSS risks.

❌ Using `replaceState()` when browser Back should work.

❌ Assuming cookies are encrypted.

❌ Forgetting cookies have size limits.

---

# Frequently Asked Interview Questions

1. What is localStorage?

2. Difference between localStorage and sessionStorage?

3. Difference between cookies and localStorage?

4. What is the Storage API?

5. How do you store objects?

6. What is JSON.stringify()?

7. What is JSON.parse()?

8. Which storage survives browser restart?

9. Which storage is per tab?

10. What is the maximum cookie size?

Answer

Approximately **4 KB per cookie**.

11. What is HttpOnly?

12. Why use SameSite?

13. Difference between pushState() and replaceState()?

14. What is popstate?

15. Where should JWT be stored?

---

# Output Questions

## Q1

```javascript
localStorage.setItem(

"name",

"Mallik"

);

console.log(

localStorage.getItem("name")

);
```

Output

```
Mallik
```

---

## Q2

```javascript
localStorage.removeItem("name");

console.log(

localStorage.getItem("name")

);
```

Output

```
null
```

---

## Q3

```javascript
const obj = {

    x:10

};

localStorage.setItem(

"obj",

JSON.stringify(obj)

);

const value = JSON.parse(

localStorage.getItem("obj")

);

console.log(value.x);
```

Output

```
10
```

---

## Q4

```javascript
history.pushState(

{ page:1 },

"",

"/home"

);
```

Result

```
URL changes

No page reload
```

---

## Q5

```javascript
history.replaceState(

{ page:2 },

"",

"/profile"

);
```

Result

```
Current history entry replaced

No page reload
```

---

# Coding Problems

## Beginner

1. Save theme using localStorage.
2. Remember username.
3. Read query parameters.
4. Store an object.
5. Clear all storage.

---

## Intermediate

6. Build dark mode persistence.
7. Build a recent searches list.
8. Synchronize tabs using the storage event.
9. Build a login simulation using storage.
10. Create browser history navigation.

---

## Advanced

11. Build a mini SPA router using History API.
12. Synchronize URL with filters.
13. Build authentication flow using cookies.
14. Implement browser Back/Forward routing.
15. Create a reusable storage utility.

---

# Cheat Sheet

```javascript
// localStorage
localStorage.setItem(key, value);
localStorage.getItem(key);
localStorage.removeItem(key);
localStorage.clear();

// sessionStorage
sessionStorage.setItem(key, value);

// Store Object
localStorage.setItem(
  "user",
  JSON.stringify(user)
);

const user =
JSON.parse(
  localStorage.getItem("user")
);

// History
history.pushState({}, "", "/home");
history.replaceState({}, "", "/login");

// Listen
window.addEventListener(
  "popstate",
  handler
);

// Cookie
document.cookie = "theme=dark";
```

---

# Quick Revision

✔ `localStorage` persists until cleared.

✔ `sessionStorage` is scoped to a browser tab/window.

✔ Cookies are automatically sent with matching HTTP requests.

✔ `HttpOnly` cookies cannot be read by JavaScript.

✔ `Secure` cookies are sent only over HTTPS.

✔ `SameSite` helps protect against CSRF.

✔ `JSON.stringify()` stores objects.

✔ `JSON.parse()` restores objects.

✔ `pushState()` adds a history entry.

✔ `replaceState()` replaces the current history entry.

✔ `popstate` fires during browser history navigation.

✔ Modern SPAs use the History API for client-side routing.

---