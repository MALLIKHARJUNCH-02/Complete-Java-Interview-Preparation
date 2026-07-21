# CSS Interview Guide
# Part 2 – Box Model, Display, Position & Overflow

---

# Table of Contents

1. CSS Box Model
2. Width & Height
3. Margin
4. Padding
5. Border
6. Outline
7. box-sizing
8. Display Property
9. Visibility
10. Overflow
11. Position Property
12. z-index
13. Best Practices
14. Common Mistakes
15. Interview Questions
16. Quick Revision

---

# 1. CSS Box Model

Every HTML element is treated as a rectangular box.

```
+---------------------------------------+
|               Margin                  |
|   +-------------------------------+   |
|   |           Border              |   |
|   |  +-------------------------+  |   |
|   |  |        Padding          |  |   |
|   |  |  +-------------------+  |  |   |
|   |  |  |     Content       |  |  |   |
|   |  |  +-------------------+  |  |   |
|   |  +-------------------------+  |   |
|   +-------------------------------+   |
+---------------------------------------+
```

The four parts are

- Content
- Padding
- Border
- Margin

---

# Real-Life Example

Think of sending a gift.

```
Gift
↓

Bubble Wrap

↓

Gift Box

↓

Space Around Box
```

Mapping

Gift → Content

Bubble Wrap → Padding

Gift Box → Border

Space Around Box → Margin

---

# 2. Width and Height

```css
div{

width:300px;

height:200px;

}
```

Controls content size only (by default).

---

Minimum Width

```css
min-width:200px;
```

Maximum Width

```css
max-width:800px;
```

Minimum Height

```css
min-height:100px;
```

Maximum Height

```css
max-height:500px;
```

---

Interview Question

Difference between width and max-width?

width

Always fixed.

max-width

Allows shrinking on smaller screens.

Preferred for responsive design.

---

# 3. Margin

Margin creates space outside the border.

```css
margin:20px;
```

---

Individual Sides

```css
margin-top:10px;

margin-right:20px;

margin-bottom:30px;

margin-left:40px;
```

---

Shorthand

```css
margin:20px;
```

All sides.

```css
margin:20px 40px;
```

Top-Bottom

Left-Right

```css
margin:10px 20px 30px;
```

Top

Left-Right

Bottom

```css
margin:10px 20px 30px 40px;
```

Top

Right

Bottom

Left

---

Auto Margin

```css
margin:auto;
```

Centers block elements horizontally when width is specified.

Example

```css
div{

width:400px;

margin:auto;

}
```

---

Negative Margin

```css
margin-top:-20px;
```

Moves elements closer.

Use carefully.

---

Interview Question

Can margin be negative?

Answer

Yes.

Padding cannot be negative.

---

# 4. Padding

Padding creates space inside the border.

```css
padding:20px;
```

---

Individual Sides

```css
padding-top:10px;

padding-right:20px;

padding-bottom:30px;

padding-left:40px;
```

---

Padding Shorthand

```css
padding:20px;
```

```css
padding:20px 30px;
```

```css
padding:10px 20px 30px;
```

```css
padding:10px 20px 30px 40px;
```

---

Interview Question

Difference between margin and padding?

| Margin | Padding |
|---------|----------|
| Outside Border | Inside Border |
| Can be Negative | Cannot be Negative |
| Transparent Area | Background Extends Into It |

---

# 5. Border

Border surrounds the padding.

Syntax

```css
border:2px solid black;
```

Three parts

```
Width

Style

Color
```

---

Border Styles

```css
solid

dashed

dotted

double

groove

ridge

inset

outset

none
```

---

Border Radius

```css
border-radius:10px;
```

Circle

```css
border-radius:50%;
```

---

Individual Borders

```css
border-top:

border-right:

border-bottom:

border-left:
```

---

Interview Question

How do you create a circle?

Answer

```css
width:100px;

height:100px;

border-radius:50%;
```

---

# 6. Outline

Outline appears outside the border.

```css
outline:3px solid blue;
```

Difference

| Border | Outline |
|----------|-----------|
| Takes Space | Doesn't Affect Layout |
| Around Element | Outside Border |
| Rounded | Doesn't Follow Border Radius in the Same Way Across Browsers |

---

Outline Offset

```css
outline-offset:5px;
```

---

Interview Question

When should outline be used?

Answer

For focus indicators to improve accessibility.

---

# 7. box-sizing

Default

```css
box-sizing:content-box;
```

Width excludes padding and border.

Example

```css
width:200px;

padding:20px;

border:10px solid;
```

Actual rendered width becomes larger than 200px.

---

Better

```css
box-sizing:border-box;
```

Now

```
Total Width

=

200px
```

Padding and border are included.

---

Recommended

```css
*{

box-sizing:border-box;

}
```

---

Interview Question

Why use border-box?

Answer

It makes layouts easier because declared width already includes padding and border.

---

# 8. Display Property

Controls how an element is displayed.

---

display:block

Starts on new line.

Takes full width.

Examples

```
div

p

section

article

header
```

---

display:inline

No new line.

Only required width.

Examples

```
span

strong

em

a
```

---

display:inline-block

Behaves like inline.

