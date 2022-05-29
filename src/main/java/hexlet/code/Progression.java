package hexlet.code;

import java.util.Random;

public class Progression {
    public static void element() {
//      проверяем, представился ли игрок
        Engine.checkName();

//      Спрашиваем какой элемент пропущен
        System.out.println("What number is missing in the progression?");

        Games.progressionGame(); // первый раунд
        Games.progressionGame(); // второй раунд
        Games.progressionGame(); // третий раунд

//      поздравления
        Engine.congratulations();




    }
}
