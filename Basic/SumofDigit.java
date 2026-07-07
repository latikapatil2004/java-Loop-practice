/*Question 20: Write a Java program to compute the sum of digits of an integer.
Input:
123

Output:
6

Explanation:
Each digit is separated using modulus and division operations.
1 + 2 + 3 = 6.
*/
class SumofDigit{
 public static void main(String[]args){
 int number=123;
 int sum=(number%10)+(number/10)%10+(number/100);
   System.out.println(sum);
   }
   }
