/*2. Pair with Given Sum (Sorted)

Input: [1,2,3,4,6], Target = 6
Output: (2,4)
👉 One pointer left, one right → move based on sum*/

import java.util.Scanner;
 class Practice2
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int a[]=new int[5];
		System.out.print("enter the number");
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter thr target");
		int target=sc.nextInt();
	   int i=0; int j=a.length-1;
		while(i>j)
		{
			int sum=a[i]+a[j];
			if(sum==target)
			{
				  System.out.println("Pair found: " + a[i] + " " + a[j]);
				return;
			}
			else if(sum<target)
			{
				i++;
			}
			else 
			{
				j--;
			}
		}
		
System.out.println("No pair found");
          
	}
}
		
 
 