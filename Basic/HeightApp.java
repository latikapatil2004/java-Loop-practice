import java.util.Scanner;

class Manufacture {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int W = sc.nextInt();

        if (W % 2 != 0 || W < 2*V || W > 4*V) {
            System.out.println("Invalid Input");
        } 
        else {
            int FW = (W - 2*V) / 2;
            int TW = V - FW;

            System.out.println("TW=" + TW);
            System.out.println("FW=" + FW);
        }
    }
}