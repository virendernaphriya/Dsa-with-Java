# Week 6 Day 1 - Pascal Triangle

## Problem Covered

1. Find the element at a given row and column in Pascal Triangle.
2. Print the `n`th row of Pascal Triangle.
3. Generate Pascal Triangle up to `n` rows.

## Pascal Triangle

### Concept

Pascal Triangle is a triangular arrangement of numbers where:

- The first and last value of every row is `1`.
- Every middle value is the sum of the two values directly above it.
- Row and column based values can be calculated using combinations.

Example for `6` rows:

```text
[[1],
 [1, 1],
 [1, 2, 1],
 [1, 3, 3, 1],
 [1, 4, 6, 4, 1],
 [1, 5, 10, 10, 5, 1]]
```

## Type 1 - Find Element At Row And Column

### Formula

If row number is `n` and column number is `r`, then the element is:

```text
nCr
```

For 1-based row and column indexing, use:

```text
(n - 1)C(r - 1)
```

### Optimized Logic

- Start with `res = 1`.
- Multiply by decreasing values from the row.
- Divide by increasing values from `1` to `r`.
- This avoids calculating full factorials.

### Code Pattern

```java
int res = 1;

for (int i = 0; i < r; i++) {
    res *= n - i;
    res /= i + 1;
}
```

### Complexity

- Time Complexity: `O(r)`
- Space Complexity: `O(1)`

## Type 2 - Print Nth Row

### Logic

- The first value of every row is `1`.
- Use the previous value to calculate the next value.
- For row `n`, calculate every next value using:

```text
next = previous * (n - i) / i
```

### Code Pattern

```java
int ans = 1;
List<Integer> list = new ArrayList<>();
list.add(ans);

for (int i = 1; i < row; i++) {
    ans *= row - i;
    ans /= i;
    list.add(ans);
}
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

## Type 3 - Generate Pascal Triangle

### Logic

- Create an empty list of rows.
- Generate every row from `1` to `n`.
- Add each generated row into the final answer list.

### Code Pattern

```java
List<List<Integer>> list = new ArrayList<>();

for (int i = 1; i <= row; i++) {
    list.add(printNthRow(i));
}
```

### Complexity

- Time Complexity: `O(n^2)`
- Space Complexity: `O(n^2)`

## Quick Revision Table

| Problem | Best Approach | Key Point |
| --- | --- | --- |
| Find element at row and column | Combination formula | Use `(n - 1)C(r - 1)` for 1-based indexing |
| Print nth row | Build from previous value | Avoid factorial calculation |
| Generate triangle | Generate each row one by one | Reuse `printNthRow()` |

## Common Mistakes

- Confusing 0-based and 1-based row or column numbers.
- Using full factorials, which can cause overflow quickly.
- Forgetting that every row starts with `1`.
- Using `row` and `column` directly when the formula needs `row - 1` and `column - 1`.

## Files

- `PascalTriangle.java`
