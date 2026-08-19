# Traversal

## What is this pattern?
Start at `head` and repeatedly follow `next` until `null`.

## Why do we need it?
Linked lists have no direct index access, so every query begins by walking links.

## Visual Explanation
```text
current
  |
  v
[10] -> [20] -> [30] -> null
          current moves to current.next
```

## Pointer Meaning and Invariant
`current` is the next node to process. Nodes before it are already processed.

## Brute Force and Optimization
Repeatedly restarting from `head` for each index is `O(n^2)`. One walk is `O(n)`.

## Java Template
```java
for (ListNode current = head; current != null; current = current.next) {
    System.out.println(current.value);
}
```

## Dry Run
Current visits `10`, then `20`, then `30`; after `30`, current becomes `null`.

## Complexity
One traversal: `O(n)` time, `O(1)` space.

## Edge Cases and Mistakes
Empty list performs zero iterations. Never use `current.next.value` without checking `current.next`.

## Question Bank
### Beginner / Easy
Print, count, sum, min/max, convert to array.
### Easy+
Reverse output, nth value by traversal.
### Medium
Two-list traversal and zip output.
### Hard
Traverse cyclic or multilevel lists safely.
### Interview Variations
Streaming output, iterator design, and cycle guards.

## Related Patterns
Searching, Two Pointers, and Fast/Slow Pointers.
