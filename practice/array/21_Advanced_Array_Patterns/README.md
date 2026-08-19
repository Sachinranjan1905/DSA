# Advanced Array Patterns

## 1. What is this pattern?
Combine simpler tools when one pattern alone cannot meet the constraints.

## 2. Why do we need it?
Industry problems often combine queries, hashing, windows, DP, and data structures. The goal is to choose the smallest sufficient combination.

## 3. Core Intuition
Start with a clear invariant, then add one structure only when it removes a measured bottleneck.

## 4. Visual Explanation
```text
prefix sum -> HashMap -> count matching prior balances
window -> frequency map -> maintain a valid range
array -> DP state -> best answer ending at i
```

## 5. Step-by-Step Working
Write the brute force, identify repeated work, select a state/data structure, prove its invariant, and measure complexity.

## 6. Pattern Recognition
Subarray sum with negatives, multiple queries plus updates, bounded DP, or a problem combining two familiar clues.

## 7. Brute Force Approach
Enumerate ranges, states, or query work; often `O(n^2)` or worse.

## 8. Optimized Approach
Prefix sum + HashMap, DP, Fenwick/segment tree, coordinate compression, or a hybrid.

## 9. Java Template
```java
Map<Long, Integer> firstSeen = new HashMap<>();
long prefix = 0;
for (int value : values) {
    prefix += value;
    // query a needed prior prefix, then record the current one
}
```

## 10. Dry Run
For target sum `k`, at prefix `p` look for prior prefix `p-k`; that prior range is the answer.

## 11. Time Complexity
Common combinations are `O(n)` or `O(n log n)`; state the cost of each component.

## 12. Space Complexity
Usually `O(n)` for stored prefixes, maps, DP, or trees.

## 13. Common Mistakes
Choosing sliding window with negative numbers, using `int` sums, and hiding a quadratic loop inside a helper.

## 14. Edge Cases
Negative values, duplicates, empty ranges, overflow, updates between queries, and ties.

## 15. Variations
Prefix + hashing, DP on arrays, Fenwick/segment tree, coordinate compression, and offline sorting.

## 16. Complete Question Bank
### Beginner / Easy
Subarray sum, prefix XOR, product except self.
### Easy+
Zero-sum count, balanced binary array, range-query preprocessing.
### Medium
Longest valid subarray, maximum product, house robber, LIS baseline.
### Medium+
Count range sums, Fenwick inversion count, sliding-window median.
### Hard
Segment tree queries, constrained subsequences, maximum rectangle, offline events.
### Interview Variations
Mutable arrays, millions of queries, streaming, distributed chunks, and memory budgets.

## 17. Problem-to-Pattern Mapping
Subarray Sum Equals K -> Prefix + HashMap -> prior prefix `current-k` identifies every matching range. House Robber -> Array DP -> state stores best result through each index.

## 18. Related Patterns
All previous folders; next study Fenwick Tree, Segment Tree, and general Dynamic Programming.
