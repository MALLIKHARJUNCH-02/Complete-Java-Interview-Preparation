# HTML Interview Guide
# Part 5B.1 – HTML Interview Questions (1–35)

---

# HTML Interview Questions

These questions are frequently asked in interviews at:

- TCS
- Infosys
- Accenture
- Cognizant
- Capgemini
- HCLTech
- Wipro
- Deloitte
- Tech Mahindra
- Zoho
- Amazon
- Microsoft
- Google

---

# 1. What is HTML?

Answer

HTML stands for HyperText Markup Language.

It is the standard markup language used to create the structure of web pages.

HTML is not a programming language because it cannot perform logic, calculations, or decision-making.

Example

```html
<h1>Hello World</h1>
```

---

# 2. Why is HTML called HyperText?

Answer

HyperText refers to text connected by hyperlinks.

Example

```html
<a href="about.html">
About
</a>
```

Clicking the link moves to another page.

---

# 3. Why is HTML called a Markup Language?

Answer

HTML uses tags to mark up content.

Example

```html
<p>Hello</p>
```

The `<p>` tag marks the content as a paragraph.

---

# 4. Is HTML a Programming Language?

Answer

No.

Programming languages support:

- Variables
- Loops
- Conditions
- Functions

HTML supports none of these.

It only defines page structure.

---

# 5. What is the latest version of HTML?

Answer

HTML5

It introduced:

- Audio
- Video
- Canvas
- SVG
- Semantic Tags
- Local Storage
- Geolocation

---

# 6. Difference between HTML and HTML5

| HTML | HTML5 |
|------|-------|
| Older Version | Latest Standard |
| No Audio Tag | Audio Tag |
| No Video Tag | Video Tag |
| No Canvas | Canvas |
| Limited APIs | Many HTML5 APIs |

---

# 7. What is DOCTYPE?

Answer

```html
<!DOCTYPE html>
```

It tells the browser the document follows the HTML5 standard.

Without it, browsers may enter **quirks mode**, which can render pages differently.

---

# 8. Is DOCTYPE an HTML Tag?

Answer

No.

It is a declaration.

---

# 9. What is the Root Element?

Answer

```html
<html>
```

Every HTML document has one root element.

---

# 10. What is DOM?

Answer

DOM stands for

Document Object Model.

The browser converts HTML into a tree structure called the DOM.

JavaScript uses the DOM to read and modify webpage elements.

---

# 11. Who Creates the DOM?

Answer

The Browser.

---

# 12. Difference Between Tag and Element

Tag

```html
<p>
```

Element

```html
<p>Hello</p>
```

An element includes:

Opening tag

Content

Closing tag

---

# 13. Difference Between Element and Attribute

Element

```html
<p>Hello</p>
```

Attribute

```html
<p class="red">
```

Attributes provide additional information.

---

# 14. What are Empty Elements?

Answer

Elements without closing tags.

Examples

```html
<br>

<hr>

<img>

<input>

<meta>

<link>
```

---

# 15. Difference Between Block and Inline Elements

Block

Starts on new line.

Examples

```html
div

p

section

article
```

Inline

Only takes required width.

Examples

```html
span

a

img

strong
```

---

# 16. Difference Between div and span

| div | span |
|------|------|
| Block | Inline |
| Layout | Small Content |
| Full Width | Required Width |

---

# 17. Difference Between id and class

| id | class |
|-----|--------|
| Unique | Reusable |
| One Element | Many Elements |
| # Selector | . Selector |

---

# 18. Can Multiple Elements Have Same id?

Answer

No.

IDs should be unique.

---

# 19. Can Multiple Elements Have Same class?

Answer

Yes.

That is the purpose of class.

---

# 20. What are Semantic Tags?

Answer

Semantic tags describe the meaning of content.

Examples

```html
<header>

<nav>

<main>

<section>

<article>

<footer>
```

---

# 21. Advantages of Semantic HTML

