package conditional_statement;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did you complete:? ");

        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota)
        {
            System.out.println("Congratulations! , you have met your quota ");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not make it, you were short by " + salesShort + " sales!");
        }
    }
}
