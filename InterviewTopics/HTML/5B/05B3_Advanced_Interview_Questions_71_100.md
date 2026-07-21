# HTML Interview Guide
# Part 5B.3 – Advanced Interview Questions (71–100+)

---

# 71. What is the difference between HTML, CSS, and JavaScript?

| HTML | CSS | JavaScript |
|------|------|------------|
| Structure | Styling | Behaviour |
| Markup Language | Style Sheet Language | Programming Language |
| Creates Content | Makes Content Beautiful | Makes Content Interactive |

Real Life Example

HTML = House Structure

CSS = Paint & Furniture

JavaScript = Electricity & Smart Devices

---

# 72. Can HTML work without CSS?

Answer

Yes.

The webpage will still display content, but it will have the browser's default styling.

---

# 73. Can HTML work without JavaScript?

Answer

Yes.

Static websites work completely with HTML and CSS.

JavaScript is needed for dynamic behaviour.

---

# 74. What happens if CSS fails to load?

Answer

The page still displays HTML using browser default styles.

---

# 75. What happens if JavaScript fails to load?

Answer

The HTML content is displayed, but interactive features like validation, animations, AJAX, and dynamic updates may not work.

---

# 76. What is Progressive Enhancement?

Answer

Build the website so that basic functionality works with HTML first, then enhance it with CSS and JavaScript.

---

# 77. What is Graceful Degradation?

Answer

Build the full-featured website first, then ensure it still works reasonably well if some features are unavailable.

---

# 78. What is the purpose of the lang attribute?

Example

```html
<html lang="en">
```

Benefits

- Screen Readers
- Search Engines
- Translation Tools
- Accessibility

---

# 79. What is the purpose of the charset meta tag?

```html
<meta charset="UTF-8">
```

It tells the browser how to decode characters correctly.

---

# 80. Why should images have width and height?

Answer

Specifying image dimensions helps the browser reserve space before the image loads, reducing layout shifts and improving user experience.

---

# 81. Why should images use lazy loading?

```html
<img loading="lazy">
```

Benefits

- Faster Initial Load
- Less Bandwidth
- Better Performance

---

# 82. Difference between inline and block elements?

Inline

Only required width.

Block

Full width.

Examples

Inline

```
span

a

strong

img
```

Block

```
div

section

article

p
```

---

# 83. What is the purpose of the title attribute?

Example

```html
<p title="HyperText Markup Language">

HTML

</p>
```

Shows tooltip when hovering.

---

# 84. What is the hidden attribute?

```html
<p hidden>

Hidden Text

</p>
```

The browser does not display the element.

---

# 85. What is the draggable attribute?

Allows dragging.

```html
<div draggable="true">
```

---

# 86. What is contenteditable?

Allows editing directly inside browser.

```html
<p contenteditable="true">

Edit Me

</p>
```

---

# 87. What are data-* attributes?

Custom attributes.

Example

```html
<div

data-id="100"

data-price="500">

Laptop

</div>
```

JavaScript

```javascript
element.dataset.id
```

---

# 88. What is HTML parsing?

The browser reads HTML from top to bottom and converts it into the DOM.

---

# 89. What is Reflow (Layout)?

When the browser recalculates the size and position of elements after a change.

Example

Changing width or height.

---

# 90. What is Repaint?

The browser redraws an element when only its appearance changes without affecting layout.

Example

Changing text color or background color.

---

# 91. Difference between Reflow and Repaint?

| Reflow | Repaint |
|----------|----------|
| Layout recalculated | Only appearance updated |
| More expensive | Less expensive |
| Position changes | Color/style changes |

---

# 92. What are deprecated HTML tags?

Older tags that should no longer be used.

Examples

```html
<font>

<center>

<big>

<strike>

<marquee>

<acronym>
```

Use CSS and modern HTML instead.

---

# 93. Why shouldn't inline styles be overused?

Problems

- Hard to Maintain
- Repeated Code
- Poor Separation of Concerns
- Difficult Team Collaboration

---

# 94. Why is external CSS preferred?

Advantages

- Reusable
- Cacheable
- Cleaner HTML
- Easier Maintenance

---

# 95. Why should JavaScript usually be loaded at the end of the body or with defer?

Because HTML should be parsed first.

Benefits

- Faster page rendering
- Better user experience
- Prevents blocking HTML parsing (when using `defer`)

---

# 96. Explain the browser rendering pipeline.

```
HTML

↓

DOM

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

Composite

↓

Screen
```

---

# 97. Explain HTML from a search engine's point of view.

Search engines look for

- Semantic Structure
- Headings
- Meta Description
- Title
- Alt Attributes
- Internal Links
- Page Speed
- Mobile Friendliness

---

# 98. Explain HTML from a screen reader's point of view.

Screen readers rely on

