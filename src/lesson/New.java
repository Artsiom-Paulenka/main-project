package lesson;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Требуется определить, является ли данный год високосным. (Напомним, что год является високосным,
        // если его номер кратен 4, но не кратен 100, а также если он кратен 400.)
        int age = sc.nextInt();
        if (age % 4 == 0) {
            System.out.println("Ок");
        }
        else {
            System.out.println("Все плохо");
        }
    }
}
