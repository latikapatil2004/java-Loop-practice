/*Question 6: Write a Java program to store 5 numbers in an array
 using constructor and find maximum number.

Description: Create NumberArray class having an integer array.
 Initialize array using constructor. Find maximum number using logic.
INPUT:
Enter 5 numbers: 10 45 22 89 34

OUTPUT:
Maximum number is: 89

EXPLANATION:
Create NumberArray class with int[] array field. 
Use constructor public NumberArray(int[] nums) to initialize array. 
Create method findMax() to find maximum using loop. 
Compare each element and store maximum. Display maximum value.*/


import java.util.Scanner;
class NumberArray
{
	int arr[];
	NumberArray(int[] nums)
	{
		this.arr=nums;
	}
	int findMax()
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
}
class Question6
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the array element");
		 int nums[]=new int[5];
		 for(int i=0;i<nums.length;i++)
		 {
			 nums[i]=sc.nextInt();
		 }
		 NumberArray n=new NumberArray(nums);
		 System.out.println("max number is : " + n.findMax());
	 }
	 
  
}