/*Question 1: Write a Java program to create a Student POJO 
class with fields rollNo, name and marks. Use a parameterized 
constructor to initialize values and display student details.

Description: Create a Student class having private data members rollNo,
 name and marks. Initialize values using a constructor and display details
 using an object. Demonstrate object initialization using constructor.
INPUT:
Enter Roll No: 101
Enter Name: Rahul
Enter Marks: 78

OUTPUT:
Student Details:
Roll No: 101
Name: Rahul
Marks: 78

EXPLANATION:
Create Student class with private fields. 
Use parameterized constructor public Student
(int rollNo, String name, int marks) to initialize values. 
Create display method to show details. 
Create object with new Student(101, "Rahul", 78) 
and call display().*/

class Student
{
	private int rollNo;
	private int marks;
	private String name;
	Student(int rollNo,int marks,String name)
	{
		this.rollNo=rollNo;
		this.marks=marks;
		this.name=name;
	}

	 void Display()
	 {
		 System.out.println("rollNo ="+rollNo);
		 System.out.println("marks ="+marks);
		 System.out.println("name ="+name);
	 }
}
   class Question1{
	public static void main(String[]args)
	{
		Student s=new Student(23,90,"Latudya");
		s.Display();
	}
}

