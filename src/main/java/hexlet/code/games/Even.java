package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Even {
    public static void play() {

//        выводим случайные числа от 1 до 99
        int[] questionsInt = new int[3]; //создаем массив, который заполним случайными числами

        for (int i = 0; i < 3; i++) {     // заполняем массив случайными числами
            questionsInt[i] = Utils.randomNumber();
        }

//        Описание игры, случайное число и правильный ответ
        String description = "Answer 'yes' if number even otherwise answer 'no'";

//        создаем массив, в котором будут храниться верные ответы
        String[] currentAnswers = new String[3];

        for (int i = 0; i < 3; i++) {    //заполняем массив верными ответами
            currentAnswers[i] = Utils.checkNumber(questionsInt[i]);
        }

        String[] questions = new String[3];

        for (int j = 0; j < 3; j++){    //конвертируем целые числа в строки для правильной работы движка
            questions[j] = String.valueOf(questionsInt[j]);
        }

        Engine.run(description, questions, currentAnswers);
    }
}

