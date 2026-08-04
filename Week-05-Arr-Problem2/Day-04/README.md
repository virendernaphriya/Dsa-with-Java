# Week 5 Day 4 - Longest Consecutive Sequence Revision

## Problems Covered

1. Find the longest consecutive sequence in an unsorted array.

## 1. Longest Consecutive Sequence

### Problem

Given an unsorted array, find the length of the longest sequence of consecutive numbers.

Example:

```text
Input:  100 4 200 1 3 2
Output: 4
```

The longest consecutive sequence is:

```text
1 2 3 4
```

So the answer is `4`.

### Brute Force Approach

In `LongestConsecutiveSum.java`, the brute force version checks every number and keeps searching for the next consecutive number.

Core idea:

- Pick one array element as the starting number.
- Search whether `num + 1` exists in the array.
- Keep increasing the count while the next number is found.
- Track the maximum sequence length.

Complexity:

- Time: `O(n^2)` because each search scans the array
- Space: `O(1)`

### Better Approach

The better version sorts the array first.

Core idea:

- Sort the array.
- Traverse from left to right.
- If the next element is exactly `current + 1`, increase the count.
- If the next element is equal to the current element, skip it.
- Otherwise, reset the count to `1`.

Complexity:

- Time: `O(n log n)` because of sorting
- Space: `O(1)` apart from sorting internals

### Optimal Approach

The optimal version uses a `HashSet`.

Core idea:

- Add all elements into a `HashSet`.
- Start counting only from numbers that do not have `num - 1` in the set.
- Keep checking `num + 1`, `num + 2`, and so on.
- Track the longest sequence length.

This avoids starting from the middle of a sequence again and again.

Complexity:

- Time: `O(n)` average case
- Space: `O(n)`

## Quick Revision

| Problem | Brute Force / Basic Approach | Best Approach |
| --- | --- | --- |
| Longest consecutive sequence | For each element, linearly search for the next number | Use `HashSet` and start only from sequence heads |

## Revision Focus

- Consecutive numbers do not need to be next to each other in the original array.
- Sorting makes it easy to count consecutive elements, but it costs `O(n log n)`.
- Duplicate values should not reset the sequence.
- In the `HashSet` approach, start only when `num - 1` is not present.
- The optimal approach works in `O(n)` average time because set lookup is usually `O(1)`.
