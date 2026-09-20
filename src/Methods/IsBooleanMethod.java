package Methods;

import java.util.Scanner;

public class IsBooleanMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary  = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        scanner.close();
        boolean qualified = isUserQulaified(salary,creditScore);
        notifyUser( qualified);
    }

    public static boolean isUserQulaified(double salary, int creditScore)
    {
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if (salary >= requiredSalary && creditScore >= requiredCreditScore)
        {
            return true;
        }
        else
        {
            return false;

        }
    }
    public static void notifyUser(boolean qualified)
    {
        if (qualified)
        {
            System.out.println("Congratulations! You have been approved ");
        }
        else
        {
            System.out.println("Sorry you have been declined !");

        }
    }



}
