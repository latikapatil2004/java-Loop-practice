/*/*
Question 1: Create a base class Employee with attributes name and salary.
Create a child class Manager that adds bonus.
Calculate total salary using inheritance.

Description
This program demonstrates single inheritance where Manager inherits from Employee.
The child class extends functionality by adding a bonus and calculating total salary.

Input
Enter Name: Rahul
Enter Salary: 50000
Enter Bonus: 10000

Output
Employee Name: Rahul
Base Salary: 50000
Bonus: 10000
Total Salary: 60000

*/

class Employee{
	public void show(){
		System.out.println("I am Employee class.");
	}
}
class Manager extends Employee{
	public void getShow(){
		System.out.println("I am Manager class.");
	}
}
public class Demo{
	public static void main(String[] args){
		
		Employee emp = new Manager(); // Upcasting
		// emp.show();
		
		Manager man = (Manager) emp; // Downcasting
		man.getShow();
		man.show();
	}
}