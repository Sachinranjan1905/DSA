# Dummy / Sentinel Node

## What is this pattern?
Use a permanent node before the real head to make head deletion/insertion look like ordinary relinking.

## Why do we need it?
Without a dummy, every head-changing case needs a separate branch.

## Visual Explanation
```text
dummy -> [10] -> [20] -> null
```

## Pointer Meaning and Invariant
`dummy.next` is always the current real head. `previous` can safely begin at dummy.

## Brute Force and Optimization
Many special cases create bugs. A sentinel centralizes the predecessor logic without changing asymptotic cost.

## Java Template
```java
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode previous = dummy;
```

## Dry Run
Deleting the first real node changes `dummy.next` directly; the caller returns `dummy.next`.

## Complexity
Usually `O(n)` traversal and `O(1)` extra space; dummy improves correctness, not big-O.

## Edge Cases and Mistakes
Never return dummy itself. Do not expose sentinel as data.

## Question Bank
### Beginner / Easy
Remove values, insert positions.
### Easy+
Remove nth from end.
### Medium
Merge lists and partition lists.
### Hard
Group reversal and stable filtering.
### Interview Variations
Sentinel for empty/non-empty unification and ownership of the dummy node.

## Related Patterns
Deletion, Merge, Partitioning, Reverse in Groups.
