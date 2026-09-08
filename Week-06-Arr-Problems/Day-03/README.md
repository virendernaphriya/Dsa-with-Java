# Week 6 Day 3 - 3Sum

## Problem Covered

Find all unique triplets in an array whose sum is `0`.

Example:

```text
arr = [-1, 0, 1, 2, -1, -4]
output = [[-1, -1, 2], [-1, 0, 1]]
```

## Approach 1 - HashMap Pair Sum

- Store pairs of values by their sum.
- For each value, look for a pair with sum equal to its negative.
- Verify that all three indices are different.

This approach is implemented in `threeSum`.

## Approach 2 - Brute Force

- Check every possible combination of three indices.
- Keep only combinations whose sum is `0`.
- Sort each triplet and use a `HashSet` to remove duplicates.

This approach is implemented in `threeSumBrute`.

- Time Complexity: `O(n^3)`
- Space Complexity: `O(n)`

## Approach 3 - HashSet Improvement

- Fix the first element of the triplet.
- Use a `HashSet` to find the required third value while scanning the remaining elements.
- Sort each valid triplet and store it in a set to avoid duplicates.

This approach is implemented in `threeSumBetter`.

- Time Complexity: `O(n^2)`
- Space Complexity: `O(n)`

## Approach 4 - Two Pointers

- Sort the array first.
- Fix one element and use two pointers for the remaining range.
- Move the left pointer when the sum is too small and the right pointer when the sum is too large.
- Skip duplicate values to keep the result unique.

This approach is implemented in `threeSumOptimal`.

- Time Complexity: `O(n^2)`
- Space Complexity: `O(n)` for the sorted copy and result storage
