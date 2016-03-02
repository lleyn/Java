package Lab4;


import Lab2.Lab2_4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by lleyn on 07.02.16.
 */
public class Lab4_1 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a_s, b_s;
        int a = 0;
        int b = 0;
        try {
            a_s = bufferedReader.readLine();//читаем строку с клавиатуры
            b_s = bufferedReader.readLine();
            a = Integer.parseInt(a_s);
            b = Integer.parseInt(b_s);
        } catch (Exception ex) {
            System.out.println("Произшлв ошибка при попытке ввода.");
            return;
        }
        int[] c = new int[20];
        for (int i = 0; i < 20; i++) {
            c[i] = mass(a, b);
            System.out.print(c[i]+" ");
        }
    }
    public static int mass(int a, int b){
        return (Lab2_4.min(a,b) + (int)(Math.random()*(Math.abs(a-b)+1)) );
    }
}
