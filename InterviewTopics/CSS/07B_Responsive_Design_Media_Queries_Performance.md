# CSS Interview Guide
# Part 7B – Responsive Design, Media Queries & Performance

---

# Table of Contents

1. Responsive Web Design
2. Viewport
3. Mobile-First Design
4. Desktop-First Design
5. Breakpoints
6. Media Queries
7. Orientation
8. Responsive Units
9. Responsive Images
10. Responsive Typography
11. Responsive Layouts
12. CSS Performance Optimization
13. Accessibility Best Practices
14. Best Practices
15. Common Mistakes
16. Interview Questions
17. Cheat Sheet
18. Quick Revision

---

# 1. Responsive Web Design (RWD)

Responsive Web Design means a website adapts to different screen sizes.

One website should work on

✔ Mobile

✔ Tablet

✔ Laptop

✔ Desktop

✔ TV

---

Example

Desktop

```
+----------------------------+

Logo     Menu

Content

Sidebar

Footer

+----------------------------+
```

Mobile

```
Logo

Menu

Content

Sidebar

Footer
```

---

Why Responsive Design?

✔ Better User Experience

✔ Mobile Friendly

✔ Better SEO

✔ Easier Maintenance

✔ One Codebase

---

Interview Question

What is Responsive Web Design?

Answer

Responsive Web Design is the approach of creating websites that automatically adapt their layout and content to different screen sizes and devices.

---

# 2. Viewport

Always include

```html
<meta
name="viewport"
content="width=device-width, initial-scale=1.0">
```

Purpose

- Uses device width
- Prevents unwanted zooming behavior
- Enables responsive layouts

---

# 3. Mobile-First Design

Design starts for mobile screens.

Then progressively enhance for larger screens.

Example

```css
.card{

padding:15px;

}

@media(min-width:768px){

.card{

padding:30px;

}

}
```

---

Advantages

✔ Better Performance

✔ Cleaner CSS

✔ Recommended Approach

---

# 4. Desktop-First Design

Start with desktop.

Reduce styles for smaller devices.

```css
.card{

padding:40px;

}

@media(max-width:768px){

.card{

padding:20px;

}

}
```

---

Interview Question

Which approach is recommended?

Answer

Mobile-First.

---

# 5. Common Breakpoints

Small Mobile

```
320px
```

Large Mobile

```
480px
```

Tablet

```
768px
```

Laptop

```
1024px
```

Desktop

```
1200px
```

Large Desktop

```
1440px
```

Remember: These are common guidelines, not strict standards.

---

# 6. Media Queries

Syntax

```css
@media(condition){

selector{

property:value;

}

}
```

---

Example

```css
@media(max-width:768px){

body{

background:lightblue;

}

}
```

---

Minimum Width

```css
@media(min-width:768px)
```

Applies at 768px and above.

---

Maximum Width

```css
@media(max-width:768px)
```

Applies at 768px and below.

---

Range

```css
@media(min-width:768px) and (max-width:1024px)
```

Tablet only.

---

Interview Question

Difference between min-width and max-width?

Answer

min-width

↓

Styles apply above the specified width.

max-width

↓

Styles apply below the specified width.

---

# 7. Orientation

Portrait

```css
@media(orientation:portrait)
```

Landscape

```css
@media(orientation:landscape)
```

Useful for tablets and phones.

---

# 8. Responsive Units

Avoid fixed pixels everywhere.

Preferred

```
%

rem

em

vw

vh

fr

clamp()
```

---

Viewport Width

```css
width:80vw;
```

Viewport Height

```css
height:100vh;
```

---

Responsive Font

```css
font-size:

clamp(16px,2vw,32px);
```

---

# 9. Responsive Images

Bad

```css
img{

width:800px;

}
```

Good

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

loading="lazy"

src="image.jpg">
```

---

Responsive Images (HTML)

```html
<picture>

<source

media="(min-width:768px)"

srcset="large.jpg">

<img

src="small.jpg"

alt="Mountain">

</picture>
```

---

# 10. Responsive Typography

Instead of

```css
font-size:32px;
```

Use

```css
font-size:

clamp(1rem,3vw,2rem);
```

Benefits

✔ Readable on all screens

✔ No extra media queries

---

# 11. Responsive Layout

Flexbox Example

```css
.container{

display:flex;

flex-wrap:wrap;

gap:20px;

}

