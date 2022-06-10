package hexlet.code;


import hexlet.code.games.*;


import java.util.Scanner;

public class App {
    static final int GREET = 0;
    static final int ONE_GAME = 1;
    static final int TWO_GAME = 2;
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
            case GREET:
                System.exit(0); // выход
                break;
            case ONE_GAME:
                Cli.askName(); // спрашиваем имя
                break;
            case TWO_GAME:
                Even.playEven(); //четное-нечетное
                break;
            case THREE_GAME:
                Calc.playCalc(); // калькулятор
                break;
            case FOUR_GAME:
                Gcd.playGcd();  //НОД
                break;
            case FIVE_GAME:
                Progression.playProgression();  //нахождение элемента прогрессии
                break;
            case SIX_GAME:
                Prime.playPrime();  //проверка на простое число
                break;

            default:
                System.out.println("Game number " + "'" + number + "'" + " not found, " + "try again");
                break;
        }
    }
}
