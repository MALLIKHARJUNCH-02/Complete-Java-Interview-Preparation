# Java Code Snippet Interview Questions


## 1. What is the output?

```java
public class Test {
    public static void main(String[] args) {
        System.out.println(10 + 20 + "Java");
    }
}
```

### Ans:

```text
30Java
```

### Explanation:

Evaluation occurs from left to right.

Step 1:

```java
10 + 20 = 30
```

Step 2:

```java
30 + "Java"
```

String concatenation occurs.

Final Output:

```text
30Java
```

---

## 2. What is the output?

```java
public class Test {
    public static void main(String[] args) {
        System.out.println("Java" + 10 + 20);
    }
}
```

### Ans:

```text
Java1020
```

### Explanation:

Since the first operand is String:

```java
"Java" + 10
```

becomes:

```text
Java10
```

Then:

```java
Java10 + 20
```

becomes:

```text
Java1020
```

---

## 3. What is the output?

```java
public class Test {
    public static void main(String[] args) {
        int i = 5;

        System.out.println(i++ + ++i);
    }
}
```

### Ans:

```text
12
```

### Explanation:

Initially:

```java
i = 5
```

Post Increment:

```java
i++
```

Returns:

```text
5
```

Now:

```java
i = 6
```

Pre Increment:

```java
++i
```

First increments:

```java
i = 7
```

Returns:

```text
7
```

Final:

```text
5 + 7 = 12
```

---

## 4. What is the output?

```java
public class Test {
    public static void main(String[] args) {
        int x = 10;

        if(x == 10);
        {
            System.out.println("Hello");
        }
    }
}
```

### Ans:

```text
Hello
```

### Explanation:

This semicolon:

```java
if(x == 10);
```

ends the if statement.

The block below becomes an independent block.

Therefore:

```java
{
   System.out.println("Hello");
}
```

always executes.

---

## 5. What is the output?

```java
public class Test {
    public static void main(String[] args) {

        char ch = 'A';

        System.out.println(++ch);
    }
}
```

### Ans:

```text
B
```

### Explanation:

Unicode value:

```text
A = 65
```

After increment:

```text
66 = B
```

Output:

```text
B
```

---

## 6. What is the output?

```java
public class Test {
    public static void main(String[] args) {

        System.out.println('A' + 1);
    }
}
```

### Ans:

```text
66
```

### Explanation:

Character participates in arithmetic.

```text
'A' = 65
```

Therefore:

```text
65 + 1 = 66
```

---

## 7. What is the output?

```java
public class Test {
    public static void main(String[] args) {

        byte b = 127;

        b++;

        System.out.println(b);
    }
}
```

### Ans:

```text
-128
```

### Explanation:

Byte Range:

```text
-128 to 127
```

After:

```text
127 + 1
```

Overflow occurs.

Result:

```text
-128
```

---

## 8. What is the output?

```java
public class Test {
    public static void main(String[] args) {

        int x = 10;

        System.out.println(x++);

        System.out.println(x);
    }
}
```

### Ans:

```text
10
11
```

### Explanation:

Post Increment:

Returns current value first.

```text
10
```

Then increments:

```text
11
```

---

## 9. What is the output?

```java
public class Test {
    public static void main(String[] args) {

        int x = 10;

        System.out.println(++x);

        System.out.println(x);
    }
}
```

### Ans:

```text
11
11
```

### Explanation:

Pre Increment:

First increments.

Then returns incremented value.

---

## 10. What is the output?

```java
public class Test {
    public static void main(String[] args) {

        System.out.println(10/0);
    }
}
```

### Ans:

```text
ArithmeticException
```

### Explanation:

Integer division by zero is not allowed.

JVM throws:

```java
ArithmeticException
```

---

## 11. What is the output?

```java
public class Test {
    public static void main(String[] args) {

        System.out.println(10.0/0);
    }
}
```

### Ans:

```text
Infinity
```

### Explanation:

Floating point division follows IEEE standards.

Result:

```text
Infinity
```

---

## 12. What is the output?

```java
public class Test {
    public static void main(String[] args) {

        System.out.println(0.0/0);
    }
}
```

### Ans:

```text
NaN
```

### Explanation:

NaN means:

```text
Not A Number
```

Zero divided by zero is undefined.

---

## 13. What is the output?

```java
public class Test {

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
```

### Ans:

```text
Static Block
Main Method
```

### Explanation:

Execution Order:

1. Static Block
2. Main Method

Static block executes when class loads.

---

