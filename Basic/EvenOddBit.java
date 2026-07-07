import java.util.*;
class EvenOddBi{
 public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
    int n=sc.nextInt();
	int bit=1;
	if((n & bit)==0){
	System.out.println("even");
	}
	else{
System.out.println("odd");
}
}
}