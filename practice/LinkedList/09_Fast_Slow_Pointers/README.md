# Fast and Slow Pointers

## What is this pattern?
`slow` moves one step while `fast` moves two steps.

## Why do we need it?
The speed difference finds a midpoint or proves a cycle without extra memory.

## Visual Explanation
```text
slow: [1] -> [2] -> [3] -> [4] -> [5]
fast: [1] -> [3] -> [5] -> null
```

## Pointer Meaning and Invariant
Before each iteration, slow is one step per round and fast is two. In a cycle, their relative distance changes modulo cycle length.

## Brute Force and Optimization
A visited set detects cycles in `O(n)` space. Floyd's method uses `O(1)` extra space.

## Java Template
```java
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
```

## Dry Run
On five nodes, slow ends at the middle while fast reaches null. On a cycle, they eventually meet.

## Complexity
`O(n)` time and `O(1)` space for midpoint/cycle detection.

## Edge Cases and Mistakes
Check `fast.next` before moving two steps. Even-list middle convention must be stated.

## Question Bank
### Beginner / Easy
Middle, split list.
### Easy+
Cycle detection, happy number.
### Medium
Cycle entry, palindrome.
### Hard
Cycle length and removal.
### Interview Variations
Choose first/second middle and preserve list structure.

## Related Patterns
Two Pointers, Palindrome, Cycle Detection.
