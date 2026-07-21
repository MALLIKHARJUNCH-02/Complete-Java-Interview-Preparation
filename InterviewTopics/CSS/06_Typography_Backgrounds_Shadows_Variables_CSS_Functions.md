# CSS Interview Guide
# Part 6 – Typography, Backgrounds, Shadows, Variables & CSS Functions

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Typography
2. Font Properties
3. Text Properties
4. Background Properties
5. Gradients
6. Multiple Backgrounds
7. Border Properties
8. Border Image
9. Box Shadow
10. Text Shadow
11. CSS Variables
12. CSS Functions
13. Best Practices
14. Common Mistakes
15. Interview Questions
16. Cheat Sheet

---

# 1. Typography

Typography is the art of displaying text in a readable and visually appealing way.

Good typography improves

✔ Readability

✔ Accessibility

✔ User Experience

✔ Professional Appearance

---

# 2. Font Properties

## font-family

Specifies the font.

```css
body{
    font-family:Arial, Helvetica, sans-serif;
}
```

Always provide fallback fonts.

Example

```
Arial

↓

Helvetica

↓

sans-serif
```

---

## Generic Font Families

```
serif

sans-serif

monospace

cursive

fantasy
```

---

Interview Question

Why should multiple fonts be specified?

Answer

If the first font isn't available, the browser uses the next available font.

---

## font-size

```css
font-size:16px;
```

Other Units

```css
font-size:1rem;

font-size:2em;

font-size:2vw;
```

---

## font-weight

```css
font-weight:400;

font-weight:700;
```

Common Values

```
100 Thin

200 Extra Light

300 Light

400 Normal

500 Medium

600 Semi Bold

700 Bold

800 Extra Bold

900 Black
```

---

## font-style

```css
font-style:italic;
```

Values

```
normal

italic

oblique
```

---

## font-variant

```css
font-variant:small-caps;
```

Output

```
Hello World

↓

HELLO WORLD
```

Small caps style.

---

## line-height

Controls space between lines.

```css
line-height:1.6;
```

Preferred

Use unitless values.

---

Interview Question

Why use line-height?

Answer

Improves readability by increasing spacing between lines.

---

## letter-spacing

Space between characters.

```css
letter-spacing:2px;
```

---

## word-spacing

Space between words.

```css
word-spacing:10px;
```

---

## font Shorthand

Instead of

```css
font-style:italic;

font-weight:700;

font-size:20px;

line-height:1.5;

font-family:Arial;
```

Write

```css
font:italic 700 20px/1.5 Arial, sans-serif;
```

---

# 3. Text Properties

---

## text-align

```css
text-align:center;
```

Values

```
left

right

center

justify
```

---

## text-transform

```css
text-transform:uppercase;
```

Values

```
uppercase

lowercase

capitalize
```

---

## text-decoration

```css
text-decoration:none;
```

Common Uses

Remove underline

```css
a{
    text-decoration:none;
}
```

Underline

```css
text-decoration:underline;
```

---

## text-indent

```css
text-indent:40px;
```

Indents first line.

---

## text-overflow

```css
text-overflow:ellipsis;
```

Used with

```css
overflow:hidden;

white-space:nowrap;
```

Output

```
Very Long Text...
```

---

## white-space

```css
white-space:nowrap;
```

Values

```
normal

nowrap

pre

pre-wrap
```

---

## word-break

```css
word-break:break-word;
```

Modern alternative

```css
overflow-wrap:anywhere;
```

---

## text-shadow

```css
text-shadow:

2px

2px

5px

gray;
```

Format

```
X

Y

Blur

Color
```

---

Interview Question

Difference between text-shadow and box-shadow?

Answer

text-shadow

↓

Text

box-shadow

↓

Entire Element

---

# 4. Background Properties

---

## background-color

```css
background-color:lightblue;
```

---

## background-image

```css
background-image:

url(image.jpg);
```

---

## background-repeat

```css
background-repeat:no-repeat;
```

Values

```
repeat

repeat-x

repeat-y

no-repeat
```

---

## background-size

```css
background-size:cover;
```

Values

```
cover

contain

100%

200px
```

---

## background-position

```css
background-position:center;
```

Examples

```
top

bottom

left

right

center
```

---

## background-attachment

```css
background-attachment:fixed;
```

Creates parallax-like effects.

---

## background Shorthand

```css
background:

black

url(bg.jpg)

center

cover

no-repeat;
```

---

# 5. Gradients

Linear Gradient

```css
background:

linear-gradient(

red,

blue);
```

---

Direction

```css
linear-gradient(

to right,

red,

blue);
```

---

Radial Gradient

```css
background:

radial-gradient(

red,

yellow);
```

---

Conic Gradient

```css
background:

conic-gradient(

red,

blue,

green);
```

---

Interview Question

Why use gradients?

Answer

To create visually appealing backgrounds without image files.

---

# 6. Multiple Backgrounds

```css
background:

url(stars.png),

url(bg.jpg);
```

The first image is drawn on top of the next one.

---

# 7. Border Properties

```css
border:

2px

solid

black;
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

# 8. Border Image

```css
border-image:

url(border.png)

30

stretch;
```

Values

```
stretch

repeat

round
```

Rarely used but useful to know.

---

# 9. Box Shadow

```css
box-shadow:

0

5px

15px

gray;
```

Format

```
Horizontal

