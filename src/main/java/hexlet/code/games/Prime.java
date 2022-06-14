package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)

    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrime() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2]; // массив с вопросами и ответами

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {

            questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                    String.valueOf(Utils.randomNumber(RANDOM_MAX));

            questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = ""; //обнуляем элемент массива

            questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY]
                    = (Prime.isPrime(questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY])) ? "yes" : "no";
        }

        Engine.run(description, questionsAndAnswers);
    }


//    для проверки простоты числа применяем "решето Эратосфена"
    public static boolean isPrime(String a) {
        int number = Integer.parseInt(a);
        int temp;
        boolean isPrime = true;

        if (a.equalsIgnoreCase("1")) {
            return  isPrime;
        }

        for (int j = 2; j * j <= number; j++) {
            temp = number % j;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;

    }
}


