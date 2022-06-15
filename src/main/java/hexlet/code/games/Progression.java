package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)
    static final int STEP_MIN = 2;
    static final int STEP_MAX = 5;

    private static final int PROGRESSION_LENGTH = 7;
    private static final String DESCRIPTION = "What number is missing in the progression?";


    public static void playProgression() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] = "";

            int progressionLength = PROGRESSION_LENGTH;
            int startProgression = Utils.randomNumber(RANDOM_MAX);
            int stepProgression = Utils.randomNumberInRange(STEP_MAX, STEP_MIN);

//            случайный элемент прогрессии, который будет скрыт (длинна массива -1)
            int hideIndexOfArray = Utils.randomNumberToSpecificValue(progressionLength - 1);
            String[] elements = new String[progressionLength];

            for (int k = 0; k < progressionLength; k++) {
                elements[k] = String.valueOf(startProgression + (k * stepProgression));

                if (k == hideIndexOfArray) {
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = elements[k];
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] += ".. ";
                    continue;
                }

                questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY]
                        += String.valueOf(startProgression + (k * stepProgression)) + " ";
            }

        }
        Engine.run(DESCRIPTION, questionsAndAnswers);
    }
}
