# Binary Search

## 1. What is this pattern?
Repeatedly discard half of a sorted or monotonic search space.

## 2. Why do we need it?
Linear lookup is `O(n)`; halving gives `O(log n)`.

## 3. Core Intuition
```text
L       M       R
[1][2][4][6][8][9][10]
If target is left of M, discard the right half.
```

## 4. Visual Explanation
The invariant says where the answer can still be. Every iteration shrinks that interval.

## 5. Step-by-Step Working
Set bounds, compute safe midpoint, test, discard an impossible half, and stop when bounds cross.

## 6. Pattern Recognition
Sorted data, first/last occurrence, rotation, peak, or any monotonic yes/no condition.

## 7. Brute Force Approach
Scan all values: `O(n)`.

## 8. Optimized Approach
Maintain a valid candidate interval and halve it.

## 9. Java Template
```java
int left = 0, right = values.length - 1;
while (left <= right) {
    int middle = left + (right - left) / 2;
    if (values[middle] == target) return middle;
    if (values[middle] < target) left = middle + 1;
    else right = middle - 1;
}
return -1;
```

## 10. Dry Run
Search `8` in `[1,2,4,6,8,9,10]`: middle `6`, then `9`, then `8`.

## 11. Time Complexity
`O(log n)`.

## 12. Space Complexity
`O(1)` iterative.

## 13. Common Mistakes
Wrong inclusive bounds, infinite loops, overflowed midpoint, and returning any occurrence instead of the first.

## 14. Edge Cases
Empty input, one item, duplicates, target outside range, and rotated arrays.

## 15. Variations
Lower/upper bound, rotated search, peak finding, binary search on answer.

## 16. Complete Question Bank
### Beginner / Easy
Exact search, first/last position, insertion point.
### Easy+
Integer square root, peak element, rotated array.
### Medium
Minimum in rotation, search duplicates, 2D matrix search.
### Medium+
Bitonic arrays, unknown-size arrays, split search.
### Hard
Median of two sorted arrays and nested monotonic searches.
### Interview Variations
No random access, duplicate tie-breaking, comparator input, or overflow-safe values.

## 17. Problem-to-Pattern Mapping
First Position -> Binary Search -> when found, continue left while preserving a candidate.

## 18. Related Patterns
Binary Search on Answer, Sorting, and Divide and Conquer.
