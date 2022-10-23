package lesson;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberMax = Integer.MIN_VALUE;
        int number;
        do {
            number = sc.nextInt();
            if (number > numberMax) {
                numberMax = number;
            }
        }
        while (number != 0);
        {
            System.out.println(numberMax);
        }
    }
}
