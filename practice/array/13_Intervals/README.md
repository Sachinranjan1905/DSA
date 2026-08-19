# Intervals

## 1. What is this pattern?
Represent ranges as `[start,end]` and process them in sorted order.

## 2. Why do we need it?
Unordered overlap checks are `O(n^2)`. Sorting starts lets a sweep merge or select in `O(n log n)`.

## 3. Core Intuition
```text
[1,3] [2,6] [8,10]
merge first two because next.start <= current.end
```

## 4. Visual Explanation
Sort by start, maintain the active interval, and extend or close it.

## 5. Step-by-Step Working
Sort, compare the next start with current end, merge when overlapping, otherwise emit current.

## 6. Pattern Recognition
Meeting times, ranges, coverage, overlap, insertion, or minimum removals.

## 7. Brute Force Approach
Compare every pair: `O(n^2)`.

## 8. Optimized Approach
Sort then sweep: `O(n log n)`.

## 9. Java Template
```java
Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
for (int[] interval : intervals) {
    // merge or emit according to overlap
}
```

## 10. Dry Run
`[1,3]` and `[2,6]` become `[1,6]`; `[8,10]` starts a new result.

## 11. Time Complexity
`O(n log n)`.

## 12. Space Complexity
`O(n)` for output; auxiliary depends on sorting.

## 13. Common Mistakes
Endpoint inclusivity, sorting by the wrong field, and mutating caller-owned intervals unexpectedly.

## 14. Edge Cases
Empty input, touching endpoints, nested ranges, duplicates, and one interval.

## 15. Variations
Sweep line, heap for room counts, difference events, and circular intervals.

## 16. Complete Question Bank
### Beginner / Easy
Merge intervals, overlap test, insert interval.
### Easy+
Meeting rooms, remove covered intervals.
### Medium
Meeting rooms II, minimum arrows, partition labels.
### Medium+
Calendar booking, employee free time, interval intersections.
### Hard
Maximum overlap with weights, dynamic booking, range coverage.
### Interview Variations
Closed/open endpoints, return original IDs, online insertion, or weighted capacity.

## 17. Problem-to-Pattern Mapping
Merge Intervals -> Sort + Sweep -> adjacent sorted ranges are the only possible next overlap.

## 18. Related Patterns
Greedy, Sorting, Difference Array, and Heap.
