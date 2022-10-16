package homework.fifth;

import lesson.Sc;

import java.util.Scanner;

public class HomeworkFifth {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        //First level: 1) В программу (в консоль) вводится строка. Найдите длину строки,
        // если она больше 10, то выведите true, иначе false
        //2) В программу (в консоль) вводится строка. Если первый и последний символ равны
        // - выведите true, иначе false
        String line = sc.nextLine();
        int size = line.length();

        if (size > 10) {
        System.out.println("Если длина строки больше 10, то:" + "true");
         } else {
        System.out.println("Если длина строки меньше 10:" + "false");
         }
        char firstSymbol = line.charAt(0);
        char lastSymbol = line.charAt(size - 1);

        if (firstSymbol == lastSymbol) {
            System.out.println("Если первый и последний символ равны , то:" + "true");
        } else {
            System.out.println("Если первый и последний символ не равны , то:" + "false");
        }
    }


}
