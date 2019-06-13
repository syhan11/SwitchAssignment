/*
 * Write a program using a switch statement to print the month names
 * given the exact number of days in the month. If the user enters 30 then
 * the program will display: "September April June November".
 *
 * If the user enters 9 then program will alert the user that no months
 * have exactly 9 days.
 *
 * You can have more than one statement in each switch case.
 */

import java.util.Scanner;

public class SwitchAssignment {
    public static void main(String[] args) {
        int monthDays;
        String msg = "";

        Scanner keyboard = new Scanner(System.in);

        // get input from the user
        System.out.println("Enter a number of days: ");
        monthDays = keyboard.nextInt();

        switch (monthDays) {
            case 28:
            case 29: msg = "February";
                     break;

            case 30: msg = "April June September November";
                     break;

            case 31: msg = "January March May July August October December";
                     break;

            default: msg = String.format("Alert! No months have exactly %d day(s).", monthDays);
                     break;
        }
        System.out.println(msg);
    }
}
