# Rotation

## What is this pattern?
Move a suffix to the front or a prefix to the back by cutting and reconnecting one link.

## Why do we need it?
It tests length, modulo arithmetic, tail handling, and precise reconnection.

## Visual Explanation
```text
1 -> 2 -> 3 -> 4 -> 5, rotate right 2
4 -> 5 -> 1 -> 2 -> 3
```

## Pointer Meaning and Invariant
After making the list circular, the new tail is at position `n-k-1`; cut there.

## Brute Force and Optimization
One-step rotation repeated k times costs `O(nk)`. Length plus one circular cut costs `O(n)`.

## Java Template
Find tail/length, connect tail to head, walk to new tail, set new head and break circle.

## Dry Run
Length 5, `k=2`; new tail is node 3, new head node 4; set node 3.next null.

## Complexity
`O(n)` time, `O(1)` space.

## Edge Cases and Mistakes
Modulo by zero, k larger than length, and forgetting to break the circle.

## Question Bank
### Beginner / Easy
Rotate right.
### Easy+
Rotate left.
### Medium
Block rotation.
### Hard
Dynamic rotations.
### Interview Variations
Negative k, huge k, and immutable output.

## Related Patterns
Circular List, Two Pointers, Split.
