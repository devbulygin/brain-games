package hexlet.code;

public class Calc {

    public static void calcMe() {
//      проверяем, представился ли игрок
        Engine.checkName();


//      Каков результат выражения?
        System.out.println("What is the result of the expression?");

        Games.calcGame(); // первый раунд
        Games.calcGame(); // второй раунд
        Games.calcGame(); // третий раунд

//      поздравления
        Engine.congratulations();
    }
}
