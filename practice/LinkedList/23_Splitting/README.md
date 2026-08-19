# Splitting Linked Lists

## What is this pattern?
Find a boundary and cut one chain into independent lists.

## Why do we need it?
Merge sort, palindrome checks, and reordering all require a precise split.

## Visual Explanation
```text
1 -> 2 -> 3 -> 4
left: 1 -> 2    right: 3 -> 4
```

## Pointer Meaning and Invariant
Slow marks the chosen boundary; its predecessor must be disconnected from the right half.

## Brute Force and Optimization
Counting length then walking twice is still `O(n)` but may be more work. Fast/slow finds the split in one pass.

## Java Template
Advance fast two steps and slow one; save `slow.next`, then set `slow.next = null`.

## Dry Run
For four nodes, choose a documented middle convention and cut exactly one link.

## Complexity
`O(n)` time, `O(1)` auxiliary space.

## Edge Cases and Mistakes
One/two nodes and forgetting to sever the link.

## Question Bank
### Beginner / Easy
Split in half.
### Easy+
Odd/even split.
### Medium
Merge-sort split.
### Hard
Split into k parts.
### Interview Variations
Balanced sizes and remainder distribution.

## Related Patterns
Fast/Slow, Sorting, Reordering.
