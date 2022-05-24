package hexlet.code;


import java.util.Random;

public class Even {
    public static void evenNumbers() {
        //проверяем, представился ли пользователь
        String name = Cli.getName();
        if (name == null) {
            Cli.askName();
        }

        String yes = "yes";
        String no = "no";

        // генерируем случайные числа
        Random r = new Random();
//        выводим случайные числа от 1 до 99
        int a = r.nextInt(98) + 1;
        int b = r.nextInt(98) + 1;
        int c = r.nextInt(98) + 1;

        //выводим правила игры, случайное число и правильный ответ
        System.out.println("Answer 'yes' if number even otherwise answer 'no'");


        //первое число
        Engine.evenGame(a);

        //второе число
        Engine.evenGame(b);

        //третье число
        Engine.evenGame(c);

        System.out.println("Congratulations, " + Cli.getName());

       /* Scanner q = new Scanner(System.in);
        System.out.println("Question: " + a);
        System.out.println("Your answer:");
        String answerA = q.nextLine();
        String currentA = CheckEven.checkNumber(a);

        if (currentA.equalsIgnoreCase(answerA)){
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerA + "'" + " is wrong answer ;(. Correct answer was " + "'" + currentA + "'");
            System.out.println("Let's try again, " + Cli.getName());
        }
*/



    }
}
