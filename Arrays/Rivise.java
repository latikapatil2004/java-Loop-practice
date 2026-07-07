/*Question 37: Count the number of prime numbers in an array.
Input:
Array = [2, 5, 6, 9, 11]

Output:
Count of Prime Numbers = 3

Explanation:
Check each element to see if it is divisible only by 1 and itself and count such numbers.*/

 import java.util.Scanner;
 class Rivise
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
		 int prime=0;
		 for(int i=0;i<a.length;i++)
		 {
			 int count=0;
			 for(int j=1;j<=a[i];j++)
			 {
				 if(a[i]%j==0)
				 {
					 count++;
				 }
			 }
			 if(count==2)
		    {
			 prime++;
		    }
		 }
		 System.out.println("no of prime no count"+prime);
		 
	 }
 }
