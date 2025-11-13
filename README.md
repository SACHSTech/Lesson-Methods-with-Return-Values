# Methods with Return Values

Up to this point, the methods we’ve written have focused on **actions**: printing text, drawing shapes, repeating output, and organizing program structure. These were all **void methods** — they performed work, but did not provide any information back to the caller.

However, you’ve already been using methods that produce values. 

Recall using methods like:

```java
int n = someString.length();
double x = Math.pow(2, 3);
```

Both `length()` and `Math.pow()` *return* a value that your program can store, compute with, or use in an expression.

Until now, you’ve only been the *caller* of such methods. In this lesson, you will learn how to write your own methods that **return values**.

Most real programs require methods that can **compute a result** and send that result back to the part of the program that requested it. This allows methods to participate in calculations, decisions, and broader logic instead of simply producing output.

Typical uses for return methods include:

- determining whether a number is even  
- calculating a maximum, minimum, or average  
- extracting part of a string  
- validating user input  
- performing reusable computations  

A method with a return value allows your program to *ask a question* and receive an answer. This is a key step toward writing clean, modular, and professional-quality code.


# What Is a Return Value?

A **return value** is a piece of information that a method sends back to the code that called it.

Example:

```java
int result = add(3, 5);
```

Here:

- the method `add(3, 5)` is called  
- it computes a sum  
- it **returns** that computed value  
- the returned value is stored in the variable `result`  

Return values allow methods to be reused in different contexts, combined with other methods, or incorporated into expressions.


## Why Use Return Values?

Methods with return values allow you to:

- separate calculation from display
- reuse logic without duplicating code
- make decisions based on values produced by methods
- build more complex programs from simple components

A void method can print a result. A return method can produce a result and let the caller decide what to do with it.

This distinction is essential for writing maintainable programs.


## Structure of a Return Method

A return method has three defining features:

1. The method header specifies a **return type** instead of `void`  
2. The method computes a value  
3. A `return` statement sends that value back  

Example:

```java
private int add(int a, int b) {
    int sum = a + b;
    return sum;
}
```

Calling the method:

```java
int total = add(10, 20);
System.out.println(total);  // prints 30
```

`add()` does not print anything — it simply computes a result and returns it.


## Using the `return` Statement

A `return` statement:

1. **sends back** a value  
2. **ends** the method immediately (including exiting loops)

Example:

```java
int i = 1;

while (true) {
   i++;
   if (i == 100) {
      return i;  // loop ends, method ends
   }
}
```

No lines after the return statement will run.

## Examples of Return Methods

### Example 1 — Returning an Integer
```java
private int square(int n) {
    int result = n * n;
    return result;
}
```

Or, more succinctly:

```java
private int square(int n) {
    return n * n;
}
```

Usage:

```java
int x = square(6);   // x becomes 36
```

<br>

### Example 2 — Returning a Boolean

```java
private boolean isEven(int num) {
    boolean isEvenNumber = (num % 2 == 0);
    return isEvenNumber;
}
```

Or, more succinctly:

```java
private boolean isEven(int num) {
    return num % 2 == 0;
}
```

<br>

### Example 3 — Returning a String

```java
private String greet(String name) {
    return "Hello, " + name + "!";
}
```

<br>

### Example 4 — Using a Return Method Inside an Expression

```java
System.out.println("Square is: " + square(7));
```

The method call to `square()` is evaluated first, and its returned value becomes part of the printed expression.

<br>

## Return vs. Print

When first learning to use methods with return values, it's common to confuse the responsibilities of printing and returning.

### Printing

```java
private void printSum(int a, int b) {
    System.out.println(a + b);
}
```

This displays information but does not produce a reusable value.

### Returning

```java
private int sum(int a, int b) {
    return a + b;
}
```

This provides a value that can be stored, printed, or used in further logic.

### General Rule
If a method *computes* something, it should return that value rather than print it.

<br>

## Return Type Rules

The type in the method header must match the type of value returned:

| Return Type | Valid Return Example |
|-------------|-----------------------|
| `int` | `return 5;` |
| `double` | `return 3.14;` |
| `boolean` | `return true;` |
| `String` | `return "hello";` |
| `char` | `return 'X';` |

Invalid example:

```java
private int f() {
    return "hello";  // type mismatch
}
```

This will produce a compile-time error.

<br>

## Multiple Return Paths

A method may have multiple `return` statements, but only one will be executed.

Example:

```java
private boolean isPositive(int x) {
    if (x > 0) {
        return true;
    } else {
        return false;
    }
}
```

This can be simplified:

```java
private boolean isPositive(int x) {
    return x > 0;
}
```

<br>

# Practice Problems — Return Methods

Each exercise below requires you to **write a method that returns a value**, then test it using multiple calls from `run()`.  


## Problem 1 — Double a Number  
Return twice the value of the integer provided.

