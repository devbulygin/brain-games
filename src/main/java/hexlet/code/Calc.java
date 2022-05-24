package hexlet.code;

public class Calc {

    public static void calcMe() {
//      проверяем, представился ли игрок
        String name = Cli.getName();
        if (name == null) {
            Cli.askName();
        }
//      Каков результат выражения?
        System.out.println("What is the result of the expression?");

//      три раунда
        Engine.calcGame();
        Engine.calcGame();
        Engine.calcGame();

//      поздравления
    System.out.println("Congratulations, " + Cli.getName());
        }
}
