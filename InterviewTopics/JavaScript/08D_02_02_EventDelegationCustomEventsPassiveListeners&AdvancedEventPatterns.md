# JavaScript Interview Master Handbook
# Part 8.4B.2 – Event Delegation, Custom Events & Advanced Event Patterns

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Event Delegation
2. Why Event Delegation?
3. event.target vs event.currentTarget
4. closest()
5. matches()
6. Custom Events
7. dispatchEvent()
8. Listener Options
9. Passive Event Listeners
10. once Listeners
11. AbortSignal with Event Listeners
12. Pointer Events
13. Touch Events
14. Clipboard Events
15. Drag & Drop Events
16. Best Practices
17. Interview Questions
18. Output Questions
19. Coding Problems
20. Cheat Sheet

---

# 1. Event Delegation

## Definition

Instead of attaching an event listener to every child element,

attach **one listener** to their common parent.

The event bubbles up to the parent.

---

Without Delegation

```
ul

↓

li

↓

Button

↓

One Listener Per Button
```

100 buttons

↓

100 listeners

---

With Delegation

```
ul

↓

ONE Listener

↓

Handles Every Button
```

---

Example

HTML

```html
<ul id="list">

    <li>Apple</li>

    <li>Mango</li>

    <li>Orange</li>

</ul>
```

JavaScript

```javascript
const list = document.getElementById("list");

list.addEventListener("click", (e)=>{

    console.log(e.target.textContent);

});
```

Click

```
Orange
```

Output

```
Orange
```

---

# Why does it work?

Because of

```
Event Bubbling
```

```
LI

↓

UL

↓

BODY

↓

DOCUMENT
```

The parent receives the event.

---

# 2. Why Event Delegation?

Advantages

✔ Fewer listeners

✔ Better performance

✔ Less memory

✔ Works for dynamically added elements

✔ Easier maintenance

---

Dynamic Example

```javascript
const li = document.createElement("li");

li.textContent = "Banana";

list.appendChild(li);
```

No new event listener required.

---

# 3. event.target vs event.currentTarget

Example

```html
<div id="parent">

<button id="child">

Click

</button>

</div>
```

JavaScript

```javascript
parent.addEventListener("click",(e)=>{

    console.log(e.target.id);

    console.log(e.currentTarget.id);

});
```

Click button

Output

```
child

parent
```

---

Difference

| Property | Meaning |
|----------|---------|
| target | Original element that triggered the event |
| currentTarget | Element whose listener is currently running |

---

Visualization

```
Click Button

↓

target

↓

Button

↓

currentTarget

↓

Parent
```

---

# 4. closest()

Searches upward in the DOM tree.

Example

```javascript
const card =

e.target.closest(".card");
```

Useful

```
Button

↓

Card

↓

Container
```

Find the nearest `.card`.

---

Real Example

```javascript
document.addEventListener("click",(e)=>{

    const button = e.target.closest(".delete-btn");

    if(!button) return;

    console.log("Delete");

});
```

---

# 5. matches()

Checks whether an element matches a selector.

```javascript
if(e.target.matches(".delete")){

    console.log("Delete");

}
```

Returns

```
true

false
```

---

Difference

| Method | Purpose |
|---------|---------|
| matches() | Check current element |
| closest() | Search ancestors including self |

---

# 6. Custom Events

Create your own browser events.

Example

```javascript
const event =

new CustomEvent("login");
```

Listen

```javascript
document.addEventListener(

"login",

()=>{

    console.log("Logged In");

});
```

Dispatch

```javascript
document.dispatchEvent(event);
```

Output

```
Logged In
```

---

Passing Data

```javascript
const loginEvent =

new CustomEvent(

"login",

{

detail:{

username:"Mallik"

}

});
```

Receive

```javascript
document.addEventListener(

"login",

(e)=>{

console.log(e.detail.username);

});
```

Output

```
Mallik
```

---

# 7. dispatchEvent()

Triggers an event manually.

Example

```javascript
button.dispatchEvent(

new Event("click")

);
```

Equivalent

↓

User clicked button.

---

Custom Event Flow

```
Create Event

↓

Dispatch

↓

Listener Executes
```

---

# 8. Event Listener Options

Syntax

```javascript
element.addEventListener(

"click",

handler,

{

capture:false,

once:false,

passive:false,

signal: controller.signal

}

);
```

---

Available Options

✔ capture

✔ once

✔ passive

✔ signal

---

# 9. Passive Event Listeners

Tell the browser

```
I will NOT call

preventDefault()
```

Example

```javascript
window.addEventListener(

"scroll",

handler,

{

passive:true

});
```

Benefits

✔ Better scrolling performance

✔ Faster touch handling

---

Important

Calling

```javascript
e.preventDefault();
```

inside a passive listener is ignored and typically produces a console warning.

---

# 10. once Listener

Runs only once.

Example

```javascript
button.addEventListener(

"click",

()=>{

console.log("Hello");

},

{

once:true

});
```

Click 3 times

Output

```
Hello
```

Only once.

---

# 11. AbortSignal with Event Listeners

Modern way to remove listeners.

```javascript
const controller =

new AbortController();

button.addEventListener(

"click",

handler,

{

signal:controller.signal

});
```

Later

```javascript
controller.abort();
```

Listener removed automatically.

---

Better than

```
removeEventListener()
```

for managing multiple listeners together.

---

# 12. Pointer Events

Pointer Events unify mouse, touch, and pen input.

Common Events

```
pointerdown

pointerup

pointermove

pointerenter

pointerleave
```

Example