- Semantic Elements
- Labels
- Alt Text
- Heading Hierarchy
- ARIA (when necessary)

---

# 99. Explain HTML from a developer's point of view.

Good HTML should be

- Semantic
- Accessible
- Readable
- Maintainable
- Responsive
- SEO Friendly

---

# 100. If you had to build a webpage today, what best practices would you follow?

Answer

- Use semantic HTML
- One `<h1>`
- Proper heading hierarchy
- Add `alt` attributes
- Use labels for forms
- Optimize images
- Lazy load images where appropriate
- External CSS and JavaScript
- Responsive viewport meta tag
- Validate HTML
- Test accessibility
- Avoid deprecated tags
- Keep markup clean and readable

---

# Scenario-Based Questions

---

## Scenario 1

The interviewer says:

"I click the label but the textbox is not focused."

Possible Reason

The label's `for` attribute does not match the input's `id`.

---

## Scenario 2

Images are not visible.

Possible Reasons

- Incorrect path
- File missing
- Wrong filename
- Case-sensitive filename mismatch
- Unsupported format

---

## Scenario 3

Form data is visible in the URL.

Reason

The form is using

```html
method="GET"
```

---

## Scenario 4

File upload is not working.

Reason

Forgot

```html
enctype="multipart/form-data"
```

---

## Scenario 5

JavaScript cannot find an element by ID.

Possible Reasons

- Duplicate IDs
- Incorrect ID
- Script runs before the element exists in the DOM

---

# Tricky Questions

### Is HTML case-sensitive?

No.

However, lowercase tags and attributes are recommended.

---

### Is closing every tag mandatory?

No.

Some elements such as `<img>`, `<br>`, and `<hr>` are void (empty) elements.

---

### Can there be multiple `<header>` elements?

Yes.

A page can have multiple headers, for example inside different sections or articles.

---

### Can there be multiple `<footer>` elements?

Yes.

Each section or article may have its own footer.

---

### Can there be multiple `<main>` elements?

No.

A page should contain only one visible `<main>` element.

---

### Is the `<body>` tag mandatory?

Yes.

All visible content belongs inside the `<body>` element.

---

### Is HTML interpreted or compiled?

Browsers parse HTML and build the DOM. It is neither compiled like C nor interpreted like JavaScript in the traditional sense.

---

# Company-Style Questions

## TCS

Difference between HTML4 and HTML5?

---

## Infosys

Difference between GET and POST?

---

## Accenture

Difference between Semantic HTML and Non-Semantic HTML?

---

## Cognizant

Difference between Local Storage and Session Storage?

---

## Capgemini

Difference between div and span?

---

## HCLTech

Difference between id and class?

---

## Deloitte

Difference between Canvas and SVG?

---

## Zoho

Explain browser rendering from typing HTML to displaying the webpage.

---

## Amazon

How would you improve the accessibility of a registration form?

Possible Answer

- Use labels
- Semantic HTML
- Keyboard navigation
- ARIA only when needed
- Error messages linked to inputs
- Proper color contrast

---

## Microsoft

How would you optimize a slow HTML page?

Possible Answer

- Compress images
- Lazy loading
- Reduce DOM size
- Minify HTML
- Remove unused code
- Load scripts efficiently
- Optimize fonts

---

## Google

How does Semantic HTML improve SEO?

Possible Answer

Semantic HTML helps search engines understand the structure and meaning of the content, improving indexing and accessibility.

---

# HR + Technical Questions

Why do you prefer Semantic HTML?

How do you make webpages accessible?

What HTML feature do you use most?

How do you optimize page performance?

How do you debug HTML issues?

What tools do you use to validate HTML?

---

# Final HTML Revision Checklist

✔ HTML5 document structure

✔ Semantic elements

✔ Headings

✔ Paragraphs

✔ Links

✔ Images

✔ Lists

✔ Tables

✔ Forms

✔ Input types

✔ Labels

✔ Validation

✔ Accessibility

✔ ARIA basics

✔ Meta tags

✔ SEO fundamentals

✔ Audio

✔ Video

✔ Canvas

✔ SVG

✔ iframe

✔ Local Storage

✔ Session Storage

✔ Cookies

✔ Browser rendering

✔ DOM

✔ Global attributes

✔ Performance

✔ Security basics

✔ Best practices

✔ Common interview questions

---

# HTML Interview Golden Rules

1. Use semantic HTML.
2. Prefer accessibility over visual hacks.
3. Use one `<h1>` for the main page topic.
4. Always provide meaningful `alt` text for informative images.
5. Use labels for every form control.
6. Never rely only on client-side validation.
7. Avoid deprecated HTML tags.
8. Keep HTML clean and readable.
9. Optimize media for performance.
10. Think about SEO and accessibility while writing HTML.
