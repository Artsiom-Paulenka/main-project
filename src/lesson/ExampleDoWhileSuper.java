package lesson;

import java.util.Scanner;

public class ExampleDoWhileSuper {
    public static void main(String[] args) {
        //найти пилота с самым длинныи именем
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

