package tasks;

import java.util.Scanner;

public class Maraphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Программа получает на вход значения v и t.
        // Если v>0, то Вася движется в положительном направлении по МКАД,
        // если же значение v<0, то в отрицательном.
        //Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.

        int v = sc.nextInt();
        int t = sc.nextInt();
        int positionFirst = 109 - (v * t);
        if (v > 0) {
            System.out.println("Вася движеться в положительном направлении к отметке:" + positionFirst);
            if (v < 0) {
                System.out.println("Вася движеться в отрицательном направлении к отметке:" + positionFirst);
            }
        }

    }

}
