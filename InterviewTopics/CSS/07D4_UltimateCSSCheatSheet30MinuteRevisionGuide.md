# CSS Interview Master Handbook
# Part 7D.4 – Ultimate CSS Cheat Sheet & 30-Minute Revision Guide

> Frontend Interview Last-Minute Notes

---

# CSS Mind Map

```
CSS
│
├── Fundamentals
│   ├── Syntax
│   ├── Types
│   ├── Cascade
│   ├── Inheritance
│   └── Specificity
│
├── Selectors
│   ├── Universal
│   ├── Element
│   ├── Class
│   ├── ID
│   ├── Attribute
│   ├── Pseudo Class
│   └── Pseudo Element
│
├── Box Model
│   ├── Content
│   ├── Padding
│   ├── Border
│   └── Margin
│
├── Layout
│   ├── Display
│   ├── Position
│   ├── Float (legacy)
│   ├── Flexbox
│   └── Grid
│
├── Typography
│
├── Backgrounds
│
├── Variables
│
├── Animations
│
├── Responsive Design
│
└── Performance
```

---

# CSS Property Cheat Sheet

## Display

```css
display:block;

display:inline;

display:inline-block;

display:flex;

display:grid;

display:none;
```

---

## Position

```css
position:static;

position:relative;

position:absolute;

position:fixed;

position:sticky;
```

---

## Flexbox

```css
display:flex;

flex-direction:row;

justify-content:center;

align-items:center;

align-content:center;

flex-wrap:wrap;

gap:20px;

flex-grow:1;

flex-shrink:1;

flex-basis:200px;

order:1;

align-self:center;
```

---

## Grid

```css
display:grid;

grid-template-columns:

repeat(auto-fit,minmax(250px,1fr));

grid-template-rows:auto;

gap:20px;

grid-column:span 2;

grid-row:span 2;

place-items:center;

place-content:center;
```

---

## Box Model

```css
margin:20px;

padding:20px;

border:2px solid black;

outline:2px solid blue;

box-sizing:border-box;
```

---

## Size

```css
width:100%;

height:auto;

min-width:200px;

max-width:1200px;

min-height:100vh;

aspect-ratio:16/9;
```

---

## Colors

```css
color:#2563eb;

background:#111;

background-color:white;
```

---

## Background

```css
background-image:url(bg.jpg);

background-size:cover;

background-position:center;

background-repeat:no-repeat;

background-attachment:fixed;
```

---

## Gradient

```css
linear-gradient()

radial-gradient()

conic-gradient()
```

---

## Typography

```css
font-family:Arial,sans-serif;

font-size:1rem;

font-weight:700;

line-height:1.5;

letter-spacing:1px;

word-spacing:4px;

text-align:center;

text-transform:uppercase;

text-decoration:none;
```

---

## Border Radius

```css
border-radius:10px;

border-radius:50%;
```

---

## Shadow

```css
box-shadow:0 10px 20px rgba(0,0,0,.2);

text-shadow:2px 2px 5px gray;
```

---

## Overflow

```css
overflow:hidden;

overflow:auto;

overflow:scroll;
```

---

## Transform

```css
translate()

scale()

rotate()

skew()
```

---

## Transition

```css
transition:.3s ease;
```

---

## Animation

```css
@keyframes

animation:

animation-duration

animation-delay

animation-iteration-count

animation-fill-mode
```

---

## Variables

```css
:root{

--primary:#2563eb;

}

color:

var(--primary);
```

---

## Functions

```css
calc()

clamp()

min()

max()

var()
```

---

## Responsive

```css
@media(min-width:768px)

@media(max-width:768px)

clamp()

vw

vh

rem
```

---

# Specificity Cheat Sheet

Priority

```
!important

↓

Inline Style

↓

ID

↓

Class

↓

Element
```

---

# Box Model

```
Margin

↓

Border

↓

Padding

↓

Content
```

---

# Position Cheat Sheet

```
Static

↓

Default

Relative

↓

Original Position

Absolute

↓

Nearest Positioned Parent

Fixed

↓

Viewport

Sticky

↓

Scroll Then Fixed
```

