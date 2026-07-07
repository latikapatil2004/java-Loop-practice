import java.util.*;

class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};

        Arrays.sort(nums);  // step 1: sort
        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                    left++;
                    right--;
                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
    }
}