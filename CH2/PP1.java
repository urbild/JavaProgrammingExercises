package CH2;

import java.util.Scanner;

public class PP1 {
    public static void main(String[] args) {
        //babylonian algorithm

        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();

        double guess = n /2;

        for(int i = 0;i<3;i++) {
            double r = n / guess;
            guess = (guess + r) / 2;
        }
        System.out.printf("Square of 'n': %4.2f",guess);

    }
}
