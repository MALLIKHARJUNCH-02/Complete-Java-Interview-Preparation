# CSS Interview Guide
# Part 7D.2B – CSS Coding Questions (26–50)

> Advanced Interview Coding Challenges

Difficulty Levels

🟢 Easy

🟡 Medium

🔴 Hard

---

# 26. Build a Responsive Navbar

Difficulty

🟡

Requirements

- Logo
- Navigation Links
- Mobile Friendly
- Hover Effects

Skills Tested

- Flexbox
- Media Queries
- Responsive Design

Expected Layout

Desktop

```
Logo          Home About Contact Login
```

Mobile

```
Logo

☰
```

Interview Follow-up

How would you convert this into a hamburger menu?

---

# 27. Create a Sidebar Layout

Difficulty

🟡

Requirements

```
--------------------------
Sidebar | Content
--------------------------
```

Skills

- Grid
- Flexbox
- Positioning

Hint

```css
grid-template-columns:250px 1fr;
```

---

# 28. Create a Responsive Footer

Difficulty

🟡

Requirements

- Four Columns
- Mobile Stack
- Social Icons

Skills

- Grid
- Flexbox

---

# 29. Build a Testimonial Card

Difficulty

🟡

Requirements

- Avatar
- Name
- Rating
- Comment
- Hover Animation

Skills

- Card Design
- Shadows
- Typography

---

# 30. Build a Timeline Component

Difficulty

🔴

Example

```
•

|

Project Started

|

•

|

Internship

|

•

|

Job
```

Skills

- Position
- Pseudo Elements
- Flexbox

---

# 31. Create an Accordion UI

Difficulty

🔴

Requirements

- Expand
- Collapse

Note

CSS-only solutions are possible with checkboxes/details elements, but JavaScript is commonly used for richer interactions.

---

# 32. Create a CSS Tooltip

Difficulty

🟡

Requirements

```
Hover

↓

Tooltip
```

Skills

- Position
- Opacity
- Transition
- Pseudo Elements

---

# 33. Create a Notification Badge

Difficulty

🟢

Example

```
🔔

  5
```

Skills

- Absolute Position
- Border Radius

---

# 34. Create a Profile Card

Difficulty

🟡

Requirements

- Image
- Name
- Role
- Skills
- Social Icons

---

# 35. Create a Responsive Statistics Section

Difficulty

🟡

Example

```
500+

Projects

200+

Clients

50+

Awards
```

Skills

- Grid
- Typography

---

# 36. Create a Masonry-style Layout

Difficulty

🔴

Expected

```
□ □

□□

□

□□□
```

Skills

- Grid (or modern masonry approaches where supported)
- Responsive Design

Interview Note

Native CSS masonry support is still evolving across browsers. Be prepared to discuss alternatives.

---

# 37. Build a Responsive Gallery

Difficulty

🟡

Requirements

- Hover
- Zoom
- Responsive

Skills

- Grid
- Overflow
- Transform

---

# 38. Build a Pricing Section

Difficulty

🟡

Requirements

```
Basic

Pro

Enterprise
```

Features

- Hover
- Popular Badge
- Buttons

---

# 39. Build a Team Section

Difficulty

🟡

Requirements

- Photo
- Name
- Role
- Social Icons

---

# 40. Build a Blog Card

Difficulty

🟡

Requirements

- Image
- Date
- Title
- Description
- Button

---

# 41. Build an Admin Dashboard

Difficulty

🔴

Layout

```
------------------------------

Sidebar

Header

Cards

Charts

Table

Footer

------------------------------
```

Skills

- CSS Grid
- Flexbox
- Responsive Layout

---

# 42. Create a Kanban Board

Difficulty

🔴

Columns

```
Todo

↓

Doing

↓

Done
```

Skills

- Grid
- Flexbox

---

# 43. Build a Calendar Layout

Difficulty

🔴

Requirements

```
Sun Mon Tue Wed Thu Fri Sat
```

Skills

- CSS Grid

---

# 44. Build a Chess Board

Difficulty

🟡

Requirements

```
8 x 8

Black

White
```

Skills

- Grid
- nth-child()

---

# 45. Build a Loading Skeleton

Difficulty

🔴

Requirements

- Animated Placeholder
- Shimmer Effect

