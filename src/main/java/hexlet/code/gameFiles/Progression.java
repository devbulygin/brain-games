package hexlet.code.gameFiles;

import hexlet.code.Engine;

public class Progression {
    public static void element() {
//      проверяем, представился ли игрок
        Engine.checkName();

//      Спрашиваем какой элемент пропущен
        System.out.println("What number is missing in the progression?");

        Engine.progressionGame(); // первый раунд
        Engine.progressionGame(); // второй раунд
        Engine.progressionGame(); // третий раунд

//      поздравления
        Engine.congratulations();




    }
}
