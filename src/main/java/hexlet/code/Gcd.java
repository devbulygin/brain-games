package hexlet.code;


public class Gcd {
    public static void gsdCalc() {

//      проверяем, представился ли игрок
        Engine.checkName();


//      Правила игры
        System.out.println("Find the greatest common divisor of given numbers.");


        Games.cdgGame(); // первый раунд
        Games.cdgGame(); // второй раунд
        Games.cdgGame(); // третий раунд

//      поздравления
        Engine.congratulations();
    }
}
