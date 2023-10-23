package javaprogrammeweek7;

import java.util.Scanner;

/**Input any alphabet from “A" to “F” and print their city name accordingly (switch)
 * if any other alphabet should be invalid entry
 */
public class Programme9CityNameSwitch {
    public static void main(String[] args) {
        Programme9CityNameSwitch c = new Programme9CityNameSwitch();
        c.city();
    }

    public void city() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an alphabet(A to F)");
        char alpha = s.next().charAt(0);
        if (alpha >= 'A' && alpha <= 'F') {
            switch (alpha) {
                case 'A':
                    System.out.println("City Name: Aberdeen");
                    break;
                case 'B':
                    System.out.println("City Name: Bristol");
                    break;
                case 'C':
                    System.out.println("City Name: Cambridge");
                    break;
                case 'D':
                    System.out.println("City Name: Dublin");
                    break;
                case 'E':
                    System.out.println("City Name: Exeter");
                    break;
                case 'F':
                    System.out.println("City Name: Frinton-on-Sea");
                    break;
            }
            } else{
                System.out.println("Invalid entry. Please enter an alphabet between A and F.");
            s.close();
        }
    }
}


