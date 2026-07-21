# JavaScript Interview Master Handbook
# Part 8.1 - JavaScript Modules (ES Modules & CommonJS)

Beginner → Advanced → Interview Ready

--------------------------------------------------

TABLE OF CONTENTS

1. Why Modules?
2. What is a Module?
3. Module Benefits
4. ES Modules
5. Export
6. Named Export
7. Default Export
8. Import
9. Import Alias
10. Namespace Import
11. Re-export
12. Dynamic Import
13. CommonJS
14. ES Modules vs CommonJS
15. Module Resolution
16. Circular Dependencies
17. Tree Shaking
18. Best Practices
19. Interview Questions
20. Output Questions
21. Coding Problems
22. Cheat Sheet

--------------------------------------------------
1. WHY MODULES?
--------------------------------------------------

Imagine writing an application with

100 JavaScript files.

Without modules

```
Global Scope

↓

Function Collision

↓

Variable Collision

↓

Impossible to Maintain
```

Modules solve this.

Each file becomes

```
Private Scope

↓

Export Needed Things

↓

Import Needed Things
```

--------------------------------------------------
2. WHAT IS A MODULE?
--------------------------------------------------

A module is simply

```
One JavaScript File
```

that contains

- variables
- functions
- classes
- constants

and exports only what is needed.

Example

math.js

```javascript
export const PI = 3.14;

export function add(a,b){

    return a+b;

}
```

--------------------------------------------------
3. BENEFITS
--------------------------------------------------

✔ Reusable

✔ Maintainable

✔ Encapsulation

✔ No Global Pollution

✔ Tree Shaking

✔ Easier Testing

✔ Better Code Organization

--------------------------------------------------
4. ES MODULES
--------------------------------------------------

Introduced

```
ES6 (2015)
```

Uses

```
export

import
```

--------------------------------------------------
5. NAMED EXPORT
--------------------------------------------------

math.js

```javascript
export const PI = 3.14;

export function add(a,b){

    return a+b;

}

export function sub(a,b){

    return a-b;

}
```

Import

```javascript
import { PI, add } from "./math.js";

console.log(add(10,20));
```

Output

```
30
```

--------------------------------------------------
6. DEFAULT EXPORT
--------------------------------------------------

A file can have

```
ONE

default export
```

Example

```javascript
export default function greet(){

    console.log("Hello");

}
```

Import

```javascript
import greet from "./greet.js";

greet();
```

Output

```
Hello
```

--------------------------------------------------
7. MIXED EXPORTS
--------------------------------------------------

```javascript
export default class User{}

export const age = 25;

export function test(){}
```

Import

```javascript
import User, { age, test }

from "./user.js";
```

--------------------------------------------------
8. IMPORT TYPES
--------------------------------------------------

Named Import

```javascript
import { add } from "./math.js";
```

Multiple

```javascript
import {

add,

sub,

PI

}

from "./math.js";
```

Everything

```javascript
import * as MathUtils

from "./math.js";

console.log(MathUtils.PI);
```

Output

```
3.14
```

--------------------------------------------------
9. IMPORT ALIAS
--------------------------------------------------

```javascript
import {

add as addition

}

from "./math.js";

addition(10,20);
```

Useful

↓

Avoid naming conflicts

--------------------------------------------------
10. RE-EXPORT
--------------------------------------------------

Instead of

```
math.js

user.js

product.js
```

Create

index.js

```javascript
export * from "./math.js";

export * from "./user.js";

export * from "./product.js";
```

Now

```javascript
import {

add,

User

}

from "./index.js";
```

--------------------------------------------------
11. DYNAMIC IMPORT
--------------------------------------------------

Loads modules only when needed.

```javascript
const module =

await import("./math.js");

console.log(module.PI);
```

Useful

✔ Lazy Loading

✔ Performance

✔ Code Splitting

--------------------------------------------------
12. COMMONJS
--------------------------------------------------

Node.js traditional module system.

Export

```javascript
module.exports = {

add,

sub

};
```

Import

```javascript
const math =

require("./math");
```

Use

```javascript
math.add(10,20);
```

--------------------------------------------------
13. ES MODULES vs COMMONJS
--------------------------------------------------

| ES Modules | CommonJS |
|------------|-----------|
| import | require |
| export | module.exports |
| Static | Dynamic require() |
| Tree Shaking | No Tree Shaking |
| Browser + Node | Mainly Node |

--------------------------------------------------
14. MODULE RESOLUTION
--------------------------------------------------

When writing

```javascript
import x from "./math.js";
```

JavaScript

↓

Finds

```
math.js

↓

Loads

↓

Executes Once

↓

Caches
```

Modules are executed only once.

--------------------------------------------------
15. CIRCULAR DEPENDENCIES
--------------------------------------------------

