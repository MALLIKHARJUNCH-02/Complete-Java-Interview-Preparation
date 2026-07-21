# JavaScript Interview Master Handbook
# Part 9.1A – JavaScript Security Fundamentals

> Beginner → Advanced → Interview Ready

---

# Table of Contents

1. Why Web Security?
2. CIA Triad
3. Same-Origin Policy (SOP)
4. Origin
5. Cross-Origin Requests
6. Cross-Origin Resource Sharing (CORS)
7. Simple Requests
8. Preflight Requests
9. CORS Headers
10. Common CORS Errors
11. Best Practices
12. Common Mistakes
13. Interview Questions
14. Output Questions
15. Coding Problems
16. Cheat Sheet

---

# 1. Why Web Security?

Every web application stores valuable data.

Examples

✔ User Accounts

✔ Passwords

✔ Banking Information

✔ JWT Tokens

✔ Payment Details

Without security

↓

Attackers

↓

Steal Data

↓

Modify Data

↓

Impersonate Users

---

# 2. CIA Triad

Every security system aims to protect

```
Confidentiality

↓

Integrity

↓

Availability
```

---

## Confidentiality

Only authorized users can view data.

Example

```
Password

↓

Encrypted

↓

Protected
```

---

## Integrity

Data should not be modified illegally.

Example

```
Bank Balance

↓

₹1000

↓

Attacker Changes

↓

₹1,00,000

Integrity Broken
```

---

## Availability

Services should remain accessible.

Example

```
Website

↓

24×7 Available
```

---

# 3. Same-Origin Policy (SOP)

## Definition

The browser's Same-Origin Policy prevents one origin from freely accessing resources from another origin.

This is one of the browser's most important security features.

---

Example

Page

```
https://shop.com
```

tries to read

```
https://bank.com
```

Browser

↓

Blocked

---

Why?

Otherwise

```
Malicious Site

↓

Read Gmail

↓

Read Banking Data

↓

Read Facebook Messages
```

Security would be broken.

---

# 4. What is an Origin?

An origin consists of

```
Protocol

+

Host

+

Port
```

---

Example

```
https://example.com:443
```

Protocol

```
https
```

Host

```
example.com
```

Port

```
443
```

---

Same Origin Examples

| URL 1 | URL 2 | Same Origin? |
|--------|--------|--------------|
| https://example.com | https://example.com | ✅ Yes |
| https://example.com | http://example.com | ❌ No |
| https://example.com | https://api.example.com | ❌ No |
| https://example.com:443 | https://example.com:8080 | ❌ No |

---

# 5. Cross-Origin Requests

Suppose

Frontend

```
https://myapp.com
```

Backend

```
https://api.myapp.com
```

Different subdomains

↓

Different origins

↓

Browser checks CORS.

---

# 6. Cross-Origin Resource Sharing (CORS)

## Definition

CORS is a browser mechanism that allows servers to specify which origins may access their resources.

---

Without CORS

```
Browser

↓

Blocked
```

---

With CORS

```
Browser

↓

Checks Server Headers

↓

Allowed?

↓

Yes

↓

Success
```

---

Example Response Header

```
Access-Control-Allow-Origin:

https://myapp.com
```

Browser

↓

Allows JavaScript access to the response.

---

# 7. Simple Requests

A request is considered "simple" only if it meets specific browser-defined conditions.

Examples

```
GET

POST

HEAD
```

with only permitted headers and content types.

Typically

↓

No preflight request.

---

Example

```javascript
fetch(

"https://api.example.com/users"

);
```

Browser

↓

Sends request directly.

---

# 8. Preflight Requests

For certain cross-origin requests (for example, using methods like PUT or DELETE, or custom headers), the browser first sends an **OPTIONS** request.

---

Example

```javascript
fetch(

url,

{

method:"PUT",

headers:{

Authorization:"Bearer xyz"

}

});
```

Browser

↓

OPTIONS

↓

Server Replies

↓

Allowed?

↓

Actual PUT Request

---

Preflight Flow

```
Browser

↓

OPTIONS

↓

Server

↓

Allowed?

↓

PUT
```

---

# 9. Important CORS Headers

## Access-Control-Allow-Origin

Allowed origin.

Example

```
Access-Control-Allow-Origin:

https://example.com
```

---

## Access-Control-Allow-Methods

```
GET

POST

PUT

DELETE
```

---

## Access-Control-Allow-Headers

Example

```
Authorization

Content-Type
```

---

## Access-Control-Allow-Credentials

Allows credentials such as cookies or HTTP authentication to be sent.

Example

```
true
```

Important

When using credentials,

