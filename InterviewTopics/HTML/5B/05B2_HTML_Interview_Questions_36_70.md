# HTML Interview Guide
# Part 5B.2 – HTML Interview Questions (36–70)

---

# 36. What is an HTML Form?

### Answer

An HTML form is used to collect user input and send it to a server.

Examples

- Login
- Registration
- Contact Form
- Payment Form
- Search Form

Example

```html
<form action="/login" method="POST">
    <input type="text" name="username">
    <button type="submit">Login</button>
</form>
```

---

# 37. What are the important attributes of the <form> tag?

### Answer

| Attribute | Purpose |
|------------|----------|
| action | URL where data is sent |
| method | GET or POST |
| enctype | Encoding type |
| autocomplete | Enable/Disable autocomplete |
| novalidate | Disable HTML validation |
| target | Where response opens |

---

# 38. Difference between GET and POST?

| GET | POST |
|------|------|
| Data in URL | Data in Request Body |
| Less Secure | More Secure |
| Limited Data | Large Data |
| Bookmarkable | Not Bookmarkable |
| Used for Search | Used for Login/Registration |

Example GET

```
search.html?name=mallik
```

Example POST

```
POST /login
Body:
username=mallik
password=******
```

---

# 39. When should GET be used?

Use GET when

- Searching
- Filtering
- Reading data
- Navigation

Never use GET for passwords or sensitive information.

---

# 40. When should POST be used?

Use POST when

- Login
- Registration
- Payment
- Upload File
- Updating Database

---

# 41. Difference between readonly and disabled?

| readonly | disabled |
|-----------|-----------|
| Editable ❌ | Editable ❌ |
| Submitted ✔ | Submitted ❌ |
| Focus ✔ | Focus ❌ |

---

# 42. Why do we use labels?

Labels improve

- Accessibility
- User Experience
- Screen Reader Support

Example

```html
<label for="email">Email</label>

<input id="email">
```

Clicking the label focuses the input.

---

# 43. Why should labels use the "for" attribute?

Because it connects the label with the corresponding input element.

---

# 44. Difference between placeholder and label?

| Label | Placeholder |
|--------|-------------|
| Permanent | Temporary |
| Accessibility | Hint Only |
| Always Visible | Disappears While Typing |

Best Practice

Always use labels.

---

# 45. Difference between checkbox and radio button?

Checkbox

✔ Multiple selections

Radio

✔ Only one selection

Example

```html
<input type="checkbox">

<input type="radio">
```

---

# 46. Difference between button and input type="button"?

Both create clickable buttons.

Preferred

```html
<button>
```

Reason

- Supports HTML inside
- More flexible
- Better accessibility

---

# 47. Default type of button?

Answer

```
submit
```

Many beginners forget this.

Example

```html
<button>

Save

</button>
```

It submits the form unless type is specified.

---

# 48. Difference between submit and button?

Submit

Submits the form.

Button

Does nothing until JavaScript is added.

---

# 49. What is HTML Validation?

HTML validation checks user input before the form is submitted.

Examples

```html
required

maxlength

pattern

min

max
```

---

# 50. Can HTML Validation replace Backend Validation?

Answer

No.

HTML validation improves user experience only.

Backend validation is mandatory because users can bypass client-side validation.

---

# 51. Why is enctype="multipart/form-data" required?

It allows files to be uploaded.

Example

```html
<form

enctype="multipart/form-data">

<input type="file">

</form>
```

Without it, uploaded files won't be transmitted correctly.

---

# 52. Difference between select and datalist?

| Select | Datalist |
|----------|-----------|
| Fixed Options | Suggestions |
| User Must Choose | User May Type Own Value |

---

# 53. What is fieldset?

Groups related form elements.

Example

```html
<fieldset>

...

</fieldset>
```

---

# 54. What is legend?

Provides a title for a fieldset.

```html
<fieldset>

<legend>

Personal Details

</legend>

</fieldset>
```

---

# 55. Difference between table and div?

Table

Used for tabular data.

Div

Generic layout container.

Never use tables for page layout.

---

# 56. Difference between td and th?

| td | th |
|-----|------|
| Table Data | Table Header |
| Normal Text | Bold by Default |

---

# 57. What are rowspan and colspan?

rowspan

Merge rows.

```html
<td rowspan="2">
```

colspan

