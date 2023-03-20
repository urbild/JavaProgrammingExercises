package CH2;

import java.util.Scanner;

public class PP7 {
    public static final int DOLLAR  = 100;
    public static final int QUARTER = 25;
    public static final int DIME    = 10;
    public static final int NICKEL  = 5;

    public static void main(String[] args) {

        int price = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        //vending machine
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price of item(from 25 cents to a dollar,in 5-cent increments): ");
        price = in.nextInt();


        int left = DOLLAR - price;
        quarters = left/QUARTER;
        left = left - (quarters * QUARTER);
        if (left >= 10)
        {
            dimes = left/DIME;
            left = left - (dimes * DIME);
        }
        else if (left < 10)
            dimes = 0;

        if (left <= 5)
        {
            nickels = left/5;
            left = left - (nickels * NICKEL);
        }
        else if (left > 5)
            nickels = 0;

        if (left == 0)
        {
            // Print results
            System.out.println("You bought an item for " + price + " and gave me a dollar,\n" +
                    "so your change is: \n" +
                    quarters + " quarters, \n" +
                    dimes + " dimes, \n" +
                    nickels + " nickels.");
        }
    }
}
