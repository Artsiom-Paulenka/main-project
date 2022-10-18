package homework.thirteenoctober;

import java.util.Scanner;

public class ThirteenOctoberLevelSecond {
    public static void main(String[] args) {
        //Second level: В программу вводится 1 число. Выведите на экран его факториал, используя цикл while
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int factorial = 1;
        int number = sc.nextInt();
        while (a < number) {
            a++;
            factorial = factorial * a;
            System.out.println(factorial);
        }


    }
}
