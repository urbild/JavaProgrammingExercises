package CH2;

import java.util.Scanner;

public class PP3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three integer: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();


        double sum = num1+num2+num3;
        double average = sum / 3;

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
        System.out.println("Average: " + average);
    }
}
