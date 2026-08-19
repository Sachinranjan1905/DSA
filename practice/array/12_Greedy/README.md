# Greedy + Array

## 1. What is this pattern?
Make the best-looking local choice while proving it cannot hurt an optimal solution.

## 2. Why do we need it?
Trying every sequence of choices is exponential or costly. A proof-backed local rule can reduce it to `O(n)` or `O(n log n)`.

## 3. Core Intuition
Keep the strongest reachable state or cheapest valid next choice.

## 4. Visual Explanation
```text
jump reach: [2,3,1,1,4]
index 0 reaches 2; index 1 extends frontier to 4 -> finish
```

## 5. Step-by-Step Working
State the choice, maintain the frontier/resource, and prove exchange or dominance.

## 6. Pattern Recognition
“Maximum reach”, “minimum jumps”, “choose non-overlapping”, or sorted costs with local decisions.

## 7. Brute Force Approach
Try every decision sequence; often exponential.

## 8. Optimized Approach
Discard dominated choices using a proof.

## 9. Java Template
```java
int reach = 0;
for (int i = 0; i <= reach && i < values.length; i++) {
    reach = Math.max(reach, i + values[i]);
}
```

## 10. Dry Run
Expand the reachable frontier; when the next index is beyond it, the end is unreachable.

## 11. Time Complexity
Usually `O(n)` or `O(n log n)` after sorting.

## 12. Space Complexity
Usually `O(1)`.

## 13. Common Mistakes
Using greed without proof, confusing local maximum with global optimum, and ignoring unreachable states.

## 14. Edge Cases
Empty input, zero jumps, unreachable end, ties, and negative values where relevant.

## 15. Variations
Forward frontier, backward goal, sort + choose, and interval greedy.

## 16. Complete Question Bank
### Beginner / Easy
Best stock profit, assign cookies, can jump.
### Easy+
Jump Game II, lemonade change, maximum subarray reasoning.
### Medium
Gas station, partition labels, candy.
### Medium+
Task scheduling, minimum arrows, weighted choices.
### Hard
Burst balloons variants, lexicographic greedy, proof-heavy resource allocation.
### Interview Variations
Ask for proof, return choices, handle online arrival, or add penalties.

## 17. Problem-to-Pattern Mapping
Best Stock -> Scan + Greedy -> keep the cheapest earlier buy.

## 18. Related Patterns
Intervals, Sorting, Kadane, and Binary Search on Answer.
