# Reverse Linked List in Groups

## What is this pattern?
Reverse exactly full groups of `k` nodes while preserving incomplete suffix policy.

## Why do we need it?
It tests local pointer surgery plus reconnecting multiple segments.

## Visual Explanation
```text
1 -> 2 -> 3 | 4 -> 5 -> 6
reverse k=3
3 -> 2 -> 1 | 6 -> 5 -> 4
```

## Pointer Meaning and Invariant
`groupPrevious` ends the processed prefix; `groupStart` begins the current group; `groupEnd` confirms a full group.

## Brute Force and Optimization
Copy each group to an array uses `O(k)` space. In-place reversal uses `O(1)` auxiliary space.

## Java Template
Count k nodes before changing links, reverse the group, then connect its old start to the next group.

## Dry Run
Confirm nodes 1-3, reverse their links, connect prefix to 3 and node 1 to node 4.

## Complexity
`O(n)` time and `O(1)` iterative auxiliary space.

## Edge Cases and Mistakes
`k<=1`, fewer than k nodes, and losing the next group before reversal.

## Question Bank
### Beginner / Easy
Reverse fixed groups.
### Easy+
Leave incomplete suffix unchanged.
### Medium
Reverse alternating groups.
### Hard
Reverse every other group and variable group sizes.
### Interview Variations
Recursive versus iterative, stability, and malformed k.

## Related Patterns
Reverse, Dummy Node, Reordering.
