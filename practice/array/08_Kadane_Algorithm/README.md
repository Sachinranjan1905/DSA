# Kadane's Algorithm

## 1. What is this pattern?
Track the best subarray sum that ends at the current index.

## 2. Why do we need it?
Trying every contiguous range costs `O(n^2)`. Discarding a negative running prefix gives `O(n)`.

## 3. Core Intuition
```text
current = max(value, current + value)
best    = max(best, current)
```
A bad prefix can only reduce the next sum.

## 4. Visual Explanation
For `[-2,1,-3,4,-1,2,1,-5,4]`, the current state resets at `4`; the best state reaches `6`.

## 5. Step-by-Step Working
Start with the first value, choose extend-or-restart, then update the global best.

## 6. Pattern Recognition
Maximum/minimum sum of a contiguous subarray, often with “must be non-empty”.

## 7. Brute Force Approach
Enumerate all starts and ends: `O(n^2)`.

## 8. Optimized Approach
Use the best ending-at-index state: `O(n)`.

## 9. Java Template
```java
int current = values[0], best = values[0];
for (int i = 1; i < values.length; i++) {
    current = Math.max(values[i], current + values[i]);
    best = Math.max(best, current);
}
```

## 10. Dry Run
At each value choose whether the old prefix helps. Record the largest current state.

## 11. Time Complexity
`O(n)`.

## 12. Space Complexity
`O(1)`.

## 13. Common Mistakes
Returning zero for all-negative input and confusing circular with ordinary arrays.

## 14. Edge Cases
Empty input, one item, all negative, all positive, and integer overflow.

## 15. Variations
Return indices, minimum sum, circular array, one deletion, and maximum product.

## 16. Complete Question Bank
### Beginner / Easy
Maximum subarray, best positive run.
### Easy+
Return start/end indices, minimum subarray.
### Medium
Circular maximum, one deletion, maximum product subarray.
### Medium+
At least `k` length and bounded-length sums.
### Hard
Multiple disjoint subarrays and DP with transaction-like state.
### Interview Variations
Online stream, tie-breaking, empty subarray allowed, or exact length constraints.

## 17. Problem-to-Pattern Mapping
Maximum Subarray -> Kadane -> compare restarting against extending the current range.

## 18. Related Patterns
Dynamic Programming, Sliding Window, Prefix Sum, and Greedy.
