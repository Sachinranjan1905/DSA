# Stack and Queue Using Linked Lists

## What is this pattern?
Use the head or tail as an endpoint for a restricted data structure.

## Why do we need it?
A linked stack pushes/pops at head in `O(1)`. A queue needs head and tail for `O(1)` enqueue/dequeue.

## Visual Explanation
```text
Queue: head -> [1] -> [2] -> [3] <- tail
Stack: top  -> [3] -> [2] -> [1]
```

## Pointer Meaning and Invariant
Queue empty means head and tail are both null; stack top is the current head.

## Brute Force and Optimization
Queue dequeue by searching tail is `O(n)`. Head/tail metadata makes both operations constant time.

## Java Template
Push: `node.next=top; top=node`. Enqueue: `tail.next=node; tail=node`.

## Dry Run
Enqueue 1,2, dequeue returns 1 and moves head to 2; when empty, clear tail too.

## Complexity
Stack push/pop and queue enqueue/dequeue are `O(1)`; peek is `O(1)`.

## Edge Cases and Mistakes
Empty removal, singleton transition, and tail reset.

## Question Bank
### Beginner / Easy
Stack and queue APIs.
### Easy+
Deque.
### Medium
Min stack and circular queue.
### Hard
Blocking/concurrent queues conceptually.
### Interview Variations
Capacity, exceptions versus sentinel returns, and thread safety.

## Related Patterns
Head/Tail, Doubly Linked List, Circular List.
