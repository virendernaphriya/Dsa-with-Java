# Day 4 - Conditional Statements in Java

## Introduction

Today I learned how to control the flow of a Java program using conditional statements.

Conditional statements are used when a program needs to make decisions based on conditions.

I practiced:

- `if` statement
- `if-else` statement
- `if-else-if` ladder
- Nested `if`
- `switch` statement
- Logical conditions
- Beginner decision-making problems

---

# Table of Contents

- Why Conditional Statements Are Used
- `if` Statement
- `if-else` Statement
- `if-else-if` Ladder
- Nested `if`
- `switch` Statement
- Comparison Operators
- Logical Operators
- Problems Solved
- Important Notes
- Sample Programs
- Interview Notes
- Mistakes I Learned From
- What I Learned
- Day 4 Status

---

# Why Conditional Statements Are Used

Conditional statements help a program choose what to do.

Example:

```java
if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

Here, the message prints only when the condition is true.

---

# `if` Statement

The `if` statement checks one condition.

If the condition is true, the code inside the block runs.

## Syntax

```java
if (condition) {
    // code
}
```

## Example

```java
int num = 10;

if (num > 0) {
    System.out.println("Positive number");
}
```

---

# `if-else` Statement

The `if-else` statement is used when there are two possible results.

## Syntax

```java
if (condition) {
    // runs when condition is true
} else {
    // runs when condition is false
}
```

## Example

```java
int age = 17;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

# `if-else-if` Ladder

The `if-else-if` ladder is used when multiple conditions need to be checked.

Only one block runs from the whole ladder.

## Syntax

```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else if (condition3) {
    // code
} else {
    // default code
}
```

## Example

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 80) {
    System.out.println("B");
} else if (marks >= 70) {
    System.out.println("C");
} else {
    System.out.println("Fail");
}
```

---

# Nested `if`

Nested `if` means writing one `if` statement inside another `if` statement.

It is used when one condition depends on another condition.

## Example

```java
int age = 20;
boolean hasVoterId = true;

if (age >= 18) {
    if (hasVoterId) {
        System.out.println("Can vote");
    }
}
```

---

# `switch` Statement

The `switch` statement is used when one value is compared with multiple fixed cases.

It is useful for menu-based programs.

## Syntax

```java
switch (choice) {
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    default:
        System.out.println("Invalid choice");
}
```

## Example

```java
char operator = '+';
int a = 10;
int b = 5;

switch (operator) {
    case '+':
        System.out.println(a + b);
        break;
    case '-':
        System.out.println(a - b);
        break;
    default:
        System.out.println("Invalid operator");
}
```

---

# Comparison Operators

Comparison operators compare two values and return `true` or `false`.

| Operator | Meaning |
|---|---|
| `==` | Equal to |
| `!=` | Not equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |

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

| Operator | Meaning | Example |
|---|---|---|
| `&&` | Logical AND | `age >= 18 && hasVoterId` |
| `||` | Logical OR | `ch == 'a' || ch == 'e'` |
| `!` | Logical NOT | `!isValid` |

## Example

```java
int num = 55;

if (num % 5 == 0 && num % 11 == 0) {
    System.out.println("Divisible by 5 and 11");
}
```

---

# Problems Solved

- [x] Check even or odd
- [x] Check positive, negative, or zero
- [x] Find largest of two numbers
- [x] Find largest of three numbers
- [x] Check leap year
- [x] Check whether a character is vowel or consonant
- [x] Grade calculator
- [x] Simple calculator using switch
- [x] Check if a number is divisible by 5 and 11
- [x] Check whether a person is eligible to vote

---

# Files Created

| Problem | File |
|---|---|
| Check even or odd | `CheckEvenOdd.java` |
| Check positive, negative, or zero | `CheckPosNegZero.java` |
| Find largest of two numbers | `FindLargestOftwoNums.java` |
| Find largest of three numbers | `LargestNumOfThree.java` |
| Check leap year | `CheckLeapYr.java` |
| Check vowel or consonant | `CheckVowel.java` |
| Grade calculator | `GradeCalculator.java` |
| Simple calculator using switch | `Calculator.java` |
| Divisible by 5 and 11 | `CheckNumisDivisibleBy5And11.java` |
| Voting eligibility | `VoterEligiblity.java` |

---

# Important Notes

- Conditions always return either `true` or `false`.
- Use `if` when only one condition needs to be checked.
- Use `if-else` when there are two possible outputs.
- Use `if-else-if` when there are multiple conditions.
- Use nested `if` when one condition depends on another.
- Use `switch` when checking one variable against fixed values.
- In `switch`, `break` prevents fall-through.
- `default` runs when no `case` matches.
- Use `==` for comparison, not `=`.
- Use `&&` when all conditions must be true.
- Use `||` when at least one condition must be true.

---

# Sample Program

```java
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 45) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
```

---

# Sample Output

```text
Enter your marks: 85
Grade B
```

---

# How to Compile and Run

## Compile

```bash
javac FileName.java
```

## Run

```bash
java FileName
```

## Example

```bash
javac Calculator.java
java Calculator
```

---

# Interview Notes

- `if` checks a condition.
- `else` runs when the `if` condition is false.
- `else if` is used for multiple conditions.
- `switch` works with fixed values.
- `break` stops execution inside a `switch`.
- Without `break`, Java continues to the next case.
- `default` is optional but useful.
- `=` assigns a value.
- `==` compares two values.
- `&&` means both conditions must be true.
- `||` means at least one condition must be true.

---

# Mistakes I Learned From

- I should write proper spacing around operators.
- I should use meaningful prompts while taking input.
- I should remember to add `break` in `switch` cases.
- I should handle invalid input or invalid choices.
- I should close the `Scanner` after using it.
- I should use proper class names and file names.

---

# What I Learned

Today I learned how to write decision-making programs in Java.

I understood how to use:

- `if`
- `if-else`
- `if-else-if`
- Nested `if`
- `switch`
- Comparison operators
- Logical operators

I also practiced important beginner problems that are useful for logic building.

---

# Day 4 Status

Successfully completed Day 4 of my Java + DSA journey.

## Focus Areas

- Conditional statements
- Decision making
- Logical thinking
- Beginner Java problem solving

