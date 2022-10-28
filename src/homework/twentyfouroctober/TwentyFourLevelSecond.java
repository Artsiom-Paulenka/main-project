package homework.twentyfouroctober;

import java.util.Scanner;

public class TwentyFourLevelSecond {
    public static void main(String[] args) {
        //Вводится число (число может быть и маленьким и большим), но вмешается в int.
        // Найти сумму всех цифр этого числа
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while (number != 0) {
            number = number % 10;
            sum = sum + number;

        }
        System.out.println(sum);

    }
}

