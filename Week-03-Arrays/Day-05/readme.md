# Week 03 - Arrays & Hashing: Day 05

Day 05 focuses on Frequency Arrays and the introduction to Hashing using HashMap. The problems mainly use frequency counting, key-value storage, and traversal of HashMaps to solve counting-based questions efficiently.

## Problems Covered

1. Frequency of elements
2. Count distinct elements
3. Find duplicate elements
4. Find unique elements
5. Find the most frequent element
6. Find the least frequent element
7. Majority element

---

## 1. Frequency of Elements

**File:** `FrequencyOfElHashMap.java`

### Problem

Print each element along with the number of times it appears in the array.

### Example

```java
int[] arr = {2, 4, 5, 4, 3, 2};
```

### Output

```text
2 -> 2
4 -> 2
5 -> 1
3 -> 1
```

### Approach Used

1. Create a HashMap.
2. Traverse the array.
3. For every element, increase its frequency using `getOrDefault()`.
4. Traverse the HashMap and print frequencies.

### Key Point

HashMap stores:

```text
Element -> Frequency
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(k)`

where `k` is the number of distinct elements.

---

## 2. Count Distinct Elements

**File:** `DistinctEl.java`

### Problem

Count how many distinct elements exist in the array.

### Example

```java
int[] arr = {2, 3, 4, 2, 4, 5};
```

Distinct Elements:

```text
2, 3, 4, 5
```

Output:

```text
4
```

### Approach Used

1. Create a HashMap.
2. Store frequencies of all elements.
3. Return `map.size()`.

### Key Point

The size of the HashMap equals the number of distinct elements because every key is unique.

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(k)`

---

## 3. Find Duplicate Elements

**File:** `FindDuplicate.java`

### Problem

Print all elements that appear more than once.

### Example

```java
int[] arr = {12, 3, 4, 4, 53, 3};
```

### Output

```text
Duplicate 3
Duplicate 4
```

### Approach Used

1. Build a frequency map.
2. Traverse the HashMap.
3. Print keys whose frequency is greater than `1`.

### Key Point

An element is considered a duplicate if:

```java
frequency > 1
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(k)`

---

## 4. Find Unique Elements

**File:** `FindUniqueEl.java`

### Problem

Print all elements that appear exactly once.

### Example

```java
int[] arr = {3, 5, 4, 7, 6, 5};
```

### Output

```text
Unique num 3
Unique num 4
Unique num 7
Unique num 6
```

### Approach Used

1. Build a frequency map.
2. Traverse the HashMap.
3. Print keys whose frequency is exactly `1`.

### Key Point

A unique element appears only once.

```java
frequency == 1
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(k)`

---

## 5. Most Frequent Element

**File:** `MostFrequentEl.java`

### Problem

Find the element with the highest frequency.

### Example

```java
int[] arr = {2, 4, 3, 5, 3, 5, 6, 3};
```

### Output

```text
3
```

### Approach Used

1. Build a frequency map.
2. Maintain:

```java
int maxFreq;
int answer;
```

3. Traverse the HashMap.
4. Update whenever a larger frequency is found.

### Key Point

```java
if(map.get(key) > maxFreq)
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(k)`

---

## 6. Least Frequent Element

**File:** `LeastFrequent.java`

### Problem

Find the element with the lowest frequency.

### Example

```java
int[] arr = {2, 4, 3, 5, 3, 5, 6, 3};
```

### Output

```text
2
```

### Approach Used

1. Build a frequency map.
2. Maintain:

```java
int minFreq;
int answer;
```

3. Traverse the HashMap.
4. Update whenever a smaller frequency is found.

### Key Point

```java
if(map.get(key) < minFreq)
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(k)`

---

## 7. Majority Element

**File:** `MajorityEl.java`

### Problem

Find the element that appears more than `n / 2` times.

### Example

```java
int[] arr = {2, 2, 1, 1, 1, 2, 2};
```

### Output

```text
2
```

### Approach Used

1. Build a frequency map.
2. Calculate:

```java
int limit = arr.length / 2;
```

3. Traverse the HashMap.
4. Return the element whose frequency is greater than the limit.

### Key Point

A majority element must satisfy:

```java
frequency > n / 2
```

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(k)`

---

## Main Concepts Practiced

- Introduction to Hashing
- HashMap in Java
- Frequency counting
- Using `getOrDefault()`
- Storing key-value pairs
- Finding maximum frequency
- Finding minimum frequency
- Counting distinct elements
- Detecting duplicates
- Detecting unique elements
- Majority element detection

---

## Important HashMap Pattern

This pattern was used in almost every problem:

```java
HashMap<Integer, Integer> map = new HashMap<>();

for(int num : arr){
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```

### Meaning

```text
Key   = Element
Value = Frequency
```

---

## Distinct vs Unique

### Distinct Elements

All different values present in the array.

Example:

```java
{2,3,4,2,4,5}
```

Distinct:

```text
2,3,4,5
```

Count:

```text
4
```

### Unique Elements

Elements whose frequency is exactly `1`.

Example:

```java
{2,3,4,2,4,5}
```

Unique:

```text
3,5
```

Count:

```text
2
```

---

## Complexity Summary

| Problem | Time Complexity | Space Complexity |
|----------|----------|----------|
| Frequency of Elements | `O(n)` | `O(k)` |
| Count Distinct Elements | `O(n)` | `O(k)` |
| Find Duplicate Elements | `O(n)` | `O(k)` |
| Find Unique Elements | `O(n)` | `O(k)` |
| Most Frequent Element | `O(n)` | `O(k)` |
| Least Frequent Element | `O(n)` | `O(k)` |
| Majority Element | `O(n)` | `O(k)` |

---

## Why Hashing is Better

Before HashMaps, frequency problems were solved using nested loops.

```java
for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
        ...
    }
}
```

Complexity:

```text
O(n²)
```

Using a HashMap:

```java
HashMap<Integer, Integer>
```

Complexity becomes:

```text
O(n)
```

which is significantly faster for large inputs.

---

## Day 05 Key Takeaway

Whenever a problem contains words like:

- Frequency
- Count occurrences
- Duplicate
- Unique
- Most frequent
- Least frequent
- Majority element

Think immediately:

```java
HashMap<Integer, Integer>
```

Build a frequency map first and then apply the required condition.

This is one of the most important patterns in Data Structures and Algorithms and appears frequently in coding interviews.