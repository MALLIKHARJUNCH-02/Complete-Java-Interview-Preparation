# Java Interview Quiz Questions

## 1. Why is Java called Platform Independent?

### Ans:

Java is called a platform-independent programming language because Java source code is compiled into Bytecode (.class file), and this Bytecode can run on any operating system that has a Java Virtual Machine (JVM).

### Explanation:

Languages such as C and C++ generate machine code that is specific to a particular operating system and processor architecture. Java follows a different approach.

```text
Java Source Code (.java)
        ↓
Java Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM
        ↓
Machine Code
```

The JVM acts as an intermediary between the operating system and Java Bytecode. Since JVMs are available for different operating systems, the same Bytecode can execute on Windows, Linux, macOS, and other platforms without modification.

This principle is known as:

**WORA (Write Once, Run Anywhere)**

---

## 2. What is the difference between JDK, JRE, and JVM?

### Ans:

* JDK (Java Development Kit) is used to develop Java applications.
* JRE (Java Runtime Environment) is used to run Java applications.
* JVM (Java Virtual Machine) executes Java Bytecode.

### Explanation:

```text
JDK
 └── JRE
      └── JVM
```

**JDK Contains:**

* Compiler (javac)
* Java Launcher
* Debugger
* JRE

**JRE Contains:**

* JVM
* Core Libraries

**JVM Responsibilities:**

* Loads classes
* Verifies Bytecode
* Executes Bytecode
* Performs Garbage Collection
* Manages Memory

---

## 3. Why is String Immutable in Java?

### Ans:

A String object cannot be modified once it is created. Any modification results in the creation of a new String object.

### Explanation:

```java
String s = "Java";

s.concat(" Programming");

System.out.println(s);
```

Output:

```text
Java
```

The concat() method creates a new String object, but since it is not assigned back to any variable, the original String remains unchanged.

Reasons for String Immutability:

1. Security
2. Thread Safety
3. String Pool Optimization
4. HashCode Caching
5. Better Performance

---

## 4. What is the difference between == and equals()?

### Ans:

* == compares memory references.
* equals() compares object contents.

### Explanation:

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
```

Output:

```text
false
true
```

Memory Representation:

```text
s1 → Object1 ("Java")
s2 → Object2 ("Java")
```

Since both references point to different objects:

```java
s1 == s2
```

returns false.

Since contents are identical:

```java
s1.equals(s2)
```

returns true.

---

## 5. What will be the output?

```java
int i = 5;
System.out.println(i++ + ++i);
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

Evaluation:

```java
i++
```

Returns:

```text
5
```

Then increments:

```java
i = 6
```

Next:

```java
++i
```

First increments:

```java
i = 7
```

Then returns:

```text
7
```

Final Calculation:

```text
5 + 7 = 12
```

Output:

```text
12
```

---

## 6. What is the output?

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

Java maintains an Integer Cache for values:

```text
-128 to 127
```

Objects within this range reuse the same memory location.

```java
Integer a = 127;
Integer b = 127;
```

Both references point to the same cached object.

```java
a == b
```

returns:

```text
true
```

---

## 7. What is the output?

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

The Integer Cache only stores values from:

```text
-128 to 127
```

Since 128 is outside the cache range, Java creates two separate Integer objects.

```text
a → Object1
b → Object2
```

Different references produce:

```java
a == b
```

Output:

```text
false
```

---

## 8. Can static methods be overridden?

### Ans:

No. Static methods cannot be overridden.

### Explanation:

Static methods belong to the class rather than an object.

