#Array Summary

- linear data structure
- elements are stored in contiguous memory locations 
- an array is actually an object, so a variable of type int[] contains a pointer to the array object
- stores similar elements, ie all chars, all ints, etc.

# Differences from C, C++, etc
- in Java there is just one way to make an array: 
```sh
$ int A[] = new int[100];
```
- you can't use pointers to declare them!

# Advantages
- random access
- easy sorting and iteration 
- replacement of multiple variables

# Disadvantages
- size is fixed
- difficult to insert and delete
- needs contiguous memory to get allocated

# Best Uses
- for storing information in a linear fashion
- suitable for frequent searching

# Different ways to implement an array:
```sh
//grammar: type varName[]; OR type[] varName;
int intArray[];
int[] intArray;

//you can also make an array of objects
//grammar: ClassName classArray[];
Person people[];

//so far we have only described unallocated arrays, ie we have only made references to arrays
int intArray = new int[20]; //actually allocates memory to array
int[] intArray = new int[20]; //equivalent to the above line

//you can also make an array literal ie define the values you want to put in the array
int[] intArray = new int[]{1,2,3,4};
``` 
# Code File

I included some code in Java to make arrays. You can compile by doing the following:
```sh
javac arraySample.java
java ArraySample
Sources cited: 
```
- [GeeksforGeeks-Arrays in Java](https://www.geeksforgeeks.org/arrays-in-java/)
- [Arrays and Pointers](http://www2.lawrence.edu/fast/GREGGJ/CMSC270/Pointers/arrays_and_pointers.html)
- [Data Structures and Algorithms using Java](https://www.mygreatlearning.com/blog/data-structures-using-java/)
