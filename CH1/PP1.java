package CH1;

import java.util.Scanner;

public class PP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the garden: ");
        double length = in.nextDouble();
        System.out.print("Enter the width of the garden: ");
        double width = in.nextDouble();
        System.out.printf("Enter the cost of fencin per meter: ");
        double cost = in.nextDouble();

        double totalCost = (length + width) * 2 * cost;

        System.out.println("Total cost: " + totalCost);

    }
}
