package conditional_statement;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args)
    {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did employee complete this week? ");
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        int sales = scanner.nextInt();

        if (sales > quota)
        {
            salary += bonus;
        }
        System.out.println("The salary of employee is : $" + salary);
    }
}
