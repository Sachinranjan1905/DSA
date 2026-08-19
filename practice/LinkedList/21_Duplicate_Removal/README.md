# Duplicate Removal

## What is this pattern?
Remove repeated values while choosing whether one copy or every copy survives.

## Why do we need it?
Sorted and unsorted lists have different best strategies.

## Visual Explanation
```text
sorted: 1 -> 1 -> 2 -> 3  => 1 -> 2 -> 3
remove-all: 1 -> 1 -> 2 -> 2 -> 3 => 3
```

## Pointer Meaning and Invariant
In sorted input, `previous` is the last retained value. In unsorted input, a set records values already retained.

## Brute Force and Optimization
Repeated comparison is `O(n^2)` for unsorted data. HashSet gives expected `O(n)` time and `O(n)` space; sorting changes order.

## Java Template
For sorted lists, skip equal successors; for unsorted lists, maintain a set.

## Dry Run
At `1->1`, set first 1.next to the second node's successor, producing `1->2`.

## Complexity
Sorted: `O(n)` time, `O(1)` space. Unsorted HashSet: expected `O(n)`, `O(n)` space.

## Edge Cases and Mistakes
All duplicates, empty list, and distinguish remove-extra from remove-all.

## Question Bank
### Beginner / Easy
Sorted duplicate removal.
### Easy+
Unsorted duplicate removal.
### Medium
Remove all repeated groups.
### Hard
Keep exactly k copies.
### Interview Variations
No extra memory, preserve order, and custom equality.

## Related Patterns
Hashing, Dummy Node, Two Pointers.
