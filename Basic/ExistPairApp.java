import java.util.*;
class ExistPairApp{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  boolean flag=true;
  int target=6;
   int arr[]=new int[5];
   System.out.println("enter the arrays element");
   for(int i=0;i<arr.length;i++){
	   arr[i]=sc.nextInt();
   for(int j=i+1;j<arr.length;j++){
   if(arr[i]+arr[j]==target){
     System.out.println(arr[i] +" "+arr[j] );
	 flag=true;
	 }
	 }
	 }
	 if(flag==false){
		 System.out.println("pairs not found");
	 }
  }
}