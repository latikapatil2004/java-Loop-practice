
import java.util.*;
class Rate{
 public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the rating");
   int rating=sc.nextInt();
   String bouns= rating>8 ?"15% bonus" : rating>=5 && rating<=8 ?"10 % bonus" :"no bonus";
   System.out.println(bouns);
   }
   } 