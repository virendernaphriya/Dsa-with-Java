# Day 03 - Method Overloading and Scope in Java

## Time Required

2 to 3 hours

## What You Learned

Today focused on two important Java function concepts:

- Method overloading
- Scope of variables

You practiced writing multiple methods with the same name but different parameters, and you also learned where variables can and cannot be accessed.

## Topics Covered

- Method overloading
- Same method name with different parameter lists
- Overloading by number of parameters
- Overloading by data type of parameters
- Function call matching
- Local scope
- Block scope
- Using overloaded methods in mini tasks
- `Scanner` input with functions
- `switch` with function calls

## 1. Method Overloading

Method overloading means creating multiple methods with the same name in the same class, but with different parameter lists.

```java
static int sum(int a, int b) {
    return a + b;
}

static int sum(int a, int b, int c) {
    return a + b + c;
}
```

Here both methods are named `sum`, but Java can identify which one to call based on the arguments passed.

## Valid Ways to Overload a Method

## 1. Change Number of Parameters

```java
static int mul(int a, int b) {
    return a * b;
}

static int mul(int a, int b, int c) {
    return a * b * c;
}
```

Concept used:

- Same method name
- Different number of parameters
- Java chooses the matching method automatically

## 2. Change Data Type of Parameters

```java
static double area(int r) {
    return Math.PI * r * r;
}

static double area(double r) {
    return Math.PI * r * r;
}
```

Concept used:

- Same method name
- Different parameter data types
- Useful when the same logic should support different input types

## 3. Change Order of Parameter Types

```java
static double sum(float a, int b) {
    return a + b;
}
```

This is also valid when another method has the same number of parameters but a different parameter type pattern.

## Important Rule

You cannot overload a method by changing only the return type.

Invalid example:

```java
static int add(int a, int b) {
    return a + b;
}

static double add(int a, int b) {
    return a + b;
}
```

Reason:

- Both methods have the same name and same parameters.
- Java does not use return type alone to decide which method to call.

## 2. Scope in Java

Scope means the area where a variable can be used.

## Local Scope

A variable declared inside a method can be used only inside that method.

```java
static void local() {
    int a = 5;
    System.out.println(a);
}
```

Here `a` belongs only to the `local()` method.

You cannot access it directly inside `main()`.

## Block Scope

A variable declared inside a block can be used only inside that block.

```java
if (true) {
    int b = 100;
    System.out.println(b);
}
```

Here `b` exists only inside the `if` block.

Outside the block, this gives an error:

```java
System.out.println(b);
```

## Mini Tasks Completed

## 1. Method Overloading Practice

File:

- `MethodOverLoading.java`

You created overloaded `sum()` and `mul()` methods.

Examples practiced:

```java
static int mul(int a, int b)
static int mul(int a, int b, int c)
static double mul(float a, float b, float c)
static double mul(float a, int b)
```

Concept used:

- Overloading by parameter count
- Overloading by parameter type
- Understanding which method Java calls

## 2. Area Using Overloaded Functions

File:

- `AreaOverloadedeFn.java`

You created overloaded `area()` methods for different radius types.

```java
static double area(int r)
static double area(float r)
static double area(double r)
```

Concept used:

- Same formula with different input types
- `Math.PI`
- `double` return type

## 3. Average of Three Numbers

File:

- `AvgOf3Num.java`

You created overloaded `avg()` methods for `int`, `float`, and `double` values.

```java
static double avg(int a, int b, int c)
static double avg(float a, float b, float c)
static double avg(double a, double b, double c)
```

Concept used:

- Overloading by data type
- Returning decimal answer using `double`
- Taking input using `Scanner`

## 4. Calculator Using Functions

File:

- `Calculator.java`

You created separate functions for basic arithmetic operations.

```java
static int sum(int a, int b)
static int sub(int a, int b)
static int mul(int a, int b)
static int div(int a, int b)
```

Concept used:

- Function-based calculator
- `switch` statement
- Calling functions based on operator input

Note:

- Add `break` after the `/` case to avoid falling into `default`.
- Handle division by zero before calling `div()`.

## 5. Scope Practice

File:

- `Scope.java`

You practiced:

- Variables inside methods
- Variables inside `if` blocks
- Why variables cannot be accessed outside their scope

## Quick Revision Table

| File | Main Concept | What It Practiced |
| ---- | ------------ | ----------------- |
| `Scope.java` | Scope | Local scope and block scope |
| `MethodOverLoading.java` | Method overloading | Same method name with different parameters |
| `AreaOverloadedeFn.java` | Overloaded area function | `int`, `float`, and `double` radius |
| `AvgOf3Num.java` | Overloaded average function | Average of 3 numbers for different data types |
| `Calculator.java` | Functions with `switch` | Mini calculator using reusable methods |

## Method Call Matching

Java checks method calls using the arguments passed.

```java
area(7);      // calls area(int r)
area(7.1f);   // calls area(float r)
area(12.5);   // calls area(double r)
```

Important:

- Decimal values are `double` by default.
- Use `f` for float values, like `7.1f`.
- If an exact match is available, Java calls that method.

## Common Mistakes

- Thinking return type alone can overload a method.
- Forgetting that variable scope ends after the method or block closes.
- Trying to access a variable outside the block where it was created.
- Passing `double` values when only `float` overloads exist.
- Forgetting `f` after float values.
- Forgetting `break` inside a `switch` case.
- Not handling division by zero.
- Using unclear file or method names. Example: `AreaOverloadedeFn` could be renamed to `AreaOverloadedFn`.

## Best Practices

- Keep method names meaningful and lowercase, like `avg`, `area`, `sum`.
- Use overloading only when methods perform the same kind of task.
- Use different method names when the task meaning is different.
- Keep variables as local as possible.
- Close `Scanner` after input is complete.
- Add spaces around operators for better readability.

## Before Moving Forward

Make sure you can answer these:

- What is method overloading?
- Can two methods have the same name in Java?
- What must be different for overloaded methods?
- Can return type alone overload a method?
- What is local scope?
- What is block scope?
- Why can you not print a variable outside the block where it was declared?
- Which method is called for `area(7)`, `area(7.1f)`, and `area(12.5)`?
- Why is `7.1f` different from `7.1`?
- Why should calculator division handle zero?

## Day 3 Output

You should now be comfortable with method overloading and scope, and you should be able to write small reusable methods that support different input types.
