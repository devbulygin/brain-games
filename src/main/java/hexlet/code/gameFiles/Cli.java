package hexlet.code.gameFiles;

import java.util.Scanner;

public class Cli {
    // сохраняем имя
    private static String userName;


    public static void askName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = s.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    // делаем метод для того чтобы использовать имя в других классах
    public static String getName() {
        return userName;
    }
}



