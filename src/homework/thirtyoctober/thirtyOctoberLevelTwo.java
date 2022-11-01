package homework.thirtyoctober;

import java.util.Arrays;

public class thirtyOctoberLevelTwo {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = (i * 111);
            sum = sum + array[i];
        }System.out.println(sum * 10);
    }
}
