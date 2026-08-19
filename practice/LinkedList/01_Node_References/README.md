# Node Structure and References

## What is this pattern?
A node contains data plus one or more links to other nodes.

## Why do we need it?
Understanding references prevents accidental data copies and broken chains.

## Visual Explanation
```text
first ----> [value=10 | next] ----> [value=20 | next=null]
```

## Pointer Meaning and Invariant
A reference variable points to an object. `node.next` is the next link; `null` means no next node.

## Brute Force and Optimization
Copying values does not copy list structure. Preserve links when cloning or rewiring nodes.

## Java Template
```java
static class ListNode { int value; ListNode next; ListNode(int value) { this.value = value; } }
```

## Dry Run
`second = first.next` makes both variables refer to the same second node; changing its value is visible through either reference.

## Complexity
Reading a field is `O(1)`; reaching the kth node is `O(k)`.

## Edge Cases and Mistakes
Do not dereference `null`; do not create accidental cycles by linking a tail backward.

## Question Bank
### Beginner / Easy
Create nodes, link nodes, print fields.
### Easy+
Clone a simple chain.
### Medium
Generic nodes and ownership rules.
### Hard
Random links and deep copies.
### Interview Variations
Reference identity versus equal values, garbage collection, and aliasing.

## Related Patterns
Traversal, Random Pointer, Doubly Linked List.
