# HTML Interview Guide
# Part 4 – Semantic HTML, HTML5, Accessibility, Multimedia & SEO

---

# Table of Contents

1. What is Semantic HTML?
2. Non-Semantic vs Semantic Elements
3. HTML5 Semantic Tags
4. HTML5 Page Layout
5. div vs span
6. Accessibility (A11Y)
7. ARIA Basics
8. Meta Tags
9. SEO Basics
10. Favicon
11. Audio
12. Video
13. iframe
14. Canvas
15. SVG
16. Best Practices
17. Common Mistakes
18. Interview Questions
19. Quick Revision

---

# 1. What is Semantic HTML?

Semantic HTML means using HTML elements that clearly describe their purpose.

Instead of writing:

```html
<div class="header">
```

Write:

```html
<header>
```

The browser, developers, search engines, and screen readers can understand the purpose of the content.

---

# Why Semantic HTML?

✔ Better SEO

✔ Better Accessibility

✔ Easier Maintenance

✔ Cleaner Code

✔ Better Readability

✔ Screen Reader Support

---

# 2. Non-Semantic vs Semantic Elements

## Non-Semantic Elements

These do not describe their content.

```html
<div>

<span>
```

---

## Semantic Elements

These describe their purpose.

```html
<header>

<nav>

<main>

<section>

<article>

<aside>

<footer>

<figure>

<figcaption>

<details>

<summary>

<time>

<mark>
```

---

Interview Question

Difference between semantic and non-semantic HTML?

Answer

Semantic elements describe the meaning of their content, while non-semantic elements only group content without indicating its purpose.

---

# 3. HTML5 Semantic Tags

---

## header

Represents introductory content.

```html
<header>

<h1>My Portfolio</h1>

</header>
```

Usually contains

- Logo
- Navigation
- Search
- Heading

---

## nav

Navigation links.

```html
<nav>

<a href="/">Home</a>

<a href="/about">About</a>

</nav>
```

Use only for major navigation.

---

## main

Contains the primary content.

```html
<main>

...

</main>
```

Only **one** `<main>` per page.

---

## section

Represents a logical section.

```html
<section>

<h2>Services</h2>

</section>
```

---

## article

Independent content.

Examples

- Blog post
- News article
- Product review
- Forum post

```html
<article>

<h2>HTML Tutorial</h2>

</article>
```

---

## aside

Side information.

```html
<aside>

Related Posts

</aside>
```

Examples

- Ads
- Sidebar
- Related Articles

---

## footer

Represents footer.

```html
<footer>

Copyright 2026

</footer>
```

Usually contains

- Copyright
- Contact
- Social Links
- Privacy Policy

---

## figure

Represents self-contained media.

```html
<figure>

<img src="flower.jpg">

</figure>
```

---

## figcaption

Caption for figure.

```html
<figure>

<img src="flower.jpg">

<figcaption>

Rose Flower

</figcaption>

</figure>
```

---

## details

Expandable content.

```html
<details>

Hidden Content

</details>
```

---

## summary

Title of details.

```html
<details>

<summary>

Read More

</summary>

More Information...

</details>
```

---

## mark

Highlights text.

```html
<mark>

Important

</mark>
```

---

## time

Represents date/time.

```html
<time datetime="2026-07-21">

July 21, 2026

</time>
```

Useful for SEO and accessibility.

---

# 4. HTML5 Layout

```
+----------------------+

        HEADER

+----------------------+

NAVIGATION

+----------------------+

MAIN

+---------+------------+

SECTION   |  ASIDE

+---------+------------+

ARTICLE

+----------------------+

FOOTER

+----------------------+
```

Example

```html
<body>

<header></header>

<nav></nav>

<main>

<section>

<article>

</article>

</section>

<aside>

</aside>

</main>

<footer>

</footer>

</body>
```

---

# 5. div vs span

## div

Block element.

Starts on new line.

```html
<div>

Hello

</div>
```

---

## span

Inline element.

```html
<span>

Hello

</span>
```

---

Interview Question

Difference between div and span?

| div | span |
|------|------|
| Block | Inline |
| Full Width | Required Width |
| Layout | Styling Small Text |

---

# 6. Accessibility (A11Y)

Accessibility means making websites usable for everyone, including people with disabilities.

Examples

✔ Blind users

✔ Low vision users

✔ Keyboard users

✔ Screen reader users

---

Good Accessibility

✔ Labels

✔ Alt Text

✔ Semantic HTML

✔ Keyboard Navigation

✔ Color Contrast

✔ Focus Indicators

---

Interview Question

Why is accessibility important?

Answer

It improves usability for everyone and ensures websites are accessible to users with disabilities while also helping SEO.

---

# 7. ARIA Basics

ARIA

Accessible Rich Internet Applications

Used when semantic HTML alone is insufficient.

Example

```html
<button

aria-label="Close">

×

</button>
```

---

Common ARIA Attributes

```text
aria-label

aria-hidden

aria-expanded

aria-controls

aria-describedby

role
```

---

Example

```html
<nav

aria-label="Main Navigation">

...

</nav>
```

---

Interview Question

Should ARIA replace semantic HTML?

Answer

No.

Use semantic HTML first.

Use ARIA only when necessary.

---

# 8. Meta Tags

Meta tags provide information about the webpage.

---

Character Encoding

```html
<meta charset="UTF-8">
```

