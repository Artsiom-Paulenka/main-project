package lesson;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i ^ 2;
        }
        System.out.println(Arrays.toString(a));
    }
}