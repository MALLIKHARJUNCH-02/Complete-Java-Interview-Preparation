# JavaScript Interview Master Handbook
# Part 9.2B – Debouncing, Throttling, Lazy Loading & Bundle Optimization

> Beginner → Advanced → Interview Ready

--------------------------------------------------
TABLE OF CONTENTS
--------------------------------------------------

1. Debouncing
2. Throttling
3. Debounce vs Throttle
4. requestAnimationFrame() vs setTimeout()
5. Lazy Loading
6. Dynamic import()
7. Code Splitting
8. Tree Shaking
9. Dead Code Elimination
10. Prefetch vs Preload
11. Bundle Analysis
12. Best Practices
13. Common Mistakes
14. Interview Questions
15. Output Questions
16. Coding Exercises
17. Cheat Sheet

--------------------------------------------------
1. DEBOUNCING
--------------------------------------------------

Definition

Execute a function

ONLY AFTER

the user stops triggering an event
for a specified delay.

Example

Search Box

```
Typing

↓

a

↓

ab

↓

abc

↓

Wait

↓

Search API
```

Without Debounce

```
Typing

↓

10 API Calls
```

With Debounce

```
Typing

↓

Wait

↓

1 API Call
```

--------------------------------------------------

Implementation

```javascript
function debounce(fn, delay){

    let timer;

    return function(...args){

        clearTimeout(timer);

        timer = setTimeout(()=>{

            fn.apply(this,args);

        }, delay);

    };

}
```

Usage

```javascript
const search = debounce(()=>{

    console.log("Searching...");

},500);
```

--------------------------------------------------
2. THROTTLING
--------------------------------------------------

Definition

Execute a function

AT MOST

once every specified interval.

Example

Scroll Event

```
Scroll

↓

Runs Every 200ms
```

Implementation

```javascript
function throttle(fn, delay){

    let waiting = false;

    return function(...args){

        if(waiting) return;

        fn.apply(this,args);

        waiting = true;

        setTimeout(()=>{

            waiting = false;

        },delay);

    };

}
```

--------------------------------------------------
3. DEBOUNCE vs THROTTLE
--------------------------------------------------

Debounce

```
Wait

↓

Execute Once
```

Throttle

```
Execute

↓

Wait

↓

Execute Again
```

Comparison

| Debounce | Throttle |
|-----------|-----------|
| Executes after inactivity | Executes at fixed intervals |
| Best for search | Best for scrolling |
| Reduces unnecessary work | Limits execution frequency |

--------------------------------------------------
4. requestAnimationFrame() vs setTimeout()
--------------------------------------------------

setTimeout()

```javascript
setTimeout(update,16);
```

Problems

❌ Timing is not synchronized with browser repaint.

--------------------------------------------------

requestAnimationFrame()

```javascript
requestAnimationFrame(update);
```

Benefits

✔ Runs before repaint

✔ Smooth animations

✔ Automatically pauses in inactive tabs

--------------------------------------------------

Comparison

| requestAnimationFrame | setTimeout |
|-----------------------|------------|
| Animation | General scheduling |
| Browser synchronized | Time-based |
| Better FPS | Can stutter |

--------------------------------------------------
5. LAZY LOADING
--------------------------------------------------

Definition

Load resources

ONLY WHEN NEEDED.

Without Lazy Loading

```
100 Images

↓

Load All
```

With Lazy Loading

```
100 Images

↓

Load Visible Images

↓

Load Others Later
```

--------------------------------------------------

Native HTML

```html
<img src="image.jpg"

loading="lazy">
```

--------------------------------------------------

JavaScript

Use

```
IntersectionObserver
```

to load content when it becomes visible.

--------------------------------------------------
6. DYNAMIC import()
--------------------------------------------------

Instead of

```javascript
import Dashboard from "./Dashboard";
```

Load when needed

```javascript
const Dashboard =

await import("./Dashboard.js");
```

Benefits

✔ Smaller initial bundle

✔ Faster first load

--------------------------------------------------
7. CODE SPLITTING
--------------------------------------------------

Definition

Split one large JavaScript bundle into
smaller bundles.

Without

```
500KB

↓

One Bundle
```

With

```
Home Bundle

Dashboard Bundle

Admin Bundle
```

Each page loads only what it needs.

--------------------------------------------------

React Example

```javascript
const Dashboard =

React.lazy(

()=>import("./Dashboard")

);
```

--------------------------------------------------
8. TREE SHAKING
--------------------------------------------------

Definition

Remove

UNUSED

code during the build process.

Example

```javascript
export function add(){}

export function sub(){}

export function mul(){}
```

Used

```javascript
import { add }

from "./math";
```

Build Output

```
Only add()

Included
```

Requirements

✔ ES Modules

✔ Bundler support

--------------------------------------------------
9. DEAD CODE ELIMINATION
--------------------------------------------------

Definition

Remove code that can never execute.

Example

```javascript
if(false){

    console.log("Hello");

}
```

