/*	Can we call one constructor from another constructor? If yes, how?*/


class Student
{
	Student()
	{
		System.out.println("i am default constructor");
	}
	Student(int id,String name)
	{
		this();
		System.out.println("Student id : "+ id);
		System.out.println("Student name : "+name);
	}
	Student(int id,String name,int marks)
	{
		this(id,name);
		System.out.println("Student marks : "+marks);
		
	}
}
class StudentApp
{
	public static void main(String[]args)
	{
		Student s=new Student(101,"latika",89);
	}
}