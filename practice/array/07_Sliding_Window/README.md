# Sliding Window

## 1. What is this pattern?
Maintain a contiguous section of the array while moving its left and right boundaries.

## 2. Why do we need this pattern?
Enumerating every subarray is `O(n^2)`. Add each item once and remove each item once for `O(n)`.

## 3. Core Intuition
```text
values: [2][1][5][3][4]
         L--------R  current window
expand R; while invalid, remove values at L and move L
```

## 4. Visual Explanation
The window is a moving interval; its state is updated rather than recomputed.

## 5. Step-by-Step Working
Expand right, update state, shrink while the constraint fails, then record the best valid window.

## 6. Pattern Recognition
Contiguous subarray/substring with fixed `k`, at most/exactly `k`, or longest/shortest valid range.

## 7. Brute Force Approach
Check each start/end pair: `O(n^2)`.

## 8. Optimized Approach
Each boundary moves forward at most `n` times: `O(n)` for suitable constraints.

## 9. Java Template
```java
int left = 0;
for (int right = 0; right < values.length; right++) {
    add(values[right]);
    while (invalid()) remove(values[left++]);
    answer = Math.max(answer, right - left + 1);
}
```

## 10. Dry Run
For a fixed window of `3`, add the new right value and subtract the value leaving on the left.

## 11. Time Complexity
Usually `O(n)`.

## 12. Space Complexity
`O(1)` for numeric state or `O(u)` for a frequency map.

## 13. Common Mistakes
Using variable windows when negative values break monotonicity, shrinking too early, and mixing inclusive lengths.

## 14. Edge Cases
`k=0`, `k>n`, empty input, all invalid windows, negative values, and integer overflow.

## 15. Variations
Fixed window, variable window, frequency window, deque window, and prefix sum for negative values.

## 16. Complete Question Bank
### Beginner / Easy
Maximum sum of size `k`, average of size `k`, first negative in each window.
### Easy+
Longest ones after flips, minimum size positive-sum subarray.
### Medium
Longest distinct window, character replacement, permutation inclusion.
### Medium+
Exactly `k` distinct values, max in every window, subarrays with constraints.
### Hard
Minimum window, constrained frequency counts, negative-value variants.
### Interview Variations
Streaming input, memory cap, return all windows, tie-breaking, or dynamic `k`.

## 17. Problem-to-Pattern Mapping
Fixed-size maximum sum -> Sliding Window -> subtract the outgoing value instead of recomputing the sum.

## 18. Related Patterns
Prefix Sum, HashMap, Monotonic Deque, and Kadane.
