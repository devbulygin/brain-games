package hexlet.code;

import java.util.Random;

public class Utils {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)
    static final int RANDOM_MAX_PROGRESSION = 12; //максимальная длинна прогрессии
    static final int RANDOM_MIN_PROGRESSION = 5; //минимальная длинна прогрессии

//   генерируем случайное число от 1 до 99
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




    //    проверка числа на простоту
    public static String checkPrime(int number) {
        int temp;
        boolean isPrime = true;
        String currentAnswers = "";

//        if (number == 1) { // Если рандомное число 1, то сразу сразу возвращаем да
//            return currentAnswers = "yes";
//        }

        for (int i = 2; i * i <= number; i++) {
            temp = number % i;

            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            currentAnswers = "yes";
        } else {
            currentAnswers = "no";
        }

        return currentAnswers;

    }


}
