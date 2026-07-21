# CSS Interview Guide
# Part 3 – CSS Flexbox (Complete)

> One of the Most Important Topics for Frontend Interviews

---

# Table of Contents

1. What is Flexbox?
2. Why Flexbox?
3. Flex Container vs Flex Items
4. Main Axis & Cross Axis
5. display: flex
6. flex-direction
7. justify-content
8. align-items
9. align-content
10. flex-wrap
11. gap
12. order
13. flex-grow
14. flex-shrink
15. flex-basis
16. flex Shorthand
17. align-self
18. Real World Layouts
19. Best Practices
20. Common Mistakes
21. Interview Questions
22. Cheat Sheet

---

# 1. What is Flexbox?

Flexbox stands for

Flexible Box Layout.

It is a one-dimensional layout system used to arrange items in a row or column.

Flexbox makes alignment and spacing easy.

---

# Why Flexbox?

Without Flexbox

❌ Difficult Centering

❌ Float Problems

❌ Complicated Layouts

With Flexbox

✔ Easy Centering

✔ Responsive

✔ Equal Heights

✔ Flexible Layouts

---

# Real Life Analogy

Imagine arranging books on a shelf.

You can

- Arrange horizontally
- Arrange vertically
- Leave equal space
- Center them
- Reverse order

That's exactly what Flexbox does.

---

# 2. Flex Container & Flex Items

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

display:flex;

}
```

Container

↓

Flex Container

Children

↓

Flex Items

---

# 3. Main Axis & Cross Axis

Default

```
Main Axis

--------------------->

Cross Axis

↓

↓

↓

```

Main Axis

Horizontal

Cross Axis

Vertical

When

```css
flex-direction:column;
```

They change.

```
↓

↓

↓

Main Axis

Cross Axis ---------->

```

---

Interview Question

What is Main Axis?

Answer

The direction in which flex items are placed.

---

# 4. display:flex

```css
.container{

display:flex;

}
```

Changes normal block layout into Flex Layout.

Children become flex items.

---

Example

Without Flex

```
1

2

3
```

With Flex

```
1 2 3
```

---

# 5. flex-direction

Controls direction.

---

Row

```css
flex-direction:row;
```

Default.

```
1 2 3
```

---

Row Reverse

```css
flex-direction:row-reverse;
```

```
3 2 1
```

---

Column

```css
flex-direction:column;
```

```
1

2

3
```

---

Column Reverse

```css
flex-direction:column-reverse;
```

```
3

2

1
```

---

Interview Question

Default flex-direction?

Answer

```
row
```

---

# 6. justify-content

Aligns items along the Main Axis.

---

flex-start

```css
justify-content:flex-start;
```

```
123
```

---

center

```css
justify-content:center;
```

```
   123
```

---

flex-end

```css
justify-content:flex-end;
```

```
      123
```

---

space-between

```css
justify-content:space-between;
```

```
1     2     3
```

---

space-around

```css
justify-content:space-around;
```

```
 1   2   3
```

Equal space around each item.

---

space-evenly

```css
justify-content:space-evenly;
```

Equal spacing everywhere.

---

Interview Question

Difference between

space-around

and

space-evenly?

Answer

space-around

Half space at edges.

space-evenly

Equal space everywhere.

---

# 7. align-items

Aligns items along the Cross Axis.

---

stretch

Default.

Items stretch.

---

center

```css
align-items:center;
```

Centers vertically.

---

flex-start

Top.

---

flex-end

Bottom.

---

baseline

Aligns text baselines.

---

Example

```css
.container{

display:flex;

align-items:center;

height:300px;

}
```

---

Interview Question

Difference between justify-content and align-items?

| justify-content | align-items |
|-----------------|-------------|
| Main Axis | Cross Axis |

---

# 8. align-content

Works only when

```
flex-wrap:wrap;
```

and there are multiple rows.

Controls spacing between rows.

Values

```
center

space-between

space-around

space-evenly

stretch
```

---

Interview Question

When does align-content work?

Answer

Only when there are multiple flex lines (wrapping).

---

# 9. flex-wrap

Default

```css
flex-wrap:nowrap;
```

Everything stays in one line.

---

Wrap

```css
flex-wrap:wrap;
```

Items move to next line.

---

Wrap Reverse

```css
flex-wrap:wrap-reverse;
```

Reverse wrapping.

---

# 10. gap

Adds spacing between items.

```css
gap:20px;
```

Row Gap

```css
row-gap:20px;
```

Column Gap

```css
column-gap:20px;
```

Preferred over using margins between flex items.

---

# 11. order

Changes visual order.

HTML

```html
<div>One</div>