Example:

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
}
```

This is called:

**Method Hiding**

Not Method Overriding.

Because static methods are resolved at compile time.

---

## 9. What is the output?

```java
System.out.println(10 + 20 + "Java");
```

### Ans:

```text
30Java
```

### Explanation:

Java evaluates expressions from left to right.

Step 1:

```java
10 + 20
```

Result:

```text
30
```

Step 2:

```java
30 + "Java"
```

Result:

```text
30Java
```

---

## 10. What is the output?

```java
System.out.println("Java" + 10 + 20);
```

### Ans:

```text
Java1020
```

### Explanation:

Since the first operand is a String, all subsequent + operators perform String concatenation.

Step 1:

```java
"Java" + 10
```

Result:

```text
Java10
```

Step 2:

```java
"Java10" + 20
```

Result:

```text
Java1020
```

---

## 11. Why is Java not 100% Object-Oriented?

### Ans:

Java is not considered a pure Object-Oriented Programming language because it supports primitive data types.

### Explanation:

Primitive Data Types:

```java
byte
short
int
long
float
double
char
boolean
```

These are not objects.

A pure OOP language requires everything to be represented as objects.

Because Java supports both primitive types and objects, it is called a **hybrid object-oriented language** rather than a pure object-oriented language.

---

## 12. Which class is the parent of all classes in Java?

### Ans:

The Object class is the parent of all classes in Java.

### Explanation:

```java
java.lang.Object
```

Every Java class implicitly extends Object.

Example:

```java
class Employee {
}
```

Compiler internally treats it as:

```java
class Employee extends Object {
}
```

Methods inherited from Object class:

```java
toString()
equals()
hashCode()
getClass()
wait()
notify()
notifyAll()
```

---


## 13. What is Method Overloading?

### Ans:

Method Overloading is a feature in Java where multiple methods can have the same name but different parameter lists within the same class.

### Explanation:

The compiler differentiates overloaded methods based on:

* Number of parameters
* Type of parameters
* Order of parameters

Example:

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

Benefits:

* Improves code readability
* Supports compile-time polymorphism
* Avoids creating multiple method names

---

## 14. What is Method Overriding?

### Ans:

Method Overriding occurs when a child class provides its own implementation for a method already defined in its parent class.

### Explanation:

Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

When:

```java
Animal a = new Dog();
a.sound();
```

Output:

```text
Bark
```

The method called is decided at runtime.

Therefore, Method Overriding is an example of Runtime Polymorphism.

---

## 15. Difference Between Overloading and Overriding?

### Ans:

| Method Overloading       | Method Overriding    |
| ------------------------ | -------------------- |
| Same class               | Parent & Child class |
| Different parameters     | Same parameters      |
| Compile Time             | Runtime              |
| Static Binding           | Dynamic Binding      |
| Inheritance not required | Inheritance required |

### Explanation:

Overloading increases readability.

Overriding provides Runtime Polymorphism.

---

## 16. What is Encapsulation?

### Ans:

Encapsulation is the process of binding data and methods together into a single unit and restricting direct access to data.

### Explanation:

Example:

```java
class Employee {

    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
```

Advantages:

* Data Security
* Data Hiding
* Better Maintainability
* Controlled Access

---

## 17. What is Abstraction?

### Ans:

Abstraction is the process of hiding implementation details and showing only essential features to the user.

### Explanation:

Example:

```java
abstract class Vehicle {

    abstract void start();
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car Started");
    }
}
```

User knows:

```text
start()
```

User doesn't know:

```text
Engine Logic
Fuel Injection
Battery Operations
```

This is abstraction.

---

## 18. Difference Between Abstract Class and Interface?

### Ans:

| Abstract Class               | Interface                     |
| ---------------------------- | ----------------------------- |
| Can have constructors        | Cannot have constructors      |
| Can have instance variables  | Only constants                |
| Supports partial abstraction | Supports complete abstraction |
| Uses extends                 | Uses implements               |

### Explanation:

Use Abstract Class when classes share common functionality.

Use Interface when classes share common behavior.

---

## 19. What is Inheritance?

### Ans:

Inheritance allows one class to acquire properties and methods of another class.

### Explanation:

Example:

```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
}
```

Usage:

```java
Dog d = new Dog();

d.eat();
```

Output:

```text
Eating
```

Benefits:

* Code Reusability
* Extensibility
* Maintainability

---

## 20. Why Multiple Inheritance is Not Supported in Java?

### Ans:

Java does not support multiple inheritance through classes because of the Diamond Problem.

### Explanation:

Example:

```java
class A {
    void show() {
    }
}

class B extends A {
}

class C extends A {
}

class D extends B, C {
}
```

Suppose both B and C override show().

Now:

```java
D d = new D();
d.show();
```

Compiler gets confused:

```text
Should show() come from B?
OR
Should show() come from C?
```

This ambiguity is called the Diamond Problem.

Java solves this using Interfaces.

---

## 21. What is the Output?

```java
String s = "Java";

