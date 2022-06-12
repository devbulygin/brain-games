package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)
    static final int STEP_MIN = 2;
    static final int STEP_MAX = 5;

    private static final int PROGRESSION_LENGTH = 7;

    public static void playProgression() {

        String description = "What number is missing in the progression?";

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int progressionLength = PROGRESSION_LENGTH;

            int startProgression = Utils.randomNumber(RANDOM_MAX);
            int stepProgression = Utils.randomNumberInRange(STEP_MAX , STEP_MIN);
            String[] elementsString = new String[progressionLength];
            String[] progressionString = {"", "", ""};


//            случайный элемент прогрессии, который будет скрыт (длинна массива -1)
            int hideElement = Utils.randomNumberToSpecificValue(progressionLength - 1);

            String[] elements = new String[progressionLength];

            for (int k = 0; k < progressionLength; k++) {
                elements[k] = String.valueOf(startProgression + (k * stepProgression));
                elementsString[k] = (k == hideElement) ? ".. " : (String.valueOf(elements[k]) + " ");
                progressionString[i] += elementsString[k];
                questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = String.valueOf(elements[hideElement]);
                questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] = progressionString[i];
            }
        }

        Engine.run(description, questionsAndAnswers);

    }
}
