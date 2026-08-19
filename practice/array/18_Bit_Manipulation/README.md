# Bit Manipulation + Array

## 1. What is this pattern?
Use binary operators such as XOR to combine integer properties without extra collections.

## 2. Why do we need it?
A set/map uses `O(n)` space. XOR cancellation can solve some uniqueness and missing-value problems in `O(1)` space.

## 3. Core Intuition
`x ^ x = 0` and `x ^ 0 = x`; duplicate pairs cancel.

## 4. Visual Explanation
```text
4 ^ 1 ^ 2 ^ 1 ^ 2 = 4
pairs disappear, leaving the unpaired value
```

## 5. Step-by-Step Working
Identify a cancellation or bit-count property, initialize the accumulator, and combine every value.

## 6. Pattern Recognition
Exactly one unpaired value, values appearing twice, missing from a complete range, or bit counts.

## 7. Brute Force Approach
HashSet or sorting: extra space or `O(n log n)`.

## 8. Optimized Approach
XOR/bit counts give linear time and constant auxiliary space.

## 9. Java Template
```java
int answer = 0;
for (int value : values) answer ^= value;
```

## 10. Dry Run
`[2,2,5,3,3]` XORs to `5` because matching values cancel.

## 11. Time Complexity
`O(n)`.

## 12. Space Complexity
`O(1)`.

## 13. Common Mistakes
Applying XOR when a value appears more than twice, ignoring signed integers, and confusing `^` with exponentiation.

## 14. Edge Cases
Zero, negatives, duplicates, empty input, and integer-width assumptions.

## 15. Variations
Two unique values, missing number, bit counts for three repetitions, masks.

## 16. Complete Question Bank
### Beginner / Easy
Single number, missing number, parity.
### Easy+
Find two unique values, add without arithmetic operators.
### Medium
Number appearing once when others appear three times, bitwise range operations.
### Medium+
Maximum XOR pair, trie-assisted bit decisions.
### Hard
Linear basis and bitwise optimization over arrays.
### Interview Variations
Explain proof, support long, avoid mutation, or handle arbitrary repetition counts.

## 17. Problem-to-Pattern Mapping
Single Number -> XOR -> paired values cancel and the singleton remains.

## 18. Related Patterns
Cyclic Sort, Hashing, and Tries.
