package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Prime {
    public static void play() {
//        Является ли данное число простым?
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questions = new String[3]; // массив с вопросами
        String[] currentAnswers = new String[3]; // массив с верными ответами String

        for (int i = 0; i < 3; i++) {

            int number = Utils.randomNumber(); //генерируем рандомное число
            questions[i] = String.valueOf(number); // сохраняем рандомное число в массив с вопросами
            currentAnswers[i] = Utils.checkPrime(number); // проверяем рандомное число на простоту

        }

        Engine.run(description, questions, currentAnswers);
    }
}


