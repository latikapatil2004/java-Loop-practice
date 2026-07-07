

class Book
{
	int bookid;
	String bookname;
	int bookprice;
	Book(int id ,String name,int price)
	{
		bookid=id;
		bookname=name;
		bookprice=price;
	}
	int getId()
	{
		return bookid;
	}
	String getName()
	{
		return bookname;
	}
	int getPrice()
	{
		return bookprice;
	}
	
}
class Library
{
	public static void main(String[]args)
	{
		Book b=new Book(101,"Let Us C", 2000);
		System.out.println("Book details :" + b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
	}
}
