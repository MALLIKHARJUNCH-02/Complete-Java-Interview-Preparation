# HTML Interview Guide
# Part 5A – Advanced HTML

---

# Table of Contents

1. Global Attributes
2. Browser Rendering Process
3. DOM (Document Object Model)
4. HTML5 APIs
5. Local Storage
6. Session Storage
7. Cookies
8. Drag and Drop API
9. Geolocation API
10. Browser Events
11. HTML Performance
12. HTML Security
13. HTML Validation
14. Best Practices
15. Common Mistakes
16. Interview Questions
17. Quick Revision

---

# 1. Global Attributes

Global attributes can be used on almost every HTML element.

---

## id

Used to uniquely identify an element.

```html
<h1 id="title">HTML Tutorial</h1>
```

Rules

- Must be unique.
- No duplicate IDs.
- Used by CSS and JavaScript.

---

Interview Question

Difference between id and class?

| id | class |
|-----|--------|
| Unique | Multiple elements |
| One per page | Reusable |
| # selector | . selector |

---

## class

Groups similar elements.

```html
<p class="red">
```

Example

```html
<p class="error">Error</p>

<p class="error">Invalid Password</p>
```

---

## style

Inline CSS.

```html
<p style="color:red;">
```

Avoid using inline CSS in large projects.

---

## title

Tooltip.

```html
<p title="HyperText Markup Language">

HTML

</p>
```

Hover displays the tooltip.

---

## hidden

Hides element.

```html
<p hidden>

Hidden Content

</p>
```

---

## tabindex

Controls keyboard navigation.

```html
<input tabindex="1">

<input tabindex="2">
```

Useful for accessibility.

---

## contenteditable

Allows editing.

```html
<p contenteditable="true">

Edit Me

</p>
```

---

## draggable

Makes an element draggable.

```html
<img

draggable="true">
```

---

## spellcheck

Checks spelling.

```html
<textarea

spellcheck="true">

</textarea>
```

---

## translate

```html
<p translate="no">

OpenAI

</p>
```

Prevents translation.

---

## dir

Text direction.

```html
<p dir="rtl">

مرحبا

</p>
```

---

## lang

Language.

```html
<html lang="en">
```

Improves SEO and accessibility.

---

## data-* Attributes

Stores custom data.

```html
<div

data-id="100">

Product

</div>
```

JavaScript

```javascript
element.dataset.id
```

---

Interview Question

Why use data-* attributes?

Answer

To store custom data that JavaScript can easily access without affecting HTML semantics.

---

# 2. Browser Rendering Process

```
HTML

↓

Parser

↓

DOM

↓

CSS

↓

CSSOM

↓

DOM + CSSOM

↓

Render Tree

↓

Layout

↓

Paint

↓

Composite

↓

Screen
```

---

Step 1

Browser downloads HTML.

---

Step 2

HTML Parser creates DOM.

---

Step 3

CSS creates CSSOM.

---

Step 4

DOM + CSSOM

↓

Render Tree

---

Step 5

Layout

Calculates

Height

Width

Position

---

Step 6

Paint

Draws pixels.

---

Step 7

Composite

GPU combines layers.

---

Interview Question

Difference between DOM and Render Tree?

DOM contains all HTML elements.

Render Tree contains only visible elements with styles applied.

---

# 3. DOM

DOM

Document Object Model

HTML becomes a tree.

```
html

|

+--head

|

+--title

|

+--body

|

+--h1

|

+--p

|

+--button
```

JavaScript manipulates the DOM.

Example

```javascript
document.getElementById("title")
```

---

Interview Question

Who creates DOM?

Answer

The browser.

---

# 4. HTML5 APIs

Major APIs

✔ Geolocation

✔ Drag and Drop

✔ Local Storage

✔ Session Storage

✔ Web Workers

✔ Canvas

✔ Audio

✔ Video

✔ History API

---

# 5. Local Storage

Stores data permanently.

```javascript
localStorage.setItem("name","Mallik");
```

Read

```javascript
localStorage.getItem("name");
```

Delete

```javascript
localStorage.removeItem("name");
```

Clear

```javascript
localStorage.clear();
```

---

Characteristics

✔ Around 5–10 MB (browser-dependent)

✔ Doesn't expire automatically

✔ Same-origin only

✔ Stores strings (use JSON for objects)

---

Real Example

Dark Mode

Shopping Cart

Remember User Preferences

---

Interview Question

Does Local Storage expire?

Answer

No.

Data remains until removed by the application or user.

---

# 6. Session Storage

```javascript
sessionStorage.setItem("user","Mallik");
```

Removed when browser tab closes.

---

Difference

| Local | Session |
|---------|----------|
| Permanent | Tab Lifetime |
| Shared across same-origin tabs | Per Tab |
| Large | Large |

---

Interview Question

When should Session Storage be used?

Answer

