package javaprogrammeweek7;

import java.util.Scanner;

/**Write a Java program which input any number between 1 to 7 and it print The Days name
 * MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13Days
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //ask user to enter a number between 1 and 7
        System.out.println("Enter a number between 1 to 7: ");
        int dayNum = scan.nextInt();

        switch (dayNum) //Use a switch statement to print the day of the week
        {
            case 1:
                System.out.println("Day of the week is MONDAY");
                break;
            case 2:
                System.out.println("Day of the week is TUESDAY");
                break;
            case 3:
                System.out.println("Day of the week is WEDNESDAY");
                break;
            case 4:
                System.out.println("Days of the week is THURSDAY");
                break;
            case 5:
                System.out.println("Days of the week is FRIDAY");
                break;
            case 6:
                System.out.println("Days of the week is SATURDAY");
            case 7:
                System.out.println("Days of the week is SUNDAY10");
                break;
            default:
                System.out.println("Week contains 1 to 7 days only");
                break;
        }
        scan.close();
    }
}
