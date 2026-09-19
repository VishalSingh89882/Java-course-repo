package Loops;

import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {

        int numberStudent = 5;
        int numberSubject = 3;
        Scanner scanner = new Scanner(System.in);
        double marks;
        double total;

        for (int i=1; i<=numberStudent; i++)
        {
            total = 0 ;
            for (int j=1; j<=numberSubject; j++)
            {
                System.out.println("Enter " + i + "th student marks for " + j + "th subject:");
                marks = scanner.nextDouble();
                total += marks;
            }
            double avaerage = total/ numberSubject ;
            System.out.println("The average marks for "+ i + "th student is " + avaerage);
        }

    }
}
