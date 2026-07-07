/*Question 29: Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                For first 50 units Rs. 0.50/unit
                For next 100 units Rs. 0.75/unit
                For next 150 units Rs. 1.20/unit
                For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
Input:
Units = 300

Output:
Total Electricity Bill = Calculated Amount

Explanation:
First 50 units ? 50 × 0.50
Next 100 units ? 100 × 0.75
Next 150 units ? 150 × 1.20
Remaining units ? 50 × 1.50
Total amount is calculated and then 20% surcharge is added */
 
 
 
 import java.util.*;

class Electricity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units:");
        int units = sc.nextInt();

        double bill;

        if(units <= 50) {
            bill = units * 0.50;
        }
        else if(units <= 150) {
            bill = 50 * 0.50 + (units - 50) * 0.75;
        }
        else if(units <= 250) {
            bill = 50*0.50 + 100*0.75 + (units - 150)*1.20;
        }
        else {
            bill = 50*0.50 + 100*0.75 + 150*1.20 + (units - 250)*1.50;
        }

        // Add 20% surcharge
        bill = bill * 1.20;

        System.out.println("Total Electricity Bill = " + bill);
    }
}