# HTML Interview Guide
> Complete Beginner to Advanced Interview Handbook

---

# Table of Contents

1. Introduction to HTML
2. History of HTML
3. Why HTML?
4. Features of HTML
5. Advantages
6. Disadvantages
7. HTML Versions
8. HTML Document Structure
9. Browser Rendering Process
10. HTML Elements
11. HTML Tags
12. HTML Attributes
13. Nested Elements
14. Empty Elements
15. Block vs Inline Elements
16. Comments
17. Whitespace
18. Character Entities
19. Interview Questions

---

# 1. Introduction to HTML

## Definition

HTML stands for **HyperText Markup Language**.

It is the standard markup language used to create web pages.

HTML describes the structure of a webpage using elements.

HTML is **not** a programming language.

HTML only tells the browser **what content exists** and **how that content is organized**.

---

## Why is it called HyperText?

HyperText means text connected with other text using hyperlinks.

Example

```
Google ---> Click ---> Opens another page
```

---

## Why is it called Markup Language?

Markup means surrounding content with tags.

Example

```html
<h1>Hello World</h1>
```

Here

```
<h1>   Opening Tag

Hello World   Content

</h1> Closing Tag
```

---

# Real World Analogy

Imagine constructing a house.

HTML = Structure

CSS = Paint + Decoration

JavaScript = Electricity + Smart Devices

Without HTML there is no webpage.

---

# 2. History of HTML

| Version | Year | Features |
|----------|------|----------|
| HTML | 1991 | Basic Tags |
| HTML2 | 1995 | Forms |
| HTML3.2 | 1997 | Tables |
| HTML4.01 | 1999 | Better Structure |
| XHTML | 2000 | XML Rules |
| HTML5 | 2014 | Audio Video Canvas SVG APIs |

Creator

Sir Tim Berners-Lee

Invented in 1991.

---

# Interview Question

Who invented HTML?

Answer

Sir Tim Berners-Lee.

---

# 3. Why HTML?

Without HTML

✔ No buttons

✔ No text

✔ No images

✔ No links

✔ No forms

Everything you see on a webpage begins with HTML.

---

# 4. Features of HTML

✔ Easy to Learn

✔ Platform Independent

✔ Browser Supported

✔ Lightweight

✔ Free

✔ Supports Multimedia

✔ Semantic Tags

✔ SEO Friendly

✔ Integrates with CSS

✔ Integrates with JavaScript

---

# 5. Advantages

Easy

Fast

Free

Supported everywhere

Simple Syntax

Responsive with CSS

SEO Friendly

Large Community

---

# 6. Disadvantages

Cannot create logic

Cannot perform calculations

Cannot store data

Needs CSS for styling

Needs JavaScript for interactivity

---

# 7. HTML Versions

## HTML

Basic webpage creation.

---

## HTML2

Introduced forms.

---

## HTML3

Added tables.

---

## HTML4

Added scripting support.

---

## XHTML

Stricter syntax rules.

Example

```html
<br />
<img />
```

Everything must be properly closed.

---

## HTML5

Most popular version.

Introduced

Audio

Video

Canvas

SVG

Semantic Tags

Local Storage

Session Storage

Drag & Drop

Geolocation

---

# Interview Question

Which HTML version is currently used?

Answer

HTML5.

---

# 8. HTML Document Structure

Example

```html
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">

    <title>My Website</title>

</head>

<body>

    <h1>Hello</h1>

</body>

</html>
```

---

# Breakdown

## <!DOCTYPE html>

Tells browser this is an HTML5 document.

Not an HTML tag.

---

## <html>

Root element.

Everything is inside it.

---

## lang

```html
<html lang="en">
```

Specifies webpage language.

Useful for

SEO

Accessibility

Screen Readers

Translation

---

## head

Contains

Title

Meta Tags

CSS Links

JavaScript Links

Icons

Fonts

Invisible to users.

---

## body

Visible webpage.

Everything users see is inside body.

---

# Browser Rendering Process

