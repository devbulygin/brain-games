package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {
    static final int NUMBER_OF_ROUNDS = 3; // Количество раундов в игре
    public static void play() {
        Random r = new Random();

//      Спрашиваем какой элемент пропущен
        String description = "What number is missing in the progression?";

        String[] questions = new String[NUMBER_OF_ROUNDS]; // массив с вопросами
        String[] currentAnswers = new String[NUMBER_OF_ROUNDS]; // массив с верными ответами String

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int progressionLength = Utils.randomProgressionLength(); // случайный размер массива от 5 до 12
            int startProgression = Utils.randomNumber(); // первый элемент прогрессии, случайное число от 0 до 99
            int stepProgression = Utils.stepProgression(); // шаг между элементами прогрессии, случайное число от 2 до 5
            String[] elementsString = new String[progressionLength]; //массив прогрессии String
            String[] progressionString = {"", "", ""}; // сформулиярованный массив в виде строки и обнуляем его



            int hideElement = r.nextInt(progressionLength - 1); // случайный элемент прогрессии, который будет скрыт

            int[] elements = new int[progressionLength]; // создаем массив заданной длинн

            for (int k = 0; k < progressionLength; k++) { // заполняем массив
                elements[k] = startProgression + (k * stepProgression); //вычисляем элемент  и записываем его в массив
                if (k == hideElement) { // если элемент под заданным номером нужно скрыть? то хаменяем его на 2 точки
                    elementsString[k] = ".. ";
                } else {
                    elementsString[k] = String.valueOf(elements[k]) + " "; // переводим из int в string
                }
                progressionString[i] += elementsString[k];

                currentAnswers[i] = String.valueOf(elements[hideElement]); //сохраняем верный ответ

                questions[i] = progressionString[i];
            }
        }

        Engine.run(description, questions, currentAnswers);



    }
}