Allows

✔ Width

✔ Height

✔ Padding

✔ Margin

---

Example

```css
button{

display:inline-block;

}
```

---

display:none

```css
display:none;
```

Element is removed from layout.

Browser behaves as if it doesn't exist.

---

Interview Question

Difference between display:none and visibility:hidden?

| display:none | visibility:hidden |
|---------------|-------------------|
| Removed from Layout | Space Reserved |
| Invisible | Invisible |
| No Space | Keeps Space |

---

# 9. Visibility

Visible

```css
visibility:visible;
```

Hidden

```css
visibility:hidden;
```

Invisible but still occupies space.

---

# 10. Overflow

Controls extra content.

---

Visible

```css
overflow:visible;
```

Default.

---

Hidden

```css
overflow:hidden;
```

Cuts extra content.

---

Scroll

```css
overflow:scroll;
```

Always shows scrollbars.

---

Auto

```css
overflow:auto;
```

Scrollbars appear only when needed.

---

Horizontal

```css
overflow-x:auto;
```

Vertical

```css
overflow-y:auto;
```

---

Interview Question

Difference between overflow:hidden and display:none?

overflow:hidden

Element exists.

Extra content is clipped.

display:none

Entire element is removed from layout.

---

# 11. Position Property

Controls element positioning.

Five values

```
static

relative

absolute

fixed

sticky
```

---

## static

Default.

```css
position:static;
```

Ignores top, left, right, bottom.

---

## relative

Moves relative to original position.

```css
position:relative;

top:20px;

left:30px;
```

Space is still reserved.

---

## absolute

Moves relative to nearest positioned ancestor.

```css
position:absolute;

top:0;

right:0;
```

Removed from normal document flow.

---

Example

```css
.parent{

position:relative;

}

.child{

position:absolute;

top:10px;

right:10px;

}
```

---

## fixed

Fixed relative to browser viewport.

```css
position:fixed;

bottom:20px;

right:20px;
```

Common Uses

- Chat Button
- Back to Top
- Floating Action Button

---

## sticky

Acts like relative until a scroll threshold is reached, then behaves like fixed.

```css
position:sticky;

top:0;
```

Common Uses

- Sticky Navigation Bar
- Sticky Table Header

---

Interview Question

Difference between relative and absolute?

| Relative | Absolute |
|-----------|----------|
| Moves from Original Position | Moves Relative to Nearest Positioned Ancestor |
| Space Reserved | Removed from Flow |

---

Interview Question

Difference between fixed and sticky?

Fixed

Always fixed in viewport.

Sticky

Becomes fixed only after scrolling reaches the specified threshold.

---

# 12. z-index

Controls stacking order.

Higher value appears above lower value.

Example

```css
.box1{

z-index:1;

}

.box2{

z-index:100;

}
```

Important

Works on positioned elements (or other stacking context scenarios).

---

Example

```
z-index:100

↓

Modal

----------------

z-index:10

↓

Navbar

----------------

z-index:1

↓

Content
```

---

Interview Question

Why isn't z-index working?

Possible reasons

- Element isn't positioned.
- Different stacking contexts.
- Parent stacking context limits child.

---

# Best Practices

✔ Use box-sizing:border-box.

✔ Prefer max-width for responsive layouts.

✔ Keep nesting shallow.

✔ Use sticky for navigation.

✔ Use display:flex or grid for layouts (covered later).

✔ Avoid unnecessary absolute positioning.

✔ Use outline for keyboard focus.

✔ Keep z-index values organized.

---

# Common Mistakes

❌ Using margin for internal spacing.

❌ Using padding for external spacing.

❌ Forgetting border-box.

❌ Overusing absolute positioning.

❌ Using large random z-index values.

❌ Hiding important content with display:none when it should remain accessible.

---

# Frequently Asked Interview Questions

1. Explain the CSS Box Model.
2. Difference between margin and padding?
3. Can margin be negative?
4. Can padding be negative?
5. Difference between border and outline?
6. Why use box-sizing:border-box?
7. Difference between block, inline and inline-block?
8. Difference between display:none and visibility:hidden?
9. Difference between overflow:hidden and overflow:auto?
10. Difference between static, relative, absolute, fixed and sticky?
11. Difference between relative and absolute?
12. Difference between fixed and sticky?
13. Why isn't z-index working?
14. Difference between width and max-width?
15. How do you center a block element horizontally?

---

# Quick Revision

- Box Model = Content → Padding → Border → Margin.
- Margin creates outside spacing; padding creates inside spacing.
- Border surrounds padding; outline sits outside the border.
- `box-sizing:border-box` simplifies sizing calculations.
- `display:block` takes full width; `inline` takes only required width; `inline-block` supports width and height while flowing inline.
- `display:none` removes the element from the layout; `visibility:hidden` hides it but preserves its space.
- `overflow:auto` adds scrollbars only when necessary.
- `relative` positions from the original location.
- `absolute` positions relative to the nearest positioned ancestor.
- `fixed` stays attached to the viewport.
- `sticky` switches from normal flow to fixed behavior after reaching a scroll position.
- `z-index` controls stacking order and typically requires a positioned element.

---