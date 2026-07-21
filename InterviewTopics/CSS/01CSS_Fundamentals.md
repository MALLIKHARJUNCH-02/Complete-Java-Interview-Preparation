# CSS Interview Guide
# Part 1 – CSS Fundamentals

> Complete Beginner to Advanced Interview Handbook

---

# Table of Contents

1. Introduction to CSS
2. History of CSS
3. Why CSS?
4. Advantages
5. Disadvantages
6. CSS Syntax
7. CSS Comments
8. CSS Types
9. CSS Selectors
10. Colors
11. Units
12. CSS Cascade
13. Inheritance
14. Best Practices
15. Common Mistakes
16. Interview Questions
17. Quick Revision

---

# 1. Introduction to CSS

## Definition

CSS stands for

**Cascading Style Sheets**

CSS is used to style HTML documents.

HTML creates the structure.

CSS makes the webpage beautiful.

---

## Example

Without CSS

```html
<h1>Hello</h1>
```

Output

```
Black Text
White Background
Default Browser Style
```

With CSS

```html
<style>

h1{

color:red;

font-size:40px;

}

</style>
```

Output

```
Red Heading
Large Font
```

---

# Real Life Analogy

Imagine building a house.

HTML

↓

Structure

CSS

↓

Paint

Furniture

Decoration

JavaScript

↓

Electricity

Doors

Smart Devices

---

# 2. History of CSS

| Version | Year | Features |
|----------|------|----------|
| CSS1 | 1996 | Basic Styling |
| CSS2 | 1998 | Positioning |
| CSS2.1 | 2011 | Bug Fixes |
| CSS3 | Modular | Flexbox, Grid, Animations, Variables |

---

Interview Question

Who developed CSS?

Answer

Håkon Wium Lie proposed CSS in 1994.

---

# 3. Why CSS?

Without CSS

✔ No Colors

✔ No Layout

✔ No Responsive Design

✔ No Animations

✔ No Beautiful UI

---

CSS provides

✔ Colors

✔ Fonts

✔ Spacing

✔ Layout

✔ Animations

✔ Responsive Design

---

# 4. Advantages

✔ Easy Styling

✔ Reusable

✔ Faster Development

✔ Better User Experience

✔ Responsive Design

✔ Smaller HTML

✔ Easy Maintenance

---

# 5. Disadvantages

Large CSS files can become difficult to maintain if not organized.

Browser support may differ for some newer features.

Poor CSS organization can make debugging harder.

---

# 6. CSS Syntax

```css
selector{

property:value;

}
```

Example

```css
h1{

color:red;

font-size:40px;

}
```

---

Syntax Breakdown

```
h1

↓

Selector

color

↓

Property

red

↓

Value
```

---

Interview Question

What is a CSS Rule?

Answer

A selector together with its declarations.

Example

```css
p{

color:blue;

}
```

---

# 7. CSS Comments

```css
/*

This is a CSS Comment

*/
```

Comments are ignored by the browser.

---

# 8. Types of CSS

There are three ways to apply CSS.

---

## Inline CSS

```html
<h1 style="color:red;">

Hello

</h1>
```

Advantages

Simple for quick testing.

Disadvantages

Not reusable.

Hard to maintain.

---

## Internal CSS

```html
<style>

h1{

color:red;

}

</style>
```

Inside

```
<head>
```

---

## External CSS

HTML

```html
<link

rel="stylesheet"

href="style.css">
```

style.css

```css
h1{

color:red;

}
```

---

Interview Question

Which type of CSS is recommended?

Answer

External CSS.

Reason

Reusable

Maintainable

Cacheable

Cleaner HTML

---

# 9. CSS Selectors

Selectors choose which HTML elements should receive styles.

---

## Universal Selector

```css
*{

margin:0;

padding:0;

}
```

Selects every element.

---

## Element Selector

```css
h1{

color:red;

}
```

---

## Class Selector

HTML

```html
<p class="error">

Invalid

</p>
```

CSS

```css
.error{

color:red;

}
```

---

## ID Selector

HTML

```html
<h1 id="title">

Hello

</h1>
```

CSS

```css
#title{

color:blue;

}
```

---

## Group Selector

```css
h1,p,button{

font-family:Arial;

}
```

---

