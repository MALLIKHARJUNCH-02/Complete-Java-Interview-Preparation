# Java Tricky Interview Questions (Basic to Advanced)

> A curated list of conceptual Java interview questions with concise
> answers.

## 1. Java Basics

### Q1. Why is Java platform independent?

**Answer:** Java source code is compiled into bytecode (`.class`), which
runs on the JVM available for different operating systems.

### Q2. Why is `String` immutable?

**Answer:** For security, thread safety, string pool optimization, and
reliable hashing.

### Q3. Difference between `==` and `.equals()`?

**Answer:** `==` compares references (or primitive values); `.equals()`
compares object content (if overridden).

### Q4. Can `main()` be overloaded?

**Answer:** Yes. The JVM only invokes
`public static void main(String[] args)`.

### Q5. Can we run a class without `main()`?

**Answer:** Not directly with `java ClassName` (except special launch
mechanisms like JavaFX or frameworks).

### Q6. Why must a public class name match the file name?

**Answer:** Java requires one public top-level class per source file,
and the file name must match that class.

------------------------------------------------------------------------

## 2. OOP

### Q7. Constructor vs Method?

**Answer:** Constructors initialize objects; methods define behavior.

### Q8. Can constructors be `final`, `static`, or `abstract`?

**Answer:** No.

### Q9. Can we override static methods?

**Answer:** No. Static methods are hidden, not overridden.

### Q10. Why can't private methods be overridden?

**Answer:** They are not inherited.

### Q11. Can an abstract class have constructors?

**Answer:** Yes. They execute when subclasses are instantiated.

### Q12. Can an interface have constructors?

**Answer:** No.

------------------------------------------------------------------------

## 3. Inheritance & Polymorphism

### Q13. Difference between overloading and overriding?

**Answer:** Overloading = compile time polymorphism; overriding =
runtime polymorphism.

### Q14. Can we reduce access while overriding?

**Answer:** No. Access can only stay the same or become more accessible.

### Q15. Why doesn't Java support multiple inheritance of classes?

**Answer:** To avoid the Diamond Problem.

------------------------------------------------------------------------

## 4. Exception Handling

### Q16. Checked vs Unchecked exceptions?

**Answer:** Checked exceptions are verified by the compiler; unchecked
exceptions extend `RuntimeException`.

### Q17. Can we create custom checked and unchecked exceptions?

**Answer:** Yes.

### Q18. Does `finally` always execute?

**Answer:** Usually yes, except in cases like `System.exit()` or JVM
crash.

### Q19. Can we catch `Exception` before `ArithmeticException`?

**Answer:** No. It causes unreachable code.

### Q20. Why use exceptions instead of return codes?

**Answer:** Cleaner code and separation of normal logic from error
handling.

------------------------------------------------------------------------

## 5. Collections

### Q21. Why is HashMap lookup approximately O(1)?

**Answer:** It uses hashing to locate buckets efficiently.

### Q22. Can HashMap have one null key?

**Answer:** Yes.

### Q23. Why are mutable keys dangerous?

**Answer:** Changing a key's state can change its hash code, making
retrieval fail.

### Q24. Difference between ArrayList and LinkedList?

**Answer:** ArrayList is faster for random access; LinkedList is better
for frequent insertions/deletions in the middle.

### Q25. Difference between fail-fast and fail-safe iterators?

**Answer:** Fail-fast throws `ConcurrentModificationException`;
fail-safe iterates over a copy or snapshot.

------------------------------------------------------------------------

## 6. Multithreading

### Q26. Difference between `start()` and `run()`?

**Answer:** `start()` creates a new thread; `run()` executes in the
current thread.

### Q27. Why is `sleep()` static?

**Answer:** It pauses the currently executing thread.

### Q28. Difference between `wait()` and `sleep()`?

**Answer:** `wait()` releases the monitor; `sleep()` does not.

### Q29. What is deadlock?

**Answer:** Two or more threads waiting indefinitely for each other.

------------------------------------------------------------------------

## 7. Java 8+

### Q30. Functional Interface?

**Answer:** An interface with exactly one abstract method.

### Q31. Lambda expression?

**Answer:** A concise way to implement functional interfaces.

### Q32. Stream vs Collection?

**Answer:** Collections store data; streams process data.

### Q33. Optional?

**Answer:** A container to avoid explicit null handling.

------------------------------------------------------------------------

## 8. JVM

### Q34. Stack vs Heap?

**Answer:** Stack stores method frames and local variables; Heap stores
objects.

### Q35. Why is String Pool in the heap?

**Answer:** It's a shared memory optimization for immutable strings.

### Q36. What causes OutOfMemoryError?

**Answer:** The JVM cannot allocate more memory.

### Q37. Difference between Error and Exception?

**Answer:** Errors are serious JVM problems; exceptions are
application-level problems that can often be handled.

------------------------------------------------------------------------

## 9. JDBC

### Q38. Why use PreparedStatement?

**Answer:** Prevents SQL injection and improves performance.

### Q39. What is transaction?

**Answer:** A group of operations treated as one unit using
commit/rollback.

### Q40. AutoCommit?

**Answer:** When enabled, each SQL statement commits automatically.

------------------------------------------------------------------------

## 10. Advanced

### Q41. Why is Java pass-by-value?

**Answer:** Java always passes copies of variables. Object references
are copied, not the objects.

### Q42. Can we override `finalize()`?

**Answer:** Yes, but it is deprecated and should not be relied upon.

### Q43. Can an enum implement an interface?

**Answer:** Yes.

### Q44. Can enums extend classes?

**Answer:** No. They already extend `java.lang.Enum`.

### Q45. Why are wrapper classes immutable?

**Answer:** To ensure thread safety and predictable behavior.

### Q46. Difference between Comparable and Comparator?

**Answer:** Comparable defines natural ordering; Comparator defines
custom ordering.

### Q47. What is serialization?

**Answer:** Converting an object into a byte stream.

### Q48. Why declare `serialVersionUID`?

**Answer:** To control serialization compatibility.

### Q49. Reflection?

**Answer:** Examining and manipulating classes, methods, and fields at
runtime.

### Q50. Why is `volatile` not a replacement for `synchronized`?

**Answer:** `volatile` guarantees visibility, not atomicity.

------------------------------------------------------------------------

# Practice Tip

For each topic, practice: - Explain the concept in your own words. -
Write a small code example. - Predict the output before running it. -
Explain **why** the output occurs.

Mastering the "why" is what interviewers usually evaluate.
