package javaprogrammeweek7;

import java.util.Scanner;

/**Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Programme10Calculator
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = s.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = s.nextDouble();
        System.out.println("Enter a mathematical symbol(+,-,*,/): ");
        char sym = s.next().charAt(0);
        double result;
        if (sym == '+') {
            result = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } else if (sym == '-') {
            result = num1 - num2;
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } else if (sym == '*') {
            result = num1 * num2;
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } else if (sym == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + num1 + "/" + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            } else {
            System.out.println("Invalid symbol. Please use +,-,*,/ ");
        }
        s.close();
    }
}
