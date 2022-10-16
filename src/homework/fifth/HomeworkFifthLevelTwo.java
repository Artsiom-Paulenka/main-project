package homework.fifth;

import java.util.Scanner;

public class HomeworkFifthLevelTwo {
    public static void main(String[] args) {
        //Second level: В программу вводится строка из двух букв A и B,
        // замените все буквы A на B, а все B на A. Например ABBA -> BAAB

        Scanner sc = new Scanner(System.in);
        String letters = sc.nextLine();
        letters=letters.replace('A','Y');
        letters=letters.replace('B','A');
        letters=letters.replace('Y','B');
        System.out.println(letters);

    }
}
