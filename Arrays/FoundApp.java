/*Question 6: Write a java program to search an element in an array , its element found or not.
Input:
Array = {10, 20, 30, 40, 50}
Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches,
 print "found" with index; otherwise print "not found".*/
    
	  import java.util.Scanner;
	  class FoundApp
	  {
	   public static void main(String[]args)
	   {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("display the elemnts");
		  int a[]=new int[5];
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  System.out.print("element to search");
		  int search =sc.nextInt();
		  for(int i=0;i<a.length;i++)
			{
				if(a[i]==search)
				{
					System.out.print("element "+search + " found at index"  +  i );
				}
			}
			System.out.println("not found");
	   }
	  }
			  
		  