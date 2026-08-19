# Head and Tail Management

## What is this pattern?
Maintain metadata so operations at both ends remain predictable.

## Why do we need it?
A singly linked list can insert at head in `O(1)`, but tail insertion is `O(n)` unless a tail reference is stored.

## Visual Explanation
```text
head                         tail
 |                            |
 v                            v
[10] -> [20] -> [30] -> null
```

## Pointer Meaning and Invariant
If the list is non-empty, `tail.next == null`; if empty, both `head` and `tail` are `null`.

## Brute Force and Optimization
Walking to the end for every append is `O(n)` each. A maintained tail makes append `O(1)`.

## Java Template
```java
if (head == null) head = tail = node;
else { tail.next = node; tail = node; }
```

## Dry Run
Appending `30` changes old tail `20.next` to `30`, then moves tail to `30`.

## Complexity
Head/tail operations `O(1)` with metadata; search remains `O(n)`.

## Edge Cases and Mistakes
After deleting the last node, set both references to null.

## Question Bank
### Beginner / Easy
Append/prepend, size tracking.
### Easy+
Pop head/tail.
### Medium
Deque design and invariant checks.
### Hard
Constant-time end operations with doubly linked lists.
### Interview Variations
Thread safety, iterators, and mutation contracts.

## Related Patterns
Insertion, Deletion, Doubly Linked List, Queue.
