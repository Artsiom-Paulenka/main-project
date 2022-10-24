package homework;

import java.util.Scanner;

public class TwentyThreeOctoberLeveOne {
    public static void main(String[] args) {
        //Дано целое число, не меньшее 2.
        // Выведите его наименьший делитель, отличный от 1.
        // (число, на которое введенное число делится без остатка).
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = 2;
        for (int i = divisor; i <= dividend; i++) {
            if (dividend % divisor == 0) ;
            }System.out.println(divisor);
    }
}