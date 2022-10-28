package homework.twentyfouroctober;

import java.util.Scanner;

public class TwentyFourLevelSecond {
    public static void main(String[] args) {
        //Вводится число (число может быть и маленьким и большим), но вмешается в int.
        // Найти сумму всех цифр этого числа
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
       while (number != 0){
           sum = sum + number % 10;
           number /= 10;
       }System.out.println(sum);



        //for (int i = 0; i < number; i++) {
            //sum = sum + number % 10;
            //number /= 10;
        }


    }












