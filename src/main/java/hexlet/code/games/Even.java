package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)

    public static void playEven() {

//        Описание игры, случайное число и правильный ответ
        String description = "Answer 'yes' if number even otherwise answer 'no'";


//        создаем массив, в котором будут храниться вопросы и верные ответы
        String[][] questionsAndCurrentAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];


        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            questionsAndCurrentAnswers[i][Engine.QUESTION_NUMBER_ARRAY]
                    = String.valueOf(Utils.randomNumber(RANDOM_MAX));      // заполняем массив случайными числами
            questionsAndCurrentAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = Even.isEven(Integer.parseInt(questionsAndCurrentAnswers[i][Engine.QUESTION_NUMBER_ARRAY]));

        }

        Engine.run(description, questionsAndCurrentAnswers);
    }


    private static String isEven(int number) {
        int check = number % 2; //проверка на четность

        return (check == 0) ? "yes" : "no";
    }
}

