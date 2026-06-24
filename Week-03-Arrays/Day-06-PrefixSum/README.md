# Week 3 - Day 6: Prefix Sum

This day focuses on using cumulative sums to answer array problems faster. Prefix sum is useful when a problem repeatedly asks for sums from the beginning of the array or sums between two indexes.

## Problems Covered

- Prefix sum array
- Running sum of an array
- Range sum query
- Equilibrium index
- Two sum using brute force

## 1. Prefix Sum Array

File: `PrefixSum.java`

### Concept

A prefix sum array stores the cumulative sum up to every index.

For this array:

```text
[1, 2, 3, 4, 5]
```

The prefix sum becomes:

```text
[1, 3, 6, 10, 15]
```

### Formula

```java
arr[i] = arr[i - 1] + arr[i];
```

### Approach Used

1. Start from index `1`.
2. Add the previous prefix value to the current element.
3. Store the result back in the same array.
4. Print the updated array.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)` because the same array is updated.

## 2. Running Sum of Array

File: `RunningSumArr.java`

### Concept

Running sum is the same idea as prefix sum. Each position stores the sum of all elements from index `0` to the current index.

### Approach Used

The method:

```java
static int[] runningSum(int arr[])
```

updates the original array and returns it.

Steps:

1. Traverse from index `1`.
2. Add `arr[i - 1]` to `arr[i]`.
3. Return the modified array.

### Key Point

After running sum is created, the original values are changed. If original values are needed later, create a separate prefix array instead.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## 3. Range Sum Query

File: `RangeSumQuery.java`

### Problem

Find the sum of array elements from index `left` to index `right`.

Example:

```java
int arr[] = {3, 0, -2, 6, -1};
rangeSum(arr, 1, 3);
```

Output:

```text
4
```

because `0 + (-2) + 6 = 4`.

### Current Approach

The current solution uses a simple loop from `left` to `right`.

### Complexity

- Time Complexity: `O(right - left + 1)`, which becomes `O(n)` in the worst case.
- Space Complexity: `O(1)`

### Prefix Sum Optimized Formula

If a prefix sum array is already created:

```java
rangeSum(left, right) = prefix[right] - prefix[left - 1]
```

For `left == 0`:

```java
rangeSum(0, right) = prefix[right]
```

This makes each range sum query `O(1)` after `O(n)` preprocessing.

## 4. Equilibrium Index

File: `EquillibriumIdx.java`

### Problem

Find an index where:

```text
left sum == right sum
```

The current element is not included in either side.

Example:

```text
[1, 7, 3, 6, 5, 6]
```

Index `3` is an equilibrium index because:

```text
1 + 7 + 3 = 5 + 6
```

### Approach Used

1. Calculate the total sum of the array.
2. Keep `leftSum = 0`.
3. Traverse each index.
4. Subtract the current element from `totalSum`; now `totalSum` represents the right sum.
5. If `leftSum == totalSum`, return the current index.
6. Add the current element to `leftSum`.
7. If no index matches, return `-1`.

### Key Point

The order of operations matters:

```java
totalSum -= nums[i]; // right sum
if (leftSum == totalSum) return i;
leftSum += nums[i];
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## 5. Two Sum

File: `TwoSum.java`

### Problem

Find two indexes whose values add up to the target.

Example:

```java
int arr[] = {1, 2, 3, 4, 5, 3, 5};
int target = 6;
```

Possible answer:

```text
0 4
```

because `arr[0] + arr[4] = 1 + 5 = 6`.

### Current Approach

The current solution uses brute force nested loops.

Steps:

1. Pick one element using index `i`.
2. Check every element after it using index `j`.
3. If `arr[i] + arr[j] == target`, return both indexes.
4. If no pair is found, return an empty array.

### Complexity

- Time Complexity: `O(n^2)`
- Space Complexity: `O(1)`

### Optimized Idea

Use a `HashMap` to store visited values and their indexes.

For every element:

```text
needed = target - current
```

If `needed` already exists in the map, the pair is found.

This gives:

- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

## Main Concepts Practiced

- Prefix sum
- Running sum
- In-place array update
- Range sum queries
- Left sum and right sum comparison
- Equilibrium index
- Brute force pair checking
- Returning an array from a method
- Time complexity comparison between brute force and optimized approaches

## Quick Revision Checklist

- Can I build a prefix sum array using one loop?
- Do I know when prefix sum changes the original array?
- Can I calculate range sum using `prefix[right] - prefix[left - 1]`?
- Can I handle the special case when `left == 0`?
- Can I explain why equilibrium index subtracts current value before comparison?
- Can I identify why brute force two sum is `O(n^2)`?
- Do I know how `HashMap` can optimize two sum to `O(n)`?

## Complexity Summary

| Problem | Time Complexity | Space Complexity |
| --- | --- | --- |
| Prefix Sum | `O(n)` | `O(1)` |
| Running Sum | `O(n)` | `O(1)` |
| Range Sum Query Current Approach | `O(n)` | `O(1)` |
| Range Sum Query With Prefix Sum | `O(1)` per query after preprocessing | `O(n)` or `O(1)` if modified in-place |
| Equilibrium Index | `O(n)` | `O(1)` |
| Two Sum Brute Force | `O(n^2)` | `O(1)` |
| Two Sum With HashMap | `O(n)` | `O(n)` |

## Improvement Tasks

- Rename `EquillibriumIdx` to `EquilibriumIdx` for correct spelling.
- Add index validation in range sum queries.
- Try the optimized prefix sum version of range sum query.
- Try the `HashMap` optimized version of two sum.
- Return or print a clear message when no two sum pair exists.
