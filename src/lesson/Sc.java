package lesson;

import java.io.InputStream;

public class Sc {
    public Sc(InputStream in) {
    }

    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Стаж работы:");
        int experience = s.nextInt();
        System.out.print("Вознаграждение за каждый год:");
        int award = s.nextInt();
        System.out.print("Получит пенсию:");
        System.out.println(experience * award);
        int awardAndBonus = experience / 10;
        System.out.println("Получит с премией:");
        System.out.println(awardAndBonus * 500 + experience * award);
    }
}
