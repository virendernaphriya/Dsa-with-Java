# Week 4 Day 4 - Array Problems Revision

## Problems Covered

1. Maximum consecutive ones in a binary array.
2. Find the element appearing once when all other elements appear twice.

## 1. Maximum Consecutive Ones

### Concept

Given a binary array containing only `0` and `1`, find the maximum number of continuous `1`s.

Example:

```java
int arr[] = {1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1};
```

Answer:

```text
4
```

### Logic

- Keep a `count` variable for the current continuous streak of `1`s.
- Keep a `maxCount` variable for the best streak found so far.
- If the current element is `1`, increase `count`.
- If the current element is `0`, reset `count` to `0`.
- Update `maxCount` after every `1`.

### Dry Run

| Element | count | maxCount |
| --- | --- | --- |
| 1 | 1 | 1 |
| 1 | 2 | 2 |
| 1 | 3 | 3 |
| 0 | 0 | 3 |
| 1 | 1 | 3 |
| 1 | 2 | 3 |
| 0 | 0 | 3 |
| 1 | 1 | 3 |
| 1 | 2 | 3 |
| 1 | 3 | 3 |
| 1 | 4 | 4 |

### Code Pattern

```java
int maxCount = 0;
int count = 0;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 1) {
        count++;
        maxCount = Math.max(maxCount, count);
    } else {
        count = 0;
    }
}
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## 2. Find Element Appearing Once

### Concept

In an array where every element appears twice except one element, find the single element.

Example:

```java
int arr[] = {1, 2, 3, 4, 4, 3, 1};
```

Answer:

```text
2
```

### XOR Property

This problem is solved using XOR.

Important rules:

- `a ^ a = 0`
- `a ^ 0 = a`
- XOR of same numbers cancels them out.
- The number left after XOR of the whole array is the single appearing element.

### Logic

- Create `xor = 0`.
- Traverse the whole array.
- Do `xor = xor ^ arr[i]`.
- At the end, `xor` contains the element that appears once.

### Dry Run

For:

```java
{1, 2, 3, 4, 4, 3, 1}
```

XOR expression:

```text
1 ^ 2 ^ 3 ^ 4 ^ 4 ^ 3 ^ 1
```

Same numbers cancel out:

```text
(1 ^ 1) ^ (3 ^ 3) ^ (4 ^ 4) ^ 2 = 2
```

### Code Pattern

```java
int xor = 0;

for (int i = 0; i < arr.length; i++) {
    xor ^= arr[i];
}

return xor;
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Quick Revision Table

| Problem | Main Idea | Time | Space |
| --- | --- | --- | --- |
| Maximum consecutive ones | Count current streak and reset on `0` | `O(n)` | `O(1)` |
| Element appearing once | XOR all elements | `O(n)` | `O(1)` |

## Common Mistakes

- Forgetting to reset `count` to `0` when `0` appears.
- Updating `maxCount` only at the end instead of during traversal.
- Using XOR only works here because all other elements appear exactly twice.
- If elements appear more than twice, this XOR approach may not work.

## Files

- `MaxConsecutiveOnes.java`
- `FindAppearingOnceEl.java`
