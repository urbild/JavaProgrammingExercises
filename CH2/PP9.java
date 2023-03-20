package CH2;

import java.util.Scanner;

public class PP9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a line of text.");
        String first = in.nextLine();

        if(first.substring(2,6).equals("hate")){
            System.out.println("I have rephrased that line to read: ");
            System.out.println("I love you");
        }
    }
}
