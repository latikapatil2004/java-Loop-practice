/* Array of object*/

import java.util.Scanner;

class Employee
{
    private int id;
    private int sal;
    private String name;

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setSal(int sal)
    {
        this.sal = sal;
    }

    public int getSal()
    {
        return sal;
    }
}

public class EmployeeArrayObj
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Employee emp[] = new Employee[5];

        // Input
        for(int i = 0; i < emp.length; i++)
        {
            emp[i] = new Employee();

         

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            int sal = sc.nextInt();

            sc.nextLine(); // consume leftover newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            emp[i].setId(id);
            emp[i].setSal(sal);
            emp[i].setName(name);
        }

        // Display
        System.out.println("\nEmployee Details");

        for(int i = 0; i < emp.length; i++)
        {
            System.out.println(
                emp[i].getId() + "\t" +
                emp[i].getSal() + "\t" +
                emp[i].getName()
            );
        }
    }
}