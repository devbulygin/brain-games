package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {


    public static void playCalc() {
//        создаем переменные для обозначения вопроса и ответа в думерном массиве


//      Описание игры
        String description = "What is the result of the expression?";

        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2]; // массив с вопросами

        char[] operators = {'+', '*', '-'};

//      Заполняем массивы с вопросами и верными ответами
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int a = Utils.randomNumber();
            int b = Utils.randomNumber();



//      переменная operator позволит случайно выбирать выражения
            char operator = operators[Utils.randomOperator()];

//      случаное значение operator выбирает выражен
            switch (operator) {

//      сложение
                case '+':
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                            String.valueOf(a) + " + " + String.valueOf(b);
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] =
                            String.valueOf(a + b);
                    break;

//          умножение
                case '*':
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                            String.valueOf(a) + " * " + String.valueOf(b);
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] =
                            String.valueOf(a * b);
                    break;

//          вычитание
                case '-':
                    questionsAndAnswers[i][Engine.QUESTION_NUMBER_ARRAY] =
                            String.valueOf(a) + " - " + String.valueOf(b);
                    questionsAndAnswers[i][Engine.ANSWER_NUMBER_ARRAY] =
                            String.valueOf(a - b);
                    break;

                default:
                    System.out.println("Operation '" + operator + "' not found!");
                    break;
            }
        }

        Engine.run(description, questionsAndAnswers);

    }
}
