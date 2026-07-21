# CSS Interview Guide
# Part 7D.2A – CSS Coding Questions (1–25)

---

# Difficulty Levels

🟢 Easy

🟡 Medium

🔴 Hard

---

# 1. Create a Red Square

Difficulty

🟢 Easy

Problem

Create a red square of 200 × 200 pixels.

Expected Skills

- width
- height
- background-color

Example Solution

```css
.square{
    width:200px;
    height:200px;
    background:red;
}
```

---

# 2. Create a Perfect Circle

Difficulty

🟢

Skills

- border-radius

```css
.circle{
    width:150px;
    height:150px;
    background:#3498db;
    border-radius:50%;
}
```

Interview Follow-up

How do you create an ellipse?

Answer

Use different width and height.

---

# 3. Center a Div Horizontally

Difficulty

🟢

```css
.box{
    width:300px;
    margin:auto;
}
```

Alternative

Flexbox

Grid

---

# 4. Center a Div Horizontally and Vertically

Difficulty

🟢

```css
body{
    display:flex;
    justify-content:center;
    align-items:center;
    min-height:100vh;
}
```

Alternative

```css
body{
    display:grid;
    place-items:center;
}
```

---

# 5. Create a Responsive Image

Difficulty

🟢

```css
img{
    max-width:100%;
    height:auto;
}
```

---

# 6. Create a Responsive Card

Difficulty

🟢

```css
.card{
    width:min(350px,100%);
    padding:20px;
    border-radius:10px;
    box-shadow:0 5px 15px rgba(0,0,0,.2);
}
```

---

# 7. Create a Hover Button

Difficulty

🟢

```css
button{
    transition:.3s;
}

button:hover{
    background:black;
    color:white;
}
```

---

# 8. Build a Navigation Bar

Difficulty

🟡

Expected Skills

- Flexbox
- justify-content
- align-items

```css
nav{
    display:flex;
    justify-content:space-between;
    align-items:center;
}
```

---

# 9. Create Equal Width Cards

Difficulty

🟡

```css
.container{
    display:flex;
    gap:20px;
}

.card{
    flex:1;
}
```

---

# 10. Responsive Card Layout

Difficulty

🟡

```css
.container{
    display:grid;
    grid-template-columns:
        repeat(auto-fit,minmax(250px,1fr));
    gap:20px;
}
```

---

# 11. Sticky Navbar

Difficulty

🟡

```css
nav{
    position:sticky;
    top:0;
}
```

---

# 12. Fixed Floating Button

Difficulty

🟢

```css
button{
    position:fixed;
    bottom:20px;
    right:20px;
}
```

---

# 13. Two Column Layout

Difficulty

🟡

```css
.container{
    display:grid;
    grid-template-columns:
        250px 1fr;
}
```

---

# 14. Three Equal Columns

Difficulty

🟢

```css
.container{
    display:grid;
    grid-template-columns:
        repeat(3,1fr);
}
```

---

# 15. Responsive Hero Section

Difficulty

🟡

Requirements

- Full Screen
- Center Content

```css
.hero{
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}
```

---

# 16. Card Hover Animation

Difficulty

🟡

```css
.card{
    transition:.3s;
}

.card:hover{
    transform:translateY(-10px);
}
```

Interview Tip

Prefer transform over changing top.

---

# 17. Image Zoom on Hover

Difficulty

🟡

```css
img{
    transition:.3s;
}

img:hover{
    transform:scale(1.1);
}
```

---

# 18. Create a Glassmorphism Card

Difficulty

🔴

```css
.card{
    background:rgba(255,255,255,.15);
    backdrop-filter:blur(20px);
    border:1px solid rgba(255,255,255,.3);
}
```

---

# 19. Dark Mode Theme

Difficulty

🟡

```css
:root{
    --bg:white;
    --text:black;
}

.dark{
    --bg:#111;
    --text:white;
}

body{
    background:var(--bg);
    color:var(--text);
}
```

---

# 20. Create a Loading Spinner

Difficulty

🔴

```css
.spinner{
    width:40px;
    height:40px;
    border:5px solid #ddd;
    border-top-color:#3498db;
    border-radius:50%;
    animation:spin 1s linear infinite;
}

@keyframes spin{
    to{
        transform:rotate(360deg);
    }
}
```

---

# 21. Responsive Pricing Cards

Difficulty

🔴

Requirements

- Responsive
- Equal Height
- Hover Effect

Skills Tested

- Grid
- Flexbox
- Gap
- Card Design

Hint

Use

```css
repeat(auto-fit,minmax(280px,1fr))
```

---

# 22. Build a Dashboard Layout

Difficulty

🔴

Expected Layout

```
-------------------------
Sidebar | Main Content
-------------------------
```

Hint

```css
250px 1fr
```

---

# 23. Responsive Photo Gallery

Difficulty

🔴

Hint

```css
display:grid;

repeat(auto-fit,minmax(200px,1fr))
```

---

# 24. Build an E-commerce Product Card

Difficulty

🔴

Requirements

- Image
- Title
- Price
- Rating
- Button
- Hover Effect

Skills

- Flexbox
- Grid
- Shadows
- Typography

---

# 25. Build a Responsive Login Page

Difficulty

🔴

Requirements

- Center Form
- Mobile Responsive
- Hover Effects
- Focus Effects
- Validation Styling

Skills Tested

- Flexbox
- Grid
- Responsive Design
- Forms
- Accessibility

---

# Common Follow-up Questions

After every coding question, interviewers may ask:

1. Can you make it responsive?
2. Can you do it using Grid?
3. Can you do it using Flexbox?
4. Can you animate it?
5. Can you improve accessibility?
6. Can you optimize performance?
7. Can you reduce the amount of CSS?
8. Can you avoid media queries?
9. Can you support dark mode?
10. Can you explain why you chose this approach?

---

# Coding Interview Tips

✔ Start with HTML structure first.

✔ Add layout before colors.

✔ Use semantic class names.

✔ Prefer Flexbox for one-dimensional layouts.

✔ Prefer Grid for page layouts.

✔ Use `gap` instead of margins between flex/grid items.

✔ Keep CSS organized and reusable.

✔ Test responsiveness while coding.

✔ Think about accessibility (focus states, contrast, keyboard navigation).

✔ Explain your thought process while writing code.

---