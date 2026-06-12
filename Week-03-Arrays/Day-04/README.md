# Week 03 - Arrays: Day 04

Day 04 focuses on array searching and occurrence-counting problems. The solutions mainly use simple linear traversal, early return, helper methods, and nested loops for frequency-based problems.

## Problems Covered

1. Linear search in an array.
2. Find the first occurrence of an element.
3. Find the last occurrence of an element.
4. Count the occurrence of a target element.
5. Find the frequency of each unique element.
6. Print duplicate elements only once.

## 1. Linear Search

File: `LinearSearch.java`

### Problem

Check whether a target element exists in the array. If it exists, print its index.

Example:

```java
int target = 7;
int arr[] = { 2, 4, 3, 6, 7, 9, 1 };
```

Output:

```text
7 is present at idx 4
```

### Approach Used

The solution uses linear search.

Steps:

1. Start from index `0`.
2. Compare each element with the target.
3. If the target is found, print the index and use `return` to stop the program.
4. If the loop finishes without finding the target, print that the element does not exist.

### Key Point

The `return` statement is used for early exit. Once the target is found, there is no need to check the remaining elements.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## 2. First Occurrence

File: `FirstOccurence.java`

### Problem

Find the first index where a given element appears in the array.

Example:

```java
int arr[] = { 2, 3, 4, 9, 4 };
int n = 4;
```

Output:

```text
2
```

### Approach Used

The solution uses a helper method:

```java
static int getFirstOcc(int[] arr, int n)
```

Steps:

1. Traverse the array from left to right.
2. Compare each element with `n`.
3. Return the index immediately when the first match is found.
4. If no match is found, return `-1`.

### Key Point

Since the loop starts from the beginning, the first matching index is automatically the first occurrence.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## 3. Last Occurrence

File: `LastOccurence.java`

### Problem

Find the last index where a given element appears in the array.

Example:

```java
int arr[] = { 2, 1, 4, 5, 6, 5, 4 };
int n = 5;
```

Output:

```text
5
```

### Approach Used

The solution uses a helper method:

```java
static int getLastOcc(int[] arr, int n)
```

Steps:

1. Start traversal from the last index, `arr.length - 1`.
2. Move backwards until index `0`.
3. Return the index immediately when the element is found.
4. If the element is not present, return `-1`.

### Key Point

Since the loop starts from the end, the first match found while moving backward is the last occurrence in the original array.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## 4. Count Occurrence of an Element

File: `CountOccurence.java`

### Problem

Count how many times a target element appears in the array.

Example:

```java
int[] arr = { 2, 3, 4, 3, 3, 5, 2, 0, 3 };
```

In the current code, the method is called for `9`, so the output is:

```text
0
```

### Approach Used

The solution uses a helper method:

```java
static int getOccurence(int[] arr, int n)
```

Steps:

1. Initialize `count = 0`.
2. Traverse the full array.
3. Whenever `arr[i] == n`, increase `count`.
4. Return the final count.

### Key Point

Unlike first occurrence and last occurrence, this problem should not stop early. The full array must be checked to count all matches.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## 5. Frequency of Each Unique Element

File: `FrequencyOfEl.java`

### Problem

Print every unique element with the number of times it appears.

Example:

```java
int[] arr = { 3, 4, 2, 4, 2, 2 };
```

Output:

```text
3 Exists in the array with freq 1
4 Exists in the array with freq 2
2 Exists in the array with freq 3
```

### Approach Used

The solution uses nested loops with an `alreadyChecked` flag.

Steps:

1. Pick each element using the outer loop.
2. Before counting it, check whether the same element appeared before the current index.
3. If it appeared earlier, skip it using `continue`.
4. If it is being processed for the first time, run another loop over the full array.
5. Count all matching values.
6. Print the element and its frequency.

### Why `alreadyChecked` Is Needed

Without this check, repeated elements would print their frequency again and again.

For example, `2` appears three times, but its frequency should be printed only once.

### Complexity

- Time Complexity: `O(n^2)`
- Space Complexity: `O(1)`

## 6. Print Duplicate Elements

File: `DuplicateEl.java`

### Problem

Print only the elements that appear more than once, and print each duplicate only one time.

Example:

```java
int[] arr = { 2, 4, 3, 5, 3, 4 };
```

Output:

```text
4
3
```

### Approach Used

The solution uses a frequency-counting helper method:

```java
static int checkFrequencyCount(int[] arr, int n)
```

Steps:

1. Traverse each element of the array.
2. Check whether the current element was already processed earlier.
3. If it was already processed, skip it.
4. If it is being checked for the first time, count its total frequency using `checkFrequencyCount`.
5. If the count is greater than `1`, print the element.

### Why This Prints Duplicates Only Once

The previous-index check avoids printing the same duplicate again.

For example:

```java
{ 2, 4, 3, 5, 3, 4 }
```

- `4` is printed when it is first processed.
- The next `4` is skipped because it was already checked.
- `3` is printed when it is first processed.
- The next `3` is skipped because it was already checked.

### Complexity

- Time Complexity: `O(n^2)`
- Space Complexity: `O(1)`

## Main Concepts Practiced

- Linear search
- Early return after finding an answer
- Returning `-1` when an element is not found
- Traversing from left to right
- Traversing from right to left
- Counting occurrences with a loop
- Avoiding repeated output using an `alreadyChecked` flag
- Using helper methods to separate logic from `main`

## Complexity Summary

| Problem | Time Complexity | Space Complexity |
| --- | --- | --- |
| Linear Search | `O(n)` | `O(1)` |
| First Occurrence | `O(n)` | `O(1)` |
| Last Occurrence | `O(n)` | `O(1)` |
| Count Occurrence | `O(n)` | `O(1)` |
| Frequency of Each Element | `O(n^2)` | `O(1)` |
| Duplicate Elements | `O(n^2)` | `O(1)` |

## Possible Optimized Approach

For frequency and duplicate problems, a `HashMap` can make counting faster.

- Store each array element as a key.
- Store its frequency as the value.
- Traverse the map to print frequencies or duplicates.

Using a `HashMap` gives `O(n)` time complexity, but it needs `O(n)` extra space.
