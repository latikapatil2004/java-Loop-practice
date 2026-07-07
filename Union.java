/*Question 28: Write a java program to find the union array of two unsorted arrays.
Input:
Array1 = [1, 2, 3]
Array2 = [2, 3, 4, 5]

Output:
Union Array = [1, 2, 3, 4, 5]

Explanation:
Combine both arrays and remove duplicate elements so that each value appears only once*/

import java.util.Scanner;

class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
		int b[]=new int [5];
		int c[]=new int[a.length+b.length];
        
        System.out.print("Enter  value of a array ");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }
		
		 System.out.print("Enter  value of b array ");
		 for(int i=0;i<b.length;i++)
		 {
			 b[i]=sc.nextInt();
		 }
		 
		 
		  for (int i = 0; i < a.length; i++) 
		  {
           c[i]=a[i];
          }
		  
		  int k=a.length;
		 for (int i = 0; i < b.length; i++) 
		 {
            c[k] = b[i];
			k++;
		 }
		
		for(int i=0;i<c.length;i++)
		{
			
			System.out.print(" "+c[i]);
			
		}
	}
}