Vertical

Blur

Spread

Color
```

---

Inset Shadow

```css
box-shadow:

inset

0

0

10px

gray;
```

---

Multiple Shadows

```css
box-shadow:

0 2px 5px gray,

0 8px 20px black;
```

---

# 10. Text Shadow

```css
text-shadow:

2px

2px

5px

black;
```

Common Uses

✔ Logos

✔ Hero Titles

✔ Glow Effects

---

# 11. CSS Variables

Create Variable

```css
:root{

--primary:#2563eb;

}
```

Use Variable

```css
button{

background:

var(--primary);

}
```

---

Update Variable

```css
.card{

--primary:red;

}
```

Variables follow CSS inheritance rules.

---

Advantages

✔ Reusable

✔ Easy Theme Changes

✔ Less Repetition

✔ Dark Mode Support

---

Interview Question

Why use CSS Variables?

Answer

To centralize reusable values, simplify maintenance, and support theming.

---

# 12. CSS Functions

---

## calc()

```css
width:

calc(100% - 100px);
```

Performs calculations.

---

## min()

```css
width:

min(500px,100%);
```

Chooses the smaller value.

---

## max()

```css
width:

max(300px,50%);
```

Chooses the larger value.

---

## clamp()

```css
font-size:

clamp(

16px,

3vw,

32px);
```

Meaning

Minimum

↓

Preferred

↓

Maximum

Great for responsive typography.

---

Interview Question

Difference between

calc()

and

clamp()?

Answer

calc()

Performs arithmetic.

clamp()

Keeps a value within minimum and maximum limits.

---

# Real World Examples

## Hero Heading

```css
.hero h1{

font-size:

clamp(2rem,5vw,4rem);

}
```

---

## Card Shadow

```css
.card{

box-shadow:

0 10px 25px

rgba(0,0,0,.15);

}
```

---

## Responsive Background

```css
.hero{

background:

linear-gradient(

to right,

#2563eb,

#9333ea);

}
```

---

## Theme Colors

```css
:root{

--primary:#0ea5e9;

--secondary:#9333ea;

}
```

---

# Best Practices

✔ Use rem for typography.

✔ Use CSS variables.

✔ Prefer gradients over heavy images when appropriate.

✔ Use subtle shadows.

✔ Maintain good color contrast.

✔ Use clamp() for responsive font sizes.

✔ Always define fallback fonts.

---

# Common Mistakes

❌ Using too many fonts.

❌ Excessive shadows.

❌ Low text contrast.

❌ Fixed font sizes everywhere.

❌ Overusing uppercase.

❌ Not using CSS variables.

❌ Huge background images without optimization.

---

# Frequently Asked Interview Questions

1. What is typography?

2. Difference between serif and sans-serif?

3. Difference between px, em and rem?

4. Why use line-height?

5. Difference between letter-spacing and word-spacing?

6. Difference between text-shadow and box-shadow?

7. Difference between cover and contain?

8. Difference between linear-gradient and radial-gradient?

9. What are CSS Variables?

10. Where should CSS variables be declared?

11. What is var()?

12. What is calc()?

13. Difference between min(), max() and clamp()?

14. Why is clamp() useful?

15. What is background shorthand?

16. How do multiple backgrounds work?

17. How do you create a circular image?

18. Why should fallback fonts be provided?

19. What is font shorthand?

20. What is the difference between text-align:center and margin:auto?

Answer

`text-align:center` centers **inline content** inside a container.

`margin:auto` centers a **block-level element** horizontally (when it has a defined width).

---

# Cheat Sheet

```css
font-family:Arial, sans-serif;

font-size:1rem;

font-weight:700;

line-height:1.5;

letter-spacing:1px;

word-spacing:5px;

text-align:center;

text-transform:uppercase;

text-decoration:none;

text-shadow:2px 2px 5px gray;

background-color:#fff;

background-image:url(bg.jpg);

background-size:cover;

background-position:center;

background-repeat:no-repeat;

background:linear-gradient(#2563eb,#9333ea);

border-radius:10px;

box-shadow:0 10px 20px rgba(0,0,0,.15);

:root{
  --primary:#2563eb;
}

color:var(--primary);

width:calc(100% - 40px);

width:min(500px,100%);

width:max(300px,50%);

font-size:clamp(16px,3vw,32px);
```

---

# Memory Tricks

```
font-family
↓

Font Type
```

```
line-height
↓

Line Spacing
```

```
letter-spacing
↓

Character Gap
```

```
word-spacing
↓

Word Gap
```

```
box-shadow
↓

Element Shadow
```

```
text-shadow
↓

Text Shadow
```

```
CSS Variables
↓

Reusable Values
```

```
calc()
↓

Math
```

```
clamp()
↓

Responsive Limit
```

---

# Quick Revision

- Typography controls the appearance and readability of text.
- Use fallback fonts in `font-family`.
- Prefer `rem` and `clamp()` for responsive typography.
- `text-align` aligns inline content; `margin:auto` centers block elements.
- Gradients provide image-free backgrounds.
- `box-shadow` styles elements; `text-shadow` styles text.
- CSS variables (`--name`) improve maintainability and theming.
- `calc()` performs calculations; `min()`, `max()`, and `clamp()` create flexible responsive values.
- Keep shadows subtle and ensure sufficient color contrast for accessibility.

---