## 14. What is the output?

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);
```

### Ans:

```text
true
```

### Explanation:

Both refer to same String Pool object.

Reference comparison returns:

```text
true
```

---

## 15. What is the output?

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);
```

### Ans:

```text
false
```

### Explanation:

Two different Heap objects.

Different references.

---

## 16. What is the output?

```java
String s1 = "Java";
String s2 = new String("Java");

System.out.println(s1.equals(s2));
```

### Ans:

```text
true
```

### Explanation:

equals() compares content.

Both contain:

```text
Java
```

Hence true.

---

## 17. What is the output?

```java
Integer a = 127;
Integer b = 127;

System.out.println(a == b);
```

### Ans:

```text
true
```

### Explanation:

Integer Cache Range:

```text
-128 to 127
```

Both variables point to same cached object.

---

## 18. What is the output?

```java
Integer a = 128;
Integer b = 128;

System.out.println(a == b);
```

### Ans:

```text
false
```

### Explanation:

Outside Integer Cache.

Separate objects created.

---

## 19. What is the output?

```java
String s = null;

System.out.println(s);
```

### Ans:

```text
null
```

### Explanation:

Printing a null reference prints:

```text
null
```

No exception occurs.

---

## 20. What is the output?

```java
String s = null;

System.out.println(s.length());
```

### Ans:

```text
NullPointerException
```

### Explanation:

s does not refer to an object.

Calling a method on null causes:

```java
NullPointerException
```

---

## 21. What is the output?

```java
System.out.println(true && false || true);
```

### Ans:

```text
true
```

### Explanation:

Operator precedence:

```text
&& before ||
```

Step 1:

```text
true && false
```

Result:

```text
false
```

Step 2:

```text
false || true
```

Result:

```text
true
```

---

## 22. What is the output?

```java
System.out.println(5 > 3 ? "Yes" : "No");
```

### Ans:

```text
Yes
```

### Explanation:

Condition:

```java
5 > 3
```

returns:

```text
true
```

Hence:

```text
Yes
```

---

## 23. What is the output?

```java
int[] arr = new int[3];

System.out.println(arr[0]);
```

### Ans:

```text
0
```

### Explanation:

Default value for int array elements:

```text
0
```

---

## 24. What is the output?

```java
boolean[] arr = new boolean[2];

System.out.println(arr[0]);
```

### Ans:

```text
false
```

### Explanation:

Default value of boolean:

```text
false
```

---

## 25. What is the output?

```java
String[] arr = new String[2];

System.out.println(arr[0]);
```

### Ans:

```text
null
```

### Explanation:

Default value for reference types:

```text
null
```

Therefore:

```java
System.out.println(arr[0]);
```

prints:

```text
null
```

---

## 26. What is the Output?

```java
class Test {

    Test() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
```

### Ans:

```text
Constructor
```

### Explanation:

When an object is created:

```java
new Test();
```

the constructor is automatically invoked.

---

## 27. What is the Output?

```java
class Test {

    Test() {
        System.out.println("A");
    }

    Test(int x) {
        System.out.println("B");
    }

    public static void main(String[] args) {

        Test t1 = new Test();

        Test t2 = new Test(10);
    }
}
```

### Ans:

```text
A
B
```

### Explanation:

Constructor selection is based on parameters supplied during object creation.

---

## 28. What is the Output?

```java
class Test {

    Test() {
        this(10);
        System.out.println("Default");
    }

    Test(int x) {
        System.out.println("Parameterized");
    }

    public static void main(String[] args) {

        new Test();
    }
}
```

### Ans:

```text
Parameterized
Default
```

### Explanation:

```java
this(10);
```

calls another constructor of the same class first.

Execution Order:

```text
Parameterized
Default
```

---

## 29. What is the Output?

```java
class Parent {

    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Child");
    }

    public static void main(String[] args) {

        new Child();
    }
}
```

### Ans:

```text
Parent
Child
```

### Explanation:

Compiler automatically inserts:

```java
super();
```

as the first statement inside child constructor.

---

## 30. What is the Output?

```java
class Parent {

    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Child");
    }
}
```

### Ans:

```text
Parent
Child
```

### Explanation:

Explicit call:

```java
super();
```

invokes parent constructor.

---

## 31. What is the Output?

```java
class Test {

    int x = 10;

    void show() {
        int x = 20;

        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {

        new Test().show();
    }
}
```

### Ans:

```text
20
10
```

### Explanation:

```java
x
```

refers to local variable.

