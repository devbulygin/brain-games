package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int NUMBER_OF_ROUNDS = 3; // Количество раундов в игре
    public static void play() {
//        Является ли данное число простым?
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questions = new String[NUMBER_OF_ROUNDS]; // массив с вопросами
        String[] currentAnswers = new String[NUMBER_OF_ROUNDS]; // массив с верными ответами String

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {

            int number = Utils.randomNumber(); //генерируем рандомное число
            questions[i] = String.valueOf(number); // сохраняем рандомное число в массив с вопросами
            currentAnswers[i] = Utils.checkPrime(number); // проверяем рандомное число на простоту

        }

        Engine.run(description, questions, currentAnswers);
    }
}


