package Loops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        int runAgain = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter the first vale: ");
            int firstValue = scanner.nextInt();

            System.out.println("Enter the second vale: ");
            int secondValue = scanner.nextInt();

            int sum = firstValue + secondValue ;
            System.out.println("The sum of 2 values is: " + sum);
            System.out.println("Enter 1 to continue or 2 to stop!");
            runAgain = scanner.nextInt();
        } while (runAgain ==1);
    }
}
