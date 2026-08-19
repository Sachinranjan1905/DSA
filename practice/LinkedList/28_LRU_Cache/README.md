# LRU Cache

## What is this pattern?
Combine a HashMap for lookup with a doubly linked list for recency order.

## Why do we need it?
A cache needs `get` and `put` in `O(1)`, including moving recently used items.

## Visual Explanation
```text
most recent <-> [A] <-> [B] <-> [C] <-> least recent
```

## Pointer Meaning and Invariant
Map points to every live node. Sentinels bound the list; front is most recent and back is eviction candidate.

## Brute Force and Optimization
Scanning a list to find keys or recency costs `O(n)`. Map + DLL makes lookup, unlink, and insert `O(1)`.

## Java Template
Map key to node; `remove(node)`, `addAfterHead(node)`, evict before tail.

## Dry Run
Get B: unlink B and insert after head. Put D at capacity: remove node before tail, then add D front.

## Complexity
`get` and `put` expected `O(1)` time, `O(capacity)` space.

## Edge Cases and Mistakes
Capacity zero, updating existing key, and map/list consistency after eviction.

## Question Bank
### Beginner / Easy
Map lookup.
### Easy+
DLL recency list.
### Medium
LRU get/put.
### Hard
TTL, LFU, concurrency.
### Interview Variations
Eviction policy, thread safety, and memory ownership.

## Related Patterns
Doubly Linked List, HashMap, Dummy Sentinel.
