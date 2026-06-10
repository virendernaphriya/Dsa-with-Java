# Week 3 - Day 3: Array Rearrangement Problems

This day focused on in-place array modification using index movement, swapping, and shifting. The main idea across all problems was to avoid extra arrays and solve the task by carefully controlling pointers.

## Problems Covered

- Rotate array by 1 position
- Separate even and odd numbers
- Move zeroes to the start

## 1. Rotate Array By 1

File: `RotateArrBy1.java`

### Problem

Rotate the array by one position.

- Right rotation: last element comes to the first position.
- Left rotation: first element goes to the last position.

Example:

```text
Input:  [1, 2, 3, 4, 5]
Left:   [2, 3, 4, 5, 1]
Right:  [5, 1, 2, 3, 4]
```

### Approach Followed

For right shift:

1. Store the last element in a variable.
2. Move every element one step to the right, starting from the end.
3. Put the stored last element at index `0`.

For left shift:

1. Store the first element in a variable.
2. Move every element one step to the left.
3. Put the stored first element at the last index.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

### Feedback

- Good use of temporary variable before overwriting array values.
- The loop direction is correct in both rotations.
- Method name `LeftShift` should ideally be `leftShift` to follow Java naming conventions.
- Add a guard for empty arrays before accessing `arr[0]` or `arr[arr.length - 1]`.
- For cleaner practice, keep rotation logic and printing logic separate.

## 2. Separate Even and Odd Numbers

File: `SeperateEvenOdd.java`

### Problem

Rearrange the array so that even numbers come before odd numbers.

Example:

```text
Input:  [2, 3, 5, 6, 8, 1]
Output: [2, 8, 6, 5, 3, 1]
```

The exact order does not need to stay the same in this approach.

### Approach Followed

You used a two-pointer style approach:

1. Start `i` from the beginning.
2. Start `last` from the end.
3. If `arr[i]` is odd, swap it with `arr[last]` and move `last` backward.
4. If `arr[i]` is even, move `i` forward.
5. Stop when both pointers meet.

This treats the task as either:

- Move evens to the start.
- Move odds to the end.

Both views are correct.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

### Feedback

- Nice pointer-based solution; it avoids creating another array.
- This approach is not stable, meaning original order of even and odd numbers may change. That is fine unless the problem asks to preserve order.
- File/class name has a spelling mistake: `SeperateEvenOdd` should be `SeparateEvenOdd`.
- Condition `while (i < last)` works here, but `while (i <= last)` is also common when every index must be explicitly checked.

## 3. Move Zeroes To Start

File: `MoveZerosToStart.java`

### Problem

Move all zeroes to the beginning of the array.

Example:

```text
Input:  [0, 4, 5, 0, 3, 0, 0]
Output: [0, 0, 0, 0, 3, 5, 4]
```

The relative order of non-zero values is not preserved in your current swap-based approach.

### Approach Followed

You used two pointers:

1. `start` tracks the position where the next zero should be placed.
2. `i` starts from the end of the array.
3. If `arr[i] == 0`, swap it with `arr[start]` and move `start` forward.
4. If `arr[i] != 0`, move `i` backward.
5. Continue until `i` and `start` meet.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

### Feedback

- Good in-place logic for grouping zeroes at the start.
- Since swapping with the front can change the order of non-zero elements, mention that this is an unordered rearrangement approach.
- If the problem asks to keep non-zero order, use a stable write-index approach instead.
- Current logic works well for arrays with multiple zeroes, all zeroes, and no zeroes.

## Common Pattern Learned

These problems all use one of two array patterns:

1. Shifting pattern:
   - Save one value.
   - Shift the remaining values in the correct direction.
   - Place the saved value back.

2. Two-pointer swap pattern:
   - Keep one pointer for the target region.
   - Keep another pointer for scanning or boundary control.
   - Swap when an element belongs in the other region.

## Revision Checklist

- Can I explain why right rotation loops from the end?
- Can I explain why left rotation loops from the start?
- Can I separate even and odd numbers without extra space?
- Do I know whether my solution preserves order or not?
- Can I identify the time and space complexity?
- Did I handle edge cases like empty array, single element, all zeroes, no zeroes, all even, and all odd?

## Improvement Tasks

- Rename `SeperateEvenOdd` to `SeparateEvenOdd`.
- Rename `LeftShift` to `leftShift`.
- Add helper methods for printing arrays.
- Add empty-array checks in rotation methods.
- Try stable versions of:
  - Separate even and odd numbers.
  - Move zeroes to the start.
