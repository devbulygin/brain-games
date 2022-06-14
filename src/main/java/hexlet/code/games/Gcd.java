package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)
    static String description = "Find the greatest common divisor of given numbers.";
    public static void playGcd() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {

            String a = String.valueOf(Utils.randomNumber(RANDOM_MAX));
            String b = String.valueOf(Utils.randomNumber(RANDOM_MAX));

            questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] = a + " " + b;
            questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] = Gcd.gcd(a, b);
        }
        Engine.run(description, questionsAndAnswers);
    }

//    Для определения НОД используем алгоритм Евклида
    private static String gcd(String a, String b) {

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        while (y != 0) {
            int tmp = x % y;
            x = y;
            y = tmp;
        }
        return String.valueOf(x);
    }

}