s.concat(" Programming");

System.out.println(s);
```

### Ans:

```text
Java
```

### Explanation:

Strings are immutable.

```java
s.concat(" Programming");
```

creates a new String object.

Since it is not assigned:

```java
s = s.concat(" Programming");
```

the original String remains unchanged.

---

## 22. What is String Pool?

### Ans:

String Pool is a special memory area inside Heap Memory where String literals are stored.

### Explanation:

Example:

```java
String s1 = "Java";
String s2 = "Java";
```

Memory:

```text
String Pool

"Java"
 ↑
s1
 ↑
s2
```

Only one object is created.

Benefits:

* Memory Optimization
* Improved Performance
* Reduced Object Creation

---

## 23. What is the Output?

```java
String s1 = "Java";
String s2 = "Ja" + "va";

System.out.println(s1 == s2);
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

Therefore:

```java
s1 == s2
```

returns:

```text
true
```

---

## 24. What is the Output?

```java
String s1 = "Java";

String s2 = new String("Ja") + new String("va");

System.out.println(s1 == s2);
```

### Ans:

```text
false
```

### Explanation:

Concatenation occurs at runtime.

A new object is created in Heap Memory.

Memory:

```text
String Pool → "Java"

Heap → "Java"
```

Different references.

Therefore:

```java
s1 == s2
```

returns:

```text
false
```

---

## 25. What is the Output?

```java
String s1 = "Java";

String s2 = new String("Java");

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
```

### Ans:

```text
false
true
```

### Explanation:

```java
==
```

compares references.

```java
equals()
```

compares contents.

References are different.

Contents are same.

Hence:

```text
false
true
```

---
## 26. What is a Constructor in Java?

### Ans:

A Constructor is a special member of a class that is automatically executed when an object is created.

### Explanation:

Characteristics of a Constructor:

* Constructor name must be the same as the class name.
* Constructors do not have a return type.
* Constructors initialize object state.

Example:

```java
class Employee {

    Employee() {
        System.out.println("Constructor Called");
    }
}
```

```java
Employee e = new Employee();
```

Output:

```text
Constructor Called
```

---

## 27. What is the Difference Between Constructor and Method?

### Ans:

| Constructor             | Method              |
| ----------------------- | ------------------- |
| Same name as class      | Any valid name      |
| No return type          | Has return type     |
| Called automatically    | Called explicitly   |
| Used for initialization | Used for operations |

### Explanation:

Constructor:

```java
class Test {

    Test() {
        System.out.println("Constructor");
    }
}
```

Method:

```java
void display() {
    System.out.println("Method");
}
```

---

## 28. What are the Types of Constructors?

### Ans:

Java provides:

1. Default Constructor
2. Parameterized Constructor

### Explanation:

Default Constructor:

```java
class Test {

    Test() {
        System.out.println("Default");
    }
}
```

Parameterized Constructor:

```java
class Test {

    Test(int a) {
        System.out.println(a);
    }
}
```

---

## 29. What is Constructor Overloading?

### Ans:

Having multiple constructors with different parameter lists inside the same class.

### Explanation:

```java
class Student {

    Student() {
    }

    Student(int id) {
    }

    Student(int id, String name) {
    }
}
```

Compiler differentiates constructors using parameters.

---

## 30. Can Constructors be Overridden?

### Ans:

No.

### Explanation:

Constructors are not inherited.

Since overriding requires inheritance, constructors cannot be overridden.

---

## 31. What is the `this` Keyword?

### Ans:

The `this` keyword refers to the current object.

### Explanation:

Example:

```java
class Employee {

    int id;

    Employee(int id) {
        this.id = id;
    }
}
```

Here:

```java
this.id
```

refers to instance variable.

Without `this`, compiler gets confused between local variable and instance variable.

---

## 32. What is Constructor Chaining Using this()?

### Ans:

Calling one constructor from another constructor of the same class is called Constructor Chaining.

### Explanation:

```java
class Test {

    Test() {
        this(10);
        System.out.println("Default");
    }

    Test(int a) {
        System.out.println("Parameterized");
    }
}
```

Output:

```text
Parameterized
Default
```

---

## 33. What is the super Keyword?

