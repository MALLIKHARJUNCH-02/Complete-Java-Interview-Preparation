# CSS Interview Guide
# Part 7D.3 – CSS Debugging Questions (1–30)

---

# How to Debug CSS

Always follow this order:

1. Inspect the element (Browser DevTools)
2. Check if the CSS file is loaded
3. Verify the selector matches the element
4. Check specificity conflicts
5. Check computed styles
6. Verify the layout (Flexbox/Grid/Position)
7. Test responsive breakpoints
8. Look for browser-specific issues

---

# 1. CSS File Not Loading

Problem

```html
<link rel="stylesheet" href="style.css">
```

Nothing is styled.

Possible Causes

- Wrong file path
- File name mismatch
- Typo
- File not saved

Solution

✔ Verify the path

✔ Check Network tab in DevTools

✔ Refresh without cache

---

# 2. Class Styles Not Applied

HTML

```html
<div class="card"></div>
```

CSS

```css
.cards{
    color:red;
}
```

Problem

Wrong selector.

Solution

```css
.card{
    color:red;
}
```

---

# 3. ID Styles Not Working

HTML

```html
<div id="header"></div>
```

CSS

```css
#Header{
    background:red;
}
```

Problem

ID names must match exactly.

Solution

```css
#header{
    background:red;
}
```

---

# 4. Margin Auto Doesn't Center

Problem

```css
.box{
    margin:auto;
}
```

Not centered.

Reason

No width is defined.

Solution

```css
.box{
    width:300px;
    margin:auto;
}
```

---

# 5. z-index Not Working

Problem

```css
.box{
    z-index:10;
}
```

Reason

The element may not be creating or participating in the expected stacking context.

Common Fix

```css
.box{
    position:relative;
    z-index:10;
}
```

Also inspect parent stacking contexts.

---

# 6. Flexbox Not Working

Problem

```css
justify-content:center;
```

Reason

Forgot

```css
display:flex;
```

Solution

```css
.container{
    display:flex;
    justify-content:center;
}
```

---

# 7. Grid Not Working

Problem

```css
grid-template-columns:1fr 1fr;
```

Reason

Forgot

```css
display:grid;
```

---

# 8. Hover Effect Doesn't Work

Problem

```css
button:hover{
    background:red;
}
```

Possible Causes

- Wrong selector
- Covered by another element
- CSS overridden

Debug

Use DevTools → Force Element State → :hover

---

# 9. Transition Doesn't Animate

Problem

```css
button:hover{
    background:red;
    transition:.3s;
}
```

Reason

Transition should be on the normal state.

Correct

```css
button{
    transition:.3s;
}

button:hover{
    background:red;
}
```

---

# 10. Animation Doesn't Run

Problem

```css
animation:spin;
```

Missing duration.

Correct

```css
animation:spin 1s linear infinite;
```

---

# 11. Image Overflow

Problem

Image exceeds container.

Solution

```css
img{
    max-width:100%;
    height:auto;
}
```

---

# 12. Text Overflow

Problem

Very long word.

Solution

```css
overflow-wrap:anywhere;
```

---

# 13. Sticky Position Doesn't Work

Problem

```css
position:sticky;
```

Common Causes

- Missing

```css
top:0;
```

- Parent has overflow clipping

---

# 14. Fixed Footer Covers Content

Problem

Footer overlaps page.

Solution

Add bottom spacing equal to footer height or redesign layout with Flexbox/Grid.

---

# 15. Background Image Doesn't Show

Possible Causes

- Wrong path
- Incorrect filename
- Missing image
- Unsupported format

Debug

Open image URL directly.

---

# 16. CSS Variables Not Working

Problem

```css
color:var(--primary);
```

Reason

Variable not defined.

Correct

```css
:root{
    --primary:#2563eb;
}
```

---

# 17. Media Query Doesn't Apply

Problem

```css
@media(max-width:768px)
```

Possible Causes

