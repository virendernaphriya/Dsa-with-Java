# Week 5 Day 6 - Rotate Matrix and Spiral Matrix Revision

## Problems Covered

1. Rotate matrix by 90 degrees.
2. Spiral matrix traversal.

## 1. Rotate Matrix by 90 Degrees

### Problem

Given a square matrix, rotate it by 90 degrees clockwise in place.

For example:

```text
Input:
1 2 3
4 5 6
7 8 9

Output:
7 4 1
8 5 2
9 6 3
```

### Optimal Approach

Use the matrix itself to rotate the values without extra space.

Core idea:

- Transpose the matrix by swapping `arr[i][j]` with `arr[j][i]` for `j > i`.
- Reverse each row after transposition.

Complexity:

- Time: `O(n^2)`
- Space: `O(1)`

### Brute Force Approach

Create a new matrix and fill it with rotated values using the formula:

- `newArr[j][n-1-i] = arr[i][j]`

Complexity:

- Time: `O(n^2)`
- Space: `O(n^2)`

## 2. Spiral Matrix Traversal

### Problem

Traverse a matrix in spiral order and output the elements in the spiral sequence.

For example:

```text
Input:
1  2  3  4
5  6  7  8
9 10 11 12

Output:
1,2,3,4,8,12,11,10,9,5,6,7
```

### Approach

Use boundary pointers: `top`, `bottom`, `left`, and `right`.

Core idea:

- Traverse from left to right across the top row.
- Traverse from top to bottom down the right column.
- Traverse from right to left across the bottom row, if still valid.
- Traverse from bottom to top up the left column, if still valid.
- Shrink the boundaries after each pass.

Complexity:

- Time: `O(n * m)`
- Space: `O(n * m)` for output list

## Quick Revision

| Problem | Best Approach |
| --- | --- |
| Rotate matrix 90° | Transpose the matrix, then reverse each row |
| Spiral matrix traversal | Use `top`, `bottom`, `left`, and `right` boundaries and shrink them after each layer |