### Ans:

The `super` keyword refers to the immediate parent class object.

### Explanation:

Example:

```java
class Parent {

    int x = 10;
}

class Child extends Parent {

    void show() {
        System.out.println(super.x);
    }
}
```

Output:

```text
10
```

---

## 34. What is Constructor Chaining Using super()?

### Ans:

Calling a parent class constructor from a child class constructor.

### Explanation:

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

Output:

```text
Parent
Child
```

---

## 35. What is the Output?

```java
class Test {

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}
```

### Ans:

```text
Static Block
Main
```

### Explanation:

Execution Order:

1. Static Block
2. Main Method

Static blocks execute when class loads into memory.

---

## 36. What is a Static Variable?

### Ans:

A variable declared with the static keyword is called a static variable.

### Explanation:

```java
class Employee {

    static String company = "Google";
}
```

Static variables belong to the class, not objects.

Memory:

```text
Method Area
   ↓
company
```

Only one copy exists.

---

## 37. What is a Static Method?

### Ans:

A method declared using static keyword.

### Explanation:

```java
class Test {

    static void show() {
        System.out.println("Hello");
    }
}
```

Calling:

```java
Test.show();
```

Object is not required.

---

## 38. Why is Main Method Static?

### Ans:

Because JVM calls the main method without creating an object.

### Explanation:

If main is not static:

```java
public void main(String[] args)
```

JVM would need an object first.

But program execution starts from main itself.

Therefore:

```java
public static void main(String[] args)
```

---

## 39. What is a Final Variable?

### Ans:

A variable declared with final keyword cannot be reassigned.

### Explanation:

```java
final int x = 10;

x = 20;
```

Output:

```text
Compilation Error
```

---

## 40. What is a Final Method?

### Ans:

A method declared as final cannot be overridden.

### Explanation:

```java
class Parent {

    final void show() {
    }
}
```

```java
class Child extends Parent {

    void show() {
    }
}
```

Output:

```text
Compilation Error
```

---

## 41. What is a Final Class?

### Ans:

A class declared as final cannot be inherited.

### Explanation:

```java
final class Vehicle {
}
```

```java
class Car extends Vehicle {
}
```

Output:

```text
Compilation Error
```

Example:

```java
String
```

is a final class.

---

## 42. What is Exception Handling?

### Ans:

Exception Handling is a mechanism used to handle runtime errors and maintain normal program execution.

### Explanation:

Example:

```java
int a = 10;
int b = 0;

System.out.println(a / b);
```

Output:

```text
ArithmeticException
```

Using exception handling:

```java
try {
    System.out.println(a / b);
}
catch(Exception e) {
    System.out.println(e);
}
```

Program continues execution.

---

## 43. Difference Between Checked and Unchecked Exceptions?

### Ans:

| Checked                 | Unchecked            |
| ----------------------- | -------------------- |
| Checked at Compile Time | Checked at Runtime   |
| Must Handle             | Optional             |
| IOException             | NullPointerException |

### Explanation:

Checked:

```java
IOException
SQLException
ClassNotFoundException
```

Unchecked:

```java
ArithmeticException
ArrayIndexOutOfBoundsException
NullPointerException
```

---

## 44. What is the Output?

```java
try {
    System.out.println(10/0);
}
catch(Exception e) {
    System.out.println("Exception");
}
```

### Ans:

```text
Exception
```

### Explanation:

ArithmeticException occurs.

Catch block handles it.

---

## 45. Can We Have Multiple Catch Blocks?

### Ans:

Yes.

### Explanation:

```java
try {

}
catch(ArithmeticException e) {

}
catch(NullPointerException e) {

}
catch(Exception e) {

}
```

Specific exceptions should come before generic exceptions.

---

## 46. What is Finally Block?

### Ans:

A finally block always executes whether an exception occurs or not.

### Explanation:

```java
try {
    System.out.println("Try");
}
finally {
    System.out.println("Finally");
}
```

Output:

```text
Try
Finally
```

Used for:

* Closing Files
* Closing Database Connections
* Resource Cleanup

---

## 47. What is the Output?

```java
System.out.println(10/0);
```

### Ans:

```text
ArithmeticException
```

### Explanation:

Integer division by zero is illegal.

