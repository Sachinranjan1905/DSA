# Linked List - Complete DSA Roadmap

A linked list is a chain of nodes. Each node stores a value and a reference to the next node. This module teaches linked lists as pointer patterns, not as a collection of unrelated LeetCode solutions.

```text
HEAD
  |
  v
[10 | next] -> [20 | next] -> [30 | null]
```

`head` stores the first node reference. Each `next` reference points to another node, or `null` when the chain ends. A node is not required to sit beside the next node in memory. That flexibility makes insertion and deletion useful, but it removes fast index access.

## Linked List Versus Array

| Operation | Array | Singly linked list |
|---|---:|---:|
| Access by index | `O(1)` | `O(n)` because nodes must be followed |
| Search | `O(n)` | `O(n)` |
| Insert at known head | Usually `O(n)` shift | `O(1)` |
| Delete at known node/predecessor | Usually `O(n)` shift | `O(1)` relink |
| Extra link memory | None | One reference per node |

Insertion is only `O(1)` when the insertion location or predecessor is already known. Finding that location still costs traversal. This distinction is part of CodeOfTruth.

## Core Vocabulary

```java
static class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}
```

A Java reference is a variable that points to an object. Assigning `current = current.next` moves the reference; it does not copy a node.

## Learning Roadmap

| Folder | What you learn | Why it matters | Prerequisites | Level | Important problem types |
|---|---|---|---|---|---|
| [00_Fundamentals](00_Fundamentals/README.md) | Nodes, links, null termination | Builds the correct mental model | Java basics | Beginner | Create, print, count, convert |
| [01_Node_References](01_Node_References/README.md) | Object identity and aliases | Prevents lost links and accidental sharing | Fundamentals | Beginner | Copy nodes, reference identity |
| [02_Traversal](02_Traversal/README.md) | Walk a chain safely | Every later pattern begins with traversal | Fundamentals | Beginner | Length, sum, min/max |
| [03_Searching](03_Searching/README.md) | Sequential lookup | Makes the `O(n)` access cost explicit | Traversal | Beginner | Find, count, indexed lookup |
| [04_Insertion](04_Insertion/README.md) | Add nodes by relinking | Shows when insertion is truly `O(1)` | Traversal | Beginner | Head, tail, position, sorted insert |
| [05_Deletion](05_Deletion/README.md) | Bypass nodes safely | Teaches predecessor and head handling | Insertion | Beginner | Delete head, tail, value, nth from end |
| [06_Head_Tail_Management](06_Head_Tail_Management/README.md) | Maintain list metadata | Makes endpoint operations predictable | Insertion, deletion | Beginner+ | Append, prepend, deque |
| [07_Dummy_Sentinel](07_Dummy_Sentinel/README.md) | Remove head special cases | Reduces branching and pointer bugs | Deletion | Beginner+ | Remove, merge, partition |
| [08_Two_Pointers](08_Two_Pointers/README.md) | Align two walks | Solves intersection and distance problems | Traversal | Intermediate | Intersection, matching suffixes |
| [09_Fast_Slow_Pointers](09_Fast_Slow_Pointers/README.md) | Move at different speeds | Finds middle and cycles in constant space | Two pointers | Intermediate | Middle, split, cycle, palindrome |
| [10_Reverse](10_Reverse/README.md) | Reverse links iteratively/recursively | Core pointer manipulation skill | Node references | Beginner+ | Full and partial reverse |
| [11_Reverse_Groups](11_Reverse_Groups/README.md) | Reverse complete blocks | Combines local reversal with reconnection | Reverse, sentinel | Advanced | K-group and alternating reversal |
| [12_Merge](12_Merge/README.md) | Merge sorted chains | Gives linear-time combination | Sentinel, traversal | Intermediate | Merge two lists, add numbers |
| [13_Merge_K](13_Merge_K/README.md) | Heap-based multiway merge | Extends merging to many streams | Merge, heap | Advanced | Merge K lists, sorted streams |
| [14_Cycle_Detection](14_Cycle_Detection/README.md) | Detect repeated references | Prevents infinite traversal | Fast/slow | Intermediate | Has cycle, cycle length |
| [15_Cycle_Entry](15_Cycle_Entry/README.md) | Locate the first cyclic node | Converts detection into a useful boundary | Cycle detection | Advanced | Entry, remove cycle |
| [16_Palindrome](16_Palindrome/README.md) | Middle + reverse + compare | Combines three reusable patterns | Fast/slow, reverse | Advanced | Palindrome and restoration |
| [17_Intersection](17_Intersection/README.md) | Compare node identity | Handles unequal prefixes without extra space | Two pointers | Intermediate | Shared node, common suffix |
| [18_Sorting](18_Sorting/README.md) | Merge sort without indexing | Uses the algorithm suited to sequential data | Merge, split | Advanced | Sort list, inversion variants |
| [19_Rearrangement](19_Rearrangement/README.md) | Split, reverse, weave | Reorders nodes in place | Reverse, split | Advanced | Reorder, swap pairs, odd-even |
| [20_Partitioning](20_Partitioning/README.md) | Build stable subchains | Separates values without sorting | Sentinel, traversal | Intermediate | Partition by pivot, three-way split |
| [21_Duplicate_Removal](21_Duplicate_Removal/README.md) | Handle sorted/unsorted repeats | Distinguishes set memory from order | Traversal, hashing | Intermediate | Keep one, remove all, keep K |
| [22_Rotation](22_Rotation/README.md) | Cut and reconnect a circle | Makes large rotations linear | Head/tail, traversal | Intermediate | Rotate left/right, block rotate |
| [23_Splitting](23_Splitting/README.md) | Cut one list into parts | Required for sort, merge, and parallel work | Fast/slow | Intermediate | Half split, K parts |
| [24_Doubly_LinkedList](24_Doubly_LinkedList/README.md) | Maintain next and previous | Enables backward traversal and O(1) unlink | Fundamentals | Intermediate | DLL, deque, cache nodes |
| [25_Circular_LinkedList](25_Circular_LinkedList/README.md) | Traverse without null | Models round-robin structures | Head/tail | Intermediate | Circular insert, Josephus |
| [26_Stack_Queue](26_Stack_Queue/README.md) | Build ADTs from links | Connects lists to real APIs | Head/tail | Beginner+ | Stack, queue, deque |
| [27_Random_Pointer](27_Random_Pointer/README.md) | Copy arbitrary references | Teaches identity-preserving deep copy | Node references, hashing | Advanced | Random pointer, multilevel copy |
| [28_LRU_Cache](28_LRU_Cache/README.md) | HashMap + DLL design | Models a common industry data structure | DLL, HashMap | Industry | O(1) get/put, eviction |
| [29_Recursive_Problems](29_Recursive_Problems/README.md) | Solve suffixes recursively | Mirrors list structure and exposes stack cost | Reverse, merge | Advanced | Recursive reverse, merge, palindrome |
| [30_Advanced_Interview](30_Advanced_Interview/README.md) | Combine multiple invariants | Prepares for ambiguous interview problems | All previous patterns | Interview/industry | Flatten, K-group, cache, cycles |

