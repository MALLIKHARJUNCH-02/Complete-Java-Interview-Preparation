# JavaScript Interview Master Handbook
# Part 8.4B.1 – DOM Events & Event Propagation

> Beginner → Advanced → Interview Ready

--------------------------------------------------
TABLE OF CONTENTS
--------------------------------------------------

1. What are Events?
2. Event Flow
3. addEventListener()
4. Event Object
5. Mouse Events
6. Keyboard Events
7. Form Events
8. Event Bubbling
9. Event Capturing
10. preventDefault()
11. stopPropagation()
12. stopImmediatePropagation()
13. Best Practices
14. Common Mistakes
15. Interview Questions
16. Output Questions
17. Coding Problems
18. Cheat Sheet

--------------------------------------------------
1. WHAT ARE EVENTS?
--------------------------------------------------

An **event** is an action that occurs in the browser.

Examples

✔ Mouse Click

✔ Double Click

✔ Keyboard Press

✔ Mouse Move

✔ Scroll

✔ Resize

✔ Form Submit

✔ Input Change

✔ Drag & Drop

--------------------------------------------------

Example

```html
<button id="btn">Click</button>
```

```javascript
document.getElementById("btn")

.addEventListener("click", () => {

    console.log("Clicked");

});
```

Output

```
Clicked
```

--------------------------------------------------
2. EVENT FLOW
--------------------------------------------------

When you click an element

```
Window

↓

Document

↓

html

↓

body

↓

div

↓

button
```

The browser processes the event in phases.

```
Capturing

↓

Target

↓

Bubbling
```

Visualization

```
Window

↓

Document

↓

Body

↓

Button

(Target)

↓

Body

↓

Document

↓

Window
```

--------------------------------------------------
3. addEventListener()
--------------------------------------------------

Syntax

```javascript
element.addEventListener(

event,

handler,

options

);
```

Example

```javascript
button.addEventListener(

"click",

function(){

    console.log("Hello");

});
```

--------------------------------------------------

Multiple Listeners

```javascript
button.addEventListener(

"click",

()=>console.log("A")

);

button.addEventListener(

"click",

()=>console.log("B")

);
```

Output

```
A

B
```

Unlike `onclick`, multiple listeners can coexist.

--------------------------------------------------
Removing Listener

```javascript
function greet(){

    console.log("Hello");

}

button.addEventListener(

"click",

greet

);

button.removeEventListener(

"click",

greet

);
```

Important

The same function reference must be used.

--------------------------------------------------
4. EVENT OBJECT
--------------------------------------------------

Every event handler receives an Event object.

```javascript
button.addEventListener(

"click",

function(event){

    console.log(event);

});
```

Common Properties

| Property | Meaning |
|-----------|---------|
| target | Element that triggered the event |
| currentTarget | Element whose listener is executing |
| type | Event type |
| clientX | Mouse X coordinate |
| clientY | Mouse Y coordinate |
| key | Pressed key |
| defaultPrevented | Whether default action was prevented |

--------------------------------------------------

Example

```javascript
button.addEventListener(

"click",

e=>{

    console.log(e.target);

});
```

--------------------------------------------------
5. MOUSE EVENTS
--------------------------------------------------

| Event | Description |
|---------|-------------|
| click | Single click |
| dblclick | Double click |
| mousedown | Mouse button pressed |
| mouseup | Mouse button released |
| mousemove | Mouse moves |
| mouseenter | Pointer enters element |
| mouseleave | Pointer leaves element |
| contextmenu | Right click menu |

--------------------------------------------------

Example

```javascript
button.addEventListener(

"dblclick",

()=>{

    console.log("Double Click");

});
```

--------------------------------------------------
6. KEYBOARD EVENTS
--------------------------------------------------

| Event | Description |
|---------|-------------|
| keydown | Key pressed |
| keyup | Key released |

(`keypress` is deprecated and should generally be avoided.)

--------------------------------------------------

Example

```javascript
document.addEventListener(

"keydown",

e=>{

    console.log(e.key);

});
```

Press

```
A
```

Output

```
a
```

(or `"A"` depending on Shift/Caps Lock)

--------------------------------------------------
Useful Keys

```
Enter

Escape

ArrowUp

ArrowDown

Tab

Shift

Control

Alt
```

--------------------------------------------------
7. FORM EVENTS
--------------------------------------------------

| Event | Description |
|---------|-------------|
| submit | Form submitted |
| input | Value changes immediately |
| change | Value committed (often on blur or selection change) |
| focus | Element gains focus |
| blur | Element loses focus |

--------------------------------------------------

Example

```javascript
form.addEventListener(

"submit",

function(e){

    e.preventDefault();

    console.log("Submitted");

});
```

--------------------------------------------------
8. EVENT BUBBLING
--------------------------------------------------

Default behavior.

Example

```html
<div id="parent">

<button id="child">

Click

</button>

</div>
```

```javascript
parent.addEventListener(

"click",

()=>console.log("Parent")

);

child.addEventListener(

"click",

()=>console.log("Child")

);
```

Click

```
Child
```

Output

```
Child

Parent
```

Flow

```
Child

↓

Parent

↓

Body

↓

Document
```

Bottom → Up

--------------------------------------------------
9. EVENT CAPTURING
--------------------------------------------------

Capturing travels

Top → Bottom.

Enable it

```javascript
parent.addEventListener(

"click",

handler,

true

);
```

or

```javascript
parent.addEventListener(

"click",

handler,

{

capture:true

}

);
```

Example

Output

```
Parent

Child
```

