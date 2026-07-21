# CSS Interview Guide
# Part 4 – CSS Grid (Complete)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Introduction to CSS Grid
2. Why CSS Grid?
3. Grid Container & Grid Items
4. Grid Lines
5. Rows & Columns
6. display:grid
7. grid-template-columns
8. grid-template-rows
9. fr Unit
10. repeat()
11. minmax()
12. gap
13. justify-items
14. align-items
15. place-items
16. justify-content
17. align-content
18. place-content
19. grid-column
20. grid-row
21. grid-area
22. auto-fit vs auto-fill
23. Responsive Grid
24. Grid vs Flexbox
25. Real World Examples
26. Best Practices
27. Common Mistakes
28. Interview Questions
29. Cheat Sheet

---

# 1. What is CSS Grid?

CSS Grid is a **two-dimensional layout system**.

Unlike Flexbox, Grid can control

✔ Rows

✔ Columns

at the same time.

---

# Real-Life Analogy

Imagine a chessboard.

```
+---+---+---+

|   |   |   |

+---+---+---+

|   |   |   |

+---+---+---+

|   |   |   |

+---+---+---+
```

Each square is a grid cell.

---

# Why Grid?

Without Grid

❌ Difficult Dashboard Layout

❌ Nested Flexboxes

❌ Complicated CSS

With Grid

✔ Simple

✔ Responsive

✔ Powerful

✔ Clean

---

# 2. Grid Container

HTML

```html
<div class="container">

<div>1</div>

<div>2</div>

<div>3</div>

</div>
```

CSS

```css
.container{

display:grid;

}
```

Container

↓

Grid Container

Children

↓

Grid Items

---

# 3. Grid Lines

```
1     2     3     4

|-----|-----|-----|

|     |     |     |

|-----|-----|-----|

|     |     |     |

|-----|-----|-----|

```

Every row and column has numbered lines.

Grid items are placed between these lines.

---

# 4. Rows & Columns

Columns

↓

Vertical

Rows

↓

Horizontal

---

# 5. display:grid

```css
.container{

display:grid;

}
```

Creates a grid container.

---

# 6. grid-template-columns

Defines columns.

```css
grid-template-columns:200px 200px 200px;
```

Output

```
+200+200+200+
```

---

Equal Columns

```css
grid-template-columns:1fr 1fr 1fr;
```

---

Two Columns

```css
grid-template-columns:300px auto;
```

---

Interview Question

Difference between px and fr?

px

Fixed.

fr

Flexible.

---

# 7. grid-template-rows

Defines row height.

```css
grid-template-rows:100px 200px;
```

---

# 8. fr Unit

fr

↓

Fraction of available space.

Example

```css
grid-template-columns:

1fr 2fr 1fr;
```

Layout

```
25%

50%

25%
```

---

Interview Question

Why use fr instead of px?

Because fr creates flexible responsive layouts.

---

# 9. repeat()

Instead of

```css
1fr 1fr 1fr 1fr
```

Write

```css
repeat(4,1fr)
```

---

Another Example

```css
repeat(3,200px)
```

---

# 10. minmax()

Sets minimum and maximum size.

```css
minmax(200px,1fr)
```

Meaning

Minimum

↓

200px

Maximum

↓

1 Fraction

---

Responsive Example

```css
grid-template-columns:

repeat(3,minmax(200px,1fr));
```

---

# 11. gap

Space between rows and columns.

```css
gap:20px;
```

---

Row Gap

```css
row-gap:20px;
```

---

Column Gap

```css
column-gap:20px;
```

---

# 12. justify-items

Aligns items horizontally inside each grid cell.

```css
justify-items:center;
```

Values

```
start

center

end

stretch
```

---

# 13. align-items

Aligns items vertically.

```css
align-items:center;
```

---

# 14. place-items

Shortcut

```css
place-items:center;
```

Equals

```css
justify-items:center;

align-items:center;
```

---

# 15. justify-content

Moves the entire grid horizontally.

```css
justify-content:center;
```

Values

```
start

center

end

space-between

space-around

space-evenly
```

---

# 16. align-content

Moves the entire grid vertically.

```css
align-content:center;
```

---

# 17. place-content

Shortcut

```css
place-content:center;
```

Equivalent to

```css
justify-content:center;

align-content:center;
```

---

# 18. grid-column

Span multiple columns.

```css
grid-column:1 / 3;
```

Meaning

Starts at line 1

Ends at line 3

Occupies 2 columns.

---

Span Syntax

```css
grid-column:span 2;
```

---

# 19. grid-row

Occupy rows.

```css
grid-row:1 / 3;
```

---

# 20. grid-area

Shortcut

```css
grid-area:

row-start

column-start

row-end

column-end;
```

