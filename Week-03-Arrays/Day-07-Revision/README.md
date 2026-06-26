# Week 3 - Day 7: Arrays Revision

Quick revision notes for the array problems practiced on Day 7.

## Topics Covered

- Finding the largest element in an array
- Finding the second largest element
- Reversing an array using two pointers
- Left rotation by 1
- Right rotation by 1
- Moving zeroes to the end
- Prefix sum / running sum
- Two sum using brute force
- Missing number from `0` to `n`
- Frequency counting using `HashMap`
- Printing elements that appear only once

## Core Patterns

### 1. Single Traversal

Use one loop when the answer can be built by checking every element once.

Examples:

- Find largest element
- Find second largest element
- Build frequency map
- Move zeroes to end

Time complexity: `O(n)`

### 2. Two Pointers

Use two indexes when working from both sides or when placing elements in a target position.

Examples:

- Reverse array: `first` starts at `0`, `last` starts at `arr.length - 1`
- Move zeroes to end: `first` tracks the next non-zero position

Time complexity: `O(n)`
Space complexity: `O(1)`

### 3. Shifting

Use shifting when rotating array elements by one position.

Left rotation by 1:

- Store the first element
- Shift every element one step left
- Put the stored first element at the end

Right rotation by 1:

- Store the last element
- Shift every element one step right
- Put the stored last element at index `0`

Time complexity: `O(n)`

### 4. Prefix Sum

Prefix sum stores the sum of elements from index `0` to the current index.

Formula:

```java
arr[i] = arr[i] + arr[i - 1];
```

Example:

```text
Original: 1 2 3 4 5
Prefix:   1 3 6 10 15
```

Useful for:

- Running sum
- Range sum queries
- Sum-based array problems

### 5. HashMap Frequency

Use `HashMap<Integer, Integer>` to count how many times each element appears.

Common formula:

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

Useful for:

- Frequency of each element
- Count distinct elements
- Print unique elements
- Find duplicates
- Most frequent element

## Problem Notes

| File | Concept | Main Idea |
| --- | --- | --- |
| `FindLargestEl.java` | Largest element | Track maximum using `Integer.MIN_VALUE` |
| `FindSecoundLargest.java` | Second largest | Track both `max` and `secondLargest` |
| `ReverseArray.java` | Reverse array | Swap first and last using two pointers |
| `RotateArray.java` | Array rotation | Shift elements left or right by 1 |
| `MoveZerosToEnd.java` | Rearrangement | Swap non-zero elements to the front |
| `PrefixSum.java` | Prefix sum | Add previous prefix value to current element |
| `TwoSum.java` | Pair sum | Check every pair using nested loops |
| `MissingNum.java` | Missing number | Compare expected sum with actual sum |
| `FrequencyOfArr.java` | Frequency map | Store element counts in `HashMap` |
| `DistinctEl.java` | Unique elements | Print keys whose frequency is `1` |

## Edge Cases To Remember

- Empty array can break code that directly accesses `arr[0]`.
- Second largest may not exist if all elements are equal.
- Rotation needs special handling for arrays of size `0` or `1`.
- Missing number sum logic works when numbers are from `0` to `n`.
- `HashMap` does not guarantee sorted order while printing keys.
- Brute force two sum takes `O(n^2)` time.

## Quick Complexity Recap

| Problem | Time | Space |
| --- | --- | --- |
| Largest element | `O(n)` | `O(1)` |
| Second largest | `O(n)` | `O(1)` |
| Reverse array | `O(n)` | `O(1)` |
| Rotate by 1 | `O(n)` | `O(1)` |
| Move zeroes to end | `O(n)` | `O(1)` |
| Prefix sum in-place | `O(n)` | `O(1)` |
| Two sum brute force | `O(n^2)` | `O(1)` |
| Frequency using HashMap | `O(n)` | `O(n)` |

## Revision Checklist

- Can I find max and second max in one pass?
- Can I reverse an array without using another array?
- Can I rotate an array by shifting elements?
- Can I explain why prefix sum helps range queries?
- Can I use `getOrDefault()` for frequency counting?
- Can I tell when to use nested loops and when to use a `HashMap`?
