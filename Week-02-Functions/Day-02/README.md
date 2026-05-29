# Day 02 - Types of Functions and Basic Problems

## Time Required

2 to 3 hours

## What You Learned

Today focused on different types of functions in Java and how to solve basic problems using reusable methods.

You practiced functions that only print output, functions that accept parameters, and functions that return values back to the caller.

## Types of Functions Practiced

## 1. Function Without Parameter and Without Return Type

This type of function does not take input and does not return a value.

```java
static void hello() {
    System.out.println("hello");
}
```

Key idea:

- Use this when the function only needs to perform a fixed task.
- Since the return type is `void`, it only performs an action.

## 2. Function With Parameter and Without Return Type

This type of function takes input but does not return a value.

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

Key idea:

- Parameters allow you to pass values into a function.
- The function uses the input directly and prints the result.

## 3. Function With Parameter and With Return Type

This type of function takes input and sends a result back.

```java
static int sum(int a, int b) {
    return a + b;
}
```

Key idea:

- Use `return` when the answer needs to be stored, reused, or printed later.
- The return type must match the value returned by the function.

## Basic Problems Completed

## 1. Addition

```java
static int add(int a, int b) {
    return a + b;
}
```

Concept used:

- Parameters
- Return value
- Arithmetic operator

## 2. Subtraction

```java
static int sub(int a, int b) {
    return a - b;
}
```

Concept used:

- Returning the difference of two numbers

## 3. Multiplication

```java
static int mul(int a, int b) {
    return a * b;
}
```

Concept used:

- Returning the product of two numbers

## 4. Division

```java
static int div(int a, int b) {
    return a / b;
}
```

Concept used:

- Integer division
- Return value

Note:

- Since both values are `int`, the result is also an integer.
- Example: `3 / 4` gives `0` in Java.

## 5. Maximum of Two Numbers

```java
static int max(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}
```

Concept used:

- `if-else`
- Comparing two values
- Returning based on condition

## 6. Minimum of Two Numbers

```java
static int min(int a, int b) {
    if (a > b) {
        return b;
    } else {
        return a;
    }
}
```

Concept used:

- Conditional logic
- Returning the smaller value

## 7. Check Even or Odd

```java
static void checkEvenOdd(int n) {
    if (n % 2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("odd");
    }
}
```

Concept used:

- Modulus operator `%`
- Function with parameter
- Function without return value

## 8. Area of Circle

```java
static double areaOfCircle(int r) {
    return Math.PI * r * r;
}
```

Concept used:

- `Math.PI`
- `double` return type
- Formula-based function

## 9. Factorial of a Number

```java
static int fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
```

Concept used:

- Loop inside function
- Multiplication assignment
- Returning final calculated value

## 10. Square of a Number

```java
static int Square(int n) {
    return n * n;
}
```

Concept used:

- Parameter
- Return value
- Multiplication

## Quick Revision Table

| Function | Purpose | Concept Used |
| -------- | ------- | ------------ |
| `hello()` | Prints a fixed message | No parameter + no return |
| `greet(String name)` | Prints greeting using input | Parameter + no return |
| `sum(int a, int b)` | Returns sum | Parameter + return |
| `add(int a, int b)` | Adds two numbers | Arithmetic + return |
| `sub(int a, int b)` | Subtracts two numbers | Arithmetic + return |
| `mul(int a, int b)` | Multiplies two numbers | Arithmetic + return |
| `div(int a, int b)` | Divides two numbers | Integer division |
| `max(int a, int b)` | Finds greater value | Condition + return |
| `min(int a, int b)` | Finds smaller value | Condition + return |
| `checkEvenOdd(int n)` | Checks even or odd | `%` + condition |
| `areaOfCircle(int r)` | Finds circle area | Formula + `double` |
| `fact(int n)` | Finds factorial | Loop + return |
| `Square(int n)` | Finds square | Multiplication + return |

## Important Concepts

- A function can have parameters or no parameters.
- A function can return a value or return nothing.
- `void` means the function does not return anything.
- `return` sends a value back to the place where the function was called.
- Returned values can be stored in variables.
- Functions can contain loops and conditional statements.
- Function names should clearly describe their purpose.

## Common Mistakes

- Forgetting to store or print the returned value.
- Using `void` for a function that should return an answer.
- Returning a value whose type does not match the function return type.
- Forgetting that integer division removes the decimal part.
- Not handling division by zero.
- Starting method names with capital letters. In Java, method names usually start with lowercase letters, like `square`.

## Files Completed

- `TypesOfFn.java`
- `BasicProblemWithFn.java`

## Before Moving Forward

Make sure you can answer these:

- What is the difference between `void` and `int` return type?
- What is a parameter?
- What does `return` do?
- When should a function return a value?
- How can you store a returned value?
- Can we use loops inside functions?
- Can we use `if-else` inside functions?
- Why does `3 / 4` return `0` when both values are integers?

## Day 2 Output

You should now be comfortable creating different types of Java functions and solving small problems by writing reusable methods.
