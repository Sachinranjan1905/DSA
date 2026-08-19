# Merge K Sorted Linked Lists

## What is this pattern?
Merge many sorted lists by always choosing the smallest available head.

## Why do we need it?
Repeated pairwise merging can do unnecessary work. A heap keeps the next candidate efficiently.

## Visual Explanation
```text
heap: [1, 2, 4] -> pop 1, add its next node
```

## Pointer Meaning and Invariant
The heap contains one current candidate from every non-empty list; `tail` ends the merged prefix.

## Brute Force and Optimization
Collect and sort all values: `O(N log N)`. Heap merge is `O(N log k)`.

## Java Template
Initialize heap with each non-null head, pop, attach, and offer its successor.

## Dry Run
Pop 1 from list A, add A's next; pop 2 from list B; repeat until heap is empty.

## Complexity
`O(N log k)` time, `O(k)` heap space.

## Edge Cases and Mistakes
Empty list array, null lists, comparator ties, and duplicate node insertion.

## Question Bank
### Beginner / Easy
Two-list merge baseline.
### Easy+
K-way merge.
### Medium
Merge sorted streams.
### Hard
External memory and dynamic list arrival.
### Interview Variations
Heap versus divide-and-conquer and stability.

## Related Patterns
Merge, Heap, Sorting.
