package lesson;

import java.util.Scanner;

public class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Мама дала вам N рублей (вводится с консоли). Вы купили пирожки за K рублей и рыбы за M.
        // Узнать, хватит
        //ли вам денег
        //Вводится три числа N, K, M. Вывести ответ "Да" или "нет".
        int amount = sc.nextInt();
        int pies = sc.nextInt();
        int fish = sc.nextInt();
        int numberPies = sc.nextInt();
        int kgFish = sc.nextInt();
        if (amount >= numberPies * pies + kgFish * fish) {
            System.out.println("Хватит денег");
        } else {
            System.out.println("Не хватит");
        }
        ;
    }
}

