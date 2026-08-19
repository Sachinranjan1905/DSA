# Linked List Intersection

## What is this pattern?
Find the first node object shared by two lists, not merely equal values.

## Why do we need it?
Different prefix lengths make direct simultaneous traversal misaligned.

## Visual Explanation
```text
A: a1 -> a2 -> c1 -> c2
B: b1 -> b2 -> b3 -> c1 -> c2
```

## Pointer Meaning and Invariant
After switching heads, both pointers traverse `lengthA + lengthB`; shared suffix alignment becomes equal.

## Brute Force and Optimization
Store list A nodes in a set: `O(n+m)` time, `O(n)` space. Switching uses `O(1)` space.

## Java Template
Advance A through B and B through A until identity matches.

## Dry Run
A's extra prefix is canceled by B's walk, and B's extra prefix by A's walk; both reach `c1` together.

## Complexity
`O(n+m)` time, `O(1)` extra space.

## Edge Cases and Mistakes
Use `==`; no intersection returns null.

## Question Bank
### Beginner / Easy
Intersection with equal lengths.
### Easy+
Unequal prefixes.
### Medium
Length-difference alignment.
### Hard
Intersections with cycles.
### Interview Variations
Node identity, mutable suffix, and no extra memory.

## Related Patterns
Two Pointers, Cycle Entry, HashSet.
