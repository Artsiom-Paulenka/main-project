package homework.elevenoctober;

import java.util.Scanner;

public class ElevenOctoberLevelOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Найдите следующее четное число.
        //Например, вводится 140 -> выводим 142, вводится 93 -> выводим 94
        int firstNumber = sc.nextInt();

        if (firstNumber % 2 == 0){
            System.out.println(firstNumber + 2);}

            else {System.out.println(firstNumber + 1);}

    }
}