## Recommended Learning Order

Study folders from `00` through `30`. First implement and print a list manually. Then learn one-pass pointer operations, followed by fast/slow and reversal. After that, combine them in merge, palindrome, intersection, sorting, and rearrangement problems. Finish with DLL/circular structures and industry designs such as random-pointer copying and LRU Cache. Revisit `07`, `09`, `10`, `12`, and `24` often because they combine with many interview problems.

## Learning Workflow

For every problem, follow this sequence:

```text
Understand the node graph
-> draw references before mutation
-> state the pointer invariant
-> write brute force
-> identify repeated work
-> relink with saved references
-> dry-run the exact Java code
-> verify null/head/tail/cycle cases
-> state measured complexity
```

## Learning Order

```text
00 Fundamentals -> 01 Node and References -> 02 Traversal -> 03 Searching
-> 04 Insertion -> 05 Deletion -> 06 Head Tail Management
-> 07 Dummy Sentinel -> 08 Two Pointers -> 09 Fast Slow Pointers
-> 10 Reverse -> 11 Reverse in Groups -> 12 Merge
-> 13 Merge K -> 14 Cycle Detection -> 15 Cycle Entry
-> 16 Palindrome -> 17 Intersection -> 18 Sorting
-> 19 Reordering -> 20 Partitioning -> 21 Duplicate Removal
-> 22 Rotation -> 23 Splitting -> 24 Doubly Linked List
-> 25 Circular Linked List -> 26 Stack Queue -> 27 Random Pointer
-> 28 LRU Cache -> 29 Recursive Problems -> 30 Advanced Interview
```

