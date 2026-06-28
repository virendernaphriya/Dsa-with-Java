# Week 4 - Day 2: Array Rotation By K

Quick revision notes for left and right rotation by `k`.

## Problems Covered

| File | Problem | Approaches In Code | Best According To Code |
| --- | --- | --- | --- |
| `LeftRotateByK.java` | Left rotate array by `k` | Brute force using temp array, best using reversal | Reversal approach |
| `RightRotateByK.java` | Right rotate array by `k` | Best using reversal | Reversal approach |

## Key Formula

Always reduce `k` first:

```java
k = k % n;
```

This handles cases where `k` is greater than the array length.

## 1. Left Rotate By K

### Brute Force Approach Used

Store the first `k` elements in a temporary array.

Steps:

- Copy first `k` elements into `temp`.
- Shift remaining elements `k` positions to the left.
- Place `temp` elements at the end.

Complexity:

- Time: `O(n)`
- Space: `O(k)`

### Best Approach Used: Reversal Algorithm

For left rotation by `k`:

```text
1. Reverse 0 to k - 1
2. Reverse k to n - 1
3. Reverse 0 to n - 1
```

Example:

```text
Input:  1 2 3 4 5 6 7, k = 3
Output: 4 5 6 7 1 2 3
```

Complexity:

- Time: `O(n)`
- Space: `O(1)`

## 2. Right Rotate By K

### Best Approach Used: Reversal Algorithm

For right rotation by `k`:

```text
1. Reverse 0 to n - k - 1
2. Reverse n - k to n - 1
3. Reverse 0 to n - 1
```

Example:

```text
Input:  1 2 3 4 5 6 7, k = 4
Output: 4 5 6 7 1 2 3
```

Complexity:

- Time: `O(n)`
- Space: `O(1)`

## Brute Force vs Best

| Rotation | Brute Force | Best |
| --- | --- | --- |
| Left rotate by `k` | Use `temp` array of size `k` | Use reversal algorithm |
| Right rotate by `k` | Could use `temp` array of size `k` | Use reversal algorithm |

## Revision Focus

- Use `k = k % n` before rotating.
- Reversal algorithm is best in current code because it uses constant extra space.
- Left rotation reverses the first `k` elements first.
- Right rotation reverses the first `n - k` elements first.
- `reverseArr(arr, start, end)` is the helper used by both best approaches.
