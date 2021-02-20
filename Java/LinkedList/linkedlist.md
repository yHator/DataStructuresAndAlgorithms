# Linked List Summary

- linear data structure
- elements are stored as per memory availability at runtime
- dynamic in size
- access elements in a linear fashion only
- stores similar elements, ie all chars, all ints, etc.

# Differences from C, C++, etc
- in Java you don't use pointers (they're called references) the same way as you would in C or C++, so each node is an object of class Node 

# Advantages
- dynamic in size
- easy insertion and deletion as it only requires the manipulation of 1 link 

# Disadvantages
- if head Node is lost, the linked list is lost
- no random access possible

# Best Uses
- for storing information when memory is limited
- suitable for frequent insertion and deletion

# Different types of linked lists
- singularly linked list
- doubly linked list
- dummy node linked list
- circularly linked lists (this can include single, double, etc)

# How to implement a singularly linked list:
I included code to implement a singularly linked list (with only a head pointer, but you can add a tail pointer that will make the runtime more efficient, it is just slightly more inconvenient to program). You can compile by calling the following commands:
```sh
javac LinkedList.java
java LinkedList
```

# How to implement a doubly linked list:
I included code to implement a doubly linked list (with only a head pointer, but you can add a tail pointer that will make the runtime more efficient, it is just slightly more inconvenient to program). You can compile by calling the following commands:
```sh
javac DoublyLinkedList.java
java DoublyLinkedList
```

# Comparing Single Link vs. Double Link Performance
(unsorted, no tail pointer)
| Function | Singularly Linked List | Doubly Linked List |
| ------ | - | ------ |
| Insert | O(1) | O(1) |
| Delete |  O(1) | O(1) |
| Search | O(n) | O(n) |


Sources cited: 

- [GeeksforGeeks - Linked List vs Arrays](https://www.geeksforgeeks.org/linked-list-vs-array/)
- [Data Structures and Algorithms using Java](https://www.mygreatlearning.com/blog/data-structures-using-java)
- [Data Structures & Algorithms: Linked Lists](https://medium.com/future-visiondata-structures-algorithms-linked-lists-fc0b8a82d609)
