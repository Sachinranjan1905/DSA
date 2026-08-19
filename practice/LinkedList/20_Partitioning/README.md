# Partitioning Linked Lists

## What is this pattern?
Build separate chains for values before and after a pivot, then connect them.

## Why do we need it?
A stable partition can be done without sorting or copying values.

## Visual Explanation
```text
2 -> 1 -> 4 -> 3, pivot=3
small: 2 -> 1   large: 4 -> 3
result: 2 -> 1 -> 4 -> 3
```

## Pointer Meaning and Invariant
Small and large tails end stable partitions; each processed node belongs to exactly one chain.

## Brute Force and Optimization
Sorting changes order and costs `O(n log n)`. Two stable chains cost `O(n)`.

## Java Template
Use two dummy heads, append each node, terminate large tail, connect.

## Dry Run
Move 2 and 1 to small; 4 and 3 to large; connect small tail to large head.

## Complexity
`O(n)` time and `O(1)` auxiliary nodes if reusing nodes.

## Edge Cases and Mistakes
Terminate each chain; otherwise an old link can create a cycle.

## Question Bank
### Beginner / Easy
Partition by value.
### Easy+
Stable positive/negative grouping.
### Medium
Three-way partition.
### Hard
Multiple predicates and stable constraints.
### Interview Variations
Preserve original nodes and define equality side.

## Related Patterns
Dummy Node, Two Pointers, Duplicate Removal.
