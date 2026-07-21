# JavaScript Interview Master Handbook
# Part 8.4A – DOM Fundamentals (Document Object Model)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is the DOM?
2. Why is DOM Needed?
3. How the Browser Builds the DOM
4. DOM Tree
5. Node Types
6. DOM Traversal
7. Selecting Elements
8. Reading & Modifying Content
9. Creating Elements
10. Removing Elements
11. DOM vs HTML
12. DOM vs Virtual DOM
13. Best Practices
14. Common Mistakes
15. Interview Questions
16. Output Questions
17. Coding Problems
18. Cheat Sheet

---

# 1. What is the DOM?

## Definition

DOM stands for

```
Document Object Model
```

The browser converts HTML into a tree of JavaScript objects.

HTML

```html
<body>
    <h1>Hello</h1>
</body>
```

becomes

```
Document

↓

html

↓

body

↓

h1

↓

Text
```

JavaScript interacts with these objects.

---

# 2. Why is DOM Needed?

Without DOM

```
HTML

↓

Static Page
```

With DOM

```
JavaScript

↓

DOM

↓

Update Page

↓

No Reload Needed
```

Example

```javascript
document.body.style.background = "black";
```

The page changes immediately.

---

# 3. How the Browser Builds the DOM

Browser Pipeline

```
HTML

↓

Parser

↓

DOM Tree

↓

CSS

↓

CSSOM

↓

Render Tree

↓

Layout

↓

Paint

↓

Screen
```

Important

DOM

≠

Render Tree

The Render Tree excludes elements that are not rendered (for example, elements with `display: none`).

---

# 4. DOM Tree

Example

```html
<html>

<body>

<div>

<h1>Hello</h1>

<p>World</p>

</div>

</body>

</html>
```

Tree

```
Document

└── html

    └── body

        └── div

            ├── h1

            │   └── "Hello"

            └── p

                └── "World"
```

Every element becomes a node.

---

# 5. Node Types

Everything inside the DOM is a Node.

Common Types

| Node | Description |
|------|-------------|
| Document | Entire document |
| Element | `<div>` `<p>` etc. |
| Text | Text inside elements |
| Comment | HTML comments |
| DocumentFragment | Lightweight container |

---

Example

```html
<div>Hello</div>
```

Nodes

```
Element Node

↓

Text Node
```

---

# 6. DOM Traversal

Suppose

```html
<div id="box">

<p>Hello</p>

<span>World</span>

</div>
```

---

Parent

```javascript
box.parentElement
```

Returns

```
body
```

---

Children

```javascript
box.children
```

Returns

```
HTMLCollection
```

---

First Child Element

```javascript
box.firstElementChild
```

Returns

```
<p>
```

---

Last Child Element

```javascript
box.lastElementChild
```

Returns

```
<span>
```

---

Next Sibling Element

```javascript
paragraph.nextElementSibling
```

Returns

```
<span>
```

---

Previous Sibling Element

```javascript
span.previousElementSibling
```

Returns

```
<p>
```

---

Important

Use

```
children
```

for element nodes only.

Use

```
childNodes
```

to include text nodes, comments, etc.

---

# 7. Selecting Elements

## getElementById()

```javascript
const box = document.getElementById("box");
```

Returns

One element or `null`.

---

## getElementsByClassName()

```javascript
document.getElementsByClassName("item");
```

Returns

```
HTMLCollection
```

Live collection.

---

## getElementsByTagName()

```javascript
document.getElementsByTagName("div");
```

Returns

```
HTMLCollection
```

---

## querySelector()

```javascript
document.querySelector(".item");
```

Returns

First matching element.

---

## querySelectorAll()

```javascript
document.querySelectorAll(".item");
```

Returns

```
NodeList
```

Static collection.

---

Comparison

| Method | Returns |
|---------|----------|
| getElementById | Element |
| getElementsByClassName | Live HTMLCollection |
| getElementsByTagName | Live HTMLCollection |
| querySelector | First Element |
| querySelectorAll | Static NodeList |

---

# 8. Reading & Modifying Content

## innerHTML

```javascript
box.innerHTML = "<b>Hello</b>";
```

Parses HTML.

---

## textContent

```javascript
box.textContent = "<b>Hello</b>";
```

Output

```
<b>Hello</b>
```

Displayed as plain text.

---

## innerText

```javascript
box.innerText = "Hello";
```

Works with rendered text and is affected by CSS visibility/layout.

---

Comparison

| Property | HTML Parsed? | Includes Hidden Text?* |
|----------|--------------|-------------------------|
| innerHTML | Yes | N/A |
| textContent | No | Yes |
| innerText | No | Generally only rendered text |

\* `textContent` includes text regardless of rendering. `innerText` reflects rendered text.

---

# 9. Creating Elements

```javascript
const p = document.createElement("p");

p.textContent = "Hello";

document.body.appendChild(p);
```

Flow

```
Create

↓

Modify

↓

Append
```

---

Append Multiple

```javascript
parent.append(

child1,

child2

);
```

---

Insert Before

```javascript
parent.insertBefore(

newNode,

existingNode

);
```