Example

```
A imports B

↓

B imports A
```

Can lead to

- partially initialized values
- confusing bugs

Avoid when possible.

--------------------------------------------------
16. TREE SHAKING
--------------------------------------------------

Example

math.js

```javascript
export function add(){}

export function sub(){}

export function mul(){}

export function div(){}
```

Import

```javascript
import {

add

}

from "./math.js";
```

Bundlers can remove unused exports.

```
sub()

mul()

div()

↓

Removed
```

This optimization is called

```
Tree Shaking
```

--------------------------------------------------
17. MODULE EXECUTION
--------------------------------------------------

Example

```javascript
// a.js

console.log("Loaded");
```

Imported twice

```javascript
import "./a.js";

import "./a.js";
```

Output

```
Loaded
```

Only once.

--------------------------------------------------
18. BEST PRACTICES
--------------------------------------------------

✔ Prefer ES Modules

✔ Use Named Exports

✔ Use Default Export only when one primary value exists

✔ Keep one responsibility per module

✔ Avoid circular imports

✔ Prefer dynamic import for lazy features

--------------------------------------------------
19. COMMON MISTAKES
--------------------------------------------------

❌ Forgetting

```
type="module"
```

in browsers.

---

❌ Mixing

```
require()

import
```

incorrectly.

---

❌ Multiple default exports.

Only one allowed.

---

❌ Forgetting file extension in browser imports when required.

--------------------------------------------------
20. FREQUENTLY ASKED INTERVIEW QUESTIONS
--------------------------------------------------

1. What is a module?

2. Why use modules?

3. Difference between CommonJS and ES Modules?

4. Difference between default and named exports?

5. Can one file have multiple default exports?

Answer

No.

6. Can one file have multiple named exports?

Yes.

7. What is tree shaking?

8. What is dynamic import?

9. Why use dynamic import?

10. What is lazy loading?

11. What are circular dependencies?

12. What is module caching?

13. Difference between

```
import *

and

named import
```

14. Which module system does modern React use?

Answer

ES Modules.

15. Which module system did traditional Node.js use?

Answer

CommonJS.

--------------------------------------------------
21. OUTPUT QUESTIONS
--------------------------------------------------

Q1

```javascript
// math.js

export const x = 10;

// app.js

import { x } from "./math.js";

console.log(x);
```

Output

```
10
```

-----------------------------------

Q2

```javascript
export default 100;
```

```javascript
import num from "./a.js";

console.log(num);
```

Output

```
100
```

-----------------------------------

Q3

```javascript
export const x = 10;

export const y = 20;
```

```javascript
import * as obj

from "./a.js";

console.log(obj.x);
```

Output

```
10
```

-----------------------------------

Q4

```javascript
export function add(){

return 100;

}
```

```javascript
import {

add as sum

}

from "./a.js";

console.log(sum());
```

Output

```
100
```

-----------------------------------

Q5

```javascript
console.log("Loaded");
```

Imported twice

Output

```
Loaded
```

Only once.

--------------------------------------------------
22. CODING PROBLEMS
--------------------------------------------------

Beginner

1. Create a math module.
2. Export multiple functions.
3. Import constants.
4. Create a default export.
5. Import using alias.

Intermediate

6. Build an API module.
7. Create barrel exports (index.js).
8. Split a large project into modules.
9. Lazy-load a feature with dynamic import().
10. Convert CommonJS code to ES Modules.

Advanced

11. Build a plugin system using dynamic imports.
12. Resolve circular dependency issues.
13. Implement module caching examples.
14. Configure ES Modules in Node.js.
15. Optimize bundle size using tree shaking.

--------------------------------------------------
23. CHEAT SHEET
--------------------------------------------------

```javascript
// Named Export
export const PI = 3.14;

// Default Export
export default class User {}

// Named Import
import { PI } from "./math.js";

// Default Import
import User from "./user.js";

// Namespace Import
import * as MathUtils from "./math.js";

// Alias
import { add as sum } from "./math.js";

// Dynamic Import
const mod = await import("./math.js");

// CommonJS Export
module.exports = { add };

// CommonJS Import
const math = require("./math");
```

--------------------------------------------------
24. QUICK REVISION
--------------------------------------------------

✔ A module is a JavaScript file with its own scope.

✔ ES Modules use `import` and `export`.

✔ CommonJS uses `require()` and `module.exports`.

✔ Named exports allow multiple exports.

✔ Only one default export is allowed per module.

✔ `import * as name` imports all named exports.

✔ Dynamic `import()` enables lazy loading.

✔ Modules execute only once and are cached.

✔ Tree shaking removes unused exports.

✔ Modern React, Vite, and most frontend tooling use ES Modules.