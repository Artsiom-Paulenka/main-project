package homework.fouth;

import java.util.Scanner;

public class HomeworkFirstLevel {
    public static void main(String[] args) {
        java.util.Scanner piotr = new Scanner(System.in);
        System.out.print("Первая оценка:");
        int firstGrade = piotr.nextInt();
        System.out.print("Вторая оценка:");
        int secondGrade = piotr.nextInt();
        System.out.print("Первая оценка:");
        int thirdGrade = piotr.nextInt();
        System.out.print("Средний бал:");
        System.out.print((firstGrade + secondGrade + thirdGrade) / 3 );


    }
}