---

# 10. Removing Elements

Modern

```javascript
element.remove();
```

---

Older

```javascript
parent.removeChild(child);
```

---

Replace

```javascript
old.replaceWith(newNode);
```

---

# 11. DOM vs HTML

HTML

```
Static File
```

DOM

```
Live Object
```

Example

HTML

```html
<h1>Hello</h1>
```

JavaScript

```javascript
document.querySelector("h1").textContent = "Hi";
```

DOM changes immediately.

The original HTML file on disk does not change.

---

# 12. DOM vs Virtual DOM

DOM

```
Browser

↓

Real Elements
```

Virtual DOM (React)

```
Virtual Tree

↓

Diff

↓

Minimal DOM Updates
```

React does **not** update the DOM on every state change directly. It computes the necessary updates and applies them efficiently.

---

# Best Practices

✔ Cache frequently used DOM elements.

✔ Prefer `querySelector()` / `querySelectorAll()` for CSS selector flexibility.

✔ Create elements instead of repeatedly using `innerHTML`.

✔ Batch DOM updates when possible.

✔ Minimize layout-triggering operations in loops.

---

# Common Mistakes

❌ Using `innerHTML` with untrusted user input (XSS risk).

❌ Forgetting `querySelector()` returns only the first match.

❌ Confusing `HTMLCollection` with `NodeList`.

❌ Assuming `childNodes` contains only elements.

---

# Frequently Asked Interview Questions

1. What is the DOM?

2. How does the browser create the DOM?

3. Difference between HTML and DOM?

4. What is the DOM Tree?

5. Difference between Element Node and Text Node?

6. Difference between `children` and `childNodes`?

7. Difference between `querySelector()` and `querySelectorAll()`?

8. Difference between `getElementById()` and `querySelector()`?

9. Difference between `innerHTML`, `textContent`, and `innerText`?

10. Difference between `HTMLCollection` and `NodeList`?

11. How do you create a new element?

12. How do you remove an element?

13. What is `appendChild()`?

14. What is the Virtual DOM?

15. Why is React's Virtual DOM faster for many update patterns?

---

# Output Questions

## Q1

```javascript
document.getElementById("box");
```

Returns

```
Element

or

null
```

---

## Q2

```javascript
document.querySelectorAll("p").length;
```

If there are three `<p>` elements

Output

```
3
```

---

## Q3

```javascript
const div = document.createElement("div");

console.log(div.tagName);
```

Output

```
DIV
```

---

## Q4

```javascript
const p = document.createElement("p");

p.textContent = "Hello";

document.body.appendChild(p);
```

Result

A new paragraph is added to the page.

---

## Q5

```javascript
box.innerHTML = "<b>JavaScript</b>";
```

Result

The word appears in bold because HTML is parsed.

---

## Q6

```javascript
box.textContent = "<b>JavaScript</b>";
```

Output shown on page

```
<b>JavaScript</b>
```

Plain text.

---

## Q7

```javascript
element.remove();
```

Result

The element is removed from the DOM.

---

## Q8

```javascript
document.querySelector(".item");
```

Returns

The first matching element.

---

## Q9

```javascript
parent.children.length;
```

Returns

Number of child **elements**.

---

## Q10

```javascript
parent.childNodes.length;
```

Returns

Number of child **nodes**, including text nodes and comments.

---

# Coding Problems

## Beginner

1. Select an element by ID.
2. Change paragraph text.
3. Change background color.
4. Create and append a button.
5. Remove an element.

---

## Intermediate

6. Build a dynamic todo list.
7. Generate table rows from an array.
8. Clone a DOM node.
9. Move elements between containers.
10. Build an image gallery.

---

## Advanced

11. Implement DOM diffing (conceptually).
12. Build a reusable modal.
13. Build tabs using dynamic DOM creation.
14. Create a sortable list.
15. Build a lightweight component system using plain JavaScript.

---

# Cheat Sheet

```javascript
// Select
document.getElementById(id);
document.querySelector(selector);
document.querySelectorAll(selector);

// Traverse
element.parentElement;
element.children;
element.childNodes;
element.firstElementChild;
element.lastElementChild;
element.nextElementSibling;
element.previousElementSibling;

// Create
document.createElement("div");

// Add
parent.appendChild(child);
parent.append(child1, child2);

// Remove
element.remove();

// Content
element.innerHTML;
element.textContent;
element.innerText;
```

---

# Quick Revision

✔ The DOM is a tree of JavaScript objects representing HTML.

✔ Browsers build the DOM while parsing HTML.

✔ Every HTML element becomes a DOM node.

✔ `querySelector()` returns the first matching element.

✔ `querySelectorAll()` returns a static `NodeList`.

✔ `getElementsByClassName()` returns a live `HTMLCollection`.

✔ `innerHTML` parses HTML.

✔ `textContent` treats everything as plain text.

✔ `createElement()` creates new elements.

✔ `appendChild()` inserts elements into the DOM.

✔ `remove()` removes an element from the DOM.

✔ React uses a Virtual DOM to minimize updates to the real DOM.

---