<div>Two</div>

<div>Three</div>
```

CSS

```css
.two{

order:-1;

}
```

Display

```
Two

One

Three
```

Note: The DOM order remains unchanged.

---

# 12. flex-grow

Determines how much extra space an item receives.

Example

```css
.item{

flex-grow:1;

}
```

All items share space equally.

Example

```css
.one{

flex-grow:2;

}

.two{

flex-grow:1;

}
```

Item One

↓

Twice the available extra space.

---

# 13. flex-shrink

Controls shrinking.

Default

```css
flex-shrink:1;
```

No Shrink

```css
flex-shrink:0;
```

Useful

Logo

Profile Picture

Buttons

---

# 14. flex-basis

Initial size before growing or shrinking.

```css
flex-basis:200px;
```

Acts like starting width (or height in a column layout).

---

# 15. flex Shorthand

Instead of

```css
flex-grow:1;

flex-shrink:1;

flex-basis:200px;
```

Write

```css
flex:1 1 200px;
```

Format

```
flex:

grow

shrink

basis
```

---

# 16. align-self

Overrides align-items for one item.

```css
.item{

align-self:flex-end;

}
```

Only affects that specific item.

---

# 17. Real World Layouts

---

Navigation Bar

```css
nav{

display:flex;

justify-content:space-between;

align-items:center;

}
```

---

Center a Box

```css
body{

display:flex;

justify-content:center;

align-items:center;

min-height:100vh;

}
```

---

Equal Width Cards

```css
.card{

flex:1;

}
```

---

Responsive Cards

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

Sticky Footer Layout

```css
body{

display:flex;

flex-direction:column;

min-height:100vh;

}

main{

flex:1;

}
```

---

# Best Practices

✔ Use gap instead of margins.

✔ Prefer Flexbox for one-dimensional layouts.

✔ Use flex-wrap for responsiveness.

✔ Use align-items:center for vertical alignment.

✔ Keep HTML order logical even if using order.

✔ Avoid excessive nesting.

---

# Common Mistakes

❌ Confusing justify-content with align-items.

❌ Forgetting display:flex.

❌ Using align-content without wrapping.

❌ Overusing order.

❌ Using margins instead of gap.

❌ Not considering accessibility when changing visual order.

---

# Frequently Asked Interview Questions

1. What is Flexbox?

2. Why use Flexbox?

3. Difference between Flexbox and Grid?

4. What is Main Axis?

5. What is Cross Axis?

6. Default flex-direction?

7. Difference between justify-content and align-items?

8. Difference between align-items and align-content?

9. Difference between flex-grow and flex-shrink?

10. What is flex-basis?

11. What is flex shorthand?

12. What is order?

13. What is gap?

14. Difference between nowrap and wrap?

15. How do you center a div using Flexbox?

Answer

```css
display:flex;

justify-content:center;

align-items:center;
```

16. When should you use Flexbox?

Answer

Use Flexbox for one-dimensional layouts (rows or columns), such as navigation bars, card rows, button groups, and centering content.

17. When should you use Grid instead?

Answer

Use Grid for two-dimensional layouts where you need to control both rows and columns.

---

# Flexbox Cheat Sheet

```css
display:flex;

flex-direction:row;

justify-content:center;

align-items:center;

align-content:center;

flex-wrap:wrap;

gap:20px;

order:1;

flex-grow:1;

flex-shrink:1;

flex-basis:200px;

flex:1 1 200px;

align-self:flex-end;
```

---

# Memory Tricks

```
display:flex

↓

Enable Flexbox
```

```
flex-direction

↓

Direction
```

```
justify-content

↓

Main Axis
```

```
align-items

↓

Cross Axis
```

```
gap

↓

Spacing
```

```
flex-grow

↓

Expand
```

```
flex-shrink

↓

Shrink
```

```
order

↓

Visual Position
```

---

# Quick Revision

- Flexbox is a **one-dimensional** layout system.
- `display:flex` creates a flex container.
- `justify-content` aligns items on the **main axis**.
- `align-items` aligns items on the **cross axis**.
- `align-content` works only with **multiple wrapped rows**.
- `gap` is the preferred way to space flex items.
- `flex-grow` distributes extra space.
- `flex-shrink` controls shrinking.
- `flex-basis` sets the initial size.
- `flex: grow shrink basis` is the shorthand.
- Use **Flexbox for rows and columns**, and **Grid for complex two-dimensional layouts**.

---