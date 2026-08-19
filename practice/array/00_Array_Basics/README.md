# Array Basics

## 1. What is this pattern?
An array stores values at numbered indexes. Reading `array[i]` is direct and fast.

## 2. Why do we need it?
Before patterns, learn the cost of access, traversal, insertion, and deletion. Middle insertion/deletion is `O(n)` because values shift; access is `O(1)`.

## 3. Core Intuition
Track the logical size separately when using a partly filled fixed array. Never read beyond that size.

## 4. Visual Explanation
```text
index:  0   1   2   3
value: [10][20][30][  ]  size = 3
insert 15 at 1: shift 30 right, then write 15
```

## 5. Step-by-Step Working
Validate the array, validate the logical index, shift from the correct end, write the value, and update size.

## 6. Pattern Recognition
If a question asks for basic access, update, insertion, deletion, traversal, or linear search, start here.

## 7. Brute Force Approach
A dynamic collection can copy every value for each insertion. That is still `O(n)` per insertion.

## 8. Optimized Approach
Use direct indexing for access and shift only the affected suffix for mutation.

## 9. Java Template
```java
for (int index = 0; index < values.length; index++) {
    System.out.println(values[index]);
}
```

## 10. Dry Run
For `[10, 20, 30]`, deleting index `1` shifts `30` to index `1`, then reduces the logical size to `2`.

## 11. Time Complexity
Access/update: `O(1)`. Traversal/search/insertion/deletion: `O(n)` worst case.

## 12. Space Complexity
`O(1)` auxiliary space when shifting in the same array.

## 13. Common Mistakes
Confusing capacity with size, shifting in the wrong direction, and using an invalid index.

## 14. Edge Cases
Null array, empty array, one item, full capacity, insertion at either end, and deletion of the last item.

## 15. Variations
Dynamic arrays, circular arrays, two-dimensional arrays, and arrays of objects.

## 16. Complete Question Bank
### Beginner / Easy
Traversal, sum, min/max, linear search, reverse, copy, frequency of a small range.
### Easy+
Insert/delete at an index, rotate by one, move zeroes, second largest.
### Medium
Leaders, equilibrium index, rearrange positives and negatives.
### Medium+
Dynamic-array design and circular-buffer operations.
### Hard
In-place transformations under strict memory limits.
### Interview Variations
Ask for invalid-input behavior, stable ordering, amortized cost, or a stream of operations.

## 17. Problem-to-Pattern Mapping
`ArrayOperations` -> Array Basics -> it models the fundamental indexed operations directly.

## 18. Related Patterns
Study Linear Scan, then Frequency Hashing and Two Pointers.
