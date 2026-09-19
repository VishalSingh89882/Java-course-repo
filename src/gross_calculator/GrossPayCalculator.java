package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args)
    {
        // System.out.println("Hello World");

        // 1. Get the number of hours worked
        int  hours = 0;
        System.out.println("How many hours do you work? ");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        // 2. get the hourly pay rate
        double payRate = 470.50;
        System.out.println("What is your payrate?");

        payRate = scanner.nextDouble();
        scanner.close();


        // 3.  multiply hour and payrate
        double grossPay = hours * payRate ;


        // 4. Display the result
        System.out.println("Gross pay is : " + grossPay);

    }
}
