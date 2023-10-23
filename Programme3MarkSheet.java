package javaprogrammeweek7;

import java.util.Scanner;

/**Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 *(marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35)
 * and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

public class Programme3MarkSheet
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in); //Input student details
      System.out.println("Enter student's Name: ");
      String name = s.nextLine();
      System.out.println("Enter student's Roll No: ");
      int rollNo = s.nextInt();

      System.out.println("Enter Math marks (0-100): "); // input marks for three subjects
      int mathMarks = s.nextInt();
      System.out.println("Enter Science marks (0-100): ");
      int scienceMarks = s.nextInt();
      System.out.println("Enter English marks (0-100): ");
      int englishMarks = s.nextInt();

      if (mathMarks <0 || mathMarks > 100 || scienceMarks <0 || scienceMarks >100 || englishMarks <0 || englishMarks > 100)
      {
         System.out.println("Invalid Input, Marks should be between 0 and 100");
         return;
      }
     //Calculate total marks and percentage
      int totalMarks = mathMarks + scienceMarks + englishMarks;
      double percentage = (totalMarks/300.0) *100;

      // Determine result and grade
      String result = (percentage >= 35) ? "Pass" : "Fail";
      String grade = (percentage >= 80)? "A+" : (percentage>= 60) ?  "A" : (percentage >= 50)?"B": "C";

      // Print the mark sheet
      System.out.println("_____________________________");
      System.out.println("|                           |");
      System.out.println("|         Mark Sheet        |");
      System.out.println("|___________________________|");
      System.out.println("|Name: "+ name + "                   |");
      System.out.println("|Roll No: " + rollNo + "             |");
      System.out.println("_____________________________");
      System.out.println("|Subject: Marks    |");
      System.out.println("_____________________________");
      System.out.println("| Math: " + mathMarks + "           |");
      System.out.println("| Science: " + scienceMarks + "     |");
      System.out.println("| English: " + englishMarks + "     |");
      System.out.println("|___________________________|");
      System.out.println("|Total: " + totalMarks + "          |");
      System.out.println("|___________________________|");
      System.out.println("|Percentage: " + percentage + "     |");
      System.out.println("|Result: "+ result + "              |");
      System.out.println("|Grade: " + grade + "               |");
      s.close();

   }

}
