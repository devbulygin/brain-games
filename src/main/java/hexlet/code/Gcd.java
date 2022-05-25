package hexlet.code;


public class Gcd {
    public static void gsdCalc() {

//      проверяем, представился ли игрок
        Engine.checkName();

//      Три раунда
        Engine.cdgGame();
        Engine.cdgGame();
        Engine.cdgGame();

//      поздравления
        System.out.println("Congratulations, " + Cli.getName());
    }
}
