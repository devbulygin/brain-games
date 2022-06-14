package hexlet.code;

import java.util.Random;

public class Utils {

    public static int randomNumber(int max) {
        Random r = new Random();
        int randomNumber = r.nextInt(max) + 1;
        return randomNumber;
    }

    //  генерируем число в заданном диапазоне
    public static int randomNumberInRange(int max, int min) {
        Random r = new Random();
        int randomNumber = r.nextInt(max - min) + min;
        return randomNumber;
    }

    //  генерируем число до определенного значения

    public static int randomNumberToSpecificValue(int a) {
        Random r = new Random();
        int randomNumber = r.nextInt(a);
        return randomNumber;
    }
}



