# CSS Interview Guide
# Part 7C.1 – Advanced CSS Interview Questions (1–35)

---

# Companies

These questions are commonly asked in

- TCS
- Infosys
- Accenture
- Cognizant
- Capgemini
- Deloitte
- HCLTech
- Tech Mahindra
- Wipro
- Zoho
- Amazon
- Microsoft
- Google

---

# 1. What is CSS?

Answer

CSS (Cascading Style Sheets) is a stylesheet language used to describe the presentation of HTML documents.

It controls

- Colors
- Fonts
- Layout
- Spacing
- Animations
- Responsive Design

---

# 2. Why is CSS called Cascading?

Answer

"Cascading" means multiple style rules can apply to the same element.

The browser decides which rule wins based on

- Importance
- Specificity
- Source Order

---

# 3. Difference between HTML and CSS?

| HTML | CSS |
|------|------|
| Structure | Presentation |
| Markup Language | Style Sheet Language |
| Creates Elements | Styles Elements |

---

# 4. How many ways can CSS be applied?

Answer

Three

- Inline CSS
- Internal CSS
- External CSS

Preferred

External CSS

---

# 5. Which CSS type is recommended?

Answer

External CSS.

Reasons

- Reusable
- Cacheable
- Easier Maintenance
- Cleaner HTML

---

# 6. Difference between Inline, Internal and External CSS?

| Inline | Internal | External |
|---------|----------|-----------|
| style attribute | style tag | CSS file |
| Highest specificity | Medium | Best Practice |

---

# 7. What are Selectors?

Answer

Selectors identify HTML elements that CSS should style.

Examples

```css
h1

#title

.card

button:hover
```

---

# 8. Difference between id and class?

| id | class |
|-----|--------|
| Unique | Reusable |
| # | . |
| Higher Specificity | Lower Specificity |

---

# 9. What is Universal Selector?

```css
*{

margin:0;

padding:0;

}
```

Selects every element.

---

# 10. Difference between Descendant and Child Selector?

Descendant

```css
div p
```

Matches every paragraph inside div.

Child

```css
div > p
```

Matches only direct children.

---

# 11. Difference between display:none and visibility:hidden?

| display:none | visibility:hidden |
|---------------|-------------------|
| Removed from Layout | Space Reserved |
| Invisible | Invisible |

---

# 12. Difference between opacity:0 and visibility:hidden?

| opacity:0 | visibility:hidden |
|------------|------------------|
| Transparent | Hidden |
| Space Reserved | Space Reserved |
| Can still receive pointer events unless disabled | Not visible; behavior depends on interaction handling |

---

# 13. Explain CSS Box Model.

Answer

Every element consists of

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

# 14. Difference between Margin and Padding?

| Margin | Padding |
|----------|----------|
| Outside | Inside |
| Can be Negative | Cannot be Negative |

---

# 15. Can Margin be Negative?

Answer

Yes.

Padding cannot.

---

# 16. Difference between Border and Outline?

Border

↓

Part of box model.

Outline

↓

Outside border.

Doesn't affect layout.

---

# 17. Why use box-sizing:border-box?

Answer

Because width and height include padding and border, making layouts easier to manage.

---

# 18. Difference between Block and Inline Elements?

Block

- New Line
- Full Width

Inline

- Same Line
- Required Width

---

# 19. Difference between Inline and Inline-block?

Inline

Cannot reliably set width and height.

Inline-block

Supports width and height while remaining inline.

---

# 20. Difference between Relative and Absolute Position?

Relative

Moves from original position.

Absolute

Moves relative to nearest positioned ancestor.

---

# 21. Difference between Fixed and Sticky?

Fixed

Always fixed to viewport.

Sticky

Acts relative until scroll threshold.

Then becomes fixed.

---

# 22. Why isn't z-index working?

Possible Reasons

- Element not positioned
- Different stacking context
- Parent stacking context

---

# 23. What is Flexbox?

Answer

One-dimensional layout system.

Used for

Rows

OR

Columns

---

# 24. What is Grid?

Answer

Two-dimensional layout system.

Rows

AND

Columns

---

# 25. Difference between Grid and Flexbox?

| Grid | Flexbox |
|-------|----------|
| 2D | 1D |
| Layout | Components |

---

# 26. Difference between justify-content and align-items?

justify-content

Main Axis

align-items

Cross Axis

---

# 27. Difference between align-items and align-content?

align-items

Individual items.

align-content

Multiple flex/grid lines.

---

# 28. What is gap?

Answer

Adds spacing between flex/grid items.

Preferred over margins between items.

---

# 29. What is CSS Specificity?

Answer

Specificity determines which selector wins when multiple rules match.

Priority

```
Inline

↓

ID

↓

Class

↓

Element
```

---

# 30. What is !important?

Answer

Overrides normal specificity.

Avoid excessive use.

---

# 31. Difference between Transition and Animation?

| Transition | Animation |
|------------|-----------|
| Needs Trigger | Automatic Possible |
| Two States | Multiple Keyframes |

---

# 32. Why animate transform instead of left?

Answer

`transform` generally provides smoother animations because it avoids changing document layout and is often optimized by browsers.

---

# 33. Difference between rem and em?

| rem | em |
|------|------|
| Root Font Size | Parent Font Size |

---

# 34. Difference between width:100% and max-width:100%?

width:100%

Always fills the parent's width.

max-width:100%

Prevents an element (such as an image) from exceeding its container while allowing it to remain smaller if appropriate.

---

# 35. Why use CSS Variables?

Answer

Advantages

- Reusable
- Easy Maintenance
- Theme Support
- Less Repetition

Example

```css
:root{

--primary:#2563eb;

}

button{

background:

var(--primary);

}
```

---

# Rapid Fire Round

✔ CSS stands for?

→ Cascading Style Sheets

✔ Highest specificity?

→ Inline Style (ignoring !important)

✔ Reusable selector?

→ Class

✔ Unique selector?

→ ID

✔ Default position?

→ static

✔ Default display of div?

→ block

✔ Default display of span?

→ inline

✔ Flexbox dimension?

→ One

✔ Grid dimension?

→ Two

✔ Default flex-direction?

→ row

✔ Default flex-wrap?

→ nowrap

✔ Default justify-content?

→ flex-start

✔ Default align-items?

→ stretch

✔ Property for stacking?

→ z-index

✔ Property for spacing?

→ gap

✔ Responsive typography?

→ clamp()

✔ Best responsive unit?

→ rem (for typography)

✔ Best layout?

→ Depends on the problem (Grid for 2D, Flexbox for 1D)

---

# Interview Tips

For fresher interviews, focus on explaining:

- Box Model
- Specificity
- Flexbox
- Grid
- Position
- Display
- Responsive Design

Don't just define concepts.

Always explain

- What it is
- Why it is used
- Real-world example
- Common mistakes

---