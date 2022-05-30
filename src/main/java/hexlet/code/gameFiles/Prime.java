package hexlet.code.gameFiles;

import hexlet.code.Engine;

public class Prime {
    public static void isPrimeNumber() {
//        проверяем, представился ли игрок
        Engine.checkName();

//        Является ли данное число простым?
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Engine.primeNumberGame(); // первый раунд
        Engine.primeNumberGame(); // второй раунд
        Engine.primeNumberGame(); // третий раунд

//        поздравления
        Engine.congratulations();
    }

}
