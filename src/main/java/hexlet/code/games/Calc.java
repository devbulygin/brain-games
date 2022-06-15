package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {

    private static final int MIN = 1;
    private static final int MAX = 99;
    private static final String DESCRIPTION = "What is the result of the expression?";

    private static final char[] OPERATORS = {'+', '*', '-'};


    public static void playCalc() {

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2]; // массив с вопросами

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int firstNumber = Utils.randomNumberInRange(MAX, MIN);
            int secondNumber = Utils.randomNumberInRange(MAX, MIN);

            char operator = OPERATORS[Utils.randomNumberToSpecificValue(OPERATORS.length)];

//      случаное значение operator выбирает выражение
            switch (operator) {

                case '+':
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                            String.valueOf(firstNumber) + " + " + String.valueOf(secondNumber);
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] =
                            String.valueOf(firstNumber + secondNumber);
                    break;

                case '*':
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                            String.valueOf(firstNumber) + " * " + String.valueOf(secondNumber);
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] =
                            String.valueOf(firstNumber * secondNumber);
                    break;

                case '-':
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                            String.valueOf(firstNumber) + " - " + String.valueOf(secondNumber);
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] =
                            String.valueOf(firstNumber - secondNumber);
                    break;

                default:
                    throw new Error("Operation '" + operator + "' not found!");
            }
        }

        Engine.run(DESCRIPTION, questionsAndAnswers);

    }
}
