# Difference Array

## 1. What is this pattern?
Store how a range update starts and ends instead of updating every item immediately.

## 2. Why do we need this pattern?
Updating `[left..right]` directly costs `O(n)` per update. Difference markers make each update `O(1)` and one final prefix pass `O(n)`.

## 3. Core Intuition
```text
add x to [L..R]: diff[L] += x; diff[R+1] -= x
running total of diff reconstructs the array
```

## 4. Visual Explanation
A positive marker turns an update on; a negative marker turns it off after the right endpoint.

## 5. Step-by-Step Working
Create `n+1` markers, place two boundary changes per update, then accumulate left to right.

## 6. Pattern Recognition
Many range additions/booking updates followed by one final array or maximum query.

## 7. Brute Force Approach
Loop through every affected index for every update: `O(un)`.

## 8. Optimized Approach
Markers cost `O(1)` per update, reconstruction costs `O(n)`: `O(u+n)`.

## 9. Java Template
```java
int[] diff = new int[length + 1];
diff[left] += amount;
diff[right + 1] -= amount;
for (int i = 0; i < length; i++) {
    if (i > 0) diff[i] += diff[i - 1];
}
```

## 10. Dry Run
Two updates `[1..3] +2` and `[2..2] +1` reconstruct as `[0,2,3,2]`.

## 11. Time Complexity
`O(u+n)` total.

## 12. Space Complexity
`O(n)`.

## 13. Common Mistakes
Allocating only `n`, forgetting `right+1`, and reconstructing before all updates are recorded.

## 14. Edge Cases
Update starts at zero, ends at `n-1`, no updates, negative amounts, and overlapping ranges.

## 15. Variations
2D difference arrays, range assignment with lazy structures, and difference + prefix for repeated rounds.

## 16. Complete Question Bank
### Beginner / Easy
Range increment, flight bookings, car capacity changes.
### Easy+
Overlap counts and maximum concurrent load.
### Medium
Meeting capacity, range painting, multiple test cases.
### Medium+
2D rectangle updates and coordinate compression.
### Hard
Online updates requiring Fenwick or segment trees.
### Interview Variations
Return only the maximum, process huge coordinates, or support rollback.

## 17. Problem-to-Pattern Mapping
Range Addition -> Difference Array -> record two boundaries, then integrate once.

## 18. Related Patterns
Prefix Sum, Intervals, Sweep Line, Fenwick Tree, and Segment Tree.
