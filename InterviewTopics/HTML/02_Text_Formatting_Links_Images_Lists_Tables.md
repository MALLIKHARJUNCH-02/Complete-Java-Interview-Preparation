# HTML Interview Guide
## Part 2 – Text Formatting, Links, Images, Lists & Tables

---

# Table of Contents

1. Headings
2. Paragraphs
3. Text Formatting Tags
4. Quotations
5. Links
6. Images
7. Lists
8. Tables
9. Best Practices
10. Common Mistakes
11. Interview Questions

---

# 1. Headings

HTML provides six heading levels.

```html
<h1>Main Heading</h1>
<h2>Sub Heading</h2>
<h3>Section</h3>
<h4>Topic</h4>
<h5>Sub Topic</h5>
<h6>Small Heading</h6>
```

Output

```
Largest Heading
 ↓
 ↓
Smallest Heading
```

## Importance

- Defines page structure
- Helps SEO
- Helps screen readers
- Improves readability

### Best Practice

Only one `<h1>` per page.

Use headings sequentially.

Correct

```html
<h1>HTML Tutorial</h1>
<h2>Introduction</h2>
<h3>History</h3>
```

Wrong

```html
<h1>Title</h1>
<h4>Introduction</h4>
```

---

Interview Question

Why should a page have only one `<h1>`?

Answer

Because it represents the main topic of the page and helps search engines understand the page hierarchy.

---

# 2. Paragraph

Paragraph tag

```html
<p>
This is a paragraph.
</p>
```

The browser automatically adds margin before and after paragraphs.

---

Line Break

```html
<p>
Hello<br>
World
</p>
```

Output

```
Hello
World
```

---

Horizontal Line

```html
<hr>
```

Output

A horizontal separator.

---

# 3. Text Formatting Tags

## Bold

```html
<b>Bold Text</b>
```

---

## Strong

```html
<strong>Important Text</strong>
```

Difference

`<b>`

Visual only.

`<strong>`

Indicates important content (semantic).

SEO and screen readers understand `<strong>`.

Prefer `<strong>`.

---

Interview Question

Difference between `<b>` and `<strong>`?

Answer

`<b>` makes text bold only.

`<strong>` makes text bold and indicates importance semantically.

---

Italic

```html
<i>Italic</i>
```

---

Emphasis

```html
<em>Emphasized Text</em>
```

Difference

`<i>`

Visual only.

`<em>`

Adds semantic emphasis.

Prefer `<em>`.

---

Underline

```html
<u>Underline</u>
```

---

Highlight

```html
<mark>Highlighted</mark>
```

Useful for search results.

---

Small Text

```html
<small>Small Text</small>
```

---

Deleted Text

```html
<del>₹999</del>
```

---

Inserted Text

```html
<ins>₹699</ins>
```

---

Subscript

```html
H<sub>2</sub>O
```

Output

H₂O

---

Superscript

```html
x<sup>2</sup>
```

Output

x²

---

Code

```html
<code>
System.out.println();
</code>
```

Displays code in monospace font.

---

Keyboard Input

```html
<kbd>Ctrl + C</kbd>
```

---

Preformatted Text

```html
<pre>
Hello

World
</pre>
```

Keeps spaces and line breaks.

---

# 4. Quotations

Block Quote

```html
<blockquote>

Learning never stops.

</blockquote>
```

Used for long quotations.

---

Inline Quote

```html
<q>

HTML is easy.

</q>
```

Output

"HTML is easy."

---

Abbreviation

```html
<abbr title="HyperText Markup Language">

HTML

</abbr>
```

Hover shows full form.

---

Address

```html
<address>

Hyderabad,
India

</address>
```

Used for contact information.

---

# 5. Links

Syntax

```html
<a href="https://google.com">

Google

</a>
```

---

Open New Tab

```html
<a href="https://google.com"

target="_blank">

Google

</a>
```

---

Open Same Tab

```html
<a href="page.html">

Next Page

</a>
```

---

Email Link

```html
<a href="mailto:test@gmail.com">

Send Email

</a>
```

---

Phone Link

```html
<a href="tel:+919876543210">

Call

</a>
```

---

Download File

```html
<a href="resume.pdf"

download>

Download Resume

</a>
```

---

Bookmark Link

```html
<a href="#contact">

Contact

</a>
```

```html
<section id="contact">

...

</section>
```

---

