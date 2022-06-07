package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Gcd {
    public static void play() {

//      Правила игры
        String description = "Find the greatest common divisor of given numbers.";
        Scanner q = new Scanner(System.in);

        String[] questions = new String[3]; // массив с вопросами
        int[] currentAnswersInt = new int[3]; // массив с верными овтетам int
        String[] currentAnswers = new String[3]; // массив с верными ответами String

        for (int i = 0; i < 3; i++) {
//      Генерируем случайные числа
            int a = Utils.randomNumber();
            int b = Utils.randomNumber();

//      Получаем верный ответ с помощью алгортитма Евклида
            questions[i] = String.valueOf(a) + " " + String.valueOf(b);
            currentAnswersInt[i] = Utils.euclidsAlgorithm(a, b);
            currentAnswers[i] = String.valueOf(currentAnswersInt[i]);
            }
        Engine.run(description, questions, currentAnswers);
    }
}
