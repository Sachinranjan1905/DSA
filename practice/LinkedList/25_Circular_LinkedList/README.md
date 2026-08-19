# Circular Linked List

## What is this pattern?
The tail points back to a node, commonly the head, instead of null.

## Why do we need it?
Circular structure supports round-robin processing and constant-time rotations with a tail reference.

## Visual Explanation
```text
head -> 1 -> 2 -> 3
        ^         |
        |_________|
```

## Pointer Meaning and Invariant
There is no null terminator. For a head-based circular list, `tail.next == head`.

## Brute Force and Optimization
Null-based traversal loops forever. Stop when current returns to head or use a counted size.

## Java Template
```java
tail.next = head;
for (Node current = head; current != tail; current = current.next) { }
```

## Dry Run
Traverse 1,2,3 and stop when the next node would be head again.

## Complexity
Traversal `O(n)`; insert after tail `O(1)` with tail metadata.

## Edge Cases and Mistakes
Empty and one-node self-loop; never use `current != null` as the stop condition.

## Question Bank
### Beginner / Easy
Create/traverse circular list.
### Easy+
Insert/delete.
### Medium
Josephus elimination.
### Hard
Round-robin scheduler.
### Interview Variations
Detect circularity and maintain size.

## Related Patterns
Rotation, Doubly Linked List, Queue.
