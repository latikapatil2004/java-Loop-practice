/*Question 25: Write a java program to find the total number of notes in a given amount.
Input:
Amount = 2528

Output
500 = 5
100 = 0
50 = 0
20 = 1
10 = 0
5 = 1
2 = 1
1 = 1

Explanation:
The amount is divided starting from the highest denomination to the lowest to calculate the number of notes.*/

 import java.util.*;

class NotesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        int n500,n100,n50,n20,n10,n5,n2,n1;
       n500= amount / 500;
        System.out.println("500 = " + note);
        amount = amount % 500;

        n100 = amount / 100;
        System.out.println("100 = " + note);
        amount = amount % 100;

        n50 = amount / 50;
        System.out.println("50 = " + note);
        amount = amount % 50;

        n20 = amount / 20;
        System.out.println("20 = " + note);
        amount = amount % 20;

        n10 = amount / 10;
        System.out.println("10 = " + note);
        amount = amount % 10;

        n5= amount / 5;
        System.out.println("5 = " + note);
        amount = amount % 5;

        n2= amount / 2;
        System.out.println("2 = " + note);
        amount = amount % 2;

        n1= amount / 1;
		  
		  System.out.println("500= "n500); 
		   System.out.println("500= "n100);
		   System.out.println("500= "n50);
		    System.out.println("500= "n20);
		   System.out.println("500= "n10);
		    System.out.println("500= "n5);
			 System.out.println("500= "n2 );
			  System.out.println("500= "n1 );
    }
}