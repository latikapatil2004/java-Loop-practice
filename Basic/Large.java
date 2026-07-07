import java.util.*;
class Large{
public static void main(String[]args){
  int arr[]={1,2,6,3,5};
  int Largest=Integer.MIN_VALUE;
  for(int i=0;i<arr.length;i++){
  if(arr[i]>Largest){
  Largest=arr[i];
 
  }
  
  }
   System.out.println("Largest is="+Largest);
  
}

}