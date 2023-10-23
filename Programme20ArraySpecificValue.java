package javaprogrammeweek7;
//Write a Java program to test if an array contains a specific value.
public class Programme20ArraySpecificValue
{
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5}; //define array
        int value = 3; //define the value to find
        boolean contains = containsValue(numbers, value); // call the value method to check if the array contains the target value

        if (contains) { // Check the result and print a message accordingly
            System.out.println("The array contains the value " + value);
        } else {
            System.out.println("The array does not contain the value " + value);
        }
    }
    //Method to check if an array contains a specific value
    public static boolean containsValue (int[] array, int targetValue) {
        for (int number: array) { //If the current value matches the target value then return true
            if(number == targetValue) {
                return true;
            }
        }
        return false;
    }
}
