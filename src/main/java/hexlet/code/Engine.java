package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
//    максимальное случайное число 99, (1+98)
    static final int randomMax = 98;

//    Проверяем заполнено-ли имя
    public static void checkName(){
    String name = Cli.getName();
    if (name == null) {
        Cli.askName();
        }
    }

//    Сообщение на неверный ответ для целых чисел
    public static void wrongAnswerInt(int userAnswer, int correctAnswer){
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. " +
                "Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + Cli.getName());
        System.exit(0);
    }

//    Сообщение на неверный ответ для строк
    public static void wrongAnswerString(String userAnswer, String correctAnswer){
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. " +
                "Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + Cli.getName());
        System.exit(0);
    }

//    генерируем случайное число от 1 до 99
    public static int randomNumber(){
        Random r = new Random();
        int randomNumber = r.nextInt(randomMax) + 1;
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

//  Проверяем четное или нечетное
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

//        Алгоритм Евклида для нахождения НОД
        public static int euclidsAlgorithm(int a, int b) {
            while (b != 0){
                int tmp = a % b;
                a = b;
                b = tmp;
            }
            return a;
        }

        public static void cdgGame(){
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
            if (correctAnswer == userAnswer) {
                System.out.println("Correct!");
            } else {
                Engine.wrongAnswerInt(userAnswer, correctAnswer);
            }
        }

}
