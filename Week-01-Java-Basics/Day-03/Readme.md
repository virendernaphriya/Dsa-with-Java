# Day 3 - Java Operators & Type Casting 🚀

## Introduction

Today I learned different types of operators in Java and understood how expressions work internally.

I also learned about:
- Type casting
- Increment and decrement operators
- Integer division
- Percentage calculation
- Swapping numbers
- Area and circumference calculations

Along with concepts, I practiced multiple beginner-friendly Java programs to improve my logic-building skills.

---

# Table of Contents

- Arithmetic Operators
- Relational Operators
- Logical Operators
- Assignment Operators
- Increment & Decrement Operators
- Type Casting
- Problems Solved
- Important Formulas
- Sample Programs
- Important Notes
- Interview Notes
- Folder Structure
- What I Learned
- Day 3 Status

---

# Arithmetic Operators

Arithmetic operators are used to perform mathematical calculations.

| Operator | Meaning |
|---|---|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (Remainder) |

## Example

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

# Relational Operators

Relational operators compare two values and return `true` or `false`.

| Operator | Meaning |
|---|---|
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |
| `==` | Equal to |
| `!=` | Not equal to |

## Example

```java
int a = 10;
int b = 5;

System.out.println(a > b);
System.out.println(a == b);
```

---

# Logical Operators

Logical operators are used to combine multiple conditions.

| Operator | Meaning |
|---|---|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

## Example

```java
int age = 20;

System.out.println(age > 18 && age < 30);
```

---

# Assignment Operators

Assignment operators are used to assign and update values.

| Operator | Meaning |
|---|---|
| `=` | Assign |
| `+=` | Add and assign |
| `-=` | Subtract and assign |
| `*=` | Multiply and assign |
| `/=` | Divide and assign |
| `%=` | Modulus and assign |

## Example

```java
int a = 10;

a += 5;

System.out.println(a);
```

---

# Increment & Decrement Operators

| Operator | Meaning |
|---|---|
| `++` | Increase value by 1 |
| `--` | Decrease value by 1 |

## Example

```java
int a = 5;

a++;

System.out.println(a);
```

---

# Difference Between `i++` and `++i`

## Post Increment (`i++`)

```java
int a = 5;

System.out.println(a++); // prints 5
System.out.println(a);   // prints 6
```

- First uses the value
- Then increases it

---

## Pre Increment (`++i`)

```java
int b = 5;

System.out.println(++b); // prints 6
```

- First increases the value
- Then uses it

---

# Type Casting

Type casting means converting one data type into another.

---

# Automatic Type Casting (Widening)

Smaller data type automatically converts into larger data type.

## Example

```java
int a = 10;

double b = a;

System.out.println(b);
```

## Output

```text
10.0
```

---

# Manual Type Casting (Narrowing)

Larger data type manually converts into smaller data type.

## Example

```java
double a = 10.5;

int b = (int)a;

System.out.println(b);
```

## Output

```text
10
```

Decimal values are removed during narrowing type casting.

---

# Problems Solved 🧠

- [x] Find remainder of two numbers
- [x] Check result of `a++` and `++a`
- [x] Swap two numbers using third variable
- [x] Swap two numbers without third variable
- [x] Convert `double` to `int`
- [x] Calculate average of 3 numbers
- [x] Find percentage of 5 subjects
- [x] Calculate area and circumference of a circle

---

# Important Formulas

## Average Formula

```text
Average = Sum of numbers / Total numbers
```

## Percentage Formula

```text
Percentage = (Obtained Marks / Total Marks) × 100
```

## Area of Circle

```text
Area = πr²
```

## Circumference of Circle

```text
Circumference = 2πr
```

---

# Sample Program

```java
public class DayThree {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        double x = 10.5;

        int y = (int)x;

        System.out.println("After Type Casting: " + y);
    }
}
```

---

# Sample Output

```text
Addition: 13
Subtraction: 7
Multiplication: 30
Division: 3
Remainder: 1
After Type Casting: 10
```

---

# Important Notes

## Integer Division Removes Decimal Values

```java
int a = 5;
int b = 2;

System.out.println(a / b);
```

## Output

```text
2
```

---

# Use `double` for Decimal Results

```java
double a = 5;
double b = 2;

System.out.println(a / b);
```

## Output

```text
2.5
```

---

# Interview Notes

- `=` is assignment operator
- `==` checks equality
- `%` gives remainder
- Integer division removes decimal values
- `i++` uses value first, then increments
- `++i` increments first, then uses value
- Explicit type casting may cause data loss
- `double → int` removes decimal values

---

# Mistakes I Learned From

- I should use proper spacing around operators
- I should carefully handle integer division
- I should understand when Java performs automatic type conversion
- I should choose proper data types according to the problem
- I should improve code formatting and readability

---

# What I Learned 📚

Today I learned:
- Different types of operators in Java
- Difference between `i++` and `++i`
- Type casting in Java
- Integer vs floating-point division
- Logic building through beginner problems
- Swapping techniques
- Percentage and average calculations

I also improved my understanding of Java syntax and code readability.

---

# Day 3 Status ✅

Successfully completed Day 3 of my Java + DSA journey.

### Focus Areas:
- Operators
- Type Casting
- Logic Building
- Beginner Java Problem Solving

More consistency = More growth 🚀