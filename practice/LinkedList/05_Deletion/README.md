# Deletion

## What is this pattern?
Bypass a node by changing the predecessor's `next` reference.

## Why do we need it?
Deletion is a relink, not a value shift. The predecessor and successor must remain connected.

## Visual Explanation
```text
Before: 10 -> 20 -> 30
After:  10 --------> 30
```

## Pointer Meaning and Invariant
`previous.next` is the link being replaced; the remaining reachable nodes stay connected.

## Brute Force and Optimization
Find-by-value then delete costs `O(n)`. Delete by known predecessor is `O(1)`.

## Java Template
```java
previous.next = previous.next.next;
```

## Dry Run
With predecessor `10`, `10.next` changes from `20` to `30`; node `20` is no longer reachable from head.

## Complexity
Delete head `O(1)`; delete by position/value `O(n)` due to traversal.

## Edge Cases and Mistakes
Deleting head/tail, singleton list, missing value, and accidentally dereferencing a missing target.

## Question Bank
### Beginner / Easy
Delete head, tail, value, position.
### Easy+
Delete all matching values.
### Medium
Delete node with only node reference.
### Hard
Doubly/circular deletion and safe mutation during traversal.
### Interview Variations
Return new head, maintain tail, and specify missing-target behavior.

## Related Patterns
Dummy Node, Duplicate Removal, and Partitioning.
