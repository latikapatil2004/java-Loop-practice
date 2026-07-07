/*Question 4: Write a Java program to display even & odd index values from an array.
Input:
Array Size = 6
Array Elements = 5 10 15 20 25 30
Output:
Values at Even Index = 5 15 25
Values at Odd Index = 10 20 30
Explanation:
? Index starts from 0.
? Even index positions are 0, 2, 4, ….
? Odd index positions are 1, 3, 5, ….
? We print the values according to their index category.*/
    
	     import java.util.Scanner;
		 class EvenOddIndexApp
		 {
		  public static void main(String[]args)
		  {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter the element");
		   int a[]=new int[5];
		   for(int i=0;i<a.length;i++)
		   {
			    a[i]=sc.nextInt();
		   }
		   	  // even values
	  System.out.print("even values index=");
	  for(int i=0;i<a.length;i++)
	  {
		  if(i%2==0)
		  {
			  System.out.println(a[i]+ " ");
		  }  
		  }
		  
		  // odd values
		   System.out.print("odd values index=");
	  for(int i=0;i<a.length;i++)
	  {
		  if(i%2!=0)
		  {
			  System.out.println(a[i]+ " ");
		  }
		
			  
		  }
		  }
		 }
		 
				