# JavaScript Interview Master Handbook
# Part 9.1C.1 – CSRF, Clickjacking & Secure Authentication

Beginner → Advanced → Interview Ready

--------------------------------------------------
TABLE OF CONTENTS
--------------------------------------------------

1. What is Authentication?
2. Authentication vs Authorization
3. Session-Based Authentication
4. JWT Authentication
5. What is CSRF?
6. CSRF Attack Flow
7. CSRF Prevention
8. CSRF Tokens
9. SameSite Cookies
10. Clickjacking
11. X-Frame-Options
12. CSP frame-ancestors
13. Session Fixation
14. JWT Security
15. Refresh Tokens
16. OAuth Basics
17. Secure Logout
18. Best Practices
19. Common Mistakes
20. Interview Questions
21. Scenario Questions
22. Secure Design Exercises
23. Cheat Sheet

--------------------------------------------------
1. WHAT IS AUTHENTICATION?
--------------------------------------------------

Authentication answers

```
Who are you?
```

Example

```
Username

+

Password

↓

Server verifies

↓

Authenticated
```

--------------------------------------------------
2. AUTHENTICATION vs AUTHORIZATION
--------------------------------------------------

Authentication

↓

Identity Verification

Example

```
Login
```

Authorization

↓

Permission Check

Example

```
Can user delete products?
```

--------------------------------------------------

Example

```
Login

↓

Authentication

↓

Admin Role?

↓

Authorization
```

--------------------------------------------------
3. SESSION-BASED AUTHENTICATION
--------------------------------------------------

Flow

```
Login

↓

Server Creates Session

↓

Session ID

↓

Cookie

↓

Browser

↓

Future Requests

↓

Cookie Sent

↓

Server Finds Session
```

Advantages

✔ Simple

✔ Server controls sessions

Disadvantages

❌ Server stores session data

❌ Harder to scale without shared session storage

--------------------------------------------------
4. JWT AUTHENTICATION
--------------------------------------------------

JWT

↓

JSON Web Token

Structure

```
Header

.

Payload

.

Signature
```

Example

```
xxxxx.yyyyy.zzzzz
```

Flow

```
Login

↓

Server

↓

JWT

↓

Browser

↓

Future Requests

↓

Authorization Header

↓

Server Verifies Signature
```

--------------------------------------------------
5. WHAT IS CSRF?
--------------------------------------------------

Definition

Cross-Site Request Forgery

An attacker tricks a user's browser into sending an unwanted authenticated request to another website.

--------------------------------------------------

Visualization

```
Victim Logged In

↓

Visits Malicious Site

↓

Browser Sends Request

↓

Target Site Receives Cookie

↓

Unwanted Action
```

--------------------------------------------------
6. CSRF ATTACK FLOW
--------------------------------------------------

Example

```
Bank Login

↓

Cookie Stored

↓

Visit Evil Website

↓

Hidden Request Sent

↓

Browser Includes Cookie

↓

Bank Thinks User Requested It
```

--------------------------------------------------
7. CSRF PREVENTION
--------------------------------------------------

Major Defenses

✔ CSRF Tokens

✔ SameSite Cookies

✔ Origin/Referer validation

✔ Re-authentication for sensitive actions

--------------------------------------------------
8. CSRF TOKENS
--------------------------------------------------

Flow

```
Server

↓

Random Token

↓

HTML Form

↓

User Submits

↓

Token Verified

↓

Success
```

Attacker

↓

Cannot guess the token.

--------------------------------------------------
9. SAMESITE COOKIES
--------------------------------------------------

Cookie Attribute

```
SameSite
```

Values

```
Strict

Lax

None
```

--------------------------------------------------

Strict

```
Maximum Protection

↓

Cross-site requests

↓

Cookie Not Sent
```

--------------------------------------------------

Lax

```
Allows some top-level navigation

Blocks many CSRF scenarios
```

--------------------------------------------------

None

```
Cross-site Cookies Allowed

Requires Secure
```

--------------------------------------------------
10. CLICKJACKING
--------------------------------------------------

Definition

An attacker embeds your website in an invisible or disguised iframe.

Example

```
User Thinks

↓

Clicks Button

↓

Actually Clicks Hidden Website
```

--------------------------------------------------
11. X-FRAME-OPTIONS
--------------------------------------------------

Response Header

```
X-Frame-Options:

DENY
```

Options

```
DENY

SAMEORIGIN
```

Purpose

↓

Prevent unauthorized framing.

--------------------------------------------------
12. CSP frame-ancestors
--------------------------------------------------

Modern alternative

```
Content-Security-Policy

frame-ancestors 'self';
```

Controls which origins may embed the page.

More flexible than `X-Frame-Options`.

--------------------------------------------------
13. SESSION FIXATION
--------------------------------------------------

Definition

Attacker causes a victim to use a known session identifier.

Flow

```
Attacker Gets Session

↓

Victim Uses Same Session

↓

Victim Logs In

↓

Attacker Reuses Session
```

Prevention

✔ Generate a new session ID after successful login.

--------------------------------------------------
14. JWT SECURITY
--------------------------------------------------

Never trust JWT payload without verifying the signature.

Good Practices

✔ Short expiration

✔ Verify signature

✔ Rotate signing keys

✔ Use HTTPS

✔ Store sensitive tokens securely

--------------------------------------------------

Avoid

```
Long-lived Access Tokens
```

--------------------------------------------------
15. REFRESH TOKENS
--------------------------------------------------

Access Token

↓

Short Lifetime

Example

```
15 Minutes
```

Refresh Token

↓

Longer Lifetime

Example

