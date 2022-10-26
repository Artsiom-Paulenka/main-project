package homework.twentythreeoctober;

import java.util.Scanner;

public class TwentyThreeOctoberSecondLevel {
    public static void main(String[] args) {
        //Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов,
        // после чего дробная часть копеек отбрасывается. Каждый год сумма вклада становится больше.
        // Определите, сколько будет на счету через k лет
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();//вклад в начале
        double p = sc.nextInt();
        ; // ежегодный процент
        int k = sc.nextInt();// прошло лет
        p = p / 100;
        for (int i = 1; i < k; i++) {

            x = x + x * p;
        }
        System.out.println(x);
    }


}

