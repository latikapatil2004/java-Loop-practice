/*Question 18: Write a Java program to convert days into years, months, and weeks.
Input:
Days = 400

Output:
Years = 1
Months = 1
Weeks = 1

Explanation:
1 year = 365 days.
After subtracting 365 days, the remaining days are divided into months (30 days each) and weeks (7 days each).*/  
 
  class Days {
    public static void main(String[] args) {
        int Days = 400;

        int year = Days / 365;
        int months = (Days % 365) / 30;
        int weeks = ((Days % 365) % 30) / 7;

        System.out.println("Years = " + year);
        System.out.println("Months = " + months);
        System.out.println("Weeks = " + weeks);
    }
}
	