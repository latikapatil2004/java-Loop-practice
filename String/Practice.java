import java.util.Scanner;

class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++) {

            int count = 1;
            boolean visited = false;

            // Check if current element already appeared before
            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    visited = true;
                    break;
                }
            }

            if(visited) {
                continue;
            }

            // Count frequency
            for(int j = i + 1; j < size; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " occur " + count + " times");
        }
    }
}