# CSS Interview Guide
# Part 7A – CSS Transitions, Transforms, Animations & Visual Effects

---

# Table of Contents

1. CSS Transitions
2. Transition Properties
3. Timing Functions
4. CSS Transforms
5. 2D Transform
6. 3D Transform
7. transform-origin
8. Perspective
9. Backface Visibility
10. CSS Animations
11. @keyframes
12. Animation Properties
13. Transition vs Animation
14. CSS Filter
15. Backdrop Filter
16. Best Practices
17. Common Mistakes
18. Interview Questions
19. Cheat Sheet

---

# 1. CSS Transition

Transitions create smooth changes between two states.

Without Transition

```
Hover

↓

Instant Change
```

With Transition

```
Hover

↓

Smooth Change
```

Example

```css
button{

background:blue;

transition:0.3s;

}

button:hover{

background:red;

}
```

---

# Why use Transition?

✔ Smooth UI

✔ Better UX

✔ Modern Design

✔ Interactive Components

---

# 2. Transition Properties

## transition-property

```css
transition-property:background;
```

Only background changes smoothly.

---

## transition-duration

```css
transition-duration:.5s;
```

Animation duration.

---

## transition-delay

```css
transition-delay:1s;
```

Starts after one second.

---

## transition-timing-function

```css
transition-timing-function:ease;
```

Controls speed.

---

## Transition Shorthand

```css
transition:

background

0.5s

ease

0s;
```

Order

```
Property

Duration

Timing

Delay
```

---

# 3. Timing Functions

---

linear

```
Same Speed
```

---

ease

```
Slow

↓

Fast

↓

Slow
```

Default.

---

ease-in

```
Slow Start
```

---

ease-out

```
Slow End
```

---

ease-in-out

```
Slow

↓

Fast

↓

Slow
```

---

cubic-bezier()

Custom curve.

```css
transition-timing-function:

cubic-bezier(.25,.8,.25,1);
```

---

Interview Question

Default timing function?

Answer

```
ease
```

---

# 4. CSS Transform

Transform changes the appearance of an element without changing document flow.

Transforms include

✔ Move

✔ Rotate

✔ Scale

✔ Skew

---

# 5. 2D Transform

---

translate()

Moves element.

```css
transform:

translate(50px,20px);
```

---

translateX()

```css
transform:

translateX(100px);
```

---

translateY()

```css
transform:

translateY(50px);
```

---

rotate()

```css
transform:

rotate(45deg);
```

---

scale()

```css
transform:

scale(1.2);
```

20% larger.

---

scaleX()

```css
transform:

scaleX(2);
```

---

scaleY()

```css
transform:

scaleY(.5);
```

---

skew()

```css
transform:

skew(20deg);
```

---

skewX()

```css
transform:

skewX(15deg);
```

---

skewY()

```css
transform:

skewY(15deg);
```

---

Interview Question

Difference between translate() and margin?

translate()

↓

Visual movement only.

No layout recalculation.

margin

↓

Changes layout.

May affect surrounding elements.

---

# 6. Multiple Transforms

```css
transform:

translateY(-10px)

scale(1.1)

rotate(5deg);
```

Transforms are applied from right to left mathematically.

---

# 7. transform-origin

Changes pivot point.

Default

```
center center
```

Example

```css
transform-origin:

left top;
```

Useful for

✔ Doors

✔ Cards

✔ Menus

✔ Hinges

---

# 8. 3D Transform

---

rotateX()

```css
transform:

rotateX(45deg);
```

---

rotateY()

```css
transform:

rotateY(45deg);
```

---

rotateZ()

```css
transform:

rotateZ(45deg);
```

---

translateZ()

```css
transform:

translateZ(100px);
```

---

scale3d()

```css
transform:

scale3d(1.2,1.2,1);
```

---

# 9. Perspective

Creates depth.

```css
.container{

perspective:1000px;

}
```

Smaller value

↓

More dramatic perspective.

---

Interview Question

Where should perspective be applied?

Answer

Usually on the parent element.

---

# 10. Backface Visibility

```css
backface-visibility:hidden;
```

Useful for

✔ Card Flip

✔ 3D Rotation

✔ Image Flip

---

Example

```
Front

↓

Rotate

↓

Back Hidden
```

---

# 11. CSS Animations

Animation automatically changes styles over time.

Unlike transitions,

animations do not require user interaction.

---

# 12. @keyframes

Example

```css
@keyframes fade{

from{

opacity:0;

}

to{

opacity:1;

}

}
```

Use

```css
.box{

animation:fade 1s;

}
```

---

