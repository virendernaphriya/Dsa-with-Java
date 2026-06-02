# Day 5 - GCD, LCM, and Fraction Simplification

Quick revision notes for using functions with GCD, LCM, arrays, and fractions.

## Topics Covered

- Euclidean algorithm for GCD
- Handling negative numbers using `Math.abs()`
- Handling zero values in GCD
- Finding LCM using GCD
- Finding GCD of an array
- Finding LCM of an array
- Simplifying fractions using GCD

## Core Concepts

### GCD

GCD means Greatest Common Divisor. It is the largest number that divides both numbers completely.

Example:

```text
GCD of 18 and 12 = 6
```

### Euclidean Algorithm

Formula:

```text
gcd(a, b) = gcd(b, a % b)
```

Repeat this until `b` becomes `0`. At the end, `a` is the GCD.

Java pattern:

```java
while (b != 0) {
    int temp = b;
    b = a % b;
    a = temp;
}
return a;
```

Important checks:

```java
a = Math.abs(a);
b = Math.abs(b);

if (a == 0) return b;
if (b == 0) return a;
```

These checks make the function work for negative numbers and zero values.

### LCM

LCM means Least Common Multiple. It is the smallest number that is divisible by both numbers.

Formula:

```text
LCM = (a * b) / GCD(a, b)
```

Java pattern:

```java
int gcd = getGCD(a, b);
int lcm = (a * b) / gcd;
```

## Array Logic

### GCD of Array

Start with the first element, then keep finding GCD with the next element.

```java
int gcd = arr[0];

for (int i = 1; i < arr.length; i++) {
    gcd = getGCD(gcd, arr[i]);
}
```

Example:

```text
Array: 12, 16, 20, 24
GCD: 4
```

### LCM of Array

Start with the first element, then keep finding LCM with the next element.

```java
int lcm = arr[0];

for (int i = 1; i < arr.length; i++) {
    lcm = getLCM(lcm, arr[i]);
}
```

Example:

```text
Array: 12, 16, 20
LCM: 240
```

## Fraction Simplification

To simplify a fraction:

1. Find GCD of numerator and denominator.
2. Divide numerator by GCD.
3. Divide denominator by GCD.

Example:

```text
6 / 12
GCD = 6
6 / 6 = 1
12 / 6 = 2
Simplified fraction = 1 / 2
```

Java pattern:

```java
int gcd = getGCD(a, b);

a /= gcd;
b /= gcd;
```

## Files

- [GCDUsingEuclidAlgo.java](GCDUsingEuclidAlgo.java) - Finds GCD using Euclidean algorithm.
- [LCMUsingGCD.java](LCMUsingGCD.java) - Finds LCM using the GCD formula.
- [GCDOfArr.java](GCDOfArr.java) - Finds GCD of all values in an array.
- [LCMOfArr.java](LCMOfArr.java) - Finds LCM of all values in an array.
- [SimplifyFraction.java](SimplifyFraction.java) - Simplifies a fraction using GCD.

## Quick Revision

- Use `%` to reduce the GCD problem.
- Stop Euclidean algorithm when `b == 0`.
- Use `Math.abs()` so negative inputs do not create confusion.
- `GCD(a, 0)` is `a`.
- `GCD(0, b)` is `b`.
- `LCM(a, b) = (a * b) / GCD(a, b)`.
- To solve array GCD/LCM, keep updating one answer variable.
- To simplify a fraction, divide numerator and denominator by their GCD.

## Practice Again

- Find GCD of two numbers.
- Find LCM of two numbers using GCD.
- Find GCD of an array.
- Find LCM of an array.
- Simplify a fraction like `15 / 35`.
