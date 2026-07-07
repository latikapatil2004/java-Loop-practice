/*Question 9: Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment*/

   import java.util.Scanner;
    class CopyApp
	{
	public static void main(String[]args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.print("enter the element");
		 int a[]=new int[5];
		 int b[]=new int[5];
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
			 
		 }
		 System.out.print("array2 =");
		 for(int i=0;i<a.length;i++)
		 {
			 b[i]=a[i];
			 System.out.print(b[i] + " "); 
		 }
	}
	}
	