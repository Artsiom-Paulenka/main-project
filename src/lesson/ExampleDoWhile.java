package lesson;

import java.util.Scanner;

public class ExampleDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        }
        while (n > -15);
        System.out.println("разгермeтизация, пилоты погибли");
    }

}