JVM throws:

```java
ArithmeticException
```

---

## 48. What is the Output?

```java
System.out.println(10.0/0);
```

### Ans:

```text
Infinity
```

### Explanation:

Floating-point division follows IEEE standards.

Result:

```text
Infinity
```

---

## 49. What is the Output?

```java
System.out.println(0.0/0);
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

Zero divided by zero is mathematically undefined.

---

## 50. What is the Output?

```java
int[] arr = new int[3];

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
```

### Ans:

```text
0
0
0
```

### Explanation:

Default values for arrays:

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

Since int array elements are automatically initialized to 0, all three values print 0.

---
## 51. What is an Array in Java?

### Ans:

An Array is a collection of similar types of elements stored in contiguous memory locations.

### Explanation:

Arrays are used when we want to store multiple values of the same datatype under a single variable name.

Example:

```java
int[] arr = {10, 20, 30, 40, 50};
```

Memory Representation:

```text
Index : 0   1   2   3   4
Value : 10 20 30 40 50
```

Advantages:

* Fast access using index
* Memory efficient
* Easy traversal

Disadvantages:

* Fixed size
* Same datatype only

---

## 52. What is the Difference Between Array and ArrayList?

### Ans:

| Array             | ArrayList       |
| ----------------- | --------------- |
| Fixed Size        | Dynamic Size    |
| Faster            | Slightly Slower |
| Stores primitives | Stores Objects  |
| Length Property   | size() Method   |

### Explanation:

Array:

```java
int[] arr = new int[5];
```

ArrayList:

```java
ArrayList<Integer> list = new ArrayList<>();
```

Array size cannot change after creation.

ArrayList grows automatically.

---

## 53. What is the Output?

```java
int[] arr = {10,20,30};

System.out.println(arr.length);
```

### Ans:

```text
3
```

### Explanation:

Arrays use:

```java
length
```

which is a property.

Not:

```java
length()
```

---

## 54. What is the Output?

```java
String str = "Java";

System.out.println(str.length());
```

### Ans:

```text
4
```

### Explanation:

Strings use:

```java
length()
```

which is a method.

Difference:

```java
array.length
string.length()
```

Very common interview question.

---

## 55. What is String Pool?

### Ans:

String Pool is a special memory area inside Heap Memory where String literals are stored.

### Explanation:

```java
String s1 = "Java";
String s2 = "Java";
```

Memory:

```text
String Pool

"Java"
 ↑
s1
 ↑
s2
```

Only one object is created.

This improves memory efficiency.

---

## 56. What is the Output?

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

Both variables point to the same String Pool object.

Reference comparison:

```java
s1 == s2
```

returns true.

---

## 57. What is the Output?

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

Two separate objects are created.

Memory:

```text
Heap

Object1
Object2
```

Different references.

Therefore:

```java
s1 == s2
```

returns false.

---

## 58. What is StringBuilder?

### Ans:

StringBuilder is a mutable class used to modify strings without creating new objects.

### Explanation:

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");

System.out.println(sb);
```

Output:

```text
Java Programming
```

Advantages:

* Faster than String
* Memory efficient
* Mutable

---

## 59. Difference Between String, StringBuilder and StringBuffer?

### Ans:

| String      | StringBuilder | StringBuffer |
| ----------- | ------------- | ------------ |
| Immutable   | Mutable       | Mutable      |
| Slow        | Fastest       | Slower       |
| Thread Safe | No            | Yes          |

### Explanation:

Use:

* String → Read-only data
* StringBuilder → Single-threaded
* StringBuffer → Multi-threaded

---

## 60. What is Wrapper Class?

### Ans:

A Wrapper Class converts primitive data types into objects.

### Explanation:

| Primitive | Wrapper   |
| --------- | --------- |
| byte      | Byte      |
| short     | Short     |
| int       | Integer   |
| long      | Long      |
| float     | Float     |
| double    | Double    |
| char      | Character |
| boolean   | Boolean   |

Example:

```java
Integer num = 100;
```

Wrapper classes are required by Collections Framework.

---

## 61. What is Autoboxing?

### Ans:

Automatic conversion of primitive data into wrapper object.

### Explanation:

```java
int x = 10;

Integer obj = x;
```

