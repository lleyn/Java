package Lab2;

/**
 * @author lleyn
 * Вывод четных чисел от 1 до 100
 */

public class Lab2_1{

    public static void main(String[] args){
        System.out.println("Ниже предоставлены все четные числа от 1 до 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}