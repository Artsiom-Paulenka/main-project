package lesson;

import java.util.Scanner;

public class Ternal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String str = ( number >= 1000) ? "Я богат" : "Я бедный";
        System.out.println(str);

    }
}
