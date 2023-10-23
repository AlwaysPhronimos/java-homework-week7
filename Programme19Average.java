package javaprogrammeweek7;

import java.util.Scanner;

//Write a Java program to calculate the average value of array elements.
public class Programme19Average
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create a Scanner object for user input
        int arraySize = 5; // size of the array
        int[] array = new int[arraySize]; // Create an array to store the values
        System.out.println("Enter " + arraySize + "integer values: ");  //input array elements

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Element " + (i + 1) + " : ");
            array[i] = s.nextInt();
        }




    }

}
