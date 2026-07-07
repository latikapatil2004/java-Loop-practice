/*Question 27: Write a java program to input marks of five subjects Physics, Chemistry, Biology,
       Mathematics and Computer, calculate percentage and grade according to given conditions:
                    percentage >= 90% : Grade A
                    percentage >= 80% : Grade B
                    percentage >= 70% : Grade C
                    percentage >= 60% : Grade D
                    percentage >= 40% : Grade E
                    percentage < 40% : Grade F
Input:
Physics = 85
Chemistry = 80
Biology = 75
Mathematics = 90
Computer = 70

Output:
Percentage = 80%
Grade = B

Explanation:
Total Marks = 85 + 80 + 75 + 90 + 70 = 400
Percentage = 400 / 5 = 80%
Since percentage is 80%, Grade B is assigned.*/
import java.util.*;
class StudenttApp{
  public static void main(String[]args) 
  { 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the marks of all five subjects");
  int physics=sc.nextInt();
  int chemistry=sc.nextInt();
  int math=sc.nextInt();
  int bio=sc.nextInt();
  int computer=sc.nextInt();
  int total=physics+chemistry+math+bio+computer;
  int percentage=(total/500)*100;
  System.out.println("percentage is =" +percentage);
	if( percentage >= 90)
	 {
	 System.out.println("Grade A");
	 } 
	 else if(percentage >= 80)
	 {
	  System.out.println("Grade B");
	 }
	 else if( percentage >= 70)
	 {
	  System.out.println("Grade C");
	 }
					
	 else if(percentage >= 60)
	 {
	  System.out.println("Grade D");
	 }
	 else if( percentage >= 40 )
	 {
	  System.out.println("Grade E");
	 }
	  else{
		System.out.println("Grade F");
		}
	}
}
					