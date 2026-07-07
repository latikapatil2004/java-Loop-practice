/*Question 34: Return the first element that repeats in the array.
Input:
Array = [10, 5, 3, 4, 3, 5, 6]

Output:
First repeating element = 5

Explanation:
Check elements from left to right and identify the element whose 
first occurrence appears earlier but repeats later in the array.*/
       import java.util.Scanner;
	   class Repeate
	   {
	    public static void main(String[]args)
		{
		 Scanner sc=new Scanner(System.in);
		 int a[]=new int[5];
		 System.out.print("enter the element");
		  boolean isRepeat=false;
		 
		 for(int i=0;i<a.length;i++)
		 {
		 a[i]=sc.nextInt();
		 }
		  int i=0,j=a.length-1;
		 while(i<j)
		 {
			 if(a[i]!=a[j])
			 {
				 isRepeat=true;
				 break;
			 }

		 }
			 i++;
		   j--;
		
		if(!isRepeat)
		{
			System.out.print("first repeating element= " + a[i]);
		}else 
		{
			System.out.print("not available");
		}
	   
	   }
	   }
	   
	   
