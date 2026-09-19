package Loops;

import java.util.Scanner;

public class BreakLoop {

    public static void main(String[] args) {
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        for (int i=0; i<text.length(); i++)
        {
            char currentChar = text.charAt(i);
            if (currentChar == 'A' || currentChar == 'a')
            {
                letterFound = true;
                System.out.println("leeter found with A or a in the text ");
                break;
            }
        }
    }
}
