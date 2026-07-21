# CSS Interview Guide
# Part 7C.2 – Advanced CSS Interview Questions (36–70)

---

# 36. What is CSS Specificity?

### Answer

Specificity is the algorithm browsers use to decide which CSS rule should be applied when multiple selectors match the same element.

Priority

```
!important

↓

Inline Style

↓

ID

↓

Class / Attribute / Pseudo Class

↓

Element / Pseudo Element
```

---

# 37. How is Specificity Calculated?

Example

```css
#header .menu li a
```

Calculation

```
ID = 1

Class = 1

Elements = 2

Specificity

1-1-2
```

---

# 38. What happens if two selectors have the same specificity?

Answer

The selector written later in the stylesheet wins.

Example

```css
p{
    color:red;
}

p{
    color:blue;
}
```

Output

```
Blue
```

---

# 39. What is the CSS Cascade?

Answer

Cascade decides the final applied style using

1. Importance
2. Specificity
3. Source Order

---

# 40. Difference between :hover and :focus?

| hover | focus |
|---------|---------|
| Mouse | Keyboard/Input |
| Temporary | Active Element |

---

# 41. Difference between :focus and :focus-visible?

### Answer

`:focus`

Applies whenever an element receives focus.

`:focus-visible`

Usually appears when the browser determines a visible focus indicator is helpful (commonly keyboard navigation).

Better for accessibility.

---

# 42. Difference between ::before and ::after?

Both create pseudo elements.

```
::before

↓

Before Content

::after

↓

After Content
```

Example

```css
h1::before{
    content:"★ ";
}
```

---

# 43. Can ::before work without content?

Answer

No.

Always define

```css
content:"";
```

even if empty.

---

# 44. Difference between transform and transition?

Transform

Changes shape or position.

Transition

Animates the change.

Example

```css
.card{

transition:.3s;

}

.card:hover{

transform:scale(1.1);

}
```

---

# 45. Difference between transition and animation?

Transition

Needs state change.

Animation

Can run automatically.

---

# 46. What is transform-origin?

Answer

Defines the pivot point.

Example

```css
transform-origin:left top;
```

---

# 47. Difference between translate() and position:left?

translate()

Visual movement.

Usually smoother.

left

Changes layout position for positioned elements.

---

# 48. Why is transform faster?

Answer

Transforms usually avoid layout recalculation and are optimized by browsers for smoother rendering.

---

# 49. Difference between display:flex and display:grid?

Flex

One-dimensional.

Grid

Two-dimensional.

---

# 50. Difference between justify-items and justify-content?

justify-items

Aligns items inside their cells.

justify-content

Moves the entire container's content.

---

# 51. Difference between auto-fit and auto-fill?

auto-fit

Unused tracks collapse.

auto-fill

Unused tracks remain.

---

# 52. Difference between minmax() and clamp()?

minmax()

Used mainly in CSS Grid track sizing.

clamp()

Limits a property value between a minimum and maximum.

---

# 53. Difference between em and rem?

em

Relative to parent.

rem

Relative to root element.

---

# 54. Difference between vh and vw?

vh

Viewport Height.

vw

Viewport Width.

---

# 55. Difference between absolute and fixed?

Absolute

Relative to nearest positioned ancestor.

Fixed

Relative to viewport.

---

# 56. Difference between sticky and fixed?

Sticky

Acts relative until scroll threshold.

Fixed

Always fixed.

---

# 57. Difference between overflow:hidden and clip-path?

overflow:hidden

Hides overflowing content.

clip-path

Cuts element into custom shapes.

---

# 58. Difference between opacity and rgba()?

opacity

Entire element becomes transparent.

rgba()

Only affects the specific color value.

---

# 59. Why use CSS Variables?

Answer

- Reusability
- Easy Theme Switching
- Dark Mode
- Less Repetition

---

# 60. Difference between filter and backdrop-filter?

filter

Applies effects to the element.

backdrop-filter

Applies effects behind the element.

---

# 61. What is Reflow?

Answer

Browser recalculates layout.

Triggered by

- Width
- Height
- Margin
- Padding
- Font Size

---

# 62. What is Repaint?

Answer

Browser redraws pixels.

Triggered by

- Color
- Background
- Shadow

---

# 63. Which is more expensive?

Answer

Reflow.

Because layout must be recalculated.

---

# 64. How can CSS performance be improved?

