# CSS Interview Guide
# Part 7D.1

---

# Advanced Interview Questions (71–100)

---

## 71. What is the difference between visibility:hidden, opacity:0 and display:none?

| display:none | visibility:hidden | opacity:0 |
|---------------|------------------|------------|
| Removed from layout | Keeps layout | Keeps layout |
| Not visible | Not visible | Transparent |
| No occupied space | Space reserved | Space reserved |

---

## 72. What is CSSOM?

Answer

CSSOM stands for **CSS Object Model**.

The browser converts CSS into the CSSOM.

```
HTML
↓

DOM

CSS
↓

CSSOM

↓

Render Tree

↓

Paint
```

---

## 73. Difference between DOM and CSSOM?

DOM

Contains HTML elements.

CSSOM

Contains computed CSS rules.

Browser combines them into the Render Tree.

---

## 74. What is Render Tree?

Answer

Render Tree contains only visible elements.

Example

```
display:none
```

Elements are NOT included.

---

## 75. What causes Reflow?

Changing

- Width
- Height
- Margin
- Padding
- Font Size
- Adding/Removing Elements

---

## 76. What causes Repaint?

Changing

- Color
- Background
- Shadow
- Visibility (without layout changes)

---

## 77. Which is more expensive?

Answer

Reflow

↓

Because browser recalculates layout.

---

## 78. What is Layout Thrashing?

Answer

Repeatedly reading layout information and then writing layout changes in a loop, causing unnecessary reflows and hurting performance.

---

## 79. What is Critical CSS?

Answer

CSS required for above-the-fold content.

Benefits

- Faster First Paint
- Better Performance
- Improved Core Web Vitals

---

## 80. What is CSS Reset?

Example

```css
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
}
```

Purpose

Remove browser default styling.

---

## 81. Difference between CSS Reset and Normalize.css?

Reset

Removes almost all default browser styles.

Normalize

Keeps useful defaults while making rendering more consistent across browsers.

---

## 82. What is BEM?

BEM

↓

Block Element Modifier

Example

```css
.card{}

.card__title{}

.card--active{}
```

Benefits

- Readable
- Scalable
- Avoids conflicts

---

## 83. What is Utility-First CSS?

Example

Tailwind CSS

Instead of

```css
.card{}
```

Use

```html
<div class="p-4 bg-blue-500 rounded">
```

---

## 84. Difference between CSS Variables and Sass Variables?

CSS Variables

- Work in browser
- Can change at runtime
- Inherit naturally

Sass Variables

- Compiled before runtime
- Cannot change in browser after compilation

---

## 85. What is a Stacking Context?

Answer

A stacking context controls how elements are layered.

Common creators

- position + z-index
- opacity < 1
- transform
- filter

---

## 86. Why doesn't z-index always work?

Possible Reasons

- Different stacking contexts
- Parent restrictions
- Element not positioned (in common cases)

---

## 87. What is Aspect Ratio?

```css
aspect-ratio:16/9;
```

Maintains proportional dimensions.

---

## 88. Difference between object-fit and background-size?

object-fit

Used for images/videos.

background-size

Used for CSS background images.

---

## 89. What is object-fit:cover?

Image fills container.

Some cropping may occur.

---

## 90. Difference between cover and contain?

cover

Fill container.

May crop.

contain

Entire image visible.

May leave empty space.

---

## 91. What is scroll-behavior?

```css
html{

scroll-behavior:smooth;

}
```

Smooth scrolling.

---

## 92. What is scroll-snap?

Creates snapping scroll positions.

Useful for

- Carousels
- Slides
- Galleries

---

## 93. What is accent-color?

Changes default color of

- Checkbox
- Radio
- Range
- Progress

Example

```css
accent-color:#2563eb;
```

---

## 94. What is caret-color?

Changes text cursor color.

```css
caret-color:red;
```

---

## 95. What is appearance:none?

Removes browser default styling.

Commonly used for

- Select
- Checkbox
- Radio
- Buttons

---

## 96. What is pointer-events:none?

Disables mouse interaction.

Element ignores pointer events.

---

## 97. What is user-select:none?

Prevents text selection.

---

## 98. Difference between overflow:auto and overflow:scroll?

auto

Scrollbar appears only if needed.

scroll

Scrollbar always shown (subject to browser/platform behavior).

---

## 99. What is isolation:isolate?

Creates a new stacking context.

Useful for complex layering.

---

## 100. What is contain?

Example

```css
contain:layout;
```

Limits layout/paint calculations to improve rendering performance in appropriate scenarios.

---

# 40 Tricky CSS Interview Questions

---

### 1

Can multiple classes be applied?

Answer

Yes.

```html
<div class="card active shadow">
```

---

### 2

Can multiple IDs exist?

Only one ID per element.

IDs should be unique within the document.

---

### 3

Can multiple classes have same name?

Yes.

Across multiple elements.

---

### 4

Can CSS work without HTML?

No.

CSS styles documents such as HTML; by itself it has nothing to style.

---

### 5

Can HTML work without CSS?

Yes.

---

### 6

Can CSS work without JavaScript?

Yes.

---

### 7

Is CSS case-sensitive?

