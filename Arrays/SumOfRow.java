/*Example: WAP to create a 3 x 3 matrix and calculate the sum of every row.
*/


 import java.util.Scanner;
  class SumOfRow
   {
    public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.print("enter the number");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			 int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[i][j];
				System.out.print(" "+a[i][j]);
			}
			
	System.out.println( " = "+sum);
	}
   }
   }