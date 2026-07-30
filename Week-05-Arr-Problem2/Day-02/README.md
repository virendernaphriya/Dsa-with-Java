# Week 5 Day 2 - Stock Buy/Sell and Rearrange Numbers Revision

## Problems Covered

1. Find maximum profit from one buy and one sell.
2. Rearrange positive and negative numbers alternately when counts are equal.
3. Rearrange positive and negative numbers alternately when counts are not equal.

## 1. Buy And Sell Stock

### Problem

Given an array of stock prices, find the maximum profit possible by buying before selling.

Example:

```text
Input:  7 1 5 3 6 4
Output: 5
```

Buy at `1` and sell at `6`.

### Brute Force Approach

Try every possible pair where buying day comes before selling day.

Steps:

- Pick buying day `i`.
- Pick selling day `j` where `j > i`.
- Calculate `arr[j] - arr[i]`.
- Track the maximum profit.

Complexity:

- Time: `O(n^2)`
- Space: `O(1)`

### Optimal Approach Used

The current code scans from right to left.

Core idea:

- Keep track of the maximum selling price seen on the right side.
- For every price, calculate profit as `max - arr[i]`.
- Update `maxProfit`.
- Update the future selling price using `Math.max(max, arr[i])`.

Complexity:

- Time: `O(n)`
- Space: `O(1)`

## 2. Rearrange Positive and Negative Numbers

### Equal Count Case

In `RearrangeNums.java`, positives are placed at even indexes and negatives are placed at odd indexes.

Pattern:

```text
positive, negative, positive, negative, ...
```

Example:

```text
Input:  3 1 -2 -5 2 -4
Output: 3 -2 1 -5 2 -4
```

Approaches in code:

- Brute force: store positives and negatives in separate `ArrayList`s, then place them back.
- Better version: create a `temp` array and directly place positives at even indexes and negatives at odd indexes.

Complexity:

- Time: `O(n)`
- Space: `O(n)`

## 3. Rearrange When Counts Are Not Equal

In `ReArrangeNumV2.java`, positive and negative numbers are first separated into two lists.

Core idea:

- Alternate positive and negative numbers until the smaller list is finished.
- Add the remaining elements from the larger list at the end.

This handles arrays where positive and negative counts are different.

Complexity:

- Time: `O(n)`
- Space: `O(n)`

## Quick Revision

| Problem | Brute Force / Basic Approach | Best According To Current Code |
| --- | --- | --- |
| Buy and sell stock | Check every buy-sell pair | Scan from right and track future maximum selling price |
| Rearrange equal positives and negatives | Store positives and negatives separately | Place positives at even indexes and negatives at odd indexes |
| Rearrange unequal positives and negatives | Separate into two lists | Alternate until one list ends, then append remaining elements |

## Revision Focus

- For stock profit, selling day must come after buying day.
- Brute force stock solution checks all pairs, so it is `O(n^2)`.
- Optimal stock solution is `O(n)` because it scans once.
- In rearrangement, positive numbers go to even indexes and negative numbers go to odd indexes.
- `ReArrangeNumV2.java` is useful when positive and negative counts are not equal.
