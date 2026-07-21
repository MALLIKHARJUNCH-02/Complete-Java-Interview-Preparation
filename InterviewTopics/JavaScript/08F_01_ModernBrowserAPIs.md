# JavaScript Interview Master Handbook
# Part 8.6A – Modern Browser APIs (Core APIs)

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Modern Browser APIs
2. IntersectionObserver
3. ResizeObserver
4. MutationObserver
5. Clipboard API
6. Geolocation API
7. Notifications API
8. Fullscreen API
9. Page Visibility API
10. Best Practices
11. Common Mistakes
12. Interview Questions
13. Output Questions
14. Coding Problems
15. Cheat Sheet

---

# 1. Modern Browser APIs

Modern browsers provide many APIs beyond the DOM.

Examples

✔ Clipboard

✔ Notifications

✔ Web Workers

✔ WebSocket

✔ Geolocation

✔ Observers

✔ Fullscreen

✔ Visibility

---

Visualization

```
Browser

↓

Modern APIs

├── Clipboard

├── Observer APIs

├── Notifications

├── Geolocation

├── Workers

├── WebSocket

└── Storage
```

---

# 2. IntersectionObserver

## Definition

Detects when an element enters or leaves the viewport.

Common Uses

✔ Lazy Loading Images

✔ Infinite Scroll

✔ Scroll Animations

✔ Analytics

---

Without IntersectionObserver

```
Scroll Event

↓

Hundreds of Calls

↓

Performance Issues
```

---

With IntersectionObserver

```
Browser

↓

Detect Visibility

↓

Callback Runs
```

---

Example

```javascript
const observer = new IntersectionObserver(

(entries)=>{

    entries.forEach(entry=>{

        console.log(entry.isIntersecting);

    });

});

observer.observe(document.querySelector("#box"));
```

---

Useful Properties

```javascript
entry.target

entry.isIntersecting

entry.intersectionRatio
```

---

Stop Observing

```javascript
observer.unobserve(element);

observer.disconnect();
```

---

# 3. ResizeObserver

Detects element size changes.

Example

```javascript
const observer =

new ResizeObserver(entries=>{

    entries.forEach(entry=>{

        console.log(

            entry.contentRect.width

        );

    });

});

observer.observe(box);
```

---

Use Cases

✔ Responsive Components

✔ Dashboards

✔ Charts

✔ Editors

---

# 4. MutationObserver

Detects DOM changes.

Example

```javascript
const observer =

new MutationObserver(

mutations=>{

    console.log(mutations);

});

observer.observe(document.body,{

    childList:true,

    subtree:true

});
```

---

Detect

✔ Added Nodes

✔ Removed Nodes

✔ Attribute Changes

✔ Text Changes

---

Disconnect

```javascript
observer.disconnect();
```

---

# Observer Comparison

| API | Watches |
|------|----------|
| IntersectionObserver | Visibility |
| ResizeObserver | Size |
| MutationObserver | DOM Changes |

---

# 5. Clipboard API

Copy Text

```javascript
await navigator.clipboard.writeText(

"Hello"

);
```

---

Read Text

```javascript
const text =

await navigator.clipboard.readText();

console.log(text);
```

---

Requirements

✔ Secure Context (HTTPS)

✔ User interaction for many operations

---

Use Cases

✔ Copy Button

✔ Paste Feature

✔ Share Links

---

# 6. Geolocation API

Gets user location.

```javascript
navigator.geolocation.getCurrentPosition(

position=>{

    console.log(

        position.coords.latitude

    );

});
```

---

Properties

```
latitude

longitude

accuracy

altitude
```

---

Watch Location

```javascript
const id =

navigator.geolocation.watchPosition(

callback

);
```

Stop

```javascript
navigator.geolocation.clearWatch(id);
```

---

Permission Required

User must grant access.

---

# 7. Notifications API

Show desktop notifications.

Permission

```javascript
await Notification.requestPermission();
```

---

Create

```javascript
new Notification(

"Download Complete"

);
```

---

Possible Permissions

```
granted

denied

default
```

---

Requirements

✔ User permission

✔ Secure context

---

# 8. Fullscreen API

Enter

```javascript
element.requestFullscreen();
```

Exit

```javascript
document.exitFullscreen();
```

---

Check

```javascript
document.fullscreenElement
```

