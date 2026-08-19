# Heap / Priority Queue + Array

## 1. What is this pattern?
Maintain the smallest or largest item available without sorting everything.

## 2. Why do we need it?
Full sorting costs `O(n log n)`. A heap of size `k` handles top-k work in `O(n log k)`.

## 3. Core Intuition
A min-heap exposes the smallest; a max-heap exposes the largest.

## 4. Visual Explanation
```text
keep k largest with min-heap: [smallest among winners] at root
new value > root -> replace root
```

## 5. Step-by-Step Working
Choose heap direction, insert candidates, remove when size exceeds `k`, and read the root.

## 6. Pattern Recognition
Kth largest/smallest, top K, repeatedly choose min/max, or merge sorted streams.

## 7. Brute Force Approach
Sort all values or repeatedly scan: `O(n log n)` or `O(nk)`.

## 8. Optimized Approach
Heap keeps only useful candidates: `O(n log k)`.

## 9. Java Template
```java
PriorityQueue<Integer> heap = new PriorityQueue<>();
for (int value : values) {
    heap.offer(value);
    if (heap.size() > k) heap.poll();
}
return heap.peek();
```

## 10. Dry Run
For top three values, every fourth value ejects the smallest current winner.

## 11. Time Complexity
`O(n log k)` for top-k; `O(log k)` per update.

## 12. Space Complexity
`O(k)`.

## 13. Common Mistakes
Wrong heap direction, comparator overflow, and confusing kth value with sorted position after duplicates.

## 14. Edge Cases
`k=0`, `k=n`, duplicates, negative values, and empty input.

## 15. Variations
Two heaps for median, heap of indices, merge k sorted arrays, and frequency heaps.

## 16. Complete Question Bank
### Beginner / Easy
Kth largest, top K frequent, last stone weight.
### Easy+
K closest values, sort nearly sorted array.
### Medium
Median stream, merge k sorted arrays, task selection.
### Medium+
Sliding-window median, smallest range across lists.
### Hard
Online quantiles, multi-key priority, external merge.
### Interview Variations
Streaming input, bounded memory, tie-breaking, or custom object priorities.

## 17. Problem-to-Pattern Mapping
Kth Largest -> Min-Heap of size `k` -> root is the smallest among retained winners.

## 18. Related Patterns
Quickselect, Sorting, Intervals, and Sliding Window.
