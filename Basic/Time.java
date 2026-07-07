/*Question 17: Write a Java program to convert seconds into hours, minutes, and seconds.
Input:
Seconds = 3665

Output:
Hours = 1
Minutes = 1
Seconds = 5

Explanation:
1 hour = 3600 seconds.
3665 ÷ 3600 gives 1 hour.
Remaining seconds are converted into minutes and seconds using division and modulus operations.  */

 class Time{
  public static void main(String[]args){
	  int seconds= 3665;
	  int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;

        int minutes = remainingSeconds / 60;
        int finalSeconds = remainingSeconds % 60;

        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + finalSeconds);
		}
		}