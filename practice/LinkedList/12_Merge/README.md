# Merge Two Linked Lists

## What is this pattern?
Repeatedly attach the smaller head from two sorted lists.

## Why do we need it?
Sorted order lets us merge without sorting or copying all values.

## Visual Explanation
```text
A: 1 -> 3 -> 5
B: 2 -> 4 -> 6
R: 1 -> 2 -> 3 -> 4 -> 5 -> 6
```

## Pointer Meaning and Invariant
`tail` is the last node in the merged sorted prefix; `first` and `second` are unmerged heads.

## Brute Force and Optimization
Concatenate then sort costs `O((n+m)log(n+m))`. Merge costs `O(n+m)`.

## Java Template
Use a dummy tail, compare heads, attach one node, and append the remaining suffix.

## Dry Run
Attach 1, then 2, then 3; when one list ends, attach the other list whole.

## Complexity
`O(n+m)` time and `O(1)` auxiliary space when reusing nodes.

## Edge Cases and Mistakes
Either list null, equal values, and returning `dummy.next` rather than dummy.

## Question Bank
### Beginner / Easy
Merge two sorted lists.
### Easy+
Merge descending or custom comparator lists.
### Medium
Add numbers represented by lists.
### Hard
Stable multi-key merge.
### Interview Variations
Reuse nodes, preserve input lists, or return a copied result.

## Related Patterns
Dummy Node, Merge K, Sorting.
