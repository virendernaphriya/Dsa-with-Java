# Day 05 - Loops in Java

## Time Required

2 to 3 hours

## What You Learned

Loops help us repeat a block of code again and again until a condition becomes false.

Java has three main loops:

- `for` loop
- `while` loop
- `do-while` loop

## 1. for Loop

Use a `for` loop when you know how many times you want to repeat something.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### Syntax

```java
for (initialization; condition; update) {
    // code to repeat
}
```

### Flow

1. Initialization runs once.
2. Condition is checked.
3. If condition is true, loop body runs.
4. Update runs.
5. Condition is checked again.
6. Loop stops when condition becomes false.

## 2. while Loop

Use a `while` loop when you want to repeat code while a condition is true.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### Syntax

```java
while (condition) {
    // code to repeat
}
```

### Important

In a `while` loop, write the update carefully. If you forget the update, the loop may become infinite.

## 3. do-while Loop

Use a `do-while` loop when you want the loop body to run at least once.

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### Syntax

```java
do {
    // code to repeat
} while (condition);
```

### Important

A `do-while` loop checks the condition after running the loop body.

So, it always runs at least one time.

## Key Concepts

## Initialization

Initialization means creating or setting the starting value of a loop variable.

```java
int i = 1;
```

## Condition

Condition decides whether the loop should continue or stop.

```java
i <= 5
```

If the condition is true, the loop runs.

If the condition is false, the loop stops.

## Update

Update changes the value of the loop variable after each iteration.

```java
i++;
```

Other examples:

```java
i--;
i = i + 2;
i = i * 2;
```

## Infinite Loop

An infinite loop never stops because its condition never becomes false.

Example:

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
}
```

Here, `i++` is missing, so `i` always remains `1`.

Correct version:

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## Dry Run

A dry run means checking the code step by step manually.

Example:

```java
for (int i = 1; i <= 3; i++) {
    System.out.println(i);
}
```

| Step | i | Condition | Output |
| ---- | - | --------- | ------ |
| 1 | 1 | true | 1 |
| 2 | 2 | true | 2 |
| 3 | 3 | true | 3 |
| 4 | 4 | false | stop |

## Practice Problems Completed

- Print numbers from 1 to N
- Print numbers from N to 1
- Print even numbers from 1 to N
- Print odd numbers from 1 to N
- Sum of first N natural numbers
- Sum of even numbers from 1 to N
- Multiplication table of a number
- Count digits of a number
- Reverse a number
- Sum of digits of a number

## Quick Revision Notes

- Use `for` loop when the number of repetitions is clear.
- Use `while` loop when repetition depends on a condition.
- Use `do-while` loop when the code must run at least once.
- Every loop needs a condition that eventually becomes false.
- Always check initialization, condition, and update.
- Dry run is the best way to understand loop behavior.

## Common Patterns

### Print 1 to N

```java
for (int i = 1; i <= n; i++) {
    System.out.println(i);
}
```

### Print N to 1

```java
for (int i = n; i >= 1; i--) {
    System.out.println(i);
}
```

### Even Numbers

```java
for (int i = 1; i <= n; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}
```

### Odd Numbers

```java
for (int i = 1; i <= n; i++) {
    if (i % 2 != 0) {
        System.out.println(i);
    }
}
```

### Sum of Numbers

```java
int sum = 0;

for (int i = 1; i <= n; i++) {
    sum = sum + i;
}
```

### Count Digits

```java
int count = 0;

while (num > 0) {
    count++;
    num = num / 10;
}
```

### Reverse a Number

```java
int reverse = 0;

while (num > 0) {
    int digit = num % 10;
    reverse = reverse * 10 + digit;
    num = num / 10;
}
```

### Sum of Digits

```java
int sum = 0;

while (num > 0) {
    int digit = num % 10;
    sum = sum + digit;
    num = num / 10;
}
```

## Before Moving Forward

Make sure you can dry run these without seeing the solution:

- Count digits
- Reverse a number
- Sum of digits
- Sum from 1 to N
- Multiplication table

