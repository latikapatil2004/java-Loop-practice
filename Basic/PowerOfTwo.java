class PowerOfTwo{
 public static void main(String[]args){
   int n=13;
   if ((n & (n - 1)) == 0) {
   System.out.println("number is power of two");
   }else{
	   System.out.println("number is not  power of two");
   }
   }
}