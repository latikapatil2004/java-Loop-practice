/*Question 31: Write a java program to display 1 to nth Duck Number.
Input:

n = 5

Output:

10 20 30 40 50

Explanation:

Duck numbers contain zero inside the number.
The first five Duck Numbers are 10, 20, 30, 40, and 50.*/

  import java.util.*;

class DuckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int count = 0;
        int i = 1;

        while (count < n) {
            int temp = i;
            boolean flag = false;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit == 0) {
                    flag = true;
                    break;
                }

                temp = temp / 10;
            }

            if (flag) {
                System.out.print(i + " ");
                count++;
            }

            i++;
        }
    }
}
		
	     