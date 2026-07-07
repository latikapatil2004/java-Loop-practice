class Target{
 public static void main(String[]args){
   int nums[]={1,2,3,0,4,5,6};
   int count=0,target=1;
   for(int i=0;i<nums.length;i++){
   if(nums[i]==target){
	  break;
     }
	  count++;
   } System.out.println(count);
   }
   }