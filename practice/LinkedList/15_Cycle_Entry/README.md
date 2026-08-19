# Cycle Entry Detection

## What is this pattern?
Find the first node belonging to a cycle after detecting that a cycle exists.

## Why do we need it?
The meeting point is not generally the entry; a second pointer is required.

## Visual Explanation
```text
head -> prefix -> entry -> cycle -> meeting
                    ^             |
                    |_____________|
```

## Pointer Meaning and Invariant
After meeting, moving `headPointer` and `meetingPointer` one step makes them meet at entry.

## Brute Force and Optimization
A set returns the first repeated identity using `O(n)` space. Floyd uses `O(1)`.

## Java Template
Detect meeting; reset one pointer to head; advance both one step until identity matches.

## Dry Run
The distance equations show both pointers cover the same effective distance to the entry.

## Complexity
`O(n)` time and `O(1)` space.

## Edge Cases and Mistakes
No cycle returns null. A self-loop returns that node.

## Question Bank
### Beginner / Easy
Entry after detection.
### Easy+
Cycle length.
### Medium
Remove cycle.
### Hard
Compare cycles across lists.
### Interview Variations
Proof of the distance equation and mutation-free detection.

## Related Patterns
Cycle Detection, Fast/Slow, Intersection.
