
## 1. What is the Output?

```text
Integer a,b

Set a = 10
Set b = 20

a = a + b
b = a - b
a = a - b

Print a,b
```

### Ans:

```text
20 10
```

### Explanation:

```text
a = 30
b = 10
a = 20
```

Output:

```text
20 10
```

---

## 2. What is the Output?

```text
Integer i,sum

sum = 0

For i = 1 to 5

    sum = sum + i

End For

Print sum
```

### Ans:

```text
15
```

### Explanation:

```text
1+2+3+4+5 = 15
```

---

## 3. What is the Output?

```text
Integer i

For i = 5 to 1 Step -1

    Print i

End For
```

### Ans:

```text
5
4
3
2
1
```

### Explanation:

Loop decrements by 1 each iteration.

---

## 4. What is the Output?

```text
Integer n

Set n = 1234

While n > 0

    Print n MOD 10

    n = n DIV 10

End While
```

### Ans:

```text
4
3
2
1
```

### Explanation:

Digits are extracted from right to left.

---

## 5. What is the Output?

```text
Integer x

Set x = 10

If x > 5

    If x > 8

        Print "A"

    End If

Else

    Print "B"

End If
```

### Ans:

```text
A
```

### Explanation:

Both conditions are true.

---

## 6. What is the Output?

```text
Integer i

For i = 1 to 3

    For j = 1 to 2

        Print i,j

    End For

End For
```

### Ans:

```text
1 1
1 2
2 1
2 2
3 1
3 2
```

### Explanation:

Inner loop executes completely for each outer loop iteration.

---

## 7. What is the Output?

```text
Integer count

count = 0

For i = 1 to 10

    If i MOD 2 = 0

        count = count + 1

    End If

End For

Print count
```

### Ans:

```text
5
```

### Explanation:

Even numbers:

```text
2 4 6 8 10
```

Count = 5

---

## 8. What is the Output?

```text
Integer a

Set a = 5

a = a + 2
a = a * 3

Print a
```

### Ans:

```text
21
```

### Explanation:

```text
5+2 = 7
7*3 = 21
```

---

## 9. What is the Output?

```text
Integer i

For i = 1 to 5

    If i = 3

        Continue

    End If

    Print i

End For
```

### Ans:

```text
1
2
4
5
```

### Explanation:

When i=3, Continue skips Print.

---

## 10. What is the Output?

```text
Integer i

For i = 1 to 5

    If i = 4

        Break

    End If

    Print i

End For
```

### Ans:

```text
1
2
3
```

### Explanation:

Loop terminates when i=4.

---

## 11. What is the Output?

```text
Integer x

Set x = 2

While x <= 16

    Print x

    x = x * 2

End While
```

### Ans:

```text
2
4
8
16
```

### Explanation:

Value doubles every iteration.

---

## 12. What is the Output?

```text
Integer sum

sum = 0

For i = 1 to 4

    sum = sum + i*i

End For

Print sum
```

### Ans:

```text
30
```

### Explanation:

```text
1²+2²+3²+4²
=
1+4+9+16
=
30
```

---

## 13. What is the Output?

```text
Integer n

Set n = 5

While n > 0

    Print n

    n = n - 2

End While
```

### Ans:

```text
5
3
1
```

### Explanation:

Subtracting 2 each iteration.

---

## 14. What is the Output?

```text
Integer a

a = 1

For i = 1 to 4

    a = a * 2

End For

Print a
```

### Ans:

```text
16
```

### Explanation:

```text
1→2→4→8→16
```

---

## 15. What is the Output?

```text
Integer x

Set x = 7

If x MOD 2 = 0

    Print "Even"

Else

    Print "Odd"

End If
```

### Ans:

```text
Odd
```

### Explanation:

```text
7 MOD 2 = 1
```

---

## 16. What is the Output?

```text
Integer arr[5]

arr = {2,4,6,8,10}

Print arr[3]
```

### Ans:

```text
8
```

### Explanation:

Indexing starts from 0.

```text
0 1 2 3 4
2 4 6 8 10
```

---

## 17. What is the Output?

```text
Integer arr[4]

arr = {1,3,5,7}

sum = 0

For i = 0 to 3

    sum = sum + arr[i]

End For

Print sum
```

### Ans:

```text
16
```

### Explanation:

```text
1+3+5+7 = 16
```

---

## 18. What is the Output?

```text
Integer a,b

a = 15
b = 4

Print a DIV b
```

### Ans:

```text
3
```

### Explanation:

DIV returns quotient only.

---

## 19. What is the Output?

```text
Integer a,b

a = 15
b = 4

Print a MOD b
```

### Ans:

```text
3
```

### Explanation:

MOD returns remainder.

---

## 20. What is the Output?

```text
Integer x

x = 3

For i = 1 to 3

    x = x + i

End For

Print x
```

### Ans:

```text
9
```

### Explanation:

```text
3+1+2+3 = 9
```

---

## 21. What is the Output?

```text
Integer count

count = 0

For i = 10 to 1 Step -2

    count = count + 1

End For

Print count
```

### Ans:

```text
5
```

### Explanation:

Values:

```text
10 8 6 4 2
```

Total = 5

---

## 22. What is the Output?

```text
Integer n

n = 100

While n > 10

    n = n DIV 2

End While

Print n
```

### Ans:

```text
6
```

### Explanation:

```text
100→50→25→12→6
```

---

## 23. What is the Output?

```text
Integer i,j

For i = 1 to 3

    For j = 1 to i

        Print "*"

    End For

    Print NewLine

End For
```

### Ans:

```text
*
**
***
```

### Explanation:

Inner loop depends on i.

---

## 24. What is the Output?

```text
Integer x

x = 1

While x < 20

    x = x + 3

End While

Print x
```

### Ans:

```text
22
```

### Explanation:

```text
1→4→7→10→13→16→19→22
```

---

## 25. What is the Output?

```text
Integer a

a = 0

For i = 1 to 5

    a = a + i

    Print a

End For
```

### Ans:

```text
1
3
6
10
15
```

### Explanation:

Running cumulative sum.

---

## 26. What is the Output?

```text
Integer arr[5]

arr = {5,4,3,2,1}

Print arr[0] + arr[4]
```

### Ans:

```text
6
```

### Explanation:

```text
5 + 1 = 6
```

---

## 27. What is the Output?

```text
Integer x

x = 9

If x > 5 AND x < 10

    Print "YES"

Else

    Print "NO"

End If
```

### Ans:

```text
YES
```

### Explanation:

Both conditions are true.

---

## 28. What is the Output?

```text
Integer x

x = 10

If x > 15 OR x = 10

    Print "TRUE"

End If
```

### Ans:

```text
TRUE
```

### Explanation:

Second condition is true.

---

## 29. What is the Output?

```text
Integer i

For i = 1 to 3

    Print i*i

End For
```

### Ans:

```text
1
4
9
```

### Explanation:

Squares are printed.

---

## 30. What is the Output?

```text
Integer n

n = 5

fact = 1

For i = 1 to n

    fact = fact * i

End For

Print fact
```

### Ans:

```text
120
```

### Explanation:

```text
1×2×3×4×5 = 120
```

---
