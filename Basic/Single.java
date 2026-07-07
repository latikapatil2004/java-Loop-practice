import java.util.*;
class Single {
public static void main(String[]args){
  int arr[]={2, 3, 2, 4, 3};
   int result=0;
  for(int i=0;i<arr.length;i++){
	  result=result^arr[i];
	}
	System.out.println("single number="+result);
	}
}
	