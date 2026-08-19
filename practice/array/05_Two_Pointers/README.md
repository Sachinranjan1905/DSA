# Two Pointers

## 1. What is this pattern?
Use two indices that move through one or two arrays in a coordinated way.

## 2. Why do we need this pattern?
Trying every pair is `O(n^2)`. Sorted order can let us discard many pairs at once, producing `O(n)` after sorting.

## 3. Core Intuition
```text
L -> [1][2][3][4][6] <- R
sum too small: move L; sum too large: move R
```

## 4. Visual Explanation
Each movement permanently rules out a group of impossible pairs because the array is sorted.

## 5. Step-by-Step Working
Define the invariant, inspect both endpoints, move the pointer that can improve the result, and avoid duplicate outputs where required.

## 6. Pattern Recognition
Sorted array + pair/triplet, merging sorted inputs, or compare from both ends.

## 7. Brute Force Approach
Enumerate pairs/triplets: `O(n^2)` or `O(n^3)`.

## 8. Optimized Approach
Sort once if allowed, then scan with pointers: usually `O(n log n)` or `O(n)`.

## 9. Java Template
```java
int left = 0, right = values.length - 1;
while (left < right) {
    if (values[left] + values[right] < target) left++;
    else right--;
}
```

## 10. Dry Run
On `[1,2,4,6,8]` with target `10`, `(1,8)` is small, move left; `(2,8)` works.

## 11. Time Complexity
`O(n)` on sorted input; `O(n log n)` including sorting.

## 12. Space Complexity
`O(1)` auxiliary space apart from the sorting implementation.

## 13. Common Mistakes
Moving both pointers unnecessarily, losing original indices, and mishandling duplicate values.

## 14. Edge Cases
Empty input, one item, equal values, negative numbers, and no valid pair.

## 15. Variations
Three/four sum, opposite-end product, merging arrays, partitioning, and cyclic movement.

## 16. Complete Question Bank
### Beginner / Easy
Pair sum sorted, reverse, merge sorted arrays, remove duplicates.
### Easy+
Move zeroes, squares of sorted array, intersection.
### Medium
3Sum, container with most water, sort colors, partition labels.
### Medium+
4Sum, boats to save people, minimum difference pairs.
### Hard
Trapping rain water, shortest subarray transformations, in-place stable partition.
### Interview Variations
Return indices, preserve stability, avoid sorting, stream one input, or handle duplicates.

## 17. Problem-to-Pattern Mapping
`MergeSortedArray` -> Two Pointers -> compare from the back so writes do not overwrite unread values.

## 18. Related Patterns
Fast/Slow Pointers, Sorting, Sliding Window, and Greedy.
