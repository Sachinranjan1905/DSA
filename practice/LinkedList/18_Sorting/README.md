# Linked List Sorting

## What is this pattern?
Sort nodes by splitting the list and merging sorted halves.

## Why do we need it?
Random-access sorting algorithms fit arrays better. Merge sort works naturally with sequential nodes.

## Visual Explanation
```text
4 -> 1 -> 3 -> 2
split: 4->1 | 3->2
sort: 1->4 | 2->3
merge: 1->2->3->4
```

## Pointer Meaning and Invariant
Fast/slow split; recursive calls return sorted lists; merge output is always sorted.

## Brute Force and Optimization
Copy to array and sort uses `O(n)` extra storage. Linked-list merge sort is `O(n log n)` and can relink nodes.

## Java Template
Split at midpoint, recursively sort halves, merge with a dummy node.

## Dry Run
Split `4->1->3->2` into `4->1` and `3->2`, then merge sorted results.

## Complexity
`O(n log n)` time; `O(log n)` recursion stack, or `O(1)` auxiliary for bottom-up merge sort.

## Edge Cases and Mistakes
Cut the first half by setting midpoint predecessor.next to null.

## Question Bank
### Beginner / Easy
Sort small lists.
### Easy+
Stable merge.
### Medium
Merge sort.
### Hard
Bottom-up constant-space sort.
### Interview Variations
Stability, comparator, recursion limit, and node reuse.

## Related Patterns
Merge, Fast/Slow, Divide and Conquer.
