package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void askName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = s.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    }



