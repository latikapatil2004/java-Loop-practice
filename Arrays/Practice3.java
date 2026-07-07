/*3. Move Zeroes to End

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
👉 Move non-zero forward, zero automatically shifts*/

 
 import java.util.Scanner;
 class Practice3
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int a[]=new int[6];
		System.out.print("enter the number");
		
		
		for(int k=0;k<a.length;k++)
		{
			a[k]=sc.nextInt();
		}
		int i=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=0)
			{
				int temp=a[i];
			    a[i]=a[j];
				a[j]=temp;
				i++;
			}
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(" "+a[k]);
		}
	 }
 }