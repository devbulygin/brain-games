package hexlet.code;

import java.util.Random;

public class Utils {
    static final int RANDOM_MAX = 98; //максимальное случайное число 99, (1+98)


    //   генерируем случайное число от 1 до 99
    public static int randomNumber() {
        Random r = new Random();
        int randomNumber = r.nextInt(RANDOM_MAX) + 1;
        return randomNumber;
    }

    //  генерируем число в диапазоне от 5 до 12
    public static int randomProgressionLength(int max, int min) {
        Random r = new Random();
        int randomNumber = r.nextInt(max - min) + min;
        return randomNumber;
    }

    //  генерируем число в диапазоне от 5 до 12
    public static int randomProgressionElementHide(int a) {
        Random r = new Random();
        int randomNumber = r.nextInt(a - 1);
        return randomNumber;
    }

    //    генерируем порядковый номер оператора
    public static int randomOperator() {
        Random r = new Random();
        int randomNumber = r.nextInt(2);
        return randomNumber;
    }


    //    генерируем шаг прогрессии от 2 до 5
    public static int stepProgression(int min) {
        Random r = new Random();
        int randomNumber = r.nextInt(min - 2) + 2;
        return randomNumber;
    }

}