Important Attributes

href

target

download

rel

title

id

---

Interview Question

Why use

```
rel="noopener noreferrer"
```

with

```
target="_blank"
```

Answer

For security and performance.

Prevents the new page from accessing the original page.

---

# 6. Images

Syntax

```html
<img

src="flower.jpg"

alt="Red Flower">
```

---

Important Attributes

src

alt

width

height

loading

title

---

Responsive Image

```html
<img

src="image.jpg"

width="100%">
```

Better approach

```css
img{

max-width:100%;

height:auto;

}
```

---

Lazy Loading

```html
<img

src="flower.jpg"

loading="lazy">
```

Loads image only when needed.

Improves performance.

---

Interview Question

Why is the alt attribute important?

Answer

Accessibility

SEO

Displayed if image fails

Screen readers use it.

---

# 7. Lists

## Unordered List

```html
<ul>

<li>Apple</li>

<li>Mango</li>

<li>Orange</li>

</ul>
```

---

Ordered List

```html
<ol>

<li>Wake Up</li>

<li>Study</li>

<li>Sleep</li>

</ol>
```

---

Different Types

```html
<ol type="A">

<ol type="a">

<ol type="I">

<ol type="i">

<ol type="1">
```

---

Description List

```html
<dl>

<dt>HTML</dt>

<dd>Markup Language</dd>

</dl>
```

---

Nested List

```html
<ul>

<li>

Programming

<ul>

<li>Java</li>

<li>Python</li>

</ul>

</li>

</ul>
```

---

# 8. Tables

Basic Table

```html
<table>

<tr>

<th>Name</th>

<th>Age</th>

</tr>

<tr>

<td>John</td>

<td>25</td>

</tr>

</table>
```

---

Structure

```html
<table>

<thead>

<tr>

<th>Name</th>

</tr>

</thead>

<tbody>

<tr>

<td>John</td>

</tr>

</tbody>

<tfoot>

<tr>

<td>Total</td>

</tr>

</tfoot>

</table>
```

---

Merge Columns

```html
<td colspan="2">
```

---

Merge Rows

```html
<td rowspan="2">
```

---

Table Attributes

border

cellpadding

cellspacing

Modern HTML uses CSS instead.

---

Accessibility

```html
<th scope="col">

Name

</th>
```

Improves screen reader support.

---

# Best Practices

✔ Use semantic tags.

✔ Always use alt for images.

✔ Use one `<h1>`.

✔ Use `<strong>` instead of `<b>`.

✔ Use `<em>` instead of `<i>`.

✔ Use `<thead>` `<tbody>` `<tfoot>`.

✔ Write meaningful link text.

✔ Optimize images.

✔ Use lazy loading.

✔ Validate HTML.

---

# Common Mistakes

❌ Skipping heading levels

❌ Missing alt attributes

❌ Using tables for layout

❌ Multiple `<h1>` tags

❌ Empty links

```html
<a href="#"></a>
```

❌ Using `<br>` repeatedly for spacing

Use CSS instead.

❌ Missing closing tags

❌ Large unoptimized images

---

# Frequently Asked Interview Questions

1. Difference between `<b>` and `<strong>`?

2. Difference between `<i>` and `<em>`?

3. Why use `alt`?

4. Difference between ordered and unordered lists?

5. What is a description list?

6. Difference between `<td>` and `<th>`?

7. What are `rowspan` and `colspan`?

8. Difference between `<blockquote>` and `<q>`?

9. What is lazy loading?

10. Why use `<thead>`, `<tbody>`, and `<tfoot>`?

11. What is the purpose of the `download` attribute?

12. Why should `target="_blank"` use `rel="noopener noreferrer"`?

13. Why shouldn't tables be used for page layout?

14. How do you create bookmarks within the same page?

15. What is the difference between `<pre>` and `<code>`?

---

# Quick Revision

- `<h1>`–`<h6>` define page hierarchy.
- `<p>` creates paragraphs.
- `<br>` inserts a line break.
- `<hr>` creates a thematic separator.
- `<strong>` and `<em>` provide semantic meaning.
- Use `alt` on every meaningful image.
- `<ul>` is unordered, `<ol>` is ordered, `<dl>` is descriptive.
- Use `<thead>`, `<tbody>`, and `<tfoot>` for well-structured tables.
- Prefer CSS for styling and spacing instead of deprecated HTML attributes.