```
Access-Control-Allow-Origin
```

cannot be

```
*
```

It must specify an explicit origin.

---

# 10. Common CORS Errors

Example

```
Access to fetch

has been blocked

by CORS policy
```

Causes

✔ Server missing CORS headers

✔ Wrong origin

✔ Wrong HTTP method

✔ Missing allowed headers

---

Important

CORS is enforced by browsers.

It is **not** a server-side authentication mechanism.

---

# Browser Flow

```
JavaScript

↓

Browser

↓

Checks SOP

↓

Cross Origin?

↓

Yes

↓

Check CORS

↓

Allowed?

↓

Request Accessible
```

---

# Best Practices

✔ Configure CORS on the server.

✔ Allow only trusted origins.

✔ Use HTTPS.

✔ Restrict allowed methods.

✔ Restrict allowed headers.

✔ Avoid `Access-Control-Allow-Origin: *` for sensitive APIs.

---

# Common Mistakes

❌ Believing CORS is authentication.

❌ Disabling browser security during development and forgetting proper server configuration.

❌ Allowing every origin unnecessarily.

❌ Assuming CORS protects against all attacks.

---

# Frequently Asked Interview Questions

1. What is Same-Origin Policy?

Answer

A browser security policy that restricts access between different origins.

---

2. What is an Origin?

Answer

Protocol + Host + Port.

---

3. What is CORS?

Answer

A browser mechanism that lets servers specify which origins may access resources.

---

4. Why is CORS needed?

Answer

To safely allow selected cross-origin access.

---

5. What is a Preflight Request?

Answer

An automatic OPTIONS request sent before certain cross-origin requests.

---

6. Which methods usually trigger preflight?

Examples include

```
PUT

DELETE

PATCH
```

or requests with non-simple headers.

---

7. What is

```
Access-Control-Allow-Origin
```

used for?

Answer

To specify which origins are allowed.

---

8. Can

```
Access-Control-Allow-Origin

*

```

be used with credentials?

Answer

No.

---

9. Is CORS enforced by Node.js?

Answer

No.

It is enforced by browsers.

---

10. Is Postman affected by CORS?

Answer

Generally no.

Postman is not a browser and does not enforce browser CORS rules.

---

# Output Questions

## Q1

```javascript
fetch(

"https://api.example.com"

);
```

Question

Will it always work?

Answer

Only if the server permits the cross-origin request when required.

---

## Q2

```
https://site.com

↓

https://api.site.com
```

Same Origin?

Answer

```
No
```

Different host.

---

## Q3

```
https://site.com

↓

http://site.com
```

Same Origin?

Answer

```
No
```

Different protocol.

---

## Q4

```
https://site.com:443

↓

https://site.com:8080
```

Same Origin?

Answer

```
No
```

Different port.

---

## Q5

Question

Who enforces CORS?

Answer

```
Browser
```

---

# Coding Problems

## Beginner

1. Configure CORS in an Express server.
2. Send a cross-origin fetch request.
3. Inspect CORS response headers.
4. Compare same-origin vs cross-origin URLs.
5. Trigger a preflight request.

---

## Intermediate

6. Allow only one frontend origin.
7. Allow credentials securely.
8. Debug a CORS error.
9. Configure custom headers.
10. Test requests using browser DevTools.

---

## Advanced

11. Configure production CORS for multiple environments.
12. Design a secure API gateway CORS policy.
13. Handle authenticated cross-origin requests.
14. Compare browser behavior with Postman.
15. Analyze a complex CORS scenario.

---

# Cheat Sheet

```text
Origin
=

Protocol

+

Host

+

Port

---------------------------------

Same-Origin Policy

↓

Blocks unauthorized cross-origin access

---------------------------------

CORS

↓

Server tells browser

who may access resources

---------------------------------

Important Headers

Access-Control-Allow-Origin

Access-Control-Allow-Methods

Access-Control-Allow-Headers

Access-Control-Allow-Credentials

---------------------------------

Preflight

OPTIONS

↓

Permission Check

↓

Actual Request
```

---

# Quick Revision

✔ Same-Origin Policy is a browser security feature.

✔ An origin consists of protocol, host, and port.

✔ Different protocol, host, or port means a different origin.

✔ CORS allows controlled cross-origin access.

✔ The server controls CORS through response headers.

✔ Browsers enforce CORS.

✔ Simple requests often do not require preflight.

✔ Complex requests may trigger an OPTIONS preflight.

✔ `Access-Control-Allow-Origin` specifies allowed origins.

✔ Credentials cannot be used with a wildcard (`*`) origin.

✔ CORS is **not** an authentication or authorization mechanism.

---