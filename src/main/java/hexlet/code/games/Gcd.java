package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Gcd {

    public static void playGcd() {


//      Правила игры
        String description = "Find the greatest common divisor of given numbers.";
        Scanner q = new Scanner(System.in);

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2]; // массив с вопросами

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
//      Генерируем случайные числа
            String a = String.valueOf(Utils.randomNumber());
            String b = String.valueOf(Utils.randomNumber());

//      Получаем верный ответ с помощью алгортитма Евклида
            questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] = a + " " + b;

            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            while (y != 0) {
                int tmp = x % y;
                x = y;
                y = tmp;
            }
            questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = String.valueOf(x); // сохраняем верный ответ в массив
        }
        Engine.run(description, questionsAndAnswers);
    }
}
