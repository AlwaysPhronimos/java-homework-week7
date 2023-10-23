package javaprogrammeweek7;

import java.util.Scanner;
 //Write a Java program to sum values of an array.

public class Programme18SumArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); //create a scanner object for user input
        int arraySize = 5;
        System.out.println("Enter the number of elements in the array: "); // ask user to input elements in array
        int numElements = s.nextInt();
        int[] array = new int [numElements];
        System.out.println("Enter the array elements: ");

        for ( int i = 0; i < numElements; i++) { // Input array elements
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = s.nextInt();
        }
        int sum = 0; // Calculate the sum of array elements
        for (int i = 0;  i < numElements; i++) {
            sum += array[i];
        }
        System.out.println("Sum of the array elements: " + sum);
        s.close(); //close scanner
    }
}
