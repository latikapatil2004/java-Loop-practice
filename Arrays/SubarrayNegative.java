/*Question 88: First Negative Number in Every Window of Size K
Problem Statement

Given an array, find the first negative number in every window of size K.

If no negative number exists ? print 0.
Input:
Array = [12, -1, -7, 8, -15, 30, 16, 28]
K = 3

Output:
[-1, -1, -7, -15, -15, 0]

Explanation:
Windows:
[12,-1,-7] ? first negative = -1
[-1,-7,8] ? -1
[-7,8,-15] ? -7
[8,-15,30] ? -15
[-15,30,16] ? -15
[30,16,28] ? none ? 0*/

 
 class SubarrayNegative
 {
	 public static void main(String[]args)
	 {
		 int arr[]={12, -1, -7, 8, -15, 30, 16, 28};
		 int k=3;
		 for(int i=k;i<arr.length;i++)
		 {
			 arr[i]=arr[i]+arr[i-1];
			  if(arr[i-k]<0)
			 {
				 System.out.print(arr[i-k]);
			 }
		 }
	 }
 }