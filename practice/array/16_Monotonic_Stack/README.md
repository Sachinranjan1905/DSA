# Monotonic Stack + Array

## 1. What is this pattern?
Keep stack candidates increasing or decreasing so useless elements are removed.

## 2. Why do we need it?
For every item, repeatedly searching right for a greater value costs `O(n^2)`. Each item is pushed and popped once: `O(n)`.

## 3. Core Intuition
```text
current 5 arrives: pop 2, pop 4, then push 5
stack keeps only candidates that can answer future queries
```

## 4. Visual Explanation
A decreasing stack is useful for next greater values; a stack of indices also stores distances and boundaries.

## 5. Step-by-Step Working
Scan, pop while the current value resolves the stack top, answer popped indices, then push current.

## 6. Pattern Recognition
Next greater/smaller, previous greater/smaller, span, histogram, or nearest boundary.

## 7. Brute Force Approach
Scan right/left for every element: `O(n^2)`.

## 8. Optimized Approach
Maintain unresolved candidates in a monotonic stack: `O(n)`.

## 9. Java Template
```java
Deque<Integer> stack = new ArrayDeque<>();
for (int i = 0; i < values.length; i++) {
    while (!stack.isEmpty() && values[stack.peek()] < values[i]) {
        int index = stack.pop();
        answer[index] = values[i];
    }
    stack.push(i);
}
```

## 10. Dry Run
For `[2,1,3]`, `3` pops indices `1` and `0`, answering both with `3`.

## 11. Time Complexity
`O(n)` amortized.

## 12. Space Complexity
`O(n)`.

## 13. Common Mistakes
Using values instead of indices, wrong equality rule, and forgetting circular traversal.

## 14. Edge Cases
Empty input, monotonic input, equal values, no answer, and circular arrays.

## 15. Variations
Circular next greater, histogram rectangles, stock span, and contribution counting.

## 16. Complete Question Bank
### Beginner / Easy
Next greater element, daily temperatures, stock span.
### Easy+
Previous smaller, remove adjacent duplicates.
### Medium
Largest rectangle, sum of subarray minimums, asteroid collision.
### Medium+
Maximal rectangle, visible buildings, Cartesian tree.
### Hard
Sum of subarray ranges, contribution methods, online stack queries.
### Interview Variations
Return distances, process circular input, stream values, or use custom comparisons.

## 17. Problem-to-Pattern Mapping
Daily Temperatures -> Monotonic Stack -> unresolved colder indices wait for a warmer future value.

## 18. Related Patterns
Sliding Window Deque, Greedy, Intervals, and Dynamic Programming.
