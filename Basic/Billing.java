/*Q7. Mobile plan billing system: 
• Input: Minutes used in a month 
• Logic: 
o Up to 100 mins → Base ₹199 
o 101–300 mins → ₹199 + ₹1/min for extra 
o 301–500 mins → ₹199 + ₹1.5/min for extra 
o Above 500 mins → ₹199 + ₹2/min for extra 
• Output: Total monthly bill. */
    import java.util.Scanner;
	 class Billing 
	 { 
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter mins");
	  int mins=sc.nextInt();
	  if(mins<=100)
	  {