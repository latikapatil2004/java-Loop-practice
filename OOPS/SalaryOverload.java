/*Question 18: Write a Java program to implement a Salary Calculator using Method Overloading.
Create a class Salary and overload method salary():
- salary(int basic) => Print basic salary
- salary(int basic, int bonus) => Calculate total salary
- salary(int basic, int bonus, int tax) => Calculate final salary after tax
Input:
Enter Basic Salary : 20000
Enter Bonus : 5000
Enter Tax : 2000

Output:
Basic Salary : 20000
Total Salary : 25000
Final Salary : 23000

Explanation:
Three overloaded versions of salary() are created:
salary(20000):
- Prints Basic Salary = 20000 directly.
salary(20000, 5000):
- Total Salary = basic + bonus = 20000 + 5000 = 25000.
salary(20000, 5000, 2000):
- Final Salary = Total Salary - Tax = 25000 - 2000 = 23000.
Each version is called in sequence and Java picks the correct overload.
This demonstrates real-world payroll logic using method overloading.*/

 
 import java.util.Scanner;

class Salary
{
    static void salary(int basic)
    {
        System.out.println("basic salary = " + basic);
    }

    static void salary(int basic,int bonus)
    {
        int totalSalary = basic + bonus;

        System.out.println("total salary = " + totalSalary);
    }

    static void salary(int basic,int bonus,int tax)
    {
        int finalSalary = basic + bonus - tax;

        System.out.println("final salary = " + finalSalary);
    }
}

class SalaryOverload
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter basic salary");
        int basic = sc.nextInt();

        System.out.println("enter bonus");
        int bonus = sc.nextInt();

        System.out.println("enter tax");
        int tax = sc.nextInt();

        Salary.salary(basic);

        Salary.salary(basic,bonus);

        Salary.salary(basic,bonus,tax);
    }
}