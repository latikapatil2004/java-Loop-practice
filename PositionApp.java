/*Question 10: Write a program in java to delete an element at desired position from an array.
Input the size of array : 5

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to delete : 3

Expected Output : The new list is : 1 2 3 5*/

   import java.util.Scanner;
   class PositionApp
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 int a[]=new int[5];
    System.out.println("enter the element");
	 for(int i=0;i<a.length;i++)
	 {
	  a[i]=sc.nextInt();
	  }
	 System.out.print("enter the position where to delete ");
	 int pos=sc.nextInt();
	 int idx=pos-1;
	 
	 //  shifting
	 for(int i=idx;i<a.length-1;i++)
	 {
		 a[i]=a[i+1];
	 }
	 
	 System.out.print("new array ");
	 for(int i=0;i<a.length-1;i++)
	 {
	  System.out.print( a[i] +" ");
	  }
   }
   }
   
   
	
		   
	  
	 