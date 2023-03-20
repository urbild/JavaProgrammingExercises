package CH2;

import java.util.Scanner;

public class PP4 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double r = in.nextDouble();

        double diameter = r * 2;
        double circumference = 2 * PI * r;
        double area = PI * r * r;


        System.out.println("Circle of radius " + r + " :");
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

    }
}
