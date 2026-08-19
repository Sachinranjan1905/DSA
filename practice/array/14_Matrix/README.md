# Matrix / 2D Arrays

## 1. What is this pattern?
An array of rows and columns where each cell has coordinates.

## 2. Why do we need it?
Grid problems add boundaries, directions, and visited-state reasoning to normal scans.

## 3. Core Intuition
Use `row` and `column` deliberately; decide whether movement is row-wise, spiral, diagonal, or neighbor-based.

## 4. Visual Explanation
```text
→ → →
      ↓
← ← ←
↑
```

## 5. Step-by-Step Working
Validate dimensions, define boundaries/directions, visit each cell once, and update boundaries after a side.

## 6. Pattern Recognition
Rows/columns, neighbors, rectangular regions, rotations, diagonals, or spiral wording.

## 7. Brute Force Approach
Repeatedly scan rows/columns or copy the full matrix: often `O(mn)` time and `O(mn)` space.

## 8. Optimized Approach
Use boundary pointers, in-place swaps, or directional arrays.

## 9. Java Template
```java
int rows = matrix.length, columns = matrix[0].length;
for (int row = 0; row < rows; row++) {
    for (int column = 0; column < columns; column++) { /* visit */ }
}
```

## 10. Dry Run
Spiral traversal consumes top row, right column, bottom row, and left column while shrinking bounds.

## 11. Time Complexity
Usually `O(rows * columns)`.

## 12. Space Complexity
`O(1)` auxiliary for in-place operations; otherwise output/visited space.

## 13. Common Mistakes
Ragged rows, boundary duplication, confusing transpose with rotation, and index swaps.

## 14. Edge Cases
Empty matrix, one row, one column, square versus rectangular, and duplicate values.

## 15. Variations
Prefix-sum matrix, BFS/DFS grid, diagonal traversal, rotation, zero marking.

## 16. Complete Question Bank
### Beginner / Easy
Print, sum, transpose, search, diagonal sum.
### Easy+
Spiral order, rotate image, set matrix zeroes.
### Medium
Search sorted matrix, island perimeter, flood fill.
### Medium+
Word search, largest rectangle, matrix prefix queries.
### Hard
Maximal rectangle, surrounded regions, multi-source distance.
### Interview Variations
Ragged input, in-place requirement, streaming rows, or memory limits.

## 17. Problem-to-Pattern Mapping
Spiral Matrix -> Matrix boundaries -> each side is consumed exactly once.

## 18. Related Patterns
Prefix Sum, Two Pointers, Monotonic Stack, and Graph traversal.
