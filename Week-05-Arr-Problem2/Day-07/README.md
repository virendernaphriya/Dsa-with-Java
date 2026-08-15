# Week 5 Day 7 - Count Subarrays With Sum K Revision

## Problems Covered

1. Count the number of subarrays with sum `K`.

## 1. Count Subarrays With Sum K

### Problem

Given an integer array and a target sum `K`, count how many contiguous subarrays have sum equal to `K`.

Example:

```text
Input:
arr = [3, -3, 1, 1, 1]
K = 3

Output:
3
```

Valid subarrays are:

- `[3]`
- `[3, -3, 1, 1, 1]`
- `[1, 1, 1]`

### Brute Force Approach

`subArrayCountBrute` checks every possible subarray.

Core idea:

- Pick every index `i` as the starting point.
- Keep adding elements from `i` to `j`.
- Whenever the running sum becomes equal to `K`, increase the count.

Complexity:

- Time: `O(n^2)`
- Space: `O(1)`

### Optimal Approach

`subArrayCountOptimal` uses prefix sum and a `HashMap`.

Core idea:

- Keep a running prefix sum while traversing the array.
- If `prefixSum - K` already exists in the map, then a subarray ending at the current index has sum `K`.
- Add the frequency of `prefixSum - K` to the answer.
- Store the current prefix sum frequency in the map.
- Start the map with `0 -> 1` so subarrays starting from index `0` are counted correctly.

This approach works with positive, negative, and zero values.

Complexity:

- Time: `O(n)`
- Space: `O(n)`

## Quick Revision

| Problem | Basic Approach | Best Approach |
| --- | --- | --- |
| Count subarrays with sum `K` | Try all subarrays and track their sums | Use prefix sum with a frequency map |

## Revision Focus

- A subarray must be contiguous.
- Prefix sum helps convert the problem into checking whether `prefixSum - K` appeared before.
- The map stores frequencies, not just whether a prefix sum exists.
- Initializing the map with `0 -> 1` handles subarrays that start at index `0`.
