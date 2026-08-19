# Arrays - Complete DSA Roadmap

Arrays store values in consecutive positions. Index access is fast (`O(1)`), but inserting or deleting in the middle usually requires shifting values (`O(n)`). This module teaches arrays as reusable problem-solving patterns, not as a list of unrelated questions.

## Learning Roadmap

| Folder | What you learn | Why it matters | Prerequisites | Level | Important problem types |
|---|---|---|---|---|---|
| [00_Array_Basics](00_Array_Basics/README.md) | Access, update, insert, delete | Builds reliable array mechanics | Java basics | Beginner | Traversal, mutation, dynamic-size simulation |
| [01_Linear_Scan](01_Linear_Scan/README.md) | One-pass state tracking | Turns many `O(n^2)` ideas into `O(n)` | Basics | Beginner | Min/max, stock profit, leaders |
| [02_Frequency_Hashing](02_Frequency_Hashing/README.md) | Counts, membership, complements | Trades memory for fast lookup | Scan, collections | Beginner | Frequencies, duplicates, two sum |
| [03_Prefix_Sum](03_Prefix_Sum/README.md) | Cumulative work | Answers repeated range queries quickly | Scan | Beginner+ | Range sums, subarray sums |
| [04_Difference_Array](04_Difference_Array/README.md) | Lazy range updates | Makes many interval updates efficient | Prefix sum | Intermediate | Range increments, bookings |
| [05_Two_Pointers](05_Two_Pointers/README.md) | Coordinated indices | Exploits order or opposite movement | Scan, sorting | Beginner+ | Pair sums, merging, partitioning |
| [06_Fast_Slow_Pointers](06_Fast_Slow_Pointers/README.md) | Read/write pointer invariants | Filters or compacts in place | Two pointers | Beginner+ | Remove, deduplicate, partition |
| [07_Sliding_Window](07_Sliding_Window/README.md) | Maintain a contiguous window | Avoids recomputing every subarray | Hashing, prefix sums | Intermediate | Fixed/variable window, longest/shortest |
| [08_Kadane_Algorithm](08_Kadane_Algorithm/README.md) | Best ending-at-index state | Solves maximum contiguous sum in one pass | Scan, DP idea | Intermediate | Max/min subarray, circular arrays |
| [09_Sorting_Based](09_Sorting_Based/README.md) | Sort to reveal structure | Simplifies duplicates, gaps, and matching | Sorting basics | Intermediate | 3Sum, merging, custom order |
| [10_Binary_Search](10_Binary_Search/README.md) | Halve a monotonic search space | Gives `O(log n)` lookup | Sorted arrays | Intermediate | Bounds, rotations, peaks |
| [11_Binary_Search_On_Answer](11_Binary_Search_On_Answer/README.md) | Search feasible answers | Optimizes a numeric answer without trying all values | Binary search | Advanced | Capacity, allocation, minimum speed |
| [12_Greedy](12_Greedy/README.md) | Prove a locally best choice | Produces simple optimal array solutions | Scan, sorting | Intermediate | Jumps, reachability, scheduling |
| [13_Intervals](13_Intervals/README.md) | Sort and sweep ranges | Handles overlap and coverage cleanly | Sorting, greedy | Intermediate | Merge, insert, meeting rooms |
| [14_Matrix](14_Matrix/README.md) | Treat 2D arrays as grids | Adds direction and boundary reasoning | Basics, scan | Beginner+ | Spiral, rotate, flood-style traversal |
| [15_Cyclic_Sort](15_Cyclic_Sort/README.md) | Put values at natural indices | Uses `O(1)` extra space for `1..n` data | Two pointers | Intermediate | Missing, duplicate, corrupt pairs |
| [16_Monotonic_Stack](16_Monotonic_Stack/README.md) | Keep useful candidates only | Finds next greater/smaller relationships | Stack, scan | Advanced | Temperatures, histogram, spans |
| [17_Heap_PriorityQueue](17_Heap_PriorityQueue/README.md) | Keep best `k` candidates | Handles streaming and top-k data | Collections | Advanced | Kth values, medians, merging |
| [18_Bit_Manipulation](18_Bit_Manipulation/README.md) | Use binary properties | Gives constant-space tricks | Java integers | Intermediate | Missing/single number, XOR |
| [19_Divide_and_Conquer](19_Divide_and_Conquer/README.md) | Split, solve, combine | Supports efficient sorting and counting | Recursion | Advanced | Inversions, merge sort |
| [20_Quickselect](20_Quickselect/README.md) | Partition around a pivot | Finds order statistics in average linear time | Partitioning | Advanced | Kth smallest/largest, median |
| [21_Advanced_Array_Patterns](21_Advanced_Array_Patterns/README.md) | Combine patterns deliberately | Models industry-scale constraints | All previous folders | Interview/industry | Prefix+hashing, DP, multi-query design |

## Recommended Learning Order

Study folders from `00` through `21`. Finish the easy examples and write the template from memory before moving on. Revisit `02`, `03`, `05`, `07`, `10`, and `16` frequently because they combine with many other structures.

## Pattern Recognition Cheat Sheet

| Problem clue | First pattern to consider |
|---|---|
| Direct index access or mutation | Array basics |
| Need one answer from every element | Linear scan |
| Frequency or complement lookup | HashMap |
| Existence or duplicate check | HashSet |
| Repeated range sum | Prefix sum |
| Many range updates | Difference array |
| Sorted array + pair | Two pointers |
| Keep/remove values in place | Fast/slow pointers |
| Contiguous + fixed `k` | Fixed sliding window |
| Longest/shortest valid contiguous range | Variable sliding window |
| Maximum contiguous sum | Kadane |
| Kth largest/smallest | Heap or quickselect |
| Next greater/smaller | Monotonic stack |
| Values in `1..n` | Cyclic sort |
| Search in sorted or monotonic space | Binary search |
| Minimize/maximize a feasible value | Binary search on answer |
| Overlapping ranges | Sort + intervals |
| 2D coordinates and directions | Matrix |

## Existing Work Mapping

- `ArrayOperations` -> `00_Array_Basics`: it demonstrates traversal, search, update, insertion, and deletion.
- `BestTimeToBuyandSellStock` -> `01_Linear_Scan`: the minimum price and best profit are state carried through one pass; greedy reasoning is secondary.
- `MergeSortedArray` -> `05_Two_Pointers`: two sorted inputs are consumed from the back with three indices.
- `RemoveDuplicatesFromSortedArray` -> `06_Fast_Slow_Pointers`: a read pointer scans while a write pointer compacts unique values in place.
- `RemoveElement` -> `06_Fast_Slow_Pointers`: the write pointer keeps only values that pass the filter.

Compiled output is intentionally excluded. Keep `*.class` in the repository `.gitignore` and compile into a temporary output directory when checking examples.