Compiler converts:

```java
Integer obj = Integer.valueOf(x);
```

Automatically.

---

## 62. What is Unboxing?

### Ans:

Automatic conversion of wrapper object into primitive datatype.

### Explanation:

```java
Integer obj = 100;

int x = obj;
```

Compiler converts:

```java
int x = obj.intValue();
```

Automatically.

---

## 63. What is Collections Framework?

### Ans:

Collections Framework is a set of predefined classes and interfaces used to store and manipulate groups of objects.

### Explanation:

Main Interfaces:

```text
Collection
   |
   |-- List
   |-- Set
   |-- Queue
```

```text
Map
```

Popular Implementations:

```text
ArrayList
LinkedList
HashSet
TreeSet
HashMap
LinkedHashMap
TreeMap
```

---

## 64. What is ArrayList?

### Ans:

ArrayList is a dynamic array implementation of the List interface.

### Explanation:

```java
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");
```

Features:

* Dynamic size
* Ordered
* Duplicate elements allowed
* Fast random access

---

## 65. What is LinkedList?

### Ans:

LinkedList is a doubly linked list implementation of the List interface.

### Explanation:

```java
LinkedList<Integer> list = new LinkedList<>();
```

Features:

* Dynamic size
* Faster insertion/deletion
* Slower random access

Memory:

```text
Data | Next | Previous
```

---

## 66. Difference Between ArrayList and LinkedList?

### Ans:

| ArrayList          | LinkedList         |
| ------------------ | ------------------ |
| Dynamic Array      | Doubly Linked List |
| Fast Search        | Slow Search        |
| Slow Insert/Delete | Fast Insert/Delete |

### Explanation:

Use:

ArrayList:

* Frequent reading

LinkedList:

* Frequent insertion/deletion

---

## 67. What is HashSet?

### Ans:

HashSet is a collection that stores unique elements.

### Explanation:

```java
HashSet<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10);
```

Output:

```text
10
20
```

Duplicate values are not allowed.

---

## 68. What is HashMap?

### Ans:

HashMap stores data in key-value pairs.

### Explanation:

```java
HashMap<Integer,String> map = new HashMap<>();

map.put(101,"John");
map.put(102,"David");
```

Memory:

```text
101 → John
102 → David
```

Features:

* Fast retrieval
* Unique keys
* Values can duplicate

---

## 69. Difference Between HashMap and Hashtable?

### Ans:

| HashMap          | Hashtable          |
| ---------------- | ------------------ |
| Not Synchronized | Synchronized       |
| Faster           | Slower             |
| Allows Null      | Doesn't Allow Null |

### Explanation:

HashMap is preferred in modern applications.

Hashtable is legacy.

---

## 70. What is the Output?

```java
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");

System.out.println(list.get(1));
```

### Ans:

```text
Python
```

### Explanation:

Indexing starts from:

```text
0
```

Therefore:

```java
list.get(1)
```

returns:

```text
Python
```

---

## 71. What is Comparable Interface?

### Ans:

Comparable is used for natural sorting.

### Explanation:

Method:

```java
compareTo()
```

Example:

```java
class Student implements Comparable<Student> {

    public int compareTo(Student s) {
        return this.id - s.id;
    }
}
```

Sorting occurs automatically.

---

## 72. What is Comparator Interface?

### Ans:

Comparator is used for custom sorting.

### Explanation:

Method:

```java
compare()
```

Example:

```java
Comparator<Student> c =
(a,b) -> a.name.compareTo(b.name);
```

Can create multiple sorting logics.

---

## 73. Difference Between Comparable and Comparator?

### Ans:

| Comparable           | Comparator             |
| -------------------- | ---------------------- |
| compareTo()          | compare()              |
| Single Sorting Logic | Multiple Sorting Logic |
| Inside Class         | Outside Class          |

### Explanation:

Comparable:

```java
Collections.sort(list);
```

Comparator:

```java
Collections.sort(list,new NameComparator());
```

---

## 74. What is the Output?

```java
Integer a = 100;
Integer b = 100;

System.out.println(a == b);
```

### Ans:

```text
true
```

### Explanation:

100 falls within Integer Cache range:

```text
-128 to 127
```

Therefore same object reused.

---