## Descendant Selector

```css
div p{

color:red;

}
```

Selects

All paragraphs inside div.

---

## Child Selector

```css
div > p{

color:red;

}
```

Only direct children.

---

## Adjacent Sibling Selector

```css
h1 + p{

color:blue;

}
```

First paragraph immediately after h1.

---

## General Sibling Selector

```css
h1 ~ p{

color:green;

}
```

All paragraphs after h1.

---

## Attribute Selector

```css
input[type="text"]{

border:1px solid red;

}
```

---

Interview Question

Difference between

```
div p

and

div > p
```

Answer

```
div p
```

All descendants.

```
div > p
```

Only direct children.

---

# 10. Colors

CSS supports many color formats.

---

Named Colors

```css
color:red;
```

---

HEX

```css
color:#ff0000;
```

---

RGB

```css
color:rgb(255,0,0);
```

---

RGBA

```css
color:rgba(255,0,0,.5);
```

---

HSL

```css
color:hsl(0,100%,50%);
```

---

HSLA

```css
color:hsla(0,100%,50%,0.5);
```

---

Interview Question

Difference between RGB and RGBA?

RGBA includes an alpha channel for transparency.

---

# 11. CSS Units

## Absolute Units

```
px

cm

mm

in

pt

pc
```

Most common

```
px
```

---

## Relative Units

```
%

em

rem

vw

vh

vmin

vmax

ch

```

---

px

Fixed.

---

%

Relative to parent.

---

em

Relative to parent's font size.

---

rem

Relative to root font size.

Usually

```css
html{

font-size:16px;

}
```

---

vw

1% of viewport width.

---

vh

1% of viewport height.

---

Interview Question

Difference between em and rem?

| em | rem |
|------|------|
| Parent Font Size | Root Font Size |

---

# 12. CSS Cascade

CSS decides which style wins when multiple rules apply.

Priority (lowest → highest)

```
Browser Styles

↓

External CSS

↓

Internal CSS

↓

Inline CSS

↓

!important
```

Example

```css
p{

color:blue;

}

p{

color:red;

}
```

Result

```
Red
```

Because the later rule overrides the earlier one when specificity is equal.

---

# 13. Inheritance

Some CSS properties inherit from parent elements.

Example

```css
body{

color:blue;

}
```

Children inherit

```
color
```

Examples of inherited properties

- color
- font-family
- font-size

Examples of non-inherited properties

- margin
- padding
- border
- width
- height

---

Interview Question

Does margin inherit?

Answer

No.

---

# Best Practices

✔ External CSS

✔ Meaningful Class Names

✔ Keep CSS Organized

✔ Avoid Inline Styles

✔ Use Relative Units

✔ Reuse Classes

✔ Keep Selectors Simple

✔ Follow Naming Conventions

---

# Common Mistakes

❌ Using IDs for everything

❌ Inline CSS everywhere

❌ Deep nested selectors

❌ Repeating styles

❌ Not organizing CSS files

❌ Overusing !important

---

# Frequently Asked Interview Questions

1. What is CSS?

2. Why is CSS used?

3. Difference between HTML and CSS?

4. Types of CSS?

5. Which CSS type is recommended?

6. Difference between id and class selectors?

7. Difference between em and rem?

8. Difference between px and %?

9. Difference between descendant and child selector?

10. What is the CSS Cascade?

11. What is inheritance?

12. Which properties inherit?

13. Which properties do not inherit?

14. What is a CSS rule?

15. What are selectors?

---

# Memory Tricks

HTML

↓

Structure

CSS

↓

Presentation

JavaScript

↓

Behavior

---

Selector

↓

Find Element

Property

↓

What to Change

Value

↓

New Setting

---

# Quick Revision

- CSS stands for Cascading Style Sheets.
- CSS is used for styling web pages.
- External CSS is the preferred approach for production.
- CSS syntax follows `selector { property: value; }`.
- Selectors target HTML elements.
- CSS supports named, HEX, RGB, RGBA, HSL, and HSLA colors.
- `px` is an absolute unit.
- `em`, `rem`, `%`, `vw`, and `vh` are relative units.
- Later rules with the same specificity override earlier ones.
- Inherited properties include `color` and `font-family`; `margin` and `padding` are not inherited.

---