Example

```css
grid-area:

1

1

3

3;
```

---

Named Areas

```css
.container{

grid-template-areas:

"header header"

"menu content"

"footer footer";

}
```

Assign

```css
.header{

grid-area:header;

}
```

---

# 21. auto-fit vs auto-fill

Very Common Interview Question

---

auto-fit

Empty columns collapse.

```css
repeat(auto-fit,

minmax(250px,1fr))
```

---

auto-fill

Empty columns remain.

```css
repeat(auto-fill,

minmax(250px,1fr))
```

---

Interview Answer

auto-fit

↓

Stretches existing items.

auto-fill

↓

Keeps empty tracks.

---

# 22. Responsive Grid

Best Practice

```css
.container{

display:grid;

grid-template-columns:

repeat(auto-fit,

minmax(250px,1fr));

gap:20px;

}
```

Automatically adjusts based on screen width.

---

# 23. Grid vs Flexbox

| Grid | Flexbox |
|------|----------|
| Two Dimensional | One Dimensional |
| Rows + Columns | Row OR Column |
| Complex Layouts | Components |
| Dashboard | Navbar |
| Gallery | Buttons |

---

Interview Question

When should you use Grid?

Answer

When you need to control both rows and columns.

---

# 24. Real World Examples

---

Photo Gallery

```css
.gallery{

display:grid;

grid-template-columns:

repeat(auto-fit,

minmax(250px,1fr));

gap:20px;

}
```

---

Dashboard

```css
.container{

display:grid;

grid-template-columns:

250px 1fr;

}
```

---

Pricing Cards

```css
.cards{

display:grid;

grid-template-columns:

repeat(3,1fr);

gap:20px;

}
```

---

Admin Panel

```
+------------------------+

Sidebar | Content

|

|

+------------------------+
```

Grid

```css
250px 1fr
```

---

Magazine Layout

```
Headline

Image

Content

Ads
```

Grid makes this simple.

---

# Best Practices

✔ Use Grid for layouts.

✔ Use Flexbox inside components.

✔ Use gap.

✔ Use auto-fit.

✔ Prefer fr units.

✔ Use minmax().

✔ Keep layouts responsive.

---

# Common Mistakes

❌ Using Grid for simple button alignment.

❌ Mixing Grid and absolute positioning unnecessarily.

❌ Forgetting gap.

❌ Fixed pixel layouts everywhere.

❌ Overcomplicated grid definitions.

---

# Frequently Asked Interview Questions

1. What is CSS Grid?

2. Difference between Grid and Flexbox?

3. What is Grid Container?

4. What is Grid Item?

5. What is fr unit?

6. What is repeat()?

7. What is minmax()?

8. Difference between auto-fit and auto-fill?

9. Difference between justify-items and justify-content?

10. Difference between align-items and align-content?

11. What is place-items?

12. What is place-content?

13. What is grid-area?

14. What is grid-column?

15. What is grid-row?

16. Why use Grid instead of floats?

17. How do you build a responsive card layout with Grid?

18. Can Grid replace Flexbox?

Answer

No.

Grid and Flexbox complement each other.

Grid handles page layouts.

Flexbox handles alignment inside components.

---

# CSS Grid Cheat Sheet

```css
display:grid;

grid-template-columns:repeat(3,1fr);

grid-template-rows:100px auto;

gap:20px;

justify-items:center;

align-items:center;

place-items:center;

justify-content:center;

align-content:center;

place-content:center;

grid-column:span 2;

grid-row:span 2;

grid-area:1/1/3/3;
```

---

# Memory Tricks

```
display:grid

↓

Enable Grid
```

```
grid-template-columns

↓

Columns
```

```
grid-template-rows

↓

Rows
```

```
fr

↓

Flexible Width
```

```
repeat()

↓

Avoid Repetition
```

```
minmax()

↓

Responsive Size
```

```
gap

↓

Spacing
```

```
auto-fit

↓

Stretch Items
```

```
auto-fill

↓

Keep Empty Tracks
```

---

# Quick Revision

- CSS Grid is a **two-dimensional layout system**.
- `display:grid` creates a grid container.
- `grid-template-columns` defines columns.
- `grid-template-rows` defines rows.
- `fr` divides available space proportionally.
- `repeat()` reduces repetitive code.
- `minmax()` creates responsive tracks with minimum and maximum sizes.
- `gap` adds spacing between rows and columns.
- `grid-column` and `grid-row` let items span multiple tracks.
- `grid-area` can place items by coordinates or named template areas.
- `auto-fit` collapses empty tracks; `auto-fill` preserves them.
- Use **Grid for page layouts** and **Flexbox for one-dimensional component layouts**.

---