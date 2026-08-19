# Linked List - Complete DSA Roadmap

A linked list is a chain of nodes. Each node stores a value and a reference to the next node.

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

## CodeOfTruth Checklist

Before trusting a solution, verify that the code, diagram, dry run, invariant, null handling, head/tail updates, and complexity all describe the same operations. A traversal hidden inside an insertion method means that complete operation is not `O(1)`.

## Folder Guide

Every folder contains a visual explanation, pointer meanings, invariant, brute-force motivation, optimized template, exact dry-run notes, edge cases, question family, and related patterns. Java files use self-contained node definitions where that makes compilation and learning easier.
