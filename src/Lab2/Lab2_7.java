package Lab2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by lleyn on 07.02.16.
 * Определение положения точки на координатной прямой
 */

public class Lab2_7 {

    public static void main(String[] args) {
        int x = Staff.Input.integer();
        int y = Staff.Input.integer();

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