package CH2;

import java.util.Scanner;

public class PP2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the name and surname: ");
        String nameSurname = in.nextLine();

        System.out.print("Enter the groos income: ");
        double grossIncome = in.nextDouble();

        System.out.print("Enter the standard deduction: ");
        double standardDeduction = in.nextDouble();

        System.out.print("Enter the personal exemption: ");
        double personalExemption = in.nextDouble();

        System.out.print("Enter the tax rate: % ");
        double taxRate = in.nextDouble();

        double netIncome = grossIncome - personalExemption - standardDeduction;
        double taxPayable = netIncome * taxRate / 100;

        System.out.println("Name:               " + nameSurname);
        System.out.println("Gross Income:       $ " + grossIncome);
        System.out.println("Standard Deduction: $ " + standardDeduction);
        System.out.println("Personal Exemption: $ " + personalExemption);
        System.out.println("Net Income:         $ " + netIncome);
        System.out.println("Tax Payable:        $ " + taxPayable);

    }
}
