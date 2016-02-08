package Lab4;


import Lab2.Lab2_4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by lleyn on 07.02.16.
 */
public class Lab4_2 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a_s, b_s, c_s;
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            a_s = bufferedReader.readLine();//читаем строку с клавиатуры
            b_s = bufferedReader.readLine();
            c_s = bufferedReader.readLine();
            a = Integer.parseInt(a_s);
            b = Integer.parseInt(b_s);
            c = Integer.parseInt(c_s);
        } catch (Exception ex) {
            System.out.println("Произшлв ошибка при попытке ввода.");
            return;
        }
        int[][] d = new int[5][10];
        for (int j = 0; j < 5; j++){
        for (int i = 0; i < 10; i++) {
            d[j][i] = Lab4_1.mass(a, b);
            System.out.print(d[j][i] + " ");
        }
            System.out.println();
        }
        System.out.println();
        out(c,d);
    }
        public static void out(int a,int[][] d) {
            for (int i = 0; i < 10; i++) {
            System.out.print(d[a-1][i] + " ");
            }
        }
}
//СДЕЛАТЬ ПРОВЕРУ НОМЕРА СТРОК