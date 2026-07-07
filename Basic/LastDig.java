/*
Example: WAP to input  4 digit number and remove its last digit 
Input:  1234
Output: 123
*/


import java.util.*;
 class LastDig{
 public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter te four digit number");
 int number=sc.nextInt();
  System.out.println("before removing the last digit="+number);
 number=number/10;
   System.out.println("after removing the last digit="+number);
   }
   }
 
   