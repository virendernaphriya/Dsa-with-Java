# Day 2 - Variables, Data Types, and Input in Java

## Topics Covered

- Variables in Java
- Data types
- Taking input using `Scanner`
- Printing user input
- Basic arithmetic operations
- Area calculation
- Simple interest calculation
- Temperature conversion

---

## Concepts Learned

### Variables

Variables are used to store data in a program.

Example:

```java
int age = 21;
double price = 99.99;
char grade = 'A';
boolean isPassed = true;
String name = "Virender";
```

---

### Data Types

| Data Type | Use |
|---|---|
| `int` | Stores whole numbers |
| `long` | Stores large whole numbers |
| `float` | Stores decimal numbers |
| `double` | Stores more accurate decimal numbers |
| `char` | Stores a single character |
| `boolean` | Stores `true` or `false` |
| `String` | Stores text |

---

### Taking Input Using Scanner

To take input from the user, we use the `Scanner` class.

```java
import java.util.Scanner;
```

Example:

```java
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();
System.out.println(age);
```

---

## Scanner Methods Practiced

| Method | Use |
|---|---|
| `nextInt()` | Takes integer input |
| `nextLong()` | Takes long input |
| `nextFloat()` | Takes float input |
| `nextDouble()` | Takes double input |
| `next()` | Takes single word input |
| `nextLine()` | Takes full line input |

---

## Problems Practiced

1. Take two numbers and print their sum
2. Take two numbers and print their difference
3. Take two numbers and print their product
4. Take two numbers and print their division
5. Take name and age as input and print them
6. Calculate area of a circle
7. Calculate simple interest
8. Convert Celsius to Fahrenheit


## Mistakes / Improvements

- I should write spaces around operators for better readability.
- I should be careful while using `next()` and `nextLine()`.
- I should use `double` when decimal output is required.

---

## What I Learned

Today I learned how to declare variables, use different data types, and take input from the user using the `Scanner` class.

I also practiced basic arithmetic operations, area calculation, simple interest, and temperature conversion.

---

## Status

Day 2 completed successfully.