```java
this.x
```

refers to instance variable.

---

## 32. What is the Output?

```java
class Parent {

    int x = 10;
}

class Child extends Parent {

    int x = 20;

    void show() {

        System.out.println(x);

        System.out.println(super.x);
    }

    public static void main(String[] args) {

        new Child().show();
    }
}
```

### Ans:

```text
20
10
```

### Explanation:

```java
x
```

refers to child variable.

```java
super.x
```

refers to parent variable.

---

## 33. What is the Output?

```java
class Test {

    static int x = 10;

    public static void main(String[] args) {

        System.out.println(Test.x);
    }
}
```

### Ans:

```text
10
```

### Explanation:

Static members belong to class.

Access:

```java
ClassName.variable
```

---

## 34. What is the Output?

```java
class Test {

    static {
        System.out.println("Static Block");
    }

    static {
        System.out.println("Second Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main");
    }
}
```

### Ans:

```text
Static Block
Second Static Block
Main
```

### Explanation:

Static blocks execute in order of appearance before main method.

---

## 35. What is the Output?

```java
class Test {

    static int x = 100;

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();

        t1.x = 200;

        System.out.println(t2.x);
    }
}
```

### Ans:

```text
200
```

### Explanation:

Static variable has only one copy.

Shared among all objects.

---

## 36. What is the Output?

```java
class Test {

    int x = 100;

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();

        t1.x = 200;

        System.out.println(t2.x);
    }
}
```

### Ans:

```text
100
```

### Explanation:

Instance variables belong to individual objects.

Each object gets its own copy.

---

## 37. What is the Output?

```java
class Parent {

    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {

        Parent p = new Child();

        p.show();
    }
}
```

### Ans:

```text
Child
```

### Explanation:

Method overriding uses Runtime Polymorphism.

Actual object:

```java
new Child()
```

determines method execution.

---

## 38. What is the Output?

```java
class Parent {

    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {

        Parent p = new Child();

        p.show();
    }
}
```

### Ans:

```text
Parent
```

### Explanation:

Static methods are not overridden.

They are hidden.

Method call depends on reference type.

Reference:

```java
Parent p
```

Therefore output:

```text
Parent
```

---

## 39. What is the Output?

```java
final class Test {
}
```

### Ans:

```text
Compilation Successful
```

### Explanation:

Final class means:

```text
Cannot be inherited
```

No issue declaring it.

---

## 40. What is the Output?

```java
final int x = 10;

x = 20;
```

### Ans:

```text
Compilation Error
```

### Explanation:

Final variable becomes constant after initialization.

---

## 41. What is the Output?

```java
class Parent {

    final void show() {
    }
}

class Child extends Parent {

    void show() {
    }
}
```

### Ans:

```text
Compilation Error
```

### Explanation:

Final methods cannot be overridden.

---

## 42. What is the Output?

```java
class Test {

    void add(int a) {
        System.out.println("int");
    }

    void add(double a) {
        System.out.println("double");
    }

    public static void main(String[] args) {

        Test t = new Test();

        t.add(10);
    }
}
```

### Ans:

```text
int
```

### Explanation:

Exact match gets highest priority.

---

## 43. What is the Output?

```java
class Test {

    void add(int a) {
        System.out.println("int");
    }

    void add(long a) {
        System.out.println("long");
    }

    public static void main(String[] args) {

        Test t = new Test();

        t.add(10);
    }
}
```

### Ans:

```text
int
```

### Explanation:

Compiler prefers exact match before widening conversion.

---

## 44. What is the Output?

```java
abstract class Test {

    abstract void show();
}
```

### Ans:

```text
Compilation Successful
```

### Explanation:

Abstract class can contain abstract methods.

---

## 45. What is the Output?

```java
abstract class Test {

    abstract void show();

    public static void main(String[] args) {

        Test t = new Test();
    }
}
```

### Ans:

```text
Compilation Error
```

### Explanation:

Abstract classes cannot be instantiated.

---

## 46. What is the Output?

```java
interface Demo {

    void show();
}
```

### Ans:

```text
Compilation Successful
```

### Explanation:

Interface methods are implicitly:

```java
public abstract
```

---

## 47. What is the Output?

```java
interface Demo {

    int x = 10;
}

class Test {

    public static void main(String[] args) {

        System.out.println(Demo.x);
    }
}
```

### Ans:

```text
10
```

### Explanation:

Interface variables are:

```java
public static final
```

by default.

---

## 48. What is the Output?

