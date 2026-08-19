# Divide and Conquer

## 1. What is this pattern?
Split an array into smaller parts, solve each part, then combine the results.

## 2. Why do we need it?
Balanced splitting enables efficient sorting and counting; merge sort is `O(n log n)` instead of quadratic comparison sorting.

## 3. Core Intuition
Solve easy one-item ranges and combine adjacent sorted ranges.

## 4. Visual Explanation
```text
[4,1,3,2] -> [4,1] [3,2] -> [1,4] [2,3] -> [1,2,3,4]
```

## 5. Step-by-Step Working
Choose a midpoint, recurse on both halves, and merge or combine while preserving the invariant.

## 6. Pattern Recognition
Recursive halves, inversion counts, merge operations, or “combine sorted results”.

## 7. Brute Force Approach
Compare all pairs or repeatedly insert into a sorted structure.

## 8. Optimized Approach
Balanced recursion plus linear combine at each depth.

## 9. Java Template
```java
void sort(int[] values, int left, int right) {
    if (left >= right) return;
    int middle = left + (right - left) / 2;
    sort(values, left, middle);
    sort(values, middle + 1, right);
    merge(values, left, middle, right);
}
```

## 10. Dry Run
Each merge combines two already sorted halves, so each level touches every item once.

## 11. Time Complexity
Usually `O(n log n)`.

## 12. Space Complexity
`O(n)` for merge storage plus recursion stack.

## 13. Common Mistakes
Bad base case, overlapping ranges, and forgetting leftover half during merge.

## 14. Edge Cases
Empty array, one item, duplicates, negatives, and large recursion depth.

## 15. Variations
Counting inversions, reverse pairs, merge sort, and recursive selection.

## 16. Complete Question Bank
### Beginner / Easy
Merge two sorted ranges, recursive maximum.
### Easy+
Merge sort, count smaller elements.
### Medium
Inversion count, reverse pairs.
### Medium+
Count range sums and divide-based geometry.
### Hard
External merge and parallel divide-and-conquer processing.
### Interview Variations
Stable sort, iterative version, memory limits, or return inversion witnesses.

## 17. Problem-to-Pattern Mapping
Inversion Count -> Divide and Conquer -> count cross-half inversions during merge.

## 18. Related Patterns
Sorting, Quickselect, Binary Search, and Dynamic Programming.
