# Recursive Linked List Problems

## What is this pattern?
Let a recursive call solve the suffix, then use its returned head to connect the current node.

## Why do we need it?
Recursive structure mirrors the list, making reverse and merge definitions concise.

## Visual Explanation
```text
solve(head) = solve(head.next) + connect head
base: null or one node
```

## Pointer Meaning and Invariant
The returned reference is the head of the solved suffix; current links to that result only after recursive work completes.

## Brute Force and Optimization
Recursion can simplify code but uses call-stack memory. Iteration often gives the same `O(n)` time with `O(1)` space.

## Java Template
Always define the null/one-node base case before dereferencing `head.next`.

## Dry Run
Reverse `1->2`: recurse on 2, set `2.next=1`, then set `1.next=null`.

## Complexity
Usually `O(n)` time and `O(n)` stack space.

## Edge Cases and Mistakes
Stack overflow for very large lists and stale links causing cycles.

## Question Bank
### Beginner / Easy
Recursive print/search.
### Easy+
Recursive reverse.
### Medium
Recursive merge and palindrome.
### Hard
Recursive k-group reversal.
### Interview Variations
Convert recursion to iteration and prove stack usage.

## Related Patterns
Reverse, Merge, Divide and Conquer.
