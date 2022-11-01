package homework.twentythreeoctober;

public class thirtyOctoberLevelTwo {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            array[i] = i * 111;

            sum = sum + array[i];


        }System.out.println(sum);
    }
}