---

Responsive Website

```html
<meta

name="viewport"

content="width=device-width, initial-scale=1.0">
```

---

Description

```html
<meta

name="description"

content="Learn HTML">
```

---

Keywords

```html
<meta

name="keywords"

content="HTML,CSS,JavaScript">
```

(Note: Modern search engines place little or no weight on the `keywords` meta tag.)

---

Author

```html
<meta

name="author"

content="Mallik">
```

---

Refresh

```html
<meta

http-equiv="refresh"

content="5">
```

Refresh after 5 seconds.

---

Interview Question

Which meta tag makes a website responsive?

Answer

```html
<meta

name="viewport"

content="width=device-width, initial-scale=1.0">
```

---

# 9. SEO Basics

SEO

Search Engine Optimization

Improves search engine ranking.

---

Good SEO Practices

✔ Semantic HTML

✔ Meta Description

✔ Alt Attributes

✔ One h1

✔ Proper Heading Order

✔ Meaningful URLs

✔ Fast Website

✔ Mobile Friendly

✔ Structured Content

✔ Internal Links

---

Bad SEO

❌ Missing alt

❌ Multiple h1

❌ Slow Images

❌ Broken Links

❌ Duplicate Content

---

Interview Question

Does semantic HTML improve SEO?

Answer

Yes.

It helps search engines better understand the structure and meaning of the content.

---

# 10. Favicon

Website icon shown in the browser tab.

```html
<link

rel="icon"

href="favicon.ico">
```

---

# 11. Audio

```html
<audio controls>

<source

src="song.mp3"

type="audio/mpeg">

</audio>
```

Attributes

```
controls

autoplay

loop

muted

preload
```

---

# 12. Video

```html
<video

controls

width="500">

<source

src="movie.mp4"

type="video/mp4">

</video>
```

Attributes

```
controls

autoplay

loop

muted

poster

preload
```

---

Interview Question

Difference between autoplay and controls?

Autoplay starts playback automatically (though many browsers restrict autoplay with sound).

Controls display the browser's playback controls.

---

# 13. iframe

Embeds another webpage.

```html
<iframe

src="https://example.com"

width="600"

height="400">

</iframe>
```

Uses

- Maps
- Videos
- Documents
- External Pages

---

Security

Use only trusted sources.

---

# 14. Canvas

Canvas is used for drawing graphics with JavaScript.

```html
<canvas

id="myCanvas"

width="300"

height="200">

</canvas>
```

Uses

✔ Games

✔ Charts

✔ Drawing

✔ Animation

Canvas content is pixel-based and drawn through JavaScript.

---

# 15. SVG

Scalable Vector Graphics.

```html
<svg

width="100"

height="100">

<circle

cx="50"

cy="50"

r="40"

fill="red">

</circle>

</svg>
```

Advantages

✔ Scalable

✔ Small Size

✔ Sharp at Any Resolution

✔ CSS Styling

✔ JavaScript Support

---

Interview Question

Canvas vs SVG?

| Canvas | SVG |
|----------|---------|
| Pixel-based | Vector-based |
| JavaScript drawing | XML elements |
| Better for games | Better for icons |
| Harder to edit after drawing | Easy to edit |

---

# Best Practices

✔ Use semantic HTML.

✔ Use one `<main>`.

✔ Use one `<h1>`.

✔ Add alt to images.

✔ Use descriptive page titles.

✔ Add meta description.

✔ Use responsive viewport meta tag.

✔ Prefer SVG for logos and icons.

✔ Add captions to images using `<figure>` and `<figcaption>`.

✔ Use ARIA only when semantic HTML is insufficient.

---

# Common Mistakes

❌ Using only `<div>` everywhere.

❌ Missing `alt` attributes.

❌ Multiple `<main>` elements.

❌ Multiple `<h1>` tags without structure.

❌ Embedding untrusted content in iframes.

❌ Using Canvas for static icons.

❌ Ignoring keyboard navigation.

❌ Missing viewport meta tag.

---

# Frequently Asked Interview Questions

1. What is Semantic HTML?

2. Why is Semantic HTML important?

3. Difference between div and span?

4. Difference between section and article?

5. Difference between article and aside?

6. What is the purpose of the main tag?

7. Can a page contain multiple main elements?

8. What is Accessibility?

9. What is ARIA?

10. Should ARIA replace semantic HTML?

11. What is the viewport meta tag?

12. What is a favicon?

13. Difference between Canvas and SVG?

14. Why use figure and figcaption?

15. What is the purpose of iframe?

16. What are the advantages of semantic HTML for SEO?

17. Which HTML element is best for navigation?

18. Which HTML element should contain the primary content of the page?

19. Why is the alt attribute important?

20. What are some common accessibility best practices?

---

# Quick Revision

- Semantic HTML improves readability, accessibility, and SEO.
- Use `<header>`, `<nav>`, `<main>`, `<section>`, `<article>`, `<aside>`, and `<footer>` appropriately.
- `div` is a block-level generic container; `span` is an inline generic container.
- Use semantic elements before adding ARIA attributes.
- The viewport meta tag enables responsive layouts.
- `alt` text is essential for accessibility and SEO.
- Canvas is ideal for dynamic graphics; SVG is ideal for scalable icons and illustrations.
- `iframe` embeds external content but should be used carefully for security.
- A favicon helps users identify your website in browser tabs.