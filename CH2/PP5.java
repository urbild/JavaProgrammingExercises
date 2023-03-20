package CH2;

import java.text.NumberFormat;
import java.util.Scanner;

public class PP5 {
    public static void main(String[] args) {
        //simple mortgage calculator
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the mortgage amount: ");
        double amount = in.nextDouble();

        System.out.print("Enter the number of the year: ");
        int years = in.nextInt();

        int months = years * 12;

        System.out.print("Enter the interest rate: % ");
        double annualInterest = in.nextDouble();
        double monthlyInterest = annualInterest / 100 / 12;

        double mathPower = Math.pow(1 + monthlyInterest, months);

        double monthlyPayment = amount * (monthlyInterest * mathPower / (mathPower - 1));
//        double payment = principle * (  (rate * Math.pow(1+rate, time))
//                / (Math.pow(1+rate, time) - 1) );

        // Print the result
        System.out.print("Your montly payment is: " + monthlyPayment);
    }
}
