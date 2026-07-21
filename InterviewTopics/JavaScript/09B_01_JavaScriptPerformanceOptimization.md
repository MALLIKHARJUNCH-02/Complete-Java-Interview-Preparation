# JavaScript Interview Master Handbook
# Part 9.2A – JavaScript Performance Optimization (Fundamentals)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. What is Performance?
2. Why Performance Matters
3. Critical Rendering Path (CRP)
4. Rendering Pipeline
5. Reflow (Layout)
6. Repaint
7. Reflow vs Repaint
8. Layout Thrashing
9. Measuring Performance
10. Best Practices
11. Common Mistakes
12. Interview Questions
13. Output Questions
14. Coding Exercises
15. Cheat Sheet

---

# 1. What is Performance?

Performance means

```
How fast

and

how efficiently

your application responds.
```

Good Performance

✔ Fast loading

✔ Smooth animations

✔ Responsive UI

✔ Low memory usage

✔ Low CPU usage

---

# 2. Why Performance Matters

Slow websites cause

```
Slow Page

↓

Poor UX

↓

Users Leave

↓

Lower Revenue
```

Performance affects

✔ User Experience

✔ SEO

✔ Accessibility

✔ Conversion Rate

✔ Battery Usage

---

# 3. Critical Rendering Path (CRP)

## Definition

The Critical Rendering Path is the sequence of steps the browser performs to display a web page.

Pipeline

```
HTML

↓

DOM

+

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

↓

Screen
```

---

### Step 1

Parse HTML

↓

Create DOM Tree

---

### Step 2

Parse CSS

↓

Create CSSOM

---

### Step 3

Merge

```
DOM

+

CSSOM

↓

Render Tree
```

---

### Step 4

Layout

Calculate

✔ Width

✔ Height

✔ Position

---

### Step 5

Paint

Draw

✔ Text

✔ Borders

✔ Colors

✔ Images

---

### Step 6

Composite

GPU combines layers

↓

Display

---

# 4. Rendering Pipeline

Visualization

```
HTML

↓

DOM

↓

Render Tree

↓

Layout

↓

Paint

↓

Composite
```

Interview Tip

Layout and Paint are expensive operations.

---

# 5. Reflow (Layout)

## Definition

Reflow occurs when the browser recalculates the size or position of elements.

Example

```javascript
box.style.width = "300px";
```

Browser recalculates

↓

Layout

---

Operations That Can Trigger Layout

✔ Width

✔ Height

✔ Margin

✔ Padding

✔ Font Size

✔ Position

✔ Display

---

# 6. Repaint

## Definition

Repaint redraws pixels without recalculating layout.

Example

```javascript
box.style.background = "red";
```

Only appearance changes.

No layout calculation.

---

# 7. Reflow vs Repaint

| Reflow | Repaint |
|---------|----------|
| Recalculates layout | Redraws pixels |
| Expensive | Less expensive |
| May trigger repaint | Does not require layout |

---

Visualization

```
Change Width

↓

Layout

↓

Paint

↓

Composite
```

```
Change Background

↓

Paint

↓

Composite
```

---

# 8. Layout Thrashing

Definition

Alternating DOM reads and writes repeatedly, forcing unnecessary layouts.

Bad Example

```javascript
for(let i=0;i<1000;i++){

    const w = box.offsetWidth;

    box.style.width = (w + 1) + "px";

}
```

Flow

```
Read Layout

↓

Write Style

↓

Read Again

↓

Write Again

↓

Repeated Layouts
```

---

Better

```javascript
const width = box.offsetWidth;

for(let i=0;i<1000;i++){

    box.style.width = (width + i) + "px";

}
```

Read once.

Write many.

---

# 9. Measuring Performance

Use

```javascript
performance.now();
```

Example

```javascript
const start = performance.now();

// Work

const end = performance.now();

console.log(end - start);
```

---

Chrome DevTools

✔ Performance Panel

✔ Lighthouse

✔ Memory Panel

✔ Rendering Panel

---

# 10. Best Practices

✔ Minimize DOM updates.

✔ Batch DOM writes.

✔ Avoid layout thrashing.

✔ Use CSS transforms for animations.

✔ Use requestAnimationFrame() for animations.

✔ Reduce unnecessary reflows.

✔ Measure before optimizing.

---

# 11. Common Mistakes

❌ Reading layout repeatedly.

❌ Updating DOM inside loops.

❌ Animating width/height when transform is sufficient.

❌ Measuring performance with Date.now() when high-resolution timing is needed.

❌ Optimizing without profiling.

---

# 12. Frequently Asked Interview Questions

1. What is Performance?

2. What is the Critical Rendering Path?

3. Explain the rendering pipeline.

4. Difference between DOM and Render Tree?

5. What is Layout?

6. What is Paint?

7. What is Composite?

8. What is Reflow?

9. What triggers Reflow?

10. What is Repaint?

11. Difference between Reflow and Repaint?

12. What is Layout Thrashing?

13. How do you avoid Layout Thrashing?

14. Why is Reflow expensive?

15. Which is cheaper?

```
Reflow

or

Repaint
```

Answer

```
Repaint
```

---

# 13. Output Questions

## Q1

```javascript
box.style.width = "200px";
```

Question

Triggers?

Answer

```
Layout

↓

Paint

↓

Composite
```

---

## Q2

```javascript
box.style.background = "red";
```

Question

Triggers?

Answer

```
Paint

↓

Composite
```

---

## Q3

```javascript
console.log(performance.now());
```

Output

```
High-resolution timestamp
```

---

## Q4

```javascript
const width = box.offsetWidth;
```

Question

May force layout?

Answer

```
Yes
```

---

## Q5

```javascript
box.style.transform = "translateX(20px)";
```

Question

Preferred for animation?

Answer

```
Yes

Often avoids layout and uses compositing.
```

---

# 14. Coding Exercises

## Beginner

1. Measure execution time.

2. Compare width vs background changes.

3. Detect layout thrashing.

4. Use requestAnimationFrame().

5. Optimize repeated DOM updates.

---

## Intermediate

6. Build a smooth animation.

7. Optimize scrolling.

8. Profile rendering.

9. Batch DOM updates.

10. Compare transform vs left animations.

---

## Advanced

11. Optimize a dashboard.

12. Eliminate layout thrashing.

13. Improve animation FPS.

14. Optimize rendering pipeline.

15. Profile and fix rendering bottlenecks.

---

# 15. Cheat Sheet

```text
Performance

↓

Critical Rendering Path

↓

HTML

↓

DOM

+

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

---------------------------------

Reflow

↓

Position / Size Changes

---------------------------------

Repaint

↓

Visual Changes

---------------------------------

Layout Thrashing

↓

Repeated Read

↓

Repeated Write

---------------------------------

Measure

performance.now()
```

---

# Quick Revision

✔ Performance is about speed, responsiveness, and efficient resource usage.

✔ Browsers follow the Critical Rendering Path to display a page.

✔ HTML creates the DOM.

✔ CSS creates the CSSOM.

✔ DOM + CSSOM = Render Tree.

✔ Layout calculates element size and position.

✔ Paint draws pixels.

✔ Composite combines layers for display.

✔ Reflow recalculates layout and is expensive.

✔ Repaint redraws visual changes without layout.

✔ Layout Thrashing occurs when reads and writes are interleaved repeatedly.

✔ Use `performance.now()` and browser profiling tools before optimizing.

---