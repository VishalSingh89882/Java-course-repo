package Methods;

import java.util.Scanner;

public class PassingDataToMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary  = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        scanner.close();
        isUserQulaified(salary,creditScore);
    }

    public static void isUserQulaified(double salary, int creditScore)
    {
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if (salary >= requiredSalary && creditScore >= requiredCreditScore)
        {
            System.out.println("Congratulations! You have been approved ");
        }
        else
        {
            System.out.println("Sorry you have been declined !");

        }
    }
}
