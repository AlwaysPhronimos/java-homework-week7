package javaprogrammeweek7;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Programme17NumericStringArray {

    public static void main(String[] args) {
        int[] numArray = {4, 2, 7, 1, 9, 5}; //numeric array sorting
        // Display the unsorted numeric array
        System.out.println("Unsorted Numeric Array: " + Arrays.toString(numArray));
        Arrays.sort(numArray); //display the sorted numeric array
        System.out.println("Sorted Numeric Array(Ascending): " + Arrays.toString(numArray));

        Programme17NumericStringArray a = new Programme17NumericStringArray();
        a.sort();
    }
    public void sort() { //non-static method

        String[] stringArray = {"cherry", "fig", "apple", "date", "banana"}; //string array sorting

        System.out.println("Unsorted String Array: " + Arrays.toString(stringArray));//display the sorted string array

        Arrays.sort(stringArray); //sort the string array in alphabetical order

        System.out.println("Sorted String Array(Alphabetical): " + Arrays.toString(stringArray)); // display the sorted string array
    }
}
