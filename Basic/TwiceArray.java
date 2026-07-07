import java.util.*;
class TwiceArray{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  boolean isFound=false;
  int n=sc.nextInt();
  int arr[] = new int[n];
     for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
	for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
	 if(arr[i]==arr[j]){
	 isFound=true;
	 System.out.println("false");
	 }
	 }
	 }
	  if(isFound){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}