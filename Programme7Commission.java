package javaprogrammeweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */
public class Programme7Commission {
    public static void main(String[] args)
    {
        Programme7Commission c = new Programme7Commission();
        c.commission();
    }

    public void commission() {
        //input sales information
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Sales ID: ");
        int salesId = s.nextInt();
        s.nextLine(); //consume the new line character

        System.out.println("Enter Seller's Name: ");
        String sellerName = s.nextLine();

        System.out.println("Enter Sales Amount: ");
        double salesAmount = s.nextDouble();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = s.nextDouble();

        //Calculate the commission
        double com = 0.0;
        if (salesAmount >= 50000) {
            com = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            com = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            com = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            com = salesAmount * 0.05;
        } else {
            com = salesAmount * 0.02;
        }
        //Calculate total earnings
        double totalEarn = basicSalary + com;
        //Display the result
        System.out.println("\nSales ID:  " + salesId);
        System.out.println("Seller's Name:  " + sellerName);
        System.out.println("Sales Amount:  " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Commission:  " + com);
        System.out.println("Total Earnings:  " + totalEarn);
        //close scanner
        s.close();
    }

}

