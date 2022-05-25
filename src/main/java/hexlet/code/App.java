package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.println("Your choice:");
        int number = n.nextInt();

//      Выбирем игру - 0 выход, 1 -представляемся, 2-четное/ нечетное, 3-калькулятор
        switch (number) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Cli.askName();
                break;
            case 2:
                Even.evenNumbers();
                break;
            case 3:
                Calc.calcMe();
                break;
            case 4:
                Gcd.gsdCalc();
                break;
            default:
                break;
        }
    //    }

    }
}
