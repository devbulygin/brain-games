package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {
    static final int RANDOM_MAX_PROGRESSION = 12; //максимальная длинна прогрессии
    static final int RANDOM_MIN_PROGRESSION = 5; //минимальная длинна прогрессии

    public static void playProgression() {

//      Спрашиваем какой элемент пропущен
        String description = "What number is missing in the progression?";

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2]; // массив с вопросами

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int progressionLength = Utils.randomProgressionLength(RANDOM_MAX_PROGRESSION, RANDOM_MIN_PROGRESSION); // случайный размер массива от 5 до 12
            int startProgression = Utils.randomNumber(); // первый элемент прогрессии, случайное число от 0 до 99
            int stepProgression = Utils.stepProgression(RANDOM_MIN_PROGRESSION); // шаг между элементами прогрессии, случайное число от 2 до 5
            String[] elementsString = new String[progressionLength]; //массив прогрессии String
            String[] progressionString = {"", "", ""}; // сформулиярованный массив в виде строки и обнуляем его



            int hideElement = Utils.randomProgressionElementHide(progressionLength); // случайный элемент прогрессии, который будет скрыт

            String[] elements = new String[progressionLength]; // создаем массив заданной длинн

            for (int k = 0; k < progressionLength; k++) { // заполняем массив
                elements[k] = String.valueOf(startProgression + (k * stepProgression)); //вычисляем элемент  и записываем его в массив
                if (k == hideElement) { // если элемент под заданным номером нужно скрыть? то хаменяем его на 2 точки
                    elementsString[k] = ".. ";
                } else {
                    elementsString[k] = String.valueOf(elements[k]) + " "; // переводим из int в string
                }
                progressionString[i] += elementsString[k];

                questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = String.valueOf(elements[hideElement]); //сохраняем верный ответ

                questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] = progressionString[i];
            }
        }

        Engine.run(description, questionsAndAnswers);



    }
}
