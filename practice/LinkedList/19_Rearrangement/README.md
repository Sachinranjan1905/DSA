# Linked List Rearrangement

## What is this pattern?
Change node order by splitting, reversing, and reconnecting existing chains.

## Why do we need it?
Many interview tasks ask for a specific order without allocating a second list.

## Visual Explanation
```text
1 -> 2 -> 3 -> 4 -> 5
reorder: 1 -> 5 -> 2 -> 4 -> 3
```

## Pointer Meaning and Invariant
First half remains in order; second half is reversed; weaving consumes one node from each half.

## Brute Force and Optimization
Array indexing is simple but uses `O(n)` space. Pointer operations use `O(1)` auxiliary space.

## Java Template
Find middle, reverse second half, alternate nodes.

## Dry Run
Split `1,2,3 | 4,5`; reverse right to `5,4`; weave `1,5,2,4,3`.

## Complexity
`O(n)` time, `O(1)` auxiliary space.

## Edge Cases and Mistakes
Terminate the final node to avoid a cycle.

## Question Bank
### Beginner / Easy
Swap pairs.
### Easy+
Odd-even positions.
### Medium
Reorder list.
### Hard
Multi-way weave and group rearrangement.
### Interview Variations
Stable positions, preserve nodes, and odd-length policy.

## Related Patterns
Reverse, Fast/Slow, Partitioning.
