package javaprogrammeweek7;
/**Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 *
  */

import java.util.Scanner;

public class Programme8CityNameIfElse
{
    public static void main(String[] args)
    {
        Programme8CityNameIfElse c = new Programme8CityNameIfElse();
        c.cityName();
    }
    public void cityName()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an alphabet (A to F):  ");
        String in = s.nextLine();

        if (in.length() == 1 && in.charAt(0) >= 'A' && in.charAt(0) <= 'F') {
            char alpha = in.charAt(0);

            String cityName;

            if (alpha == 'A') {
                cityName = "City Name: Aberdeen";
            } else if (alpha == 'B') {
                cityName = "City Name: Bristol";
            } else if (alpha == 'C') {
                cityName = "City Name: Cambridge";
            } else if (alpha == 'D') {
                cityName = "City Name: Durham";
            } else if (alpha == 'E') {
                cityName = "City Name: Exeter";
            } else if (alpha == 'F') {
                cityName = "City Name: Frinton-on-sea";
            } else {
                cityName = "City Name: ";
            }
            System.out.println(cityName);
        } else {
            System.out.println("Invalid entry. Please enter an alphabet A and F.");
        }
        s.close();
    }
}