```java
interface Demo {

    int x = 10;
}

class Test {

    public static void main(String[] args) {

        Demo.x = 20;
    }
}
```

### Ans:

```text
Compilation Error
```

### Explanation:

Interface variables are final.

Cannot be modified.

---

## 49. What is the Output?

```java
class Parent {

    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Default");
    }

    Child(int x) {
        System.out.println("Parameterized");
    }

    public static void main(String[] args) {

        new Child();
    }
}
```

### Ans:

```text
Parent
Parameterized
Default
```

### Explanation:

Execution Flow:

```text
Parent Constructor
↓
Parameterized Constructor
↓
Default Constructor
```

---

## 50. What is the Output?

```java
class Test {

    static int x;

    int y;

    public static void main(String[] args) {

        Test t = new Test();

        System.out.println(x);
        System.out.println(t.y);
    }
}
```

### Ans:

```text
0
0
```

### Explanation:

Default values:

```text
byte      → 0
short     → 0
int       → 0
long      → 0
float     → 0.0
double    → 0.0
char      → '\u0000'
boolean   → false
reference → null
```

Since both variables are integers and not initialized:

```text
0
0
```

are printed.

---

## 51. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2);
    }
}
```

### Ans:

```text
true
```

### Explanation:

Both String literals are stored in the String Pool.

Memory:

```text
String Pool

"Java"
 ↑
s1
 ↑
s2
```

Since both references point to the same object:

```java
s1 == s2
```

returns:

```text
true
```

---

## 52. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
    }
}
```

### Ans:

```text
false
```

### Explanation:

Two different objects are created in Heap Memory.

```text
Heap

Object1 → Java
Object2 → Java
```

Different references produce:

```text
false
```

---

## 53. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1.equals(s2));
    }
}
```

### Ans:

```text
true
```

### Explanation:

```java
equals()
```

compares contents, not references.

Both strings contain:

```text
Java
```

Hence:

```text
true
```

---

## 54. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s1 = "Ja" + "va";

        System.out.println(s1);
    }
}
```

### Ans:

```text
Java
```

### Explanation:

Compiler performs Constant Folding.

Compiler converts:

```java
"Ja" + "va"
```

into:

```java
"Java"
```

during compilation.

---

## 55. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s1 = "Java";

        String s2 = "Ja" + "va";

        System.out.println(s1 == s2);
    }
}
```

### Ans:

```text
true
```

### Explanation:

Compiler optimizes:

```java
String s2 = "Java";
```

Both variables refer to the same String Pool object.

---

## 56. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s1 = "Java";

        String s2 = new String("Ja") + new String("va");

        System.out.println(s1 == s2);
    }
}
```

### Ans:

```text
false
```

### Explanation:

Concatenation occurs at runtime.

A new object is created in Heap Memory.

References are different.

---

## 57. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s1 = "Java";

        String s2 = new String("Java");

        System.out.println(s1 == s2.intern());
    }
}
```

### Ans:

```text
true
```

### Explanation:

```java
intern()
```

returns the String Pool reference.

Both references become identical.

---

## 58. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s = "Java";

        s.concat(" Programming");

        System.out.println(s);
    }
}
```

### Ans:

```text
Java
```

### Explanation:

Strings are immutable.

```java
concat()
```

creates a new object.

Original String remains unchanged.

---

## 59. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s = "Java";

        s = s.concat(" Programming");

        System.out.println(s);
    }
}
```

### Ans:

```text
Java Programming
```

### Explanation:

Now the new String reference is assigned back to:

```java
s
```

Therefore updated value is printed.

---

## 60. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println(sb);
    }
}
```

### Ans:

```text
Java Programming
```

### Explanation:

StringBuilder is mutable.

append() modifies the same object.

No new object creation.

---

## 61. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");

        StringBuilder sb2 = new StringBuilder("Java");

        System.out.println(sb1.equals(sb2));
    }
}
```

### Ans:

```text
false
```

### Explanation:

StringBuilder does not override equals().

It uses Object class equals().

Reference comparison occurs.

---

## 62. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        Integer a = 127;
        Integer b = 127;

        System.out.println(a == b);
    }
}
```

### Ans:

```text
true
```

### Explanation:

Integer Cache Range:

```text
-128 to 127
```

Both references point to the same cached object.

---

## 63. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        Integer a = 128;
        Integer b = 128;

        System.out.println(a == b);
    }
}
```

### Ans:

```text
false
```

### Explanation:

Outside Integer Cache.

Two separate objects are created.

---

## 64. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        System.out.println(a.equals(b));
    }
}
```

