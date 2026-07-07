import java.util.Scanner;
class Matrix
{
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		
		System.out.println("enter values in matrix");
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
		  {
			a[i][j]=sc.nextInt();
		  
		  }
		}
		 System.out.println("display the matrix");
		for( int i=0;i<a.length;i++)
			{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
