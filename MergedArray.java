/*Question 48: Write a java program to merge of two given array.
Input:
Array1 = [1, 2, 3, 4, 5]
Array2 = [6, 7, 8, 9, 10]

Output:
Merged Array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Explanation:
Copy all elements of the first array followed by elements of the second array into a new array.*/


  import java.util.Scanner;
  class MergedArray
  {
    public static void main(String[]args)
	{
	    Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		System.out.println("enter the array1 element");
		int b[]=new int[5];
		System.out.println("enter the array2 element");
		
		int k[] = new int[a.length + b.length];
		
		for(int  i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int  j=0;j<b.length;j++)
		{
			b[j]=sc.nextInt();
		}
		
		
		int i=0,j=b.length-1,index=0;
		while(i < a.length && j>=0)
		{
			k[index]=a[i];
			index++;
			k[index]=b[j];
		    index++;
			i++;
		   j--;
		}
		 
		
		System.out.println("merged array =");
		 for(int k=idex;k<index;k++)
		 {
			 System.out.println(a[k]);
		 }
	}
  }