package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {


//  Игра четное или нечетное
    public static void evenGame(int a) {
        Scanner q = new Scanner(System.in);
        System.out.println("Question: " + a);
        System.out.println("Your answer:");
        String answerA = q.nextLine();
        String currentA = Engine.checkNumber(a);

        if (currentA.equalsIgnoreCase(answerA)) {
            System.out.println("Correct!");
        } else {
            Engine.wrongAnswerString(answerA, currentA);
        }
    }

//  Игра калькулятор
    public static void calcGame() {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

//      вводим случаные числа от 1 до 99
        int a = Engine.randomNumber();
        int b = Engine.randomNumber();


//      переменная operator позволит случайно выбирать выражения
        int operator = r.nextInt(2);

//      случаное значение operator выбирает выражения
        switch (operator) {

//          сложение
            case 0:
                int x = a + b;
                System.out.println("Question: " + a + " + " + b);
                System.out.println("Your answer:");
                int answer1 = s.nextInt();

                if (answer1 == x) {
                    System.out.println("Correct!");
                } else {
                    Engine.wrongAnswerInt(answer1, x);
                }
                break;

//          умножение
            case 1:
                int y = a * b;
                System.out.println("Question: " + a + " * " + b);
                System.out.println("Your answer:");
                int answer2 = s.nextInt();

                if (answer2 == y) {
                    System.out.println("Correct!");
                } else {
                    Engine.wrongAnswerInt(answer2, y);
                }
                break;

//          вычитание
            case 2:
                int z = a - b;
                System.out.println("Question: " + a + " - " + b);
                System.out.println("Your answer:");
                int answer3 = s.nextInt();

                if (answer3 == z) {
                    System.out.println("Correct!");
                } else {
                    Engine.wrongAnswerInt(answer3, z);
                }
                break;

            default:
                break;
        }
    }


//  Игра на нахождение наибольшего общего делителя
    public static void cdgGame() {
        Scanner q = new Scanner(System.in);

//      Генерируем случайные числа
        int a = Engine.randomNumber();
        int b = Engine.randomNumber();

        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: " + a + " " + b);
        System.out.println("Your answer:");

//      Получаем верный ответ с помощью алгортитма Евклида
        int correctAnswer = Engine.euclidsAlgorithm(a, b);

//      Получаем ответ пользователя
        int userAnswer = q.nextInt();

//      Сравниваем верный ответ, и ответ пользователя
        Engine.checkAnswer(userAnswer, correctAnswer);
    }



//  Игра на нахождение пропущенного элемента арифметической прогрессии
    public static void progressionGame() {
        Scanner q = new Scanner(System.in);
        Random r = new Random();

        int progressionLength = Engine.randomProgressionLength(); // случайный размер массива от 5 до 12
        int startProgression = Engine.randomNumber(); // первый элемент прогрессии, случайное число от 0 до 99
        int stepProgression = Engine.stepProgression(); // шаг между элементами прогрессии, случайное число от 2 до 5

        int hideElement = r.nextInt(progressionLength - 1); // случайный элемент прогрессии, который будет скрыт

        int[] elements =  new int[progressionLength]; // создаем массив заданной длинны

//      заполняем массив в соответсвии с полученными случаными числами
        for (int i = 0; i < progressionLength; i++) {
            elements[i] = startProgression + (i * stepProgression);
        }

//      выводим массив в консоль, скрывая один из элементов
        System.out.print("Question: ");
        Engine.massiveWithHideElement(elements, hideElement);

//      скрытый элемент
        int correctAnswer = elements[hideElement];

//      Ваш ответ
        System.out.println("\nYour answer: ");

//      Получаем ответ пользователя
        int userAnswer = q.nextInt();

        Engine.checkAnswer(userAnswer, correctAnswer);
    }
}