Skills

- Gradients
- Animation
- Keyframes

---

# 46. Build a Search Bar UI

Difficulty

🟢

Requirements

- Icon
- Input
- Focus Effect

Skills

- Flexbox
- Focus States

---

# 47. Create a Multi-Step Progress Bar

Difficulty

🔴

Example

```
1

↓

2

↓

3

↓

4
```

Skills

- Flexbox
- Pseudo Elements
- Progress Indicators

---

# 48. Create a Responsive Form

Difficulty

🟡

Requirements

- Labels
- Inputs
- Validation Styles
- Mobile Friendly

Skills

- Forms
- Responsive Design
- Accessibility

---

# 49. Build a Hero Landing Page

Difficulty

🔴

Requirements

- Hero Image
- Heading
- CTA Button
- Responsive Layout
- Background Gradient

Skills

- Flexbox
- Grid
- Typography
- Responsive Design

---

# 50. Build an Entire Portfolio Homepage

Difficulty

🔴

Sections

- Hero
- About
- Skills
- Projects
- Experience
- Contact
- Footer

Skills Tested

- Layout
- Responsive Design
- Animations
- CSS Variables
- Grid
- Flexbox
- Performance
- Accessibility

This is an excellent capstone project that combines nearly every major CSS concept.

---

# Company-Specific Machine Round Tasks

## TCS

Tasks

- Center a Div
- Build a Login Page
- Create a Table Layout
- Responsive Form

Focus

CSS Basics

---

## Infosys

Tasks

- Responsive Navbar
- Flexbox Cards
- Footer
- Grid Gallery

Focus

Responsive Design

---

## Accenture

Tasks

- Pricing Cards
- Dashboard
- Login Page
- Sidebar

Focus

Flexbox + Grid

---

## Cognizant

Tasks

- Responsive Blog
- Product Card
- Statistics Section

Focus

Layout

---

## Capgemini

Tasks

- Gallery
- Timeline
- Card Hover Effects

Focus

Animations

---

## Zoho

Tasks

- Gmail-like Layout
- Trello Board
- Dashboard
- IDE Layout

Focus

Complex UI

---

## Amazon

Tasks

- Amazon Product Card
- Cart UI
- Navigation Bar
- Checkout Layout

Focus

Production-quality UI

Interview Expectations

- Clean Code
- Responsive
- Accessibility
- Performance

---

## Microsoft

Tasks

- Outlook Layout
- Teams Dashboard
- Calendar
- Admin Panel

Focus

Grid + Performance

---

## Google

Tasks

- Google Search Clone
- Material-style Cards
- Dashboard
- Responsive Layout

Focus

Clean, maintainable CSS

---

# Advanced Coding Challenges

## Challenge 1

Recreate the Google Homepage

Skills

- Flexbox
- Centering
- Forms
- Buttons

---

## Challenge 2

Recreate YouTube Homepage

Skills

- Grid
- Sidebar
- Cards
- Responsive Layout

---

## Challenge 3

Recreate Instagram Profile

Skills

- Grid
- Typography
- Images

---

## Challenge 4

Recreate Netflix Homepage

Skills

- Hero
- Cards
- Gradients
- Responsive Layout

---

## Challenge 5

Recreate LinkedIn Feed

Skills

- Grid
- Sidebar
- Feed Cards
- Sticky Elements

---

# What Interviewers Evaluate

✔ Semantic HTML structure

✔ Appropriate use of Flexbox and Grid

✔ Responsive Design

✔ Readable CSS

✔ Naming Convention

✔ Accessibility

✔ Performance

✔ Hover States

✔ Focus States

✔ Reusability

✔ Consistency

---

# Common Mistakes

❌ Fixed widths everywhere

❌ Too many media queries

❌ Deep selectors

❌ Excessive use of !important

❌ No keyboard focus styles

❌ Inconsistent spacing

❌ Poor color contrast

❌ Repeated CSS rules

❌ Ignoring mobile devices

❌ Unoptimized images

---

# Practice Strategy

Week 1

- Questions 1–15

Week 2

- Questions 16–30

Week 3

- Questions 31–40

Week 4

- Questions 41–50

Goal

Solve each challenge without looking at the solution first, then refactor your CSS for readability, responsiveness, and accessibility.

---