package Loops;

import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {

        System.out.println("Enter the number of items to scan: ");
        Scanner scanner  = new Scanner(System.in);
        int items = scanner.nextInt();
        double  total = 0;

        for (int i=1; i<=items; i++)
        {
            System.out.println("Enter the cost of "+ i + "th  item: ");
            double price = scanner.nextInt();

            total += price;
        }
        scanner.close();
        System.out.println("Your total is: $" + total);
    }
}