Selectors for HTML element names are generally case-insensitive in HTML documents, but class and ID values depend on the document and should be treated consistently. Best practice: use consistent lowercase naming.

---

### 8

Can padding be negative?

No.

---

### 9

Can margin be negative?

Yes.

---

### 10

Can width be negative?

No.

---

### 11

Can z-index be negative?

Yes.

---

### 12

Can opacity be greater than 1?

No.

Range

```
0–1
```

---

### 13

Can transition animate display?

No.

---

### 14

Can animation run forever?

Yes.

```css
animation-iteration-count:infinite;
```

---

### 15

Does transform affect layout?

No.

Only visual appearance.

---

### 16

Does display:none remove DOM?

No.

Only removes it from layout/rendering.

---

### 17

Can Grid replace Flexbox?

No.

They complement each other.

---

### 18

Can Flexbox replace Grid?

No.

Depends on layout.

---

### 19

Can one page have multiple media queries?

Yes.

Unlimited.

---

### 20

Can CSS Variables change dynamically?

Yes.

With CSS or JavaScript.

---

### 21

Does `inherit` force a property to inherit?

Yes, for that declaration.

---

### 22

Difference between `initial`, `inherit`, and `unset`?

- `initial` → resets to the property's initial value.
- `inherit` → inherits from the parent.
- `unset` → behaves as `inherit` for inherited properties, otherwise as `initial`.

---

### 23

Can pseudo-elements be selected with JavaScript?

Not directly as DOM nodes.

---

### 24

Can `::before` exist without an element?

No.

---

### 25

Is `box-sizing:border-box` inherited?

No.

It is commonly applied globally with the universal selector.

---

### 26

Does every browser have default CSS?

Yes.

User agent stylesheets.

---

### 27

Can an element have multiple animations?

Yes.

---

### 28

Can an element have multiple backgrounds?

Yes.

---

### 29

Can `background-image` use gradients?

Yes.

---

### 30

Can CSS create shapes?

Yes.

Using borders, clip-path, transforms, etc.

---

### 31

Can CSS create triangles?

Yes.

Using borders.

---

### 32

Can CSS create circles?

Yes.

```css
border-radius:50%;
```

---

### 33

Can CSS center everything?

Almost every common layout can be centered using Flexbox or Grid.

---

### 34

Does `display:inline` support width?

Generally no.

---

### 35

Does `display:inline-block` support width?

Yes.

---

### 36

Can CSS access databases?

No.

---

### 37

Can CSS send HTTP requests?

Not as application logic.

---

### 38

Can CSS execute loops?

No.

---

### 39

Can CSS perform calculations?

Yes.

Using

```css
calc()
```

---

### 40

Can CSS replace JavaScript?

No.

---

# Company-Specific CSS Questions

## TCS

- Explain the Box Model.
- Difference between Margin and Padding.
- Difference between Inline and Block.
- Types of CSS.

---

## Infosys

- Difference between Flexbox and Grid.
- What is Responsive Design?
- Explain Media Queries.
- Difference between rem and em.

---

## Accenture

- Explain Specificity.
- Difference between display:none and visibility:hidden.
- What is z-index?
- Explain CSS Variables.

---

## Cognizant

- Difference between absolute and relative.
- Explain pseudo-classes.
- What is the Cascade?

---

## Capgemini

- Difference between transition and animation.
- Explain transform.
- What is Flexbox?

---

## Deloitte

- How do you optimize CSS?
- Explain Reflow and Repaint.
- What is Critical CSS?

---

## Zoho

Common live coding tasks

- Center a div.
- Build a responsive navbar.
- Create a card layout.
- Build a pricing section.
- Create a responsive gallery.

---

## Amazon

Behavioral + Technical

Questions

- How do you make CSS maintainable?
- Explain BEM.
- How do you optimize CSS performance?
- How would you design a large scalable CSS architecture?

---

## Microsoft

Questions

- Explain browser rendering.
- What is CSSOM?
- What causes layout shifts?
- Difference between paint and composite?

---

## Google

Questions

- Explain Render Tree.
- Explain Layout Thrashing.
- Explain Core Web Vitals from CSS perspective.
- Which animations are GPU-friendly?

---

# HR + Technical Combined Questions

### Tell me about yourself as a Frontend Developer.

Focus on

- HTML
- CSS
- JavaScript
- React
- Responsive Design
- Performance

---

### Which CSS feature do you use most?

Good Answer

Flexbox, Grid, Variables, Media Queries, and Transitions.

---

### How do you debug CSS?

Answer

- Browser DevTools
- Inspect Element
- Check Specificity
- Verify Computed Styles
- Check Layout Panels
- Test Responsiveness

---

### How do you write maintainable CSS?

Answer

- Semantic class names
- BEM (or another consistent naming convention)
- Variables
- Component-based organization
- Avoid !important
- Small reusable classes

---

### Final Interview Advice

When answering CSS questions:

1. Give the definition.
2. Explain why it is used.
3. Show a small example.
4. Mention one real-world use case.
5. Mention one common mistake.
6. Mention one best practice.

This answer structure consistently leaves a strong impression in frontend interviews.

---