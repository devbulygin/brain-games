package hexlet.code.gameFiles;

import hexlet.code.Engine;

public class Even {
    public static void evenNumbers() {
//        проверяем, представился ли пользователь
        Engine.checkName();

//        выводим случайные числа от 1 до 99
        int a = Engine.randomNumber();
        int b = Engine.randomNumber();
        int c = Engine.randomNumber();

//        выводим правила игры, случайное число и правильный ответ
        System.out.println("Answer 'yes' if number even otherwise answer 'no'");


        Engine.evenGame(a); // первый раунд
        Engine.evenGame(b); // второй раунд
        Engine.evenGame(c); // третий раунд


//        поздравления
        Engine.congratulations();

    }
}
