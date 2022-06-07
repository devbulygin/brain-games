package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    static final int NUMBER_OF_ROUNDS = 3; // Количество раундов в игре
    public static void play() {

//        выводим случайные числа от 1 до 99
        int[] questionsInt = new int[NUMBER_OF_ROUNDS]; //создаем массив, который заполним случайными числами

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {     // заполняем массив случайными числами
            questionsInt[i] = Utils.randomNumber();
        }

//        Описание игры, случайное число и правильный ответ
        String description = "Answer 'yes' if number even otherwise answer 'no'";

//        создаем массив, в котором будут храниться верные ответы
        String[] currentAnswers = new String[NUMBER_OF_ROUNDS];

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {    //заполняем массив верными ответами
            currentAnswers[i] = Utils.checkNumber(questionsInt[i]);
        }

        String[] questions = new String[NUMBER_OF_ROUNDS];

        for (int j = 0; j < NUMBER_OF_ROUNDS; j++){    //конвертируем целые числа в строки для правильной работы движка
            questions[j] = String.valueOf(questionsInt[j]);
        }

        Engine.run(description, questions, currentAnswers);
    }
}

