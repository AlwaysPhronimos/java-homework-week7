package javaprogrammeweek7;

import java.util.Scanner;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or not
public class Programme2LeapYear
{
    public static void main(String[] args) //main method
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Input the Year: ");
        int year = r.nextInt(); //declare variable
        if (year%100 == 0 && year%400== 0 || year%100!=0 && year%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
        r.close();
    }
}
