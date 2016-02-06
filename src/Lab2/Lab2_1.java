package Lab2;

/**
 * Created by lleyn on 06.02.16.
 */
public class Lab2_1{

    public static void main(String[] args) {
        int i;
        System.out.println("Ниже предоставлены все четные числа от 1 до 100:");
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}