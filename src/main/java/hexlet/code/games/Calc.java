package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Calc {
    static final int NUMBER_OF_ROUNDS = 3; // Количество раундов в игре

    public static void play() {
        Random r = new Random();

//      Описание игры
        String description = "What is the result of the expression?";

        String[] questions = new String[NUMBER_OF_ROUNDS]; // массив с вопросами
        int[] currentAnswersInt = new int[NUMBER_OF_ROUNDS]; // массив с верными овтетам int
        String[] currentAnswers = new String[NUMBER_OF_ROUNDS]; // массив с верными ответами String


//      Заполняем массивы с вопросами и верными ответами
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int a = Utils.randomNumber();
            int b = Utils.randomNumber();

//      переменная operator позволит случайно выбирать выражения
            int operator = r.nextInt(2);

//      случаное значение operator выбирает выражен
            switch (operator) {

//      сложение
                case 0:
                    currentAnswersInt[i] = a + b;
                    questions[i] = String.valueOf(a) + " + " + String.valueOf(b);
                    currentAnswers[i] = String.valueOf(currentAnswersInt[i]);
                    break;

//          умножение
                case 1:
                    currentAnswersInt[i] = a * b;
                    questions[i] = String.valueOf(a) + " * " + String.valueOf(b);
                    currentAnswers[i] = String.valueOf(currentAnswersInt[i]);
                    break;

//          вычитание
                case 2:
                    currentAnswersInt[i] = a - b;
                    questions[i] = String.valueOf(a) + " - " + String.valueOf(b);
                    currentAnswers[i] = String.valueOf(currentAnswersInt[i]);
                    break;

                default:
                    System.out.println("Operation '" + operator + "' not found!");
                    break;
            }
        }

        Engine.run(description, questions, currentAnswers);

    }
}
