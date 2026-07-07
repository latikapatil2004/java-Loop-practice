/*Question 9: Write a Java program to calculate average of three subject marks using constructor.

Description: Create Result class with three subject marks. Initialize using constructor.
 Calculate average and display result.
INPUT:
Enter Marks: 70 80 90

OUTPUT:
Average Marks: 80

EXPLANATION:
Create Result class with fields mark1, mark2, mark3. 
Use constructor public Result(int m1, int m2, int m3) to initialize. 
Calculate average as (m1 + m2 + m3) / 3. Create method displayAverage() to print average. 
Create object new Result(70, 80, 90) and display average.*/

 
 import java.util.Scanner;
class Result
{
   int mark1;
   int mark2;
   int mark3;
   
   Result(int m1,int m2,int m3)
   {
    this.mark1=m1;
	this.mark2=m2;
	this.mark3=m2;
   }
  void display()
  {
	int avg=(mark1+mark2+mark3)/3;
	System.out.println("Average : " + avg);
  }
}
  
  class Question9
  {
	  public static void main(String []args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("enter the mark1 : ");
		  int mark1=sc.nextInt();
		  System.out.print("enter the mark2 : ");
		  int mark2=sc.nextInt();
		   System.out.print("enter the mark3 : ");
		  int mark3=sc.nextInt();
		  Result r=new Result(mark1,mark2,mark3);
		  r.display();
	  }
  }