## 75. What is the Output?

```java
Integer a = 200;
Integer b = 200;

System.out.println(a == b);
```

### Ans:

```text
false
```

### Explanation:

200 is outside Integer Cache range.

Memory:

```text
a → Object1
b → Object2
```

Different references produce:

```text
false
```

---
## 76. What is HashMap Internally?

### Ans:

HashMap is a data structure that stores data in key-value pairs using a hashing mechanism.

### Explanation:

When data is inserted:

```java
map.put(key, value);
```

HashMap performs:

1. Calculates hashCode() of key
2. Converts hashCode into bucket index
3. Stores Entry in bucket

Structure:

```text
Bucket[0]
Bucket[1]
Bucket[2] → (101,John)
Bucket[3]
Bucket[4] → (102,David)
```

Average Complexity:

```text
Insertion : O(1)
Search    : O(1)
Deletion  : O(1)
```

---

## 77. What Happens If Two Keys Have Same HashCode?

### Ans:

HashMap handles collisions using Linked List (Java 7) and Red-Black Tree (Java 8).

### Explanation:

Example:

```java
key1 → hash = 10
key2 → hash = 10
```

Storage:

```text
Bucket 10

key1 → value1
   ↓
key2 → value2
```

This mechanism is called:

```text
Collision Handling
```

---

## 78. What is ConcurrentHashMap?

### Ans:

ConcurrentHashMap is a thread-safe version of HashMap designed for concurrent environments.

### Explanation:

HashMap:

```java
HashMap<Integer,String> map
```

Not Thread Safe.

ConcurrentHashMap:

```java
ConcurrentHashMap<Integer,String> map
```

Thread Safe.

Benefits:

* Better performance than Hashtable
* Supports concurrent access
* Reduces locking overhead

---

## 79. What is Multithreading?

### Ans:

Multithreading is the process of executing multiple threads simultaneously within a program.

### Explanation:

Example:

```text
Thread 1 → Download File
Thread 2 → Play Music
Thread 3 → Update UI
```

Advantages:

* Better CPU utilization
* Faster execution
* Improved responsiveness

---

## 80. How Can We Create a Thread?

### Ans:

There are two ways:

1. Extending Thread class
2. Implementing Runnable interface

### Explanation:

Using Thread:

```java
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread Running");
    }
}
```

Using Runnable:

```java
class MyTask implements Runnable {

    public void run() {
        System.out.println("Task Running");
    }
}
```

Runnable is preferred.

---

## 81. Difference Between start() and run()?

### Ans:

| start()              | run()                |
| -------------------- | -------------------- |
| Creates New Thread   | Normal Method Call   |
| JVM Creates Thread   | No New Thread        |
| Concurrent Execution | Sequential Execution |

### Explanation:

```java
thread.start();
```

Creates:

```text
Main Thread
Worker Thread
```

But:

```java
thread.run();
```

Executes inside current thread only.

---

## 82. What is Synchronization?

### Ans:

Synchronization is a mechanism used to control access to shared resources by multiple threads.

### Explanation:

Example:

```java
synchronized void withdraw() {

}
```

Only one thread can execute synchronized code at a time.

Benefits:

* Prevents Race Conditions
* Prevents Data Corruption

---

## 83. What is Deadlock?

### Ans:

Deadlock occurs when two or more threads wait indefinitely for each other to release resources.

### Explanation:

Example:

```text
Thread 1 holds Lock A
Waiting for Lock B

Thread 2 holds Lock B
Waiting for Lock A
```

Result:

```text
Program Hangs Forever
```

This situation is called Deadlock.

---

## 84. What is Heap Memory?

### Ans:

Heap Memory stores objects and instance variables.

### Explanation:

Example:

```java
Student s = new Student();
```

Memory:

```text
Heap
 └── Student Object
```

Features:

* Shared among threads
* Managed by Garbage Collector

---

## 85. What is Stack Memory?

### Ans:

Stack Memory stores method calls and local variables.

### Explanation:

Example:

```java
public void test() {

    int x = 10;
}
```

Memory:

```text
Stack

x = 10
```

Features:

* Thread-specific
* Automatically released

---

## 86. Difference Between Heap and Stack?

### Ans:

