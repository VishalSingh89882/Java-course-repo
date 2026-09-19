package conditional_statement;

import java.util.Scanner;

public class IfElseIfStatement {

    public static void main(String[] args) {
        System.out.println("Enter your test score:? ");
        Scanner scanner = new Scanner(System.in);
        double marks = scanner.nextDouble();
        scanner.close();

        char grade;

        if (marks < 60)
        {
            grade = 'F';
        }
        else if (marks < 70)
        {
            grade = 'D';
        }
        else if (marks < 80)
        {
            grade = 'C';
        }
        else if (marks < 90)
        {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("The grade of the student is: " + grade);

    }
}
