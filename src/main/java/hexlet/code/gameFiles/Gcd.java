package hexlet.code.gameFiles;


import hexlet.code.Engine;

public class Gcd {
    public static void gsdCalc() {

//      проверяем, представился ли игрок
        Engine.checkName();


//      Правила игры
        System.out.println("Find the greatest common divisor of given numbers.");


        Engine.cdgGame(); // первый раунд
        Engine.cdgGame(); // второй раунд
        Engine.cdgGame(); // третий раунд

//      поздравления
        Engine.congratulations();
    }
}
