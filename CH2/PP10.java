package CH2;

import java.util.Scanner;

public class PP10 {
    public static final double TAX_RATE = .0625;
    public static void main(String[] args) {
        String item1;
        String item2;
        String item3;

        int quantityItem1;
        int quantityItem2;
        int quantityItem3;

        double item1Price;
        double item2Price;
        double item3Price;

        double subTotal;
        double total;
        double salesTax;

        double item1Total;
        double item2Total;
        double item3Total;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter name of item 1: ");
        item1 = keyboard.nextLine();
        System.out.println("Enter quantity of item 1: ");
        quantityItem1 = keyboard.nextInt();
        System.out.println("Enter price of item 1: ");
        item1Price = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Enter name of item 2: ");
        item2 = keyboard.nextLine();
        System.out.println("Enter quantity of item 2: ");
        quantityItem2 = keyboard.nextInt();
        System.out.println("Enter price of item 1: ");
        item2Price = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Enter name of item 3: ");
        item3 = keyboard.nextLine();
        System.out.println("Enter quantity of item 3: ");
        quantityItem3 = keyboard.nextInt();
        System.out.println("Enter price of item 3: ");
        item3Price = keyboard.nextDouble();
        keyboard.nextLine();

        item1Total = quantityItem1 * item1Price;
        item2Total = quantityItem2 * item2Price;
        item3Total = quantityItem3 * item3Price;
        subTotal = item1Total + item2Total + item3Total;
        salesTax = (TAX_RATE) * subTotal;
        total = subTotal + salesTax;


        System.out.println("Your bill: \n");
        System.out.printf("%-30s%-10s%-10s%-10s%n","ITEM","QUANTITY","PRICE","TOTAL");



        System.out.printf("%-30s%-10d%-10.2f%-10.2f%n",item1,quantityItem1,item1Price,item1Total);
        System.out.printf("%-30s%-10d%-10.2f%-10.2f%n",item2,quantityItem2,item2Price,item2Total);
        System.out.printf("%-30s%-10d%-10.2f%-10.2f%n",item3,quantityItem3,item3Price,item3Total);
        System.out.println(" ");
        System.out.printf("%-30s%-10s%-10s%-10.2f%n","SUBTOTAL","","",subTotal);
        System.out.printf("%-30s%-10s%-10s%-10.2f%n","6.25% SALES TAX","","",salesTax);
        System.out.printf("%-30s%-10s%-10s%-10.2f%n","TOTAL","","",total);







    }
}