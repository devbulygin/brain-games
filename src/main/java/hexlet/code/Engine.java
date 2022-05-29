package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
//    максимальное случайное число 99, (1+98)
    static final int RANDOM_MAX = 98;

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
        int randomNumber = r.nextInt(12-5) + 5;
        return randomNumber;
    }



//    генерируем шаг прогрессии от 2 до 5
public static int stepProgression() {
    Random r = new Random();
    int randomNumber = r.nextInt(5-2) + 2;
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
        for (int i = 0; i < elements.length; i++){
            if ( i == hideElement) {
                if (i == elements.length-1) {
                    System.out.print("..");
                } else {
                    System.out.print(".. ");
                }
            } else {
                if (i == elements.length-1) {           // тут дублируется код, хотел сделать отдельный метод для этого, но не понял как можно в агументы хаписать тип данных
                    System.out.print(elements[i]);
                } else {
                    System.out.print(elements[i] + " ");
                }
            }
        }

    }


//  поздравления
    public static void congratulations() {
        System.out.println("Congratulations, " + Cli.getName());
    }

}
