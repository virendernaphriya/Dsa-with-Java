# Week 4 Day 6 - Longest Subarray With Sum K Revision

## Problems Covered

1. Longest subarray with sum `K` using brute force.
2. Longest subarray with sum `K` using two pointers for positive integers.

## 1. Brute Force Longest Subarray With Sum K

### Concept

Given an array and a target sum `K`, find the length of the longest continuous subarray whose sum is equal to `K`.

Example:

```java
int arr[] = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
int k = 10;
```

Answer:

```text
5
```

One valid subarray is:

```text
3, 1, 1, 1, 4
```

### Logic

- Use `i` as the starting index.
- Use `j` as the ending index.
- Keep adding `arr[j]` to `sum`.
- If `sum == k`, update the answer with `j - i + 1`.
- This avoids the third loop because the running sum is updated while `j` moves.

### Code Pattern

```java
int len = 0;

for (int i = 0; i < arr.length; i++) {
    int sum = 0;
    for (int j = i; j < arr.length; j++) {
        sum += arr[j];
        if (sum == k) {
            len = Math.max(len, j - i + 1);
        }
    }
}
```

### Complexity

- Time Complexity: `O(n^2)`
- Space Complexity: `O(1)`

## 2. Two Pointer Approach For Positive Integers

### Concept

When all array elements are positive, use a sliding window.

The window grows from the right side and shrinks from the left side when the sum becomes greater than `K`.

### Logic

- Keep two pointers: `left` and `right`.
- Add `arr[right]` to `sum`.
- While `sum > k`, remove `arr[left]` and move `left`.
- If `sum == k`, update the longest length.
- This works for positive numbers because increasing the window always increases the sum.

### Code Pattern

```java
int sum = 0;
int len = 0;
int left = 0;

for (int right = 0; right < arr.length; right++) {
    sum += arr[right];

    while (sum > k) {
        sum -= arr[left];
        left++;
    }

    if (sum == k) {
        len = Math.max(len, right - left + 1);
    }
}
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Quick Revision Table

| Approach | When To Use | Time | Space |
| --- | --- | --- | --- |
| Brute force running sum | Works for positives, zeroes, and negatives | `O(n^2)` | `O(1)` |
| Two pointers / sliding window | Works when all numbers are positive | `O(n)` | `O(1)` |

## Common Mistakes

- Using sliding window when the array contains negative numbers.
- Forgetting to shrink the window while `sum > k`.
- Calculating length as `right - left` instead of `right - left + 1`.
- Starting the `right` loop from `left`; normally start from `0`.
- Confusing subarray with subsequence; subarray must be continuous.

## Files

- `LongestSubArraySum.java`
- `LongestSubArrayWithSumKForPositives.java`
