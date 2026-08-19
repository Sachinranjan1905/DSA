# Insertion

## What is this pattern?
Create a node and connect it between existing nodes without losing the suffix.

## Why do we need it?
Known-node insertion avoids shifting all later values as an array would.

## Visual Explanation
```text
Before: 10 -> 30
save 30; link 10 -> 20 -> 30
After:  10 -> 20 -> 30
```

## Pointer Meaning and Invariant
`previous` is the node before the insertion point. Set `new.next` first, then `previous.next`.

## Brute Force and Optimization
Searching for position costs `O(n)`. Once predecessor is known, relinking is `O(1)`.

## Java Template
```java
newNode.next = previous.next;
previous.next = newNode;
```

## Dry Run
For insertion after `10`, new node `20` first points to `30`; `10.next` then points to `20`.

## Complexity
At head `O(1)`. By position, `O(n)` traversal plus `O(1)` relink.

## Edge Cases and Mistakes
Head insertion, tail insertion, empty list, and preserving the old successor.

## Question Bank
### Beginner / Easy
Insert head, tail, position.
### Easy+
Insert before/after value.
### Medium
Sorted insertion and duplicate policy.
### Hard
Doubly/circular insertion.
### Interview Variations
Maintain tail and size, reject invalid positions, and define ownership.

## Related Patterns
Deletion, Dummy Node, and Head/Tail Management.
