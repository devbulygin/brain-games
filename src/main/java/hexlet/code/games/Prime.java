package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)

    public static void playPrime() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2]; // массив с вопросами и ответами


        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {

            questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                    String.valueOf(Utils.randomNumber(RANDOM_MAX));

            questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = ""; //обнуляем элемент массива
            questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = Prime.isPrime(questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY]);
        }

        Engine.run(description, questionsAndAnswers);
    }


//    провоеряем простое число или нет?
    public static String isPrime(String a){
        int number = Integer.parseInt(a);
        int temp;
        boolean isPrime = true;

        for (int j = 2; j * j <= number; j++) {
            temp = number % j;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        return (isPrime) ? "yes" : "no";

    }
}


