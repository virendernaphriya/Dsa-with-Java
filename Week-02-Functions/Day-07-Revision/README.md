# Day 7 - Functions Revision

Quick revision checklist for Week 2 Day 7.

## Problems

1. Create a function to add two numbers
2. Create an overloaded function
3. Check prime number
4. Print all factors
5. Find GCD
6. Find LCM
7. Count prime numbers till N
8. Create calculator using functions
9. Find factorial using function
10. Find maximum of 3 numbers using function

## Files

| Problem | File | Status |
| --- | --- | --- |
| Add two numbers | Not added yet | Pending |
| Overloaded function | Not added yet | Pending |
| Check prime number | Not added yet | Pending |
| Print all factors | Not added yet | Pending |
| Find GCD | Not added yet | Pending |
| Find LCM | `FindLCM.java` | Done |
| Count prime numbers till N | `CountPrime.java` | Done |
| Calculator using functions | `Calculator.java` | Done |
| Factorial using function | `Fact.java` | Done |
| Maximum of 3 numbers | `FindMax.java` | Done |

## Concepts To Revise

- Create reusable functions using `static`.
- Pass values through parameters.
- Return answers using `return`.
- Use method overloading when the same task works with different parameters.
- Keep calculation logic inside functions and input/output mostly inside `main`.
- Use `Scanner` when the program should take user input.

## Important Patterns

### Function With Return Value

```java
static int add(int a, int b) {
    return a + b;
}
```

### Method Overloading

```java
static int add(int a, int b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}
```

### Prime Check

```java
static boolean isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }

    return true;
}
```

### GCD Using Euclidean Algorithm

```java
static int getGCD(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    return a;
}
```

### LCM Using GCD

```java
static int getLCM(int a, int b) {
    if (a == 0 || b == 0) return 0;
    return Math.abs(a * b) / getGCD(a, b);
}
```

## Improvements For Current Files

- `FindLCM.java`: rename `getCGD` to `getGCD`.
- `FindLCM.java`: handle `0` values before calculating `a * b / gcd`.
- `CountPrime.java`: handle `n < 2`.
- `CountPrime.java`: use `i * i <= n` in the sieve outer loop.
- `Fact.java`: handle negative numbers.
- `Calculator.java`: avoid returning `0` as the answer when division by zero happens.
- Add the pending files so all 10 revision problems are covered.

## Quick Self-Test

- Can I explain why prime checking only needs to run till `i * i <= n`?
- Can I write GCD without looking?
- Can I explain why `LCM = a * b / GCD`?
- Can I write two overloaded methods with the same name?
- Can I separate input, function logic, and output cleanly?
