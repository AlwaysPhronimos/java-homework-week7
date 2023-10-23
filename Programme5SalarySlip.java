package javaprogrammeweek7;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10% DA = Basic salary 8%
 * TA = Basic salary 9% PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * _______________________________ |
 * Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

import java.util.Scanner;

public class Programme5SalarySlip

{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Salary Slip");
        System.out.println("______________________________________________");
        //Input employee details
        System.out.println("Employee Id:  ");
        int empId = s.nextInt();

        System.out.println("Employee Name:   ");
        s.nextLine(); // Consume the newline character
        String empName = s.nextLine();

        System.out.println("Basic Salary:  ");
        double basicSalary = s.nextDouble();

        //Calculate components
        double hra = 0.10 * basicSalary;
        double ta = 0.09 * basicSalary;
        double da = 0.08 * basicSalary;
        double pf = 0.20 * basicSalary;
        double grossSalary = basicSalary + hra + ta + da - pf;

        //print the salary slip
        System.out.println("____________________________________________________");
        System.out.println("|                    Salary Slip                    |");
        System.out.println("| Employee Id:  " + empId + "                          |");
        System.out.println("| Employee Name: "+ empName + "                        |");
        System.out.println("|____________________________________________________");
        System.out.println("| Basic Salary: " + basicSalary + "                    |");
        System.out.println("| HRA 10%: " + hra + "                                 |");
        System.out.println("| TA 8%: " + ta + "                                    |");
        System.out.println("| DA 9%: " + da + "                                    |");
        System.out.println("| PF - 20%: " + pf + "                                 |");
        System.out.println("|____________________________________________________|");
        System.out.println("| Gross Salary: "+ grossSalary +"                      |");
        System.out.println("|====================================================|");

        s.close();
        }
    }

