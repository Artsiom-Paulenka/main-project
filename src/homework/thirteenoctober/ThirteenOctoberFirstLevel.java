package homework.thirteenoctober;

import java.util.Scanner;

public class ThirteenOctoberFirstLevel {
    public static void main(String[] args) {
        //Вводится число. Напишите на экран сообщение "Я начинаю разбираться с циклами"
        // количество раз, равное этому числу
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String text = "Я начинаю разбираться с циклами";
        while (number > 0) {
             number--;
             System.out.println(text);
        }
    }
}
