package homework.sixoctober;

import java.util.Scanner;

public class HomeSixOctober {
    public static void main(String[] args) {
        //С консоли считывается число. Если это число равно 0 - тогда напишите на экран "ошибок не обнаружено",
        // если число не равно 0, тогда выведите три сообщения "ERROR"
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0)
        {
            System.out.println("Ошибок не обнаружено");
                    }
        else {
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }
    }
}
