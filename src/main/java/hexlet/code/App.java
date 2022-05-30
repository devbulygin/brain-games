package hexlet.code;

import hexlet.code.gameFiles.Cli;
import hexlet.code.gameFiles.Even;
import hexlet.code.gameFiles.Calc;
import hexlet.code.gameFiles.Gcd;
import hexlet.code.gameFiles.Progression;
import hexlet.code.gameFiles.Prime;

import java.util.Scanner;

public class App {
    static final int THREE_GAME = 3;
    static final int FOUR_GAME = 4;
    static final int FIVE_GAME = 5;
    static final int SIX_GAME = 6;


    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Your choice:");
        int number = n.nextInt();

//      Выбирем игру
        switch (number) {
            case 0:
                System.exit(0); // выход
                break;
            case 1:
                Cli.askName(); // спрашиваем имя
                break;
            case 2:
                Even.evenNumbers(); //четное-нечетное
                break;
            case THREE_GAME:
                Calc.calcMe(); // калькулятор
                break;
            case FOUR_GAME:
                Gcd.gsdCalc();  //НОД
                break;
            case FIVE_GAME:
                Progression.element();  //нахождение элемента прогрессии
                break;
            case SIX_GAME:
                Prime.isPrimeNumber();  //проверка на простое число
                break;

            default:
                break;
        }
    //    }

    }
}
