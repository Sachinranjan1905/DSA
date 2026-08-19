# Binary Search on Answer

## 1. What is this pattern?
Binary-search a numeric answer when feasibility changes only once.

## 2. Why do we need it?
Trying every capacity/speed/limit is expensive. A monotonic feasibility test reduces `O(range * check)` to `O(log range * check)`.

## 3. Core Intuition
```text
answer: 1 2 3 4 5 6 7
possible F F F F T T T
find the first T
```

## 4. Visual Explanation
The array may not be sorted; the *yes/no result* for candidate answers is sorted.

## 5. Step-by-Step Working
Define candidate bounds, write `canFinish(candidate)`, and find the first feasible value.

## 6. Pattern Recognition
Minimize the maximum, maximize the minimum, minimum speed/capacity, or “can we do it in D days?”.

## 7. Brute Force Approach
Test every candidate answer, often too slow.

## 8. Optimized Approach
Use monotonic feasibility plus binary search.

## 9. Java Template
```java
while (low < high) {
    long mid = low + (high - low) / 2;
    if (feasible(mid)) high = mid;
    else low = mid + 1;
}
return low;
```

## 10. Dry Run
For shipping capacity, small capacities fail; once a capacity works, every larger one works.

## 11. Time Complexity
`O(log answerRange * feasibilityCost)`.

## 12. Space Complexity
Usually `O(1)`.

## 13. Common Mistakes
Bounds that exclude the answer, a non-monotonic predicate, and integer overflow.

## 14. Edge Cases
One item, answer at either bound, huge values, and impossible constraints.

## 15. Variations
First feasible, last feasible, maximize minimum distance, and partition workloads.

## 16. Complete Question Bank
### Beginner / Easy
Integer square root, eating speed.
### Easy+
Ship packages, minimum days, threshold value.
### Medium
Split array largest sum, bouquet days, aggressive placement.
### Medium+
Painter partition, gas stations, workload balancing.
### Hard
Nested feasibility checks and precision-based answers.
### Interview Variations
Return the witness partition, support long values, or explain predicate proof.

## 17. Problem-to-Pattern Mapping
Split Array Largest Sum -> Answer Search -> capacity feasibility is monotonic.

## 18. Related Patterns
Binary Search, Greedy, Prefix Sum, and Intervals.
