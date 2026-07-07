/*Question 34: Write a java program to find the frequency of each digit in a given integer.
Input:

Number = 112233

Output:

1 occurs 2 times
2 occurs 2 times
3 occurs 2 times

Explanation:

The program counts how many times each digit appears in the number.
Each digit is extracted and its count is increase*/

  import java.util.*;
   class FrequencyNum
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int number=sc.nextInt(); 
	
	 for(int i=0;i<9;i++)
	 {
		 int temp=number;
		  int counter=0;
	  while(temp>0)
	  {
		int digit=temp%10;
		 if(digit==i)
		 {
			 counter++;
	     } 
	       temp=temp/10;
	}
	
	if(counter>0)
	{  System.out.println(i + " occurs " + counter + " times");
	}
	 }
	}
   }
		