```java
public class Problem1 extends ConsoleProgram {
    public void run() {
        System.out.println(doubleNum(7));    // 14
        System.out.println(doubleNum(50));   // 100
        System.out.println(doubleNum(0));    // 0
        System.out.println(doubleNum(-4));   // -8
    }

    private int doubleNum(int n) {
        // TODO
    }
}
```

**Expected Output:**
```
14
100
0
-8
```

<br>

## Problem 2 — Last Character  
Return the last character of a string.

```java
public class Problem2 extends ConsoleProgram {
    public void run() {
        System.out.println(lastChar("Java"));     // a
        System.out.println(lastChar("Hello"));    // o
        System.out.println(lastChar("A"));        // A
    }

    private char lastChar(String word) {
        // TODO
    }
}
```

**Expected Output:**
```
a
o
A
```

<br>

## Problem 3 — Max of Two Numbers  
Return the larger of two integers.

```java
public class Problem3 extends ConsoleProgram {
    public void run() {
        System.out.println(max(10, 4));     // 10
        System.out.println(max(3, 9));      // 9
        System.out.println(max(-5, -2));    // -2
        System.out.println(max(7, 7));      // 7
    }

    private int max(int a, int b) {
        // TODO
    }
}
```

**Expected Output:**
```
10
9
-2
7
```

<br>

## Problem 4 — Absolute Value  
Return the absolute value of the integer provided (always non-negative). Do not use the pre-existing method from the `Math` class; instead, create the logic from scratch using conditionals.

```java
public class Problem4 extends ConsoleProgram {
    public void run() {
        System.out.println(abs(-5));   // 5
        System.out.println(abs(12));   // 12
        System.out.println(abs(0));    // 0
    }

    private int abs(int n) {
        // TODO
    }
}
```

**Expected Output:**
```
5
12
0
```

<br>

## Problem 5 — Count Vowels  
Count how many vowels (A, E, I, O, U) appear in an uppercase string.

```java
public class Problem5 extends ConsoleProgram {
    public void run() {
        System.out.println(countVowels("COMPUTER"));  // 3
        System.out.println(countVowels("AEIOU"));     // 5
        System.out.println(countVowels("XYZ"));       // 0
    }

    private int countVowels(String word) {
        // TODO
    }
}
```

**Expected Output:**
```
3
5
0
```

<br>

## Problem 6 — Multiplication Table Line  
Return a string containing the first `count` multiples of `base`, separated by spaces.

```java
public class Problem6 extends ConsoleProgram {
    public void run() {
        System.out.println(tableRow(5, 4));   // "5 10 15 20"
        System.out.println(tableRow(3, 6));   // "3 6 9 12 15 18"
        System.out.println(tableRow(7, 1));   // "7"
    }

    private String tableRow(int base, int count) {
        // TODO
    }
}
```

**Expected Output:**
```
5 10 15 20
3 6 9 12 15 18
7
```

<br>


## Problem 7 — Random Between  
Return a random integer between `low` and `high`, inclusive.

```java
public class Problem7 extends ConsoleProgram {
    public void run() {
        System.out.println(randomBetween(1, 6));   // 1–6
        System.out.println(randomBetween(10, 10)); // always 10
        System.out.println(randomBetween(-3, 3));  // -3–3
    }

    private int randomBetween(int low, int high) {
        // TODO
    }
}
```

**Expected Output (sample):**
```
4
10
-1
```

<br>

## Problem 8 — Contains Digit  
Determine whether the integer contains the specified digit.

```java
public class Problem8 extends ConsoleProgram {
    public void run() {
        System.out.println(containsDigit(4829, 8));   // true
        System.out.println(containsDigit(4829, 7));   // false
        System.out.println(containsDigit(1001, 0));   // true
    }

    private boolean containsDigit(int number, int digit) {
        // TODO
    }
}
```

**Expected Output:**
```
true
false
true
```

<br>

## Problem 9 — Average of Three  
Return the average of three integers as a double.

```java
public class Problem9 extends ConsoleProgram {
    public void run() {
        System.out.println(average(4, 10, 6));   // 6.666...
        System.out.println(average(1, 1, 1));    // 1.0
        System.out.println(average(0, 10, 20));  // 10.0
    }

    private double average(int a, int b, int c) {
        // TODO
    }
}
```

**Expected Output (approx.):**
```
6.6666666667
1.0
10.0
```

<br>

## Problem 10 — Password Strength (Challenge)  
Determine if a password is “strong” based on these suggested rules:

- at least 8 characters  
- contains a digit  
- contains an uppercase letter  

See [this reference](https://www.w3schools.com/java/java_ref_string.asp) for additional Java string methods that might help you solve this.

```java
public class Problem10 extends ConsoleProgram {
    public void run() {
        System.out.println(isStrong("Abc12345"));   // true
        System.out.println(isStrong("weakpass"));   // false
        System.out.println(isStrong("A1b2C3"));     // false (too short)
    }

    private boolean isStrong(String pw) {
        // TODO
    }
}
```

**Expected Output:**
```
true
false
false
```

