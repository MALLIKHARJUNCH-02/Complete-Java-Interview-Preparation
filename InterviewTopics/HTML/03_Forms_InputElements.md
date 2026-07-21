# HTML Interview Guide
# Part 3 – Forms & Input Elements

---

# Table of Contents

1. Introduction to Forms
2. Form Structure
3. Form Attributes
4. GET vs POST
5. Label
6. Input Element
7. Input Types
8. Textarea
9. Select
10. Option
11. Optgroup
12. Datalist
13. Fieldset
14. Legend
15. Output
16. Button Types
17. HTML5 Validation
18. Common Attributes
19. File Upload
20. Hidden Input
21. Best Practices
22. Common Mistakes
23. Interview Questions

---

# 1. What is a Form?

A form is used to collect data from users.

Examples

- Login
- Registration
- Contact Form
- Payment Form
- Feedback Form
- Search Box

---

# Real Life Example

Imagine a college admission form.

Student enters

✔ Name

✔ Email

✔ Mobile

✔ Address

✔ Upload Photo

All these fields together form an HTML Form.

---

# 2. Basic Form Structure

```html
<form>

<label>Name</label>

<input type="text">

<button>

Submit

</button>

</form>
```

---

# 3. Form Attributes

## action

Specifies where the data should be sent.

```html
<form action="/register">
```

---

## method

Specifies how data is sent.

```html
<form method="GET">
```

or

```html
<form method="POST">
```

---

## autocomplete

```html
<form autocomplete="on">
```

Possible values

```
on

off
```

---

## target

```html
<form target="_blank">
```

---

## enctype

Required for uploading files.

```html
<form

enctype="multipart/form-data">
```

---

## novalidate

Disables HTML validation.

```html
<form novalidate>
```

---

# 4. GET vs POST

## GET

Data goes in URL.

Example

```
login.html?

username=mallik

&password=123
```

Characteristics

✔ Faster

✔ Bookmarkable

✔ Visible

✔ Limited data

✔ Used for searching

---

## POST

Data goes inside HTTP request body.

Characteristics

✔ Secure

✔ Large Data

✔ File Upload

✔ Login

✔ Registration

✔ Payment

---

Interview Question

Difference between GET and POST?

| GET | POST |
|------|-------|
| URL | Body |
| Less Secure | More Secure |
| Faster | Slightly Slower |
| Limited | Unlimited |
| Bookmark | No Bookmark |
| Search | Registration |

---

# 5. Label

```html
<label>Name</label>
```

Better

```html
<label for="username">

Username

</label>

<input

id="username">

```

Advantages

✔ Accessibility

✔ Better UX

✔ Clicking label focuses input

---

Interview Question

Why use

```
for
```

attribute?

Answer

It connects label with input.

---

# 6. Input Element

Syntax

```html
<input>
```

Input is one of the most used HTML elements.

---

# 7. Input Types

## Text

```html
<input type="text">
```

---

## Password

```html
<input type="password">
```

Hides entered text.

---

## Email

```html
<input type="email">
```

Checks email format.

---

## Number

```html
<input type="number">
```

---

## Tel

```html
<input type="tel">
```

---

## URL

```html
<input type="url">
```

---

## Search

```html
<input type="search">
```

---

## Date

```html
<input type="date">
```

---

## Time

```html
<input type="time">
```

---

## Datetime Local

```html
<input

type="datetime-local">
```

---

## Month

```html
<input type="month">
```

---

## Week

```html
<input type="week">
```

---

## Color

```html
<input type="color">
```

---

## Range

```html
<input

type="range"

min="0"

max="100">
```

Creates slider.

---

## Checkbox

```html
<input type="checkbox">
```

Multiple selections allowed.

---

## Radio

```html
<input

type="radio"

name="gender">
```

Only one selection.

---

Interview Question

Difference between Radio and Checkbox?

Checkbox

Multiple selection.

Radio

Single selection.

---

## File Upload

```html
<input

type="file">
```

Accept Images

```html
<input

type="file"

accept="image/*">
```

Accept PDF

```html
<input

type="file"

accept=".pdf">
```

Multiple Files

```html
<input

type="file"

multiple>
```

---

## Hidden

```html
<input

type="hidden"

value="12345">
```

Invisible.

Useful for IDs.

---

## Submit

```html
<input

type="submit">
```

---

## Reset

```html
<input

type="reset">
```

Clears form.

---

## Button

```html
<input

type="button"

value="Click">
```

---

# 8. Common Input Attributes

## placeholder

```html
<input

placeholder="Enter Name">
```

---

## value

```html
<input

value="Mallik">
```

---

## readonly

```html
<input readonly>
```

