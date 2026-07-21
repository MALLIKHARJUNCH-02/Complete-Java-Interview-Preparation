# CSS Interview Guide
# Part 5 – Selectors, Specificity & Pseudo Classes/Elements

---

# Table of Contents

1. CSS Selectors
2. Combinators
3. Attribute Selectors
4. Pseudo Classes
5. Structural Pseudo Classes
6. Functional Pseudo Classes
7. Pseudo Elements
8. Specificity
9. !important
10. Cascade
11. Inheritance
12. Best Practices
13. Common Mistakes
14. Interview Questions
15. Cheat Sheet

---

# 1. CSS Selectors

Selectors tell CSS which HTML elements to style.

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

Selects all `<h1>` elements.

---

## Class Selector

```css
.error{
    color:red;
}
```

HTML

```html
<p class="error">Invalid Password</p>
```

---

## ID Selector

```css
#title{
    color:blue;
}
```

HTML

```html
<h1 id="title">Welcome</h1>
```

---

## Group Selector

```css
h1,p,button{
    font-family:Arial;
}
```

---

# 2. Combinators

Combinators define relationships between elements.

---

## Descendant Selector

```css
div p{
    color:red;
}
```

Matches

```html
<div>
    <section>
        <p>Hello</p>
    </section>
</div>
```

All paragraphs inside div.

---

## Child Selector

```css
div > p{
    color:blue;
}
```

Matches only

```html
<div>
    <p>Hello</p>
</div>
```

---

## Adjacent Sibling

```css
h1 + p{
    color:green;
}
```

Matches only the first paragraph immediately after h1.

---

## General Sibling

```css
h1 ~ p{
    color:orange;
}
```

Matches every paragraph after h1 that shares the same parent.

---

Interview Question

Difference between

```css
div p
```

and

```css
div > p
```

Answer

`div p`

↓

All descendants.

`div > p`

↓

Only direct children.

---

# 3. Attribute Selectors

---

Exact Match

```css
input[type="text"]{
    border:1px solid red;
}
```

---

Contains Word

```css
[class~="active"]{
    color:red;
}
```

---

Starts With

```css
a[href^="https"]{
    color:green;
}
```

---

Ends With

```css
img[src$=".png"]{
    border:2px solid blue;
}
```

---

Contains

```css
a[href*="google"]{
    color:red;
}
```

---

Interview Question

Difference between

```
^=

$=

*=
```

Answer

^=

Starts with

$=

Ends with

*=

Contains

---

# 4. Pseudo Classes

Pseudo classes represent an element in a specific state.

Syntax

```css
button:hover{
    background:red;
}
```

---

:hover

Mouse over.

```css
button:hover{
    background:black;
    color:white;
}
```

---

:active

While clicking.

```css
button:active{
    transform:scale(.95);
}
```

---

:focus

Input focused.

```css
input:focus{
    outline:2px solid blue;
}
```

---

:visited

Visited link.

```css
a:visited{
    color:purple;
}
```

---

:link

Unvisited link.

```css
a:link{
    color:blue;
}
```

---

:hover vs :focus

:hover

Mouse interaction.

:focus

Keyboard or input focus.

---

Interview Tip

Never remove focus outlines without providing an accessible replacement.

---

# 5. Structural Pseudo Classes

---

:first-child

```css
li:first-child{
    color:red;
}
```

---

:last-child

```css
li:last-child{
    color:blue;
}
```

---

:nth-child()

```css
li:nth-child(2){
    color:red;
}
```

---

Odd Rows

```css
tr:nth-child(odd){
    background:#eee;
}
```

---

Even Rows

```css
tr:nth-child(even){
    background:white;
}
```

---

Every Third Item

```css
li:nth-child(3n){
    color:red;
}
```

---

:last-of-type

```css
p:last-of-type{
    color:green;
}
```

---

:nth-of-type()

```css
p:nth-of-type(2){
    color:red;
}
```

Difference

`:nth-child()`

Counts every child.

`:nth-of-type()`

Counts only that element type.

---

# 6. Functional Pseudo Classes

---

:not()

Exclude elements.

```css
button:not(.primary){
    background:gray;
}
```

---

:is()

Groups selectors.

```css
:is(h1,h2,h3){
    color:navy;
}
```

Reduces repetition.

---

:where()

Similar to `:is()` but contributes **zero specificity**.

```css
:where(nav a){
    text-decoration:none;
}
```

Useful for framework and reset styles.

---

:has()

Parent selector (modern browsers).

```css
.card:has(img){
    border:2px solid green;
}
```

Styles `.card` if it contains an image.

---

Interview Question

Difference between

:is()

and

:where()

Answer

Both group selectors.

`:where()` has **0 specificity**.

`:is()` uses the specificity of the most specific selector inside it.

---

# 7. Pseudo Elements

Pseudo elements style part of an element.

Syntax

