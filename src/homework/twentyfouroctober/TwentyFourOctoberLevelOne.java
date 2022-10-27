package homework.twentyfouroctober;

import java.util.Scanner;

public class TwentyFourOctoberLevelOne {
    public static void main(String[] args) {
        //Вводится n. Найдите сумму такого выражения: 1+1/2+1/3+1/4…..+1/n
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        double sum = 0;
        for (int i = 1 ; i <= 1 / n; i++) {
n = 1 / n;
             sum = sum + n;
            System.out.println(sum);
        }

    }
}
