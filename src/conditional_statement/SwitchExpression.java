package conditional_statement;

import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {

        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message = switch(grade)
        {
            case "A","B"  -> "Excellent job! ";
            case "C"  -> "Good job!";
            case "D"  -> "you need to work a little bit!";
            case "F"  -> "Oh no";
            default   -> "wrong grade entered";

        };
        System.out.println(message);
    }
}
