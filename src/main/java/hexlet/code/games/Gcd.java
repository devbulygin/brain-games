package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static void playGcd() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {

            String firstNumber = String.valueOf(Utils.randomNumber(RANDOM_MAX));
            String secondNumber = String.valueOf(Utils.randomNumber(RANDOM_MAX));

            questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] = firstNumber + " " + secondNumber;
            questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = Gcd.gcd(firstNumber, secondNumber);
        }
        Engine.run(DESCRIPTION, questionsAndAnswers);
    }

//    Для определения НОД используем алгоритм Евклида
    private static String gcd(String firstNumber, String secondNumber) {

        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(secondNumber);
        while (secondNumberInt != 0) {
            int tmp = firstNumberInt % secondNumberInt;
            firstNumberInt = secondNumberInt;
            secondNumberInt = tmp;
        }
        return String.valueOf(firstNumberInt);
    }

}
