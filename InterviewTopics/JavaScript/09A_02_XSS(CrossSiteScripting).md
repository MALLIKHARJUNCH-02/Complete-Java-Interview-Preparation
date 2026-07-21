# JavaScript Interview Master Handbook
# Part 9.1B – XSS (Cross-Site Scripting) Complete Handbook

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is XSS?
2. Why XSS is Dangerous
3. How XSS Works
4. Types of XSS
5. Stored XSS
6. Reflected XSS
7. DOM-Based XSS
8. innerHTML vs textContent
9. Output Encoding
10. HTML Sanitization
11. Trusted Types
12. CSP Basics
13. Prevention Techniques
14. Best Practices
15. Common Mistakes
16. Interview Questions
17. Scenario Questions
18. Secure Coding Exercises
19. Cheat Sheet

---

# 1. What is XSS?

## Definition

XSS (Cross-Site Scripting) occurs when an application allows untrusted input to be interpreted as executable HTML or JavaScript.

Instead of displaying user input as plain text,

the browser may interpret it as active content.

---

Visualization

```
User Input

↓

Application

↓

Browser

↓

Unsafe Rendering?

↓

XSS
```

---

# 2. Why XSS is Dangerous

If an attacker successfully injects script into a page, they may be able to:

✔ Read page content

✔ Perform actions as the logged-in user

✔ Modify the page

✔ Trick users into revealing information

Depending on application design and browser protections, the impact varies.

---

# 3. How XSS Works

Unsafe Flow

```
User Input

↓

Stored or Reflected

↓

Rendered as HTML

↓

Browser Executes
```

Safe Flow

```
User Input

↓

Escape / Sanitize

↓

Render as Text

↓

No Script Execution
```

---

# 4. Types of XSS

There are three major categories.

```
Stored XSS

Reflected XSS

DOM-Based XSS
```

---

# 5. Stored XSS

## Definition

Malicious input is stored by the application (for example, in a database) and later rendered to other users.

Example Scenario

```
Comment Submitted

↓

Database

↓

Another User Opens Page

↓

Unsafe Rendering

↓

XSS
```

Example (Unsafe)

```javascript
comments.innerHTML = userComment;
```

If `userComment` contains HTML with executable content,

the browser may interpret it.

---

Safe Version

```javascript
comments.textContent = userComment;
```

Everything is treated as plain text.

---

# 6. Reflected XSS

## Definition

User input is immediately reflected in the response without proper escaping.

Example Flow

```
Search

↓

Server

↓

Response Includes Search Term

↓

Unsafe Rendering
```

Safe Practice

Never insert raw user input into HTML output.

Escape or sanitize it first.

---

# 7. DOM-Based XSS

## Definition

The vulnerability exists entirely in client-side JavaScript.

Unsafe Example

```javascript
const value = location.hash;

result.innerHTML = value;
```

If the hash contains HTML,

it may be interpreted.

---

Safe Version

```javascript
result.textContent = value;
```

---

# 8. innerHTML vs textContent

## innerHTML

```javascript
box.innerHTML = "<b>Hello</b>";
```

Result

```
Hello
```

Displayed in bold because HTML is parsed.

---

## textContent

```javascript
box.textContent = "<b>Hello</b>";
```

Result

```
<b>Hello</b>
```

Displayed literally.

---

Comparison

| Property | Parses HTML? | Safer for User Input? |
|-----------|--------------|-----------------------|
| innerHTML | Yes | ❌ No |
| textContent | No | ✅ Yes |

---

# 9. Output Encoding

Instead of rendering raw HTML,

encode characters.

Example

```
<

becomes

&lt;
```

```
>

becomes

&gt;
```

The browser displays text instead of interpreting it as HTML.

---

# 10. HTML Sanitization

Sometimes HTML input is intentionally allowed (for example, a rich text editor).

Instead of accepting everything,

remove unsafe content while preserving allowed formatting.

Example

Allowed

```
<b>

<i>

<p>
```

Blocked

```
<script>

onclick

onerror
```

Use a well-maintained HTML sanitizer rather than writing your own parser.

---

# 11. Trusted Types

Trusted Types is a browser security feature that helps reduce DOM XSS by restricting unsafe HTML injection.

Instead of

```
String

↓

innerHTML
```

Trusted Types requires trusted objects created by approved policies.

Supported mainly in Chromium-based browsers and often used together with CSP.

---

# 12. Content Security Policy (CSP) Basics

CSP tells the browser which resources are allowed.

Example

```
Content-Security-Policy:

default-src 'self';
```

Benefits

✔ Restricts unexpected script loading

✔ Reduces XSS impact

✔ Helps enforce safer coding practices

CSP is an additional defense, not a replacement for proper input handling.

---

# 13. Prevention Techniques

✔ Prefer `textContent` for user input.

