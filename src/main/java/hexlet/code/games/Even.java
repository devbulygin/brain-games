package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)
    private static String description = "Answer 'yes' if number even otherwise answer 'no'";

    public static void playEven() {

        String[][] questionsAndCurrentAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            questionsAndCurrentAnswers[i][Engine.QUESTION_NUMBER_ARRAY]
                    = String.valueOf(Utils.randomNumber(RANDOM_MAX));

            questionsAndCurrentAnswers[i][Engine.ANSWER_NUMBER_ARRAY]
                    = (Even.isEven(Integer.parseInt(questionsAndCurrentAnswers[i][Engine.QUESTION_NUMBER_ARRAY]))) ?
                    "yes" :
                    "no";
        }

        Engine.run(description, questionsAndCurrentAnswers);
    }
    private static boolean isEven(int number) {
        int check = number % 2;

        return (check == 0) ? true : false;
    }
}

