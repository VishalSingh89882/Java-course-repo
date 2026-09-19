package conditional_statement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;

        switch(grade)
        {
            case "A":
                message = "Excellent job! ";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "you need to work a little bit!";
                break;
            case "F":
                message = "Oh no";
                break;
            default:
                message = "wrong grade entered";
                break;


        }
        System.out.println(message);
    }
}
