# Cycle Detection

## What is this pattern?
Determine whether following `next` references eventually repeats a node.

## Why do we need it?
A cyclic list never reaches null, so ordinary traversal can loop forever.

## Visual Explanation
```text
1 -> 2 -> 3 -> 4
          ^    |
          |____|
```

## Pointer Meaning and Invariant
`slow` advances one edge and `fast` two. In a cycle, fast eventually catches slow.

## Brute Force and Optimization
A HashSet stores visited identities in `O(n)` space. Floyd detection uses `O(1)` space.

## Java Template
```java
while (fast != null && fast.next != null) {
    slow = slow.next; fast = fast.next.next;
    if (slow == fast) return true;
}
return false;
```

## Dry Run
On a cycle, the gap changes by one node per iteration modulo the cycle length, so they meet.

## Complexity
`O(n)` time and `O(1)` space.

## Edge Cases and Mistakes
Null and one-node self-cycle; compare identity, not value.

## Question Bank
### Beginner / Easy
Detect a cycle.
### Easy+
Find cycle length.
### Medium
Cycle entry.
### Hard
Remove cycle safely.
### Interview Variations
Corrupted tail, identity semantics, and repeated queries.

## Related Patterns
Fast/Slow, Cycle Entry, Two Pointers.
