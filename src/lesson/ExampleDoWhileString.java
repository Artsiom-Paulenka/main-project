package lesson;

import java.util.Scanner;

public class ExampleDoWhileString {
    public static void main(String[] args) {
        //с консоли вводятся строки - имена пилотов. Как только будет написано "рассчет окончен",
        // завершить ввод строк. Вывести на экран количество пилотов
        Scanner sc = new Scanner (System.in);
        String name;
        String ourWord = "рассчет окончен";
        int number = -1;
        do {
            name = sc.nextLine();
            number ++;
        }
        while (!name.equals(ourWord));
        System.out.println(number);
    }

}
