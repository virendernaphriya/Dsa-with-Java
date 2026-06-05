# Day 6 - Time Complexity, Optimized Power, and Sieve of Eratosthenes

This day focuses on writing faster programs by understanding how much work an algorithm does as input size grows.

## Topics Covered

- Time complexity
- Big O notation
- Constant, linear, logarithmic, and quadratic time
- Optimized power calculation
- Sieve of Eratosthenes algorithm
- Counting prime numbers efficiently

## 1. Time Complexity

Time complexity tells us how the running time of an algorithm grows when the input size grows.

It does not measure the exact time in seconds. Instead, it measures the number of operations performed by the algorithm.

Example:

```java
for (int i = 1; i <= n; i++) {
    System.out.println(i);
}
```

This loop runs `n` times, so its time complexity is:

```text
O(n)
```

## Why Time Complexity Matters

Two programs can give the same answer, but one can be much faster than the other.

For small inputs, both may look fine. For large inputs, the better algorithm matters a lot.

Example:

- Checking all numbers from `1` to `n` takes more time.
- Checking only up to `sqrt(n)` is faster.
- Using the Sieve of Eratosthenes is even better when finding many primes.

## Common Time Complexities

| Complexity | Name | Example |
| --- | --- | --- |
| `O(1)` | Constant time | Accessing one array element |
| `O(log n)` | Logarithmic time | Repeatedly dividing input by 2 |
| `O(n)` | Linear time | Single loop from `1` to `n` |
| `O(n log n)` | Linearithmic time | Efficient sorting algorithms |
| `O(n^2)` | Quadratic time | Nested loops |

## 2. Optimized Power

The power problem means finding:

```text
a^n
```

Example:

```text
2^5 = 32
```

## Basic Power Approach

The simple approach multiplies `a` exactly `n` times.

```java
int ans = 1;

for (int i = 1; i <= n; i++) {
    ans = ans * a;
}
```

Time complexity:

```text
O(n)
```

## Optimized Power Idea

Instead of multiplying one by one, we use the idea:

```text
a^n = (a^(n / 2)) * (a^(n / 2))
```

If `n` is odd:

```text
a^n = a * (a^(n / 2)) * (a^(n / 2))
```

This reduces the exponent by half each time.

Time complexity:

```text
O(log n)
```

## Optimized Power Code

```java
public static int optimizedPower(int a, int n) {
    if (n == 0) {
        return 1;
    }

    int halfPower = optimizedPower(a, n / 2);
    int halfPowerSquare = halfPower * halfPower;

    if (n % 2 != 0) {
        return a * halfPowerSquare;
    }

    return halfPowerSquare;
}
```

## Dry Run

For:

```text
2^5
```

Steps:

```text
2^5 = 2 * 2^2 * 2^2
2^2 = 2^1 * 2^1
2^1 = 2 * 2^0 * 2^0
2^0 = 1
```

Final answer:

```text
32
```

## 3. Sieve of Eratosthenes

The Sieve of Eratosthenes is an efficient algorithm used to find all prime numbers from `2` to `n`.

Instead of checking each number separately, it marks multiples of prime numbers as non-prime.

## Prime Number Reminder

A prime number has exactly two factors:

```text
1 and itself
```

Examples:

```text
2, 3, 5, 7, 11, 13
```

## Sieve Logic

1. Create an array from `0` to `n`.
2. Mark all numbers from `2` to `n` as prime.
3. Start from `2`.
4. If the current number is prime, mark all its multiples as non-prime.
5. Start marking multiples from `i * i`.
6. Continue while `i * i <= n`.
7. Print the numbers still marked as prime.

## Why Start From `i * i`?

For a number `i`, smaller multiples are already marked by smaller prime numbers.

Example for `5`:

```text
5 * 2 = 10  already marked by 2
5 * 3 = 15  already marked by 3
5 * 4 = 20  already marked by 2
5 * 5 = 25  start from here
```

So we start from:

```java
int j = i * i;
```

## Sieve Code

```java
int n = 10;
int[] arr = new int[n + 1];

for (int i = 2; i <= n; i++) {
    arr[i] = 1;
}

for (int i = 2; i * i <= n; i++) {
    if (arr[i] == 0) {
        continue;
    }

    for (int j = i * i; j <= n; j += i) {
        arr[j] = 0;
    }
}

System.out.println("Prime numbers");
int count = 0;

for (int i = 2; i <= n; i++) {
    if (arr[i] == 1) {
        System.out.println(i);
        count++;
    }
}

System.out.println("Count is : " + count);
```

## Dry Run for `n = 10`

Initial prime marks:

```text
2 3 4 5 6 7 8 9 10
```

Start with `2`:

```text
Mark 4, 6, 8, 10 as non-prime
```

Next prime is `3`:

```text
Mark 9 as non-prime
```

Numbers still marked prime:

```text
2, 3, 5, 7
```

Prime count:

```text
4
```

## Time Complexity of Sieve

The Sieve of Eratosthenes is very efficient for finding all primes up to `n`.

Time complexity:

```text
O(n log log n)
```

Space complexity:

```text
O(n)
```

## Quick Revision Notes

- Time complexity helps compare algorithms by growth rate.
- `O(1)` is constant time.
- `O(n)` means work grows linearly with input.
- `O(n^2)` usually comes from nested loops.
- Optimized power reduces repeated multiplication using divide and conquer.
- Optimized power has `O(log n)` time complexity.
- Sieve is best when we need all prime numbers up to `n`.
- In sieve, mark multiples as non-prime.
- Start marking from `i * i`.
- Run the outer sieve loop while `i * i <= n`.

## Files

- `SieveOfEratosthenes.java`
