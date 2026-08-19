# Fast and Slow Pointers

## 1. What is this pattern?
One pointer reads every item while another writes the next item that should remain.

## 2. Why do we need this pattern?
Building a second filtered array uses `O(n)` memory. In-place compaction uses `O(1)` extra space.

## 3. Core Intuition
```text
read -> scans all positions
write -> marks next valid output position
[keep, remove, keep, keep] -> [keep, keep, keep, ...]
```

## 4. Visual Explanation
The prefix before `write` is always valid; the region from `write` to `read` is not yet processed.

## 5. Step-by-Step Working
Read a value, test the condition, write it at `write` when valid, then advance `write`.

## 6. Pattern Recognition
Remove/filter/keep values in place, sorted deduplication, or compact non-zero elements.

## 7. Brute Force Approach
Copy valid values to another array: `O(n)` time and `O(n)` space.

## 8. Optimized Approach
Read and write in one array: `O(n)` time and `O(1)` space.

## 9. Java Template
```java
int write = 0;
for (int read = 0; read < values.length; read++) {
    if (shouldKeep(values[read])) values[write++] = values[read];
}
```

## 10. Dry Run
For `[3,2,2,3]`, removing `3` writes `2` at index `0`, then `2` at index `1`; result length is `2`.

## 11. Time Complexity
`O(n)`.

## 12. Space Complexity
`O(1)` auxiliary space.

## 13. Common Mistakes
Returning the wrong logical length, reading overwritten data, and assuming the suffix must be zeroed.

## 14. Edge Cases
Empty input, all removed, none removed, one item, and repeated values.

## 15. Variations
Stable versus unstable compaction, remove at most `k` duplicates, partition around a pivot.

## 16. Complete Question Bank
### Beginner / Easy
Remove element, remove duplicates, move zeroes, merge filtered values.
### Easy+
Remove duplicates at most twice, move negatives, compress sorted runs.
### Medium
Partition array, remove intervals in place, stable filtering.
### Medium+
Three-way partition and bounded duplicate retention.
### Hard
In-place transformations with strict stability and multiple predicates.
### Interview Variations
Return the new length, preserve order, minimize writes, or allow arbitrary suffix content.

## 17. Problem-to-Pattern Mapping
Remove Duplicates -> Fast/Slow -> sorted neighbors identify whether the next write is unique. Remove Element -> Fast/Slow -> write only non-target values.

## 18. Related Patterns
Two Pointers, Sorting, Cyclic Sort, and Partitioning.
