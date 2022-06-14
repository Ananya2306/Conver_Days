/*
Write a program in Java to accept the Number of Days.
Display the result after converting it into
 Number of Years, 
 Number of Months and 
 The Remaining Number of Days.
 */

public class Convert_Days
{
    public static void main(int a)
    {
        // Declaring variables 
        int b = 0;
        int y = 0;
        int m = 0;
        int d = 0;
        // Calculation
        y = a/365;
        b = a%365;
        m = b/30;
        d = b%30;
        //Displaying Outputs
        System.out.println("The Number of Years :- " + y);
        System.out.println("The Number of Months :- " + m);
        System.out.println("The Number of Days :- " + d);
    }
}