# Week 3 - Day 1: Array Basics

Quick revision notes for the first day of arrays in Java.

## What I Learned

- Array is used to store multiple values of the same type.
- Array indexing starts from `0`.
- Last index is always `arr.length - 1`.
- `arr.length` gives the size of the array.
- Array values can be accessed using index: `arr[i]`.
- Array values can be updated using index: `arr[0] = 13`.
- A normal `for` loop is best when index is needed.
- A `for-each` loop is best when only values are needed.
- `0` is neither positive nor negative.

## Basic Syntax

```java
int[] arr = new int[5];          // declaration + memory allocation
int[] nums = {1, 2, 3, 4, 5};    // declaration + initialization
```

## Access And Update

```java
int[] arr = {12, 24, 23, 20, 30};

System.out.println(arr[0]);  // access first element
arr[0] = 13;                 // update first element
System.out.println(arr.length);
```

## Print Array

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

## Print Using For-Each Loop

```java
for (int num : arr) {
    System.out.println(num);
}
```

## Take Array Input

```java
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];

for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
}

sc.close();
```

## Reverse Traversal

```java
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.println(arr[i]);
}
```

## Sum Of Array

```java
int sum = 0;

for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}
```

## Average Of Array

```java
double sum = 0.0;

for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}

double avg = sum / arr.length;
```

## Count Positive And Negative Numbers

```java
int pCount = 0;
int nCount = 0;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > 0) {
        pCount++;
    } else if (arr[i] < 0) {
        nCount++;
    }
}
```

## Files Practiced

| File | Concept |
| --- | --- |
| `ArrayCreation.java` | Create, update, and print array |
| `ArrayInput.java` | Take input and print using for-each |
| `PrintArrayInReverse.java` | Reverse traversal |
| `SumOfArr.java` | Sum of elements |
| `AvgOfArr.java` | Average of elements |
| `CountPositiveNegative.java` | Count positives and negatives |

## Revision Checklist

- [ ] Can I create an array?
- [ ] Can I access an element by index?
- [ ] Can I update an element?
- [ ] Can I print all elements using `arr.length`?
- [ ] Can I take array input from user?
- [ ] Can I print an array in reverse?
- [ ] Can I find sum and average?
- [ ] Can I count positive and negative numbers?

