# Linked List Fundamentals

## What is this pattern?
A linked list is a sequence of nodes connected by references, ending at `null`.

## Why do we need it?
Arrays provide fast indexing but shifting can be expensive. Lists trade `O(1)` index access for flexible relinking.

## Visual Explanation
```text
head -> [10] -> [20] -> [30] -> null
```

## Pointer Meaning and Invariant
`head` points to the first node. During a traversal, every node before `current` has already been visited.

## Brute Force and Optimization
An array-backed list shifts values during middle insertion. A linked list relinks known nodes in `O(1)`; locating them remains `O(n)`.

## Java Template
```java
static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }
```

## Dry Run
`head -> 10 -> 20 -> null`; assigning `head = head.next` changes the head to `20`.

## Complexity
Node creation is `O(1)`. Traversal and indexed access are `O(n)`.

## Edge Cases and Mistakes
Handle `null`, one node, and lost references. Save `next` before overwriting a link.

## Question Bank
### Beginner / Easy
Create, print, count, convert array/list.
### Easy+
Length, min/max, copy list.
### Medium
Generic node and list API design.
### Hard
Ownership, mutation, and iterator contracts.
### Interview Variations
Explain memory tradeoffs, null termination, and when a linked list is a poor choice.

## Related Patterns
Node Structure, Traversal, Insertion, and Deletion.
