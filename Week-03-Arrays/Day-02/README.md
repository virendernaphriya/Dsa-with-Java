# Week 3 - Day 2: Array Searching And Min/Max Problems

Quick revision notes for basic array problems using linear traversal and comparisons.

## What I Learned

- Most array min/max problems can be solved by scanning the array once.
- Use `arr[0]` as the initial answer when the array is non-empty.
- Use `Integer.MIN_VALUE` when searching for maximum-like answers.
- Use `Integer.MAX_VALUE` when searching for minimum-like answers.
- Use `return` to stop searching early when the required element is found.
- Use `Math.abs()` when only the positive difference matters.
- Nested loops compare every pair of elements, but they usually cost `O(n^2)`.
- For second largest and second smallest, keep two variables: best and second best.
- Duplicate values need special handling when the question asks for the second distinct value.

## Core Pattern: Traverse And Update Answer

```text
int answer = arr[0];

for (int i = 0; i < arr.length; i++) {
    if (arr[i] better than answer) {
        answer = arr[i];
    }
}
```

This pattern is used in largest, smallest, maximum difference, and many future array problems.

## Find Largest Element

```java
int max = arr[0];

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

Time complexity: `O(n)`

Space complexity: `O(1)`

## Find Smallest Element

```java
int min = arr[0];

for (int i = 0; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
}
```

Time complexity: `O(n)`

Space complexity: `O(1)`

## Find Second Largest Element

Keep track of both `max` and `secMax`.

```java
int max = Integer.MIN_VALUE;
int secMax = Integer.MIN_VALUE;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
        secMax = max;
        max = arr[i];
    } else if (arr[i] < max && arr[i] > secMax) {
        secMax = arr[i];
    }
}
```

Important idea:

- If a new maximum is found, old `max` becomes `secMax`.
- If current value is smaller than `max` but greater than `secMax`, update `secMax`.
- `arr[i] < max` avoids counting duplicate maximum as second largest.

Time complexity: `O(n)`

Space complexity: `O(1)`

## Find Second Smallest Element

Keep track of both `min` and `secMin`.

```java
int min = Integer.MAX_VALUE;
int secMin = Integer.MAX_VALUE;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] < min) {
        secMin = min;
        min = arr[i];
    } else if (arr[i] > min && arr[i] < secMin) {
        secMin = arr[i];
    }
}
```

Important idea:

- If a new minimum is found, old `min` becomes `secMin`.
- If current value is greater than `min` but smaller than `secMin`, update `secMin`.
- `arr[i] > min` avoids counting duplicate minimum as second smallest.

Time complexity: `O(n)`

Space complexity: `O(1)`

## Brute Force Vs Optimized

### Brute Force Second Smallest

Find minimum in one loop, then find the smallest value except that minimum in another loop.

Time complexity: `O(n + n)`, which becomes `O(n)`

Space complexity: `O(1)`

### Optimized Second Smallest

Maintain `min` and `secMin` in the same loop.

Time complexity: `O(n)`

Space complexity: `O(1)`

Even when both are `O(n)`, the optimized version is cleaner because it scans the array only once.

## Find Maximum Difference

For the version practiced here, maximum difference means:

```java
maximum element - minimum element
```

```java
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }

    if (arr[i] < min) {
        min = arr[i];
    }
}

int maxDiff = max - min;
```

Time complexity: `O(n)`

Space complexity: `O(1)`

## Find Minimum Difference

Compare every pair and keep the smallest absolute difference.

```java
int minDiff = Integer.MAX_VALUE;

for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        int diff = Math.abs(arr[i] - arr[j]);

        if (diff < minDiff) {
            minDiff = diff;
        }
    }
}
```

Why `j = i + 1`?

- It avoids comparing an element with itself.
- It avoids checking the same pair twice.

Time complexity: `O(n^2)`

Space complexity: `O(1)`

Future optimization idea:

- Sort the array first.
- Then compare only adjacent elements.
- Time complexity becomes `O(n log n)` because sorting dominates.

## Check Whether An Element Exists

This is a linear search.

```java
int target = 45;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println(target + " exists at idx " + i);
        return;
    }
}

System.out.println("Element does not exist in the arr");
```

Important idea:

- If the element is found, `return` exits `main()` immediately.
- If the loop finishes, it means the element was not found.

Time complexity:

- Best case: `O(1)` when target is at first index.
- Worst case: `O(n)` when target is at last index or missing.

Space complexity: `O(1)`

## Edge Cases To Remember

- Empty array: `arr[0]` will cause an error.
- Array with one element: second largest and second smallest do not exist.
- All elements same: second distinct largest or smallest does not exist.
- Negative numbers: `Integer.MIN_VALUE` and `Integer.MAX_VALUE` initialization is safer.
- Duplicates: decide whether the problem wants second distinct value or second position-based value.

## Files Practiced

| File | Concept |
| --- | --- |
| `FindLargestEl.java` | Find maximum element using linear traversal |
| `FindSmallestEl.java` | Find minimum element using linear traversal |
| `SecondLargest.java` | Find second distinct largest using two variables |
| `SecondSmallest.java` | Brute force and optimized second distinct smallest |
| `MaxDifference.java` | Find `max - min` in one traversal |
| `MinDifference.java` | Find minimum pair difference using nested loops |
| `IsExists.java` | Linear search with early return |

## Revision Checklist

- [ ] Can I find largest and smallest elements in one loop?
- [ ] Can I explain why `arr[0]` is used as an initial value?
- [ ] Can I use `Integer.MIN_VALUE` and `Integer.MAX_VALUE` correctly?
- [ ] Can I find second largest using `max` and `secMax`?
- [ ] Can I find second smallest using `min` and `secMin`?
- [ ] Can I handle duplicate values correctly?
- [ ] Can I calculate maximum difference as `max - min`?
- [ ] Can I compare every pair using nested loops?
- [ ] Can I use `Math.abs()` for positive difference?
- [ ] Can I perform linear search and stop early using `return`?