Optimizer removes it.

--------------------------------------------------
10. PREFETCH vs PRELOAD
--------------------------------------------------

Preload

```
Needed Soon

↓

High Priority
```

Example

```html
<link rel="preload"
      href="font.woff2"
      as="font">
```

--------------------------------------------------

Prefetch

```
Needed Later

↓

Low Priority
```

Example

```html
<link rel="prefetch"
      href="dashboard.js">
```

--------------------------------------------------

Comparison

| Preload | Prefetch |
|----------|-----------|
| Current page | Future navigation |
| High priority | Low priority |

--------------------------------------------------
11. BUNDLE ANALYSIS
--------------------------------------------------

Purpose

Understand bundle size.

Popular Tools

✔ webpack-bundle-analyzer

✔ Vite Bundle Visualizer

✔ Source Map Explorer

Questions to Ask

- Which dependencies are largest?
- Are duplicate libraries included?
- Can code be split?
- Can unused code be removed?

--------------------------------------------------
12. BEST PRACTICES
--------------------------------------------------

✔ Debounce search inputs.

✔ Throttle scroll/resize handlers.

✔ Lazy load images.

✔ Code split large applications.

✔ Enable tree shaking.

✔ Analyze bundle size regularly.

✔ Remove unused dependencies.

--------------------------------------------------
13. COMMON MISTAKES
--------------------------------------------------

❌ Debouncing scroll events that need continuous updates.

❌ Throttling text search.

❌ Loading every route on startup.

❌ Importing huge libraries for tiny features.

❌ Ignoring bundle size growth.

--------------------------------------------------
14. FREQUENTLY ASKED INTERVIEW QUESTIONS
--------------------------------------------------

1. What is Debouncing?

2. What is Throttling?

3. Difference between Debounce and Throttle?

4. When should you use Debouncing?

5. When should you use Throttling?

6. Why is requestAnimationFrame() better for animations?

7. What is Lazy Loading?

8. What is Dynamic import()?

9. What is Code Splitting?

10. What is Tree Shaking?

11. What is Dead Code Elimination?

12. Difference between Preload and Prefetch?

13. What is Bundle Analysis?

14. How does React.lazy() work?

15. Why should initial bundles be small?

--------------------------------------------------
15. OUTPUT QUESTIONS
--------------------------------------------------

Q1

```javascript
const search = debounce(fn,500);

search();

search();

search();
```

Output

```
One Execution

(after 500ms)
```

--------------------------------------------------

Q2

```javascript
const scroll = throttle(fn,1000);
```

Scroll continuously

Output

```
Runs

Every

1 Second
```

--------------------------------------------------

Q3

```javascript
requestAnimationFrame(update);
```

Question

When does it execute?

Answer

```
Before

Next Browser Repaint
```

--------------------------------------------------

Q4

```html
<img loading="lazy">
```

Result

```
Image loads

When Needed
```

--------------------------------------------------

Q5

```javascript
import("./dashboard.js");
```

Question

When is the file downloaded?

Answer

```
When

import()

Executes
```

--------------------------------------------------
16. CODING EXERCISES
--------------------------------------------------

Beginner

1. Implement debounce().
2. Implement throttle().
3. Lazy load images.
4. Dynamically import a module.
5. Measure bundle size.

Intermediate

6. Build an autocomplete search.
7. Optimize infinite scrolling.
8. Split routes in React.
9. Add lazy-loaded components.
10. Analyze bundle output.

Advanced

11. Build a reusable debounce utility.
12. Create a virtualized scrolling list.
13. Optimize a dashboard with code splitting.
14. Reduce bundle size by removing unused code.
15. Compare preload and prefetch strategies.

--------------------------------------------------
17. CHEAT SHEET
--------------------------------------------------

Debounce

↓

Wait

↓

Execute Once

---------------------------------

Throttle

↓

Execute

↓

Wait

↓

Execute Again

---------------------------------

Animations

↓

requestAnimationFrame()

---------------------------------

Images

↓

Lazy Loading

---------------------------------

Modules

↓

Dynamic import()

---------------------------------

Large Apps

↓

Code Splitting

---------------------------------

Unused Code

↓

Tree Shaking

↓

Dead Code Elimination

---------------------------------

Resources

Preload

↓

Current Page

Prefetch

↓

Future Navigation

--------------------------------------------------
18. QUICK REVISION
--------------------------------------------------

✔ Debouncing waits until activity stops.

✔ Throttling limits execution frequency.

✔ requestAnimationFrame() is best for animations.

✔ Lazy loading reduces initial page load.

✔ Dynamic import() loads code on demand.

✔ Code splitting reduces initial bundle size.

✔ Tree shaking removes unused ES module exports.

✔ Dead code elimination removes unreachable code.

✔ Preload prioritizes current-page resources.

✔ Prefetch prepares resources for future navigation.

✔ Bundle analysis helps identify optimization opportunities.

---