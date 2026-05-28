# Day 06 - Loops Part 2 + Number Problems

## Time Required

2.5 to 3 hours

## What You Learned

Today's focus was logic building using loops and number-based problems.

The most important idea is breaking a number into digits:

```java
while (n > 0) {
    int digit = n % 10;
    n = n / 10;
}
```

This pattern is used in palindrome numbers, Armstrong numbers, digit sum, reverse number, and many other problems.

## Core Number Pattern

### Extract Digits

```java
int n = 1234;

while (n > 0) {
    int digit = n % 10;
    System.out.println(digit);
    n = n / 10;
}
```

Output:

```text
4
3
2
1
```

### Why It Works

- `n % 10` gives the last digit.
- `n / 10` removes the last digit.
- Repeat until the number becomes `0`.

## Problems Practiced

- Check palindrome number
- Check Armstrong number
- Find factorial of a number
- Check prime number
- Print all factors of a number
- Count factors of a number
- Find GCD of two numbers
- Find LCM of two numbers
- Print Fibonacci series
- Check perfect number

## Quick Revision Notes

## 1. Palindrome Number

A number is a palindrome if it reads the same forward and backward.

Example:

```text
121 -> Palindrome
123 -> Not Palindrome
```

Logic:

```java
int original = n;
int reverse = 0;

while (n > 0) {
    int digit = n % 10;
    reverse = reverse * 10 + digit;
    n = n / 10;
}

if (original == reverse) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not Palindrome");
}
```

## 2. Armstrong Number

An Armstrong number is a number where the sum of each digit raised to the power of total digits equals the original number.

Example:

```text
153 = 1^3 + 5^3 + 3^3 = 153
```

Basic 3-digit logic:

```java
int original = n;
int sum = 0;

while (n > 0) {
    int digit = n % 10;
    sum = sum + digit * digit * digit;
    n = n / 10;
}

if (sum == original) {
    System.out.println("Armstrong");
} else {
    System.out.println("Not Armstrong");
}
```

## 3. Factorial

Factorial means multiplying a number by all positive numbers below it.

Example:

```text
5! = 5 * 4 * 3 * 2 * 1 = 120
```

Logic:

```java
int fact = 1;

for (int i = 1; i <= n; i++) {
    fact = fact * i;
}

System.out.println(fact);
```

## 4. Prime Number

A prime number has exactly two factors: `1` and itself.

Logic:

```java
int count = 0;

for (int i = 1; i <= n; i++) {
    if (n % i == 0) {
        count++;
    }
}

if (count == 2) {
    System.out.println("Prime");
} else {
    System.out.println("Not Prime");
}
```

Later optimization:

```java
for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
        System.out.println("Not Prime");
        break;
    }
}
```

## 5. Print Factors

Factors are numbers that divide `n` completely.

```java
for (int i = 1; i <= n; i++) {
    if (n % i == 0) {
        System.out.println(i);
    }
}
```

## 6. Count Factors

```java
int count = 0;

for (int i = 1; i <= n; i++) {
    if (n % i == 0) {
        count++;
    }
}

System.out.println(count);
```

## 7. GCD of Two Numbers

GCD is the greatest number that divides both numbers.

Simple logic:

```java
int gcd = 1;

for (int i = 1; i <= a && i <= b; i++) {
    if (a % i == 0 && b % i == 0) {
        gcd = i;
    }
}

System.out.println(gcd);
```

## 8. LCM of Two Numbers

LCM is the smallest number divisible by both numbers.

Formula:

```text
LCM = (a * b) / GCD
```

Logic:

```java
int lcm = (a * b) / gcd;
System.out.println(lcm);
```

## 9. Fibonacci Series

Fibonacci series starts with `0` and `1`.

Each next number is the sum of the previous two numbers.

Example:

```text
0 1 1 2 3 5 8 13
```

Logic:

```java
int first = 0;
int second = 1;

for (int i = 1; i <= n; i++) {
    System.out.println(first);

    int next = first + second;
    first = second;
    second = next;
}
```

## 10. Perfect Number

A perfect number is equal to the sum of its proper factors.

Example:

```text
6 -> 1 + 2 + 3 = 6
```

Logic:

```java
int sum = 0;

for (int i = 1; i < n; i++) {
    if (n % i == 0) {
        sum = sum + i;
    }
}

if (sum == n) {
    System.out.println("Perfect Number");
} else {
    System.out.println("Not Perfect Number");
}
```

## Common Patterns To Remember

### Digit Extraction

```java
int digit = n % 10;
n = n / 10;
```

### Reverse Number

```java
reverse = reverse * 10 + digit;
```

### Sum of Digits

```java
sum = sum + digit;
```

### Product Loop

```java
result = result * i;
```

### Count Something

```java
count++;
```

### Check Divisibility

```java
if (n % i == 0) {
    // divisible
}
```

## Files Completed

- `CheckPalindrome.java`
- `ArmStrongNum.java`
- `FactorialOfN.java`
- `CheckPrimeNum.java`
- `FactorOfN.java`
- `CountFactorOfN.java`
- `GCDOfTwoNums.java`
- `LCM.java`
- `FibonacciSeries.java`
- `PerfectNum.java`

## Before Moving Forward

Make sure you can dry run these without seeing the solution:

- Palindrome number
- Armstrong number
- Prime number
- GCD and LCM
- Fibonacci series
- Perfect number

## Day 6 Output

You should now be able to solve number-based loop problems using:

- Digit extraction
- Factor counting
- Divisibility checks
- Accumulator variables
- Loop-based dry runs
