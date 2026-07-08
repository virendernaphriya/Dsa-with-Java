# Week 4 - Day 3: Union and Intersection of Arrays

Quick revision notes for union and intersection problems.

## Problems Covered

| File | Problem | Approaches In Code | Best According To Code |
| --- | --- | --- | --- |
| `UnionOf2SortedArr.java` | Union of two sorted arrays | Brute force using `HashSet`, two-pointer approach | Two-pointer approach |
| `IntersectionOf2SortedArr.java` | Intersection of two sorted arrays | Brute force using visited array, two-pointer approach | Two-pointer approach |
| `IntersectionOf2Arr.java` | Intersection of two unsorted arrays | HashSet approach | HashSet approach |

## 1. Union of Two Sorted Arrays

### Brute Force Approach Used

Put all elements from both arrays into a `HashSet`.

Steps:

- Add every element of `arr1` into the set.
- Add every element of `arr2` into the set.
- Copy set elements into a new array.

Important note:

- `HashSet` removes duplicates.
- `HashSet` does not guarantee sorted order.

Complexity:

- Time: `O(n + m)`
- Space: `O(n + m)`

### Best Approach Used: Two Pointers

This works because both arrays are sorted.

Core idea:

- Use `i` for `arr1` and `j` for `arr2`.
- Add the smaller value to the answer.
- Skip duplicates by checking whether the value is already present in the list.
- After one array ends, add remaining unique elements from the other array.

Example:

```text
arr1: 1 2 2 3 3 5
arr2: 2 3 4 4 5 6
union: 1 2 3 4 5 6
```

Complexity according to current code:

- Time: `O((n + m) * k)` because `list.contains()` is used
- Space: `O(n + m)` for the answer list

Revision note:

- If you compare with the last added element instead of using `list.contains()`, the sorted union can be done in `O(n + m)` time.

## 2. Intersection of Two Sorted Arrays

### Brute Force Approach Used

Compare elements of `arr1` with elements of `arr2` and use a `visited` array to avoid reusing the same element from `arr2`.

Steps:

- For every element in `arr1`, scan `arr2`.
- If equal and not visited, add it to the answer.
- Mark that position as visited.
- Break early if `arr1[i] < arr2[j]` because arrays are sorted.

Complexity:

- Time: `O(n * m)`
- Space: `O(m)` for visited array

### Best Approach Used: Two Pointers

This works because both arrays are sorted.

Core idea:

- If `arr1[i] == arr2[j]`, add the element and move both pointers.
- If `arr1[i] < arr2[j]`, move `i`.
- If `arr1[i] > arr2[j]`, move `j`.

Example:

```text
arr1: 1 2 3 3 4 5 6
arr2: 3 3 4 5
intersection: 3 3 4 5
```

Complexity:

- Time: `O(n + m)`
- Space: `O(min(n, m))` for the answer list

## 3. Intersection of Two Unsorted Arrays

### HashSet Approach Used

This approach finds common unique elements when arrays are not sorted.

Steps:

- Store all elements of `arr1` in a `HashSet`.
- Traverse `arr2`.
- If an element exists in the set, add it to the answer.
- Remove it from the set to avoid duplicate output.

Example:

```text
arr1: 1 2 3 4 5 1 3
arr2: 2 3 6 1
intersection: 2 3 1
```

Complexity:

- Time: `O(n + m)`
- Space: `O(n)`

## Sorted vs Unsorted Choice

| Situation | Best Choice |
| --- | --- |
| Both arrays are sorted and unique output is needed | Two pointers |
| Both arrays are sorted and duplicate matches should be preserved | Two pointers |
| Arrays are unsorted and unique common elements are needed | `HashSet` |
| Need sorted union output | Two pointers, not plain `HashSet` |

## Revision Focus

- Sorted arrays usually point toward the two-pointer approach.
- Unsorted arrays usually need hashing first.
- Union means all unique elements from both arrays.
- Intersection means elements common to both arrays.
- In sorted intersection, move both pointers when values match.
- In unsorted intersection, remove from set after adding to avoid duplicate output.
