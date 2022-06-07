package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {


    public static void run(String description, String[] questions, String[] currentAnswers) {
//        Приветствуем пользователя

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = s.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

//        вопрос из игры
        for (int i = 0; i < 3; i++) {

            System.out.println("Question: " + questions[i]);
            System.out.println("Your answer: ");
            String userAnswer = s.nextLine();

            if (userAnswer.equalsIgnoreCase(currentAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + currentAnswers[i] + "'");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
//        Поздравления
        System.out.println("Congratulations, " + userName + "!");
    }

}