```javascript
box.addEventListener(

"pointerdown",

()=>{

console.log("Pointer");

});
```

---

# 13. Touch Events

Used on touch devices.

```
touchstart

touchmove

touchend

touchcancel
```

Example

```javascript
box.addEventListener(

"touchstart",

()=>{

console.log("Touch");

});
```

For many new applications, Pointer Events are preferred because they support multiple input types with one API.

---

# 14. Clipboard Events

Copy

```javascript
input.addEventListener(

"copy",

()=>{

console.log("Copied");

});
```

Paste

```javascript
input.addEventListener(

"paste",

()=>{

console.log("Paste");

});
```

Cut

```javascript
input.addEventListener(

"cut",

()=>{

console.log("Cut");

});
```

---

# 15. Drag & Drop Events

Important Events

```
dragstart

drag

dragenter

dragover

drop

dragend
```

Simple Example

```javascript
dropZone.addEventListener(

"dragover",

(e)=>{

    e.preventDefault();

});
```

Without

```javascript
preventDefault()
```

many elements won't accept drops.

---

Drop

```javascript
dropZone.addEventListener(

"drop",

()=>{

console.log("Dropped");

});
```

---

# Best Practices

✔ Use Event Delegation for lists.

✔ Prefer Pointer Events over separate mouse and touch handling when appropriate.

✔ Use `closest()` in delegated handlers.

✔ Use `once:true` for one-time actions.

✔ Use `AbortController` for listener cleanup.

✔ Keep event handlers lightweight.

---

# Common Mistakes

❌ Adding hundreds of identical listeners.

❌ Confusing `target` with `currentTarget`.

❌ Forgetting `dragover` needs `preventDefault()` for drops.

❌ Calling `preventDefault()` inside passive listeners.

❌ Using delegation where events don't bubble (e.g., `focus` and `blur`—use `focusin`/`focusout` or capturing if needed).

---

# Frequently Asked Interview Questions

1. What is Event Delegation?

2. Why is Event Delegation faster?

3. Difference between `target` and `currentTarget`?

4. What does `closest()` do?

5. Difference between `closest()` and `matches()`?

6. What is a Custom Event?

7. What is `dispatchEvent()`?

8. What is a passive listener?

9. Why use passive listeners?

10. What does `once:true` do?

11. What is `AbortSignal`?

12. Difference between Pointer Events and Mouse Events?

13. Why are Pointer Events preferred?

14. Why must `dragover` call `preventDefault()`?

15. When should Event Delegation be avoided?

Answer:

Avoid it for events that don't bubble unless you use alternatives like `focusin`, `focusout`, or capturing.

---

# Output Questions

## Q1

```javascript
parent.addEventListener("click",(e)=>{

    console.log(e.target.id);

    console.log(e.currentTarget.id);

});
```

Click child

Output

```
child

parent
```

---

## Q2

```javascript
button.addEventListener(

"click",

()=>console.log("Hello"),

{

once:true

});
```

Click twice

Output

```
Hello
```

---

## Q3

```javascript
const event =

new CustomEvent(

"login",

{

detail:{

name:"Mallik"

}

});

document.addEventListener(

"login",

(e)=>{

console.log(e.detail.name);

});

document.dispatchEvent(event);
```

Output

```
Mallik
```

---

## Q4

```javascript
document.body.matches("body");
```

Output

```
true
```

---

## Q5

```javascript
const controller =

new AbortController();

button.addEventListener(

"click",

()=>console.log("Hi"),

{

signal:controller.signal

});

controller.abort();
```

Question

Will future clicks trigger the handler?

Answer

```
No
```

---

# Coding Problems

## Beginner

1. Build a delegated todo list.
2. Detect clicked list item.
3. Create a custom event.
4. Dispatch a custom event.
5. Use `once:true`.

---

## Intermediate

6. Build an accordion using delegation.
7. Build a dropdown menu.
8. Implement drag-and-drop cards.
9. Build keyboard shortcuts.
10. Implement clipboard copy notifications.

---

## Advanced

11. Build a reusable event bus with `CustomEvent`.
12. Implement a Kanban board using drag & drop.
13. Create a gesture handler with Pointer Events.
14. Build a sortable list using delegation.
15. Build a dashboard with delegated interactions.

---

# Cheat Sheet

```javascript
// Delegation
parent.addEventListener("click",(e)=>{

    if(e.target.matches(".btn")){

        // Handle button

    }

});

// Closest
e.target.closest(".card");

// Matches
e.target.matches(".item");

// Custom Event
const event = new CustomEvent("login",{

    detail:{ id:1 }

});

// Dispatch
document.dispatchEvent(event);

// Once
element.addEventListener("click",handler,{

    once:true

});

// Passive
window.addEventListener("scroll",handler,{

    passive:true

});

// AbortSignal
const controller = new AbortController();

element.addEventListener("click",handler,{

    signal:controller.signal

});
```

---

# Quick Revision

✔ Event Delegation attaches one listener to a parent.

✔ Delegation relies on **event bubbling**.

✔ `target` is the original event source.

✔ `currentTarget` is the element executing the listener.

✔ `closest()` searches upward for the nearest matching ancestor.

✔ `matches()` checks whether an element matches a selector.

✔ `CustomEvent` lets you create application-specific events.

✔ `dispatchEvent()` triggers events programmatically.

✔ Passive listeners improve scrolling performance.

✔ `once:true` automatically removes the listener after the first invocation.

✔ `AbortController` can remove event listeners using the `signal` option.

✔ Pointer Events unify mouse, touch, and pen input.

✔ `dragover` typically requires `preventDefault()` to allow dropping.

---