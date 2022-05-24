package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    // метод проверяет число на четность
    public static String checkNumber(int a) {
        int check = a % 2;
        if (check == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    // метод для игры четное/нечетное
    public static void evenGame(int a) {
        Scanner q = new Scanner(System.in);
        System.out.println("Question: " + a);
        System.out.println("Your answer:");
        String answerA = q.nextLine();
        String currentA = Engine.checkNumber(a);

        if (currentA.equalsIgnoreCase(answerA)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerA + "'" + " is wrong answer ;(. Correct answer was " + "'" + currentA + "'");
            System.out.println("Let's try again, " + Cli.getName());
            System.exit(0);
        }
    }


    public static void calcGame() {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

//      вводим случаные числа от 1 до 99
        int a = r.nextInt(98) + 1;
        int b = r.nextInt(98) + 1;


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
                    System.out.println("'" + answer1 + "'" + " is wrong answer ;(. Correct answer was " + "'" + x + "'");
                    System.out.println("Let's try again, " + Cli.getName());
                    System.exit(0);
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
                    System.out.println("'" + answer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + y + "'");
                    System.out.println("Let's try again, " + Cli.getName());
                    System.exit(0);
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
                    System.out.println("'" + answer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + z + "'");
                    System.out.println("Let's try again, " + Cli.getName());
                    System.exit(0);
                }
                break;

            default:
                break;
        }

    }
}
