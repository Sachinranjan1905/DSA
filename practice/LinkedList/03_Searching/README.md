# Searching

## What is this pattern?
Compare each node's value with a target while traversing.

## Why do we need it?
A linked list has no random access; search is sequential unless an additional index is maintained.

## Visual Explanation
```text
[target=20] 10 -> 20 -> 30 -> null
             no    yes
```

## Pointer Meaning and Invariant
`current` is the only untested node. Every earlier node did not match.

## Brute Force and Optimization
A repeated search for many targets can be `O(nq)`. A HashSet index can make expected lookup `O(1)` with `O(n)` build space.

## Java Template
```java
while (current != null) {
    if (current.value == target) return current;
    current = current.next;
}
return null;
```

## Dry Run
For target `30`, compare `10`, then `20`, then return the node containing `30`.

## Complexity
One search is `O(n)` time and `O(1)` space.

## Edge Cases and Mistakes
Return a node or boolean consistently; handle null head and duplicate values explicitly.

## Question Bank
### Beginner / Easy
Contains, index, count occurrences.
### Easy+
First/last matching node, min/max.
### Medium
Search with predicates and multiple targets.
### Hard
Indexed linked list or skip-list design.
### Interview Variations
Stable duplicate choice, concurrent mutation, and memory/time tradeoff.

## Related Patterns
Hashing, Traversal, and Two Pointers.
