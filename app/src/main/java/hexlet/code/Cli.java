package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain games!");
        System.out.println("May I have your name?");
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
