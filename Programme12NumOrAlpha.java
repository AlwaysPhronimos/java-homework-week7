package javaprogrammeweek7;
//Write a program that tells us input value is number or an alphabet or symbol.
import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol
public class Programme12NumOrAlpha {
  public static void main(String[] args)
  {
   Scanner s = new Scanner(System.in); //Create a Scanner for user input
   System.out.println("Enter a value: "); // ask user to enter a value
   String in = s.nextLine();

   if (in.length() == 1)
   {
    char ch = in.charAt(0);
    if (Character.isDigit (ch)) {
     System.out.println("Input is a number. ");
    }else if (Character.isLetter(ch)) { //Check if the character is a letter
     System.out.println("Input is a alphabet.");
    } else { //If it's not a digit or a letter then it a symbol
     System.out.println("Input is a symbol.");
    }
   } else { //If the input is longer than one character then it's not a single character
    System.out.println("Input is more than one character. ");
   }
   s.close(); //close scanner
  }
}