---

# Flexbox Cheat Sheet

```
display:flex

↓

Main Axis

↓

justify-content

↓

Cross Axis

↓

align-items
```

Remember

```
justify

↓

Main

align

↓

Cross
```

---

# Grid Cheat Sheet

```
display:grid

↓

Columns

↓

Rows

↓

Gap

↓

Items
```

---

# Animation Cheat Sheet

```
Transition

↓

Needs Trigger

Animation

↓

Automatic
```

---

# Responsive Cheat Sheet

```
Mobile First

↓

min-width

Desktop First

↓

max-width
```

---

# Browser Rendering

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
```

---

# Performance Rules

✔ Animate

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

# Accessibility Checklist

✔ Visible focus

✔ Good contrast

✔ Responsive text

✔ Large tap targets

✔ Don't rely on color alone

✔ Respect prefers-reduced-motion

---

# Frequently Forgotten Topics

□ box-sizing:border-box

□ gap

□ object-fit

□ aspect-ratio

□ clamp()

□ CSS Variables

□ minmax()

□ auto-fit

□ auto-fill

□ backdrop-filter

□ pointer-events

□ user-select

□ caret-color

□ accent-color

---

# 30-Minute Revision Plan

## 30–25 Minutes

- Box Model
- Display
- Position

---

## 25–20 Minutes

- Flexbox
- Grid

---

## 20–15 Minutes

- Selectors
- Specificity
- Cascade

---

## 15–10 Minutes

- Typography
- Variables
- Functions

---

## 10–5 Minutes

- Responsive Design
- Media Queries

---

## Final 5 Minutes

Revise

✔ Difference between Grid & Flexbox

✔ Position values

✔ display values

✔ Specificity

✔ Box Model

✔ Transition vs Animation

✔ Mobile First

✔ Common interview answers

---

# Company-wise Preparation

## TCS

✔ CSS Basics

✔ Box Model

✔ Display

✔ Position

---

## Infosys

✔ Responsive Design

✔ Flexbox

✔ Grid

---

## Accenture

✔ Specificity

✔ Variables

✔ Responsive UI

---

## Cognizant

✔ Flexbox

✔ Grid

✔ Media Queries

---

## Capgemini

✔ Animations

✔ Hover Effects

✔ Layout

---

## Zoho

✔ Live Coding

✔ UI Components

✔ Responsive Layout

✔ Performance

---

## Amazon

✔ Accessibility

✔ Performance

✔ Responsive Design

✔ Maintainable CSS

---

## Microsoft

✔ Rendering Pipeline

✔ Layout

✔ Browser Internals

---

## Google

✔ Performance

✔ Reflow

✔ Repaint

✔ CSS Architecture

---

# Common Interview Mistakes

❌ Using IDs for styling

❌ Overusing !important

❌ Deep selectors

❌ Fixed pixel layouts

❌ Ignoring accessibility

❌ No responsive design

❌ Animating width/height unnecessarily

❌ Removing focus outlines

❌ Poor color contrast

❌ Not testing on multiple screen sizes

---

# Golden Rules

1. Prefer classes over IDs.
2. Use Flexbox for one-dimensional layouts.
3. Use Grid for two-dimensional layouts.
4. Use CSS variables for repeated values.
5. Keep specificity low.
6. Prefer external CSS.
7. Use semantic HTML with CSS.
8. Build mobile-first layouts.
9. Optimize animations using transform and opacity.
10. Write readable, maintainable CSS.

---

# CSS Interview Formula

For every answer:

Definition

↓

Why

↓

Syntax

↓

Example

↓

Real-world Use

↓

Best Practice

↓

Common Mistake

---

# One-Page Revision

Remember these topics in order:

- CSS Syntax
- Cascade
- Specificity
- Selectors
- Box Model
- Display
- Position
- Flexbox
- Grid
- Typography
- Backgrounds
- Variables
- Functions
- Transitions
- Animations
- Responsive Design
- Media Queries
- Performance
- Accessibility

If you can confidently explain these topics with examples, you're well prepared for most frontend CSS interview rounds.

---