/*Question 3: Write a Java program to demonstrate constructor overloading using a Book class.

Description: Create Book class with bookId, bookName and price. Create one default constructor 
and one parameterized constructor. Display values initialized by both constructors.
INPUT:
(Default constructor gives default values)
Enter Book Id: 11
Enter Book Name: Java Basics
Enter Price: 450

OUTPUT:
Book from Default Constructor:
Book Id: 0
Book Name: Unknown
Price: 0

Book from Parameterized Constructor:
Book Id: 11
Book Name: Java Basics
Price: 450

EXPLANATION:
Create two constructors: public Book() { bookId=0; bookName="Unknown"; price=0;
 } and public Book(int id, String name, int p) { bookId=id; bookName=name;
 price=p; }. Demonstrate both by creating two objects.*/
 
 
import java.util.Scanner;

class Book
{
    int bookId;
    String bookName;
    int price;

    Book()
    {
        bookId = 0;
        bookName = "Unknown";
        price = 0;
    }

    Book(int id, String name, int p)
    {
        bookId = id;
        bookName = name;
        price = p;
    }

    void display()
    {
        System.out.println("Book Id: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: " + price);
    }
}

public class Question3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        int price = sc.nextInt();

        Book b1 = new Book();

        Book b2 = new Book(id, name, price);

        System.out.println("\nBook from Default Constructor:");
        b1.display();

        System.out.println("\nBook from Parameterized Constructor:");
        b2.display();
    }
}