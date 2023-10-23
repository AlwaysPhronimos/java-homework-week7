package javaprogrammeweek7;

import java.util.Scanner;

//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
public class Programme16PositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); //object creation for user input
        System.out.println("Enter a number: "); // ask user to enter a number
        double num = s.nextDouble();

        if (num > 0) {
            System.out.println("The number " + num + " is POSITIVE.");
        } else if (num < 0) {
            System.out.println("The number " + num + " is NEGATIVE.");
        } else { //If the number is not positive or negative it must be zero
            System.out.println("The number " + num  + "  is ZERO.");
        }
        s.close(); // Close the scanner to prevent resource leak
    }
}