```css
p::before{

}
```

---

::before

```css
h1::before{
    content:"★ ";
}
```

---

::after

```css
h1::after{
    content:" ✔";
}
```

---

::first-letter

```css
p::first-letter{
    font-size:40px;
}
```

---

::first-line

```css
p::first-line{
    color:red;
}
```

---

::selection

```css
::selection{
    background:black;
    color:white;
}
```

Changes highlighted text.

---

::placeholder

```css
input::placeholder{
    color:gray;
}
```

---

::marker

```css
li::marker{
    color:red;
}
```

Styles list bullets/numbers.

---

Interview Question

Difference between

Pseudo Class

and

Pseudo Element?

Answer

Pseudo Class

↓

Represents an element state.

Pseudo Element

↓

Represents part of an element.

---

# 8. CSS Specificity

Specificity determines which selector wins.

Priority

```
Inline Style

↓

ID

↓

Class / Attribute / Pseudo Class

↓

Element / Pseudo Element
```

Specificity Values

| Selector | Value |
|-----------|------:|
| Inline | 1000 |
| ID | 100 |
| Class | 10 |
| Attribute | 10 |
| Pseudo Class | 10 |
| Element | 1 |
| Pseudo Element | 1 |

---

Example

```css
#title{
    color:red;
}

.heading{
    color:blue;
}

h1{
    color:green;
}
```

Winner

```
#title
```

---

Interview Question

Who wins?

```css
#title

.heading

h1
```

Answer

```
#title
```

Highest specificity.

---

# 9. !important

```css
color:red !important;
```

Overrides normal specificity.

Avoid excessive use.

Use only when truly necessary.

---

Interview Question

Should !important be used frequently?

Answer

No.

It makes CSS difficult to maintain and override.

---

# 10. CSS Cascade

Cascade decides the final applied style based on:

1. Importance (`!important`)
2. Specificity
3. Source Order

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

The later rule wins because specificity is equal.

---

# 11. Inheritance

Inherited Properties

✔ color

✔ font-family

✔ font-size

✔ line-height

Not Inherited

✖ margin

✖ padding

✖ border

✖ width

✖ height

---

Interview Question

Does border inherit?

Answer

No.

---

# Best Practices

✔ Prefer class selectors.

✔ Keep specificity low.

✔ Avoid IDs for styling.

✔ Avoid !important.

✔ Use :focus for accessibility.

✔ Use :where() for reusable low-specificity rules.

✔ Keep selectors simple.

---

# Common Mistakes

❌ Deep selector nesting.

❌ Using IDs everywhere.

❌ Overusing !important.

❌ Removing focus outlines.

❌ Confusing :nth-child() with :nth-of-type().

❌ Forgetting that :hover doesn't work well on many touch devices.

---

# Frequently Asked Interview Questions

1. What is a CSS selector?

2. Types of selectors?

3. Difference between descendant and child selectors?

4. Difference between adjacent and general sibling selectors?

5. Difference between :hover and :focus?

6. Difference between :first-child and :first-of-type?

7. Difference between :nth-child() and :nth-of-type()?

8. Difference between pseudo classes and pseudo elements?

9. Difference between ::before and ::after?

10. What is specificity?

11. How is specificity calculated?

12. Does inline CSS have higher specificity than IDs?

13. What is !important?

14. Difference between :is() and :where()?

15. What is :has()?

16. Which selector has the highest specificity?

17. Which properties inherit?

18. What is the CSS Cascade?

19. Why should !important be avoided?

20. What happens when two selectors have the same specificity?

Answer

The selector that appears later in the stylesheet wins.

---

# CSS Selector Cheat Sheet

```css
* {}

h1 {}

.class {}

#id {}

div p {}

div > p {}

h1 + p {}

h1 ~ p {}

[type="text"] {}

[href^="https"] {}

[href$=".pdf"] {}

[href*="google"] {}

:hover

:focus

:active

:visited

:first-child

:last-child

:nth-child()

:nth-of-type()

:not()

:is()

:where()

:has()

::before

::after

::selection

::placeholder

::marker
```

---

# Memory Tricks

```
:hover
↓

Mouse
```

```
:focus
↓

Keyboard/Input
```

```
:first-child
↓

First Child
```

```
::before
↓

Before Content
```

```
Specificity

Inline

↓

ID

↓

Class

↓

Element
```

---

# Quick Revision

- Selectors identify which elements receive styles.
- Combinators define relationships between elements.
- Attribute selectors target elements by attribute values.
- Pseudo classes represent states such as `:hover` and `:focus`.
- Pseudo elements style parts of an element like `::before` and `::first-letter`.
- CSS specificity determines which rule wins when multiple rules match.
- `!important` overrides normal specificity and should be used sparingly.
- The cascade resolves conflicts using importance, specificity, and source order.
- Some properties inherit automatically, while layout properties like `margin` and `padding` do not.

---