# Week 5 Day 5 - Set Matrix Zero Revision

## Problems Covered

1. Set matrix zeroes.

## 1. Set Matrix Zero

### Problem

Given a matrix, if any element is `0`, set its entire row and column to `0`.

Example:

```text
Input:
1 1 1
1 0 1
1 1 1

Output:
1 0 1
0 0 0
1 0 1
```

The `0` at the center makes its full row and full column zero.

### Brute Force Approach 1

In `SetMatrixZero.java`, `setMatrixZeroBrute` stores all zero rows and zero columns in sets.

Core idea:

- Traverse the whole matrix.
- Whenever `arr[i][j] == 0`, store row `i` and column `j`.
- Traverse stored rows and make them zero.
- Traverse stored columns and make them zero.

Complexity:

- Time: `O(n * m)`
- Space: `O(n + m)` for storing row and column indexes

### Brute Force Approach 2

`setMatrixZeroBrute2` marks affected cells with `-1` first and later converts them to `0`.

Core idea:

- Traverse the matrix.
- When a zero is found, mark its row and column with `-1`.
- Do not overwrite original zeroes while marking.
- Convert every `-1` into `0` at the end.

Limitation:

- This works only when the matrix does not contain negative values.
- If `-1` already exists in the matrix, it can be confused with a marked cell.

Complexity:

- Time: `O((n * m) * (n + m))` in the worst case
- Space: `O(1)`

### Better Approach

`setMatrixZeroBetter` uses two extra arrays to remember which rows and columns should become zero.

Core idea:

- Create one row marker array and one column marker array.
- During traversal, mark the row and column of every zero.
- Traverse again and set `arr[i][j] = 0` if its row or column is marked.

Complexity:

- Time: `O(n * m)`
- Space: `O(n + m)`

### Optimal Approach

`setMatrixZeroOptimal` uses the first row and first column of the matrix as marker storage.

Core idea:

- Use `arr[i][0]` to mark whether row `i` should become zero.
- Use `arr[0][j]` to mark whether column `j` should become zero.
- Use a separate variable `col0` to track whether the first column should become zero.
- Update the inner matrix first.
- Update the first row and first column at the end.

This avoids extra row and column arrays.

Complexity:

- Time: `O(n * m)`
- Space: `O(1)`

## Quick Revision

| Problem | Basic Approach | Best Approach |
| --- | --- | --- |
| Set matrix zeroes | Store zero rows and columns, or mark cells with `-1` | Use first row and first column as markers |

## Revision Focus

- Do not directly zero rows and columns while scanning, because it can create extra zeroes.
- The marker value approach is risky if the matrix can already contain that marker value.
- Extra row and column arrays reduce the solution to `O(n * m)` time.
- The optimal solution stores marker information inside the matrix itself.
- `col0` is needed because `arr[0][0]` cannot represent both the first row and first column at the same time.