```
7 Days
```

Flow

```
Login

↓

Access Token

+

Refresh Token

↓

Access Token Expires

↓

Use Refresh Token

↓

Receive New Access Token
```

--------------------------------------------------
16. OAUTH BASICS
--------------------------------------------------

OAuth

↓

Authorization Framework

Allows users to grant limited access without sharing passwords.

Example

```
Login with Google

↓

Google

↓

Authorization

↓

Application Receives Token
```

OAuth is **not** the same as authentication by itself, although **OpenID Connect (OIDC)** builds on OAuth 2.0 to provide authentication.

--------------------------------------------------
17. SECURE LOGOUT
--------------------------------------------------

Logout Steps

✔ Remove client tokens

✔ Invalidate server session (if applicable)

✔ Revoke refresh tokens if supported

✔ Clear authentication cookies

--------------------------------------------------
18. BEST PRACTICES
--------------------------------------------------

✔ Use HTTPS everywhere.

✔ Regenerate session IDs after login.

✔ Keep access tokens short-lived.

✔ Protect refresh tokens.

✔ Enable SameSite cookies.

✔ Verify JWT signatures.

✔ Use CSRF protection for cookie-based authentication.

✔ Use CSP and X-Frame-Options where appropriate.

--------------------------------------------------
19. COMMON MISTAKES
--------------------------------------------------

❌ Assuming JWTs are encrypted.

They are typically **encoded and signed**, not encrypted.

❌ Using very long-lived access tokens.

❌ Ignoring token expiration.

❌ Storing secrets inside JWT payloads.

❌ Forgetting HTTPS.

❌ Using SameSite=None without Secure.

--------------------------------------------------
20. FREQUENTLY ASKED INTERVIEW QUESTIONS
--------------------------------------------------

1. What is Authentication?

2. Authentication vs Authorization?

3. What is CSRF?

4. How does CSRF work?

5. How do CSRF Tokens prevent attacks?

6. What is SameSite?

7. Difference between Strict, Lax and None?

8. What is Clickjacking?

9. What is X-Frame-Options?

10. What is CSP frame-ancestors?

11. What is Session Fixation?

12. Why regenerate Session IDs?

13. What is JWT?

14. Difference between Access Token and Refresh Token?

15. What is OAuth?

16. OAuth vs JWT?

17. OAuth vs OpenID Connect?

18. Why shouldn't JWT payloads contain secrets?

19. Why use HTTPS with authentication?

20. How should logout be implemented securely?

--------------------------------------------------
21. SCENARIO QUESTIONS
--------------------------------------------------

Scenario 1

A banking site uses cookies.

Question

How do you reduce CSRF risk?

Answer

✔ CSRF Token

✔ SameSite cookies

✔ Origin validation

--------------------------------------------------

Scenario 2

JWT expires every 15 minutes.

Question

Should users log in again every 15 minutes?

Answer

No.

Use a Refresh Token to obtain a new short-lived Access Token.

--------------------------------------------------

Scenario 3

A website is embedded inside another site.

Question

How do you prevent this?

Answer

```
X-Frame-Options

or

CSP frame-ancestors
```

--------------------------------------------------

Scenario 4

User logs in.

Question

Should session ID change?

Answer

Yes.

Regenerate it after authentication.

--------------------------------------------------

Scenario 5

Should JWT payload contain a password?

Answer

No.

Never place sensitive secrets in the payload.

--------------------------------------------------
22. SECURE DESIGN EXERCISES
--------------------------------------------------

Beginner

1. Explain login flow.

2. Compare sessions and JWT.

3. Explain CSRF.

4. Explain SameSite cookies.

5. Explain Refresh Tokens.

Intermediate

6. Design secure login.

7. Protect a banking transfer form.

8. Design logout.

9. Secure iframe embedding.

10. Design token expiration strategy.

Advanced

11. Design authentication for a SPA.

12. Design secure OAuth login.

13. Protect refresh token rotation.

14. Design multi-device logout.

15. Threat-model an authentication system.

--------------------------------------------------
23. CHEAT SHEET
--------------------------------------------------

Authentication

↓

Who are you?

---------------------------------

Authorization

↓

What can you access?

---------------------------------

CSRF

↓

Forged authenticated request

↓

Prevent with

CSRF Token

+

SameSite

+

Origin validation

---------------------------------

Clickjacking

↓

Prevent with

X-Frame-Options

or

CSP frame-ancestors

---------------------------------

JWT

↓

Header

Payload

Signature

---------------------------------

Access Token

↓

Short-lived

---------------------------------

Refresh Token

↓

Long-lived

---------------------------------

OAuth

↓

Authorization Framework

---------------------------------

OIDC

↓

Authentication Layer

---------------------------------

Secure Logout

↓

Invalidate Session

↓

Revoke Refresh Token

↓

Clear Cookies

↓

Remove Client State

--------------------------------------------------
24. QUICK REVISION
--------------------------------------------------

✔ Authentication verifies identity.

✔ Authorization determines permissions.

✔ Sessions use server-side state.

✔ JWTs are signed, not encrypted by default.

✔ CSRF targets authenticated cookie-based requests.

✔ CSRF Tokens and SameSite cookies help prevent CSRF.

✔ Clickjacking abuses hidden iframes.

✔ X-Frame-Options and CSP frame-ancestors reduce framing attacks.

✔ Regenerate session IDs after login to prevent session fixation.

✔ Use short-lived Access Tokens with Refresh Tokens.

✔ OAuth is an authorization framework.

✔ OpenID Connect adds authentication on top of OAuth 2.0.

✔ Always use HTTPS for authentication.
