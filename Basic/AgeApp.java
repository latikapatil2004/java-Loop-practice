/*Question 36: Check if a person is a child, teenager, adult, or senior based on age.

   Input: Age
   Logic: if-else if
   Output: Age category.
Input:
Age = 16

Output
Teenager

Explanation:
Age < 13 ? Child
13–19 ? Teenager
20–59 ? Adult
60+ ? Senior  */
   import java.util.Scanner;
   class AgeApp{
    public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	if(age<13)
	{
	System.out.println("Child");
	} 
	else if(age>=13 && age<=19 )
	{
	System.out.println("Teenager");
	}
	else if(age>=20 && age<=59)
	{
	  System.out.println("Adult");
	  }
	  else if(age>=60)
	  {
	  System.out.println("Senior ");
	  }
	  }
	  }