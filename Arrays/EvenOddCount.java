/*Question 5: Write a Java program to count even & odd values from an array.
Input:
Array Size = 7
Array Elements = 12 17 24 39 40 55 70
Output:
Count of Even Values = 4
Count of Odd Values = 3
Explanation:
? Initialize counters: evenCount = 0, oddCount = 0.
? For each element in the array:

? If divisible by 2 ? increase evenCount.
? Otherwise ? increase oddCount.

? Final counts are displayed*/
     import java.util.Scanner;
	 class EvenOddCount
	 {
	  public static void main(String[]args)
	  {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("display the elements");
	   int a[]=new int[7];
	   for(int i=0;i<a.length;i++)
	   {
	     a[i]=sc.nextInt();
		 }
		 
		 //count even
		 System.out.print("Count of Even Values=");
		 int evencount=0;
		 for(int i=0;i<a.length;i++)
		 {
		  if(a[i]%2==0)
		  {
		   evencount++;
		    
		   }
		   }
		   System.out.println(evencount + " ");
		   
		   //count odd
		   System.out.print("Count of odd Values=");
		     int oddcount=0;
		   for(int i=0;i<a.length;i++)
		 {
		  if(a[i]%2!=0)
		  {
		   oddcount++;
		  
		   }
		   
		   }
		    System.out.println(oddcount + " ");
		   }
		   }
		   
	   