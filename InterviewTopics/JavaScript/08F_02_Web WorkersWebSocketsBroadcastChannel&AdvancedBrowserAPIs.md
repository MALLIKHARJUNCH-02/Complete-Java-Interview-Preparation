# JavaScript Interview Master Handbook
# Part 8.6B.1 – Web Workers, WebSockets & Advanced Browser APIs

> Beginner → Advanced → Interview Ready

--------------------------------------------------
TABLE OF CONTENTS
--------------------------------------------------

1. Why Advanced Browser APIs?
2. Web Workers
3. Dedicated Workers
4. Shared Workers
5. postMessage()
6. Structured Clone Algorithm
7. WebSockets
8. Server-Sent Events (SSE)
9. BroadcastChannel API
10. Web Locks API
11. requestAnimationFrame()
12. requestIdleCallback()
13. Performance API
14. Network Information API
15. Best Practices
16. Common Mistakes
17. Interview Questions
18. Output Questions
19. Coding Problems
20. Cheat Sheet

--------------------------------------------------
1. WHY ADVANCED BROWSER APIS?
--------------------------------------------------

JavaScript normally runs on

```
Main Thread
```

Everything happens there.

```
UI

↓

Rendering

↓

JavaScript

↓

Events
```

If JavaScript blocks,

```
Frozen UI

↓

Poor User Experience
```

Modern Browser APIs solve these problems.

--------------------------------------------------
2. WEB WORKERS
--------------------------------------------------

Definition

A Web Worker runs JavaScript in

```
Background Thread
```

without blocking the UI.

--------------------------------------------------

Without Worker

```
Heavy Calculation

↓

Main Thread

↓

Frozen Screen
```

--------------------------------------------------

With Worker

```
Main Thread

↓

Worker

↓

Calculation

↓

Result

↓

UI remains responsive
```

--------------------------------------------------

Create Worker

```javascript
const worker =

new Worker("worker.js");
```

--------------------------------------------------

worker.js

```javascript
self.postMessage("Worker Started");
```

Main

```javascript
worker.onmessage = (e)=>{

    console.log(e.data);

};
```

Output

```
Worker Started
```

--------------------------------------------------
3. DEDICATED WORKERS
--------------------------------------------------

One Page

↓

One Worker

```
Page A

↓

Worker
```

Cannot be shared.

--------------------------------------------------
4. SHARED WORKERS
--------------------------------------------------

One Worker

↓

Multiple Tabs

```
Tab A

↓

Shared Worker

↑

Tab B

↑

Tab C
```

Useful

✔ Chat

✔ Shared Cache

✔ Multi-tab Sync

--------------------------------------------------
5. postMessage()
--------------------------------------------------

Workers communicate using

```
postMessage()
```

Main Thread

```javascript
worker.postMessage(100);
```

Worker

```javascript
self.onmessage = (e)=>{

    self.postMessage(e.data * 2);

};
```

Output

```
200
```

--------------------------------------------------
6. STRUCTURED CLONE ALGORITHM
--------------------------------------------------

Data sent between threads is copied using the Structured Clone Algorithm.

Supports

✔ Objects

✔ Arrays

✔ Maps

✔ Sets

✔ Dates

✔ ArrayBuffers

Does NOT clone

❌ Functions

❌ DOM Elements

--------------------------------------------------

Example

```javascript
worker.postMessage({

    name:"Mallik"

});
```

Worker receives a cloned copy.

--------------------------------------------------
7. WEBSOCKETS
--------------------------------------------------

Definition

Provides

```
Persistent

Two-Way

Connection
```

between browser and server.

--------------------------------------------------

HTTP

```
Request

↓

Response

↓

Closed
```

--------------------------------------------------

WebSocket

```
Open

↓

Send

↓

Receive

↓

Send

↓

Receive

↓

Close
```

--------------------------------------------------

Create

```javascript
const socket =

new WebSocket(

"ws://localhost:8080"

);
```

--------------------------------------------------

Events

```javascript
socket.onopen

socket.onmessage

socket.onerror

socket.onclose
```

--------------------------------------------------

Send

```javascript
socket.send("Hello");
```

--------------------------------------------------
Use Cases

✔ Chat Apps

✔ Live Sports

✔ Trading

✔ Multiplayer Games

✔ Notifications

--------------------------------------------------
8. SERVER-SENT EVENTS (SSE)
--------------------------------------------------

Unlike WebSockets,

SSE is

```
Server

↓

Browser
```

Only one-way.

--------------------------------------------------

Create

```javascript
const source =

new EventSource("/events");
```

Receive

```javascript
source.onmessage = (e)=>{

    console.log(e.data);

};
```

--------------------------------------------------

Comparison

| WebSocket | SSE |
|------------|-----|
| Two-way | One-way |
| Complex | Simple |
| Chat | Notifications |
| Games | Live Feeds |

--------------------------------------------------
9. BROADCASTCHANNEL API
--------------------------------------------------

Communicate between tabs.

```javascript
const channel =

new BroadcastChannel("chat");
```

Send

```javascript
channel.postMessage("Hello");
```

Receive

```javascript
channel.onmessage = (e)=>{

    console.log(e.data);

};
```

--------------------------------------------------

Use Cases

✔ Logout All Tabs

✔ Sync Theme

✔ Shared Notifications

--------------------------------------------------
10. WEB LOCKS API
--------------------------------------------------

Prevents multiple tabs from modifying the same resource simultaneously.

```javascript
navigator.locks.request(

"db-lock",

async ()=>{

    console.log("Locked");

});
```

Useful

✔ IndexedDB

✔ Shared Storage

✔ Multi-tab Editing

--------------------------------------------------
11. requestAnimationFrame()
--------------------------------------------------

Runs before the browser repaints.

