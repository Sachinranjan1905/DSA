# Two Pointers

## What is this pattern?
Move two references through one or two lists to compare positions or align distances.

## Why do we need it?
Two coordinated walks can avoid repeated length calculations or nested traversals.

## Visual Explanation
```text
A: 1 -> 2 -> 3
B:       2 -> 3
pA and pB move until their references match or both become null
```

## Pointer Meaning and Invariant
Each pointer represents the next node still relevant to its walk. In intersection switching, both pointers traverse equal total distance.

## Brute Force and Optimization
Nested node comparisons are `O(nm)`. Pointer switching finds intersection in `O(n+m)`.

## Java Template
```java
while (first != second) {
    first = first == null ? headB : first.next;
    second = second == null ? headA : second.next;
}
```

## Dry Run
After each pointer finishes one list, it switches to the other; unequal prefixes cancel out.

## Complexity
`O(n+m)` time and `O(1)` space.

## Edge Cases and Mistakes
Compare node identity (`==`), not just equal values; both null is a valid answer.

## Question Bank
### Beginner / Easy
Pairwise walks, intersection.
### Easy+
Align unequal lengths.
### Medium
Add numbers and compare suffixes.
### Hard
Multiple-list alignment.
### Interview Variations
Cyclic inputs, identity semantics, and immutable nodes.

## Related Patterns
Fast/Slow, Intersection, Merge.