--------------------------------------------------
Comparison

| Bubbling | Capturing |
|-----------|-----------|
| Bottom → Top | Top → Bottom |
| Default | Optional |

--------------------------------------------------
10. preventDefault()
--------------------------------------------------

Stops the browser's default action.

Example

```html
<a href="https://google.com">

Google

</a>
```

```javascript
link.addEventListener(

"click",

e=>{

    e.preventDefault();

});
```

Clicking the link

↓

Does NOT navigate.

--------------------------------------------------

Form

```javascript
form.addEventListener(

"submit",

e=>{

    e.preventDefault();

});
```

Form

↓

No page refresh.

--------------------------------------------------
11. stopPropagation()
--------------------------------------------------

Stops the event from moving further.

Example

```javascript
child.addEventListener(

"click",

e=>{

    e.stopPropagation();

});
```

Output

```
Child
```

Parent

↓

Never executes.

--------------------------------------------------
12. stopImmediatePropagation()
--------------------------------------------------

Stops

✔ Propagation

AND

✔ Remaining listeners on the same element.

Example

```javascript
button.addEventListener(

"click",

function(e){

    e.stopImmediatePropagation();

    console.log("First");

});

button.addEventListener(

"click",

()=>{

    console.log("Second");

});
```

Output

```
First
```

The second listener does not run.

--------------------------------------------------
13. BEST PRACTICES
--------------------------------------------------

✔ Prefer `addEventListener()` over inline HTML events.

✔ Use Event Delegation for large lists.

✔ Remove listeners when no longer needed.

✔ Use `preventDefault()` only when necessary.

✔ Use `stopPropagation()` sparingly.

--------------------------------------------------
14. COMMON MISTAKES
--------------------------------------------------

❌ Using

```javascript
button.onclick
```

for multiple handlers.

Only one handler is stored.

--------------------------------------------------

❌ Calling

```javascript
removeEventListener()
```

with a different function reference.

--------------------------------------------------

❌ Stopping propagation unnecessarily.

--------------------------------------------------

❌ Confusing

```
target

and

currentTarget
```

--------------------------------------------------
15. FREQUENTLY ASKED INTERVIEW QUESTIONS
--------------------------------------------------

1. What is an Event?

2. What is Event Flow?

3. What is Event Bubbling?

4. What is Event Capturing?

5. Difference between Bubbling and Capturing?

6. What is Event Target?

7. Difference between `target` and `currentTarget`?

8. What does `preventDefault()` do?

9. What does `stopPropagation()` do?

10. What does `stopImmediatePropagation()` do?

11. Difference between `click` and `dblclick`?

12. Difference between `input` and `change`?

13. Difference between `keydown` and `keyup`?

14. Can multiple event listeners be attached?

Answer

Yes.

Using `addEventListener()`.

15. Can `onclick` have multiple handlers?

Answer

No.

--------------------------------------------------
16. OUTPUT QUESTIONS
--------------------------------------------------

Q1

```javascript
button.onclick = ()=>console.log(1);

button.onclick = ()=>console.log(2);
```

Output

```
2
```

Reason

The second assignment replaces the first.

--------------------------------------------------

Q2

```javascript
button.addEventListener(

"click",

()=>console.log(1)

);

button.addEventListener(

"click",

()=>console.log(2)

);
```

Output

```
1

2
```

--------------------------------------------------

Q3

```javascript
parent.onclick = ()=>console.log("Parent");

child.onclick = ()=>console.log("Child");
```

Click Child

Output

```
Child

Parent
```

--------------------------------------------------

Q4

```javascript
child.addEventListener(

"click",

e=>{

    e.stopPropagation();

    console.log("Child");

});

parent.addEventListener(

"click",

()=>console.log("Parent"));
```

Output

```
Child
```

--------------------------------------------------

Q5

```javascript
form.addEventListener(

"submit",

e=>{

    e.preventDefault();

    console.log("Submit");

});
```

Output

```
Submit
```

No page refresh.

--------------------------------------------------
17. CODING PROBLEMS
--------------------------------------------------

Beginner

1. Create a click counter.
2. Display mouse coordinates.
3. Detect Enter key.
4. Prevent form submission.
5. Change color on hover.

Intermediate

6. Build a custom dropdown.
7. Create keyboard shortcuts.
8. Build a modal with Escape key.
9. Create an image slider.
10. Build a drag-and-drop area.

Advanced

11. Implement event delegation for a todo list.
12. Build a reusable event manager.
13. Create a keyboard command system.
14. Implement custom events.
15. Build an event-driven component library.

--------------------------------------------------
18. CHEAT SHEET
--------------------------------------------------

```javascript
// Add Listener
element.addEventListener("click", handler);

// Remove
element.removeEventListener("click", handler);

// Prevent Default
e.preventDefault();

// Stop Bubbling
e.stopPropagation();

// Stop Everything
e.stopImmediatePropagation();

// Target
e.target;

// Current Target
e.currentTarget;
```

--------------------------------------------------
19. QUICK REVISION
--------------------------------------------------

✔ Events represent user or browser actions.

✔ `addEventListener()` supports multiple handlers.

✔ Every handler receives an Event object.

✔ Bubbling flows from child → parent.

✔ Capturing flows from parent → child.

✔ `preventDefault()` blocks default browser behavior.

✔ `stopPropagation()` stops the event from moving to ancestor elements.

✔ `stopImmediatePropagation()` also prevents later listeners on the same element.

✔ `target` is the element where the event originated.

✔ `currentTarget` is the element currently executing the listener.

---