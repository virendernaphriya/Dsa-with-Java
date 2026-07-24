# Week 4 Day 5 - Subarray Problems Revision

## Problems Covered

1. Print all subarrays.
2. Find maximum and minimum subarray sum using brute force.

## 1. Print All Subarrays

### Concept

A subarray is a continuous part of an array.

Example:

```java
int arr[] = {1, 2, 3};
```

Subarrays:

```text
1
1, 2
1, 2, 3
2
2, 3
3
```

### Logic

- Use `i` as the starting index.
- Use `j` as the ending index.
- Use `k` to print elements from `i` to `j`.
- Calculate `sum` while printing each subarray.

### Code Pattern

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = i; j < arr.length; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
            System.out.print(arr[k] + ",");
        }
        System.out.println(" Sub Array sum " + sum);
    }
}
```

### Complexity

- Time Complexity: `O(n^3)`
- Space Complexity: `O(1)`

## 2. Maximum and Minimum Subarray Sum

### Concept

Find the largest and smallest sum among all possible continuous subarrays.

Example:

```java
int arr[] = {1, 2, 3, 4, 5};
```

Maximum subarray sum:

```text
15
```

Minimum subarray sum:

```text
1
```

### Logic

- Generate every subarray using three nested loops.
- Calculate the sum of each subarray.
- Update `maxSum` when the current sum is greater.
- Update `minSum` when the current sum is smaller.
- Start `maxSum` with `Integer.MIN_VALUE`.
- Start `minSum` with `Integer.MAX_VALUE`.

### Code Pattern

```java
int maxSum = Integer.MIN_VALUE;
int minSum = Integer.MAX_VALUE;

for (int i = 0; i < arr.length; i++) {
    for (int j = i; j < arr.length; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }
        maxSum = Math.max(maxSum, sum);
        minSum = Math.min(minSum, sum);
    }
}
```

### Complexity

- Time Complexity: `O(n^3)`
- Space Complexity: `O(1)`

## Quick Revision Table

| Problem | Main Idea | Time | Space |
| --- | --- | --- | --- |
| Print all subarrays | Fix start and end, then print from start to end | `O(n^3)` | `O(1)` |
| Maximum subarray sum | Check sum of every subarray | `O(n^3)` | `O(1)` |
| Minimum subarray sum | Track smallest sum while checking subarrays | `O(n^3)` | `O(1)` |

## Common Mistakes

- Forgetting that subarrays must be continuous.
- Initializing `maxSum` with `0`, which can fail for all-negative arrays.
- Initializing `minSum` with `0`, which can fail for all-positive arrays.
- Recalculating sum inside the third loop is simple but slower.
- Printing "Max subarray sum" for `minSum`; label it as minimum subarray sum.

## Files

- `AllSubarray.java`
- `MaxSubArraySum.java`
