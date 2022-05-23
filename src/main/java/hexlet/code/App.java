package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.println("Your choice:");
        int number = n.nextInt();
       // if ((name instanceof int) && (name >= 0 && name <= 1)) {
        switch (number) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Cli.askName();
            case 2:
                Even.evenNumbers();
            default:
                break;
        }
    //    }

    }
}
