/*Question 12: Write a Java program to create a Movie class and count how 
many movies have rating greater than 4.

Description: Create Movie class with movieId, movieName and rating. 
Initialize using constructor. Store movie objects and count movies having rating above 4.
INPUT:
Enter 4 Movies:
1 Leo 4.5
2 Jawan 3.8
3 Pathan 4.2
4 Tiger 3.5

OUTPUT:
Movies with rating above 4: 2

EXPLANATION:
Create Movie class with fields movieId, movieName, rating. Use constructor to initialize. 
Create Movie[] array to store movies. Loop through array, check if rating > 4.0 
and increment counter. Display count of movies with rating > 4.*/


import java.util.Scanner;
class Movie
{
	int movieId;
	String movieName;
	double rating;
	Movie(int movieId,String movieName,double rating)
	{
		this.movieId=movieId;
		this.movieName=movieName;
		this.rating=rating;
	}
	double getrating()
	{
		return rating;
	}
	 
}

class Question12
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);

	  Movie[] movies = new Movie[4];
	  System.out.println("enter the 4 Movie details");
	
	for(int i=0;i<movies.length;i++)
	{
	 System.out.println("Enter Movie Id:");
      int id = sc.nextInt();

      System.out.println("Enter Movie Name:");
      String name = sc.next();

      System.out.println("Enter Rating:");
      double rating = sc.nextDouble();

    movies[i] = new Movie(id,name,rating);
	
		
	}	
	int count=0;

	for(int i=0;i<4;i++)
	{
		if(movies[i].getrating()>4.0)
		{
			count++;
		}
	}
	System.out.println("Movies with rating above 4 :" + count);
}
}
