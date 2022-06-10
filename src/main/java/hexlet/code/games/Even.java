package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {

    public static void playEven() {

//        Описание игры, случайное число и правильный ответ
        String description = "Answer 'yes' if number even otherwise answer 'no'";


//        создаем массив, в котором будут храниться вопросы и верные ответы
        String[][] questionsAndCurrentAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];


        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            questionsAndCurrentAnswers[i][Engine.QUESTION_NUMBER_ARRAY]
                    = String.valueOf(Utils.randomNumber());      // заполняем массив случайными числами

            int check = Integer.parseInt(questionsAndCurrentAnswers[i][Engine.QUESTION_NUMBER_ARRAY]) % 2;
            if (check == 0) {
                questionsAndCurrentAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = "yes";
            } else {
                questionsAndCurrentAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = "no";
            }
        }

        Engine.run(description, questionsAndCurrentAnswers);
    }
}

