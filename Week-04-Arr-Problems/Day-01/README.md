# Week 4 - Day 1: Array Duplicate Problems

Quick revision notes for the duplicate problems practiced on Day 1.

## Problems Covered

| File | Problem | Approach In Code | Best According To Code | Time | Space |
| --- | --- | --- | --- | --- | --- |
| `FindDuplicateNum.java` | Find any duplicate number | Brute force nested loops | Brute force only in current code | `O(n^2)` | `O(1)` |
| `RemoveDuplicates.java` | Remove duplicates from sorted array | Two-pointer in-place approach | Best approach in current code | `O(n)` | `O(1)` |

## 1. Find Duplicate Number

### Brute Force Approach

Compare every element with every element after it.

Steps:

- Run `i` from `0` to `n - 1`.
- Run `j` from `i + 1` to `n - 1`.
- If `arr[i] == arr[j]`, return that duplicate.
- If no duplicate is found, return `-1`.

Why it is brute force:

- It checks all possible pairs.
- It does not use extra space.
- It is simple but slow for large arrays.

Complexity:

- Time: `O(n^2)`
- Space: `O(1)`

## 2. Remove Duplicates From Sorted Array

### Best Approach Used: Two Pointers

This works when the array is already sorted.

Core idea:

- `i` tracks the last unique element position.
- `j` scans the array.
- When `arr[i] != arr[j]`, place `arr[j]` at `arr[i + 1]`.
- Return the new length of the unique part.

Example:

```text
Input:  1 1 2 2 2 3 3 3
Unique: 1 2 3
New length: 3
```

Complexity:

- Time: `O(n)`
- Space: `O(1)`

## Revision Focus

- `FindDuplicateNum.java` is brute force because it uses nested loops.
- `RemoveDuplicates.java` is best for a sorted array because it uses two pointers and modifies the array in-place.
- For remove duplicates, only print elements from index `0` to `newLength - 1`.
- The two-pointer remove duplicate logic depends on the array being sorted.
