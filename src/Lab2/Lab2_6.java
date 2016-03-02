package Lab2;

/**
 * Created by lleyn on 06.02.16.
 */
//Минимум 4-х чисел
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Lab2_6 {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a_s, b_s, c_s, d_s;
        int a, b, c, d;
        try {
            a_s = bufferedReader.readLine();//читаем строку с клавиатуры
            a = Integer.parseInt(a_s);//проверка на правильность введенных символов
            b_s = bufferedReader.readLine();//читаем строку с клавиатуры
            b = Integer.parseInt(b_s);//проверка на правильность введенных символов
            c_s = bufferedReader.readLine();//читаем строку с клавиатуры
            c = Integer.parseInt(c_s);//проверка на правильность введенных символов
            d_s = bufferedReader.readLine();//читаем строку с клавиатуры
            d = Integer.parseInt(d_s);//проверка на правильность введенных символов

        } catch (Exception ex) {
            System.out.println("Произшлв ощибка при попытке ввода числа.");
            return;
        }

        System.out.println(min(min(a, b), min(a, b))+ " минимальое число");




}
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }
}