Merge columns.

```html
<td colspan="2">
```

---

# 58. Why should tables use thead, tbody and tfoot?

Benefits

- Better Structure
- Accessibility
- Easier Styling
- Improved Readability

---

# 59. Difference between ordered and unordered lists?

Ordered

```html
<ol>
```

Uses numbers.

Unordered

```html
<ul>
```

Uses bullets.

---

# 60. What is a Description List?

Example

```html
<dl>

<dt>HTML</dt>

<dd>Markup Language</dd>

</dl>
```

Used for terms and definitions.

---

# 61. What is iframe?

Used to embed another webpage.

Example

```html
<iframe

src="https://example.com">

</iframe>
```

---

# 62. What are the disadvantages of iframe?

- Slower Loading
- Security Risks
- SEO Limitations
- Cross-Origin Restrictions

---

# 63. Difference between audio and video tags?

Audio

```html
<audio controls>
```

Video

```html
<video controls>
```

Video displays visuals in addition to audio.

---

# 64. Difference between Canvas and SVG?

Canvas

- Pixel Based
- Better for Games
- Drawn with JavaScript

SVG

- Vector Based
- Better for Logos
- Easily Scalable

---

# 65. Explain Browser Rendering Process.

Steps

```
HTML

↓

DOM

↓

CSS

↓

CSSOM

↓

Render Tree

↓

Layout

↓

Paint

↓

Composite

↓

Display
```

---

# 66. Difference between DOM and CSSOM?

DOM

Represents HTML structure.

CSSOM

Represents CSS styles.

Browser combines both to create the Render Tree.

---

# 67. Difference between Local Storage, Session Storage and Cookies?

| Local Storage | Session Storage | Cookies |
|----------------|----------------|---------|
| Permanent | Tab Lifetime | Configurable Expiration |
| ~5–10 MB | ~5–10 MB | ~4 KB |
| Not Automatically Sent to Server | Not Automatically Sent | Automatically Sent with HTTP Requests |

---

# 68. What is Cross Site Scripting (XSS)?

XSS is an attack where malicious JavaScript is injected into a webpage.

Example

```html
<script>

alert("Hacked")

</script>
```

Prevention

- Escape user input
- Validate input
- Encode output
- Use Content Security Policy (CSP)

---

# 69. Why shouldn't duplicate IDs be used?

Because

- IDs must be unique.
- JavaScript selectors like `getElementById()` expect a unique element.
- Duplicate IDs can cause CSS and JavaScript bugs.
- Accessibility tools may behave incorrectly.

---

# 70. Why is Semantic HTML recommended?

Reasons

✔ Better SEO

✔ Better Accessibility

✔ Cleaner Code

✔ Easier Maintenance

✔ Better Screen Reader Support

✔ Improves Team Collaboration

---

# Rapid Fire (Round 2)

✔ Default button type?

→ submit

✔ File Upload Encoding?

→ multipart/form-data

✔ Which tag embeds another webpage?

→ iframe

✔ Which tag groups form controls?

→ fieldset

✔ Which tag provides the title for fieldset?

→ legend

✔ Which tag creates dropdown?

→ select

✔ Which tag creates multiline input?

→ textarea

✔ Which tag creates table rows?

→ tr

✔ Which tag creates table headers?

→ th

✔ Which tag creates table data?

→ td

✔ Which tag creates ordered list?

→ ol

✔ Which tag creates unordered list?

→ ul

✔ Which tag creates description list?

→ dl

✔ Which HTML element is used for user comments?

→ textarea

✔ HTML validation runs on?

→ Client Side

✔ Can client-side validation be bypassed?

→ Yes

✔ Storage that survives browser restart?

→ Local Storage

✔ Storage cleared when tab closes?

→ Session Storage

✔ Which storage is automatically sent to the server?

→ Cookies

---

# Interview Tips

### Freshers

Know the differences between:

- GET vs POST
- div vs span
- id vs class
- Local Storage vs Session Storage vs Cookies
- checkbox vs radio
- `<b>` vs `<strong>`
- `<i>` vs `<em>`

### Experienced Candidates

Be prepared to explain:

- Browser rendering pipeline
- Accessibility practices
- Semantic HTML
- Form validation strategy
- Performance optimization
- XSS prevention
- When to use iframes, Canvas, or SVG

---