Returns

```
Element

or

null
```

---

Use Cases

✔ Video Players

✔ Games

✔ Image Viewers

✔ Presentations

---

# 9. Page Visibility API

Detects whether the page is visible.

Example

```javascript
document.addEventListener(

"visibilitychange",

()=>{

    console.log(

        document.visibilityState

    );

});
```

---

States

```
visible

hidden
```

---

Use Cases

✔ Pause Videos

✔ Pause Games

✔ Stop Polling

✔ Save Battery

---

# Best Practices

✔ Disconnect observers when finished.

✔ Request permissions only when needed.

✔ Handle permission denial gracefully.

✔ Use HTTPS for secure APIs.

✔ Prefer observers over continuous polling.

---

# Common Mistakes

❌ Forgetting

```javascript
disconnect()
```

for observers.

---

❌ Assuming clipboard access always succeeds.

---

❌ Requesting location on page load unnecessarily.

---

❌ Showing notifications without user interaction.

---

❌ Using scroll events instead of IntersectionObserver for lazy loading.

---

# Frequently Asked Interview Questions

1. What is IntersectionObserver?

2. Why use IntersectionObserver instead of scroll events?

3. What is ResizeObserver?

4. What is MutationObserver?

5. Difference between the three Observer APIs?

6. How do you copy text using JavaScript?

7. What permissions does Geolocation require?

8. How do Notifications work?

9. Difference between Notifications and alert()?

10. What is Fullscreen API?

11. What is Page Visibility API?

12. Why pause polling when a page is hidden?

13. Can Clipboard API work over HTTP?

Answer

Generally **No**. It usually requires HTTPS (or localhost during development).

14. How do you stop observing an element?

Answer

```
unobserve()

or

disconnect()
```

15. Which API is best for lazy loading images?

Answer

```
IntersectionObserver
```

---

# Output Questions

## Q1

```javascript
await navigator.clipboard.writeText("Hi");
```

Result

```
"Hi"

is copied to clipboard.
```

---

## Q2

```javascript
document.fullscreenElement
```

Output

```
Current fullscreen element

or

null
```

---

## Q3

```javascript
Notification.permission
```

Possible Output

```
granted

denied

default
```

---

## Q4

```javascript
document.visibilityState
```

Output

```
visible

or

hidden
```

---

## Q5

```javascript
observer.disconnect();
```

Result

Observer stops watching all targets.

---

# Coding Problems

## Beginner

1. Build a Copy button.
2. Show current location.
3. Detect page visibility.
4. Enter fullscreen.
5. Observe an image entering the viewport.

---

## Intermediate

6. Build lazy image loading.
7. Build infinite scrolling.
8. Create a responsive chart with ResizeObserver.
9. Detect DOM changes.
10. Pause a timer when the tab is hidden.

---

## Advanced

11. Build a photo gallery using IntersectionObserver.
12. Build a collaborative editor using MutationObserver.
13. Create a location tracker.
14. Implement notification reminders.
15. Build a fullscreen presentation viewer.

---

# Cheat Sheet

```javascript
// IntersectionObserver
const io = new IntersectionObserver(callback);
io.observe(element);
io.unobserve(element);
io.disconnect();

// ResizeObserver
const ro = new ResizeObserver(callback);
ro.observe(element);

// MutationObserver
const mo = new MutationObserver(callback);
mo.observe(target, {
  childList: true,
  subtree: true
});

// Clipboard
await navigator.clipboard.writeText("Text");
await navigator.clipboard.readText();

// Geolocation
navigator.geolocation.getCurrentPosition(success);

// Notifications
await Notification.requestPermission();
new Notification("Hello");

// Fullscreen
element.requestFullscreen();
document.exitFullscreen();

// Visibility
document.visibilityState;
```

---

# Quick Revision

✔ `IntersectionObserver` detects viewport visibility.

✔ `ResizeObserver` detects element size changes.

✔ `MutationObserver` detects DOM mutations.

✔ Clipboard API reads and writes clipboard data.

✔ Geolocation requires user permission.

✔ Notifications require permission and typically HTTPS.

✔ Fullscreen API enters and exits fullscreen mode.

✔ Page Visibility API detects whether the page is active.

✔ Observer APIs are more efficient than constant polling.

✔ Disconnect observers when they're no longer needed.

---