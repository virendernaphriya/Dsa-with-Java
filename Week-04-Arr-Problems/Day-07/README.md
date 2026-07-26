# Week 4 Day 7 - Two Sum and Sort 0s, 1s, and 2s Revision

## Problems Covered

1. Two Sum using brute force.
2. Two Sum using `HashMap`.
3. Sort an array of `0`s, `1`s, and `2`s using counting.
4. Sort an array of `0`s, `1`s, and `2`s using Dutch National Flag algorithm.

## 1. Two Sum

### Concept

Given an array and a target `K`, find two indexes whose values add up to `K`.

Example:

```java
int arr[] = {2, 7, 11, 15};
int k = 9;
```

Answer:

```text
0 1
```

Because:

```text
arr[0] + arr[1] = 2 + 7 = 9
```

### Brute Force Logic

- Use two loops.
- Pick one element using `i`.
- Check all elements after it using `j`.
- If `arr[i] + arr[j] == k`, return both indexes.

### Code Pattern

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == k) {
            return new int[] {i, j};
        }
    }
}
```

### Better Logic Using HashMap

- Store visited elements with their indexes in a `HashMap`.
- For every element, calculate the required value: `k - arr[i]`.
- If the required value already exists in the map, return both indexes.
- Otherwise, store the current element and index.

### Code Pattern

```java
Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < arr.length; i++) {
    int required = k - arr[i];

    if (map.containsKey(required)) {
        return new int[] {i, map.get(required)};
    }

    map.put(arr[i], i);
}
```

### Complexity

- Brute Force Time Complexity: `O(n^2)`
- HashMap Time Complexity: `O(n)`
- HashMap Space Complexity: `O(n)`

## 2. Sort Array Of 0s, 1s, and 2s

### Concept

Given an array containing only `0`, `1`, and `2`, sort it in increasing order.

Example:

```java
int arr[] = {2, 0, 1};
```

Sorted array:

```text
0 1 2
```

### Counting Logic

- Count total `0`s, `1`s, and `2`s.
- Fill the array again using those counts.
- First place all `0`s, then all `1`s, then all `2`s.

### Code Pattern

```java
int count0 = 0;
int count1 = 0;
int count2 = 0;

for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) count0++;
    if (nums[i] == 1) count1++;
    if (nums[i] == 2) count2++;
}
```

### Dutch National Flag Logic

Use three pointers:

- `low`: position where next `0` should go.
- `mid`: current element being checked.
- `high`: position where next `2` should go.

Rules:

- `0` to `low - 1` contains `0`s.
- `low` to `mid - 1` contains `1`s.
- `mid` to `high` is the unsorted part.
- `high + 1` to `n - 1` contains `2`s.

### Code Pattern

```java
int low = 0;
int mid = 0;
int high = arr.length - 1;

while (mid <= high) {
    if (arr[mid] == 0) {
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
        low++;
        mid++;
    } else if (arr[mid] == 1) {
        mid++;
    } else {
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;
        high--;
    }
}
```

### Complexity

- Counting Time Complexity: `O(n)`
- Counting Space Complexity: `O(1)`
- Dutch National Flag Time Complexity: `O(n)`
- Dutch National Flag Space Complexity: `O(1)`

## Quick Revision Table

| Problem | Brute Force / Basic Approach | Best According To Current Code |
| --- | --- | --- |
| Two Sum | Check every pair using nested loops | Use `HashMap` to find required value |
| Sort 0s, 1s, and 2s | Count each value and refill array | Dutch National Flag with `low`, `mid`, and `high` |

## Common Mistakes

- Starting the inner loop from `0` in Two Sum and using the same element twice.
- Forgetting to store the current element in the map after checking for the required value.
- Using Dutch National Flag without keeping `mid <= high` as the loop condition.
- Incrementing `mid` after swapping with `high`; the swapped value still needs to be checked.
- Confusing the pointer ranges in the Dutch National Flag algorithm.

## Files

- `TwoSum.java`
- `SortArrayOf012.java`
