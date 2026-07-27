# Week 5 Day 1 - Majority Element Revision

## Problem Covered

1. Find the majority element in an array.
2. Find the maximum subarray sum using Kadane's Algorithm and print the subarray.

## Majority Element

### Concept

A majority element is an element that appears more than `n / 2` times in an array, where `n` is the array length.

Example:

```java
int arr[] = {2, 2, 1, 1, 1, 2, 2};
```

Answer:

```text
2
```

Because `2` appears `4` times and `4 > 7 / 2`.

### Brute Force Logic

- Pick each element one by one.
- Count how many times it appears in the array.
- If its count is greater than `n / 2`, return that element.
- If no such element exists, return `-1`.

### Code Pattern

```java
for (int i = 0; i < arr.length; i++) {
    int count = 0;

    for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            count++;
        }
    }

    if (count > arr.length / 2) {
        return arr[i];
    }
}
```

### Better Logic Using HashMap

- Store the frequency of every element in a `HashMap`.
- Traverse the map and check which element has frequency greater than `n / 2`.
- Return that element if found.

### Code Pattern

```java
HashMap<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < arr.length; i++) {
    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
}

for (int key : map.keySet()) {
    if (map.get(key) > arr.length / 2) {
        return key;
    }
}
```

### Optimal Logic Using Moore's Voting Algorithm

- Keep one candidate element and one counter.
- If the counter becomes `0`, choose the current element as the new candidate.
- Increase the counter when the current element matches the candidate.
- Decrease the counter when it does not match.
- Verify the final candidate by counting its actual frequency.

### Code Pattern

```java
int el = arr[0];
int count = 0;

for (int i = 0; i < arr.length; i++) {
    if (count == 0) {
        el = arr[i];
    }

    if (arr[i] == el) {
        count++;
    } else {
        count--;
    }
}
```

### Complexity

- Brute Force Time Complexity: `O(n^2)`
- HashMap Time Complexity: `O(n)`
- HashMap Space Complexity: `O(n)`
- Moore's Voting Time Complexity: `O(n)`
- Moore's Voting Space Complexity: `O(1)`

## Quick Revision Table

| Approach | Time Complexity | Space Complexity | Key Point |
| --- | --- | --- | --- |
| Brute Force | `O(n^2)` | `O(1)` | Count frequency for every element |
| HashMap | `O(n)` | `O(n)` | Store element frequencies |
| Moore's Voting Algorithm | `O(n)` | `O(1)` | Cancel different elements and verify candidate |

## Common Mistakes

- Forgetting that majority means more than `n / 2`, not equal to `n / 2`.
- Not verifying the candidate after Moore's Voting Algorithm.
- Initializing the counter incorrectly and skipping the first element.
- Returning a candidate even when no majority element exists.

## Kadane's Algorithm

### Concept

Kadane's Algorithm is used to find the maximum sum of a continuous subarray.

Example:

```java
int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
```

Maximum sum subarray:

```text
4 -1 2 1
```

Maximum sum:

```text
6
```

### Logic

- Keep adding elements into a running `sum`.
- Update `maxSum` whenever the current `sum` becomes greater.
- If `sum` becomes negative, reset it to `0`.
- Track `start` when a new subarray begins.
- Track `end` whenever `maxSum` is updated.
- Print elements from `start` to `end` to show the maximum sum subarray.

### Code Pattern

```java
int maxSum = Integer.MIN_VALUE;
int sum = 0;
int start = -1;
int end = -1;

for (int i = 0; i < arr.length; i++) {
    if (sum == 0) {
        start = i;
    }

    sum += arr[i];

    if (sum > maxSum) {
        maxSum = sum;
        end = i;
    }

    if (sum < 0) {
        sum = 0;
    }
}
```

### Printing The Maximum Sum Subarray

```java
for (int i = start; i <= end; i++) {
    System.out.print(arr[i] + " ");
}
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Kadane's Quick Revision Table

| Problem | Best Approach | Key Point |
| --- | --- | --- |
| Maximum subarray sum | Kadane's Algorithm | Reset sum when it becomes negative |
| Print maximum sum subarray | Track `start` and `end` indexes | Print array from `start` to `end` |

## Files

- `MajorityElement.java`
- `KedansAlgo.java`
