package homework.thirtyoctober;

import java.util.Arrays;

public class thirtyOctoberLevelOne {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 1; i < 99; i++) {
            array[i] = 10;
        }
        System.out.println(Arrays.toString(array));
    }
}
