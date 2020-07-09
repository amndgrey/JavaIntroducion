import java.util.Scanner;


 /* Написать программу, которая загадывает случайное число от 0 до 9, и
пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос –
«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */


import java.util.Random;
import java.util.Scanner;

public class Hw3 {

    public static void main (String...args){

        Scanner input = new Scanner(System.in);
        Random numbers = new Random();
        int try3 =0;
        int random = numbers.nextInt(9);
        System.out.print("Угадай число с трех попыток ");

        while (try3 < 3) {
            System.out.print("введи от 0 до 9: ");
            int number = input.nextInt();

            if (number > random) {
                System.out.println("Ваше число больше.");
                System.out.println("");
            } else if (number < random) {
                System.out.println("Ваше число меньше.");
                System.out.println("");
            } else if (number == random) {
                System.out.println("Вы выиграли!");
                System.out.println("");
            }
            try3++;
        }
        System.out.print("К сожалению, ваши попытки закончились. Начать игру заново? Да? жми 1; Нет? нажми 0:");

        String userData = input.next();
        if(userData.equals("1")){
            main(null);
        }
    }
}