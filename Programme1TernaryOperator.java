package javaprogrammeweek7;

import java.util.Scanner;
//Write a java program that tells us that Input number is odd or even
public class Programme1TernaryOperator
{
    public static void main(String[] args) //main method
    {
        Scanner s = new Scanner(System.in);  // create scanner
        System.out.println("Enter a number: "); // user is prompted to enter a number
        int num = s.nextInt();

        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println("The entered number is " +result + ".");
        s.close(); //close scanner
    }
}