### Ans:

```text
true
```

### Explanation:

equals() compares values.

Both contain:

```text
100
```

---

## 65. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        Integer a = null;

        int b = a;

        System.out.println(b);
    }
}
```

### Ans:

```text
NullPointerException
```

### Explanation:

Auto-unboxing occurs:

```java
int b = a.intValue();
```

Since a is null:

```text
NullPointerException
```

occurs.

---

## 66. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        int[] arr = {10,20,30};

        System.out.println(arr[3]);
    }
}
```

### Ans:

```text
ArrayIndexOutOfBoundsException
```

### Explanation:

Valid indices:

```text
0
1
2
```

Index 3 doesn't exist.

---

## 67. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.println(arr.length);
    }
}
```

### Ans:

```text
5
```

### Explanation:

length is a property of arrays.

---

## 68. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String str = "Java";

        System.out.println(str.length());
    }
}
```

### Ans:

```text
4
```

### Explanation:

length() is a method of String class.

---

## 69. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        int[] arr = {10,20,30};

        for(int x : arr)
            System.out.print(x + " ");
    }
}
```

### Ans:

```text
10 20 30
```

### Explanation:

Enhanced for-loop traverses each element sequentially.

---

## 70. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        int[] arr = {10,20,30};

        System.out.println(arr);
    }
}
```

### Ans:

```text
[I@hashcode
```

### Explanation:

Arrays inherit Object.toString().

Output format:

```text
[Type@HashCode
```

Example:

```text
[I@15db9742
```

---

## 71. What is the Output?

```java
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr = {10,20,30};

        System.out.println(Arrays.toString(arr));
    }
}
```

### Ans:

```text
[10, 20, 30]
```

### Explanation:

Arrays.toString() prints actual contents.

---

## 72. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.charAt(2));
    }
}
```

### Ans:

```text
v
```

### Explanation:

Indexing starts from 0.

```text
J → 0
a → 1
v → 2
a → 3
```

---

## 73. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.substring(1,3));
    }
}
```

### Ans:

```text
av
```

### Explanation:

substring(start,end)

Start index included.

End index excluded.

```text
a v
1 2
```

---

## 74. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.replace('a','x'));
    }
}
```

### Ans:

```text
Jxvx
```

### Explanation:

Every occurrence of:

```text
a
```

is replaced with:

```text
x
```

---

## 75. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
```

### Ans:

```text
JAVA
java
```

### Explanation:

```java
toUpperCase()
```

converts all characters to uppercase.

```java
toLowerCase()
```

converts all characters to lowercase.

---

## 76. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");

        System.out.println(list);
    }
}
```

### Ans:

```text
[Java, Python, Java]
```

### Explanation:

ArrayList:

* Maintains insertion order
* Allows duplicates
* Dynamic in size

Therefore duplicate "Java" is stored.

---

## 77. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println(set);
    }
}
```

### Ans:

```text
[Java, Python]
```

### Explanation:

HashSet:

* Does not allow duplicates
* Uses hashCode() and equals()

Second "Java" is ignored.

---

## 78. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);
    }
}
```

### Ans:

```text
Order Not Guaranteed
```

### Explanation:

HashSet does not maintain:

* Insertion Order
* Sorted Order

Output may vary.

---

## 79. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);
    }
}
```

### Ans:

```text
[30, 10, 20]
```

### Explanation:

LinkedHashSet maintains insertion order.

---

## 80. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);
    }
}
```

### Ans:

```text
[10, 20, 30]
```

### Explanation:

TreeSet stores elements in sorted order.

Internally uses Red-Black Tree.

---

## 81. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Java");
        map.put(102,"Python");

        System.out.println(map.get(101));
    }
}
```

### Ans:

```text
Java
```

### Explanation:

HashMap stores data as:

```text
Key → Value
```

Retrieval using:

```java
map.get(key);
```

---

## 82. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Java");
        map.put(101,"Python");

        System.out.println(map);
    }
}
```

### Ans:

```text
{101=Python}
```

### Explanation:

HashMap does not allow duplicate keys.

New value replaces old value.

---

## 83. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<Integer> list =
        Arrays.asList(10,20,30);

        System.out.println(list.size());
    }
}
```

### Ans:

```text
3
```

### Explanation:

size() returns number of elements.

---

