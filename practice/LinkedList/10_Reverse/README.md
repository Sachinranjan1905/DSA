# Reverse Linked List

## What is this pattern?
Reverse each `next` reference so the chain points backward.

## Why do we need it?
Many list problems become simple after reversing a suffix or the whole list.

## Visual Explanation
```text
Before: 1 -> 2 -> 3 -> null
After:  null <- 1 <- 2 <- 3
Result: 3 -> 2 -> 1 -> null
```

## Pointer Meaning and Invariant
`previous` is the already-reversed prefix; `current` is the first node not yet reversed; `next` saves the remaining suffix.

## Brute Force and Optimization
Copy values into an array and write backward uses `O(n)` space. Relinking uses `O(1)` space.

## Java Template
```java
ListNode previous = null, current = head;
while (current != null) {
    ListNode next = current.next;
    current.next = previous;
    previous = current;
    current = next;
}
return previous;
```

## Dry Run
For `1->2`, save `2`, set `1.next=null`, move previous to `1`, then set `2.next=1`.

## Complexity
`O(n)` time and `O(1)` iterative space. Recursive version uses `O(n)` stack.

## Edge Cases and Mistakes
Null and singleton return unchanged. Save next before overwriting it.

## Question Bank
### Beginner / Easy
Iterative and recursive reverse.
### Easy+
Reverse between positions.
### Medium
Reverse first k and alternating blocks.
### Hard
Reverse in k groups.
### Interview Variations
Restore list, recursion limit, and immutable implementation.

## Related Patterns
Reverse Groups, Palindrome, Reordering.
