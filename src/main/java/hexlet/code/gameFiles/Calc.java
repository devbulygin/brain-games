package hexlet.code.gameFiles;

import hexlet.code.Engine;

public class Calc {

    public static void calcMe() {
//      проверяем, представился ли игрок
        Engine.checkName();


//      Каков результат выражения?
        System.out.println("What is the result of the expression?");

        Engine.calcGame(); // первый раунд
        Engine.calcGame(); // второй раунд
        Engine.calcGame(); // третий раунд

//      поздравления
        Engine.congratulations();
    }
}