| Heap           | Stack                  |
| -------------- | ---------------------- |
| Stores Objects | Stores Local Variables |
| Shared         | Thread Specific        |
| Managed by GC  | Auto Removed           |
| Larger Memory  | Smaller Memory         |

### Explanation:

```java
Student s = new Student();
```

Object:

```text
Heap
```

Reference Variable:

```text
Stack
```

---

## 87. What is Garbage Collection?

### Ans:

Garbage Collection is the process of automatically removing unused objects from memory.

### Explanation:

Example:

```java
Student s = new Student();

s = null;
```

Object becomes:

```text
Eligible for Garbage Collection
```

GC frees memory automatically.

Benefits:

* Prevents Memory Leaks
* Automatic Memory Management

---

## 88. Can We Force Garbage Collection?

### Ans:

No.

### Explanation:

We can only request:

```java
System.gc();
```

or

```java
Runtime.getRuntime().gc();
```

JVM may ignore the request.

Therefore:

```text
GC is not guaranteed.
```

---

## 89. What is Lambda Expression?

### Ans:

Lambda Expression is an anonymous function introduced in Java 8.

### Explanation:

Traditional:

```java
Runnable r = new Runnable() {

    public void run() {
        System.out.println("Hello");
    }
};
```

Lambda:

```java
Runnable r =
() -> System.out.println("Hello");
```

Advantages:

* Less Code
* Better Readability
* Functional Programming Support

---

## 90. What is Functional Interface?

### Ans:

A Functional Interface contains exactly one abstract method.

### Explanation:

Example:

```java
@FunctionalInterface
interface Test {

    void show();
}
```

Examples:

```java
Runnable
Callable
Comparator
```

Used heavily with Lambda Expressions.

---

## 91. What is Stream API?

### Ans:

Stream API is used to process collections efficiently using functional programming techniques.

### Explanation:

Example:

```java
List<Integer> list =
Arrays.asList(1,2,3,4,5);

list.stream()
    .filter(x -> x%2==0)
    .forEach(System.out::println);
```

Output:

```text
2
4
```

Benefits:

* Less Code
* Better Readability
* Parallel Processing Support

---

## 92. What is CompletableFuture?

### Ans:

CompletableFuture is used for asynchronous programming.

### Explanation:

Example:

```java
CompletableFuture<String> future =
CompletableFuture.supplyAsync(
() -> "Java"
);

System.out.println(future.get());
```

Output:

```text
Java
```

Used in:

* Microservices
* APIs
* Background Tasks

---

## 93. What is the Output?

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

## 94. What is the Output?

```java
String s = null;

System.out.println(s.length());
```

### Ans:

```text
NullPointerException
```

### Explanation:

s does not refer to any object.

Calling:

```java
s.length()
```

causes:

```text
NullPointerException
```

---

## 95. What is the Output?

```java
byte b = 127;

b++;

System.out.println(b);
```

### Ans:

```text
-128
```

### Explanation:

Byte range:

```text
-128 to 127
```

After 127:

```text
127 + 1
```

Overflow occurs.

Result:

```text
-128
```

---

## 96. What is the Output?

```java
System.out.println('A' + 1);
```

### Ans:

```text
66
```

### Explanation:

ASCII / Unicode value:

```text
A = 65
```

Therefore:

```text
65 + 1 = 66
```

Output:

```text
66
```

---

## 97. What is the Output?

```java
char ch = 'A';

System.out.println(++ch);
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

## 98. What is the Output?

```java
System.out.println(true && false || true);
```

### Ans:

```text
true
```

### Explanation:

Operator Precedence:

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

## 99. What is the Output?

```java
System.out.println(10 + 20 + "30");
```

### Ans:

```text
3030
```

### Explanation:

Step 1:

```text
10 + 20 = 30
```

Step 2:

```text
30 + "30"
```

String concatenation:

```text
3030
```

---

## 100. What is the Output?

```java
public class Test {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
```

### Ans:

```text
true
false
true
```

### Explanation:

```java
s1 == s2
```

Both point to String Pool.

Result:

```text
true
```

```java
s1 == s3
```

s3 points to Heap Object.

Result:

```text
false
```

```java
s1.equals(s3)
```

Contents are same.

Result:

```text
true
```

---