Answer

- Reduce unused CSS
- Use efficient selectors
- Prefer transform animations
- Compress CSS
- Avoid deep nesting
- Use CSS variables

---

# 65. Why avoid deep selectors?

Bad

```css
body main section article div ul li a span
```

Good

```css
.card-title
```

Reason

Cleaner

Faster

Maintainable

---

# 66. Difference between visibility:hidden and opacity:0?

| visibility | opacity |
|-------------|----------|
| Hidden | Transparent |
| Cannot be seen | Cannot be seen |
| Keeps layout | Keeps layout |

---

# 67. Why avoid IDs in CSS?

Answer

IDs have very high specificity.

Classes are easier to reuse and override.

---

# 68. Why avoid !important?

Answer

Makes CSS difficult to override and maintain.

Use only when absolutely necessary.

---

# 69. What is Mobile First Design?

Answer

Start designing for small screens.

Enhance for larger screens using

```css
@media(min-width:...)
```

---

# 70. What is Desktop First Design?

Answer

Start with desktop styles.

Adjust for smaller screens using

```css
@media(max-width:...)
```

---

# Scenario-Based Questions

---

## Scenario 1

Hover effect doesn't work.

Possible Reasons

- Wrong selector
- Element covered by another element
- CSS file not loaded
- Transition applied to wrong selector

---

## Scenario 2

Flexbox isn't working.

Check

```css
display:flex;
```

Without it,

Flexbox properties won't work.

---

## Scenario 3

Grid isn't working.

Check

```css
display:grid;
```

---

## Scenario 4

z-index isn't working.

Possible Reasons

- Element not positioned
- Different stacking context
- Parent restrictions

---

## Scenario 5

Media query isn't applying.

Check

- Viewport meta tag
- Breakpoint
- CSS order
- Device width

---

## Scenario 6

Image overflows container.

Solution

```css
img{

max-width:100%;

height:auto;

}
```

---

## Scenario 7

Text overflows card.

Solution

```css
overflow-wrap:anywhere;
```

or

```css
word-break:break-word;
```

when appropriate.

---

# Output Questions

## Q1

```css
div{

display:none;

}
```

Output

Element disappears.

No layout space.

---

## Q2

```css
div{

visibility:hidden;

}
```

Output

Invisible.

Space remains.

---

## Q3

```css
div{

opacity:0;

}
```

Output

Transparent.

Still occupies layout space.

---

## Q4

```css
.container{

display:flex;

justify-content:center;

align-items:center;

}
```

Output

Items centered horizontally and vertically.

---

## Q5

```css
.container{

display:grid;

place-items:center;

}
```

Output

Items centered in grid cells.

---

# Amazon Style Question

Design a pricing page that works on

- Mobile
- Tablet
- Desktop

Expected Answer

- CSS Grid
- Flexbox
- Media Queries
- clamp()
- Responsive Images
- CSS Variables

---

# Google Style Question

How would you improve CSS performance on a very large website?

Expected Answer

- Remove unused CSS
- Minify
- Efficient selectors
- CSS Variables
- Lazy loading where applicable
- Optimize animations
- Reduce layout thrashing

---

# Microsoft Style Question

Difference between

```
display:none

visibility:hidden

opacity:0
```

Explain with examples.

---

# Zoho Style Question

How would you center a div?

Possible Answers

Flexbox

```css
display:flex;

justify-content:center;

align-items:center;
```

Grid

```css
display:grid;

place-items:center;
```

Margin Auto

```css
width:300px;

margin:auto;
```

---

# Interview Follow-up Questions

If you say

"I know Flexbox"

Interviewer may ask

- Difference between align-items and align-content?
- Difference between flex-grow and flex-shrink?
- Why doesn't align-content work sometimes?

---

If you say

"I know Grid"

Interviewer may ask

- Difference between auto-fit and auto-fill?
- Why use minmax()?
- When should Grid be preferred over Flexbox?

---

# Interview Tips

Always answer using this pattern:

1. Definition
2. Why it's used
3. Syntax (if applicable)
4. Real-world example
5. Best practice
6. Common mistake

Example

Question:

"What is Flexbox?"

Good Answer:

"Flexbox is a one-dimensional layout system used to arrange items in a row or column. It simplifies alignment, spacing, and responsive layouts. I commonly use it for navigation bars, card rows, and centering elements."

---