/*Question 27: Write a java program to count the frequency of each element in a given array.
Input:
Array = [1, 2, 2, 3, 3, 3, 4]

Output:
1 ? 1 time
2 ? 2 times
3 ? 3 times
4 ? 1 time

Explanation:
For each element in the array, count the number of occurrences by comparing it with all other elements*/

import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        System.out.print("Enter array elements: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int count = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.println(a[i - 1] + " occurs " + count + " times");
                count = 1;
            }
        }

        System.out.println(a[a.length - 1] + " occurs " + count + " times");
    }
}