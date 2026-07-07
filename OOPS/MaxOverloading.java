/*Question 22: Write a Java program to implement an Array Maximum Finder using Method Overloading.
Create a class ArrayMax and overload method max():
- max(int arr[]) => Find the largest element
- max(int arr[], int size) => Find the smallest element
Input:
Enter array elements : 12 7 45 20 33

Output:
Largest Number : 45
Smallest Number : 7

Explanation:
max(arr):
- Starts with arr[0] = 12 as initial maximum.
- Compares each element: 12, 7, 45, 20, 33.
- 45 is the largest. Prints Largest Number : 45.
max(arr, size):
- Starts with arr[0] = 12 as initial minimum.
- Compares each element: 12, 7, 45, 20, 33.
- 7 is the smallest. Prints Smallest Number : 7.
Despite similar names, each overload performs a distinct operation.
This demonstrates max/min search in arrays using method overloading.*/

import java.util.Scanner;
class max