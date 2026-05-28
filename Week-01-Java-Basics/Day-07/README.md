# Day 07 - Pattern Printing + Weekly Revision

## Time Required

3 hours

## What You Learned

Today focused on pattern printing using nested loops.

Pattern problems help you understand how loops work with rows and columns.

## Nested Loops

A loop inside another loop is called a nested loop.

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

## Important Concept

- Outer loop controls rows.
- Inner loop controls columns.
- `System.out.print()` prints on the same line.
- `System.out.println()` moves to the next line.

## Basic Pattern Logic

Think of every pattern like a table:

```text
row = i
column = j
```

For every row, decide:

- How many spaces to print
- How many stars or numbers to print
- What value should be printed

## Pattern Problems Completed

## Pattern 1 - Square Star Pattern

Output:

```text
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

Logic:

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Key idea:

- Rows are fixed: `5`
- Columns are fixed: `5`

## Pattern 2 - Increasing Star Triangle

Output:

```text
*
* *
* * *
* * * *
* * * * *
```

Logic:

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Key idea:

- Row 1 prints 1 star.
- Row 2 prints 2 stars.
- Row `i` prints `i` stars.

## Pattern 3 - Increasing Number Triangle

Output:

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

Logic:

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

Key idea:

- Print column value `j`.
- Each row starts from `1`.

## Pattern 4 - Same Number Triangle

Output:

```text
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

Logic:

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
    }
    System.out.println();
}
```

Key idea:

- Print row value `i`.
- Row `i` prints `i` times.

## Pattern 5 - Decreasing Star Triangle

Output:

```text
* * * * *
* * * *
* * *
* *
*
```

Logic:

```java
for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Key idea:

- Start from 5 stars.
- Decrease stars by 1 in each row.

## Pattern 6 - Right Aligned Star Triangle

Output:

```text
        *
      * *
    * * *
  * * * *
* * * * *
```

Logic:

```java
for (int i = 1; i <= 5; i++) {
    for (int space = 1; space <= 5 - i; space++) {
        System.out.print("  ");
    }

    for (int star = 1; star <= i; star++) {
        System.out.print("* ");
    }

    System.out.println();
}
```

Key idea:

- First print spaces.
- Then print stars.
- Spaces decrease as stars increase.

## Quick Revision Table

| Pattern Type | Inner Loop Condition | What To Print |
| ------------ | -------------------- | ------------- |
| Square pattern | `j <= n` | Fixed stars |
| Increasing triangle | `j <= i` | Stars or numbers |
| Decreasing triangle | `j <= i` with `i--` | Stars |
| Number triangle | `j <= i` | `j` or `i` |
| Right aligned triangle | spaces + stars | Spaces first, stars after |

## Common Mistakes

- Using `println()` inside the inner loop by mistake.
- Forgetting `System.out.println()` after the inner loop.
- Confusing row value `i` with column value `j`.
- Printing spaces with the wrong count.
- Not dry running row by row.

## Files Completed

- `Pattern1.java`
- `Pattern2.java`
- `Pattern3.java`
- `Pattern4.java`
- `Pattern5.java`
- `Pattern6.java`

## Weekly Revision

Revise these topics from Week 1:

- Java program structure
- Variables and data types
- Input using `Scanner`
- Operators and type casting
- Conditional statements
- Loops
- Number problems using loops
- Pattern printing using nested loops

## Before Moving Forward

Make sure you can answer these:

- Which loop controls rows?
- Which loop controls columns?
- When should you use `print()`?
- When should you use `println()`?
- How do you print spaces before stars?
- What is the difference between printing `i` and printing `j`?

## Day 7 Output

You should now be able to solve basic pattern problems using nested loops.
