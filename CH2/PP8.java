package CH2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PP8 {
    public static void main(String[] args) {
        Scanner fileIn = null;
        try{
            fileIn = new Scanner(new FileInputStream("C://Users//aykut//IdeaProjects//AbsoluteJava//src//CH2//vel.txt"));
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
            System.exit(0);
        }
        String line = fileIn.nextLine();

        System.out.println(line.toUpperCase());
        System.out.println(line.toLowerCase());

    }
}
