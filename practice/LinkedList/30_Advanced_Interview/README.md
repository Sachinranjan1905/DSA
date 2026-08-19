# Advanced Interview Problems

## What is this pattern?
Combine pointer invariants, multiple passes, and auxiliary structures under strict constraints.

## Why do we need it?
Interview and production problems rarely announce one pattern; they test choosing and composing the right ones.

## Visual Explanation
```text
split -> reverse -> compare/weave -> restore
map + DLL -> O(1) cache operations
```

## Pointer Meaning and Invariant
Name every segment and preserve reachability: no node is lost, duplicated, or accidentally made cyclic.

## Brute Force and Optimization
Start with a correct extra-memory solution, then remove repeated traversal or storage only when constraints require it.

## Java Template
Use dummy nodes, saved successors, and explicit termination after every rearrangement.

## Dry Run
For reorder: split, reverse the second half, weave one node at a time, terminate final tail.

## Complexity
State the exact passes, recursion stack, heap/map usage, and whether nodes are reused.

## Edge Cases and Mistakes
Null, singleton, even/odd, duplicate values, cycles, shared nodes, and head/tail changes.

## Question Bank
### Beginner / Easy
Swap pairs, remove nth from end.
### Easy+
Odd-even, rotate, partition.
### Medium
Reverse k-group, reorder, palindrome.
### Hard
Merge k, sort, flatten multilevel.
### Interview Variations
LRU, random copy, cycle removal, immutable nodes, and concurrency.

## Related Patterns
Every previous folder; next study trees, graphs, and cache design.
