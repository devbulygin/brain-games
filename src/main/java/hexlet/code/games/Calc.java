package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {

    private static final int MIN = 1;
    private static final int MAX = 99;
    private static String description = "What is the result of the expression?";

    private static char[] operators = {'+', '*', '-'};


    public static void playCalc() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2]; // массив с вопросами

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int a = Utils.randomNumberInRange(MAX, MIN);
            int b = Utils.randomNumberInRange(MAX, MIN);

            char operator = operators[Utils.randomNumberToSpecificValue(operators.length)];

//      случаное значение operator выбирает выражение
            switch (operator) {

                case '+':
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                            String.valueOf(a) + " + " + String.valueOf(b);
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] =
                            String.valueOf(a + b);
                    break;

                case '*':
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                            String.valueOf(a) + " * " + String.valueOf(b);
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] =
                            String.valueOf(a * b);
                    break;

                case '-':
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                            String.valueOf(a) + " - " + String.valueOf(b);
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] =
                            String.valueOf(a - b);
                    break;

                default:
                    throw new Error("Operation '" + operator + "' not found!");
            }
        }

        Engine.run(description, questionsAndAnswers);

    }
}
