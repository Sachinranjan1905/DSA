# Doubly Linked List

## What is this pattern?
Each node points both forward and backward.

## Why do we need it?
With a node reference, deletion and backward traversal are `O(1)`.

## Visual Explanation
```text
null <- [10] <-> [20] <-> [30] -> null
```

## Pointer Meaning and Invariant
For each node, `node.next.prev == node` and `node.prev.next == node` when neighbors exist.

## Brute Force and Optimization
Singly deletion needs the predecessor. DLL stores it directly, using one extra reference per node.

## Java Template
Set four links carefully: predecessor.next, node.prev, node.next, successor.prev.

## Dry Run
Insert 20 between 10 and 30: 10.next=20, 20.prev=10, 20.next=30, 30.prev=20.

## Complexity
Known-node insertion/deletion `O(1)`; traversal/search `O(n)`.

## Edge Cases and Mistakes
Update head/tail and both directions; stale links can corrupt backward traversal.

## Question Bank
### Beginner / Easy
Forward/backward traversal.
### Easy+
Insert/delete positions.
### Medium
Deque and LRU support.
### Hard
Constant-time indexed-neighbor operations.
### Interview Variations
Sentinels, ownership, and invariant validation.

## Related Patterns
Head/Tail, LRU Cache, Circular List.
