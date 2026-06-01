# Day 4 - Prime Numbers and Factors

## Time Required

2.5 to 3 hours

## Topics Covered

- Prime numbers
- Composite numbers
- Factor counting
- Printing all factors of a number
- Sum of factors
- Perfect numbers
- Optimized prime checking using `i * i <= n`
- Counting prime numbers in a range

## What Is a Prime Number?

A prime number is a number that has exactly two factors:

- `1`
- The number itself

Example:

```java
7 -> factors are 1 and 7
```

So, `7` is a prime number.

## Basic Prime Logic

The basic approach is to count how many numbers divide `n` completely.

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

## Optimized Prime Logic

To check prime numbers faster, we only need to check factors up to the square root of `n`.

```java
for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
        System.out.println("Not Prime");
        return;
    }
}

System.out.println("Prime");
```

Why this works:

If a number has a factor greater than its square root, it must also have a smaller matching factor.

Example:

```text
36 = 2 x 18
36 = 3 x 12
36 = 4 x 9
36 = 6 x 6
```

After `6`, the factor pairs start repeating.

## What Are Factors?

Factors are numbers that divide another number completely.

Example:

```text
Factors of 12:
1 2 3 4 6 12
```

## Programs Practiced

| Problem | File | Status |
| --- | --- | --- |
| Count factors of a number | `CountFactors.java` | Completed |
| Print all factors | `PrintAllFactors.java` | Completed |
| Check perfect number | `PerfectNum.java` | Completed |
| Check prime number | `CheckPrime.java` | Practice |
| Print all prime numbers from 1 to N | `PrintAllPrime.java` | Practice |
| Find sum of factors | `SumOfFactors.java` | Practice |
| Check composite number | `CompositeNum.java` | Practice |
| Count prime numbers in range | `CountPrimeRange.java` | Practice |

## Key Functions Learned

### Count Factors

```java
static int countFactr(int n) {
    int count = 0;

    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++;
        }
    }

    return count;
}
```

### Print Factors

```java
static void printFactors(int n) {
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            System.out.println(i);
        }
    }
}
```

### Sum of Proper Factors

Proper factors are factors excluding the number itself.

```java
static int sumOfFactors(int n) {
    int sum = 0;

    for (int i = 1; i < n; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }

    return sum;
}
```

## Perfect Number Logic

A perfect number is a number whose proper factors add up to the number itself.

Example:

```text
6 -> 1 + 2 + 3 = 6
```

So, `6` is a perfect number.

Logic:

```java
int n = 6;
int sum = sumOfFactors(n);

if (n == sum) {
    System.out.println("Perfect Number");
} else {
    System.out.println("Not Perfect");
}
```

## Important Notes

- `1` is not a prime number.
- `2` is the smallest prime number.
- A composite number has more than two factors.
- Prime checking can be done using factor count, but the optimized square-root method is faster.
- In perfect number problems, do not include the number itself in the factor sum.

## Practice Checklist

- [ ] Check whether a number is prime
- [ ] Print all prime numbers from `1` to `N`
- [x] Count factors of a number
- [x] Print all factors
- [x] Check perfect number
- [ ] Find sum of factors
- [ ] Check whether a number is composite
- [ ] Count prime numbers in a range

## Learning Outcome

After Day 4, you should be comfortable using functions with loops and conditions to solve number-based problems involving factors, prime numbers, composite numbers, and perfect numbers.
