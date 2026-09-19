package Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        int payRate = 15;
        int maxHours = 40;

        System.out.println("Enter the hours employee worked this week: ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours)
        {
            System.out.println("The hour should be between 1 and 40! try again ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = payRate * hoursWorked ;
        System.out.println("Gross pay: $" + gross);
    }
}
