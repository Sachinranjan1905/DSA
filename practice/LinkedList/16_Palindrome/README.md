# Palindrome Linked List

## What is this pattern?
Compare the first half with the reversed second half.

## Why do we need it?
A direct value copy makes comparison easy but uses `O(n)` space. Middle + reverse uses `O(1)` extra space.

## Visual Explanation
```text
1 -> 2 -> 2 -> 1
find middle | reverse second half | compare | optionally restore
```

## Pointer Meaning and Invariant
Slow finds the midpoint; fast confirms length. After reversal, left and right pointers compare equal-position values.

## Brute Force and Optimization
Copy values to an array and compare ends: `O(n)` time, `O(n)` space. In-place half reversal: `O(n)`, `O(1)`.

## Java Template
Find middle, reverse second half, compare pairs, then reverse again if the API promises preservation.

## Dry Run
`1->2->2->1`: middle is first `2`; reverse `2->1` to `1->2`; compare `1=1`, `2=2`.

## Complexity
`O(n)` time; `O(1)` auxiliary space when iterative.

## Edge Cases and Mistakes
Null/one node are palindromes. State whether the list is restored.

## Question Bank
### Beginner / Easy
Palindrome values.
### Easy+
Restore after checking.
### Medium
Palindrome with recursion.
### Hard
Streaming or immutable lists.
### Interview Variations
Odd/even midpoint and mutation policy.

## Related Patterns
Fast/Slow, Reverse, Stack.