- Better SEO
- Better Accessibility
- Easier Maintenance
- Readable Code
- Better Screen Reader Support

---

# 22. Difference Between div and section

div

Generic container.

section

Represents a meaningful section.

---

# 23. Difference Between article and section

Section

Groups related content.

Article

Independent content.

Examples

- Blog
- News
- Product Review

---

# 24. Difference Between article and aside

Article

Main content.

Aside

Related content.

Example

Related Articles.

---

# 25. Difference Between b and strong

b

Visual bold.

strong

Semantic importance.

Prefer

```html
<strong>
```

---

# 26. Difference Between i and em

i

Visual italic.

em

Semantic emphasis.

Prefer

```html
<em>
```

---

# 27. Why Use alt Attribute?

Answer

- Accessibility
- SEO
- Displays alternate text if image fails to load
- Helps screen readers describe images

---

# 28. Difference Between HTML and XHTML

HTML

Flexible syntax.

XHTML

Strict XML rules.

Everything must be properly closed.

---

# 29. What is Accessibility?

Answer

Accessibility means designing websites that everyone, including people with disabilities, can use.

---

# 30. What is ARIA?

Answer

ARIA stands for

Accessible Rich Internet Applications.

It adds accessibility information when semantic HTML alone is not enough.

Example

```html
<button aria-label="Close">
×
</button>
```

---

# 31. What is the Purpose of Meta Tags?

Answer

Meta tags provide information about the webpage.

Examples

- Character Encoding
- Viewport
- Description
- Author

---

# 32. Which Meta Tag Makes Website Responsive?

Answer

```html
<meta
name="viewport"
content="width=device-width, initial-scale=1.0">
```

---

# 33. Why is the viewport Meta Tag Important?

Answer

Without it,

Mobile browsers may render pages at a desktop-like width and then scale them down.

The viewport tag tells the browser to use the device width for responsive layouts.

---

# 34. Difference Between Canvas and SVG

| Canvas | SVG |
|----------|---------|
| Pixel Based | Vector Based |
| JavaScript Drawing | XML Elements |
| Better for Games | Better for Icons |
| Not Easily Editable After Drawing | Easy to Edit |

---

# 35. Difference Between Local Storage and Session Storage

| Local Storage | Session Storage |
|----------------|----------------|
| Permanent Until Cleared | Exists Only for the Browser Tab Session |
| Shared Across Same-Origin Tabs | Separate Per Tab |
| Around 5–10 MB (Browser Dependent) | Similar Capacity |

---

# Rapid Fire Questions

✔ Who invented HTML?

→ Tim Berners-Lee

✔ Latest Version?

→ HTML5

✔ Root Element?

→ html

✔ Largest Heading?

→ h1

✔ Smallest Heading?

→ h6

✔ HTML is?

→ Markup Language

✔ HTML File Extension?

→ .html

✔ CSS File Extension?

→ .css

✔ JavaScript File Extension?

→ .js

✔ Browser Creates?

→ DOM

✔ HTML5 Supports?

→ Audio, Video, Canvas, SVG, APIs

✔ One h1 Per Page?

→ Recommended

✔ Unique Attribute?

→ id

✔ Reusable Attribute?

→ class

✔ Tag for Navigation?

→ nav

✔ Tag for Main Content?

→ main

✔ Tag for Footer?

→ footer

✔ Tag for Independent Content?

→ article

✔ Tag for Sidebar?

→ aside

✔ Tag for Grouping Generic Block?

→ div

✔ Tag for Generic Inline Content?

→ span

---

# Interview Tips

- Explain concepts with examples instead of memorizing definitions.
- Mention accessibility and SEO when discussing semantic HTML.
- Distinguish clearly between similar tags such as `<div>` vs `<section>` or `<b>` vs `<strong>`.
- If asked about HTML5, mention at least a few major features such as semantic elements, multimedia support, Canvas, SVG, and Web Storage.

---