/*Example: WAP to find the missing number from sorted array 
1   5    6   8     10

Output:  2   3  4     7   9
*/
 import java.util.Scanner;
   class Missing
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 	int a[]=new int[5];
		System.out.print("enter the element ");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=a[i]+1;j<a[i+1];j++)
				{
					System.out.print(j+" ");
					
					
				}
			}
	}
   }
   