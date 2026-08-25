# Week 6 Day 2 - Majority Element II

## Problem Covered

1. Find all elements that appear more than `n / 3` times in an array.

## Majority Element II

### Concept

An element is a majority element for this problem if its frequency is greater than:

```text
n / 3
```

At most two elements can appear more than `n / 3` times in an array.

Example:

```text
arr = [2, 1, 1, 3, 1, 4, 5, 6]
```

Here, `n = 8`, so an element must appear more than `8 / 3`, which means more than `2` times.

Output:

```text
[1]
```

## Approach 1 - HashMap Frequency Count

### Logic

- Store the frequency of every element in a `HashMap`.
- Whenever an element count becomes `n / 3 + 1`, add it to the answer list.
- Stop early if two majority elements are found.

### Code Pattern

```java
HashMap<Integer, Integer> map = new HashMap<>();
List<Integer> list = new ArrayList<>();

for (int i = 0; i < arr.length; i++) {
    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

    if (map.get(arr[i]) == n / 3 + 1) {
        list.add(arr[i]);
    }

    if (list.size() == 2) {
        break;
    }
}
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

## Approach 2 - Boyer Moore Voting Algorithm

### Logic

- Since there can be at most two answers, keep two candidate elements.
- Maintain separate counts for both candidates.
- If the current element matches a candidate, increase that candidate count.
- If a candidate count is `0`, assign the current element as that candidate.
- If the current element matches neither candidate, decrease both counts.
- After choosing candidates, verify their actual frequencies.

### Code Pattern

```java
int el1 = 0;
int count1 = 0;
int el2 = 0;
int count2 = 0;

for (int i = 0; i < n; i++) {
    if (count1 == 0 && arr[i] != el2) {
        count1 = 1;
        el1 = arr[i];
    } else if (count2 == 0 && arr[i] != el1) {
        count2 = 1;
        el2 = arr[i];
    } else if (arr[i] == el1) {
        count1++;
    } else if (arr[i] == el2) {
        count2++;
    } else {
        count1--;
        count2--;
    }
}
```

### Verification Step

The voting phase only gives possible candidates. Count their actual frequency before adding them to the answer.

```java
if (tCount1 > n / 3) {
    list.add(el1);
}

if (tCount2 > n / 3) {
    list.add(el2);
}
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

## Quick Revision Table

| Approach | Time Complexity | Space Complexity | Key Point |
| --- | --- | --- | --- |
| HashMap | `O(n)` | `O(n)` | Count frequency directly |
| Boyer Moore Voting | `O(n)` | `O(1)` | Track two candidates, then verify |

## Common Mistakes

- Forgetting that the condition is greater than `n / 3`, not greater than or equal to `n / 3`.
- Adding candidates without verifying their final frequency.
- Using only one candidate like Majority Element I.
- Not checking that `el1` and `el2` stay different.
- Forgetting that the answer can contain zero, one, or two elements.

## Files

- `MajorityEl2.java`
