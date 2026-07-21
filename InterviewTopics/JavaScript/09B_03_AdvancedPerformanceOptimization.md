# JavaScript Interview Master Handbook
# Part 9.2C – Advanced Performance Optimization

> Beginner → Advanced → Interview Ready

--------------------------------------------------
TABLE OF CONTENTS
--------------------------------------------------

1. Memoization
2. Caching Strategies
3. Virtualization (Virtual Scrolling)
4. Image Optimization
5. Font Optimization
6. Resource Hints
7. Service Workers
8. WebAssembly (WASM)
9. Core Web Vitals
10. Lighthouse
11. Memory Leak Detection
12. Chrome DevTools Profiling
13. Best Practices
14. Interview Questions
15. Scenario Questions
16. Coding Exercises
17. Cheat Sheet

--------------------------------------------------
1. MEMOIZATION
--------------------------------------------------

Definition

Store expensive computation results

↓

Reuse later

instead of recalculating.

Example

Without Memoization

```
fib(40)

↓

Every recursive call

↓

Very Slow
```

With Memoization

```
fib(40)

↓

Store Result

↓

Next Call

↓

Instant
```

Example

```javascript
function memoize(fn){

    const cache = new Map();

    return function(...args){

        const key = JSON.stringify(args);

        if(cache.has(key)){

            return cache.get(key);

        }

        const result = fn(...args);

        cache.set(key,result);

        return result;

    };

}
```

Use Cases

✔ Expensive calculations

✔ Parsing

✔ Data transformation

✔ React selectors

--------------------------------------------------
2. CACHING STRATEGIES
--------------------------------------------------

Browser Cache

↓

Reuse downloaded resources

--------------------------------------------------

Memory Cache

↓

Fastest

↓

Lost after refresh

--------------------------------------------------

Disk Cache

↓

Persistent

↓

Survives browser restart

--------------------------------------------------

Application Cache

Examples

✔ IndexedDB

✔ localStorage

✔ Cache Storage API

--------------------------------------------------

Caching Patterns

```
Cache First

Network First

Stale While Revalidate

Cache Only

Network Only
```

--------------------------------------------------
3. VIRTUALIZATION
--------------------------------------------------

Problem

100,000 rows

↓

Browser renders

↓

Slow

--------------------------------------------------

Virtualization

Render

ONLY

visible items.

```
100,000 Items

↓

Visible 20

↓

Render 20
```

Libraries

✔ react-window

✔ react-virtualized

Use Cases

✔ Tables

✔ Chat

✔ Logs

✔ Large Lists

--------------------------------------------------
4. IMAGE OPTIMIZATION
--------------------------------------------------

Best Practices

✔ Use WebP or AVIF

✔ Compress images

✔ Responsive images

✔ Lazy loading

✔ Appropriate dimensions

Example

```html
<img
  src="photo.webp"
  loading="lazy"
  width="400"
  height="300"
  alt="Photo">
```

Responsive

```html
<img
srcset="small.webp 480w,
        medium.webp 800w,
        large.webp 1200w"
sizes="(max-width:600px) 480px,
       800px"
src="medium.webp"
alt="">
```

--------------------------------------------------
5. FONT OPTIMIZATION
--------------------------------------------------

Problems

Large Fonts

↓

Slow Rendering

Solutions

✔ WOFF2

✔ Subset Fonts

✔ font-display

Example

```css
@font-face{

font-family:Roboto;

src:url(font.woff2);

font-display:swap;

}
```

Benefits

↓

Text appears immediately.

--------------------------------------------------
6. RESOURCE HINTS
--------------------------------------------------

Preload

```
Need Soon
```

```html
<link
rel="preload"
href="font.woff2"
as="font">
```

--------------------------------------------------

Prefetch

```
Need Later
```

```html
<link
rel="prefetch"
href="dashboard.js">
```

--------------------------------------------------

Preconnect

```html
<link
rel="preconnect"
href="https://cdn.example.com">
```

Establishes DNS, TCP, and TLS early.

--------------------------------------------------

DNS Prefetch

```html
<link
rel="dns-prefetch"
href="//cdn.example.com">
```

Only resolves DNS.

--------------------------------------------------
7. SERVICE WORKERS
--------------------------------------------------

Definition

JavaScript running in the background

between

Browser

↓

Network

Use Cases

✔ Offline Support

✔ Push Notifications

✔ Asset Caching

Flow

```
Browser

↓

Service Worker

↓

Cache?

↓

Yes

↓

Return

↓

Else

↓

Network
```

Simple Registration

```javascript
if("serviceWorker" in navigator){

navigator.serviceWorker.register("/sw.js");

}
```

--------------------------------------------------
8. WEBASSEMBLY (WASM)
--------------------------------------------------

Definition

Portable binary format

for near-native execution.

Flow

```
C/C++

↓

Compile

↓

WASM

↓

Browser
```

Use Cases

✔ Games

✔ CAD

✔ Video Editing

✔ Image Processing

✔ Scientific Computing

Not a replacement for JavaScript.

--------------------------------------------------
9. CORE WEB VITALS
--------------------------------------------------

LCP

Largest Contentful Paint

↓

Loading Performance

Target

```
≤ 2.5 seconds
```

--------------------------------------------------

CLS

Cumulative Layout Shift

↓

Visual Stability

Target

```
≤ 0.1
```

--------------------------------------------------

INP

Interaction to Next Paint

↓

Responsiveness

Target

```
≤ 200 ms
```

