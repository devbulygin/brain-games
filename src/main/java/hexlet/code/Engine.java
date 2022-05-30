package hexlet.code;

import hexlet.code.gameFiles.Cli;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    //
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)
    static final int RANDOM_MAX_PROGRESSION = 12; //максимальная длинна прогрессии
    static final int RANDOM_MIN_PROGRESSION = 5; //минимальная длинна прогрессии

    //  Проверяем заполнено-ли имя
    public static void checkName() {
        String name = Cli.getName();
        if (name == null) {
            Cli.askName();
        }
    }

    //  Сообщение на неверный ответ для целых чисел
    public static void wrongAnswerInt(int userAnswer, int correctAnswer) {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + Cli.getName());
        System.exit(0);
    }

    //  Сообщение на неверный ответ для строк
    public static void wrongAnswerString(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + Cli.getName());
        System.exit(0);
    }

    //  генерируем случайное число от 1 до 99
    public static int randomNumber() {
        Random r = new Random();
        int randomNumber = r.nextInt(RANDOM_MAX) + 1;
        return randomNumber;
    }

    //  генерируем число в диапазоне от 5 до 12
    public static int randomProgressionLength() {
        Random r = new Random();
        int randomNumber = r.nextInt(RANDOM_MAX_PROGRESSION - RANDOM_MIN_PROGRESSION) + RANDOM_MIN_PROGRESSION;
        return randomNumber;
    }


    //    генерируем шаг прогрессии от 2 до 5
    public static int stepProgression() {
        Random r = new Random();
        int randomNumber = r.nextInt(RANDOM_MIN_PROGRESSION - 2) + 2;
        return randomNumber;
    }

    //  Проверяем число на четность
    public static String checkNumber(int a) {
        int check = a % 2;
        if (check == 0) {
            return "yes";
        } else {
            return "no";
        }
    }


    //        Алгоритм Евклида для нахождения НОД
    public static int euclidsAlgorithm(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }


    public static void checkAnswer(int userAnswer, int correctAnswer) {
        if (correctAnswer == userAnswer) {
            System.out.println("Correct!");
        } else {
            Engine.wrongAnswerInt(userAnswer, correctAnswer);
        }
    }

    // выводим строку со скрытым случаным элементом массива
    public static void massiveWithHideElement(int[] elements, int hideElement) {
        for (int i = 0; i < elements.length; i++) {
            if (i == hideElement) {
                if (i == elements.length - 1) {
                    System.out.print("..");
                } else {
                    System.out.print(".. ");
                }
            } else {
                if (i == elements.length - 1) {           // тут дублируется код,
                    System.out.print(elements[i]);
                } else {
                    System.out.print(elements[i] + " ");
                }
            }
        }

    }

    //    проверка числа на простоту
    public static boolean checkPrime(int number) {
        int temp;
        boolean isPrime = true;

        for (int i = 2; i * i <= number; i++) {
            temp = number % i;

            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


//  поздравления
    public static void congratulations() {
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }







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


    public static void primeNumberGame() {
        Scanner q = new Scanner(System.in);
        int number = Engine.randomNumber();

        String correctAnswer;



//        вопросы пользователю
        System.out.println("Question: " + number);
        System.out.println("Your answer: ");
        String userAnswer = q.nextLine();

        boolean isPrime = Engine.checkPrime(number);


        if (isPrime) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            Engine.wrongAnswerString(userAnswer, correctAnswer);
        }
    }

}