Can read.

Cannot edit.

Submitted with form.

---

## disabled

```html
<input disabled>
```

Cannot edit.

Cannot focus.

Not submitted.

---

Interview Question

Difference between

readonly

and

disabled?

| readonly | disabled |
|-----------|-----------|
| Editable ❌ | Editable ❌ |
| Submitted ✔ | Submitted ❌ |
| Focus ✔ | Focus ❌ |

---

## required

```html
<input required>
```

---

## minlength

```html
<input minlength="5">
```

---

## maxlength

```html
<input maxlength="20">
```

---

## pattern

```html
<input

pattern="[A-Za-z]+">
```

---

## autofocus

```html
<input autofocus>
```

---

## autocomplete

```html
<input

autocomplete="off">
```

---

## min

```html
<input

type="number"

min="10">
```

---

## max

```html
<input

type="number"

max="100">
```

---

## step

```html
<input

step="5">
```

---

# 9. Textarea

```html
<textarea

rows="5"

cols="30">

</textarea>
```

Used for

Comments

Address

Feedback

Description

---

# 10. Select

```html
<select>

<option>

India

</option>

<option>

USA

</option>

</select>
```

---

Default Selection

```html
<option selected>

India

</option>
```

---

Multiple Selection

```html
<select multiple>
```

---

# 11. Optgroup

```html
<select>

<optgroup

label="Asia">

<option>

India

</option>

</optgroup>

</select>
```

Groups options.

---

# 12. Datalist

Provides suggestions.

```html
<input

list="cities">

<datalist

id="cities">

<option

value="Hyderabad">

<option

value="Delhi">

<option

value="Chennai">

</datalist>
```

---

Difference

Select

Only predefined values.

Datalist

User can type custom value.

---

# 13. Fieldset

Groups related controls.

```html
<fieldset>

...

</fieldset>
```

---

# 14. Legend

```html
<fieldset>

<legend>

Personal Information

</legend>

</fieldset>
```

Adds heading to fieldset.

---

# 15. Output

```html
<output>

100

</output>
```

Displays calculated result.

---

# 16. Button Types

```html
<button>

Click

</button>
```

Types

```html
<button

type="submit">
```

```html
<button

type="reset">
```

```html
<button

type="button">
```

---

Interview Question

Default button type?

Answer

```
submit
```

---

# 17. HTML5 Validation

Examples

Required

```html
<input required>
```

Email

```html
<input type="email">
```

Pattern

```html
<input

pattern="[A-Z]{3}">
```

Min Length

```html
<input

minlength="5">
```

Max Length

```html
<input

maxlength="20">
```

---

# 18. File Upload

Single File

```html
<input

type="file">
```

Multiple Files

```html
<input

multiple

type="file">
```

Images Only

```html
<input

accept="image/*">
```

Remember

Use

```
multipart/form-data
```

---

# 19. Hidden Input

```html
<input

type="hidden"

name="id"

value="101">
```

Useful for

Product ID

User ID

Token

---

# Best Practices

✔ Use labels

✔ Use semantic input types

✔ Validate both frontend and backend

✔ Use placeholders only as hints

✔ Keep forms short

✔ Group related fields

✔ Use autocomplete

✔ Show validation messages

✔ Use POST for sensitive data

---

# Common Mistakes

❌ Missing labels

❌ Using GET for passwords

❌ No validation

❌ Missing required attribute

❌ Using placeholder instead of label

❌ Forgetting enctype for file upload

❌ Not sanitizing data on server

---

# Frequently Asked Interview Questions

1. What is a form?

2. Difference between GET and POST?

3. Why use labels?

4. Difference between readonly and disabled?

5. Difference between checkbox and radio?

6. Difference between select and datalist?

7. Why use fieldset?

8. Why use legend?

9. What is enctype?

10. Why multipart/form-data?

11. Difference between submit and button?

12. Default button type?

13. What is hidden input?

14. Why use autocomplete?

15. How does HTML validation work?

16. Can HTML validation replace backend validation?

Answer:

No. HTML validation improves user experience, but backend validation is mandatory because client-side validation can be bypassed.

---

# Quick Revision

- `<form>` collects user input.
- `action` specifies where data is sent.
- `method="GET"` sends data in the URL; `method="POST"` sends it in the request body.
- Use `<label for="...">` with matching `id` for accessibility.
- Use semantic input types (`email`, `date`, `number`, etc.).
- `readonly` fields are submitted; `disabled` fields are not.
- `required`, `pattern`, `min`, `max`, and `maxlength` provide built-in validation.
- File uploads require `enctype="multipart/form-data"`.
- Always perform server-side validation even when using HTML5 validation.