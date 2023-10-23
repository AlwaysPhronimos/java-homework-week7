package javaprogrammeweek7;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even
public class Programme6EvenOdd
{
    public static void main(String[] args)
    {
        evenOdd(); // call static method in main
    }
    static void evenOdd()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:  "  );
        int num = s.nextInt();;
        if (num % 2 == 0)
        {
            System.out.println( num + " is an even number.");
        }
        else
        {
            System.out.println( num + " is a odd number. ");
        }
        s.close();
    }
}
