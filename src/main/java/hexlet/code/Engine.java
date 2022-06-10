package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3; // Количество раундов в игре
    public static final int QUESTION_NUMBER_ARRAY = 0; //Обозначение вопроса в двумерном массие
    public static final int ANSWER_NUMBER_ARRAY = 1; // Обозначение ответа в двумерном массие


    public static void run(String description, String[][] questionsAndAnswers) {

//        Приветствуем пользователя
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = s.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

//        вопрос из игры
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {

            System.out.println("Question: " + questionsAndAnswers[i][QUESTION_NUMBER_ARRAY]);
            System.out.println("Your answer: ");
            String userAnswer = s.nextLine();

            if (userAnswer.equalsIgnoreCase(questionsAndAnswers[i][ANSWER_NUMBER_ARRAY])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + questionsAndAnswers[i][ANSWER_NUMBER_ARRAY] + "'");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
//        Поздравления
        System.out.println("Congratulations, " + userName + "!");
    }

}
