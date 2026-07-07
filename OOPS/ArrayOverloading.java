/*Question 21: Write a Java program to implement an Array Sum Calculator using Method Overloading.
Create a class ArrayOperation and overload method sum():
- sum(int arr[]) => Find sum of all array elements
- sum(int arr[], int size) => Find average of array elements
Input:
Enter array elements : 10 20 30 40 50

Output:
Sum : 150
Average : 30

Explanation:
sum(arr):
- Iterates through the array and adds all elements.
- 10 + 20 + 30 + 40 + 50 = 150. Prints Sum : 150.
sum(arr, size):
- Calculates average = total sum / number of elements.
- Average = 150 / 5 = 30. Prints Average : 30.
Both methods take the same array but differ by second parameter.
Java selects the correct overloaded method based on arguments passed.
This program teaches array traversal and aggregate operations with overloading.*/
import java.util.Scanner;
class Array{

	void sum(int arr[])
	{
			int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Array of sum is="+sum);
	}
	void sum(int arr[],int size)
	{
			int sum=0;
			
		 for(int i=0;i<arr.length;i++)
		 {
			 sum=sum+arr[i];
			 
		 }
		 int avg=sum/size;
		 System.out.println("Array of avg is="+avg);
	}
 }
 class ArrayOverloading
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size");
		 int size=sc.nextInt();
		 System.out.println("enter the array elements");
		 int arr[]=new int[size];
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 
		 Array a=new Array();
         a.sum(arr);
		 a.sum(arr,size);
	 }
 }