```
HTML File

↓

Browser Reads HTML

↓

Creates DOM Tree

↓

Loads CSS

↓

Creates CSSOM

↓

Combines DOM + CSSOM

↓

Render Tree

↓

Layout

↓

Paint

↓

Display on Screen
```

Interview Question

How does browser render HTML?

Answer

Browser parses HTML, creates DOM, combines with CSSOM, builds Render Tree, performs layout, paints pixels on screen.

---

# 9. HTML Elements

An HTML element consists of

Opening Tag

Content

Closing Tag

Example

```html
<p>Hello</p>
```

Entire line is called an element.

---

# Anatomy

```
<p>

Opening Tag

Hello

Content

</p>

Closing Tag
```

---

# 10. HTML Tags

Example

```html
<h1></h1>

<p></p>

<img>

<a></a>

<table></table>
```

Tags define content type.

---

# 11. HTML Attributes

Attributes provide extra information.

Example

```html
<img src="image.jpg" alt="Flower">
```

Here

src

alt

are attributes.

---

Another Example

```html
<a href="https://google.com">

Google

</a>
```

href is an attribute.

---

Common Attributes

id

class

style

title

hidden

disabled

href

src

alt

name

value

placeholder

required

readonly

checked

selected

---

# 12. Nested Elements

Example

```html
<div>

    <p>

        <strong>Hello</strong>

    </p>

</div>
```

Think of it like boxes inside boxes.

---

# 13. Empty Elements

Some tags don't need closing tags.

Example

```html
<br>

<hr>

<img>

<input>

<meta>

<link>
```

They have no content.

---

# 14. Block vs Inline Elements

## Block Elements

Start on a new line.

Take full width.

Examples

```html
<div>

<p>

h1-h6

section

article

header

footer

nav

main
```

---

## Inline Elements

Do not start on a new line.

Take only required width.

Examples

```html
<span>

<a>

<strong>

<em>

<img>

<label>
```

---

Interview Question

Difference between block and inline elements?

Answer

Block elements occupy the entire width and start on a new line.

Inline elements occupy only the required width and remain in the same line.

---

# 15. Comments

Syntax

```html
<!-- This is comment -->
```

Comments are ignored by browsers.

Useful for documentation.

---

# 16. Whitespace

Browser ignores extra spaces.

Example

```html
<p>

Hello


World

</p>
```

Output

```
Hello World
```

Need exact spacing?

Use CSS.

---

# 17. Character Entities

Some symbols are reserved.

Examples

| Character | Entity |
|------------|---------|
| < | `&lt;` |
| > | `&gt;` |
| & | `&amp;` |
| " | `&quot;` |
| © | `&copy;` |
| ₹ | `&#8377;` |
| Space | `&nbsp;` |

Example

```html
<p>5 &lt; 10</p>
```

Output

```
5 < 10
```

---

# Memory Tips

HTML

→ Structure

CSS

→ Design

JavaScript

→ Behaviour

---

DOM

Think of DOM as a tree.

```
html

|

+-- head

|

| +-- title

|

+-- body

|

+-- h1

|

+-- p

|

+-- img

|

+-- div
```

---

# Frequently Asked Interview Questions (Part 1)

### 1. What is HTML?

### 2. Is HTML a programming language?

### 3. Difference between HTML and HTML5?

### 4. What is DOCTYPE?

### 5. What is DOM?

### 6. Difference between tag and element?

### 7. Difference between attribute and property?

### 8. What are empty tags?

### 9. What are block elements?

### 10. What are inline elements?

### 11. What is lang attribute?

### 12. What is head tag?

### 13. What is body tag?

### 14. Why use comments?

### 15. Why use character entities?

---

# Quick Revision

- HTML = HyperText Markup Language
- HTML defines page structure
- HTML5 is the latest standard
- `<!DOCTYPE html>` declares HTML5
- `<html>` is the root element
- `<head>` contains metadata
- `<body>` contains visible content
- Elements = opening tag + content + closing tag
- Attributes provide additional information
- Block elements start on a new line
- Inline elements stay within the same line
- Browsers parse HTML into the DOM before rendering

---