.card{

flex:1 1 250px;

}
```

---

Grid Example

```css
.container{

display:grid;

grid-template-columns:

repeat(auto-fit,

minmax(250px,1fr));

gap:20px;

}
```

---

# 12. CSS Performance Optimization

Reduce CSS Size

✔ Remove unused CSS

✔ Minify CSS

✔ Combine files when appropriate

---

Use Efficient Selectors

Prefer

```css
.card
```

Avoid

```css
body div ul li a span
```

---

Avoid Excessive Nesting

Good

```css
.card h2
```

Bad

```css
body main section div article .card h2
```

---

Avoid Excessive !important

Makes CSS difficult to maintain.

---

Animate Efficiently

Prefer

```
transform

opacity
```

Avoid animating

```
width

height

left

top
```

when smoother transform-based alternatives exist.

---

Reduce Repaints

Avoid unnecessary visual changes.

---

Reduce Reflows

Avoid repeatedly changing layout properties in quick succession.

---

Use CSS Variables

```css
:root{

--primary:#2563eb;

}
```

Improves maintainability.

---

# 13. Accessibility Best Practices

✔ Good color contrast

✔ Visible keyboard focus

✔ Don't rely on color alone

✔ Use readable font sizes

✔ Responsive layouts

✔ Large tap targets on touch devices

✔ Respect reduced motion

Example

```css
@media(prefers-reduced-motion:reduce){

*{

animation:none;

transition:none;

}

}
```

---

# Best Practices

✔ Mobile-first CSS

✔ Relative units

✔ Responsive images

✔ Flexbox/Grid

✔ CSS Variables

✔ Clamp typography

✔ Optimize animations

✔ Test on multiple devices

---

# Common Mistakes

❌ Fixed widths

❌ Fixed heights

❌ Tiny fonts

❌ Horizontal scrolling

❌ Huge images

❌ Ignoring landscape mode

❌ Too many media queries

❌ Not testing on mobile

---

# Frequently Asked Interview Questions

1. What is Responsive Web Design?

2. Why is Responsive Design important?

3. What is the viewport meta tag?

4. Difference between Mobile-First and Desktop-First?

5. Difference between min-width and max-width?

6. What are media queries?

7. What are common breakpoints?

8. Why use rem instead of px?

9. How do you make images responsive?

10. Difference between width:100% and max-width:100%?

11. How does the picture element work?

12. What is clamp()?

13. Why use Grid for responsive layouts?

14. Why use Flexbox?

15. Difference between Grid and Flexbox?

16. What causes reflow?

17. What causes repaint?

18. Which CSS properties should be animated?

19. Why avoid deep selectors?

20. Why use CSS variables?

21. How do you improve CSS performance?

22. What is lazy loading?

23. What is prefers-reduced-motion?

24. How do you avoid horizontal scrolling?

25. Why should websites be tested on multiple devices?

---

# Cheat Sheet

```css
/* Mobile First */

@media(min-width:768px){

}

/* Desktop First */

@media(max-width:768px){

}

/* Responsive Image */

img{

max-width:100%;

height:auto;

}

/* Responsive Typography */

font-size:

clamp(1rem,3vw,2rem);

/* Responsive Grid */

grid-template-columns:

repeat(auto-fit,

minmax(250px,1fr));

/* Responsive Flex */

flex:1 1 250px;

/* Reduced Motion */

@media(prefers-reduced-motion:reduce){

*{

animation:none;

transition:none;

}

}
```

---

# Memory Tricks

```
Mobile First

↓

min-width
```

```
Desktop First

↓

max-width
```

```
Responsive Image

↓

max-width:100%
```

```
Responsive Font

↓

clamp()
```

```
Performance

↓

transform

opacity
```

```
Layout

↓

Grid

Flexbox
```

---

# Quick Revision

- Responsive Web Design adapts layouts to different devices.
- Always include the viewport meta tag.
- Mobile-first design generally uses `min-width` media queries.
- Use relative units (`rem`, `%`, `vw`, `fr`) instead of fixed pixels where appropriate.
- Make images responsive with `max-width:100%` and `height:auto`.
- Use `clamp()` for responsive typography.
- Prefer Grid for page layouts and Flexbox for one-dimensional components.
- Optimize CSS by removing unused styles, minimizing deep selectors, and animating `transform` and `opacity`.
- Respect accessibility with proper contrast, keyboard focus, and `prefers-reduced-motion`.

---