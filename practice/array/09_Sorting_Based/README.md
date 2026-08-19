# Sorting-Based Techniques

## 1. What is this pattern?
Sort values so equal, nearby, or ordered elements become easy to process.

## 2. Why do we need it?
Unordered comparisons may require nested loops. Sorting often reduces later work to a linear scan, for `O(n log n)` total.

## 3. Core Intuition
Order exposes structure: duplicates become adjacent and pair decisions become predictable.

## 4. Visual Explanation
```text
before: [4, 1, 3, 1, 2]
after:  [1, 1, 2, 3, 4] -> equal values and gaps are visible
```

## 5. Step-by-Step Working
Choose a comparator, sort, scan while skipping duplicates or merging compatible values.

## 6. Pattern Recognition
Questions about duplicates, closest values, triplets, custom order, or intervals often benefit from sorting.

## 7. Brute Force Approach
Try every pair/triplet: `O(n^2)`/`O(n^3)`.

## 8. Optimized Approach
Sort then use a scan or two pointers.

## 9. Java Template
```java
Arrays.sort(values);
for (int i = 1; i < values.length; i++) {
    if (values[i] == values[i - 1]) { /* duplicate */ }
}
```

## 10. Dry Run
Sort `[3,1,2,2]` to `[1,2,2,3]`; one comparison detects the duplicate.

## 11. Time Complexity
Usually `O(n log n)` time.

## 12. Space Complexity
`O(1)` auxiliary for primitive in-place sorting, subject to implementation details.

## 13. Common Mistakes
Losing original indices, mutating input unexpectedly, and using a comparator that overflows.

## 14. Edge Cases
Empty input, duplicates, negative values, already sorted input, and stable-order requirements.

## 15. Variations
Counting sort, radix sort, custom comparator, sort + two pointers, sort + greedy.

## 16. Complete Question Bank
### Beginner / Easy
Sort colors, find duplicate, merge sorted data.
### Easy+
Closest pair, squares, relative sorting.
### Medium
3Sum, 4Sum, largest number, meeting rooms.
### Medium+
Count smaller after self, wiggle sort, interval scheduling.
### Hard
Reverse pairs, smallest range, external sorting.
### Interview Variations
Do not mutate, preserve IDs, limited value range, or sort data too large for memory.

## 17. Problem-to-Pattern Mapping
3Sum -> Sort + Two Pointers -> order allows duplicate skipping and directional movement.

## 18. Related Patterns
Two Pointers, Intervals, Greedy, Divide and Conquer, Quickselect.
