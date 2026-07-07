/*Question 38: Count the number of Perfect numbers in an array.
Input:
Array = [6, 28, 10, 12, 496]

Output:
Count of Perfect Numbers = 3

Explanation:
For each element calculate the sum of its divisors and if the sum equals the number then it is a perfect number.*/

 import java.util.Scanner;
 class PerfectCount
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size");
		 int  size=sc.nextInt();
		 int a[]=new int[size];
		 System.out.println("enter the array element");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 int count=0;
		 for(int i=0;i<a.length;i++)
		 {
			 int sum=0;
			 for(int j=1;j<a[i];j++)
			 {
				 if(a[i]%j==0)
				 {
					 sum+=j;
				 }
			 }
			 if(sum==a[i])
			 {
				 count++;
			 }
			 
			 
		 }
		 System.out.println("perfect no count="+count);
	 }
 }
 
		 