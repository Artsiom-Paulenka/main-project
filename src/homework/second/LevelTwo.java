package homework.second;

public class LevelTwo {
    public static void main(String[] args) {
        // Second level
        int a = 89; // любое двузначное число
        int b = a/10; // число десятков
        System.out.println(b);
        // 2 задача
        int n = 3;
        System.out.println("Количество школьников равно" + " " + n);
        int k = 14;
        System.out.println("Количество яблок равно" + " "+ k);
        int g =  k % n;
        System.out.println("Количество яблок в корзине" + " " + g );
    }
}
