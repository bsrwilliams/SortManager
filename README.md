# Sort Manager

## Quick Links
1. [Bubble Sort](https://github.com/bsrwilliams/SortManager/tree/master/BubbleSort/src/sparta/bradleywilliams)
2. Merge Sort (Coming Soon)
3. Quick sort (Coming Soon)
4. Binary Tree Sort (Coming Soon)

## About The Project
This project contains implementations of the sorting algorithms Bubble sort, Merge sort, Quick sort and Binary Tree. These algorithms were developed using the Java programming language and includes the practice of many features. This project is still in development and I intend to have both iterative and recursive solutions for all algorithms in the future. Another future aim is to add an improved GUI application to provide users with a simple experience whilst showing the algorithms in action.       

### Noteable features:
* JUNIT: Used to test each sorting algorithm against multiple conditions, ensuring correct outputs and also including performance tests.
* SOLID Principles: This project abides by the SOLID principles to follow clean code practices and allow extensibility 
* ENUMS: Enums helped to avoid errors and ensure the correct sorting algorithm was initiated
* Nested Classes: Used for the Node class inside the Binary Tree class, as no other class required the use of the Node class.
* Exceptions: Created custom exceptions such as ChildNotFound and ArrayEmpty
* Logging: Used the Log4j utility tool to log errors 

<h2 align="center">Bubble Sort</h2>
<p align="center">
  <img width="300" height="150" src="https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif">
</p>

This simple sorting algorithm is a comparison based algorithm. Operating by comparing each element in a list to the adjacent element value to derive which element is out of order and swapping their positions. This algorithm continues until the whole list is ordered. Bubble sort is not suitable for large data sets as the average and worst case time complexity is O(n^2) - n is the size of the list. 


<h2 align="center">Merge Sort</h2>
<p align="center">
  <img width="300" height="150" src="https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif">
</p>

Merge sort is an algorithm based on the divide and conquer technique. Sorting a list by first dividing it into multiple single element lists, and then mergeing all lists in a sorted manner - hence Merge sort. Merge sort performs better than bubble sort when large data sets are involved, with a worst-case time complexity of O(n log n).  

<h2 align="center">Quick Sort</h2>
<p align="center">
  <img width="300" height="200" src="https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif">
</p>

Like Merge sort, the Quick sort algorithm is also a divide and conquer technique. Sorting a list by partitioning it into smaller lists. A value in the list is selected as the pivot to divide the list by which values are less than the pivot and which values are greater than the pivot. Quick sort is highly efficient with large data sets, having an average and worst-case time complexity of O(n^2). 

The difference between Quick sort and Merge sort implementations is that in Merge sort most of the work is done by the merge functionality. In Quick sort most of the work happens within the divide functionaiity.  

<h2 align="center">Binary Tree Sort</h2>
<p align="center">
  <img width="300" height="200" src="https://daankolthof.com/wp-content/uploads/2020/01/BST-insertion-animation.gif">
</p>

A Binary Tree contains multiple elements (usually known as Nodes), which have up to a maximum of 2 child Nodes (leafs). The right child Node represents the value(s) that is greater than the current (parent) Node, and the left child Node represent the value(s) less than the current Node. When adding a new element the value is compared to the root Node first and procedes to traverse through the Tree until it reaches an empty (null) child Node. 

### Technologies:
- [Java JDK 11](https://www.oracle.com/uk/java/technologies/javase-jdk11-downloads.html)
- [JUNIT](https://junit.org/junit4/)
- [Maven](https://maven.apache.org/what-is-maven.html)
- [IntelliJ](https://www.jetbrains.com/idea/)
- [Log4j](https://logging.apache.org/log4j/2.x)
