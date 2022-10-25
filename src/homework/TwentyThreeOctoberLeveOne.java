package homework;

import java.util.Scanner;

public class TwentyThreeOctoberLeveOne {
    public static void main(String[] args) {
        //Дано целое число, не меньшее 2.
        // Выведите его наименьший делитель, отличный от 1.
        // (число, на которое введенное число делится без остатка).
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = 2;
        while (m >= n) {
            if (m % n == 0)
                n++;
        }
        System.out.println(n);
    }
}