package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    static final int RANDOM_MAX_PROGRESSION = 12; //максимальная длинна прогрессии
    static final int RANDOM_MIN_PROGRESSION = 5; //минимальная длинна прогрессии

    public static void playProgression() {

//      Спрашиваем какой элемент пропущен
        String description = "What number is missing in the progression?";

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2]; // массив с вопросами

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
//            случайный размер массива от 5 до 12
            int progressionLength = Utils.randomProgressionLength(RANDOM_MAX_PROGRESSION, RANDOM_MIN_PROGRESSION);
//            первый элемент прогрессии, случайное число от 0 до 99
            int startProgression = Utils.randomNumber();
//            шаг между элементами прогрессии, случайное число от 2 до 5
            int stepProgression = Utils.stepProgression(RANDOM_MIN_PROGRESSION);
//            массив прогрессии String
            String[] elementsString = new String[progressionLength];
//            сформулиярованный массив в виде строки и обнуляем его
            String[] progressionString = {"", "", ""};


//            случайный элемент прогрессии, который будет скрыт
            int hideElement = Utils.randomProgressionElementHide(progressionLength);
//            создаем массив заданной длинн
            String[] elements = new String[progressionLength];
//            заполняем массив
            for (int k = 0; k < progressionLength; k++) {
//            вычисляем элемент  и записываем его в массив
                elements[k] = String.valueOf(startProgression + (k * stepProgression));
//            если элемент под заданным номером нужно скрыть? то хаменяем его на 2 точки
                if (k == hideElement) {
                    elementsString[k] = ".. ";
                } else {
//            переводим из int в string
                    elementsString[k] = String.valueOf(elements[k]) + " ";
                }
                progressionString[i] += elementsString[k];
//            сохраняем верный ответ
                questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = String.valueOf(elements[hideElement]);

                questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] = progressionString[i];
            }
        }

        Engine.run(description, questionsAndAnswers);



    }
}
