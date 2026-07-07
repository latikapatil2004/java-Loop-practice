/*Scenario 1: Library Management System
Business Requirement
A college library wants to maintain information about all books available in the library. The librarian should be able to:
•	Add new books.
•	Search books.
•	Issue books to students.
•	Count the total number of books.
________________________________________
Why Do We Need a Class?
Every book has common properties:
•	Book ID
•	Title
•	Author
•	Price
•	Status (Issued/Available)
Instead of creating separate variables for every book, we create a Book class.
________________________________________
Objects : Each real book becomes an object.
Examples:
•	Book Object 1 → Java Programming
•	Book Object 2 → Python Programming
•	Book Object 3 → Database Management System
________________________________________
Instance Variables
Each book has its own:
bookId
title
author
price
status
These values are different for every object.
________________________________________
Static Variables
libraryName
totalBooks
These values are common for all books.
________________________________________
Array of Objects
The library stores multiple books.
Book[] books = new Book[1000];
________________________________________
Example Data
Book Id	Title	Author	Price
101	Java	James Gosling	500
102	Python	Guido	450
103	DBMS	Korth	600
________________________________________
Test Cases
Test Case 1
Input:
Add 3 books.
Expected Output:
totalBooks = 3
________________________________________
Test Case 2
Input:
Issue Book 101.
Expected Output:
Book Status = Issued
________________________________________
Test Case 3
Input:
Change library name.
Expected Output:
All books show new library name.*/



import java.util.Scanner;

	class Book
	{
	int bookId;
	String title;
	String Author;
	int price;
	String status;
	static String libraryName= "ABC Library";
	static int totalBooks=0;
	
	Books(int bookId,String title,String Author,int price)
	String status)
	{
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
		this.status="Available";
		totalBooks++;
	}
	
	void display()
	{
		System.out.println("Library Name : " + libraryName);
        System.out.println("Book ID      : " + bookId);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : " + price);
        System.out.println("Status       : " + status);
	}
	class Library
    {
    Book[] books = new Book[1000];
    int count = 0;

    void addBook(Book b)
    {
        books[count] = b;
        count++;
    }

    void searchBook(int searchId)
    {
        for(int i = 0; i < count; i++)
        {
            if(books[i].bookId == searchId)
            {
                System.out.println("Book Found:");
                books[i].display();
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    void issueBook(int searchId)
    {
        for(int i = 0; i < count; i++)
        {
            if(books[i].bookId == searchId)
            {
                books[i].status = "Issued";
                System.out.println("Book Issued Successfully");
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    void displayTotalBooks()
    {
        System.out.println("Total Books = " + Book.totalBooks);
    }
}

public class LibraryManagementSystem
{
    public static void main(String[] args)
    {
        Library lib = new Library();

        Book b1 = new Book(101, "Java", "James Gosling", 500);
        Book b2 = new Book(102, "Python", "Guido", 450);
        Book b3 = new Book(103, "DBMS", "Korth", 600);

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.displayTotalBooks();

        lib.searchBook(102);

        lib.issueBook(101);

        lib.searchBook(101);

        Book.libraryName = "SSVPS Library";

        b1.display();
        b2.display();
        b3.display();
    }
}