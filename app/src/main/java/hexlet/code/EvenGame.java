package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void even() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain games!");
        System.out.println("May I have your name?");
        var userName = scanner.next();
        scanner.nextLine(); // Чтобы очистить буфер ввода.
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var correctAnswersCount = 0;
        while (correctAnswersCount < 3) {
            var randomNumber = random.nextInt(1001);
            System.out.println("Question: " + randomNumber);
            var userAnswer = scanner.nextLine();
            System.out.println("Your answer: " + userAnswer);
            var isEven = randomNumber % 2 == 0;
            var userAnswerCorrect = (isEven && userAnswer.equalsIgnoreCase("yes"))
                    || (!isEven && userAnswer.equalsIgnoreCase("no"));
            if (userAnswerCorrect) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userAnswer + "' is a wrong answer ;(. Correct answer was '"
                        + (isEven ? "no" : "yes") + "'");
                correctAnswersCount = 0;
            }
        }
        System.out.println("Congratulations, " + userName);
    }
}
