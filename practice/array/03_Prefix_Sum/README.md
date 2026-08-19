# Prefix Sum

## 1. What is this pattern?
A prefix array stores the total from the beginning through each position.

## 2. Why do we need this pattern?
A direct range sum costs `O(length)`. Prefix sums answer it in `O(1)` after `O(n)` preprocessing.

## 3. Core Intuition
```text
values: [2, 4, 1, 5]
prefix: [0, 2, 6, 7, 12]
range [1..3] = prefix[4] - prefix[1] = 10
```

## 4. Visual Explanation
The extra leading zero makes every range formula uniform: `sum(left..right) = prefix[right + 1] - prefix[left]`.

## 5. Step-by-Step Working
Build cumulative totals, then subtract the total before the left boundary.

## 6. Pattern Recognition
Repeated range sums, subarray totals, balance transformations, or “sum between indices” suggest prefix sum.

## 7. Brute Force Approach
Sum each requested range directly: `O(qn)` worst case.

## 8. Optimized Approach
Preprocess once in `O(n)`, answer `q` queries in `O(q)` total.

## 9. Java Template
```java
long[] prefix = new long[values.length + 1];
for (int i = 0; i < values.length; i++) {
    prefix[i + 1] = prefix[i] + values[i];
}
long range = prefix[right + 1] - prefix[left];
```

## 10. Dry Run
For `[2,4,1,5]`, the sum from index `1` to `2` is `prefix[3]-prefix[1] = 7-2 = 5`.

## 11. Time Complexity
Build `O(n)`; each query `O(1)`.

## 12. Space Complexity
`O(n)`, or `O(1)` when only one running query is needed.

## 13. Common Mistakes
Off-by-one errors, using `int` for large totals, and forgetting that indices are inclusive.

## 14. Edge Cases
Empty arrays, one-item ranges, negative values, all-negative values, and many queries.

## 15. Variations
2D prefix sums, prefix XOR, suffix sums, and prefix sum + HashMap.

## 16. Complete Question Bank
### Beginner / Easy
Range sum query, running sum, left/right totals, pivot index.
### Easy+
Product/suffix combinations, immutable range queries.
### Medium
Subarray sum equals `k`, zero-sum ranges, count odd-sum ranges.
### Medium+
2D region sum, balanced binary arrays, weighted queries.
### Hard
Count range sums, constrained prefix transforms, high-volume offline queries.
### Interview Variations
Mutable updates, 64-bit totals, one-indexed APIs, or memory-efficient query storage.

## 17. Problem-to-Pattern Mapping
Range Sum Query -> Prefix Sum -> subtract two cumulative boundaries.

## 18. Related Patterns
Difference Array, Sliding Window, and Advanced Prefix Sum + Hashing.
