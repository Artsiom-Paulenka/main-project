package homework.sixoctober;

import java.util.Scanner;

public class HomeSixOctoberSecondLevel {
    public static void main(String[] args) {
        //С консоли считывается строка, если эта длина этой строки меньше 6 или последний символ НЕ '!',
        // тогда вывести "Ваш пароль неверный", иначе вывести "пароль принят"
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int size = line.length();
        char symbol = line.charAt(size - 1);
        if (size < 6 || symbol != '!')
        {
            System.out.println("Ваш пароль неверный");
        }
            else {
            System.out.println("Пароль принят");
        }
    }


}

