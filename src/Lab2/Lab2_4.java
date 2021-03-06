package Lab2;

/**
 * Created by lleyn on 06.02.16.
 * Bывод минимума 2-х чисел
 */


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Lab2_4 {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String Ns;
        String Ms;
        int N;
        int M;
        try {
            Ns = bufferedReader.readLine();//читаем строку с клавиатуры
            N = Integer.parseInt(Ns);//проверка на правильность введенных символов
        } catch (Exception ex) {
            System.out.println("Произшлв ощибка при попытке ввода N.");
            return;
        }

        try {
            Ms = bufferedReader.readLine();//читаем строку с клавиатуры
            M = Integer.parseInt(Ms);//проверка на правильность ввода
        } catch (Exception ex) {
            System.out.println("Произшлв ощибка при попытке ввода M.");
            return;
        }
        System.out.println(min(N, M)+ " минимальное число");//вывод минимального числа

    }

    /**
     * Нахождение минимального числа
     * @param a 1 переменная
     * @param b 2 переменная
     * @return минимальное их 2-ч чисел
     */
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

}