# Frequency Hashing

## 1. What is this pattern?
Use a `HashMap` for counts or a `HashSet` for membership.

## 2. Why do we need this pattern?
Nested searches cost `O(n^2)`. Hash lookup is average `O(1)`, so one pass is commonly `O(n)`.

## 3. Core Intuition
Store what has already appeared, then ask the map/set about the current value.

## 4. Visual Explanation
```text
values: [2, 7, 11, 15], target=9
seen: {} -> {2=0}; current 7 asks for 2 -> found
```

## 5. Step-by-Step Working
Choose counts or membership, scan once, query before/after insertion as required, and define duplicate behavior.

## 6. Pattern Recognition
Frequency, duplicate, unique, anagram, complement, or “have we seen this?” are strong clues.

## 7. Brute Force Approach
Compare each pair or count each value by rescanning: `O(n^2)`.

## 8. Optimized Approach
Hashing gives expected `O(n)` time at the cost of `O(n)` memory.

## 9. Java Template
```java
Map<Integer, Integer> counts = new HashMap<>();
for (int value : values) {
    counts.put(value, counts.getOrDefault(value, 0) + 1);
}
```

## 10. Dry Run
For `[2, 2, 3]`, counts become `{2=2, 3=1}` after three updates.

## 11. Time Complexity
Expected `O(n)`; worst-case hash behavior depends on implementation.

## 12. Space Complexity
`O(u)`, where `u` is the number of distinct values.

## 13. Common Mistakes
Forgetting zero counts, assuming ordering, using a map when a small frequency array is enough.

## 14. Edge Cases
Empty input, negative keys, duplicates, overflow in counts, and collision-sensitive constraints.

## 15. Variations
Frequency array, two maps, prefix sum + map, sliding window + map, and custom objects as keys.

## 16. Complete Question Bank
### Beginner / Easy
Contains duplicate, unique value, frequency table, majority candidate, intersection.
### Easy+
Two Sum, first unique value, common elements with multiplicity.
### Medium
Group by frequency, longest consecutive sequence, subarray sum equals `k`.
### Medium+
Count pairs, four-sum count, constrained frequency windows.
### Hard
Minimum window, count smaller ranges, offline frequency queries.
### Interview Variations
Bounded values, adversarial input, stable output order, memory limits, or streaming input.

## 17. Problem-to-Pattern Mapping
Two Sum -> HashMap -> store complements in one pass. Contains Duplicate -> HashSet -> membership answers existence.

## 18. Related Patterns
Prefix Sum, Sliding Window, Sorting-Based, and Bit Manipulation.
