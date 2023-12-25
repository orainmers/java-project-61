package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String userChoose = scanner.next();
        System.out.println("Your choose " + userChoose);

        if (userChoose.equals("1")) {
            Cli.greetUser();
        } else if (userChoose.equals("2")) {
            EvenGame.even();
        }
    }
}