For temporary data that should disappear when the browser tab is closed.

---

# 7. Cookies

Stores small pieces of data.

Example

```
username=mallik
```

Characteristics

✔ Sent with every HTTP request (for matching domain/path)

✔ Small (about 4 KB per cookie)

✔ Can have expiration

✔ Used for authentication and user preferences

---

Local Storage vs Cookies

| Local Storage | Cookies |
|---------------|----------|
| Not automatically sent to server | Sent with requests |
| Larger Capacity | Smaller Capacity |
| JavaScript Access | JavaScript or Server |
| Faster for client data | Authentication |

---

Interview Question

Why not store JWT in Local Storage?

Answer

Because JavaScript can access Local Storage, making tokens vulnerable to XSS attacks. Many applications instead use secure, HttpOnly cookies for authentication.

---

# 8. Drag and Drop

Make draggable.

```html
<div draggable="true">

Drag Me

</div>
```

Events

```
dragstart

drag

dragenter

dragover

drop

dragend
```

Uses

Task Boards

Kanban

Image Upload

File Manager

---

# 9. Geolocation

Gets user location.

```javascript
navigator.geolocation.getCurrentPosition()
```

Requires user permission.

Returns

Latitude

Longitude

Accuracy

---

Uses

Google Maps

Food Delivery

Ride Booking

Weather

Nearby Stores

---

Interview Question

Can browser access location without permission?

Answer

No.

The user must explicitly grant permission.

---

# 10. Browser Events

Examples

```
click

change

submit

load

focus

blur

scroll

resize

keydown

keyup
```

---

# 11. HTML Performance

Good Practices

✔ Compress Images

✔ Lazy Loading

✔ Use SVG Icons

✔ Minify HTML

✔ Remove Unused Code

✔ Use CDN

✔ Reduce DOM Size

✔ Avoid Deep Nesting

✔ Defer Non-critical JavaScript

✔ Optimize Fonts

---

Interview Question

Why reduce DOM size?

Answer

A smaller DOM improves rendering speed, reduces memory usage, and enhances overall performance.

---

# 12. HTML Security

Common Risks

---

## XSS

Cross Site Scripting.

Example

```html
<script>

alert("Hacked");

</script>
```

Never render untrusted user input directly as HTML.

---

## Clickjacking

Embedding your website inside another site's iframe to trick users.

Mitigation is typically handled with HTTP headers such as `Content-Security-Policy` (`frame-ancestors`) or `X-Frame-Options`.

---

## Mixed Content

HTTPS page loading HTTP resources.

Avoid this.

---

## File Upload Validation

Validate

✔ File Type

✔ Size

✔ Extension

✔ Content (on server)

---

Interview Question

Can HTML alone prevent XSS?

Answer

No.

Security requires proper input validation, output encoding, and server-side protections.

---

# 13. HTML Validation

Use validators.

Popular

W3C Markup Validation Service

Checks

✔ Invalid Tags

✔ Missing Closing Tags

✔ Incorrect Nesting

✔ Deprecated Elements

✔ Attribute Errors

---

Interview Question

Why validate HTML?

Answer

To improve compatibility, accessibility, maintainability, and reduce markup errors.

---

# Best Practices

✔ Use semantic HTML.

✔ Keep HTML clean.

✔ Use lowercase tags.

✔ Close tags correctly.

✔ Validate HTML.

✔ Optimize images.

✔ Use lazy loading.

✔ Use meaningful IDs.

✔ Prefer external CSS.

✔ Keep DOM shallow.

✔ Always use alt attributes.

---

# Common Mistakes

❌ Duplicate IDs

❌ Inline CSS everywhere

❌ Missing alt

❌ Deep nested divs

❌ Missing labels

❌ Huge DOM

❌ Invalid HTML

❌ Deprecated tags

❌ No viewport meta tag

---

# Frequently Asked Interview Questions

1. What are Global Attributes?

2. Difference between id and class?

3. What is DOM?

4. Who creates DOM?

5. Explain browser rendering.

6. Difference between DOM and Render Tree?

7. What is Local Storage?

8. Difference between Local Storage and Session Storage?

9. Difference between Cookies and Local Storage?

10. What is Geolocation API?

11. What is Drag and Drop API?

12. What is XSS?

13. Why should duplicate IDs be avoided?

14. What are data-* attributes?

15. Why should HTML be validated?

---

# Quick Revision

- Global attributes work on almost all HTML elements.
- `id` is unique; `class` is reusable.
- The browser parses HTML into the DOM.
- The Render Tree contains only visible, styled elements.
- Local Storage persists until cleared.
- Session Storage lasts for a single tab session.
- Cookies are automatically sent with HTTP requests.
- Geolocation requires user permission.
- Drag and Drop uses HTML5 events.
- Optimize HTML by reducing DOM size and using lazy loading.
- HTML alone cannot provide complete security; server-side protections are essential.