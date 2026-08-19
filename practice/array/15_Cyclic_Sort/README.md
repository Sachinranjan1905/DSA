# Cyclic Sort

## 1. What is this pattern?
When values belong to `1..n`, repeatedly place each value at index `value - 1`.

## 2. Why do we need it?
Sorting costs `O(n log n)`. Natural positions let missing/duplicate questions run in `O(n)` and `O(1)` extra space.

## 3. Core Intuition
```text
value 3 -> index 2
[3,1,4,2] swap until every valid value reaches its home
```

## 4. Visual Explanation
Index and value are paired: `i = value - 1`. A correctly placed prefix grows through swaps.

## 5. Step-by-Step Working
At each index, if the value is in range and not already home, swap it into its home; otherwise advance.

## 6. Pattern Recognition
Values are distinct or almost distinct and lie in `1..n` or `0..n`.

## 7. Brute Force Approach
Sort or use a set: `O(n log n)` or `O(n)` extra space.

## 8. Optimized Approach
Place values by index: `O(n)` time, `O(1)` auxiliary space.

## 9. Java Template
```java
int index = 0;
while (index < values.length) {
    int home = values[index] - 1;
    if (values[index] > 0 && values[index] <= values.length
            && values[index] != values[home]) {
        int temporary = values[index];
        values[index] = values[home];
        values[home] = temporary;
    } else index++;
}
```

## 10. Dry Run
`[3,1,4,2]`: swap `3` with index `2`, then `4` with index `3`, then `2` with index `1`.

## 11. Time Complexity
Amortized `O(n)`.

## 12. Space Complexity
`O(1)`.

## 13. Common Mistakes
Wrong index formula, infinite swaps on duplicates, and ignoring out-of-range values.

## 14. Edge Cases
Missing value, duplicate value, all correct, zero-based ranges, and invalid values.

## 15. Variations
Missing number, all missing/duplicate pairs, first missing positive, corrupt pair.

## 16. Complete Question Bank
### Beginner / Easy
Missing number, find duplicate, find all disappeared numbers.
### Easy+
Find all duplicates, set mismatch.
### Medium
First missing positive, smallest missing positive.
### Medium+
Multiple missing values with constant space.
### Hard
In-place constraints with arbitrary invalid values.
### Interview Variations
Input cannot be mutated, values outside range, or return stable ordering.

## 17. Problem-to-Pattern Mapping
Find Missing Numbers -> Cyclic Sort -> natural index reveals absent values.

## 18. Related Patterns
Fast/Slow Pointers, HashSet, Sorting, and Bit Manipulation.
