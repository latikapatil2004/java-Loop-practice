/*Question 23: Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times.
 There can be at most one majority element in the array.
Input:
Array = [4, 8, 4, 6, 7, 4, 4, 8]

Output:
Majority Element = 4

Explanation:
Count the occurrences of every element using nested traversal and if any element 
appears more than n/2 times it is the majority element.*/

  import java.util.Arrays;
public class MajorityApp
{
   public static void main(String x[])
   { 
     Scanner sc=new Scanner(System.in);
	 int a[]=new int[8];
	 
	 System.out.print("enter the element of array");
	 
	 int n=a.length;
	 for(int i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
		 
       }
	    Arrays.sort(a);
        int i=0,count=1;
		System.out.print("Majority element =");
       for(i=1;i<n;i++){
		   if(a[i-1]==a[i])
		   {
			   ++count;
			   if(count>n/2)
			   {
				   System.out.print(" "+a[i]);
			   }
		   }
		   count=1;
		   }
		   
	   }
   }
		   


