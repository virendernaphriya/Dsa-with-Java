# Week 5 Day 3 - Leaders in Array and Next Permutation Revision

## Problems Covered

1. Find leaders in an array.
2. Find the next permutation of an array.

## 1. Leaders in an Array

### Problem

An element is called a leader if every element on its right side is smaller than it.

Example:

```text
Input:  10 22 12 3 0 6
Output: 6 12 22
```

The last element is always a leader because there is no element to its right.

### Optimal Approach Used

In `LeadersInAnArr.java`, the array is scanned from right to left.

Core idea:

- Start from the last element and mark it as the current leader.
- Move from right to left.
- If the current element is greater than the maximum leader seen so far, add it to the answer.
- Update the current leader.

Complexity:

- Time: `O(n)`
- Space: `O(n)` for storing the leaders

## 2. Next Permutation

### Problem

Find the next lexicographically greater arrangement of the given numbers.

Example:

```text
Input:  2 3 1 3 3
Output: 2 3 3 1 3
```

If the array is already in descending order, then it is the last permutation, so reverse it to get the smallest permutation.

### Basic Approach Used

In `NextParmutation.java`, the basic version finds the breaking point, swaps it with the next greater element, and sorts the remaining right side.

Core idea:

- Find the first index from the right where `arr[i - 1] < arr[i]`.
- Swap that value with the smallest value greater than it on the right side.
- Sort the suffix after the breaking point.

Complexity:

- Time: `O(n log n)` because the suffix is sorted
- Space: `O(1)`

### Optimal Approach Used

The optimal version avoids sorting and reverses the suffix instead.

Core idea:

- Find the breaking index from the right.
- If no breaking index exists, reverse the whole array.
- Find the first greater element from the right side.
- Swap it with the breaking index value.
- Reverse the suffix to make it as small as possible.

Complexity:

- Time: `O(n)`
- Space: `O(1)`

## Quick Revision

| Problem | Basic Approach | Best According To Current Code |
| --- | --- | --- |
| Leaders in an array | Check every right-side element | Scan from right and track the greatest element so far |
| Next permutation | Swap breaking point and sort suffix | Swap breaking point and reverse suffix |

## Revision Focus

- The last element is always a leader.
- Leaders are found efficiently by scanning from right to left.
- In next permutation, the breaking point is the first `arr[i - 1] < arr[i]` found from the right.
- If there is no breaking point, reverse the whole array.
- Reversing the suffix is better than sorting it because it keeps the solution `O(n)`.
