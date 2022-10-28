package homework.twentyfouroctober;

import java.util.Scanner;

public class TwentyFourOctoberLevelOne {
    public static void main(String[] args) {
        //Вводится n. Найдите сумму такого выражения: 1+1/2+1/3+1/4…..+1/n
        Scanner sc = new Scanner(System.in);
       double n = sc.nextInt();
        double sum = 1;
        for (int i = 2 ; i <= n; i++) {

            sum = sum + 1.0 / i;

        } System.out.println(sum);

    }
}
