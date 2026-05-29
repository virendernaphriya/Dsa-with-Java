# Day 01 - Function Basics in Java

## Time Required

2 to 3 hours

## What You Learned

Today focused on the basics of functions in Java.

Functions help you break a program into smaller reusable blocks. Instead of writing the same logic again and again, you can create a function once and call it whenever needed.

## Why Functions Are Important

- They make code reusable.
- They make programs easier to read.
- They help divide big problems into smaller parts.
- They reduce repeated code.
- They make debugging easier.

## Basic Function Syntax

```java
static void functionName() {
    // code
}
```

Example:

```java
static void hello() {
    System.out.println("Hey Coderz");
}
```

To run this function, call it from the `main()` method:

```java
public static void main(String[] args) {
    hello();
}
```

## Function With Parameter

A parameter allows you to send data into a function.

```java
static void Square(int n) {
    System.out.println(n * n);
}
```

Function call:

```java
Square(5);
```

Output:

```text
25
```

## Important Concepts

- `static` allows the function to be called directly from `main()` in the same class.
- `void` means the function does not return any value.
- Function name should clearly describe what the function does.
- Parameters are used to pass input values to a function.
- Function call executes the code written inside the function.

## Mini Tasks Completed

## 1. Print Greeting Message

Function:

```java
static void hello() {
    System.out.println("Hey Coderz");
}
```

Key idea:

- Create a simple function without parameters.
- Call it from `main()` whenever you want to print the message.

## 2. Print Java Greeting

Function:

```java
static void helloJava() {
    System.out.println("Hello Java");
}
```

Key idea:

- Practice creating multiple functions in one class.
- Each function should handle one small task.

## 3. Print Numbers From 1 to N

Function:

```java
static void OneToN(int n) {
    for (int i = 1; i <= n; i++) {
        System.out.println(i);
    }
}
```

Key idea:

- Pass `n` as input.
- Use a loop inside the function.
- Print values from `1` to `n`.

## 4. Print Square of a Number

Function:

```java
static void Square(int n) {
    System.out.println(n * n);
}
```

Key idea:

- Use a parameter.
- Multiply the number by itself.

## 5. Print Cube of a Number

Function:

```java
static void Cube(int n) {
    System.out.println(n * n * n);
}
```

Key idea:

- Reuse the same parameter idea.
- Multiply the number three times.

## 6. Print Multiplication Table

Function:

```java
static void MultiplicationTable(int n) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + n * i);
    }
}
```

Key idea:

- Use a loop from `1` to `10`.
- Print the table of the number passed as input.

## 7. Print Even Numbers From 1 to N

Function:

```java
static void printEvenFrom1toN(int n) {
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
}
```

Key idea:

- Use `%` to check divisibility by `2`.
- Print only numbers where `i % 2 == 0`.

## Quick Revision Table

| Function | Purpose | Concept Used |
| -------- | ------- | ------------ |
| `hello()` | Prints a greeting message | Function without parameter |
| `helloJava()` | Prints Java greeting | Function without parameter |
| `OneToN(int n)` | Prints numbers from 1 to n | Parameter + loop |
| `Square(int n)` | Prints square of a number | Parameter + multiplication |
| `Cube(int n)` | Prints cube of a number | Parameter + multiplication |
| `MultiplicationTable(int n)` | Prints table of a number | Parameter + loop |
| `printEvenFrom1toN(int n)` | Prints even numbers | Parameter + loop + condition |

## Common Mistakes

- Forgetting to call the function from `main()`.
- Writing the function inside the `main()` method.
- Forgetting parentheses while calling a function.
- Confusing function definition with function call.
- Forgetting to pass a value for parameterized functions.
- Using unclear function names.

## Files Completed

- `FnBasics.java`

## Before Moving Forward

Make sure you can answer these:

- What is a function?
- Why do we use functions?
- What is the difference between function definition and function call?
- What is a parameter?
- What does `void` mean?
- Why are these functions written as `static`?
- How can you use loops inside functions?

## Day 1 Output

You should now be able to create basic Java functions, call them from `main()`, pass values as parameters, and solve small tasks using loops and conditions inside functions.
