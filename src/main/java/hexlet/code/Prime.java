package hexlet.code;

public class Prime {
    public static void isPrimeNumber(){
//        проверяем, представился ли игрок
        Engine.checkName();

//        Является ли данное число простым?
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Games.primeNumberGame(); // первый раунд
        Games.primeNumberGame(); // второй раунд
        Games.primeNumberGame(); // третий раунд

//        поздравления
        Engine.congratulations();
    }

}
