/*Question 28: Write a Java program to calculate the net salary of an employee.
Input:
Basic = 20000
HRA = 10%
DA = 5%
Tax = 2%

Output:
Net Salary = 22600

Explanation:
HRA and DA are calculated as percentages of the basic salary and added to it.
Tax is deducted after adding allowances to compute the final net salary.*/
 class EmployeeSalaryApp {
    public static void main(String[] args) {

        int bs = 1000;
        int da = bs * 30 / 100;
        int hra = bs * 30 / 100;

        int total = bs + da + hra;

        System.out.println("Total Salary = " + total);
    }
}