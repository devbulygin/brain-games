package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void playPrime() {


//        Является ли данное число простым?
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2]; // массив с вопросами и ответами


        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {

            int number = Utils.randomNumber(); //генерируем рандомное число
            questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                    String.valueOf(number); // сохраняем рандомное число в массив с вопросами

            int temp;
            boolean isPrime = true;
            questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = "";

            for (int j = 2; j * j <= number; j++) {
                temp = number % j;

                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = "yes";
            } else {
                questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = "no";
            }
        }

        Engine.run(description, questionsAndAnswers);
    }
}