- Missing viewport meta tag
- Wrong breakpoint
- Rule overridden later

---

# 18. Grid Items Overflow

Problem

Columns too wide.

Solution

```css
repeat(auto-fit,minmax(250px,1fr))
```

---

# 19. Button Width Too Large

Problem

```css
button{
    width:100%;
}
```

Reason

It fills the parent.

Fix

Use

```css
width:auto;
```

or a specific width.

---

# 20. Input Width Breaks Layout

Problem

Padding increases width.

Solution

```css
*{
    box-sizing:border-box;
}
```

---

# 21. Text Not Centered

Problem

```css
margin:auto;
```

on text.

Solution

Use

```css
text-align:center;
```

---

# 22. Flex Items Don't Wrap

Problem

Items overflow.

Solution

```css
flex-wrap:wrap;
```

---

# 23. Grid Gap Missing

Problem

Items touch each other.

Solution

```css
gap:20px;
```

---

# 24. Absolute Element in Wrong Place

Problem

Element appears unexpectedly.

Reason

No positioned parent.

Correct

```css
.parent{
    position:relative;
}

.child{
    position:absolute;
}
```

---

# 25. Circle Isn't Circular

Problem

```css
width:100px;
height:150px;
border-radius:50%;
```

Reason

Width and height differ.

Fix

Equal width and height.

---

# 26. Font Looks Different Across Devices

Reason

Font unavailable.

Solution

Provide fallback fonts.

```css
font-family:
Arial,
Helvetica,
sans-serif;
```

---

# 27. Shadow Doesn't Appear

Problem

```css
box-shadow:0 0 0 black;
```

Reason

No blur or spread.

Example

```css
box-shadow:0 5px 15px rgba(0,0,0,.2);
```

---

# 28. Horizontal Scroll Appears

Common Causes

- Fixed widths
- Large images
- Elements wider than viewport

Debug

Inspect overflowing element in DevTools.

Prefer

```css
max-width:100%;
```

---

# 29. Unexpected White Space

Possible Causes

- Default body margin
- Large margins
- Empty elements

Common Fix

```css
body{
    margin:0;
}
```

---

# 30. CSS Works in One Browser But Not Another

Possible Causes

- Unsupported feature
- Browser compatibility differences
- Missing fallback

Solution

✔ Check compatibility

✔ Add fallback styles

✔ Test across browsers

---

# Debugging Interview Workflow

Question:

"My Flexbox isn't working."

Good Answer

1. Verify `display:flex`.
2. Inspect computed styles.
3. Check HTML structure.
4. Verify parent/child relationship.
5. Check for overridden CSS.
6. Test with DevTools.

---

# Common Debugging Tools

✔ Chrome DevTools

✔ Firefox Developer Tools

Useful Features

- Elements panel
- Computed styles
- Box Model viewer
- Grid overlay
- Flexbox overlay
- Device toolbar
- Network tab

---

# Common Interview Questions

1. How do you debug CSS?
2. Which DevTools panels do you use most?
3. Why isn't z-index working?
4. Why isn't Flexbox/Grid working?
5. Why doesn't margin:auto center the element?
6. Why isn't the media query applying?
7. Why is the image overflowing?
8. Why isn't transition working?
9. Why is the page scrolling horizontally?
10. How do you debug specificity conflicts?

---

# Debugging Checklist

□ CSS file loaded

□ Correct selector

□ Correct specificity

□ No unexpected overrides

□ Layout mode enabled (Flex/Grid)

□ Widths and heights checked

□ Responsive breakpoints tested

□ Browser compatibility verified

□ Accessibility considered

□ Performance reviewed

---

# Final Interview Advice

When debugging:

- Reproduce the issue first.
- Change one thing at a time.
- Use DevTools instead of guessing.
- Explain your reasoning while fixing the bug.
- Verify the fix on different screen sizes when relevant.

Interviewers often value a **clear debugging process** as much as the final solution.

---