Better than

```
setInterval()
```

for animations.

--------------------------------------------------

Example

```javascript
function animate(){

    console.log("Frame");

    requestAnimationFrame(animate);

}

requestAnimationFrame(animate);
```

--------------------------------------------------

Benefits

✔ Smooth Animations

✔ Browser Optimized

✔ Pauses in inactive tabs

--------------------------------------------------
12. requestIdleCallback()
--------------------------------------------------

Runs work when the browser is idle.

```javascript
requestIdleCallback(()=>{

    console.log("Idle Work");

});
```

Use Cases

✔ Analytics

✔ Cache Cleanup

✔ Background Tasks

Interview Note

`requestIdleCallback()` is **not supported in all browsers**, so check compatibility or provide a fallback when needed.

--------------------------------------------------
13. PERFORMANCE API
--------------------------------------------------

Measure execution time.

```javascript
performance.mark("start");

// Work

performance.mark("end");

performance.measure(

"task",

"start",

"end"

);
```

Simple Timing

```javascript
const start = performance.now();

// Work

const end = performance.now();

console.log(end-start);
```

--------------------------------------------------

Navigation Timing

```javascript
performance.getEntriesByType(

"navigation"

);
```

--------------------------------------------------
14. NETWORK INFORMATION API
--------------------------------------------------

Provides connection details.

```javascript
navigator.connection.effectiveType
```

Possible

```
4g

3g

2g

slow-2g
```

Interview Note

The Network Information API is **not supported in all browsers**.

--------------------------------------------------
15. BEST PRACTICES
--------------------------------------------------

✔ Use Workers for CPU-intensive tasks.

✔ Use WebSockets for real-time communication.

✔ Use SSE for one-way live updates.

✔ Prefer requestAnimationFrame() for animations.

✔ Use Performance API for measurements.

✔ Close WebSockets and channels when finished.

--------------------------------------------------
16. COMMON MISTAKES
--------------------------------------------------

❌ Using Workers for tiny tasks.

❌ Assuming Workers can access the DOM.

Workers cannot directly access DOM APIs.

❌ Forgetting to terminate Workers.

❌ Using setInterval() for complex animations.

❌ Ignoring browser compatibility.

--------------------------------------------------
17. FREQUENTLY ASKED INTERVIEW QUESTIONS
--------------------------------------------------

1. What is a Web Worker?

2. Why use Web Workers?

3. Can Workers access the DOM?

Answer

No.

4. Difference between Dedicated Worker and Shared Worker?

5. What is postMessage()?

6. What is Structured Clone?

7. What is WebSocket?

8. Difference between HTTP and WebSocket?

9. Difference between WebSocket and SSE?

10. What is BroadcastChannel?

11. What is Web Locks API?

12. Why use requestAnimationFrame()?

13. Difference between setInterval() and requestAnimationFrame()?

14. What is requestIdleCallback()?

15. What is the Performance API?

--------------------------------------------------
18. OUTPUT QUESTIONS
--------------------------------------------------

Q1

```javascript
worker.postMessage(10);
```

Worker

```javascript
self.onmessage=e=>{

    self.postMessage(e.data*2);

}
```

Output

```
20
```

--------------------------------------------------

Q2

```javascript
const socket=

new WebSocket("ws://localhost");
```

Question

Connection Type?

Answer

```
Persistent
```

--------------------------------------------------

Q3

```javascript
requestAnimationFrame(()=>{

console.log("Frame");

});
```

Output

```
Frame
```

Runs before the next repaint.

--------------------------------------------------

Q4

```javascript
const channel=

new BroadcastChannel("demo");

channel.postMessage("Hi");
```

Result

Other listening contexts on the same origin can receive

```
Hi
```

--------------------------------------------------

Q5

```javascript
performance.now();
```

Returns

```
High-resolution timestamp
```

--------------------------------------------------
19. CODING PROBLEMS
--------------------------------------------------

Beginner

1. Create a Worker.
2. Send data using postMessage().
3. Receive Worker response.
4. Build a simple WebSocket client.
5. Measure execution time.

Intermediate

6. Build a calculator using a Worker.
7. Create multi-tab chat using BroadcastChannel.
8. Build an FPS counter with requestAnimationFrame().
9. Build live notifications using SSE.
10. Profile application performance.

Advanced

11. Build a collaborative editor using WebSockets.
12. Synchronize authentication across tabs.
13. Implement background image processing with Workers.
14. Build a real-time dashboard.
15. Create a performance monitoring utility.

--------------------------------------------------
20. CHEAT SHEET
--------------------------------------------------

```javascript
// Worker
const worker = new Worker("worker.js");
worker.postMessage(data);

// Worker Response
worker.onmessage = e => console.log(e.data);

// WebSocket
const socket = new WebSocket(url);

// BroadcastChannel
const channel = new BroadcastChannel("app");

// requestAnimationFrame
requestAnimationFrame(callback);

// requestIdleCallback
requestIdleCallback(callback);

// Performance
performance.now();

// Locks
navigator.locks.request("lock", async()=>{});
```

--------------------------------------------------
21. QUICK REVISION
--------------------------------------------------

✔ Web Workers execute JavaScript on background threads.

✔ Workers communicate using postMessage().

✔ Workers cannot directly manipulate the DOM.

✔ Structured Clone safely copies supported data types between threads.

✔ WebSockets provide persistent two-way communication.

✔ SSE provides one-way server-to-client updates.

✔ BroadcastChannel enables same-origin tab communication.

✔ Web Locks coordinate access to shared resources across contexts.

✔ requestAnimationFrame() is preferred for animations.

✔ requestIdleCallback() schedules low-priority work during idle time.

✔ Performance API provides precise timing measurements.

✔ Network Information API exposes connection details where supported.

---