## Pattern Recognition Cheat Sheet

| Problem clue | Pattern |
|---|---|
| Visit every node | Traversal |
| Insert/delete with many edge cases | Dummy/sentinel node |
| Find a middle or split point | Fast + slow pointers |
| Reverse links | Reverse pointer pattern |
| Two sorted lists | Merge pattern |
| Detect a loop | Fast + slow pointers |
| Two lists share a node | Pointer switching/intersection |
| Palindrome | Middle + reverse + compare |
| Reverse every `k` nodes | Reverse in groups |
| Keep list sorted efficiently | Merge sort |
| Constant-time cache get/put | HashMap + doubly linked list |
| Copy arbitrary random links | HashMap or interleaving |
| Repeated head/tail edge cases | Sentinel node or explicit metadata |

## Complexity Cheat Sheet

| Operation | Complexity | Important condition |
|---|---:|---|
| Access index `i` | `O(n)` | Must follow `next` links |
| Traverse/search | `O(n)` | One visit per node |
| Insert at known head | `O(1)` | Head reference is available |
| Insert at known predecessor | `O(1)` | No traversal included |
| Insert at position | `O(n)` | Finding predecessor requires traversal |
| Delete head | `O(1)` | Return `head.next` |
| Delete by value/position | `O(n)` | Must find predecessor |
| Reverse | `O(n)` | Each link changes once |
| Merge lists of sizes `n,m` | `O(n+m)` | Sorted inputs |
| Merge sort | `O(n log n)` | Sequential split and merge |
| LRU get/put | Expected `O(1)` | HashMap + doubly linked list |

## CodeOfTruth Checklist

Before trusting a solution, verify that the code, diagram, dry run, invariant, null handling, head/tail updates, and complexity all describe the same operations. A traversal hidden inside an insertion method means that complete operation is not `O(1)`.

## Folder Guide

Every folder contains a visual explanation, pointer meanings, invariant, brute-force motivation, optimized template, exact dry-run notes, edge cases, question family, and related patterns. Java files use self-contained node definitions where that makes compilation and learning easier.

## Question Families

### Beginner / Easy
Create, traverse, search, count, insert at head/tail, delete head, reverse, stack, and queue.

### Easy+
Remove nth from end, middle node, duplicate removal, rotate, merge two sorted lists, and intersection.

### Medium
Cycle detection/entry, palindrome, partition, reorder, odd-even, swap pairs, and split into parts.

### Medium+
Reverse between positions, reverse K-group, merge sort, merge K lists, and circular/Josephus problems.

### Hard
Random-pointer deep copy, flatten multilevel lists, constant-space variants, cycle removal, and complex pointer rearrangements.

### Interview / Industry
LRU Cache, custom list API design, iterator behavior, memory ownership, concurrent access assumptions, and choosing a list versus an array or deque.

## Existing Java Examples

- [`CreateAndTraverse.java`](00_Fundamentals/CreateAndTraverse.java) -> builds nodes and walks to `null`.
- [`ReverseIterative.java`](10_Reverse/ReverseIterative.java) -> saves the unread suffix before reversing each link.
- [`MergeTwoSortedLists.java`](12_Merge/MergeTwoSortedLists.java) -> uses a dummy tail and reuses input nodes.
- [`PalindromeList.java`](16_Palindrome/PalindromeList.java) -> reverses the second half, compares, and restores it.
- [`LruCache.java`](28_LRU_Cache/LruCache.java) -> combines HashMap lookup with DLL recency order.

Compiled output is intentionally excluded. Keep `*.class` in the repository `.gitignore` and compile into a temporary output directory when checking examples.
