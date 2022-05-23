package hexlet.code;

import java.util.Scanner;

public class CheckEven {

    // метод проверяет число на четность
    public static String checkNumber(int a){
        int check = a % 2;
        if (check == 0){
            return "yes";
        } else {
            return "no";
        }

    }

    // метод для игры
    public static void game(int a){
        Scanner q = new Scanner(System.in);
        System.out.println("Question: " + a);
        System.out.println("Your answer:");
        String answerA = q.nextLine();
        String currentA = CheckEven.checkNumber(a);

        if (currentA.equalsIgnoreCase(answerA)){
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerA + "'" + " is wrong answer ;(. Correct answer was " + "'" + currentA + "'");
            System.out.println("Let's try again, " + Cli.getName());
            System.exit(0);
        }
    }



}