## 84. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> list =
        new ArrayList<>();

        list.add(10);
        list.add(20);

        System.out.println(list.contains(20));
    }
}
```

### Ans:

```text
true
```

### Explanation:

contains() checks existence of element.

---

## 85. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> list =
        new ArrayList<>();

        list.add(10);
        list.add(20);

        list.remove(Integer.valueOf(10));

        System.out.println(list);
    }
}
```

### Ans:

```text
[20]
```

### Explanation:

Element 10 is removed.

Remaining element:

```text
20
```

---

## 86. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        try {

            int x = 10/0;

        }
        catch(Exception e) {

            System.out.println("Exception");
        }
    }
}
```

### Ans:

```text
Exception
```

### Explanation:

Division by zero causes:

```java
ArithmeticException
```

Caught by:

```java
catch(Exception e)
```

---

## 87. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        try {

            System.out.println("Try");

        }
        finally {

            System.out.println("Finally");
        }
    }
}
```

### Ans:

```text
Try
Finally
```

### Explanation:

finally block always executes.

---

## 88. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        try {

            return;

        }
        finally {

            System.out.println("Finally");
        }
    }
}
```

### Ans:

```text
Finally
```

### Explanation:

Even when return executes, finally runs before method exits.

---

## 89. What is the Output?

```java
class MyThread extends Thread {

    public void run() {

        System.out.println("Thread");
    }
}

public class Test {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();
    }
}
```

### Ans:

```text
Thread
```

### Explanation:

start() creates a new thread and internally calls run().

---

## 90. What is the Output?

```java
class MyThread extends Thread {

    public void run() {

        System.out.println("Thread");
    }
}

public class Test {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.run();
    }
}
```

### Ans:

```text
Thread
```

### Explanation:

Output is same.

Difference:

```java
t.start();
```

creates new thread.

```java
t.run();
```

does not create new thread.

Runs in main thread.

---

## 91. What is the Output?

```java
interface Demo {

    void show();
}

public class Test {

    public static void main(String[] args) {

        Demo d =
        () -> System.out.println("Lambda");

        d.show();
    }
}
```

### Ans:

```text
Lambda
```

### Explanation:

Lambda Expression provides implementation for Functional Interface.

---

## 92. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Arrays.asList(1,2,3,4,5)
              .stream()
              .filter(x -> x%2==0)
              .forEach(System.out::println);
    }
}
```

### Ans:

```text
2
4
```

### Explanation:

filter():

```java
x % 2 == 0
```

keeps only even numbers.

---

## 93. What is the Output?

```java
import java.util.*;

public class Test {

    public static void main(String[] args) {

        int sum =
        Arrays.asList(1,2,3,4)
              .stream()
              .mapToInt(Integer::intValue)
              .sum();

        System.out.println(sum);
    }
}
```

### Ans:

```text
10
```

### Explanation:

Calculation:

```text
1 + 2 + 3 + 4 = 10
```

---

## 94. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s = null;

        System.out.println(s instanceof String);
    }
}
```

### Ans:

```text
false
```

### Explanation:

instanceof with null always returns false.

---

## 95. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        System.out.println(null == null);
    }
}
```

### Ans:

```text
true
```

### Explanation:

Both operands are null references.

---

## 96. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s instanceof Object);
    }
}
```

### Ans:

```text
true
```

### Explanation:

String class extends Object.

Therefore every String object is also an Object.

---

## 97. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        int x = 10;

        Integer y = 10;

        System.out.println(x == y);
    }
}
```

### Ans:

```text
true
```

### Explanation:

Auto-unboxing occurs.

Compiler converts:

```java
y.intValue()
```

Comparison becomes:

```java
10 == 10
```

---

## 98. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        System.out.println(a.equals(b));
    }
}
```

### Ans:

```text
true
```

### Explanation:

equals() compares values.

Both contain:

```text
100
```

---

## 99. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s = "Java";

        String t = s;

        t = "Python";

        System.out.println(s);
    }
}
```

### Ans:

```text
Java
```

### Explanation:

Strings are immutable.

Changing:

```java
t = "Python";
```

creates a new reference.

Original String remains unchanged.

---

## 100. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s1 = "Java";

        String s2 = new String("Java");

        String s3 = s2.intern();

        System.out.println(s1 == s3);
    }
}
```

### Ans:

```text
true
```

### Explanation:

```java
intern()
```

returns String Pool reference.

Memory:

```text
String Pool
   ↑
s1
   ↑
s3
```

Both references point to the same pooled String object.

Therefore:

```java
s1 == s3
```

returns:

```text
true
```

---
