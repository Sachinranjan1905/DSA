# Quickselect

## 1. What is this pattern?
Partition around a pivot and recurse only into the side containing the desired rank.

## 2. Why do we need it?
Full sorting costs `O(n log n)`. Quickselect finds one order statistic in average `O(n)`.

## 3. Core Intuition
After partition, the pivot is in its final sorted position; the other side is irrelevant.

## 4. Visual Explanation
```text
smaller | pivot | larger
only the side containing kth is searched next
```

## 5. Step-by-Step Working
Choose a pivot, partition, compute its rank, and continue left or right.

## 6. Pattern Recognition
Kth smallest/largest, median, percentile, or one order statistic.

## 7. Brute Force Approach
Sort everything: `O(n log n)`.

## 8. Optimized Approach
Average `O(n)` expected time and in-place partitioning.

## 9. Java Template
```java
int target = values.length - k;
int left = 0, right = values.length - 1;
while (left <= right) {
    int pivotIndex = partition(values, left, right);
    if (pivotIndex == target) return values[pivotIndex];
    if (pivotIndex < target) left = pivotIndex + 1;
    else right = pivotIndex - 1;
}
```

## 10. Dry Run
Partition around `4`; if its final index is smaller than the target, discard the left side.

## 11. Time Complexity
Average `O(n)`, worst case `O(n^2)` with poor pivots.

## 12. Space Complexity
`O(1)` iterative; recursion can add stack space.

## 13. Common Mistakes
Wrong rank for kth largest, broken partition loop, and ignoring duplicate pivots.

## 14. Edge Cases
`k=1`, `k=n`, duplicates, one item, and invalid `k`.

## 15. Variations
Random pivots, three-way partition, median, top-k boundary.

## 16. Complete Question Bank
### Beginner / Easy
Kth smallest/largest with sorting baseline.
### Easy+
Median and closest order statistic.
### Medium
Kth largest, top-k partition, weighted rank.
### Medium+
Duplicate-heavy inputs and three-way partition.
### Hard
Deterministic linear selection and streaming approximations.
### Interview Variations
Do not mutate input, guarantee worst-case bounds, or return the partition.

## 17. Problem-to-Pattern Mapping
Kth Largest -> Quickselect -> convert rank and partition until the target index is fixed.

## 18. Related Patterns
Heap, Sorting, Two Pointers, and Divide and Conquer.
