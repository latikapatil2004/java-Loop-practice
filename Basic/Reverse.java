/*Question 21: Write a Java program to reverse a number without using a loop.
Input:
123

Output:
321

Explanation:
Digits are separated using arithmetic operations and rearranged in reverse order without using loops.*/
   class Reverse{
    public static void main(String[]args){
	 int number=123;
	 number=(number%10)*100+((number/10)%10)*10+(number/100);
	 System.out.println("reverse of the no is="+ number);
	 }
	 }
	 