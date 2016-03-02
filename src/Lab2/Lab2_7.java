package Lab2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by lleyn on 07.02.16.
 */

//Определение положения точки на координатной прямой
public class Lab2_7 {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String x_s;
        String y_s;
        int x = 0;
        int y = 0;
        try {
            x_s = bufferedReader.readLine();//читаем строку с клавиатуры
            x = Integer.parseInt(x_s);//проверка на правильность ввод

        } catch (Exception ex) {
            System.out.println("Произшлв ощибка при попытке ввода X.");
            return;
        }

        try {
            y_s = bufferedReader.readLine();//читаем строку с клавиатуры
            y = Integer.parseInt(y_s);//проверка на правильность ввода

        } catch (Exception ex) {
            System.out.println("Произшлв ощибка при попытке ввода Y.");
            return;
        }
        if ((x!=0)&&(y!=0)){
            if (x > 0) {
                if (y > 0) {
                    System.out.println("Точка лежит в 1 четверти координатной плоскости.");
                } else System.out.println("Точка лежит во 2 четверти координатной плоскости.");
            } else {
                if (y > 0) {
                    System.out.println("Точка лежит в 4 четверти координатной плоскости.");
                } else System.out.println("Точка лежит в 3 четверти координатной плоскости.");
            }
        }
        else System.out.println("Ошибка. Точка лежит на одной из координатных осей");
    }
}