Improve LCP

✔ Optimize images

✔ Faster server

✔ Reduce render-blocking resources

Improve CLS

✔ Set image dimensions

✔ Reserve layout space

Improve INP

✔ Reduce long tasks

✔ Optimize JavaScript

✔ Avoid blocking the main thread

--------------------------------------------------
10. LIGHTHOUSE
--------------------------------------------------

Measures

✔ Performance

✔ Accessibility

✔ Best Practices

✔ SEO

✔ PWA

Score

```
0

↓

100
```

Useful Metrics

✔ LCP

✔ CLS

✔ INP

✔ Total Blocking Time

✔ Speed Index

--------------------------------------------------
11. MEMORY LEAK DETECTION
--------------------------------------------------

Causes

✔ Unremoved Event Listeners

✔ Uncleared Timers

✔ Detached DOM Nodes

✔ Large Closures

✔ Global Variables

Example

Bad

```javascript
button.addEventListener(

"click",

handler

);
```

Removed?

```
No
```

Memory retained.

Good

```javascript
button.removeEventListener(

"click",

handler

);
```

Also clear

```javascript
clearInterval(id);

clearTimeout(id);
```

--------------------------------------------------
12. CHROME DEVTOOLS PROFILING
--------------------------------------------------

Performance Panel

↓

CPU

↓

Rendering

↓

FPS

↓

Network

--------------------------------------------------

Memory Panel

↓

Heap Snapshot

↓

Garbage Collection

↓

Leaks

--------------------------------------------------

Coverage Tab

↓

Unused CSS

↓

Unused JS

--------------------------------------------------

Network Panel

↓

Large Files

↓

Slow Requests

↓

Caching

--------------------------------------------------
13. BEST PRACTICES
--------------------------------------------------

✔ Measure before optimizing.

✔ Cache wisely.

✔ Lazy load resources.

✔ Virtualize huge lists.

✔ Compress images.

✔ Use modern formats.

✔ Remove memory leaks.

✔ Keep bundles small.

✔ Optimize Core Web Vitals.

--------------------------------------------------
14. FREQUENTLY ASKED INTERVIEW QUESTIONS
--------------------------------------------------

1. What is Memoization?

2. Difference between Memoization and Caching?

3. What is Virtualization?

4. Why virtualize lists?

5. Best image format?

Answer

```
WebP

or

AVIF
```

6. What is font-display: swap?

7. Difference between preload and prefetch?

8. What is preconnect?

9. What is a Service Worker?

10. Difference between Service Worker and Web Worker?

11. What is WASM?

12. What are Core Web Vitals?

13. Difference between LCP, CLS, and INP?

14. How do you detect memory leaks?

15. Which DevTools panel is used for performance profiling?

--------------------------------------------------
15. SCENARIO QUESTIONS
--------------------------------------------------

Scenario 1

100,000-row table

Solution?

```
Virtualization
```

--------------------------------------------------

Scenario 2

Search API

User types continuously.

Solution?

```
Debounce
```

--------------------------------------------------

Scenario 3

Scroll animation.

Solution?

```
requestAnimationFrame()
```

--------------------------------------------------

Scenario 4

Images are huge.

Solution?

✔ WebP/AVIF

✔ Compression

✔ Lazy Loading

--------------------------------------------------

Scenario 5

Users report page freezing.

Solution?

✔ Profile with DevTools

✔ Identify long tasks

✔ Consider Web Workers

--------------------------------------------------
16. CODING EXERCISES
--------------------------------------------------

Beginner

1. Create memoize().
2. Lazy load images.
3. Cache API response.
4. Measure execution time.
5. Detect memory leak.

Intermediate

6. Build virtual list.
7. Register service worker.
8. Optimize images.
9. Profile rendering.
10. Reduce bundle size.

Advanced

11. Offline-first application.
12. Custom cache strategy.
13. Optimize Core Web Vitals.
14. Analyze Lighthouse report.
15. Optimize a dashboard for INP.

--------------------------------------------------
17. CHEAT SHEET
--------------------------------------------------

Memoization

↓

Store Results

↓

Reuse

---------------------------------

Virtualization

↓

Render Visible Items Only

---------------------------------

Images

↓

WebP

↓

AVIF

↓

Lazy Load

---------------------------------

Fonts

↓

WOFF2

↓

font-display:swap

---------------------------------

Service Worker

↓

Offline

↓

Caching

---------------------------------

Core Web Vitals

LCP ≤ 2.5s

CLS ≤ 0.1

INP ≤ 200ms

---------------------------------

Memory Leaks

↓

Timers

↓

Listeners

↓

Detached DOM

---------------------------------

Measure

↓

Lighthouse

↓

DevTools

↓

Performance API

--------------------------------------------------
18. QUICK REVISION
--------------------------------------------------

✔ Memoization avoids repeated expensive calculations.

✔ Virtualization renders only visible items.

✔ WebP and AVIF reduce image size.

✔ WOFF2 and `font-display: swap` improve font loading.

✔ Preload is for current-page critical resources.

✔ Prefetch is for likely future navigation.

✔ Preconnect establishes network connections early.

✔ Service Workers enable offline support and caching.

✔ WebAssembly provides near-native performance for compute-heavy tasks.

✔ Core Web Vitals include LCP, CLS, and INP.

✔ Lighthouse audits performance and best practices.

✔ Remove event listeners, timers, and detached DOM nodes to prevent memory leaks.

✔ Chrome DevTools is the primary tool for performance profiling.

---