✔ Escape output for the context in which it is used.

✔ Sanitize HTML when rich content is required.

✔ Validate input on the server.

✔ Use Content Security Policy.

✔ Keep frameworks and dependencies updated.

✔ Avoid inline event handlers.

✔ Prefer DOM APIs over string-based HTML construction.

---

# Secure Example

Instead of

```javascript
box.innerHTML = userInput;
```

Use

```javascript
box.textContent = userInput;
```

---

# 14. Best Practices

✔ Treat all external input as untrusted.

✔ Validate on the server.

✔ Encode output.

✔ Sanitize rich HTML.

✔ Use CSP.

✔ Use Trusted Types where supported.

✔ Review third-party libraries.

---

# 15. Common Mistakes

❌ Assuming client-side validation is enough.

❌ Rendering user input with `innerHTML`.

❌ Building HTML strings from untrusted data.

❌ Ignoring Content Security Policy.

❌ Creating custom sanitizers instead of using established solutions.

---

# 16. Frequently Asked Interview Questions

1. What is XSS?

Answer

A vulnerability where untrusted input is interpreted as executable content.

---

2. Name the three types of XSS.

Answer

```
Stored

Reflected

DOM-Based
```

---

3. Which type is stored in a database?

Answer

Stored XSS.

---

4. Which type occurs entirely in client-side JavaScript?

Answer

DOM-Based XSS.

---

5. Difference between Stored and Reflected XSS?

Stored persists.

Reflected is returned immediately in a response.

---

6. Why is `innerHTML` risky?

Because it parses HTML.

---

7. Why is `textContent` safer?

It treats input as plain text.

---

8. What is output encoding?

Converting special characters into safe representations before rendering.

---

9. What is HTML sanitization?

Removing unsafe HTML while preserving allowed markup.

---

10. What is CSP?

A browser policy that restricts which resources may load.

---

11. What are Trusted Types?

A browser feature that helps prevent unsafe DOM HTML injection.

---

12. Does CSP completely eliminate XSS?

No.

It is one layer of defense.

---

13. Should input validation replace output encoding?

No.

Both serve different purposes.

---

14. Should you trust client-side validation?

No.

Server-side validation is still required.

---

15. Which property is generally safer for displaying user input?

Answer

```
textContent
```

---

# 17. Scenario Questions

### Scenario 1

You display usernames submitted by users.

Should you use

```javascript
innerHTML
```

or

```javascript
textContent
```

Answer

```
textContent
```

---

### Scenario 2

Your application includes a rich text editor.

Can you always use `textContent`?

Answer

Not always.

If formatted HTML is required, sanitize the HTML before rendering it.

---

### Scenario 3

A security audit recommends enabling CSP.

Should you stop escaping user input?

Answer

No.

CSP complements proper escaping and sanitization.

---

### Scenario 4

Your application displays Markdown converted to HTML.

What should you verify?

Answer

Ensure the generated HTML is sanitized before rendering.

---

### Scenario 5

A user profile page displays biography text.

What's the safest default?

Answer

Render plain text unless formatted HTML is intentionally supported.

---

# 18. Secure Coding Exercises

## Beginner

1. Replace `innerHTML` with `textContent` where appropriate.
2. Display user comments safely.
3. Escape special characters before rendering.
4. Identify unsafe rendering code.
5. Explain why `textContent` is safer.

---

## Intermediate

6. Integrate an HTML sanitizer for rich text.
7. Configure a basic Content Security Policy.
8. Audit a page for unsafe DOM updates.
9. Replace inline event handlers with `addEventListener()`.
10. Review third-party widgets for unsafe HTML rendering.

---

## Advanced

11. Design a secure comment system.
12. Create a CSP suitable for a React application.
13. Evaluate Trusted Types adoption.
14. Perform a security review of DOM rendering logic.
15. Build a reusable safe-rendering utility.

---

# Cheat Sheet

```text
XSS Types

Stored

Reflected

DOM-Based

---------------------------------

Safer Rendering

textContent

---------------------------------

Rich HTML

↓

Sanitize

↓

Render

---------------------------------

Defense Layers

Input Validation

+

Output Encoding

+

Sanitization

+

CSP

+

Trusted Types
```

---

# Quick Revision

✔ XSS happens when untrusted input is interpreted as executable content.

✔ The three main types are Stored, Reflected, and DOM-Based XSS.

✔ `innerHTML` parses HTML and should not be used with untrusted input.

✔ `textContent` displays input as plain text.

✔ Output encoding prevents browsers from interpreting special characters as HTML.

✔ Sanitization is necessary when user-supplied HTML must be supported.

✔ CSP reduces the impact of many XSS attacks.

✔ Trusted Types help prevent unsafe DOM HTML injection.

✔ Always validate input on the server.

✔ Security relies on multiple layers—not a single defense.

---