Multiple Steps

```css
@keyframes bounce{

0%{

transform:translateY(0);

}

50%{

transform:translateY(-50px);

}

100%{

transform:translateY(0);

}

}
```

---

# 13. Animation Properties

---

animation-name

```css
animation-name:bounce;
```

---

animation-duration

```css
animation-duration:2s;
```

---

animation-delay

```css
animation-delay:1s;
```

---

animation-iteration-count

```css
animation-iteration-count:infinite;
```

---

animation-direction

```css
alternate
```

Animation plays forward then backward.

---

animation-fill-mode

```css
forwards
```

Keeps final state.

---

animation-play-state

```css
paused
```

Stops animation.

---

animation-timing-function

Same as transition.

---

Animation Shorthand

```css
animation:

bounce

2s

ease

1s

infinite

alternate;
```

---

# 14. Transition vs Animation

| Transition | Animation |
|------------|-----------|
| Needs Trigger | Can Start Automatically |
| Two States | Multiple Keyframes |
| Simpler | More Powerful |
| Hover Effects | Complex Motion |

---

Interview Question

When should Transition be used?

Answer

For hover, focus, and simple state changes.

When should Animation be used?

Answer

For loaders, banners, onboarding, continuous effects, and multi-step motion.

---

# 15. CSS Filter

Applies visual effects.

---

blur()

```css
filter:blur(5px);
```

---

brightness()

```css
filter:brightness(120%);
```

---

contrast()

```css
filter:contrast(150%);
```

---

grayscale()

```css
filter:grayscale(100%);
```

---

sepia()

```css
filter:sepia(100%);
```

---

invert()

```css
filter:invert(100%);
```

---

drop-shadow()

```css
filter:

drop-shadow(

0 5px 10px gray);
```

---

Multiple Filters

```css
filter:

brightness(120%)

contrast(120%)

blur(2px);
```

---

# 16. Backdrop Filter

Applies effects to the background behind an element.

```css
.card{

backdrop-filter:

blur(10px);

}
```

Used for

✔ Glassmorphism

✔ Frosted Glass

✔ Modern UI

Note: Requires browser support and often a semi-transparent background.

---

# Real World Examples

Hover Button

```css
button{

transition:.3s;

}

button:hover{

transform:translateY(-5px);

}
```

---

Card Hover

```css
.card:hover{

transform:scale(1.05);

box-shadow:0 15px 30px rgba(0,0,0,.2);

}
```

---

Loader

```css
.loader{

animation:spin 1s linear infinite;

}
```

---

Glass Card

```css
.card{

backdrop-filter:blur(20px);

background:rgba(255,255,255,.2);

}
```

---

# Best Practices

✔ Animate transform and opacity when possible.

✔ Keep animations short.

✔ Use subtle effects.

✔ Respect reduced-motion preferences.

✔ Prefer translate() over changing top/left for animation.

✔ Avoid infinite animations unless necessary.

---

# Common Mistakes

❌ Animating width and height unnecessarily.

❌ Using huge blur values.

❌ Too many simultaneous animations.

❌ Ignoring accessibility.

❌ Excessive animation duration.

---

# Frequently Asked Interview Questions

1. What is CSS Transition?

2. Difference between Transition and Animation?

3. What is transform?

4. Difference between translate() and margin?

5. Difference between rotateX() and rotateY()?

6. What is transform-origin?

7. What is perspective?

8. Where should perspective be applied?

9. What is backface-visibility?

10. What is @keyframes?

11. Difference between animation-duration and transition-duration?

12. What is animation-fill-mode?

13. Difference between filter and backdrop-filter?

14. Why are transform and opacity preferred for animations?

15. What is cubic-bezier()?

---

# Cheat Sheet

```css
transition:.3s ease;

transform:translate(20px);

transform:rotate(45deg);

transform:scale(1.2);

transform:skew(10deg);

transform-origin:center;

perspective:1000px;

backface-visibility:hidden;

animation:fade 1s ease;

@keyframes fade{

from{opacity:0;}

to{opacity:1;}

}

filter:blur(5px);

filter:grayscale(100%);

backdrop-filter:blur(20px);
```

---

# Quick Revision

- Transitions animate changes between states.
- Animations use `@keyframes` for multi-step motion.
- `transform` changes appearance without affecting layout.
- `translate()` is generally better for animation than changing margins or positioning.
- `perspective` adds 3D depth.
- `backface-visibility` hides the back side of rotated elements.
- `filter` affects the element itself.
- `backdrop-filter` affects the content behind the element.
- Animate `transform` and `opacity` for better performance.

---