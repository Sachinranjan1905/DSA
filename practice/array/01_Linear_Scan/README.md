# Linear Scan

## 1. What is this pattern?
Visit each element once while carrying a small amount of useful state.

## 2. Why do we need this pattern?
Repeatedly rescanning earlier values often creates `O(n^2)`. One maintained state usually reduces the work to `O(n)`.

## 3. Core Intuition
Ask: what must I remember from the prefix already visited? Keep exactly that state.

## 4. Visual Explanation
```text
prices:  [7, 1, 5, 3, 6, 4]
          min=7 -> 1 -> 1 -> 1 -> 1
          profit 0    4    2    5    3
```

## 5. Step-by-Step Working
Initialize from the first value, scan left to right, update state, and update the answer after each item.

## 6. Pattern Recognition
If the answer depends on the best/worst value seen so far, think linear scan.

## 7. Brute Force Approach
Try every pair or every earlier element: usually `O(n^2)`.

## 8. Optimized Approach
Maintain the needed prefix statistic, giving `O(n)` time.

## 9. Java Template
```java
for (int value : values) {
    // update state and answer
}
```

## 10. Dry Run
For stock prices, update the minimum before calculating today’s possible profit.

## 11. Time Complexity
`O(n)` time.

## 12. Space Complexity
Usually `O(1)` auxiliary space.

## 13. Common Mistakes
Using a future value, initializing incorrectly for negatives, or updating answer before state.

## 14. Edge Cases
Empty input, one item, all equal values, decreasing values, and integer overflow.

## 15. Variations
Prefix maximum/minimum, state machines, multiple transactions, and running differences.

## 16. Complete Question Bank
### Beginner / Easy
Sum, min/max, count positives, second maximum, best buy/sell profit.
### Easy+
Leaders, maximum difference with order, pivot/equilibrium index.
### Medium
Product except self (two scans), longest mountain, gas station.
### Medium+
Multiple state variables and one-pass transaction constraints.
### Hard
One-pass streaming algorithms and constant-memory event processing.
### Interview Variations
Input arrives as a stream, values cannot be revisited, or return the indices and tie-breaking rule.

## 17. Problem-to-Pattern Mapping
`BestTimeToBuyandSellStock` -> Linear Scan -> minimum price and best profit are prefix state.

## 18. Related Patterns
Prefix Sum, Kadane, Greedy, and HashMap + Array.
