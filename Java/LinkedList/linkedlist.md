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

# How to implement a linked list:
I included code to implement a linked list. You can compile by calling the following commands:
```sh
javac arraySample.java
java ArraySample
```
Sources cited: 

- [GeeksforGeeks - Linked List vs Arrays](https://www.geeksforgeeks.org/linked-list-vs-array/)
- [Data Structures and Algorithms using Java](https://www.mygreatlearning.com/blog/data-structures-using-java/)
