# Complex / Random Pointer Lists

## What is this pattern?
Nodes have `next` plus an arbitrary `random` reference that may point anywhere or null.

## Why do we need it?
A normal sequential copy does not reproduce arbitrary reference identity.

## Visual Explanation
```text
A -> B -> C
|random   |random
C         A
```

## Pointer Meaning and Invariant
The copied node must point to the copied target, never to an original node.

## Brute Force and Optimization
HashMap original-to-copy gives `O(n)` space. Interleave copies to achieve `O(1)` auxiliary space.

## Java Template
Create copy nodes, map/link random references, then detach; or interleave, assign random, and separate.

## Dry Run
Interleave `A,A',B,B'`; `A'.random = A.random.next`; detach originals from copies.

## Complexity
`O(n)` time; `O(n)` map space or `O(1)` auxiliary with interleaving.

## Edge Cases and Mistakes
Null random, self-random, and ensure original list is restored.

## Question Bank
### Beginner / Easy
HashMap deep copy.
### Easy+
Self/random null links.
### Medium
O(1) interleaving copy.
### Hard
Multilevel arbitrary graph-like lists.
### Interview Variations
Identity, mutation-free copy, and memory limits.

## Related Patterns
Node References, Hashing, Advanced Pointers.
